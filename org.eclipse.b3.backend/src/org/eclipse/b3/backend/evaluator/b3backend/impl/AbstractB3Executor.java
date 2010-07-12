/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * A B3 Job handles the B3 stack aspects of running Jobs.
 * A derived class should implement the protected method runb3(IProgressMonitor).
 */
public abstract class AbstractB3Executor<T> {
	/**
	 * Initially set to the context used when the executor was created. This context forms the
	 * starting context in thread local access. A subclass may change this at any time without fear of affecting
	 * the thread local context managed by B3InternalContextAccess.
	 */
	protected BExecutionContext ctx;

	/**
	 * Creates a Job that can execute b3 evaluator.
	 * 
	 * @param ctx
	 *            Initial context
	 */
	public AbstractB3Executor(BExecutionContext ctx) {
		this.ctx = ctx;
	}

	// /**
	// * Invokes runb3 in a safe way. No cast of return value is performed.
	// */
	// final public Object run() throws InterruptedException, InvocationTargetException {
	// return run(new NullProgressMonitor(), Object.class);
	// }

	/**
	 * Invokes runb3 in a safe way. The returned value is casted to the given class.
	 */
	final public T run() throws InterruptedException, InvocationTargetException, CoreException {
		return run(new NullProgressMonitor());
	}

	/**
	 * Invokes runb3 in a safe way.
	 * Exceptions are processed as follows:
	 * - Declared expressions are passed through unwrapped
	 * - All other Exceptions and Errors are wrapped in an InvocationTargetException and thrown
	 * - Other exceptions are thrown as a RuntimeException (for very special cases when someone derived directly
	 * from Throwable).
	 */
	final public T run(IProgressMonitor monitor) throws InterruptedException, InvocationTargetException, CoreException {
		// make the ctx available in the thread.
		RuntimeException nasty = new RuntimeException();
		final BExecutionContext previous = B3InternalContextAccess.set(ctx);
		try {
			return (runb3(monitor));
		}
		catch(CoreException e) {
			throw e;
		}
		catch(Exception e) {
			if(e instanceof InterruptedException)
				throw (InterruptedException) e;
			throw new InvocationTargetException(e);
		}
		catch(Error e) {
			throw new InvocationTargetException(e);
		}
		catch(Throwable e) {
			// Runtime exception created earlier, because it is not known if "new" is a safe operation
			nasty.initCause(e);
			throw nasty;
		}

		finally {
			B3InternalContextAccess.set(previous);

		}
	}

	abstract protected T runb3(IProgressMonitor monitor) throws Throwable;
}
