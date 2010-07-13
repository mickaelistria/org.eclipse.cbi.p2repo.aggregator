package org.eclipse.b3.build.operations;

import java.lang.reflect.Type;
import java.util.List;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.OkResultStatus;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildErrorCodes;
import org.eclipse.b3.build.engine.IB3EngineRuntime;
import org.eclipse.b3.build.engine.IB3Runnable;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.google.inject.internal.Lists;

public class RunMainFunctionInModelOperation implements IB3Runnable {
	final BeeModel model;

	private String functionName;

	private Object[] argv;

	public RunMainFunctionInModelOperation(BeeModel model, Object... argv) {
		this("main", model, argv);
	}

	public RunMainFunctionInModelOperation(String functionName, BeeModel model, Object... argv) {
		if(model == null)
			throw new IllegalArgumentException();
		this.model = model;
		this.argv = argv;
		this.functionName = functionName;
	}

	// @Override
	public IStatus run(IB3EngineRuntime engine, IProgressMonitor monitor) {

		try {
			engine.defineBeeModel(model);
		}
		catch(B3EngineException e) {
			return new Status(
				Status.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.ENGINE_ERROR,
				"B3Engine Error while loading model for evaluation", e);
		}
		//
		// Not needed, engine will take care of this after model is defined - also, the search needs to take parameters
		// into account.
		// // find a function called main (use the first found) and call it with a List<Object> argv
		// IFunction main = null;
		// for(IFunction f : (model).getFunctions()) {
		// if("main".equals(f.getName())) {
		// main = f;
		// break;
		// }
		// }
		//
		// if(main == null)
		// return new Status(Status.ERROR, B3BuildActivator.PLUGIN_ID, "There was no main() function to call");
		final List<Object> argVector = argv == null
				? Lists.newArrayList()
				: Lists.newArrayList(argv);
		try {
			return new OkResultStatus(engine.callFunction(
				functionName, new Object[] { argVector }, new Type[] { List.class }), B3BuildActivator.PLUGIN_ID);

		}
		catch(CoreException e) {
			return new Status(
				Status.ERROR, B3BuildActivator.PLUGIN_ID, B3BuildErrorCodes.EVALUATION_ERROR, "Evaluation of " +
						functionName + "(List) ended with exception.", e);
		}

	}

}
