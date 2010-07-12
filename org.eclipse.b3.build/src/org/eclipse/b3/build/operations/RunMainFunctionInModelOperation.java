package org.eclipse.b3.build.operations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.OkResultStatus;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.engine.IB3EngineRuntime;
import org.eclipse.b3.build.engine.IB3Runnable;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class RunMainFunctionInModelOperation implements IB3Runnable {
	final BeeModel model;

	public RunMainFunctionInModelOperation(BeeModel model) {
		if(model == null)
			throw new IllegalArgumentException();
		this.model = model;
	}

	@Override
	public IStatus run(IB3EngineRuntime engine, IProgressMonitor monitor) {

		try {
			engine.defineBeeModel(model);
		}
		catch(B3EngineException e) {
			return new Status(
				Status.ERROR, B3BuildActivator.PLUGIN_ID, "B3Engine Error while loading model for evaluation", e);
		}

		// find a function called main (use the first found) and call it with a List<Object> argv
		IFunction main = null;
		for(IFunction f : (model).getFunctions()) {
			if("main".equals(f.getName())) {
				main = f;
				break;
			}
		}

		if(main == null)
			return new Status(Status.ERROR, B3BuildActivator.PLUGIN_ID, "There was no main() function to call");

		final List<Object> argv = new ArrayList<Object>();
		argv.add(engine);
		try {
			return new OkResultStatus(
				engine.callFunction("main", new Object[] { argv }, new Type[] { List.class }),
				B3BuildActivator.PLUGIN_ID);

		}
		catch(CoreException e) {
			return new Status(Status.ERROR, B3BuildActivator.PLUGIN_ID, "Evaluation of main() ended with exception.", e);
		}

	}

}
