package de.abg.jreichert.repositorytarget

import java.io.FileWriter

class GeneratorMain {
	
	def static void main(String[] args) {
		val generator = new GeneratorMain
		val target = generator.buildTarget
		generator.generate("category.xml", target.generateCategoryXml)
		generator.generate("todo.target", target.generateTarget)
	}
	
	def buildTarget() {
		val target = new Target => [
  			name = "Xtext TODO Platform - Eclipse 4.2"
  			locations += createLocation [
  				repositoryLocation = "http://download.itemis.com/updates/releases/2.0.0/"
  				units += createUnit [
					categoryId = "de.itemis.xtext.antlr.sdk"
  				]
  				units += createUnit [
					categoryId = "de.itemis.xtext.antlr.feature"
  				]
  			]
  			locations += createLocation [
  				repositoryLocation = "http://download.eclipse.org/technology/swtbot/helios/dev-build/update-site"
  				units += createUnit [
					categoryId = "org.eclipse.swtbot.eclipse"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.swtbot.eclipse.gef"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.swtbot.eclipse.test.junit4"
  				]
  			]
  			locations += createLocation [
  				repositoryLocation = "http://download.eclipse.org/releases/juno"
  				units += createUnit [
					categoryId = "org.eclipse.sdk"
					version = "4.2.0.v20120429-1556-7T7mDFDPz-3Fdco66AJ3a4_XNEnQ8tP_lErJc8cg4oBO3"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.pde"
					version = "3.8.0.v20120511-0746-7c7vFcdFFt6Zr5_Zt4Jz0hBd"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.emf.sdk"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.swt"
					feature = false
  				]
  			]
  			locations += createLocation [
  				repositoryLocation = "http://download.eclipse.org/modeling/tmf/xtext/updates/composite/milestones/"
  				units += createUnit [
					categoryId = "org.eclipse.emf.mwe2.language.sdk"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.emf.mwe2.runtime.sdk"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.xtext.sdk"
  				]
  				units += createUnit [
					categoryId = "org.eclipse.xtend.sdk"
  				]
  			]
  			locations += createLocation [
  				repositoryLocation = "http://xtext-utils.eclipselabs.org.codespot.com/git.distribution/releases/unittesting-0.9.x"
  				units += createUnit [
					categoryId = "org.eclipselabs.xtext.utils.unittesting.feature"
  				]
  			]
		]
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
		if(unit.version == null) {
			unit.version = parser.parseVersionForId(unit.categoryId)
		}	
	}
	
	def generate(String fileName, CharSequence fileContent) {
		val writer = new FileWriter(fileName)
		writer.write(fileContent.toString)
		writer.close
	}	
}