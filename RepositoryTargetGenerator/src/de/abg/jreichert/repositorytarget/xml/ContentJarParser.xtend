package de.abg.jreichert.repositorytarget.xml

import java.net.HttpURLConnection
import java.net.JarURLConnection
import java.net.URL
import java.util.List

class ContentJarParser extends ContentParser {
	private val List<String> contents;
	
	new(String url) {
		val List<String> localContents = newArrayList
		contents = getContents(url, localContents)
	}

	def getContents(String url, List<String> localContents) {
		var contentFileName = "content"
		if (existsXmlUrl(url.toUrl, contentFileName)) {
 			localContents.add(getXmlContent(url, contentFileName))
		} else if (existsJarUrl(url.toUrl, contentFileName)) {
 			localContents.add(getJarContent(url, contentFileName))
		} else {
			contentFileName = "compositeContent"
			if (existsXmlUrl(url.toUrl, contentFileName)) {
 				val compositeContent = getXmlContent(url, contentFileName)
 				parse(compositeContent, url, localContents)
			} else if (existsJarUrl(url.toUrl, contentFileName)) {
 				val compositeContent = getJarContent(url, contentFileName)
 				parse(compositeContent, url, localContents)
			} else {
				throw new IllegalArgumentException("For " + url + " no content.xml could be found.")				
			}
		}
 		localContents
	}
	
	def parse(String compositeContent, String parentLocation, List<String> localContents) {
		val locations = parseLocations(compositeContent, parentLocation)
 		for(location : locations) {
 			getContents(location, localContents)
 		}
	}

	def getJarContent(String url, String contentFileName) {
		val jarUrl = new URL("jar:" + url.toUrl + contentFileName + ".jar!/")
    	val connection = jarUrl.openConnection() as JarURLConnection
	    val jarFile = connection.getJarFile		
 		var entry = jarFile.getJarEntry(contentFileName + ".xml")
		val input = jarFile.getInputStream(entry)
		val content = getContent(input)
		jarFile.close
		content
	}

	def getXmlContent(String url, String contentFileName) {
		val xmlUrl = new URL(url.toUrl + contentFileName + ".xml")
    	val connection = xmlUrl.openConnection() as HttpURLConnection
		val input = connection.inputStream
		getContent(input)
	}
	
	def existsXmlUrl(String url, String contentFileName) {
		existsUrl(url, contentFileName, "xml")
	}

	def existsJarUrl(String url, String contentFileName) {
		existsUrl(url, contentFileName, "jar")
	}

	def existsUrl(String url, String contentFileName, String fileExt) {
		val contentUrl = new URL(url.toUrl + contentFileName + "." + fileExt);
		val contentCon = contentUrl.openConnection as HttpURLConnection
 		contentCon.requestMethod = "HEAD";
 		val code = contentCon.responseCode 
		code == HttpURLConnection::HTTP_OK
	}
	
	def toUrl(String url) {
		if(url.endsWith("/")) url else url + "/"
	}
	
	def parseVersionForId(String id) {
      	val contentHandler = new ContentXmlHandler(id);
      	for(content : contents) {
	      	parse(content, contentHandler)
      	}
		contentHandler.version
	}
	
	def parseLocations(String content, String location) {
      	val contentHandler = new CompositeContentXmlHandler(location);
      	parse(content, contentHandler)
		contentHandler.locations
	}
}