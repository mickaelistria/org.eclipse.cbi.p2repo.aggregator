/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;

/**
 * Interface for type inference provider.
 * 
 */
public interface ITypeProvider {
	/**
	 * Returns the declared type, or if not defined, the inferred type.
	 * 
	 * @param element
	 * @return
	 */
	public Type doGetInferredType(Object element);

	/**
	 * Returns an ITypeInfo with the result of {@link #doGetInferredType(Object)} and additional information.
	 * (if the element represents an LValue, and if this LValue is settable.
	 * 
	 * @param element
	 * @return
	 */
	public ITypeInfo doGetTypeInfo(Object element);

	public Object doGetVarScope(Object element);
}
