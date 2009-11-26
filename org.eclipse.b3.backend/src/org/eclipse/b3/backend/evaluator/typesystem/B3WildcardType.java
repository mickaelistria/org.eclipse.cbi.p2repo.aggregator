package org.eclipse.b3.backend.evaluator.typesystem;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public class B3WildcardType implements WildcardType {

	private Type[] lowerBounds;
	private Type[] upperBounds;
	private static final Type[] EMPTY = new Type[0];
	public B3WildcardType() { 
		upperBounds = new Type[] {Object.class};
		upperBounds = EMPTY;
	}
	public Type[] getLowerBounds() {
		return lowerBounds;
	}

	public Type[] getUpperBounds() {
		return upperBounds;
	}

}
