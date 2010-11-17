/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import org.eclipse.emf.ecore.EObject;

/**
 * A provider of a type scheme key.
 */
public interface ITypeSchemeVariableProvider {
	/**
	 * Returns a key for the EObject var to use as key in a type adapter on the given EObject.
	 * 
	 * @param var
	 * @return
	 */
	public Object getVariableKey(EObject var);

}
