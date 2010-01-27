package org.eclipse.b3.backend.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;

public class B3Job extends Job {

	public B3Job(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "B3Job(" + getName() + ") @" + Integer.toHexString(this.hashCode());
	}
	@Override
	public boolean belongsTo(Object family) {
		// TODO Auto-generated method stub
		return super.belongsTo(family);
	}
}
