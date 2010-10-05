/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.evaluator.B3BackendLValProvider;

import com.google.inject.ImplementedBy;

/**
 * Provider of LValue instance, and information if an element can represent an indexed LValue.
 * (All object can have a feature LValue).
 * 
 */
@ImplementedBy(B3BackendLValProvider.class)
public interface IB3LvalProvider {
	public LValue doCreateLVal(Object element, Object index, Type lvalType);

	public boolean doIsIndexLVal(Object element);

	public boolean doIsIndexLValType(Object element);
}
