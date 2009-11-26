package org.eclipse.b3.backend.core;

/**
 * Variable has already been defined in the same context.
 */
public class B3VariableRedefinitionException extends B3EngineException {
	private static final long serialVersionUID = 1L;
	public B3VariableRedefinitionException(String key) {
		super("Redefinition of defined variable: "+key);
	}

}
