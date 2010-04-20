/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTry Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getTryExpr <em>Try Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getCatchBlocks <em>Catch Blocks</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getFinallyExpr <em>Finally Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBTryExpression()
 * @model
 * @generated
 */
public interface BTryExpression extends BExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BCatch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Blocks</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Catch Blocks</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBTryExpression_CatchBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<BCatch> getCatchBlocks();

	/**
	 * Returns the value of the '<em><b>Finally Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finally Expr</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Finally Expr</em>' containment reference.
	 * @see #setFinallyExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBTryExpression_FinallyExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getFinallyExpr();

	/**
	 * Returns the value of the '<em><b>Try Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try Expr</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Try Expr</em>' containment reference.
	 * @see #setTryExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBTryExpression_TryExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getTryExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getFinallyExpr
	 * <em>Finally Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Finally Expr</em>' containment reference.
	 * @see #getFinallyExpr()
	 * @generated
	 */
	void setFinallyExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BTryExpression#getTryExpr
	 * <em>Try Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Try Expr</em>' containment reference.
	 * @see #getTryExpr()
	 * @generated
	 */
	void setTryExpr(BExpression value);

} // BTryExpression
