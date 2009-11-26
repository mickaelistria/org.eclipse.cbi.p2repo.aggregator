package org.eclipse.b3.backend.core;

public class B3NotBooleanException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3NotBooleanException() {
		this(" ");
	}
	public B3NotBooleanException(Object o) {
		super("Object is not boolean: "+o.getClass().toString());
	}
}
