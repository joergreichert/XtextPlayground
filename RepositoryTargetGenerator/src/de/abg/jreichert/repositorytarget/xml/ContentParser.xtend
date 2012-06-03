package de.abg.jreichert.repositorytarget.xml

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.io.StringReader
import org.xml.sax.ContentHandler
import org.xml.sax.InputSource
import org.xml.sax.helpers.XMLReaderFactory

class ContentParser {

	def getContent(InputStream input) {
		val buf = new BufferedReader(new InputStreamReader(input))
		var String line
		var sb = new StringBuilder;
		while((line = buf.readLine) != null) {
		   sb.append(line).append("\n")
		}
		sb.toString
	}
	
	def parse(String content, ContentHandler contentHandler) {
		val xmlReader = XMLReaderFactory::createXMLReader();
      	xmlReader.setContentHandler(contentHandler);
      	val reader = new StringReader(content.toString)
      	val inputSource = new InputSource(reader);
      	xmlReader.parse(inputSource);
	}
}