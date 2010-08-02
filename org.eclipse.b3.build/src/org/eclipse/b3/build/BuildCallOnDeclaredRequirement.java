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
 * A representation of the model object '<em><b>Build Call On Declared Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuildCallOnDeclaredRequirement#getRequiredCapabilityDeclaration <em>Required Capability Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuildCallOnDeclaredRequirement()
 * @model
 * @generated
 */
public interface BuildCallOnDeclaredRequirement extends BuildCallSingle {
	/**
	 * Returns the value of the '<em><b>Required Capability Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability Declaration</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability Declaration</em>' containment reference.
	 * @see #setRequiredCapabilityDeclaration(RequiredCapability)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildCallOnDeclaredRequirement_RequiredCapabilityDeclaration()
	 * @model containment="true"
	 * @generated
	 */
	RequiredCapability getRequiredCapabilityDeclaration();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuildCallOnDeclaredRequirement#getRequiredCapabilityDeclaration <em>Required Capability Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability Declaration</em>' containment reference.
	 * @see #getRequiredCapabilityDeclaration()
	 * @generated
	 */
	void setRequiredCapabilityDeclaration(RequiredCapability value);

} // BuildCallOnDeclaredRequirement
