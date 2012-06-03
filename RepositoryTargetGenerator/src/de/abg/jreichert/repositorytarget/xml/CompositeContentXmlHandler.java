package de.abg.jreichert.repositorytarget.xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CompositeContentXmlHandler extends DefaultHandler {

	private String location;
	private List<String> children = new ArrayList<String>();
	private String child;

	public CompositeContentXmlHandler(String location) {
		if (!location.endsWith("/")) {
			location += "/";
		}
		this.location = location;
	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {
	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		if (localName.equals("child")) {
			child = atts.getValue("location");
			if (child != null) {
				if (!child.startsWith("http")) {
					child = location + child;
				}
				children.add(child);
			}
		}
	}

	public List<String> getLocations() {
		return children;
	}
}
