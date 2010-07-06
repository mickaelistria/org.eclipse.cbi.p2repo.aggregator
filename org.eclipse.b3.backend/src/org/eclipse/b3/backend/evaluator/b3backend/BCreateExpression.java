/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCreate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getTypeExpr <em>Type Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getContextBlock <em>Context Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCreateExpression()
 * @model
 * @generated
 */
public interface BCreateExpression extends BParameterizedExpression, ITypedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Context Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Block</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Block</em>' containment reference.
	 * @see #setContextBlock(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCreateExpression_ContextBlock()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getContextBlock();

	/**
	 * Returns the value of the '<em><b>Type Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Expr</em>' containment reference.
	 * @see #setTypeExpr(BLiteralType)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCreateExpression_TypeExpr()
	 * @model containment="true"
	 * @generated
	 */
	BLiteralType getTypeExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getContextBlock <em>Context Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Block</em>' containment reference.
	 * @see #getContextBlock()
	 * @generated
	 */
	void setContextBlock(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression#getTypeExpr <em>Type Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Expr</em>' containment reference.
	 * @see #getTypeExpr()
	 * @generated
	 */
	void setTypeExpr(BLiteralType value);

} // BCreateExpression
