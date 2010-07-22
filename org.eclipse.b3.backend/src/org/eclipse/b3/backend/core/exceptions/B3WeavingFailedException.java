package org.eclipse.b3.backend.core.exceptions;

public class B3WeavingFailedException extends B3EngineException {
	private static final long serialVersionUID = 1L;

	public B3WeavingFailedException() {
		super("Weaving failed");
	}

	public B3WeavingFailedException(Throwable cause) {
		super("Weaving failed", cause);
	}

}
