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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B3 Parameterized Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getRawType <em>Raw Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getActualArgumentsList <em>Actual Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3ParameterizedType()
 * @model superTypes="org.eclipse.b3.backend.evaluator.b3backend.IParameterizedType"
 * @generated
 */
public interface B3ParameterizedType extends EObject, ParameterizedType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Owner Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Type</em>' containment reference.
	 * @see #setOwnerType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3ParameterizedType_OwnerType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	Type getOwnerType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getOwnerType <em>Owner Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Type</em>' containment reference.
	 * @see #getOwnerType()
	 * @generated
	 */
	void setOwnerType(Type value);

	/**
	 * Returns the value of the '<em><b>Raw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Type</em>' reference.
	 * @see #setRawType(Type)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3ParameterizedType_RawType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Type getRawType();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType#getRawType <em>Raw Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Type</em>' reference.
	 * @see #getRawType()
	 * @generated
	 */
	void setRawType(Type value);

	/**
	 * Returns the value of the '<em><b>Actual Arguments List</b></em>' reference list.
	 * The list contents are of type {@link java.lang.reflect.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Arguments List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Arguments List</em>' reference list.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3ParameterizedType_ActualArgumentsList()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	EList<Type> getActualArgumentsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type[] getActualTypeArguments();

} // B3ParameterizedType
