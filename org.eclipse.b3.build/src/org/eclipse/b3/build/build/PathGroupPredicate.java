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
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Group Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.PathGroupPredicate#getPathVector <em>Path Vector</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.PathGroupPredicate#getPathPattern <em>Path Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getPathGroupPredicate()
 * @model
 * @generated
 */
public interface PathGroupPredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Path Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Vector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Vector</em>' containment reference.
	 * @see #setPathVector(PathVector)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getPathGroupPredicate_PathVector()
	 * @model containment="true"
	 * @generated
	 */
	PathVector getPathVector();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.PathGroupPredicate#getPathVector <em>Path Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Vector</em>' containment reference.
	 * @see #getPathVector()
	 * @generated
	 */
	void setPathVector(PathVector value);

	/**
	 * Returns the value of the '<em><b>Path Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Pattern</em>' containment reference.
	 * @see #setPathPattern(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getPathGroupPredicate_PathPattern()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPathPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.PathGroupPredicate#getPathPattern <em>Path Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Pattern</em>' containment reference.
	 * @see #getPathPattern()
	 * @generated
	 */
	void setPathPattern(BExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes matching prerequisites and returns true if something was removed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean removeMatching(PathGroup input);

} // PathGroupPredicate
