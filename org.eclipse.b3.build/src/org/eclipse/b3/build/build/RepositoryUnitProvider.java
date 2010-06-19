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

import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getBuildUnitRepository <em>Build Unit Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryUnitProvider()
 * @model
 * @generated
 */
public interface RepositoryUnitProvider extends UnitProvider {
	/**
	 * Returns the value of the '<em><b>Build Unit Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Unit Repository</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Unit Repository</em>' reference.
	 * @see #setBuildUnitRepository(IBuildUnitRepository)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryUnitProvider_BuildUnitRepository()
	 * @model type="org.eclipse.b3.build.build.IBuildUnitRepository"
	 * @generated
	 */
	IBuildUnitRepository getBuildUnitRepository();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.RepoOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryUnitProvider_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepoOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryUnitProvider_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getBuildUnitRepository <em>Build Unit Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Unit Repository</em>' reference.
	 * @see #getBuildUnitRepository()
	 * @generated
	 */
	void setBuildUnitRepository(IBuildUnitRepository value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryUnitProvider#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // RepositoryReference
