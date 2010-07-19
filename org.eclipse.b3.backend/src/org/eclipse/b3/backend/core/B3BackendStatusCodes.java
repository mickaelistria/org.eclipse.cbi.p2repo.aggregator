/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

/**
 * Error Code definitions for the org.eclipse.b3.backend
 * 
 */
public interface B3BackendStatusCodes {
	public interface BackendStart {
		/** To avoid confusion between backend, build, ui components in the b3 family, they share a unique set. */
		static final int START = 1000;
	}

	/**
	 * A code that indicates that a status has a result - i.e. implements IResultStatus.
	 * 
	 */
	static final int RESULT_OK = BackendStart.START;

	/**
	 * A problem occured while evaluating expressions. The associated exception is (most likely) an instance of {@link B3BackendException} which may
	 * have an associated BExpression indicating where the problem occurred in
	 * B3. The b3 model probably comes from parsing b3 concrete syntax, and it may then have associated information
	 * of value when reporting. Use {@link BeeLangUtils} to obtain the closest named element, line number and other
	 * information.
	 */
	static final int EVALUATION_ERROR = BackendStart.START + 1;

	/**
	 * A problem occured while validating a loaded b3 resource. The diagnostics may be of different type (from model, from parsing concrete syntax.)
	 * The expectation is that this error is associated with a MultiStatus.
	 * (TODO: validation of loaded b3 resources does not yet capture all syntax errors - see where this code is used).
	 */
	static final int DIAGNOSTICS_ERROR = BackendStart.START + 1;

	// static final int COULD_NOT_DO_SOMETHING = BackendStart.START + 2;
	// static final int ERROR_CODE_XXX = ERROR_START +2;
}
