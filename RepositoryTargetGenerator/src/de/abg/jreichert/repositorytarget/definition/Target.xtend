package de.abg.jreichert.repositorytarget.definition

import java.util.List

class Target {
   @Property private String name
   @Property private List<Location> locations = newArrayList
  
   def createLocation((Location)=>void initializer) {
      val location = new Location()
      initializer.apply(location)
      location
   }
   
	def generateTarget() '''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<?pde version="3.6"?>

		<target includeMode="feature" name="«name»" sequenceNumber="67">
			<locations>
				«locations.map(l|l.generateTarget).join»
			</locations>
			<environment>
				<nl>en</nl>
			</environment>
			<targetJRE path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6"/>
			<launcherArgs>
				<vmArgs>-Xmx512m -XX:MaxPermSize=128m</vmArgs>
			</launcherArgs>
		</target>
	'''
	
	def generateCategoryXml() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<site>
			«locations.map(l|l.generateCategoryXml).join»
			<category-def name="3rdparty" label="Third Party">
				<description>«name»</description>
			</category-def>
		</site>
	'''    
}

class Location {
   @Property private List<Unit> units = newArrayList
   @Property private String repositoryLocation
	
   def createUnit((Unit)=>void initializer) {
      val unit = new Unit()
      initializer.apply(unit)
      unit
   }
   
	def generateTarget() '''
		<location includeAllPlatforms="false" includeMode="planner" includeSource="true" type="InstallableUnit">
			«units.map(u|u.generateTarget).join»
			<repository location="«repositoryLocation»"/>
		</location>
	'''
	
	def generateCategoryXml() '''
		«units.map(u|u.generateCategoryXml).join»
	''' 
}

class Unit {
	@Property private String categoryId = ""
	@Property private String targetId = ""
	@Property private String version = ""
	@Property private String url = ""
	@Property private String category = "3rdparty"
	@Property private Boolean feature = true
	
	def String getTargetId() {
		if(!_categoryId.nullOrEmpty && !_categoryId.endsWith("feature.group") && feature)
           _categoryId + ".feature.group"
		else _categoryId	
	}

	def String getCategoryId() {
		if(!_targetId.nullOrEmpty && _categoryId.nullOrEmpty)
			_categoryId = _targetId.replace(".feature.group", "") 
		else _categoryId	
	}
	
	def String getUrl() {
		if(!categoryId.nullOrEmpty && !version.nullOrEmpty)
			"features/" + categoryId + "_" + version + ".jar"
		else ""	
	}
	
	def generateTarget() '''
		<unit id="«targetId»" version="«version»"/>
	'''
	
	def generateCategoryXml() '''
		<feature url="«url»" id="«categoryId»" version="«version»">
			<category name="«category»"/>
		</feature>
    '''	
}