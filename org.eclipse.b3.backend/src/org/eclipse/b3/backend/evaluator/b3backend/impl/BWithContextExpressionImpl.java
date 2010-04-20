/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3BackendConstants;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BWith Context Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithContextExpressionImpl#getAlias <em>Alias</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithContextExpressionImpl#getExpr <em>Expr</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithContextExpressionImpl#getContextBlock <em>Context Block</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BWithContextExpressionImpl extends BExpressionImpl implements BWithContextExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression expr;

	/**
	 * The cached value of the '{@link #getContextBlock() <em>Context Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContextBlock()
	 * @generated
	 * @ordered
	 */
	protected BExpression contextBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BWithContextExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContextBlock(BExpression newContextBlock, NotificationChain msgs) {
		BExpression oldContextBlock = contextBlock;
		contextBlock = newContextBlock;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK, oldContextBlock,
				newContextBlock);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetExpr(BExpression newExpr, NotificationChain msgs) {
		BExpression oldExpr = expr;
		expr = newExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR, oldExpr, newExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__ALIAS:
				return getAlias();
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR:
				return getExpr();
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK:
				return getContextBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR:
				return basicSetExpr(null, msgs);
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK:
				return basicSetContextBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__ALIAS:
				return ALIAS_EDEFAULT == null
						? alias != null
						: !ALIAS_EDEFAULT.equals(alias);
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR:
				return expr != null;
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK:
				return contextBlock != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__ALIAS:
				setAlias((String) newValue);
				return;
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR:
				setExpr((BExpression) newValue);
				return;
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK:
				setContextBlock((BExpression) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR:
				setExpr((BExpression) null);
				return;
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK:
				setContextBlock((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Evaluates a block of code with an instance as context.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		Object instance = expr.evaluate(ctx);

		// if creator has a contextBlock and alias, these needs to be processed
		BExpression cBlock = getContextBlock();
		if(cBlock != null) {
			// create a context for the object instance
			// BInstanceContext iCtx = B3backendFactory.eINSTANCE.createBInstanceContext();
			// iCtx.setInstance(instance);
			// iCtx.setParentContext(ctx);
			// iCtx.setOuterContext(ctx instanceof BInnerContext
			// ? ((BInnerContext) ctx).getOuterContext()
			// : ctx);
			// create an inner context for the cBlock, and define the "this" and optional alias
			// as immutable values.
			// BExecutionContext iiCtx = iCtx.createInnerContext();
			BExecutionContext iiCtx = ctx.createInnerContext();
			iiCtx.defineValue(B3BackendConstants.B3BACKEND_THIS, instance, instance.getClass());
			if(getAlias() != null && getAlias().length() > 0)
				iiCtx.defineValue(getAlias(), instance, instance.getClass());
			cBlock.evaluate(iiCtx);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getContextBlock() {
		return contextBlock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl#getDeclaredType(org.eclipse.b3.backend.evaluator
	 * .b3backend.BExecutionContext)
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return expr.getDeclaredType(ctx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BWITH_CONTEXT_EXPRESSION__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContextBlock(BExpression newContextBlock) {
		if(newContextBlock != contextBlock) {
			NotificationChain msgs = null;
			if(contextBlock != null)
				msgs = ((InternalEObject) contextBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK, null, msgs);
			if(newContextBlock != null)
				msgs = ((InternalEObject) newContextBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK, null, msgs);
			msgs = basicSetContextBlock(newContextBlock, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BWITH_CONTEXT_EXPRESSION__CONTEXT_BLOCK, newContextBlock,
				newContextBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExpr(BExpression newExpr) {
		if(newExpr != expr) {
			NotificationChain msgs = null;
			if(expr != null)
				msgs = ((InternalEObject) expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR, null, msgs);
			if(newExpr != null)
				msgs = ((InternalEObject) newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BWITH_CONTEXT_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BWITH_CONTEXT_EXPRESSION;
	}
} // BWithContextExpressionImpl
