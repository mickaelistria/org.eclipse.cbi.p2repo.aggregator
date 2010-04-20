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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effective Unit Facade</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getUnit <em>Unit</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getProvidedCapabilities <em>Provided Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getMetaRequiredCapabilities <em>Meta Required Capabilities </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveUnitFacade()
 * @model
 * @generated
 */
public interface EffectiveUnitFacade extends EffectiveFacade {
	/**
	 * Returns the value of the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.EffectiveRequirementFacade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Required Capabilities</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Meta Required Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveUnitFacade_MetaRequiredCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectiveRequirementFacade> getMetaRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.EffectiveCapabilityFacade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Capabilities</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provided Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveUnitFacade_ProvidedCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectiveCapabilityFacade> getProvidedCapabilities();

	/**
	 * Returns the value of the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.EffectiveRequirementFacade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capabilities</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required Capabilities</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveUnitFacade_RequiredCapabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectiveRequirementFacade> getRequiredCapabilities();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(BuildUnit)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveUnitFacade_Unit()
	 * @model
	 * @generated
	 */
	BuildUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.EffectiveUnitFacade#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(BuildUnit value);

} // EffectiveUnitFacade
