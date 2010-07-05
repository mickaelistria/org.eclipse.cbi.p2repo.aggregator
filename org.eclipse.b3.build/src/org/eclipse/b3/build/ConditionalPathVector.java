/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Path Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.ConditionalPathVector#getCondExpr <em>Cond Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.ConditionalPathVector#getPathVectors <em>Path Vectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getConditionalPathVector()
 * @model
 * @generated
 */
public interface ConditionalPathVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Expr</em>' containment reference.
	 * @see #setCondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getConditionalPathVector_CondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getCondExpr();

	/**
	 * Returns the value of the '<em><b>Path Vectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.PathVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Vectors</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Vectors</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getConditionalPathVector_PathVectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathVector> getPathVectors();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.ConditionalPathVector#getCondExpr <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Expr</em>' containment reference.
	 * @see #getCondExpr()
	 * @generated
	 */
	void setCondExpr(BExpression value);

} // ConditionalPathVector
