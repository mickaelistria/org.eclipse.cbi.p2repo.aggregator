/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
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
 * A representation of the model object '<em><b>BLiteral Byte Array Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralByteArrayExpression#getValue <em>Value</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralByteArrayExpression#isBase64 <em>Base64</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBLiteralByteArrayExpression()
 * @model
 * @generated
 */
public interface BLiteralByteArrayExpression extends BExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBLiteralByteArrayExpression_Value()
	 * @model
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Returns the value of the '<em><b>Base64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base64</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Base64</em>' attribute.
	 * @see #setBase64(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBLiteralByteArrayExpression_Base64()
	 * @model
	 * @generated
	 */
	boolean isBase64();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralByteArrayExpression#isBase64 <em>Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Base64</em>' attribute.
	 * @see #isBase64()
	 * @generated
	 */
	void setBase64(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BLiteralByteArrayExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

} // BLiteralByteArrayExpression
