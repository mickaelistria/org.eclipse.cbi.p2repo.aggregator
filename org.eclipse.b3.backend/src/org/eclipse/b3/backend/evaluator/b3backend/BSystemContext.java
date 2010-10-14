/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.exceptions.B3EngineException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSystem Context</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBSystemContext()
 * @model
 * @generated
 */
public interface BSystemContext extends BExecutionContext {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluate the function referenced by name in the specified context. 
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException" typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	IFunction loadMethod(String functionName, Type[] types) throws B3EngineException;
} // BSystemContext
