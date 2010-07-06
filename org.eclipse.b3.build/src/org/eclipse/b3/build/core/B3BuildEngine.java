package org.eclipse.b3.build.core;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.IB3Engine;
import org.eclipse.b3.backend.evaluator.IB3Evaluator;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.inference.FunctionUtils;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.functions.BuildFunctions;
import org.eclipse.b3.build.repository.IBuildUnitResolver;
import org.eclipse.core.runtime.IStatus;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

public class B3BuildEngine extends B3Engine {

	protected BContext buildContext;

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

	public Object callFunction(String name, Object[] parameters, Type[] types) throws Throwable {
		return getContext().callFunction(name, parameters, types);
	}

	public void defineBeeModel(BeeModel model) throws B3EngineException {
		try {
			getInjector().getInstance(IB3Evaluator.class).doEvaluate(model, getBuildContext());
		}
		catch(Exception e) {
			throw new B3EngineException("Exception while loading b3 model", e);
		}
		catch(Throwable e) {
			throw (Error) e;
		}
	}

	private BExecutionContext getBuildContext() {
		return buildContext;
	}

	/**
	 * Returns the build context parented by the invocation context.
	 */
	@Override
	public BExecutionContext getContext() {
		return buildContext;
	}

	/**
	 * Returns the initial injector configured for the engine. (Inner contexts may have created sub injectors).
	 * Always obtain the injector from a BExecutionContext if such a context is available.
	 * 
	 * @return
	 */
	public Injector getInjector() {
		return getBuildContext().getInjector();
	}

	private void initialize() throws B3EngineException {
		buildContext = B3backendFactory.eINSTANCE.createBContext();
		buildContext.setParentContext(invocationContext);
		try {
			buildContext.defineFinalValue("b3", this, IB3Engine.class);
		}
		catch(B3EngineException e) {
			throw new B3InternalError("Initialization of B3BuildEngine failed with exception", e);
		}
		// TODO: Fix this horrible crutch that creates a FunctionUtils instance via guice (to get things
		// injected), and making it available statically to non guice code.
		// Remove this construct when everything is moved off evaluation/calls in the model code.
		//
		FunctionUtils.instance = getInjector().getInstance(FunctionUtils.class);
		invocationContext.loadFunctions(BuildFunctions.class);

	}

	/**
	 * Can only be called when a resolution scope has been entered.
	 * 
	 * @return
	 */
	public IStatus resolveAllUnits() {
		IBuildUnitResolver resolver = getInjector().getInstance(IBuildUnitResolver.class);

		return resolver.resolveAll(getBuildContext());
	}
}
