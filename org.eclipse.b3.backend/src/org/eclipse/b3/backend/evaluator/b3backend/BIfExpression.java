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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BIf Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getConditionExpr <em>Condition Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBIfExpression()
 * @model
 * @generated
 */
public interface BIfExpression extends BExpression {
	/**
	 * Returns the value of the '<em><b>Condition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expr</em>' containment reference.
	 * @see #setConditionExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBIfExpression_ConditionExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getConditionExpr();

	/**
	 * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expr</em>' containment reference.
	 * @see #setElseExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBIfExpression_ElseExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getElseExpr();

	/**
	 * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expr</em>' containment reference.
	 * @see #setThenExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBIfExpression_ThenExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getThenExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getConditionExpr <em>Condition Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expr</em>' containment reference.
	 * @see #getConditionExpr()
	 * @generated
	 */
	void setConditionExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getElseExpr <em>Else Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expr</em>' containment reference.
	 * @see #getElseExpr()
	 * @generated
	 */
	void setElseExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BIfExpression#getThenExpr <em>Then Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expr</em>' containment reference.
	 * @see #getThenExpr()
	 * @generated
	 */
	void setThenExpr(BExpression value);

} // BIfExpression
