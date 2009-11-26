/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.evaluator.BackendHelper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BAt Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl#getObjExpr <em>Obj Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BAtExpressionImpl#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BAtExpressionImpl extends BExpressionImpl implements BAtExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "<copyright>Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r</copyright>";

	/**
	 * The cached value of the '{@link #getObjExpr() <em>Obj Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression objExpr;

	/**
	 * The cached value of the '{@link #getIndexExpr() <em>Index Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression indexExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BAtExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BAT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getObjExpr() {
		if (objExpr != null && objExpr.eIsProxy()) {
			InternalEObject oldObjExpr = (InternalEObject)objExpr;
			objExpr = (BExpression)eResolveProxy(oldObjExpr);
			if (objExpr != oldObjExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BAT_EXPRESSION__OBJ_EXPR, oldObjExpr, objExpr));
			}
		}
		return objExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression basicGetObjExpr() {
		return objExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjExpr(BExpression newObjExpr) {
		BExpression oldObjExpr = objExpr;
		objExpr = newObjExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BAT_EXPRESSION__OBJ_EXPR, oldObjExpr, objExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getIndexExpr() {
		if (indexExpr != null && indexExpr.eIsProxy()) {
			InternalEObject oldIndexExpr = (InternalEObject)indexExpr;
			indexExpr = (BExpression)eResolveProxy(oldIndexExpr);
			if (indexExpr != oldIndexExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BAT_EXPRESSION__INDEX_EXPR, oldIndexExpr, indexExpr));
			}
		}
		return indexExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression basicGetIndexExpr() {
		return indexExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexExpr(BExpression newIndexExpr) {
		BExpression oldIndexExpr = indexExpr;
		indexExpr = newIndexExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BAT_EXPRESSION__INDEX_EXPR, oldIndexExpr, indexExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				if (resolve) return getObjExpr();
				return basicGetObjExpr();
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				if (resolve) return getIndexExpr();
				return basicGetIndexExpr();
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
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				setObjExpr((BExpression)newValue);
				return;
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				setIndexExpr((BExpression)newValue);
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
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				setObjExpr((BExpression)null);
				return;
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				setIndexExpr((BExpression)null);
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
			case B3backendPackage.BAT_EXPRESSION__OBJ_EXPR:
				return objExpr != null;
			case B3backendPackage.BAT_EXPRESSION__INDEX_EXPR:
				return indexExpr != null;
		}
		return super.eIsSet(featureID);
	}
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Object o = objExpr.evaluate(ctx);
		Object i = indexExpr.evaluate(ctx);
		if(o instanceof List<?>) {
			int index = BackendHelper.intValue(i, indexExpr);
			return ((List<?>)o).get(index);
		}
		if(o instanceof Map<?, ?>) {
			return ((Map<?,?>)o).get(i);
		}
		throw BackendHelper.createException(objExpr, "expression is neither a list or map - [] not applicable");
	}
	@SuppressWarnings("unchecked")
	@Override
	public LValue getLValue(BExecutionContext ctx) throws Throwable {
		Object o = objExpr.evaluate(ctx);
		Object i = indexExpr.evaluate(ctx);
		if(o instanceof List) {
			int index = BackendHelper.intValue(i, indexExpr);
			return new ListLValue((List)o, index, objExpr.getDeclaredType(ctx));
		}
		if(o instanceof Map) {
			return new MapLValue((Map)o, i, objExpr.getDeclaredType(ctx));
		}
		throw BackendHelper.createException(objExpr, "expression is neither a list or map - [] not applicable");
	}

	@SuppressWarnings("unchecked")
	private static class ListLValue implements LValue {
		List list;
		int index;
		Type type;
		public ListLValue(List list, int index, Type t) {
			this.list = list;
			this.index = index;
			this.type = t;
		}
		public Object get() throws B3EngineException {
			return list.get(index);
		}

		public boolean isSettable() throws B3EngineException {
			return list != null && list.size() > index;
		}

		public Object set(Object value) throws B3EngineException {
			list.set(index, value);
			return value;
		}
		public Type getDeclaredType() {
			return type;
		}
	}
	@SuppressWarnings("unchecked")
	private static class MapLValue implements LValue {
		Map map;
		Object key;
		Type type;
		public MapLValue(Map map, Object key, Type t) {
			this.map = map;
			this.key = key;
			this.type = t;
		}
		public Object get() throws B3EngineException {
			return map.get(key);
		}

		public boolean isSettable() throws B3EngineException {
			return map != null && map.containsKey(key);
		}

		public Object set(Object value) throws B3EngineException {
			map.put(key, value);
			return value;
		}		
		public Type getDeclaredType() {
			return type;
		}
	}
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// TODO: Assumes that lhs is a list or map - if so, the value element type is returned
		// or, if not list, map, or these are raw - then object is returned.
		// This is probably not enough - should probably get <?> type instead if not known
		// to be able to give editor/compiler a hint that specification is missing.
		//
		return TypeUtils.getElementType(objExpr.getDeclaredType(ctx));
	
	}
} //BAtExpressionImpl
