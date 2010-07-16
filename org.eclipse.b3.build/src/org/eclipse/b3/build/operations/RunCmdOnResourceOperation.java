/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.operations;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.core.B3BackendErrorCodes;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildErrorCodes;
import org.eclipse.b3.build.engine.IB3EngineRuntime;
import org.eclipse.b3.build.engine.IB3Runnable;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Maps;
import com.google.inject.Injector;

/**
 * Runs the _main function in a b3 Resource referenced via a URI on a Resource
 * 
 */
public class RunCmdOnResourceOperation implements IB3Runnable {

	private XtextResource resource;

	private URI uri;

	private Map<String, String> parameters;

	private String cmdFunction;

	@SuppressWarnings("unchecked")
	public RunCmdOnResourceOperation(String pluginId, String path, XtextResource resource, Object... argv) {
		this.resource = resource;
		if(!path.startsWith("/"))
			path = "/" + path;
		this.uri = URI.createPlatformPluginURI(pluginId + path, true);
		if(argv.length == 0)
			parameters = Maps.newHashMap();
		else if(argv.length != 1 || !(argv[0] instanceof Map<?, ?>))
			throw new IllegalArgumentException("If arguments are used, it must be a single Map<String, String>");
		else
			parameters = (Map<String, String>) argv[0];
	}

	/**
	 * @param uri2
	 * @param cmdFunction
	 * @param parameters
	 * @param state
	 */
	public RunCmdOnResourceOperation(URI uri, String cmdFunction, Map<String, String> parameters, XtextResource resource) {
		this.parameters = parameters;
		this.resource = resource;
		this.cmdFunction = cmdFunction;
		this.uri = uri;
	}

	public RunCmdOnResourceOperation(URI uri, XtextResource resource) {
		this.resource = resource;
		this.uri = uri;
		this.cmdFunction = "main";
		this.parameters = Maps.newHashMap();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.engine.IB3Runnable#run(org.eclipse.b3.build.engine.IB3EngineRuntime, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public IStatus run(IB3EngineRuntime engine, IProgressMonitor monitor) throws InterruptedException,
			InvocationTargetException {
		Injector beeLangInjector = engine.getInjector();
		XtextResourceSet beeLangResourceSet = beeLangInjector.getInstance(XtextResourceSet.class);
		beeLangResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		XtextResource mainResource = (XtextResource) beeLangResourceSet.createResource(
			uri, ContentHandler.UNSPECIFIED_CONTENT_TYPE);

		try {
			Map<Object, Object> options = Maps.newHashMap();
			// TODO: should only be done for non IResources
			options.put(XtextResource.OPTION_ENCODING, "UTF-8");
			options.put(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			mainResource.load(options);
		}
		catch(IOException e1) {
			return new Status(
				IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.COULD_NOT_LOAD_RESOURCE,
				"Could not load library b3 module from: " + uri, e1);
		}
		boolean loaded = false;
		// Validate
		IResourceValidator validator = beeLangInjector.getInstance(IResourceValidator.class);
		List<Issue> errors = validator.validate(mainResource, CheckMode.ALL, new CancelIndicator.NullImpl());
		if(errors.size() > 0) {
			// MultiStatus ms = new MultiStatus()
			if(errors.size() > 1)
				return new Status(
					IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BackendErrorCodes.DIAGNOSTICS_ERROR,
					"Loading encountered diagnostics errors", null);
		}
		// final BeeModel beeModel = (BeeModel) mainResource.getParseResult().getRootASTElement();
		final BeeModel beeModel = (BeeModel) mainResource.getContents().get(0);
		if(beeModel == null || beeModel.getFunctions() == null || beeModel.getFunctions().isEmpty()) {
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
					? new RunFunctionInResourceOperation(cmdFunction, resource, RunOptions.CALL_MAP, parameters).run(
						engine, monitor)
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
// EXPERIMENT - PRINT CONTENT OF FILE
// try {
// InputStream is = beeLangResourceSet.getURIConverter().createInputStream(uri);
// InputStreamReader reader = new InputStreamReader(is);
// BufferedReader r = new BufferedReader(reader);
// for(;;) {
// try {
// String s = r.readLine();
// if(s == null)
// break;
// System.err.println(s);
//
// }
// catch(IOException e) {
// System.err.println("EOF");
// }
// }
// }
// catch(IOException e) {
// // t o d o : Auto-generated catch block
// e.printStackTrace();
// }

