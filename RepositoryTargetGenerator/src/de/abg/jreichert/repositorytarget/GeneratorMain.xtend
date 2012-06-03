package de.abg.jreichert.repositorytarget

import de.abg.jreichert.repositorytarget.definition.OperaTargetDefinition
import de.abg.jreichert.repositorytarget.definition.LocalTargetDefinition
import java.io.FileWriter

import static de.abg.jreichert.repositorytarget.GeneratorMain.*

class GeneratorMain {
	
	def static void main(String[] args) {
		generateSpray
	}
	
	def static generateSpray() {
		val sprayGenerator = new GeneratorMain
		val sprayTargetDefinition = new LocalTargetDefinition("input/spray/spray-juno.target")
		val sprayTarget = sprayTargetDefinition.buildTarget
		sprayGenerator.generate("output/spray/category.xml", sprayTarget.generateCategoryXml)
		sprayGenerator.generate("output/spray/spray-juno.target", sprayTarget.generateTarget)
	}

	def static generateOpera() {
		val operaGenerator = new GeneratorMain
		val operaTargetDefinition = new OperaTargetDefinition
		val operaTarget = operaTargetDefinition.buildTarget
		operaGenerator.generate("output/opera/category.xml", operaTarget.generateCategoryXml)
		operaGenerator.generate("output/opera/todo.target", operaTarget.generateTarget)
	}
	
	def generate(String fileName, CharSequence fileContent) {
		val writer = new FileWriter(fileName)
		writer.write(fileContent.toString)
		writer.close
	}	
}