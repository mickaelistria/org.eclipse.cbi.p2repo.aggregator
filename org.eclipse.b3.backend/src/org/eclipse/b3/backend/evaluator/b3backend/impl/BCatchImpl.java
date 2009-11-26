/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCatch;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BCatch</b></em>'.
 * The BTryExpression makes use of the BCatch's type and variable name and will evaluate the
 * BCatch that matches a caught exception. (i.e. there is no exception handling in this class).
 *
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl#getCatchExpr <em>Catch Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl#getVarname <em>Varname</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BCatchImpl#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BCatchImpl extends EObjectImpl implements BCatch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "<copyright>Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r</copyright>";

	/**
	 * The cached value of the '{@link #getCatchExpr() <em>Catch Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression catchExpr;

	/**
	 * The default value of the '{@link #getVarname() <em>Varname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarname()
	 * @generated
	 * @ordered
	 */
	protected static final String VARNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarname() <em>Varname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarname()
	 * @generated
	 * @ordered
	 */
	protected String varname = VARNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionType() <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected static final Type EXCEPTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected Type exceptionType = EXCEPTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getCatchExpr() {
		return catchExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchExpr(BExpression newCatchExpr, NotificationChain msgs) {
		BExpression oldCatchExpr = catchExpr;
		catchExpr = newCatchExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3backendPackage.BCATCH__CATCH_EXPR, oldCatchExpr, newCatchExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchExpr(BExpression newCatchExpr) {
		if (newCatchExpr != catchExpr) {
			NotificationChain msgs = null;
			if (catchExpr != null)
				msgs = ((InternalEObject)catchExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCATCH__CATCH_EXPR, null, msgs);
			if (newCatchExpr != null)
				msgs = ((InternalEObject)newCatchExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3backendPackage.BCATCH__CATCH_EXPR, null, msgs);
			msgs = basicSetCatchExpr(newCatchExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCATCH__CATCH_EXPR, newCatchExpr, newCatchExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getExceptionType() {
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType(Type newExceptionType) {
		Type oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCATCH__EXCEPTION_TYPE, oldExceptionType, exceptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarname() {
		return varname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarname(String newVarname) {
		String oldVarname = varname;
		varname = newVarname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BCATCH__VARNAME, oldVarname, varname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		return this.getCatchExpr().evaluate(ctx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return this.getCatchExpr().getDeclaredType(ctx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3backendPackage.BCATCH__CATCH_EXPR:
				return basicSetCatchExpr(null, msgs);
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
			case B3backendPackage.BCATCH__CATCH_EXPR:
				return getCatchExpr();
			case B3backendPackage.BCATCH__VARNAME:
				return getVarname();
			case B3backendPackage.BCATCH__EXCEPTION_TYPE:
				return getExceptionType();
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
			case B3backendPackage.BCATCH__CATCH_EXPR:
				setCatchExpr((BExpression)newValue);
				return;
			case B3backendPackage.BCATCH__VARNAME:
				setVarname((String)newValue);
				return;
			case B3backendPackage.BCATCH__EXCEPTION_TYPE:
				setExceptionType((Type)newValue);
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
			case B3backendPackage.BCATCH__CATCH_EXPR:
				setCatchExpr((BExpression)null);
				return;
			case B3backendPackage.BCATCH__VARNAME:
				setVarname(VARNAME_EDEFAULT);
				return;
			case B3backendPackage.BCATCH__EXCEPTION_TYPE:
				setExceptionType(EXCEPTION_TYPE_EDEFAULT);
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
			case B3backendPackage.BCATCH__CATCH_EXPR:
				return catchExpr != null;
			case B3backendPackage.BCATCH__VARNAME:
				return VARNAME_EDEFAULT == null ? varname != null : !VARNAME_EDEFAULT.equals(varname);
			case B3backendPackage.BCATCH__EXCEPTION_TYPE:
				return EXCEPTION_TYPE_EDEFAULT == null ? exceptionType != null : !EXCEPTION_TYPE_EDEFAULT.equals(exceptionType);
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
		result.append(" (varname: ");
		result.append(varname);
		result.append(", exceptionType: ");
		result.append(exceptionType);
		result.append(')');
		return result.toString();
	}

} //BCatchImpl
