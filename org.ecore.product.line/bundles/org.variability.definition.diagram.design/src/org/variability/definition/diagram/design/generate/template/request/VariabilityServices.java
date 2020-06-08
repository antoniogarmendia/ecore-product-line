package org.variability.definition.diagram.design.generate.template.request;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import pcdef.PCDiagramDefinition;

public class VariabilityServices {
	
	public String workspacePath(EObject eObject) {
		String relativePath = eObject.eResource().getURI().toPlatformString(true);
		return relativePath;
	}

}
