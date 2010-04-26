/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.core.runtime.CoreException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BExpression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBExpression()
 * @model abstract="true"
 * @generated
 */
public interface BExpression extends EObject {
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
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Object evaluate(BExecutionContext ctx) throws CoreException, Exception, Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Type getDeclaredType(BExecutionContext ctx) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Type getEffectiveType(BExecutionContext ctx) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.Type" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Type getInferredType(BExecutionContext ctx) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.LValue"
	 * @generated
	 */
	LValue getLValue(BExecutionContext ctx) throws Throwable;

} // BExpression
