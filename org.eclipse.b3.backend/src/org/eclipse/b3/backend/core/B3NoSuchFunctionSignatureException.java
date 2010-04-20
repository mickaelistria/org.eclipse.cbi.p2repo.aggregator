package org.eclipse.b3.backend.core;

import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

public class B3NoSuchFunctionSignatureException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public static String available(List<IFunction> list) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(" available: ");
		Iterator<IFunction> itor = list.iterator();
		boolean first = true;
		while(itor.hasNext()) {
			if(!first)
				buffer.append(", ");
			typeString(itor.next().getParameterTypes(), buffer);
			first = false;
		}
		if(first)
			buffer.append("none");
		return buffer.toString();
	}

	public static String typeString(Type[] types) {
		StringBuffer buffer = new StringBuffer();
		typeString(types, buffer);
		return buffer.toString();
	}

	public static void typeString(Type[] types, StringBuffer buffer) {
		buffer.append('[');
		for(int i = 0; i < types.length; i++) {
			if(i > 0)
				buffer.append(", ");
			buffer.append("[");
			buffer.append(i);
			buffer.append("]=");
			buffer.append(types[i].toString());
			Class<?> raw = TypeUtils.getRaw(types[i]);
			if(Proxy.isProxyClass(raw)) {
				buffer.append(" implements (");
				Type[] ifaces = raw.getGenericInterfaces();
				typeString(ifaces, buffer);
				buffer.append(")");
			}

		}
		buffer.append(']');
	}

	public B3NoSuchFunctionSignatureException() {
		this(" unknown", new Type[] {});
	}

	public B3NoSuchFunctionSignatureException(String functionName, Type[] types) {
		super("Function with suitable signature not found: '" + functionName + "', for parameters of types :" +
				typeString(types));
	}

	/**
	 * @param name
	 * @param types
	 * @param list
	 */
	public B3NoSuchFunctionSignatureException(String name, Type[] types, List<IFunction> list) {
		super("Function with suitable signature not found: '" + name + "', for parameters of types :" +
				typeString(types) + " " + available(list));
	}
}
