/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.operations;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.engine.IB3EngineRuntime;
import org.eclipse.b3.build.engine.IB3Runnable;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

/**
 * Runs the main function in a b3 Resource referenced via a URI on a Resource
 * 
 */
public class RunXOnResourceOperation implements IB3Runnable {

	private XtextResource resource;

	private URI uri;

	private Object[] argv;

	public RunXOnResourceOperation(String pluginId, String path, XtextResource resource, Object... argv) {
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
	public RunXOnResourceOperation(URI uri, XtextResource resource) {
		this.resource = resource;
		this.uri = uri;
	}

	@Override
	public IStatus run(IB3EngineRuntime engine, IProgressMonitor monitor) throws InterruptedException,
			InvocationTargetException {

		XtextResourceSet beeLangResourceSet = engine.getInjector().getProvider(XtextResourceSet.class).get();
		beeLangResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		XtextResource mainResource = (XtextResource) beeLangResourceSet.createResource(
			uri, ContentHandler.UNSPECIFIED_CONTENT_TYPE);

		try {
			mainResource.load(null);
		}
		catch(IOException e1) {
			return new Status(
				IStatus.ERROR, B3BuildActivator.PLUGIN_ID, "Could not load library b3 module from:" + uri, e1);
		}
		boolean loaded = false;
		for(EObject e : resource.getContents())
			if(e instanceof BeeModel) {
				try {
					engine.defineBeeModel((BeeModel) e);
				}
				catch(B3EngineException e1) {
					return new Status(
						IStatus.ERROR, B3BuildActivator.PLUGIN_ID, "Error while defining library b3 module:" +
								mainResource.getURI(), e1);
				}
				loaded = true;
			}
		return loaded
				? new RunMainFunctionInResourceOperation(resource, argv).run(engine, monitor)
				: new Status(IStatus.ERROR, B3BuildActivator.PLUGIN_ID, "No Model of b3 type found in resource:" +
						resource.getURI());

	}
}
