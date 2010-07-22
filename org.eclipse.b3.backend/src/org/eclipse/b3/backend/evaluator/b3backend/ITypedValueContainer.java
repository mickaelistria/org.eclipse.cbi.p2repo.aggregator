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
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.LValue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITyped Value Container</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getITypedValueContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITypedValueContainer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean containsValue(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean containsValue(String name, boolean allVisible);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines an immutable value
	 * <!-- end-model-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineFinalValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a variable value (mutable).
	 * <!-- end-model-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineFinalVariableValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines an immutable value
	 * <!-- end-model-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a variable value (mutable).
	 * <!-- end-model-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	Object defineVariableValue(String name, Object value, Type type) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	Type getDeclaredValueType(String name) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.LValue" exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	LValue getLValue(String name) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 * @generated
	 */
	Object getValue(String name) throws B3EngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean isFinal(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean isImmutable(String name);

} // ITypedValueContainer
