/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.Type;
import java.util.Collections;

import org.eclipse.b3.backend.core.IB3LvalProvider;
import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * Creates LValues for elements
 * 
 */
public class DeclarativeB3LValProvider implements IB3LvalProvider {
	private final PolymorphicDispatcher<LValue> lvalueDispatcher = new PolymorphicDispatcher<LValue>(
		"createLVal", 2, 3, Collections.singletonList(this), new ErrorHandler<LValue>() {
			public LValue handle(Object[] params, Throwable e) {
				return handleLValueError(params, e);
			}
		});

	private final PolymorphicDispatcher<Boolean> isLValueDispatcher = new PolymorphicDispatcher<Boolean>(
		"isIndexLValue", 1, 1, Collections.singletonList(this), new ErrorHandler<Boolean>() {
			public Boolean handle(Object[] params, Throwable e) {
				return handleBooleanError(params, e);
			}
		});

	private final PolymorphicDispatcher<Boolean> isLValueTypeDispatcher = new PolymorphicDispatcher<Boolean>(
		"isIndexLValueType", 1, 1, Collections.singletonList(this), new ErrorHandler<Boolean>() {
			public Boolean handle(Object[] params, Throwable e) {
				return handleBooleanError(params, e);
			}
		});

	public LValue createLValue(Object o, Object index, Type lvalType) {
		throw new UnsupportedOperationException("No indexed lvalue provider found for: " + o.getClass().getName());
	}

	public LValue doCreateLVal(Object element, Object index, Type lvalType) {
		return lvalueDispatcher.invoke(element, index, lvalType);
	}

	public boolean doIsIndexLVal(Object element) {
		return isLValueDispatcher.invoke(element);
	}

	public boolean doIsIndexLValType(Object element) {
		return isLValueTypeDispatcher.invoke(element);
	}

	public boolean isIndexLVal(Object o) {
		return false;
	}

	protected Boolean handleBooleanError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return Boolean.FALSE;
		}
		return Exceptions.throwUncheckedException(e);
	}

	protected LValue handleLValueError(Object[] params, Throwable e) {
		if(e instanceof NullPointerException) {
			return null;
		}
		return Exceptions.throwUncheckedException(e);
	}

}
