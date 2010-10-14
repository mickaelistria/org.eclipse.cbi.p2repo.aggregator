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
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCall Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCallFeature#isCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCallFeature()
 * @model
 * @generated
 */
public interface BCallFeature extends BCallExpression {

	/**
	 * Returns the value of the '<em><b>Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if this is a call like a.foo(), or a feature LVal like a.foo
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call</em>' attribute.
	 * @see #setCall(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCallFeature_Call()
	 * @model
	 * @generated
	 */
	boolean isCall();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCallFeature#isCall <em>Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' attribute.
	 * @see #isCall()
	 * @generated
	 */
	void setCall(boolean value);

} // BCallFeature
