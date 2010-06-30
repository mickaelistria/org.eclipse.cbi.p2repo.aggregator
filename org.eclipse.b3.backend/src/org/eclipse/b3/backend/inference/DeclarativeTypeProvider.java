/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * Basic implementation of ITypeProvider.
 * 
 */
public class DeclarativeTypeProvider implements ITypeProvider {
	private final PolymorphicDispatcher<Object> typeDispatcher = new PolymorphicDispatcher<Object>(
		"type", 1, 1, Collections.singletonList(this), new ErrorHandler<Object>() {
			public Object handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	// TODO: ADD RETURN TYPE DISPATCHER

	private List<Object> inferenceStack = new ArrayList<Object>();

	public Type doGetInferredType(Object element) {
		if(inferenceStack.contains(element))
			return null; // inference depends on itself
		try {
			inferenceStack.add(element);
			Type type = (Type) typeDispatcher.invoke(element);
			if(type != null) {
				return type;
			}
			System.err.print("Type provider - null result for: " + element.getClass().getName() + "\n");
			return null;
		}
		finally {
			inferenceStack.remove(element);
		}
	}

	protected Object handleError(Object[] params, Throwable e) {
		// TODO: don't know how this is supposed to work - callers should expect a type at all times,
		// and get a "type can not be inferred exception" with some info about why.
		//
		if(e instanceof NullPointerException) {
			return Object.class;
		}
		return Exceptions.throwUncheckedException(e);
	}

	public Type type(Object o) {
		throw new UnsupportedOperationException("No suitable method for object of class:" + o.getClass());
		// return o.getClass();
	}

}
