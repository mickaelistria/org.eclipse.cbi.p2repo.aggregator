/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.Capability#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.eclipse.b3.build.Capability#getCondExpr <em>Cond Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends INamedValue {
	/**
	 * Returns the value of the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Expr</em>' containment reference.
	 * @see #setCondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getCapability_CondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getCondExpr();

	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' attribute.
	 * @see #setNameSpace(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getCapability_NameSpace()
	 * @model
	 * @generated
	 */
	String getNameSpace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean satisfies(RequiredCapability requirement);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Capability#getCondExpr <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Expr</em>' containment reference.
	 * @see #getCondExpr()
	 * @generated
	 */
	void setCondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Capability#getNameSpace <em>Name Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' attribute.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(String value);

} // Capability
