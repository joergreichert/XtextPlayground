
package org.eclipse.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ClassdefStandaloneSetup extends ClassdefStandaloneSetupGenerated{

	public static void doSetup() {
		new ClassdefStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

