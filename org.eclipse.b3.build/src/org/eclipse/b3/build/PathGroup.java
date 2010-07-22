/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Group</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.PathGroup#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.eclipse.b3.build.PathGroup#getPathVectors <em>Path Vectors</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getPathGroup()
 * @model
 * @generated
 */
public interface PathGroup extends EObject {

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(BPropertySet)
	 * @see org.eclipse.b3.build.B3BuildPackage#getPathGroup_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getAnnotations();

	/**
	 * Returns the value of the '<em><b>Path Vectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.ConditionalPathVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Vectors</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Path Vectors</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getPathGroup_PathVectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalPathVector> getPathVectors();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.PathGroup#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(BPropertySet value);
} // PathGroup
