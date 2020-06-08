package org.variability.definition.diagram.design.generate;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.ExtendedLoadResourceDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class LoadEcore implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object diagram = parameters.get("diagram");
		Session session = SessionManager.INSTANCE.getSession((EObject) diagram);
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	      ExtendedLoadResourceDialog loadResourceDialog =
	        new ExtendedLoadResourceDialog
	          (shell, session.getTransactionalEditingDomain());
	     if (loadResourceDialog.open() == Window.OK && !loadResourceDialog.getRegisteredPackages().isEmpty()) {	    	 
	    	 System.out.println("The meta-model cannot be loaded");
	     }	
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
