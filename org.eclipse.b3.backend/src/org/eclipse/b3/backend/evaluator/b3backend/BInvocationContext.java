/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import org.eclipse.b3.backend.core.B3ExpressionCache;
import org.eclipse.core.runtime.CoreException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BInvocation Context</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext#getExpressionCache <em>Expression Cache
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBInvocationContext()
 * @model
 * @generated
 */
public interface BInvocationContext extends BExecutionContext {
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
	Object evaluateIfNotCached(BExecutionContext ctx, BCachedExpression cachedExpression) throws CoreException,
			Throwable;

	/**
	 * Returns the value of the '<em><b>Expression Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Cache</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expression Cache</em>' attribute.
	 * @see #setExpressionCache(B3ExpressionCache)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getBInvocationContext_ExpressionCache()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.B3ExpressionCache" transient="true"
	 * @generated
	 */
	B3ExpressionCache getExpressionCache();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext#getExpressionCache
	 * <em>Expression Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expression Cache</em>' attribute.
	 * @see #getExpressionCache()
	 * @generated
	 */
	void setExpressionCache(B3ExpressionCache value);

} // BInvocationContext
