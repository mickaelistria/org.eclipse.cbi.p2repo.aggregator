/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;

import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3Type;
import org.eclipse.b3.backend.evaluator.b3backend.impl.B3FunctionTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

import com.google.inject.Singleton;

/**
 * A provider of simple String labels for backend objects as well as some regular java
 * Objects. These string labels are useful in debug output, error messages etc.
 * 
 */
@Singleton
public class B3BackendStringProvider implements IStringProvider {

	private final PolymorphicDispatcher<String> toStringDispatcher = new PolymorphicDispatcher<String>(
		"str", 1, 1, Collections.singletonList(this), new ErrorHandler<String>() {
			public String handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}

			private String handleError(Object[] params, Throwable e) {
				if(params[0] == null)
					return "null";
				return params[0].toString();
			}
		});

	public String doToString(Object o) {
		return toStringDispatcher.invoke(o);
	}

	String str(B3FunctionTypeImpl t) {
		StringBuffer buf = new StringBuffer("f(");
		EList<Type> typeList = t.getParameterTypes();
		int size = typeList.size();
		for(int i = 0; i < size; i++) {
			if(i != 0)
				buf.append(", ");
			buf.append(doToString(typeList.get(i)));
			if(i == size - 1 && t.isVarArgs())
				buf.append("...");
		}
		buf.append(")=>");
		buf.append(t.getReturnType() == null
				? "null"
				: doToString(t.getReturnType()));
		return buf.toString();
	}

	String str(B3ParameterizedType t) {
		StringBuffer buf = new StringBuffer(doToString(t.getRawType()));
		if(t.getActualArgumentsList().size() > 0) {
			buf.append("<");
			boolean first = true;
			for(Type p : t.getActualArgumentsList()) {
				if(!first)
					buf.append(", ");
				buf.append(doToString(p));
				first = false;
			}
			buf.append(">");
		}
		return buf.toString();
	}

	String str(B3Type t) {
		return doToString(t.getRawType());
	}

	String str(Class<?> clazz) {
		return clazz.getSimpleName();
	}

	String str(Object o) {
		return o.toString();
	}

	String str(ParameterizedType t) {
		StringBuffer buf = new StringBuffer(doToString(t.getRawType()));
		if(t.getActualTypeArguments().length > 0) {
			buf.append("<");
			boolean first = true;
			for(Type p : t.getActualTypeArguments()) {
				if(!first)
					buf.append(", ");
				buf.append(doToString(p));
				first = false;
			}
			buf.append(">");
		}
		return buf.toString();

	}

	String str(Throwable t) {
		StringBuffer buf = new StringBuffer();
		buf.append("Exception : " + t.getClass());
		buf.append(", ");
		buf.append(t.getMessage());
		for(t = t.getCause(); t != null; t = t.getCause())
			buf.append("caused by: ").append(str(t));
		return buf.toString();
	}
}
