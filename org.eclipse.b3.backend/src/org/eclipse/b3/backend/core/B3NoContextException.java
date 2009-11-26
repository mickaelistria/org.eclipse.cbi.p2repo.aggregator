package org.eclipse.b3.backend.core;

public class B3NoContextException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3NoContextException() {
		this(" ");
	}
	public B3NoContextException(String message) {
		super("Context not found: "+message);
	}
}
