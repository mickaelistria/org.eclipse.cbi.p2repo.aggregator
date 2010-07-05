/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.impl;

import java.util.Collection;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.CompoundUnitProvider;
import org.eclipse.b3.build.UnitProvider;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.impl.CompoundUnitProviderImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompoundUnitProviderImpl extends UnitProviderImpl implements CompoundUnitProvider {
	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitProvider> providers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundUnitProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.COMPOUND_UNIT_PROVIDER__PROVIDERS:
				return getProviders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.COMPOUND_UNIT_PROVIDER__PROVIDERS:
				return ((InternalEList<?>) getProviders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.COMPOUND_UNIT_PROVIDER__PROVIDERS:
				return providers != null && !providers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.COMPOUND_UNIT_PROVIDER__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends UnitProvider>) newValue);
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
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.COMPOUND_UNIT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.COMPOUND_UNIT_PROVIDER__PROVIDERS:
				getProviders().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitProvider> getProviders() {
		if(providers == null) {
			providers = new EObjectContainmentEList<UnitProvider>(
				UnitProvider.class, this, B3BuildPackage.COMPOUND_UNIT_PROVIDER__PROVIDERS);
		}
		return providers;
	}

} // ResolutionStrategyImpl
