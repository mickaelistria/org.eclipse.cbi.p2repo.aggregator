/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.io.PrintStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.b3.backend.core.B3BackendConstants;
import org.eclipse.b3.backend.core.IB3Evaluator;
import org.eclipse.b3.backend.core.IB3Printer;
import org.eclipse.b3.backend.core.IStringProvider;
import org.eclipse.b3.backend.core.internal.B3BackendActivator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTemplate;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * A Default Printer.
 * 
 */

public class B3DefaultPrinter extends DeclarativeB3Printer implements IB3Printer {
	@Inject
	protected IStringProvider stringProvider;

	@Inject
	private IB3Evaluator evaluator;

	@Named(B3BackendConstants.B3_STREAM_OUTPUT)
	private PrintStream printStream;

	@Inject
	public B3DefaultPrinter(@Named(B3BackendConstants.B3_STREAM_OUTPUT) PrintStream stream) {
		printStream = stream;
	}

	@Override
	public PrintStream getPrintStream() {
		if(printStream == null)
			return super.getPrintStream();
		return printStream;
	}

	public void setPrintStream(PrintStream stream) {
		printStream = stream;
	}

	protected IStatus print(BTemplate o, BExecutionContext ctx, PrintStream stream) {
		try {
			for(BExpression expr : o.getExpressions()) {
				// These expressions are not evaluated, since template evaluates to closure(template).
				// evaluate in the template's closure.
				Object result = evaluator.doEvaluate(expr, o instanceof IClosure
						? ((IClosure) o).getClosure()
						: ctx);
				doPrint(result, ctx, stream);
			}
		}
		catch(Error e) {
			throw e;
		}
		catch(Throwable e) {
			return new Status(IStatus.ERROR, B3BackendActivator.PLUGIN_ID, "Error while printing", e);
		}
		return Status.OK_STATUS;
	}

	protected IStatus print(Collection<?> element, BExecutionContext ctx, PrintStream stream) {
		return doPrint(element.iterator(), ctx, stream);
	}

	/**
	 * Prints Map entries on the form key="value" with a space after each "value".
	 * (Serves as a reasonable default for xml attributes).
	 * TODO: make the default printer configurable using format strings
	 * 
	 * @param element
	 * @param ctx
	 * @param stream
	 * @return
	 */
	protected IStatus print(Entry<?, ?> element, BExecutionContext ctx, PrintStream stream) {
		stream.print(stringProvider.doToString(element.getKey()));
		stream.print("=");
		stream.print('"');
		stream.print(stringProvider.doToString(element.getValue()));
		stream.print('"');
		return Status.OK_STATUS;
	}

	protected IStatus print(Iterable<?> element, BExecutionContext ctx, PrintStream stream) {
		return doPrint(element.iterator(), ctx, stream);
	}

	protected IStatus print(Iterator<?> element, BExecutionContext ctx, PrintStream stream) {
		while(element.hasNext()) {
			IStatus result = doPrint(element.next(), ctx, stream);
			if(!result.isOK())
				return result;
		}
		return Status.OK_STATUS;
	}

	/**
	 * Prints map elements polymorphically with a separating space between elements.
	 * 
	 * @param element
	 * @param ctx
	 * @param stream
	 * @return
	 */
	protected IStatus print(Map<?, ?> element, BExecutionContext ctx, PrintStream stream) {
		Iterator<?> itor = element.entrySet().iterator();
		while(itor.hasNext()) {
			IStatus result = doPrint(itor.next(), ctx, stream);
			if(!result.isOK())
				return result;
			if(itor.hasNext())
				stream.print(" ");
		}
		return Status.OK_STATUS;
	}

	protected IStatus print(Object o, BExecutionContext ctx, PrintStream stream) {
		if(o != null)
			stream.print(stringProvider.doToString(o));
		return Status.OK_STATUS;
	}

}
