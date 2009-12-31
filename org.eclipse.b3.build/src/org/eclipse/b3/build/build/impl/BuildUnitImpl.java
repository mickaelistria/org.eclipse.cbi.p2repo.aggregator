/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collection;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;

import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.VersionedCapability;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getUnitProvidedCapabilities <em>Unit Provided Capabilities</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuildUnitImpl#getBuilders <em>Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildUnitImpl extends VersionedCapabilityImpl implements BuildUnit {
	/**
	 * The cached value of the '{@link #getUnitProvidedCapabilities() <em>Unit Provided Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitProvidedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected VersionedCapability unitProvidedCapabilities;
	/**
	 * The cached value of the '{@link #getBuilders() <em>Builders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilders()
	 * @generated
	 * @ordered
	 */
	protected EList<Builder> builders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedCapability getUnitProvidedCapabilities() {
		return unitProvidedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitProvidedCapabilities(VersionedCapability newUnitProvidedCapabilities, NotificationChain msgs) {
		VersionedCapability oldUnitProvidedCapabilities = unitProvidedCapabilities;
		unitProvidedCapabilities = newUnitProvidedCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES, oldUnitProvidedCapabilities, newUnitProvidedCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitProvidedCapabilities(VersionedCapability newUnitProvidedCapabilities) {
		if (newUnitProvidedCapabilities != unitProvidedCapabilities) {
			NotificationChain msgs = null;
			if (unitProvidedCapabilities != null)
				msgs = ((InternalEObject)unitProvidedCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES, null, msgs);
			if (newUnitProvidedCapabilities != null)
				msgs = ((InternalEObject)newUnitProvidedCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES, null, msgs);
			msgs = basicSetUnitProvidedCapabilities(newUnitProvidedCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES, newUnitProvidedCapabilities, newUnitProvidedCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Builder> getBuilders() {
		if (builders == null) {
			builders = new EObjectResolvingEList<Builder>(Builder.class, this, B3BuildPackage.BUILD_UNIT__BUILDERS);
		}
		return builders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				return basicSetUnitProvidedCapabilities(null, msgs);
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
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				return getUnitProvidedCapabilities();
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				return getBuilders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				setUnitProvidedCapabilities((VersionedCapability)newValue);
				return;
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				getBuilders().clear();
				getBuilders().addAll((Collection<? extends Builder>)newValue);
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
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				setUnitProvidedCapabilities((VersionedCapability)null);
				return;
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				getBuilders().clear();
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
			case B3BuildPackage.BUILD_UNIT__UNIT_PROVIDED_CAPABILITIES:
				return unitProvidedCapabilities != null;
			case B3BuildPackage.BUILD_UNIT__BUILDERS:
				return builders != null && !builders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuildUnitImpl
