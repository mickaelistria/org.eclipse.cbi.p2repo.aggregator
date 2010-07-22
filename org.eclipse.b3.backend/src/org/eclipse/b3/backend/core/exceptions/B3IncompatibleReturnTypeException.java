package org.eclipse.b3.backend.core.exceptions;

import java.lang.reflect.Type;

public class B3IncompatibleReturnTypeException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3IncompatibleReturnTypeException(Type original, Type overloaded) {
		super(String.format("Can not overload return type {0} with {1}", original, overloaded));
	}
}
