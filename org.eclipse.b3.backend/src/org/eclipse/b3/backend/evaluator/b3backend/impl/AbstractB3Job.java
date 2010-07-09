/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

/**
 * A B3 Job handles the B3 stack aspects of running Jobs.
 * A derived class should implement the protected method runb3(IProgressMonitor).
 */
public abstract class AbstractB3Job extends Job {
	/**
	 * Initially set to the context used when the job was created. This context forms the
	 * starting context in thread local access. A subclass may change this at any time without fear of affecting
	 * the thread local context managed by B3InternalContextAccess.
	 */
	protected BExecutionContext ctx;

	/**
	 * Creates a Job that can execute b3 evaluator.
	 * 
	 * @param ctx
	 *            Initial context
	 * @param name
	 *            Label in job listings, may be changed in derived constructor.
	 */
	public AbstractB3Job(BExecutionContext ctx, String name) {
		super(name);
		this.ctx = ctx;
	}

	/**
	 * Makes sure the Job has a tread local variable for the b3 context.
	 */
	@Override
	final protected IStatus run(IProgressMonitor monitor) {
		// make the ctx available in the thread.
		final BExecutionContext previous = B3InternalContextAccess.set(ctx);
		try {
			return runb3(monitor);
		}
		finally {
			B3InternalContextAccess.set(previous);

		}
	}

	abstract protected IStatus runb3(IProgressMonitor monitor);
}
