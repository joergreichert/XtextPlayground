package de.abg.jreichert.repositorytarget.definition

import de.abg.jreichert.repositorytarget.xml.ContentJarParser

abstract class AbstractTargetDefinition {

	def buildTarget() {
		val target = targetDefinition()
		target.fillVersions
		target
	}
	
	def Target fillVersions(Target target) {
		for(l : target.locations) {
			val parser = new ContentJarParser(l.repositoryLocation)
			l.units.forEach(u|u.fillVersion(parser))			
		}
		target
	}
	
	def fillVersion(Unit unit, ContentJarParser parser) {
		if(unit.version.nullOrEmpty) {
			unit.version = parser.parseVersionForId(unit.categoryId)
		}	
	}

	def Target targetDefinition() 
}