package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.BuildContext;

import com.google.inject.Module;
import com.google.inject.util.Modules;

public class B3BuildEngine extends B3Engine {

	protected BuildContext buildContext;

	/**
	 * Creates and initializes the engine with a default runtime guice module.
	 */
	public B3BuildEngine() throws B3EngineException {
		super(new DefaultB3Module());
		initialize();
		// invocationContext.setInjector(Guice.createInjector(new DefaultB3Module()));
	}

	/**
	 * Creates and initializes the engine with a an overriding guice module.
	 */
	public B3BuildEngine(Module overridingModule) throws B3EngineException {
		super(Modules.override(new DefaultB3Module()).with(overridingModule));
		initialize();
	}

	public BuildContext getBuildContext() {
		return buildContext;
	}

	/**
	 * Returns the build context parented by the invocation context.
	 */
	@Override
	public BExecutionContext getContext() {
		return buildContext;
	}

	private void initialize() {
		buildContext = B3BuildFactory.eINSTANCE.createBuildContext();
		buildContext.setParentContext(invocationContext);

	}
}
