/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BCase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getConditionExpr <em>Condition Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getThenExpr <em>Then Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCase()
 * @model
 * @generated
 */
public interface BCase extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Condition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expr</em>' containment reference.
	 * @see #setConditionExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCase_ConditionExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getConditionExpr();

	/**
	 * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expr</em>' containment reference.
	 * @see #setThenExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBCase_ThenExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getThenExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getConditionExpr <em>Condition Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expr</em>' containment reference.
	 * @see #getConditionExpr()
	 * @generated
	 */
	void setConditionExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getThenExpr <em>Then Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expr</em>' containment reference.
	 * @see #getThenExpr()
	 * @generated
	 */
	void setThenExpr(BExpression value);

} // BCase
