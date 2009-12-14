package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;

import org.eclipse.osgi.util.NLS;

public class B3ImmutableTypeException extends B3EngineException {

	private static final long serialVersionUID = 1L;
	public B3ImmutableTypeException(Object root, Type current, Type set) {
		super(NLS.bind("Attempt to set type {2} on a {0} with declared type {1}", 
				new Object[]{root.getClass(), current, set}));
	}
}
