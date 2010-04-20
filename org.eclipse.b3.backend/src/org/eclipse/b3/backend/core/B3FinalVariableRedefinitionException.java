package org.eclipse.b3.backend.core;

/**
 * Variable has already been defined as final in an 'outer' context.
 */
public class B3FinalVariableRedefinitionException extends B3EngineException {
	private static final long serialVersionUID = 1L;

	public B3FinalVariableRedefinitionException(String key) {
		super("Redefinition of final variable: " + key);
	}

}
