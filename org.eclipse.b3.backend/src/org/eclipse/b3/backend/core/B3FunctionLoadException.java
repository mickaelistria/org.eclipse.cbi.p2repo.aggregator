package org.eclipse.b3.backend.core;

import java.lang.reflect.Method;

public class B3FunctionLoadException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3FunctionLoadException() {
		super("Unspecified function loading exception");
	}
	public B3FunctionLoadException(String message, Class<?> clazz) {
		super(String.format("Can not load methods from '{0}': {1}", clazz, message));

	}

	public B3FunctionLoadException(String message, Method m) {
		super(String.format("Can not load method '{0}': {1}", m, message));

	}
}
