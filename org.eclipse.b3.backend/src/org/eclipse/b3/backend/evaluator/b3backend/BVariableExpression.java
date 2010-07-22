/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BVariable Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression#getNamedValue <em>Named Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBVariableExpression()
 * @model
 * @generated
 */
public interface BVariableExpression extends BExpression {
	/**
	 * Returns the value of the '<em><b>Named Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Value</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Named Value</em>' reference.
	 * @see #setNamedValue(INamedValue)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBVariableExpression_NamedValue()
	 * @model
	 * @generated
	 */
	INamedValue getNamedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression#getNamedValue <em>Named Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Named Value</em>' reference.
	 * @see #getNamedValue()
	 * @generated
	 */
	void setNamedValue(INamedValue value);

} // BVariableExpression
