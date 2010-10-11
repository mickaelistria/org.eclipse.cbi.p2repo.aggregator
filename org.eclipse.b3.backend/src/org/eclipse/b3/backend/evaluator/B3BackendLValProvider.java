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
import java.util.Map;

import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

/**
 * Provider of LValues for b3 backend.
 * 
 */
public class B3BackendLValProvider extends DeclarativeB3LValProvider {

	public LValue createLVal(List<?> o, Object index, Type lvalType) {
		if(!(index instanceof Number))
			throw new IllegalArgumentException("List requires a Number index, was: " + index.getClass().getName());
		int i = ((Number) index).intValue();
		return new ListLValue(o, i, lvalType);
	}

	public LValue createLVal(Map<?, ?> o, Object index, Type lvalType) {
		return new MapLValue(o, index, lvalType);
	}

	public LValue createLVal(Object o, Object index) {
		return new Pojo.FeatureLValue(o.getClass(), index.toString());
	}

	public boolean isIndexLValue(List<?> o) {
		return true;
	}

	public boolean isIndexLValue(Map<?, ?> o) {
		return true;
	}

	public boolean isIndexLValueType(Type t) {
		Class<?> actual = TypeUtils.getRaw(t);
		if(List.class.isAssignableFrom(actual))
			return true;
		if(Map.class.isAssignableFrom(actual))
			return true;
		return false;
	}
}
