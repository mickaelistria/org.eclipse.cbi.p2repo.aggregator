package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.BuildContext;

public class B3BuildEngine extends B3Engine {
	protected BuildContext buildContext;
	public B3BuildEngine() {
		super();
		buildContext = B3BuildFactory.eINSTANCE.createBuildContext();
		buildContext.setParentContext(invocationContext);
	}
	/**
	 * Returns the build context parented by the invocation context.
	 */
	@Override
	public BExecutionContext getContext() {
		return buildContext;
	}
	public BuildContext getBuildContext() {
		return buildContext;
	}
}
