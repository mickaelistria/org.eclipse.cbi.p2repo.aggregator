/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import java.io.PrintStream;

import org.eclipse.b3.backend.evaluator.B3DefaultPrinter;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.core.runtime.IStatus;

import com.google.inject.ImplementedBy;

/**
 * Prints (and evaluates) nested expressions.
 * If no PrintStream is set, an implementation must return a default PrintStream on {@link #getPrintStream()}.
 */
@ImplementedBy(B3DefaultPrinter.class)
public interface IB3Printer {

	public IStatus doPrint(Object element, BExecutionContext ctx);

	public IStatus doPrint(Object element, BExecutionContext ctx, PrintStream stream);

	public PrintStream getPrintStream();

	public void setPrintStream(PrintStream stream);
}
