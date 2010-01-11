/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.CapabilityPredicate;
import org.eclipse.b3.build.build.ProvidesPredicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.ProvidesPredicateImpl#getCapabilityPredicate <em>Capability Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidesPredicateImpl extends BExpressionImpl implements ProvidesPredicate {
	/**
	 * The cached value of the '{@link #getCapabilityPredicate() <em>Capability Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityPredicate()
	 * @generated
	 * @ordered
	 */
	protected CapabilityPredicate capabilityPredicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.PROVIDES_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPredicate getCapabilityPredicate() {
		return capabilityPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilityPredicate(CapabilityPredicate newCapabilityPredicate, NotificationChain msgs) {
		CapabilityPredicate oldCapabilityPredicate = capabilityPredicate;
		capabilityPredicate = newCapabilityPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE, oldCapabilityPredicate, newCapabilityPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityPredicate(CapabilityPredicate newCapabilityPredicate) {
		if (newCapabilityPredicate != capabilityPredicate) {
			NotificationChain msgs = null;
			if (capabilityPredicate != null)
				msgs = ((InternalEObject)capabilityPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE, null, msgs);
			if (newCapabilityPredicate != null)
				msgs = ((InternalEObject)newCapabilityPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE, null, msgs);
			msgs = basicSetCapabilityPredicate(newCapabilityPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE, newCapabilityPredicate, newCapabilityPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE:
				return basicSetCapabilityPredicate(null, msgs);
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
			case B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE:
				return getCapabilityPredicate();
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
			case B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE:
				setCapabilityPredicate((CapabilityPredicate)newValue);
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
			case B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE:
				setCapabilityPredicate((CapabilityPredicate)null);
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
			case B3BuildPackage.PROVIDES_PREDICATE__CAPABILITY_PREDICATE:
				return capabilityPredicate != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidesPredicateImpl
