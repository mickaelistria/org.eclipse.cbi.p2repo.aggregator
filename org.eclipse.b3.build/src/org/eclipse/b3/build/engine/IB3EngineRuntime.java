/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.engine;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

import com.google.inject.Injector;

/**
 * The B3Engine as seen from the Java Runtime side.
 * 
 */
public interface IB3EngineRuntime {
	/**
	 * Calls a function using the b3 calling convention.
	 * 
	 * @exception The
	 *                receiver of a CoreException should check if the status.matches(IStatus.CANCEL) and to detect cancellation.
	 * 
	 * @param name
	 * @param parameters
	 * @param types
	 * @return
	 * @throws CoreException
	 */
	public Object callFunction(final String name, final Object[] parameters, final Type[] types) throws CoreException;

	/**
	 * Defines a BeeModel in the engine for evaluation.
	 * 
	 * @throws B3EngineException
	 */
	void defineBeeModel(BeeModel state) throws B3EngineException;

	/**
	 * Returns the guice injector used by this engine. Note that this injector may have different configuration
	 * over time (intended for injection into the b3 scripts, the injector returned on this call is suitable for
	 * engine related injections). Always use a injector to get instances instead of using new Something().
	 * 
	 * @return
	 */
	Injector getInjector();

	/**
	 * Pops one execution context in the b3 engine runtime stack. It is the callers
	 * responsability to balance the push and pops, although The engine will only pop to its initial context.
	 * 
	 * @return false if there is nothing more to pop.
	 */
	boolean pop();

	void printStackTrace();

	/**
	 * Pushes a new execution context on the b3 engine runtime stack.
	 * This is useful for loading several BeeModels, and where subsequent loads should
	 * override what is already loaded (as opposed to potentially clash).
	 */
	void push();

	/**
	 * Run the runnable in the engine with a Null progress monitor.
	 * A result may be passed back by using an IStatusResult.
	 * 
	 * @param runnable
	 * @return
	 */
	IStatus run(IB3Runnable runnable);

	/**
	 * Run the runnable in the engine with given progress monitor.
	 * A result may be passed back by using an IStatusResult.
	 * 
	 * @param runnable
	 * @return
	 */
	IStatus run(IB3Runnable runnable, IProgressMonitor monitor);
}
