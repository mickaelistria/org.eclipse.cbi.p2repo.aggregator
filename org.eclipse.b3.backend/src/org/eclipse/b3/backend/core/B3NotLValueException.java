package org.eclipse.b3.backend.core;

public class B3NotLValueException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3NotLValueException() {
		this(" ");
	}
	public B3NotLValueException(Object o) {
		super("LHS of expression is not assignable: "+o.getClass().toString());
	}
}
