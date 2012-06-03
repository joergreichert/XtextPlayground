package de.abg.jreichert.repositorytarget.definition

import de.abg.jreichert.repositorytarget.xml.ContentParser
import de.abg.jreichert.repositorytarget.xml.TargetHandler
import java.io.FileInputStream
import java.io.File

class LocalTargetDefinition extends AbstractTargetDefinition {
	private String targetFilePath
	
	new(String targetFilePath) {
		this.targetFilePath = targetFilePath
	}
	
	override targetDefinition() { 
		val sprayContentParser = new ContentParser
		val sprayTargetHandler = new TargetHandler
		val sprayTargetContent = sprayContentParser.getContent(new FileInputStream(new File(targetFilePath)))
		sprayContentParser.parse(sprayTargetContent, sprayTargetHandler)
		sprayTargetHandler.target
	}
}