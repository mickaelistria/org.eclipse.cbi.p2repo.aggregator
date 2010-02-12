package org.eclipse.b3.build.core;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.BuilderReference;
import org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class B3BuilderJob extends Job {

	private BExecutionContext ctx;
	private IBuilder builder;
	private BuildUnit unit;
	private B3BuilderJob parent;
	private List<String> aliases;

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
		this.aliases = null;
		setName("building: " + unit.getName() + "#" + builder.getName());
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			// set the UNIT DEFAULT PROPERTIES in a context visible downstream
			// (but only if there are default properties to evaluate).
			BPropertySet properties = unit.getDefaultProperties();
			if(properties != null) {
				BInnerContext ictx = ctx.createWrappedInnerContext();
				properties.evaluateDefaults(ictx.getOuterContext());
				ctx = ictx;
			}

			// PRECONDITION
			// just evaluate, supposed to throw exception if not acceptable
			// The precondition sees the input context, and unit default properties
			// but not 'output', 'input', and the builder's default properties.
			//
			BExpression tmp = builder.getPrecondExpr();
			if(tmp != null)
				tmp.evaluate(ctx);
			
			// Iterate over all builder references, and call each builder to produce a build job.
			// Collect all build jobs to be executed.
			//
			List<B3BuilderJob> jobsToRun = new ArrayList<B3BuilderJob>();
			Iterator<EffectiveBuilderReferenceFacade> rItor = builder.getEffectiveBuilderReferences(ctx);
			while(rItor.hasNext()) {
				EffectiveBuilderReferenceFacade ebref = rItor.next();
				BuilderReference bref = ebref.getBuilderReference();
				String builderName = bref.getBuilderName();
				BExecutionContext ctxToUse = ebref.getContext();
				BParameterList parameters = bref.getParameters();
				int size = 1 + (parameters == null ? 0 : parameters.getParameters().size());
				Object[] values = new Object[size];
				Type[] types = new Type[size];
				int idx = 1;
				if(parameters != null)
					for(BParameter p : parameters.getParameters()) {
						values[idx] = p.getExpr().evaluate(ctxToUse);
						types[idx++] = p.getExpr().getDeclaredType(ctxToUse);
					}
				values[0] = unit;
				types[0] = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(unit).getProxy().getClass();
				Object buildJobObject = ctxToUse.callFunction(builderName, values, types);
				if(!(buildJobObject instanceof B3BuilderJob)) 
					throw new B3InternalError("Builder did not return a B3BuilderJob: "+builderName);
				B3BuilderJob buildJob = (B3BuilderJob)buildJobObject;
				buildJob.setAliases(ebref.getAliases());
				jobsToRun.add(buildJob);
			}
			// EXECUTE JOB ARRAY observing the execution mode of the builder and the unit
			if(builder.getExecutionMode()  == ExecutionMode.PARALLEL && unit.getExecutionMode() == ExecutionMode.PARALLEL)
				runParallel(jobsToRun, monitor);
			else
				runSequential(jobsToRun, monitor);
			
			// COLLECT INPUT RESULT
			// merge the input into one PathGroup
			// set the result in the context as "input"
			// do this even if there were no jobs etc (i.e. an empty PathGroup) for consistency
			// if a job was canceled, or there were errors, collect result will throw an exception
			//
			ctx.defineFinalValue("input", collectResult(jobsToRun), PathGroup.class);
						
			// POST INPUT CONDITION
			// just evaluate, supposed to throw exception if not acceptable
			// TODO: context should have output and input set...
			tmp = builder.getPostinputcondExpr();
			if(tmp != null)
				tmp.evaluate(ctx);
				
				
			// TODO: evaluate the function body (or perform the default action)
				
			// POST CONDITION
			// just evaluate, supposed to throw exception if not acceptable
			tmp = builder.getPostcondExpr();
			if(tmp != null)
				tmp.evaluate(ctx);
			
		return null; // TODO: BOGUS RETURN NULL
		
		} catch (OperationCanceledException e) {
			return B3BuilderStatus.CANCEL_STATUS;
			
		} catch (Throwable t) {
			return B3BuilderStatus.error("Builder Job Failed - see details", t);
		}
	}

	/**
	 * Collect result, and group according to alias
	 * @param jobsToRun
	 * @return MultiStatus if result was not ok, otherwise B3BuilderStatus
	 */
	private IStatus collectResult(List<B3BuilderJob> jobsToRun) {
		MultiStatus ms = new MultiStatus(B3BuildActivator.instance.getBundle().getSymbolicName(), 0, "", null);
		for(B3BuilderJob job : jobsToRun) {
			IStatus s = job.getResult();
			if(s == null) 
				s = Status.CANCEL_STATUS; // unfinished, never scheduled etc...
			ms.add(s);
		}
		if(! ms.isOK())
			return ms;
		
		// collection all as "input", and collect per "alias"
		//
		Map<String, PathGroup> resultMap = new HashMap<String, PathGroup>();
		for(B3BuilderJob job : jobsToRun) {
			
			
		}
		return null;
	}
	private void mergeResult(String key, PathGroup add, Map<String, PathGroup> result) {
		PathGroup pg = result.get(key);
		if(pg == null)
			result.put(key, pg = B3BuildFactory.eINSTANCE.createPathGroup());
		
	}
	private void runSequential(List<B3BuilderJob> jobsToRun, IProgressMonitor monitor) {
		for(B3BuilderJob job : jobsToRun) {
			if(monitor.isCanceled()) 
				throw new OperationCanceledException();
			job.schedule();
			try {
				job.join();
			} catch (InterruptedException e) {
				// TODO What to do on interrupted? There should be no interruptions...
				// Maybe have some watch dog that times out if a job takes too long (? hours?)
				e.printStackTrace();
			}
			if(job.getResult() == null || !job.getResult().isOK())
				return; // stop scheduling, let collect result deal with what is wrong
		}
		
	}

	private void runParallel(List<B3BuilderJob> jobsToRun, IProgressMonitor monitor) {
		for(B3BuilderJob job : jobsToRun) {
			if(monitor.isCanceled()) 
				throw new OperationCanceledException();
			job.setFamily(this);
			job.schedule();
		}
		
		try {
			// wait for all of the scheduled jobs.
			getJobManager().join(this, monitor);
		} catch (InterruptedException e) {
			// TODO What to do on interrupted? There should be no interruptions...
			// Maybe have some watch dog that times out if a job takes too long (? hours?)
			e.printStackTrace();
		}
		// in case the wait was canceled
		if(monitor.isCanceled())
			throw new OperationCanceledException();
		
	}
	private void setFamily(B3BuilderJob parent) {
		this.parent = parent;
	}
	private void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}
	private List<String> getAliases() {
		if(aliases == null) {
			return Collections.emptyList();
		}
		return aliases;
	}
	
	@Override
	public boolean belongsTo(Object family) {
		if(family instanceof B3BuilderJob && ((B3BuilderJob)family) == parent)
			return true;
		return super.belongsTo(family);
	}
}
