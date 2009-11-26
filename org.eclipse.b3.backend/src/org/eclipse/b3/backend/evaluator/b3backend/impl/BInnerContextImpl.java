/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BInner Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BInnerContextImpl#getOuterContext <em>Outer Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BInnerContextImpl extends BExecutionContextImpl implements BInnerContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The cached value of the '{@link #getOuterContext() <em>Outer Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterContext()
	 * @generated
	 * @ordered
	 */
	protected BExecutionContext outerContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BInnerContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BINNER_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExecutionContext getOuterContext() {
		if (outerContext != null && outerContext.eIsProxy()) {
			InternalEObject oldOuterContext = (InternalEObject)outerContext;
			outerContext = (BExecutionContext)eResolveProxy(oldOuterContext);
			if (outerContext != oldOuterContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT, oldOuterContext, outerContext));
			}
		}
		return outerContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExecutionContext basicGetOuterContext() {
		return outerContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterContext(BExecutionContext newOuterContext) {
		BExecutionContext oldOuterContext = outerContext;
		outerContext = newOuterContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT, oldOuterContext, outerContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT:
				if (resolve) return getOuterContext();
				return basicGetOuterContext();
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
			case B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT:
				setOuterContext((BExecutionContext)newValue);
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
			case B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT:
				setOuterContext((BExecutionContext)null);
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
			case B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT:
				return outerContext != null;
		}
		return super.eIsSet(featureID);
	}
	@Override
	public BExecutionContext createInnerContext() {
		BInnerContext inner = B3backendFactory.eINSTANCE.createBInnerContext();
		inner.setParentContext(this);
		inner.setOuterContext(getOuterContext());
		return inner;
	}
	@Override
	public BExecutionContext createOuterContext() {
		BContext ctx = B3backendFactory.eINSTANCE.createBContext();
		ctx.setParentContext(getOuterContext());
		return ctx;
	}

} //BInnerContextImpl
