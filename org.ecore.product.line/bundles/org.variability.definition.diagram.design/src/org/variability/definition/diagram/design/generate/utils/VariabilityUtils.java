package org.variability.definition.diagram.design.generate.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.sirius.viewpoint.description.Group;
import org.variability.definition.diagram.design.Activator;

public final class VariabilityUtils {
	
	// Variability Suffix
	public static final String VARIABILITY_SUFFIX = "variability";
	// Base Variability 
	public static final String BASE_VARIABILITY = "/base-varibility-description/variability.odesign";
			
	public static final Resource variabilityResource(ResourceSet reset) {
		return reset.getResource(URI.createPlatformPluginURI(Activator.PLUGIN_ID + BASE_VARIABILITY, false), true);
	}
	
	public static final Group getVariabilityDescriptionGroup(ResourceSet reset) {
		Resource variabilityResource = variabilityResource(reset);
		EObject groupEObject = variabilityResource.getContents().get(0);
		if (groupEObject instanceof Group) {
			return (Group) groupEObject;			
		}		
		return null;
	}
	
	public static final Group copyOfBaseVariabilityGroup(ResourceSet reset) {
		Group  group = getVariabilityDescriptionGroup(reset);
		Copier copier = new Copier();
		Group resultGroup = (Group) copier.copy(group);
		copier.copyReferences();		
		return resultGroup;
	}
	
}
