/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;
import org.eclipse.b3.backend.core.B3EngineException;

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
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluate the function referenced by name in the specified context.
	 * <!-- end-model-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.B3EngineException"
	 *        typesDataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	IFunction loadMethod(String functionName, Type[] types) throws B3EngineException;
} // BSystemContext
