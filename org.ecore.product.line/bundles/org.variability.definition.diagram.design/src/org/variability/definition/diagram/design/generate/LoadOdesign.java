package org.variability.definition.diagram.design.generate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.editor.tools.internal.presentation.WorkspaceAndPluginsResourceDialog;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.PlatformUI;

@SuppressWarnings("restriction")
public class LoadOdesign implements IExternalJavaAction {

	public LoadOdesign() {
		// Do nothing
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object diagram = parameters.get("diagram");
		Session session = SessionManager.INSTANCE.getSession((EObject) diagram);
		WorkspaceAndPluginsResourceDialog loadDialog = new WorkspaceAndPluginsResourceDialog
				(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), false, Arrays.asList("odesign"));
		loadDialog.open();
		List<String> paths = loadDialog.getPaths();
		addSemanticResources(paths, session);			
	}
	
	public void addSemanticResources(List<String> paths, Session session) {
		if (paths.size() > 0) {
            for (String path : paths) {            	
            	IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
            	//Check if the odesign is in the current workspace workspace 
            	if (file.exists() == true)
            		session.addSemanticResource(URI.createPlatformResourceURI(paths.get(0), true), new NullProgressMonitor());
            	else 
            		session.addSemanticResource(URI.createPlatformPluginURI(paths.get(0), true), new NullProgressMonitor());            	
            }
        }
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
