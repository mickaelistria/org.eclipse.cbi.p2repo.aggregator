package org.eclipse.b3.backend.evaluator.typesystem;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class B3ParameterizedType implements ParameterizedType {

	private Type ownerType;
	private Type rawType;
	private Type[] actualTypeArguments;

	public B3ParameterizedType(Type rawType, Type[] actualTypeArguments) {
		this(rawType, actualTypeArguments, null);
	}
	public B3ParameterizedType(Type rawType, Type[] actualTypeArguments, Type ownerType) {
		this.ownerType = ownerType;
		this.rawType = rawType;
		this.actualTypeArguments = actualTypeArguments;
	}
	public Type[] getActualTypeArguments() {
		return actualTypeArguments;
	}

	public Type getOwnerType() {
		return ownerType;
	}

	public Type getRawType() {
		return rawType;
	}

}
