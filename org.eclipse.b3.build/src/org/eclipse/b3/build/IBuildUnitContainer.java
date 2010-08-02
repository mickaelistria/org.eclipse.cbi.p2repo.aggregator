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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBuild Unit Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.IBuildUnitContainer#getBuildUnits <em>Build Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getIBuildUnitContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBuildUnitContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Build Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.BuildUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Units</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Units</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getIBuildUnitContainer_BuildUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuildUnit> getBuildUnits();

} // IBuildUnitContainer
