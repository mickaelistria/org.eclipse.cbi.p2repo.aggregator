/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BeeHive;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bee Hive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BeeHiveImpl#getBeeModels <em>Bee Models</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BeeHiveImpl#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BeeHiveImpl#getResolutions <em>Resolutions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BeeHiveImpl extends EObjectImpl implements BeeHive {
	/**
	 * The cached value of the '{@link #getBeeModels() <em>Bee Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBeeModels()
	 * @generated
	 * @ordered
	 */
	protected EList<BeeModel> beeModels;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected BeeHive parent;

	/**
	 * The cached value of the '{@link #getResolutions() <em>Resolutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolutions()
	 * @generated
	 * @ordered
	 */
	protected Map<RequiredCapability, Capability> resolutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BeeHiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BeeHive basicGetParent() {
		return parent;
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
			case B3BuildPackage.BEE_HIVE__BEE_MODELS:
				return getBeeModels();
			case B3BuildPackage.BEE_HIVE__PARENT:
				if(resolve)
					return getParent();
				return basicGetParent();
			case B3BuildPackage.BEE_HIVE__RESOLUTIONS:
				return getResolutions();
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
			case B3BuildPackage.BEE_HIVE__BEE_MODELS:
				return beeModels != null && !beeModels.isEmpty();
			case B3BuildPackage.BEE_HIVE__PARENT:
				return parent != null;
			case B3BuildPackage.BEE_HIVE__RESOLUTIONS:
				return resolutions != null;
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
			case B3BuildPackage.BEE_HIVE__BEE_MODELS:
				getBeeModels().clear();
				getBeeModels().addAll((Collection<? extends BeeModel>) newValue);
				return;
			case B3BuildPackage.BEE_HIVE__PARENT:
				setParent((BeeHive) newValue);
				return;
			case B3BuildPackage.BEE_HIVE__RESOLUTIONS:
				setResolutions((Map<RequiredCapability, Capability>) newValue);
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
		return B3BuildPackage.Literals.BEE_HIVE;
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
			case B3BuildPackage.BEE_HIVE__BEE_MODELS:
				getBeeModels().clear();
				return;
			case B3BuildPackage.BEE_HIVE__PARENT:
				setParent((BeeHive) null);
				return;
			case B3BuildPackage.BEE_HIVE__RESOLUTIONS:
				setResolutions((Map<RequiredCapability, Capability>) null);
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
	public EList<BeeModel> getBeeModels() {
		if(beeModels == null) {
			beeModels = new EObjectResolvingEList<BeeModel>(BeeModel.class, this, B3BuildPackage.BEE_HIVE__BEE_MODELS);
		}
		return beeModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BeeHive getParent() {
		if(parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (BeeHive) eResolveProxy(oldParent);
			if(parent != oldParent) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3BuildPackage.BEE_HIVE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Map<RequiredCapability, Capability> getResolutions() {
		return resolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IProvidedCapabilityContainer getResolvedCapabilityContainer(RequiredCapability requiredCapability) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParent(BeeHive newParent) {
		BeeHive oldParent = parent;
		parent = newParent;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BEE_HIVE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolutions(Map<RequiredCapability, Capability> newResolutions) {
		Map<RequiredCapability, Capability> oldResolutions = resolutions;
		resolutions = newResolutions;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BEE_HIVE__RESOLUTIONS, oldResolutions, resolutions));
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
		result.append(" (resolutions: ");
		result.append(resolutions);
		result.append(')');
		return result.toString();
	}

} // BeeHiveImpl
