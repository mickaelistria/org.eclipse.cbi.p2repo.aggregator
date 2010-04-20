package org.eclipse.b3.backend.core;

public class B3NoSuchFunctionException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3NoSuchFunctionException() {
		this(" unknown");
	}

	public B3NoSuchFunctionException(String functionName) {
		super("Function not found: " + functionName);
	}
}
