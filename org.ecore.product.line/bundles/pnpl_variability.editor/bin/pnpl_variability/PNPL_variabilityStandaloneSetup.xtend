/*
 * generated by Xtext 2.15.0
 */
package pnpl_variability


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PNPL_variabilityStandaloneSetup extends PNPL_variabilityStandaloneSetupGenerated {

	def static void doSetup() {
		new PNPL_variabilityStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
