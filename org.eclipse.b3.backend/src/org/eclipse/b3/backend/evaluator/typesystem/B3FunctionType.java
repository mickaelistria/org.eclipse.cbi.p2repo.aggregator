package org.eclipse.b3.backend.evaluator.typesystem;

import java.lang.reflect.Type;

/**
 * A Type that describes a callable function
 *
 */
public class B3FunctionType implements Type {
	private Type functionType;
	private Type returnType;
	private Type[] parameters;
	private boolean varargs;
	public B3FunctionType(Type functionType, Type returnType, Type[] parameters, boolean varargs) {
		this.functionType = functionType;
		this.returnType = returnType;
		this.parameters = parameters;
		this.varargs = varargs;
	}
	public Type getReturnType() { return returnType; }
	public Type[] getParameters() { return parameters; }
	public boolean isVarargs() { return varargs; }
	public Type getFunctionType() { return functionType; }
	public boolean equals(Object e) {
		if(! (e instanceof B3FunctionType))
			return false;
		B3FunctionType b3t = ((B3FunctionType)e);
		
	if(!(functionType.equals(b3t.functionType)
		&& returnType.equals(b3t.returnType)
		&& parameters.equals(b3t.returnType)
		&& varargs == b3t.varargs
		&& parameters.length == b3t.parameters.length
		))
		return false;
	for(int i = 0; i < parameters.length; i++)
		if(!parameters[i].equals(b3t.parameters[i]))
			return false;
	return true;
	}
}
