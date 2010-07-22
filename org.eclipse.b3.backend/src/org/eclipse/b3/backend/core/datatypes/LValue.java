package org.eclipse.b3.backend.core.datatypes;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.exceptions.B3EngineException;

public interface LValue {
	public Object get() throws B3EngineException;

	public Type getDeclaredType() throws B3EngineException;

	public boolean isGetable() throws B3EngineException;

	public boolean isSettable() throws B3EngineException;

	public Object set(Object value) throws B3EngineException;

	public void setDeclaredType(Type t) throws B3EngineException;
}
