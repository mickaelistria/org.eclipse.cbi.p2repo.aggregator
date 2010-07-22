/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.engine;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.impl.AbstractB3Executor;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * A top level executor.
 */
public abstract class AbstractB3EngineExecutor extends AbstractB3Executor<IStatus> {

	final IB3EngineRuntime engine;

	public AbstractB3EngineExecutor(IB3EngineRuntime engine, BExecutionContext ctx) {
		super(ctx);
		this.engine = engine;
	}

	/**
	 * Implementor should:
	 * - throw InterruptedException if the monitor is canceled (or return an IStatus.CANCELED).
	 * - wrap any checked Exceptions in an InvocationTargetException
	 * - do not need to handle Error exceptions - the caller will wrap them as InvocationTargetException.
	 * - diligently check the monitor for cancellation
	 * - abide by monitor use policy
	 * 
	 * @param monitor
	 * @return
	 * @throws InvocationTargetException
	 * @throws InterruptedException
	 */
	abstract protected IStatus runb3(IB3EngineRuntime engine, IProgressMonitor monitor)
			throws InvocationTargetException, InterruptedException, CoreException;

	@Override
	final public IStatus runb3(IProgressMonitor monitor) {
		// make the ctx available in the thread.
		try {
			try {
				return runb3(engine, monitor);
			}
			catch(Error e) {
				throw new InvocationTargetException(e);
			}
			catch(CoreException e) {
				return e.getStatus();
			}
			catch(InterruptedException e) {
				throw e;
			}
			catch(Exception e) {
				throw new InvocationTargetException(e);
			}
		}
		catch(InvocationTargetException e) {
			return new Status(IStatus.ERROR, B3BuildActivator.PLUGIN_ID, "Uncaught exception caused by: " +
					e.getCause().getMessage());
		}
		catch(InterruptedException e) {
			return Status.CANCEL_STATUS;
		}
	}
}
