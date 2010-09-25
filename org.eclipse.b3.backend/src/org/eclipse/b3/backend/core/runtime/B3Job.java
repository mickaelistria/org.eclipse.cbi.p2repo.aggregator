package org.eclipse.b3.backend.core.runtime;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.impl.AbstractB3Job;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

/**
 * Unfinished. Intended to be used to run any IFunction as a job. See B3BuilderJob.
 */
public class B3Job extends AbstractB3Job {

	public B3Job(BExecutionContext ctx, String name) {
		super(ctx, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean belongsTo(Object family) {
		// TODO Auto-generated method stub
		return super.belongsTo(family);
	}

	@Override
	public String toString() {
		return "B3Job(" + getName() + ") @" + Integer.toHexString(this.hashCode());
	}

	@Override
	protected IStatus runb3(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
