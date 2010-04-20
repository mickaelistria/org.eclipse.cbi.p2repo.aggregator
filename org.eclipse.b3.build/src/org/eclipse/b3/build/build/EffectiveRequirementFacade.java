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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effective Requirement Facade</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.EffectiveRequirementFacade#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveRequirementFacade()
 * @model
 * @generated
 */
public interface EffectiveRequirementFacade extends EffectiveFacade {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(RequiredCapability)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveRequirementFacade_Requirement()
	 * @model
	 * @generated
	 */
	RequiredCapability getRequirement();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.EffectiveRequirementFacade#getRequirement
	 * <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(RequiredCapability value);

} // EffectiveRequirementFacade
