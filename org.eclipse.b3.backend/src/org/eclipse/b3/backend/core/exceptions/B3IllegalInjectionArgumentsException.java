/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core.exceptions;

public class B3IllegalInjectionArgumentsException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3IllegalInjectionArgumentsException() {
		super("Can not inject an instance and use parameters at the same time.");
	}

	public B3IllegalInjectionArgumentsException(String message) {
		super(message);
	}

}
