package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;

public interface LValue {
	public Object get() throws B3EngineException;
	public Object set(Object value) throws B3EngineException;
	public boolean isSettable() throws B3EngineException;
	public Type getDeclaredType() throws B3EngineException;
}
