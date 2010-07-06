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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Call On Referenced Requirement</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.BuildCallOnReferencedRequirement#getRequiredCapabilityReference <em>Required Capability Reference</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getBuildCallOnReferencedRequirement()
 * @model
 * @generated
 */
public interface BuildCallOnReferencedRequirement extends BuildCallSingle {
	/**
	 * Returns the value of the '<em><b>Required Capability Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability Reference</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required Capability Reference</em>' reference.
	 * @see #setRequiredCapabilityReference(RequiredCapability)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildCallOnReferencedRequirement_RequiredCapabilityReference()
	 * @model
	 * @generated
	 */
	RequiredCapability getRequiredCapabilityReference();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildCallOnReferencedRequirement#getRequiredCapabilityReference
	 * <em>Required Capability Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Required Capability Reference</em>' reference.
	 * @see #getRequiredCapabilityReference()
	 * @generated
	 */
	void setRequiredCapabilityReference(RequiredCapability value);

} // BuildCallOnReferencedRequirement
