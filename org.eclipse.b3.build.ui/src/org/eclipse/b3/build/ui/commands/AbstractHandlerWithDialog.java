/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.ui.commands;

import org.eclipse.b3.build.ui.dialogs.B3MessageDialog;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * An Abstract handler with support for dialogs.
 * 
 */
public abstract class AbstractHandlerWithDialog extends AbstractHandler {
	private StatusReportHelper reportHelper;

	final public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			IStatus result = executeWithDialogSupport(event);
			return reportResult(event, result);
		}
		finally {

		}
	}

	abstract public IStatus executeWithDialogSupport(ExecutionEvent event) throws ExecutionException;

	protected StatusReportHelper getHelper() {
		if(reportHelper == null)
			reportHelper = new StatusReportHelper();
		return reportHelper;
	}

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
		if(status.isOK() && reportHelper.shouldThisOkBeReported(status))
			B3MessageDialog.openInformation(shell, "Info", status.getMessage());

		else if(status.matches(IStatus.INFO))
			B3MessageDialog.openInformation(shell, "Info", status.getMessage());

		else if(status.matches(IStatus.CANCEL) && reportHelper.shouldThisCancelBeReported(status)) {
			String msg = status.getMessage();
			if(msg.compareToIgnoreCase("cancel") == 0)
				msg = "Output produced by the operation may not be valid.";
			B3MessageDialog.openWarning(shell, "Operation Canceled", msg);
		}
		else if(status.matches(IStatus.WARNING) && reportHelper.shouldThisWarningBeReported(status))
			B3MessageDialog.openWarning(shell, "warning", status.getMessage());

		else if(status.matches(IStatus.ERROR)) {
			if(reportHelper.shouldThisErrorBeReportedWithStackTrace(status))
				B3MessageDialog.openStackTrace(shell, "Serious Error", status.getMessage(), status.getException(), 0);
			else {
				B3MessageDialog.openMultiStatusError(shell, "Error", status.getMessage(), status, 0);
				// ErrorDialog.openError(shell, "Error", "Operation ended with error!", status, IStatus.ERROR);
			}
		}
		return null; // as dictated by Handler API
	}

	protected void setStatusReportHelper(StatusReportHelper helper) {
		reportHelper = helper;
	}

}
