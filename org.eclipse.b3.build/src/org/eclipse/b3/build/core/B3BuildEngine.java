package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.BuildContext;

import com.google.inject.Guice;
import com.google.inject.Module;
import com.google.inject.util.Modules;

public class B3BuildEngine extends B3Engine {

	protected BuildContext buildContext;

	/**
	 * Creates and initializes the engine with a default runtime guice module.
	 */
	public B3BuildEngine() {
		super();
		initialize();
		invocationContext.setInjector(Guice.createInjector(new DefaultB3Module()));
	}

	/**
	 * Creates and initializes the engine with a an overriding guice module.
	 */
	public B3BuildEngine(Module overridingModule) {
		super();
		initialize();
		// create an injector and make it available in the execution context(s)
		// The DeclarativeRepositoriesModule will create UnitRepositoryDescriptor instances for
		// all requests to create a IUnitRepository.
		//
		invocationContext.setInjector(Guice.createInjector(Modules.override(new DefaultB3Module()).with(
			overridingModule)));

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
