/**
 * Copyright (c) 2009-2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BGuard</b></em>'. Supports a BJavaFunction as a type
 * guard used when selecting most specific function (the guard may reject selecting based on the static types).
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BGuard#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBGuard()
 * @model
 * @generated
 */
public interface BGuard extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	boolean accepts(IFunction function, Type[] types) throws Throwable;

	/**
	 * Returns the value of the '<em><b>Func</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Func</em>' reference.
	 * @see #setFunc(BJavaFunction)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBGuard_Func()
	 * @model
	 * @generated
	 */
	BJavaFunction getFunc();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuard#getFunc <em>Func</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Func</em>' reference.
	 * @see #getFunc()
	 * @generated
	 */
	void setFunc(BJavaFunction value);
} // BGuard
