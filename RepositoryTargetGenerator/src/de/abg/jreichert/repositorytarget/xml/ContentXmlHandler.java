package de.abg.jreichert.repositorytarget.xml;

import java.util.SortedSet;
import java.util.TreeSet;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ContentXmlHandler extends DefaultHandler {

	private String id;
	private SortedSet<String> versions = new TreeSet<String>();
	private String version;
	private String expectedId;
	
	public ContentXmlHandler(String expectedId) {
		this.expectedId = expectedId;
	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {
	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		if (localName.equals("unit")) {
			id = atts.getValue("id");
			if(id != null && id.startsWith(expectedId)) {
				version = atts.getValue("version");
				if(version != null) {
					versions.add(atts.getValue("version"));
				}
			}
		}
	}
	
	public String getVersion() {
		return versions.size() > 0 ?  versions.first() : "";
	}
}
