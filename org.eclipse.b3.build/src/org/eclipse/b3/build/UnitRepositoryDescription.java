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
package org.eclipse.b3.build;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Repository Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This BuildUnitRepository is an implementation intended to be used with repositories provided by other engines, testing purposes, and for instantiation of unknown repository types. It can be created by b3, but has no resolution capabilities. Instead it just contains the evaluated data from a Repository + RepoOptions configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.UnitRepositoryDescription#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.b3.build.UnitRepositoryDescription#getEvaluatedOptions <em>Evaluated Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getUnitRepositoryDescription()
 * @model
 * @generated
 */
public interface UnitRepositoryDescription extends BuildUnitRepository {
	/**
	 * Returns the value of the '<em><b>Evaluated Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluated Options</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluated Options</em>' attribute.
	 * @see #setEvaluatedOptions(Map)
	 * @see org.eclipse.b3.build.B3BuildPackage#getUnitRepositoryDescription_EvaluatedOptions()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, Object> getEvaluatedOptions();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see org.eclipse.b3.build.B3BuildPackage#getUnitRepositoryDescription_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.UnitRepositoryDescription#getEvaluatedOptions <em>Evaluated Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluated Options</em>' attribute.
	 * @see #getEvaluatedOptions()
	 * @generated
	 */
	void setEvaluatedOptions(Map<String, Object> value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.UnitRepositoryDescription#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // UnitRepositoryDescription
