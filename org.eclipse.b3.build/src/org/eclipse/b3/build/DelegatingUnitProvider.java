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
 * A representation of the model object '<em><b>Delegating Unit Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DelegatingUnitProvider is useful when setting up a structure of providers as it makes it possible to refer to a unit provider contained in a unit as the delegate is a non containment reference.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.DelegatingUnitProvider#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getDelegatingUnitProvider()
 * @model
 * @generated
 */
public interface DelegatingUnitProvider extends UnitProvider {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(UnitProvider)
	 * @see org.eclipse.b3.build.B3BuildPackage#getDelegatingUnitProvider_Delegate()
	 * @model required="true"
	 * @generated
	 */
	UnitProvider getDelegate();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.DelegatingUnitProvider#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(UnitProvider value);

} // DelegatingUnitProvider
