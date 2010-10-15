/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.io.PrintStream;
import java.util.Collections;

import org.eclipse.b3.backend.core.IB3Printer;
import org.eclipse.b3.backend.core.internal.B3BackendActivator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * Basic scaffolding for a B3 printer.
 * 
 */
public abstract class DeclarativeB3Printer implements IB3Printer {

	private final PolymorphicDispatcher<IStatus> printDispatcher = new PolymorphicDispatcher<IStatus>(
		"print", 3, 3, Collections.singletonList(this), new ErrorHandler<IStatus>() {
			public IStatus handle(Object[] params, Throwable e) {
				return handleIStatusError(params, e);
			}
		});

	/**
	 * Prints to the default stream
	 */
	public IStatus doPrint(Object element, BExecutionContext ctx) {
		return doPrint(element, ctx, getPrintStream());
	}

	/**
	 * Prints to specified stream (or if this stream is null, to the defaultStream).
	 */
	public IStatus doPrint(Object element, BExecutionContext ctx, PrintStream stream) {
		return printDispatcher.invoke(element, ctx, stream == null
				? getPrintStream()
				: stream);
	}

	/**
	 * This default implementation returns System.out
	 */
	public PrintStream getPrintStream() {
		return System.out;
	}

	protected IStatus handleIStatusError(Object[] params, Throwable e) {
		return new Status(IStatus.ERROR, B3BackendActivator.PLUGIN_ID, "Error while printing", e);
	}
}
