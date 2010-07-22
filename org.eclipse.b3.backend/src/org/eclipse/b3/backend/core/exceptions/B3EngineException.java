package org.eclipse.b3.backend.core.exceptions;

public class B3EngineException extends Exception {
	private static final long serialVersionUID = 1L;

	public B3EngineException(String message) {
		super(message);
	}

	public B3EngineException(String message, Throwable cause) {
		super(message, cause);
	}
}
