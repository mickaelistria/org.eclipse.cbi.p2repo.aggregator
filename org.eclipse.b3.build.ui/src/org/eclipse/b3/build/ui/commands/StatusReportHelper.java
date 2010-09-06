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
import org.eclipse.b3.provisional.core.BuildException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;

/**
 * Helper class to determine if and how a status should be reported.
 * 
 */
public class StatusReportHelper {
	/**
	 * This default implementation always returns true.
	 * 
	 * @param status
	 * @return
	 */
	public boolean shouldThisCancelBeReported(IStatus status) {
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
	public boolean shouldThisCoreExceptionBeReportedWithStackTrace(CoreException e) {
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
	public boolean shouldThisErrorBeReportedWithStackTrace(IStatus status) {
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
	public boolean shouldThisOkBeReported(IStatus status) {
		String msg = status.getMessage();
		if(msg == null || msg.length() < 1)
			return false;
		if(status.getMessage().compareToIgnoreCase("ok") == 0)
			return false;
		return true;
	}

	/**
	 * Calls the different 'shouldXXX' methods to determine if the status should be reported.
	 * Note that "OK" and "INFO" are both passed to {@link #shouldThisOkBeReported(IStatus)}
	 * 
	 * @param status
	 * @return true if the status should be reported
	 */
	public boolean shouldThisStatusBeReported(IStatus status) {
		if(status.isOK() || status.matches(IStatus.INFO))
			return shouldThisOkBeReported(status);
		if(status.matches(IStatus.CANCEL))
			return shouldThisCancelBeReported(status);
		if(status.matches(IStatus.WARNING))
			return shouldThisWarningBeReported(status);
		return true; // errors are always reported
	}

	/**
	 * This default implementation always returns true.
	 * 
	 * @param status
	 * @return
	 */
	public boolean shouldThisWarningBeReported(IStatus status) {
		return true;
	}

}
