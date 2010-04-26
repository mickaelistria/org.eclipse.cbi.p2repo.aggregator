/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BGuard Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression#getGuardExpr <em>Guard Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBGuardExpression()
 * @model
 * @generated
 */
public interface BGuardExpression extends BGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Guard Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Expr</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Guard Expr</em>' containment reference.
	 * @see #setGuardExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBGuardExpression_GuardExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getGuardExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression#getGuardExpr <em>Guard Expr</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Guard Expr</em>' containment reference.
	 * @see #getGuardExpr()
	 * @generated
	 */
	void setGuardExpr(BExpression value);

} // BGuardExpression
