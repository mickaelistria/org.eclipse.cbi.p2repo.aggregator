package org.eclipse.b3.build.core;

import java.util.Iterator;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.BuilderReference;
import org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.jobs.Job;

public class B3BuilderJob extends Job {

	private BExecutionContext ctx;
	private IBuilder builder;
	private BuildUnit unit;

	/**
	 * Creates a B3BuilderJob that will run a builder for a unit identified by the value of "unit"
	 * found in the context passed as an argument.
	 * @param ctx
	 * @param builder
	 * @throws B3EngineException if the value "unit" is not defined in the context.
	 */
	public B3BuilderJob(BExecutionContext ctx, IBuilder builder) throws B3EngineException {
		super("builder job"); // dummy name, replaced below
		this.ctx = ctx;
		this.builder = builder;
		this.unit = (BuildUnit)ctx.getValue("unit");
		setName("building: " + unit.getName() + "#" + builder.getName());
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			// set the UNIT DEFAULT PROPERTIES in a context visible downstream.
			
			// todo - optimize if unit does not have default properties
			BExecutionContext outer = ctx.createOuterContext();
			unit.getDefaultProperties().evaluateDefaults(outer);

			// PRECONDITION
			// just evaluate, supposed to throw exception if not acceptable
			// the context is the calling context
			BExpression tmp = builder.getPrecondExpr();
			if(tmp != null)
				tmp.evaluate(ctx);
			
			Iterator<EffectiveBuilderReferenceFacade> rItor = builder.getEffectiveBuilderReferences(outer);
			while(rItor.hasNext()) {
				EffectiveBuilderReferenceFacade ebref = rItor.next();
				BExecutionContext ctxToUse = ebref.getContext();
				BuilderReference bref = ebref.getBuilderReference();
				bref.getBuilderName();
				bref.getParameters();
				
				// TODO: create job array
				// TODO: execute job array
				
				// POST INPUT CONDITION
				// just evaluate, supposed to throw exception if not acceptable
				// TODO: context should have output and input set...
				tmp = builder.getPostinputcondExpr();
				if(tmp != null)
					tmp.evaluate(outer);
				
				
				// TODO: evaluate the function body (or perform the default action)
				
				
				
				// TODO: evaluate the function body (or perform the default action)
				
				// POST CONDITION
				// just evaluate, supposed to throw exception if not acceptable
				tmp = builder.getPostcondExpr();
				if(tmp != null)
					tmp.evaluate(outer);
			}
			
			
		return null;
		} catch (OperationCanceledException e) {
			return B3BuilderStatus.CANCEL_STATUS;
			
		} catch (Throwable t) {
			return B3BuilderStatus.error("Builder Job Failed - see details", t);
		}
	}

}
