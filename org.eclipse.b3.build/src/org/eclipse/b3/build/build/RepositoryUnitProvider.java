/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
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
 * A representation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getRepositoryPathExpression <em>Repository Path Expression</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryUnitProvider()
 * @model
 * @generated
 */
public interface RepositoryUnitProvider extends UnitProvider {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(RepositoryHandler)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryUnitProvider_Repository()
	 * @model
	 * @generated
	 */
	RepositoryHandler getRepository();

	/**
	 * Returns the value of the '<em><b>Repository Path Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Path Expression</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Repository Path Expression</em>' containment reference.
	 * @see #setRepositoryPathExpression(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryUnitProvider_RepositoryPathExpression()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getRepositoryPathExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(RepositoryHandler value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getRepositoryPathExpression
	 * <em>Repository Path Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Repository Path Expression</em>' containment reference.
	 * @see #getRepositoryPathExpression()
	 * @generated
	 */
	void setRepositoryPathExpression(BExpression value);

} // RepositoryReference
