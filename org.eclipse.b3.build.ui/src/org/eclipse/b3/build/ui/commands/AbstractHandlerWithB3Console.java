/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 * 
 * Cloudsmith Inc. API and initial contribution.
 */
package org.eclipse.b3.build.ui.commands;

import java.io.PrintStream;

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.core.IResultStatus;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.beelang.ui.BeeLangConsoleUtils;
import org.eclipse.b3.provisional.core.BuildException;
import org.eclipse.b3.utils.BeeLangUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.console.MessageConsole;

/**
 * An AbstractHandler that wraps the call to execute with a b3 console creation and provides
 * b3 result status reporting. To print to the out and error streams simply use
 * 
 * this.b3out.print(...)
 * this.b3err.print(...)
 * 
 * The method printResult(IStatus, boolean) is also useful when presenting the result.
 */
public abstract class AbstractHandlerWithB3Console extends AbstractHandler {

	protected PrintStream b3out;

	protected PrintStream b3err;

	// @Override
	final public Object execute(ExecutionEvent event) throws ExecutionException {
		final MessageConsole b3Console = BeeLangConsoleUtils.getBeeLangConsole();

		b3out = BeeLangConsoleUtils.getConsoleOutputStream(b3Console);

		b3err = BeeLangConsoleUtils.getConsoleErrorStream(b3Console);

		try {
			return executeWithConsole(event);
		}
		finally {
			try {
				b3out.close();
				b3out = null;
			}
			catch(Throwable t) {
			}
			try {
				b3err.close();
				b3err = null;
			}
			catch(Throwable t) {
			}
		}
	}

	abstract public Object executeWithConsole(ExecutionEvent event) throws ExecutionException;

	protected void printResult(IStatus result, boolean stackTrace) {

		if(result.isOK()) {
			b3out.print("b3: ok ");
			if(result instanceof IResultStatus) {
				b3out.print("result=> ");
				b3out.print(((IResultStatus) result).getResult());
			}
			b3out.print("\n");
			return;
		}
		if(result.matches(IStatus.CANCEL)) {
			// operation was cancelled, possibly because of an error, or interuption
			// can also be a multi status with more detail... for now just print 'canceled'.
			b3out.print("canceled.");
		}

		// Only error and warning remain
		Throwable e = result.getException();

		// Useful when debugging
		if(stackTrace)
			BuildException.deeplyPrint(e, System.err, true);

		// Simple error reporting
		b3err.println("b3 error: " + result.getMessage());
		if(e == null) {
			return;
		}
		if(e instanceof B3BackendException) {
			B3BackendException exprException = (B3BackendException) e;
			BExpression expr = exprException.getExpression();
			int lineNumber = BeeLangUtils.getLineNumber(expr);

			b3err.println(exprException.getMessage());
			b3err.println("        at " + BeeLangUtils.closestNamedElement(expr) + "(" +
					exprException.getLocationString() + ":" + lineNumber + ").");
			// don't print the top again
			e = e.getCause();
			if(e != null)
				b3err.println("Caused by:");
		}

		BuildException.deeplyPrint(e, b3err, false);
	}

}
