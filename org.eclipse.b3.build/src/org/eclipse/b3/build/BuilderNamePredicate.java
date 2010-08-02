/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Name Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuilderNamePredicate#getNamePredicate <em>Name Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderNamePredicate()
 * @model
 * @generated
 */
public interface BuilderNamePredicate extends BExpression {
	/**
	 * Returns the value of the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Predicate</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Predicate</em>' containment reference.
	 * @see #setNamePredicate(BNamePredicate)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderNamePredicate_NamePredicate()
	 * @model containment="true"
	 * @generated
	 */
	BNamePredicate getNamePredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderNamePredicate#getNamePredicate <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Predicate</em>' containment reference.
	 * @see #getNamePredicate()
	 * @generated
	 */
	void setNamePredicate(BNamePredicate value);

} // BuilderNamePredicate
