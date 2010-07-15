/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.operations;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildErrorCodes;
import org.eclipse.b3.build.engine.IB3EngineRuntime;
import org.eclipse.b3.build.engine.IB3Runnable;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;

/**
 * Runs the main function in a b3 Resource.
 * 
 */
public class RunFunctionInResourceOperation implements IB3Runnable {

	private XtextResource resource;

	private Object[] argv;

	private String functionName;

	private int callStyle;

	/**
	 * Runs the given function with signature (List<Object>)=>Object
	 */
	public RunFunctionInResourceOperation(String functionName, XtextResource resource, int callStyle,
			Object... argv) {
		this.functionName = functionName;
		this.resource = resource;
		this.argv = argv;
		this.callStyle = callStyle;
	}

	/**
	 * Runs the "main" function main(List<Object>)
	 * 
	 * @param resource
	 * @param argv
	 */
	public RunFunctionInResourceOperation(XtextResource resource, Object... argv) {
		this("main", resource, RunOptions.CALL_LIST, argv);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.engine.IB3Runnable#run(org.eclipse.b3.build.engine.IB3EngineRuntime, org.eclipse.core.runtime.IProgressMonitor)
	 */
	// @Override
	public IStatus run(IB3EngineRuntime engine, IProgressMonitor monitor) throws InterruptedException,
			InvocationTargetException {

		for(EObject e : resource.getContents())
			if(e instanceof BeeModel)
				return new RunFunctionInModelOperation(functionName, (BeeModel) e, callStyle, argv).run(
					engine, monitor);
		return new Status(
			IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.INVALID_B3_RESOURCE,
			"No Model of b3 type found in resource:" + resource.getURI(), null);
	}
}
