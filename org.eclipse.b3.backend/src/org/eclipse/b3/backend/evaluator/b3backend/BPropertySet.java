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

import java.net.URI;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BProperty Set</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getExtends <em>Extends</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getOperations <em>Operations</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getPropertiesFile <em>Properties File</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBPropertySet()
 * @model
 * @generated
 */
public interface BPropertySet extends BAdvice {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(BPropertySet)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBPropertySet_Extends()
	 * @model
	 * @generated
	 */
	BPropertySet getExtends();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBPropertySet_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPropertyOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Properties File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties File</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties File</em>' attribute.
	 * @see #setPropertiesFile(URI)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBPropertySet_PropertiesFile()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getPropertiesFile();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(BPropertySet value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#getPropertiesFile <em>Properties File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Properties File</em>' attribute.
	 * @see #getPropertiesFile()
	 * @generated
	 */
	void setPropertiesFile(URI value);

} // BPropertySet
