package org.eclipse.b3.backend.core;

public class B3NoSuchVariableException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3NoSuchVariableException(String key) {
		super("Variable not defined: " + key);
	}
}
