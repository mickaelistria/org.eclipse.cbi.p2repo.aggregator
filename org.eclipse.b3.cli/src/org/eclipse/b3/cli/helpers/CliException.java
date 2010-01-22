/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.cli.helpers;

/**
 * @author filip.hrbek@cloudsmith.com
 * 
 */
public class CliException extends Exception {

	private static final long serialVersionUID = -5229548403667906807L;

	public CliException() {
		super();
	}

	/**
	 * @param message
	 */
	public CliException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public CliException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public CliException(Throwable cause) {
		super(cause);
	}

}
