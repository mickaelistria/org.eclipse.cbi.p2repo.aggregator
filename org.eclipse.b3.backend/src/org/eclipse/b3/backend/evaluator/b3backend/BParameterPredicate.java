/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BParameter Predicate</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getTypePredicateOp <em>Type Predicate Op</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBParameterPredicate()
 * @model
 * @generated
 */
public interface BParameterPredicate extends ITypedValue {
	/**
	 * Returns the value of the '<em><b>Type Predicate Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operators are _ (any type), * (zero or more parameters), + (one or more parameters)
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Type Predicate Op</em>' attribute.
	 * @see #setTypePredicateOp(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBParameterPredicate_TypePredicateOp()
	 * @model
	 * @generated
	 */
	String getTypePredicateOp();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate#getTypePredicateOp <em>Type Predicate Op</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type Predicate Op</em>' attribute.
	 * @see #getTypePredicateOp()
	 * @generated
	 */
	void setTypePredicateOp(String value);

} // BParameterPredicate
