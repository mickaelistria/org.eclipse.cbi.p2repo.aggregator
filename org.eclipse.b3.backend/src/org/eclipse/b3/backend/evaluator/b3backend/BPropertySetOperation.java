/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BProperty Set Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation#getPropertySet <em>Property Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBPropertySetOperation()
 * @model
 * @generated
 */
public interface BPropertySetOperation extends BPropertyOperation {
	/**
	 * Returns the value of the '<em><b>Property Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Set</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Set</em>' containment reference.
	 * @see #setPropertySet(BPropertySet)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBPropertySetOperation_PropertySet()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getPropertySet();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation#getPropertySet <em>Property Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Set</em>' containment reference.
	 * @see #getPropertySet()
	 * @generated
	 */
	void setPropertySet(BPropertySet value);

} // BPropertySetOperation
