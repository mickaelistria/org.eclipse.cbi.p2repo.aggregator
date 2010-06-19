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
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.DelegatingUnitProvider;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.UnitProvider;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegating Unit Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.DelegatingUnitProviderImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DelegatingUnitProviderImpl extends UnitProviderImpl implements DelegatingUnitProvider {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected UnitProvider delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DelegatingUnitProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnitProvider basicGetDelegate() {
		return delegate;
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
			case B3BuildPackage.DELEGATING_UNIT_PROVIDER__DELEGATE:
				if(resolve)
					return getDelegate();
				return basicGetDelegate();
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
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.DELEGATING_UNIT_PROVIDER__DELEGATE:
				return delegate != null;
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
			case B3BuildPackage.DELEGATING_UNIT_PROVIDER__DELEGATE:
				setDelegate((UnitProvider) newValue);
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
		return B3BuildPackage.Literals.DELEGATING_UNIT_PROVIDER;
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
			case B3BuildPackage.DELEGATING_UNIT_PROVIDER__DELEGATE:
				setDelegate((UnitProvider) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnitProvider getDelegate() {
		if(delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject) delegate;
			delegate = (UnitProvider) eResolveProxy(oldDelegate);
			if(delegate != oldDelegate) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.DELEGATING_UNIT_PROVIDER__DELEGATE, oldDelegate,
						delegate));
			}
		}
		return delegate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.build.impl.UnitProviderImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 * org.eclipse.b3.build.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
		return getDelegate().resolve(ctx, requiredCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDelegate(UnitProvider newDelegate) {
		UnitProvider oldDelegate = delegate;
		delegate = newDelegate;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.DELEGATING_UNIT_PROVIDER__DELEGATE, oldDelegate, delegate));
	}

} // DelegatingUnitProviderImpl
