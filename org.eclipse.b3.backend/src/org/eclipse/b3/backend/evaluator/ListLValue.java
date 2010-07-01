/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Type;
import java.util.List;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3ImmutableTypeException;
import org.eclipse.b3.backend.core.LValue;

@SuppressWarnings("rawtypes")
public class ListLValue implements LValue {
	List list;

	int index;

	Type type;

	public ListLValue(List list, int index, Type t) {
		this.list = list;
		this.index = index;
		this.type = t;
	}

	public Object get() throws B3EngineException {
		return list.get(index);
	}

	public Type getDeclaredType() {
		return type;
	}

	public boolean isGetable() throws B3EngineException {
		return true;
	}

	public boolean isSettable() throws B3EngineException {
		return list != null && list.size() > index;
	}

	@SuppressWarnings("unchecked")
	public Object set(Object value) throws B3EngineException {
		list.set(index, value);
		return value;
	}

	public void setDeclaredType(Type t) throws B3EngineException {
		throw new B3ImmutableTypeException(list, type, t);
	}
}
