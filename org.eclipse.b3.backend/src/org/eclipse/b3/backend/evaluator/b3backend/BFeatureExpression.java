/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFeature Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getObjExpr <em>Obj Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFeatureExpression()
 * @model
 * @generated
 */
public interface BFeatureExpression extends BExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Obj Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Expr</em>' containment reference.
	 * @see #setObjExpr(BExpression)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFeatureExpression_ObjExpr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BExpression getObjExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getObjExpr <em>Obj Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Expr</em>' containment reference.
	 * @see #getObjExpr()
	 * @generated
	 */
	void setObjExpr(BExpression value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFeatureExpression_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // BFeatureExpression
