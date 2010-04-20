package org.eclipse.b3.backend.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Unfinished. Intended to be used to run any IFunction as a job. See B3BuilderJob.
 */
public class B3Job extends Job {

	public B3Job(String name) {
		super(name);
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
	protected IStatus run(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
