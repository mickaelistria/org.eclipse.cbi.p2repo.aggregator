package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;

public class B3AmbiguousFunctionSignatureException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3AmbiguousFunctionSignatureException() {
		this(" unknown", new Type[] {});
	}
	public B3AmbiguousFunctionSignatureException(String functionName, Type[] types) {
		super("Function signature is ambiguous: '"+functionName +"', parameter types :" + typestring(types));
	}
	public static String typestring(Type[] types) {
		StringBuffer buffer = new StringBuffer();
		buffer.append('[');
		for(int i = 0; i < types.length; i++) {
			if(i > 0)
				buffer.append(", ");
			buffer.append(types[i].toString());
		}
		return buffer.toString();
	}
}
