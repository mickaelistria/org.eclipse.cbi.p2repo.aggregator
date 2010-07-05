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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Call Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuilderCallReference#getRequiredCapability <em>Required Capability</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuilderCallReference#getBuilderCall <em>Builder Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCallReference()
 * @model
 * @generated
 */
public interface BuilderCallReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability</em>' reference.
	 * @see #setRequiredCapability(RequiredCapability)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCallReference_RequiredCapability()
	 * @model
	 * @generated
	 */
	RequiredCapability getRequiredCapability();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderCallReference#getRequiredCapability <em>Required Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability</em>' reference.
	 * @see #getRequiredCapability()
	 * @generated
	 */
	void setRequiredCapability(RequiredCapability value);

	/**
	 * Returns the value of the '<em><b>Builder Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Call</em>' reference.
	 * @see #setBuilderCall(BuilderCall)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCallReference_BuilderCall()
	 * @model
	 * @generated
	 */
	BuilderCall getBuilderCall();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderCallReference#getBuilderCall <em>Builder Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Call</em>' reference.
	 * @see #getBuilderCall()
	 * @generated
	 */
	void setBuilderCall(BuilderCall value);

} // BuilderCallReference
