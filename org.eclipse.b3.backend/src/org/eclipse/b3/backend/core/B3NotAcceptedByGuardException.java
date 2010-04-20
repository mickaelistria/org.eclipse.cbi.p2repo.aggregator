package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;

public class B3NotAcceptedByGuardException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public static String typestring(Type[] types) {
		StringBuilder buffer = new StringBuilder();
		buffer.append('[');
		for(int i = 0; i < types.length; i++) {
			if(i > 0)
				buffer.append(", ");
			buffer.append(types[i].toString());
		}
		buffer.append(']');
		return buffer.toString();
	}

	public B3NotAcceptedByGuardException() {
		this("unknown", new Type[] {});
	}

	public B3NotAcceptedByGuardException(String functionName, Type[] types) {
		super("Available function(s) with suitable signature rejected by guard. Function: '" + functionName +
				"', for types: " + typestring(types));
	}
}
