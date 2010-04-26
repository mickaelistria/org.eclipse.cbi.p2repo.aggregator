/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;
import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BAdvice;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BWith Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl#getReferencedAdvice <em>Referenced Advice</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl#getPropertySets <em>Property Sets</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl#getConcerns <em>Concerns</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BWithExpressionImpl#getFuncExpr <em>Func Expr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BWithExpressionImpl extends BExpressionImpl implements BWithExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getReferencedAdvice() <em>Referenced Advice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferencedAdvice()
	 * @generated
	 * @ordered
	 */
	protected EList<BAdvice> referencedAdvice;

	/**
	 * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPropertySets()
	 * @generated
	 * @ordered
	 */
	protected EList<BPropertySet> propertySets;

	/**
	 * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> concerns;

	/**
	 * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFuncExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression funcExpr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BWithExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFuncExpr(BExpression newFuncExpr, NotificationChain msgs) {
		BExpression oldFuncExpr = funcExpr;
		funcExpr = newFuncExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR, oldFuncExpr, newFuncExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns an inner context with an outer context being the advice context, this outer context is
	 * also visible via the inner context (but not it's parent chain).
	 * TODO: This operation can be removed from the model
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BInnerContext createContext(BExecutionContext ctx) {
		return ctx.createWrappedInnerContext();
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
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				return getReferencedAdvice();
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				return getPropertySets();
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				return getConcerns();
			case B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR:
				return getFuncExpr();
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
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				return ((InternalEList<?>) getPropertySets()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				return ((InternalEList<?>) getConcerns()).basicRemove(otherEnd, msgs);
			case B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR:
				return basicSetFuncExpr(null, msgs);
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
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				return referencedAdvice != null && !referencedAdvice.isEmpty();
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				return propertySets != null && !propertySets.isEmpty();
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				return concerns != null && !concerns.isEmpty();
			case B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR:
				return funcExpr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				getReferencedAdvice().clear();
				getReferencedAdvice().addAll((Collection<? extends BAdvice>) newValue);
				return;
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				getPropertySets().clear();
				getPropertySets().addAll((Collection<? extends BPropertySet>) newValue);
				return;
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				getConcerns().clear();
				getConcerns().addAll((Collection<? extends BConcern>) newValue);
				return;
			case B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR:
				setFuncExpr((BExpression) newValue);
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
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BWITH_EXPRESSION;
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
			case B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE:
				getReferencedAdvice().clear();
				return;
			case B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS:
				getPropertySets().clear();
				return;
			case B3backendPackage.BWITH_EXPRESSION__CONCERNS:
				getConcerns().clear();
				return;
			case B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR:
				setFuncExpr((BExpression) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Evaluates all advice and the funcExpr. If there is no funcExpression, null is returned, and no advice is
	 * evaluated (the resulting context is of no value). If evaluation should take place regardless of funcExpr being
	 * null use {@link #getEvaluationContext(BExecutionContext)} to get the context with advice, and the evaluate
	 * the funcExpr (like this method does).
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		if(funcExpr == null)
			return null;
		return funcExpr.evaluate(getEvaluationContext(ctx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BConcern> getConcerns() {
		if(concerns == null) {
			concerns = new EObjectContainmentEList<BConcern>(
				BConcern.class, this, B3backendPackage.BWITH_EXPRESSION__CONCERNS);
		}
		return concerns;
	}

	/**
	 * Returns the type declared for the funcExpr if funcExpr is non null.
	 * If null, Object.class is returned.
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		// the evaluation of concerns is required as called functions may have been
		// introduced in one such context.
		//
		BInnerContext ictx = createContext(ctx);
		BExecutionContext octx = ictx.getOuterContext();
		// populate all referenced advice
		for(BAdvice a : getReferencedAdvice())
			a.evaluate(octx);
		for(BConcern c : getConcerns())
			c.evaluate(octx);
		// populate properties
		for(BPropertySet ps : getPropertySets())
			ps.evaluate(octx);

		BExpression f = getFuncExpr();
		if(f != null)
			return f.getDeclaredType(ictx);
		return Object.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Evaluates everything in the with clause and returns the context to use for downstream evaluation.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BExecutionContext getEvaluationContext(BExecutionContext ctx) throws Throwable {
		BInnerContext ictx = createContext(ctx);
		BExecutionContext octx = ictx.getOuterContext();
		// populate all referenced advice
		for(BAdvice a : getReferencedAdvice())
			a.evaluate(octx);
		for(BConcern c : getConcerns())
			c.evaluate(octx);
		// populate properties
		for(BPropertySet ps : getPropertySets())
			ps.evaluate(octx);
		return ictx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getFuncExpr() {
		return funcExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BPropertySet> getPropertySets() {
		if(propertySets == null) {
			propertySets = new EObjectContainmentEList<BPropertySet>(
				BPropertySet.class, this, B3backendPackage.BWITH_EXPRESSION__PROPERTY_SETS);
		}
		return propertySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BAdvice> getReferencedAdvice() {
		if(referencedAdvice == null) {
			referencedAdvice = new EObjectResolvingEList<BAdvice>(
				BAdvice.class, this, B3backendPackage.BWITH_EXPRESSION__REFERENCED_ADVICE);
		}
		return referencedAdvice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFuncExpr(BExpression newFuncExpr) {
		if(newFuncExpr != funcExpr) {
			NotificationChain msgs = null;
			if(funcExpr != null)
				msgs = ((InternalEObject) funcExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR, null, msgs);
			if(newFuncExpr != null)
				msgs = ((InternalEObject) newFuncExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR, null, msgs);
			msgs = basicSetFuncExpr(newFuncExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BWITH_EXPRESSION__FUNC_EXPR, newFuncExpr, newFuncExpr));
	}
} // BWithExpressionImpl
