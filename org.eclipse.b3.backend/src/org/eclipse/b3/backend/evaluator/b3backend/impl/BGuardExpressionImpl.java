/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.backend.core.B3IncompatibleTypeException;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BGuard Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BGuardExpressionImpl#getGuardExpr <em>Guard Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BGuardExpressionImpl extends BGuardImpl implements BGuardExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The cached value of the '{@link #getGuardExpr() <em>Guard Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression guardExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BGuardExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BGUARD_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getGuardExpr() {
		return guardExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardExpr(BExpression newGuardExpr, NotificationChain msgs) {
		BExpression oldGuardExpr = guardExpr;
		guardExpr = newGuardExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, oldGuardExpr, newGuardExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpr(BExpression newGuardExpr) {
		if (newGuardExpr != guardExpr) {
			NotificationChain msgs = null;
			if (guardExpr != null)
				msgs = ((InternalEObject)guardExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, null, msgs);
			if (newGuardExpr != null)
				msgs = ((InternalEObject)newGuardExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, null, msgs);
			msgs = basicSetGuardExpr(newGuardExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR, newGuardExpr, newGuardExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				return basicSetGuardExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				return getGuardExpr();
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				setGuardExpr((BExpression)newValue);
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				setGuardExpr((BExpression)null);
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
			case B3backendPackage.BGUARD_EXPRESSION__GUARD_EXPR:
				return guardExpr != null;
		}
		return super.eIsSet(featureID);
	}
	@SuppressWarnings("unchecked")
//	@Override
	public boolean accepts(BFunction f, BExecutionContext ctx, Object[] parameters, Type[] types) throws Throwable{
		Type[] parameterTypes = f.getParameterTypes();
		String[] parameterNames = f.getParameterNames();
		BExecutionContext octx = ctx.createOuterContext();
		if(parameterTypes != null && parameterTypes.length > 0) { // if function takes no parameters, there is no binding to be done
				int limit = parameterTypes.length -1; // bind all but the last defined parameter
				if(parameters.length < limit)
					throw new IllegalArgumentException("Guard Expression called with too few arguments");
				for(int i = 0; i < limit; i++) {
					// check type compatibility
					if(!parameterTypes[i].getClass().isAssignableFrom(parameters[i].getClass()))
						throw new B3IncompatibleTypeException(parameterNames[i], 
								parameterTypes[i].getClass(), parameters[i].getClass());
					// ok, define it		
					octx.defineVariableValue(parameterNames[i], parameters[i], parameterTypes[i]);
				}
				if(!f.isVarArgs()) { // if not varargs, bind the last defined parameter
					if(parameters.length < parameterTypes.length)
						throw new IllegalArgumentException("B3 Function called with too few arguments. Expected: "+parameters.length +" but got: "+parameterTypes.length);
					// check type compatibility
					if(!TypeUtils.isAssignableFrom(parameterTypes[limit], parameters[limit]))
//					if(!((Class)parameterTypes[limit]).isAssignableFrom(parameters[limit].getClass()))
						throw new B3IncompatibleTypeException(parameterNames[limit], 
								parameterTypes[limit].getClass(), parameters[limit].getClass());
					// ok
					octx.defineVariableValue(parameterNames[limit], parameters[limit], parameterTypes[limit]);
				} else {
					// varargs call, create a list and stuff any remaining parameters there
					List<Object> varargs = new ArrayList<Object>();
					Class varargsType = parameterTypes[limit].getClass();
					for(int i = limit; i < parameters.length; i++) {
						if(!varargsType.isAssignableFrom(parameters[i].getClass()))
							throw new B3IncompatibleTypeException(parameterNames[limit], 
									varargsType, parameters[i].getClass());
						varargs.add(parameters[i]);
						}
					
					// bind the varargs to a List of the declared type (possibly an empty list).
					B3ParameterizedType pt = B3backendFactory.eINSTANCE.createB3ParameterizedType();
					pt.setRawType(List.class);
					pt.getActualArgumentsList().add(parameterTypes[limit]);
					octx.defineVariableValue(parameterNames[limit], varargs, pt);
//							new B3ParameterizedType(List.class, new Type[] { parameterTypes[limit] }));
				}
			}
			// all set up - fire away
			Object result = guardExpr.evaluate(octx);
			if(result instanceof Boolean && ((Boolean)result) == Boolean.TRUE)
				return true;
			return false;
	}
} //BGuardExpressionImpl
