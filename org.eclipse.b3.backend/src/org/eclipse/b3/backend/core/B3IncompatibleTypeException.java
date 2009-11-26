package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;

import org.eclipse.osgi.util.NLS;

public class B3IncompatibleTypeException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3IncompatibleTypeException(String paramName, Type expected, Type used) {
		super(NLS.bind(Messages.B3IncompatibleTypeException_0, 
				new Object[]{paramName, expected, used}));
	}
	public B3IncompatibleTypeException(Type expected, Type used) {
		super(NLS.bind(Messages.B3IncompatibleTypeException_1, 
				new Object[] {expected, used}));
	}
}
