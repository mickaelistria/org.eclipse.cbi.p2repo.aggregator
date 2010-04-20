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

import org.eclipse.b3.build.core.IBuildUnitRepository;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Build Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.CompoundBuildUnitRepository#getRepositories <em>Repositories</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getCompoundBuildUnitRepository()
 * @model abstract="true"
 * @generated
 */
public interface CompoundBuildUnitRepository extends BuildUnitRepository {
	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.core.IBuildUnitRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Repositories</em>' reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getCompoundBuildUnitRepository_Repositories()
	 * @model type="org.eclipse.b3.build.build.IBuildUnitRepository"
	 * @generated
	 */
	EList<IBuildUnitRepository> getRepositories();

} // CompoundBuildUnitRepository
