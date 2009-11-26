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
 * A representation of the model object '<em><b>BFinally</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFinally#getFinallyExpr <em>Finally Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFinally()
 * @model
 * @generated
 */
public interface BFinally extends EObject {
	/**
	 * Returns the value of the '<em><b>Finally Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finally Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally Expr</em>' containment reference.
	 * @see #setFinallyExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFinally_FinallyExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getFinallyExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFinally#getFinallyExpr <em>Finally Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally Expr</em>' containment reference.
	 * @see #getFinallyExpr()
	 * @generated
	 */
	void setFinallyExpr(BExpression value);

} // BFinally
