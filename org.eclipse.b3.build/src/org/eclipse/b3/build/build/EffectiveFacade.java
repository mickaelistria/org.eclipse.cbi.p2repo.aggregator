/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effective Facade</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.EffectiveFacade#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveFacade()
 * @model
 * @generated
 */
public interface EffectiveFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(BExecutionContext)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveFacade_Context()
	 * @model
	 * @generated
	 */
	BExecutionContext getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.EffectiveFacade#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(BExecutionContext value);

} // EffectiveFacade
