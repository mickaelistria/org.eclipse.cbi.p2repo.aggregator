/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.util.Properties;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3ExpressionCache;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext;
import org.eclipse.core.runtime.CoreException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BInvocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInvocationContextImpl#getExpressionCache <em>Expression Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BInvocationContextImpl extends BExecutionContextImpl implements BInvocationContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The default value of the '{@link #getExpressionCache() <em>Expression Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionCache()
	 * @generated
	 * @ordered
	 */
	protected static final B3ExpressionCache EXPRESSION_CACHE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExpressionCache() <em>Expression Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionCache()
	 * @generated
	 * @ordered
	 */
	protected B3ExpressionCache expressionCache = EXPRESSION_CACHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BInvocationContextImpl() {
		super();
		loadSystemProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BINVOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public B3ExpressionCache getExpressionCache() {
		synchronized(this) {
			if(expressionCache == null)
				expressionCache = new B3ExpressionCache();
		}
		return expressionCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionCache(B3ExpressionCache newExpressionCache) {
		B3ExpressionCache oldExpressionCache = expressionCache;
		expressionCache = newExpressionCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BINVOCATION_CONTEXT__EXPRESSION_CACHE, oldExpressionCache, expressionCache));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws CoreException 
	 * @generated NOT
	 */
	public Object evaluateIfNotCached(BExecutionContext ctx, BCachedExpression cachedExpression) throws Throwable {
		synchronized (cachedExpression) {
			if(getExpressionCache().isCached(cachedExpression))
				return getExpressionCache().get(cachedExpression);
			Object value = cachedExpression.getExpr().evaluate(ctx);
			getExpressionCache().put(cachedExpression, value);
			return value;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BINVOCATION_CONTEXT__EXPRESSION_CACHE:
				return getExpressionCache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3backendPackage.BINVOCATION_CONTEXT__EXPRESSION_CACHE:
				setExpressionCache((B3ExpressionCache)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case B3backendPackage.BINVOCATION_CONTEXT__EXPRESSION_CACHE:
				setExpressionCache(EXPRESSION_CACHE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case B3backendPackage.BINVOCATION_CONTEXT__EXPRESSION_CACHE:
				return EXPRESSION_CACHE_EDEFAULT == null ? expressionCache != null : !EXPRESSION_CACHE_EDEFAULT.equals(expressionCache);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expressionCache: ");
		result.append(expressionCache);
		result.append(')');
		return result.toString();
	}
	/**
	 * Loads all system properties into the value map as immutable values (but the values can be overridden
	 * in inner contexts).
	 */
	private void loadSystemProperties() {
		Properties properties = System.getProperties();
		for(Object key : properties.keySet()) {
			try {
				defineValue("$"+((String)key), properties.get(key), String.class);
			} catch (B3EngineException e) {
				e.printStackTrace();
				org.eclipse.b3.provisional.core.Build.getLogger().error(e, "Failed to load system properties into context", new Object[0]);
			}
		}
	}
} //BInvocationContextImpl
