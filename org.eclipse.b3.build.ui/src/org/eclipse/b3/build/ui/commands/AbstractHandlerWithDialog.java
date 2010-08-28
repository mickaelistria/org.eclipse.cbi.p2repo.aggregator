/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.ui.commands;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.b3.backend.core.exceptions.B3UserException;
import org.eclipse.b3.build.ui.dialogs.B3MessageDialog;
import org.eclipse.b3.provisional.core.BuildException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * An Abstract handler with support for dialogs.
 * 
 */
public abstract class AbstractHandlerWithDialog extends AbstractHandler {
	final public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			IStatus result = executeWithDialogSupport(event);
			return reportResult(event, result);
		}
		finally {

		}
	}

	abstract public IStatus executeWithDialogSupport(ExecutionEvent event) throws ExecutionException;

	protected Object reportResult(ExecutionEvent event, IStatus status) {
		final Shell shell = HandlerUtil.getActiveShell(event);

		if(status == null) {
			try {
				throw new IllegalArgumentException("Internal error, can not report result.");
			}
			catch(IllegalArgumentException e) {
				e.printStackTrace();
				B3MessageDialog.openStackTrace(shell, "Internal Serious Error", e.getMessage(), e, 0);
			}
		}
		if(status.isOK() && shouldThisOkBeReported(status))
			B3MessageDialog.openInformation(shell, "Info", status.getMessage());

		else if(status.matches(IStatus.INFO))
			B3MessageDialog.openInformation(shell, "Info", status.getMessage());

		else if(status.matches(IStatus.CANCEL) && shouldThisCancelBeReported(status)) {
			String msg = status.getMessage();
			if(msg.compareToIgnoreCase("cancel") == 0)
				msg = "Output produced by the operation may not be valid.";
			B3MessageDialog.openWarning(shell, "Operation Canceled", msg);
		}
		else if(status.matches(IStatus.WARNING) && shouldThisWarningBeReported(status))
			B3MessageDialog.openWarning(shell, "warning", status.getMessage());

		else if(status.matches(IStatus.ERROR)) {
			if(shouldThisErrorBeReportedWithStackTrace(status))
				B3MessageDialog.openStackTrace(shell, "Serious Error", status.getMessage(), status.getException(), 0);
			else {
				B3MessageDialog.openMultiStatusError(shell, "Error", status.getMessage(), status, 0);
				// ErrorDialog.openError(shell, "Error", "Operation ended with error!", status, IStatus.ERROR);
			}
		}
		return null; // as dictated by Handler API
	}

	/**
	 * This default implementation always returns true.
	 * 
	 * @param status
	 * @return
	 */
	protected boolean shouldThisCancelBeReported(IStatus status) {
		return true;
	}

	/**
	 * This default implementation return true for the following cases :
	 * - all CoreExceptions with a cause exception
	 * - except - if the exception is a B3UserException (i.e. a "throw" in BeeLang)
	 * 
	 * @param e
	 * @return
	 */
	protected boolean shouldThisCoreExceptionBeReportedWithStackTrace(CoreException e) {
		if(e == null)
			return false;
		if(e instanceof B3UserException)
			return false;

		if(e instanceof BuildException)
			return true;
		if(e.getCause() == null)
			return false;
		return true;
	}

	/**
	 * This default implementation returns true for RuntimeExceptions
	 * 
	 * @param status
	 * @return
	 */
	protected boolean shouldThisErrorBeReportedWithStackTrace(IStatus status) {
		Throwable t = status.getException();
		if(t == null)
			return false;
		if(t instanceof CoreException)
			return shouldThisCoreExceptionBeReportedWithStackTrace((CoreException) t);
		if(t instanceof RuntimeException)
			return true;
		if(t instanceof InvocationTargetException)
			return true;
		return false;
	}

	/**
	 * Called to determine if it is meaningful to report an "ok" status or not.
	 * The default rule is that if the message is a variant of "ok" (case insensitive), or is empty, false is returned.
	 * All other messages result in a display.
	 * 
	 * @param status
	 * @return
	 */
	protected boolean shouldThisOkBeReported(IStatus status) {
		String msg = status.getMessage();
		if(msg == null || msg.length() < 1)
			return false;
		if(status.getMessage().compareToIgnoreCase("ok") == 0)
			return false;
		return true;
	}

	/**
	 * This default implementation always returns true.
	 * 
	 * @param status
	 * @return
	 */
	protected boolean shouldThisWarningBeReported(IStatus status) {
		return true;
	}

}
