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
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.ValueMap;

import org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer;

import org.eclipse.b3.build.core.PathIterator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuildSet#getPathVectors <em>Path Vectors</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildSet#getValueMap <em>Value Map</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildSet#getPathIterator <em>Path Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildSet()
 * @model
 * @generated
 */
public interface BuildSet extends ITypedValueContainer {
	/**
	 * Returns the value of the '<em><b>Path Iterator</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Iterator</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Iterator</em>' attribute.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildSet_PathIterator()
	 * @model default="" unique="false" dataType="org.eclipse.b3.build.build.PathIterator" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PathIterator getPathIterator();

	/**
	 * Returns the value of the '<em><b>Path Vectors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.PathVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Vectors</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Vectors</em>' reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildSet_PathVectors()
	 * @model
	 * @generated
	 */
	EList<PathVector> getPathVectors();

	/**
	 * Returns the value of the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Map</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Map</em>' attribute.
	 * @see #setValueMap(ValueMap)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildSet_ValueMap()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.ValueMap"
	 * @generated
	 */
	ValueMap getValueMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	BuildSet merge(BuildSet buildResult) throws B3EngineException;

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildSet#getValueMap <em>Value Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Map</em>' attribute.
	 * @see #getValueMap()
	 * @generated
	 */
	void setValueMap(ValueMap value);

} // BuildSet
