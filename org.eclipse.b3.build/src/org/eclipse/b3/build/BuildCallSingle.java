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
 * A representation of the model object '<em><b>Build Call Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuildCallSingle#getRequiredCapability <em>Required Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuildCallSingle()
 * @model abstract="true"
 * @generated
 */
public interface BuildCallSingle extends BuilderCall {
	/**
	 * Returns the value of the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability</em>' reference.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuildCallSingle_RequiredCapability()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	RequiredCapability getRequiredCapability();

} // BuildCallSingle
