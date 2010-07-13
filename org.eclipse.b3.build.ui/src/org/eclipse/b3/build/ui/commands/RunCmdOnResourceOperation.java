/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.ui.commands;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildErrorCodes;
import org.eclipse.b3.build.engine.IB3EngineRuntime;
import org.eclipse.b3.build.engine.IB3Runnable;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.b3.build.operations.RunMainFunctionInResourceOperation;
import org.eclipse.b3.build.ui.Activator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

/**
 * Runs the _main function in a b3 Resource referenced via a URI on a Resource
 * 
 */
public class RunCmdOnResourceOperation implements IB3Runnable {

	private XtextResource resource;

	private URI uri;

	private Object[] argv;

	public RunCmdOnResourceOperation(String pluginId, String path, XtextResource resource, Object... argv) {
		this.resource = resource;
		if(!path.startsWith("/"))
			path = "/" + path;
		this.uri = URI.createPlatformPluginURI(pluginId + path, true);
		this.argv = argv;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.engine.IB3Runnable#run(org.eclipse.b3.build.engine.IB3EngineRuntime, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public RunCmdOnResourceOperation(URI uri, XtextResource resource) {
		this.resource = resource;
		this.uri = uri;
	}

	// @Override
	public IStatus run(IB3EngineRuntime engine, IProgressMonitor monitor) throws InterruptedException,
			InvocationTargetException {
		// Injector beeLangInjector = new BeeLangStandaloneSetup().createInjector();

		// load the "library" model
		XtextResourceSet beeLangResourceSet = engine.getInjector().getProvider(XtextResourceSet.class).get();
		beeLangResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		beeLangResourceSet.setClasspathURIContext(Activator.class.getClassLoader());

		XtextResource mainResource = (XtextResource) beeLangResourceSet.createResource(
			uri, ContentHandler.UNSPECIFIED_CONTENT_TYPE);

		// if(mainResource instanceof LazyLinkingResource) {
		// ((LazyLinkingResource) mainResource).setEagerLinking(true);
		// }

		try {
			mainResource.load(null);
		}
		catch(IOException e1) {
			return new Status(
				IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.COULD_NOT_LOAD_RESOURCE,
				"Could not load library b3 module from: " + uri, e1);
		}
		boolean loaded = false;
		EList<Diagnostic> errors = resource.getErrors();
		if(errors.size() > 0)
			return new Status(
				IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.DIAGNOSTICS_ERROR,
				"Loading encountered diagnostics errors", null);
		final BeeModel beeModel = (BeeModel) mainResource.getParseResult().getRootASTElement();
		if(beeModel.getFunctions() == null || beeModel.getFunctions().isEmpty()) {
			return new Status(
				IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.LOADED_B3MODEL_NO_FUNCTIONS,
				"Error while defining library b3 module:" + mainResource.getURI(), null);

		}
		if(beeModel != null) {
			try {
				engine.defineBeeModel(beeModel);
			}
			catch(B3EngineException e1) {
				return new Status(
					IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.ENGINE_ERROR,
					"Error while defining library b3 module:" + mainResource.getURI(), e1);
			}
			loaded = true;
		}
		try {
			// make the file being executed "wrapped" by the library, overload names that are not final
			engine.push();
			return loaded
					? new RunMainFunctionInResourceOperation("main_", resource, argv).run(engine, monitor)
					: new Status(
						IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.INVALID_B3_RESOURCE,
						"No Model of b3 type found in resource:" + resource.getURI(), null);
		}
		finally {
			// not strictly needed, but one never knows what is being done with the engine after this
			engine.pop();
		}
	}
}
