package org.eclipse.b3.backend.core;

public class B3ImmutableVariableException extends B3EngineException {
	private static final long serialVersionUID = 1L;

	public B3ImmutableVariableException(String key) {
		super("Attempt to modify the immutable variable: " + key);
	}
}
