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
 * A representation of the model object '<em><b>Builder Call Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuilderCallFacade#getBuilderReference <em>Builder Reference</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuilderCallFacade#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuilderCallFacade#getRequiredCapability <em>Required Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCallFacade()
 * @model
 * @generated
 */
public interface BuilderCallFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aliases</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' attribute list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCallFacade_Aliases()
	 * @model
	 * @generated
	 */
	EList<String> getAliases();

	/**
	 * Returns the value of the '<em><b>Builder Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Reference</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Reference</em>' reference.
	 * @see #setBuilderReference(BuilderCall)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCallFacade_BuilderReference()
	 * @model
	 * @generated
	 */
	BuilderCall getBuilderReference();

	/**
	 * Returns the value of the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability</em>' reference.
	 * @see #setRequiredCapability(RequiredCapability)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCallFacade_RequiredCapability()
	 * @model
	 * @generated
	 */
	RequiredCapability getRequiredCapability();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderCallFacade#getBuilderReference <em>Builder Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Reference</em>' reference.
	 * @see #getBuilderReference()
	 * @generated
	 */
	void setBuilderReference(BuilderCall value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderCallFacade#getRequiredCapability <em>Required Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability</em>' reference.
	 * @see #getRequiredCapability()
	 * @generated
	 */
	void setRequiredCapability(RequiredCapability value);

} // BuilderCallFacade
