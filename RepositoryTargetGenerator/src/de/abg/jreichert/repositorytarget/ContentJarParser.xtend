package de.abg.jreichert.repositorytarget

import java.io.InputStreamReader
import java.net.JarURLConnection
import java.net.URL
import org.xml.sax.InputSource
import org.xml.sax.helpers.XMLReaderFactory
import java.io.BufferedReader
import java.io.StringReader
import java.net.HttpURLConnection
import java.util.List
import java.io.InputStream

class ContentJarParser {
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
	
	def getContent(InputStream input) {
		val buf = new BufferedReader(new InputStreamReader(input))
		var String line
		var sb = new StringBuilder;
		while((line = buf.readLine) != null) {
		   sb.append(line).append("\n")
		}
		sb.toString
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
	
	def parse(String content, org.xml.sax.ContentHandler contentHandler) {
		val xmlReader = XMLReaderFactory::createXMLReader();
      	xmlReader.setContentHandler(contentHandler);
      	val reader = new StringReader(content.toString)
      	val inputSource = new InputSource(reader);
      	xmlReader.parse(inputSource);
	}
	
	def parseLocations(String content, String location) {
      	val contentHandler = new CompositeContentXmlHandler(location);
      	parse(content, contentHandler)
		contentHandler.locations
	}
}