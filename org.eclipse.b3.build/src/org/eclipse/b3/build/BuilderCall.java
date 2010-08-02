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

import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.BuilderCall#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.build.BuilderCall#getBuilderName <em>Builder Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCall()
 * @model abstract="true"
 * @generated
 */
public interface BuilderCall extends BuilderInput {
	/**
	 * Returns the value of the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Name</em>' attribute.
	 * @see #setBuilderName(String)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCall_BuilderName()
	 * @model
	 * @generated
	 */
	String getBuilderName();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(BParameterList)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	BParameterList getParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderCall#getBuilderName <em>Builder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Name</em>' attribute.
	 * @see #getBuilderName()
	 * @generated
	 */
	void setBuilderName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderCall#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(BParameterList value);

} // BuilderCall
