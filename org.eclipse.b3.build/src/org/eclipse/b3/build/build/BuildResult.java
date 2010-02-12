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
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.core.ValueMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuildResult#getPathVectors <em>Path Vectors</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildResult#getValueMap <em>Value Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildResult()
 * @model
 * @generated
 */
public interface BuildResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Path Vectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Vectors</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Vectors</em>' reference.
	 * @see #setPathVectors(PathVector)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildResult_PathVectors()
	 * @model
	 * @generated
	 */
	PathVector getPathVectors();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildResult#getPathVectors <em>Path Vectors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Vectors</em>' reference.
	 * @see #getPathVectors()
	 * @generated
	 */
	void setPathVectors(PathVector value);

	/**
	 * Returns the value of the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Map</em>' attribute.
	 * @see #setValueMap(ValueMap)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildResult_ValueMap()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.ValueMap"
	 * @generated
	 */
	ValueMap getValueMap();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildResult#getValueMap <em>Value Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Map</em>' attribute.
	 * @see #getValueMap()
	 * @generated
	 */
	void setValueMap(ValueMap value);

} // BuildResult
