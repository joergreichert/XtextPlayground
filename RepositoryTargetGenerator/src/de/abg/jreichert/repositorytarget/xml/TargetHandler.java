package de.abg.jreichert.repositorytarget.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import de.abg.jreichert.repositorytarget.definition.Location;
import de.abg.jreichert.repositorytarget.definition.Target;
import de.abg.jreichert.repositorytarget.definition.Unit;

public class TargetHandler extends DefaultHandler {

	private Location location = null;
	private Target target = null;
	private Unit unit = null;
	
	public TargetHandler() {
	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {
	}

	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		if (localName.equals("target")) {
			target = new Target();
			target.setName(atts.getValue("name"));
		} else if (localName.equals("location")) {
			location = new Location();
			target.getLocations().add(location);
		} else if (localName.equals("unit")) {
			unit = new Unit();
			unit.setTargetId(atts.getValue("id"));
			location.getUnits().add(unit);
			//unit.setVersion(atts.getValue("version"));
		} else if (localName.equals("repository")) {
			location.setRepositoryLocation(atts.getValue("location"));
		}
	}
	
	public Target getTarget() {
		return target;
	}
}
