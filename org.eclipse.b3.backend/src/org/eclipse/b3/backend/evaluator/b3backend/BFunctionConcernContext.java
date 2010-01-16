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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFunction Concern Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getNamePredicate <em>Name Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getParameterPredicates <em>Parameter Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionConcernContext()
 * @model
 * @generated
 */
public interface BFunctionConcernContext extends BConcernContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Predicate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Predicate</em>' containment reference.
	 * @see #setNamePredicate(BFunctionNamePredicate)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionConcernContext_NamePredicate()
	 * @model containment="true"
	 * @generated
	 */
	BFunctionNamePredicate getNamePredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext#getNamePredicate <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Predicate</em>' containment reference.
	 * @see #getNamePredicate()
	 * @generated
	 */
	void setNamePredicate(BFunctionNamePredicate value);

	/**
	 * Returns the value of the '<em><b>Parameter Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.ParameterPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Predicates</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBFunctionConcernContext_ParameterPredicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterPredicate> getParameterPredicates();

} // BFunctionConcernContext
