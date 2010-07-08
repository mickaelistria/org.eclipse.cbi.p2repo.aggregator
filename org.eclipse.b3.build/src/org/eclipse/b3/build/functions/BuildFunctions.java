package org.eclipse.b3.build.functions;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3Backend;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3NoSuchVariableException;
import org.eclipse.b3.backend.evaluator.IB3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.core.B3BuildEngine;
import org.eclipse.b3.build.core.B3BuilderJob;
import org.eclipse.b3.build.core.BuildUnitProxyAdapterFactory;
import org.eclipse.b3.build.core.EffectiveUnitIterator;
import org.eclipse.b3.build.core.SharedScope;
import org.eclipse.b3.build.repository.IBuildUnitResolver;
import org.eclipse.core.runtime.IStatus;

import com.google.inject.Injector;

public class BuildFunctions {

	@B3Backend(system = true)
	public static Object _callFunction(BExecutionContext ctx, Object[] params, Type[] types) throws Throwable {
		String functionName = (String) params[1];

		Object[] args = new Object[params.length - 2];
		System.arraycopy(params, 2, args, 0, args.length);
		Type[] argTypes = new Type[params.length - 2];
		System.arraycopy(types, 2, argTypes, 0, argTypes.length);
		return ctx.callFunction(functionName, args, argTypes);
	}

	@B3Backend(system = true)
	public static BuildSet _resolveAndRunBuilder(BExecutionContext ctx, Object[] params, Type[] types) throws Throwable {
		B3BuildEngine engine = (B3BuildEngine) params[0];
		String unitName = (String) params[1];

		SharedScope resolutionScope = null;
		Injector injector = ctx.getInjector();
		resolutionScope = injector.getInstance(B3BuildConstants.KEY_RESOLUTION_SCOPE);
		resolutionScope.enter(); // !remember to call exit()
		try {
			IBuildUnitResolver resolver = injector.getInstance(IBuildUnitResolver.class);
			// find unit via name
			EffectiveUnitIterator unitItor = new EffectiveUnitIterator(ctx.getContext(BContext.class));
			BuildUnit unitToUse = null;
			while(unitItor.hasNext()) {
				if((unitToUse = unitItor.next()).getName().equals(unitName))
					break;
				// System.err.print("Unit name:" + unitToUse.getName() + "\n");
				unitToUse = null;
			}
			if(unitToUse == null)
				throw new B3NoSuchVariableException(unitName);
			IStatus status = resolver.resolveUnit(unitToUse, ctx);

			if(!status.isOK())
				throw new B3EngineException("Resolution Failed with non OK status: " + status.toString());
			return _runBuilder(ctx, params, types);
		}
		finally {
			resolutionScope.exit();
		}
	}

	@B3Backend(system = true)
	public static BuildSet _runBuilder(BExecutionContext ctx, Object[] params, Type[] types) throws Throwable {
		String unitName = (String) params[1];
		String functionName = (String) params[2];

		Object[] args = new Object[params.length - 2];
		System.arraycopy(params, 2, args, 0, args.length);
		Type[] argTypes = new Type[params.length - 2];
		System.arraycopy(types, 2, argTypes, 0, argTypes.length);

		// find and set the unit as parameter and with correct type
		EffectiveUnitIterator unitItor = new EffectiveUnitIterator(ctx.getContext(BContext.class));
		BuildUnit unitToUse = null;
		while(unitItor.hasNext()) {
			if((unitToUse = unitItor.next()).getName().equals(unitName))
				break;
			// System.err.print("Unit name:" + unitToUse.getName() + "\n");
			unitToUse = null;
		}
		if(unitToUse != null) {
			BuildUnit unitProxy = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(unitToUse).getProxy();
			args[0] = unitProxy;
			argTypes[0] = unitProxy.getClass();
		}
		else {
			args[0] = null;
			argTypes[0] = BuildUnit.class;
		}

		B3BuilderJob job = (B3BuilderJob) ctx.callFunction(functionName, args, argTypes);
		job.schedule();
		job.join();
		return job.getBuildResult();
	}

	/**
	 * Dynamically call a function.
	 * 
	 * @param engine
	 * @param functionName
	 * @param variable
	 * @return
	 */
	@B3Backend(systemFunction = "_callFunction", varargs = true)
	public static Object callFunction(@B3Backend(name = "engine") IB3Engine engine,
			@B3Backend(name = "functionName") String functionName, @B3Backend(name = "arguments") Object... variable) {
		return null;
	}

	/**
	 * Dynamically Resolve and run a Builder.
	 * 
	 * @param engine
	 * @param functionName
	 * @param variable
	 * @return
	 */
	@B3Backend(systemFunction = "_resolveAndRunBuilder", varargs = true)
	public static BuildSet resolveAndRunBuilder( //
			@B3Backend(name = "engine") IB3Engine engine, //
			@B3Backend(name = "unitName") String unitName, //
			@B3Backend(name = "builderName") String builderName, //
			@B3Backend(name = "arguments") Object... variable) {
		return null;
	}

	/**
	 * Dynamically run a Builder.
	 * 
	 * @param engine
	 * @param functionName
	 * @param variable
	 * @return
	 */
	@B3Backend(systemFunction = "_runBuilder", varargs = true)
	public static BuildSet runBuilder( //
			@B3Backend(name = "engine") IB3Engine engine, //
			@B3Backend(name = "unitName") String unitName, //
			@B3Backend(name = "builderName") String builderName, //
			@B3Backend(name = "arguments") Object... variable) {
		return null;
	}
}
