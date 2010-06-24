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
package org.eclipse.b3.build;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effective Capability Facade</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.EffectiveCapabilityFacade#getProvidedCapability <em>Provided Capability</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getEffectiveCapabilityFacade()
 * @model
 * @generated
 */
public interface EffectiveCapabilityFacade extends EffectiveFacade {
	/**
	 * Returns the value of the '<em><b>Provided Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Capability</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provided Capability</em>' reference.
	 * @see #setProvidedCapability(Capability)
	 * @see org.eclipse.b3.build.B3BuildPackage#getEffectiveCapabilityFacade_ProvidedCapability()
	 * @model
	 * @generated
	 */
	Capability getProvidedCapability();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.EffectiveCapabilityFacade#getProvidedCapability <em>Provided Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Provided Capability</em>' reference.
	 * @see #getProvidedCapability()
	 * @generated
	 */
	void setProvidedCapability(Capability value);

} // EffectiveCapabilityFacade
