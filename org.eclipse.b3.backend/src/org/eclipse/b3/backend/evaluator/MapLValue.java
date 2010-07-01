/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Type;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3ImmutableTypeException;
import org.eclipse.b3.backend.core.LValue;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class MapLValue implements LValue {
	Map map;

	Object key;

	Type type;

	public MapLValue(Map map, Object key, Type t) {
		this.map = map;
		this.key = key;
		this.type = t;
	}

	public Object get() throws B3EngineException {
		return map.get(key);
	}

	public Type getDeclaredType() {
		return type;
	}

	public boolean isGetable() throws B3EngineException {
		return true;
	}

	public boolean isSettable() throws B3EngineException {
		return map != null && map.containsKey(key);
	}

	public Object set(Object value) throws B3EngineException {
		map.put(key, value);
		return value;
	}

	public void setDeclaredType(Type t) throws B3EngineException {
		throw new B3ImmutableTypeException(map, type, t);
	}

}
