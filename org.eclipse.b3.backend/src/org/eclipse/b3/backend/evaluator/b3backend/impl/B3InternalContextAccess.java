/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * Provides access to the BExecutionContext per thread.
 * A user of this context must observe that the context is only fully valid when
 * the evaluator calls out to java - that is, when a BFunction (B3 or Java) is invoked.
 * Internally, the evaluator is passing BExecutionContexts instances on the regular java stack.
 * The evaluator currently makes use of the InternalContextAccess to obatin the injector.
 * Any code that wants to insert a new instance of the injector *must* also update B3InternalContextAccess
 * state.
 * 
 * @generated NOT (just to be safe :) this class was never generated.
 */
public class B3InternalContextAccess {
	private static ThreadLocal<BExecutionContext> context = new ThreadLocal<BExecutionContext>();

	public static BExecutionContext get() {
		final BExecutionContext result = context.get();
		if(result == null) {
			throw new B3InternalError(
				"Improper call sequence resultet in a null B3ExecutionContext. Use apropriate executor.");
		}
		return result;
	}

	/**
	 * Clears the remembered execution context.
	 * Only call this when the evaluation engine is stopping. It is package private for a very good reason.
	 * 
	 * @param ctx
	 * @return
	 */

	static void remove() {
		context.remove();
	}

	/**
	 * A call of this method *must* reset the returned value to what this method returns.
	 * This method is package private on purpose. If there is a need to change this, think again.
	 * 
	 * @param ctx
	 * @return
	 */
	static BExecutionContext set(BExecutionContext ctx) {
		final BExecutionContext result = context.get();
		context.set(ctx);
		return result;
	}
}
