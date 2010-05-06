
package org.eclipse.b3;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BeeLangStandaloneSetup extends BeeLangStandaloneSetupGenerated{

	public static void doSetup() {
		new BeeLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

