/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.evaluator.BackendHelper;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCallExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.core.runtime.OperationCanceledException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCall Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCallExpressionImpl#getFuncExpr <em>Func Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCallExpressionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCallExpressionImpl extends BParameterizedExpressionImpl implements BCallExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression funcExpr;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getFuncExpr() {
		return funcExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncExpr(BExpression newFuncExpr, NotificationChain msgs) {
		BExpression oldFuncExpr = funcExpr;
		funcExpr = newFuncExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR, oldFuncExpr, newFuncExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncExpr(BExpression newFuncExpr) {
		if (newFuncExpr != funcExpr) {
			NotificationChain msgs = null;
			if (funcExpr != null)
				msgs = ((InternalEObject)funcExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR, null, msgs);
			if (newFuncExpr != null)
				msgs = ((InternalEObject)newFuncExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR, null, msgs);
			msgs = basicSetFuncExpr(newFuncExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR, newFuncExpr, newFuncExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCALL_EXPRESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR:
				return basicSetFuncExpr(null, msgs);
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
			case B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR:
				return getFuncExpr();
			case B3backendPackage.BCALL_EXPRESSION__NAME:
				return getName();
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
			case B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR:
				setFuncExpr((BExpression)newValue);
				return;
			case B3backendPackage.BCALL_EXPRESSION__NAME:
				setName((String)newValue);
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
			case B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR:
				setFuncExpr((BExpression)null);
				return;
			case B3backendPackage.BCALL_EXPRESSION__NAME:
				setName(NAME_EDEFAULT);
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
			case B3backendPackage.BCALL_EXPRESSION__FUNC_EXPR:
				return funcExpr != null;
			case B3backendPackage.BCALL_EXPRESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * Checks for progress monitor cancellation, and if not canceled calls the function.
	 * @throws OperationCanceledException if operation was canceled.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		if(ctx.getProgressMonitor().isCanceled())
			throw new OperationCanceledException();
		Throwable lastError = null;
		try {
			// if call is on the form "x.f(...)" => "f(x,...)"
			if(funcExpr != null && name != null)
				return targetCall(ctx);
			if(funcExpr == null)
				return namedFunctionCall(ctx);

			return expressionCall(ctx);
		} catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		} catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(this, lastError, "Call failed - see details.");
	}
	private Object expressionCall(BExecutionContext ctx) throws Throwable {
		Object target = funcExpr.evaluate(ctx);
		EList<BParameter> pList = getParameterList().getParameters();
		int nbrParams = pList.size();
		Object[] parameters = new Object[nbrParams];
		Type[] tparameters = new Type[nbrParams];
		int counter = 0;
		for(BParameter p : pList) {
			BExpression e = p.getExpr();
			parameters[counter] = e.evaluate(ctx);
			// first parameter always have its actual type (unless it is null)
			tparameters[counter] = counter == 0 && parameters[counter] != null ? safeTypeOf(parameters[counter],e.getDeclaredType(ctx)) : e.getDeclaredType(ctx);
			counter++;
		}
		if(target instanceof Class<?>) {
			if(parameters.length != 1)
				throw B3BackendException.fromMessage(this, "Attempt to cast to {0} using more than one pbject to cast", new Object[]{target});
			try {
				return ((Class<?>) target).cast(parameters[0]);	
			} catch(ClassCastException e) {
				throw B3BackendException.fromMessage(this, e, "Can not perform cast", new Object[] {});
			}
		}
		if(!(target instanceof BFunction))
			throw B3BackendException.fromMessage(this, "Attempt to call non Function - was type : {0}", new Object[]{target.getClass()});

		// if the function comes with a closure, call it in an inner context, else a fresh outer context.
		// TODO: Don't know if this treatment is needed elsewhere as well...
		BExecutionContext useCtx = ((BFunction)target).getClosure();
		useCtx = useCtx == null ? ctx.createOuterContext() : useCtx.createInnerContext();
		return ((BFunction)target).call(useCtx, parameters, tparameters);
	}

	private Object namedFunctionCall(BExecutionContext ctx) throws Throwable {
		// if call is on the form "f(...)" => "f(...)"
		EList<BParameter> pList = getParameterList().getParameters();
		int nbrParams = pList.size();
		Object[] parameters = new Object[nbrParams];
		Type[] tparameters = new Type[nbrParams];
		int counter = 0;
		for(BParameter p : pList) {
			BExpression e = p.getExpr(); 
			parameters[counter] = e.evaluate(ctx);
			// first parameter always have its actual type
			tparameters[counter] = counter == 0 && parameters[counter] != null ? safeTypeOf(parameters[counter],e.getDeclaredType(ctx)) : e.getDeclaredType(ctx);
			counter++;
		}
		return ctx.callFunction(name, parameters, tparameters);
	}

	/**
	 * A target call has a funcExpr that evaluates to the target.
	 * A function of 'name' is then called with the evaluated funcExpr as the first
	 * argument.
	 * 
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	private Object targetCall(BExecutionContext ctx) throws Throwable {
		Object target = funcExpr.evaluate(ctx);
		EList<BParameter> pList = getParameterList().getParameters();
		int nbrParams = pList.size() + 1;
		Object[] parameters = new Object[nbrParams];
		Type[] tparameters = new Type[nbrParams];
		int counter = 0;
		parameters[counter] = target;
		// first parameter always have its actual type
		tparameters[counter++] = safeTypeOf(target,funcExpr.getDeclaredType(ctx)); 
		for(BParameter p : pList) {
			BExpression e = p.getExpr();
			parameters[counter] = e.evaluate(ctx);
			tparameters[counter++] = e.getDeclaredType(ctx);
		}
		return ctx.callFunction(name, parameters, tparameters);
	}
	private Type safeTypeOf(Object x, Type declaredType) {
		if(x == null)
			return declaredType;
		if(x instanceof IFunction)
			return ((IFunction)x).getSignature();
		if(declaredType instanceof B3MetaClass)
			return declaredType;
		return x.getClass();
	}
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// if call is on the form "x.f(...)" => "f(x,...)"

		Throwable lastError = null;
		try {
		if(funcExpr != null && name != null)
			return getDeclaredTypeTargetCall(ctx);
		if(funcExpr == null)
			return getDeclaredTypeNamedCall(ctx);

		return getDeclaredTypeExpressionCall(ctx);	
		} catch(B3NoSuchFunctionSignatureException e) {
			lastError = e;
		} catch(B3NoSuchFunctionException e) {
			lastError = e;
		}
		throw B3BackendException.fromMessage(this, lastError, "Determening return type of Call failed - see details.");

	}
	private Type getDeclaredTypeTargetCall(BExecutionContext ctx) throws Throwable {
		EList<BParameter> pList = getParameterList().getParameters();
		int nbrParams = pList.size() + 1;
		Type[] tparameters = new Type[nbrParams];
		int counter = 0;
		tparameters[counter++] = funcExpr.getDeclaredType(ctx);
		for(BParameter p : pList) {
			tparameters[counter++] = p.getExpr().getDeclaredType(ctx);
		}
		return ctx.getDeclaredFunctionType(name, tparameters);
		
	}
	private Type getDeclaredTypeNamedCall(BExecutionContext ctx) throws Throwable {
		// if call is on the form "f(...)" => "f(...)"
		EList<BParameter> pList = getParameterList().getParameters();
		int nbrParams = pList.size();
		Type[] tparameters = new Type[nbrParams];
		int counter = 0;
		for(BParameter p : pList) {
			tparameters[counter++] = p.getExpr().getDeclaredType(ctx);
		}
		return ctx.getDeclaredFunctionType(name, tparameters);	
	}
	/**
	 * Returns the return type of the function.
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	private Type getDeclaredTypeExpressionCall(BExecutionContext ctx) throws Throwable{
		Type t = funcExpr.getDeclaredType(ctx);
		if(t instanceof B3MetaClass) {
			return ((B3MetaClass)t).getInstanceClass(); // the class this meta class represents (i.e. what it casts to).
		}
		if(!(t instanceof B3FunctionType))
			throw BackendHelper.createException(this, "call on non BFunction - has type : {0}", new Object[]{t});
		return ((B3FunctionType)t).getReturnType();
	}
} //BCallExpressionImpl
