package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;

public class B3NoSuchFunctionSignatureException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3NoSuchFunctionSignatureException() {
		this(" unknown", new Type[] {});
	}
	public B3NoSuchFunctionSignatureException(String functionName, Type[] types) {
		super("Function with suitable signature not found: '"+functionName +"', for types :" + typestring(types));
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
