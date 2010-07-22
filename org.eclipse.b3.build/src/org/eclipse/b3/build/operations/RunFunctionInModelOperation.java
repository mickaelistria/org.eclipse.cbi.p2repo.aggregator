/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.operations;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.core.B3BackendStatusCodes;
import org.eclipse.b3.backend.core.OkResultStatus;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildStatusCodes;
import org.eclipse.b3.build.engine.IB3EngineRuntime;
import org.eclipse.b3.build.engine.IB3Runnable;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.google.inject.internal.Lists;

/**
 * This operation runs a named function (or "main" if no function name is stated) in the given model, with
 * the stated arguments.
 * If the called function produces an exception, this is wrapped in an error status which is returned.
 * If the function returns, it is wrapped in an IResultStatus with OK status, and the result.
 * A command handler (from the UI, or command line) should check if the returned value is as an instance of IStatus,
 * as this indicates the status of the executed b3 code.
 * Note that there is no difference between engine exceptions and exceptions thrown from b3 code (e.g. a b3 script
 * can throw java IllegalArgumentException if it wants to).
 */
public class RunFunctionInModelOperation implements IB3Runnable {

	final BeeModel model;

	private String functionName;

	private int callStyle;

	private Object[] argv;

	public RunFunctionInModelOperation(BeeModel model, Object... argv) {
		this("main", model, RunOptions.CALL_LIST, argv);
	}

	public RunFunctionInModelOperation(String functionName, BeeModel model, int callStyle, Object... argv) {
		if(model == null)
			throw new IllegalArgumentException();
		this.model = model;
		this.argv = argv;
		this.functionName = functionName;
		this.callStyle = callStyle;
		if(callStyle == RunOptions.CALL_MAP && !(argv.length == 1 && argv[0] instanceof Map<?, ?>))
			throw new IllegalArgumentException("Argument(s) must be a single Map");
	}

	// @Override
	public IStatus run(IB3EngineRuntime engine, IProgressMonitor monitor) {

		try {
			engine.defineBeeModel(model);
		}
		catch(B3EngineException e) {
			return new Status(
				IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildStatusCodes.ENGINE_ERROR,
				"B3Engine Error while loading model for evaluation", e);
		}

		Object[] args = null;
		Type[] types = null;
		switch(callStyle) {
			case RunOptions.CALL_VARARG:
				args = argv;
				types = new Type[argv.length];
				for(int i = 0; i < argv.length; i++)
					types[i] = argv[i].getClass();
				break;
			case RunOptions.CALL_LIST:
				args = new Object[] { argv == null
						? Lists.newArrayList()
						: Lists.newArrayList(argv) };
				types = new Type[] { List.class };
				break;
			case RunOptions.CALL_MAP:
				args = argv;
				types = new Type[] { argv[0].getClass() };
				break;
		}
		try {
			return new OkResultStatus(engine.callFunction(functionName, args, types), B3BuildActivator.PLUGIN_ID);

		}
		catch(CoreException e) {
			String argType = null;
			switch(callStyle) {
				case RunOptions.CALL_MAP:
					argType = "(Map<String, String>)";
					break;
				case RunOptions.CALL_VARARG:
					argType = "(Object...)";
					break;
				case RunOptions.CALL_LIST:
					argType = "(List<Object>)";
					break;
				default:
					argType = "";
					break;
			}
			return new Status(
				IStatus.ERROR, B3BuildActivator.PLUGIN_ID, B3BackendStatusCodes.EVALUATION_ERROR, "Evaluation of " +
						functionName + argType + " ended with exception.", e);
		}

	}

}
