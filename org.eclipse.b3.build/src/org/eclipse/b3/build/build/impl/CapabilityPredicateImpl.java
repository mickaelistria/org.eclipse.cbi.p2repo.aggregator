/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.NamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.CapabilityPredicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.equinox.internal.provisional.p2.core.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.CapabilityPredicateImpl#getNameSpacePattern <em>Name Space Pattern</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.CapabilityPredicateImpl#getVersionRange <em>Version Range</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.CapabilityPredicateImpl#getNamePredicate <em>Name Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.CapabilityPredicateImpl#getNameSpacePredicate <em>Name Space Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class CapabilityPredicateImpl extends BExpressionImpl implements CapabilityPredicate {
	/**
	 * The cached value of the '{@link #getNameSpacePattern() <em>Name Space Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpacePattern()
	 * @generated
	 * @ordered
	 */
	protected BExpression nameSpacePattern;

	/**
	 * The default value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRange()
	 * @generated
	 * @ordered
	 */
	protected static final VersionRange VERSION_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionRange()
	 * @generated
	 * @ordered
	 */
	protected VersionRange versionRange = VERSION_RANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamePredicate() <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePredicate()
	 * @generated
	 * @ordered
	 */
	protected BNamePredicate namePredicate;

	/**
	 * The cached value of the '{@link #getNameSpacePredicate() <em>Name Space Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpacePredicate()
	 * @generated
	 * @ordered
	 */
	protected BNamePredicate nameSpacePredicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.CAPABILITY_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getNameSpacePattern() {
		return nameSpacePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameSpacePattern(BExpression newNameSpacePattern, NotificationChain msgs) {
		BExpression oldNameSpacePattern = nameSpacePattern;
		nameSpacePattern = newNameSpacePattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN, oldNameSpacePattern, newNameSpacePattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpacePattern(BExpression newNameSpacePattern) {
		if (newNameSpacePattern != nameSpacePattern) {
			NotificationChain msgs = null;
			if (nameSpacePattern != null)
				msgs = ((InternalEObject)nameSpacePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN, null, msgs);
			if (newNameSpacePattern != null)
				msgs = ((InternalEObject)newNameSpacePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN, null, msgs);
			msgs = basicSetNameSpacePattern(newNameSpacePattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN, newNameSpacePattern, newNameSpacePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionRange getVersionRange() {
		return versionRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionRange(VersionRange newVersionRange) {
		VersionRange oldVersionRange = versionRange;
		versionRange = newVersionRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE, oldVersionRange, versionRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BNamePredicate getNamePredicate() {
		return namePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamePredicate(BNamePredicate newNamePredicate, NotificationChain msgs) {
		BNamePredicate oldNamePredicate = namePredicate;
		namePredicate = newNamePredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, oldNamePredicate, newNamePredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePredicate(BNamePredicate newNamePredicate) {
		if (newNamePredicate != namePredicate) {
			NotificationChain msgs = null;
			if (namePredicate != null)
				msgs = ((InternalEObject)namePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, null, msgs);
			if (newNamePredicate != null)
				msgs = ((InternalEObject)newNamePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, null, msgs);
			msgs = basicSetNamePredicate(newNamePredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, newNamePredicate, newNamePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BNamePredicate getNameSpacePredicate() {
		return nameSpacePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameSpacePredicate(BNamePredicate newNameSpacePredicate, NotificationChain msgs) {
		BNamePredicate oldNameSpacePredicate = nameSpacePredicate;
		nameSpacePredicate = newNameSpacePredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE, oldNameSpacePredicate, newNameSpacePredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpacePredicate(BNamePredicate newNameSpacePredicate) {
		if (newNameSpacePredicate != nameSpacePredicate) {
			NotificationChain msgs = null;
			if (nameSpacePredicate != null)
				msgs = ((InternalEObject)nameSpacePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE, null, msgs);
			if (newNameSpacePredicate != null)
				msgs = ((InternalEObject)newNameSpacePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE, null, msgs);
			msgs = basicSetNameSpacePredicate(newNameSpacePredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE, newNameSpacePredicate, newNameSpacePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN:
				return basicSetNameSpacePattern(null, msgs);
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE:
				return basicSetNamePredicate(null, msgs);
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE:
				return basicSetNameSpacePredicate(null, msgs);
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
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN:
				return getNameSpacePattern();
			case B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE:
				return getVersionRange();
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE:
				return getNamePredicate();
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE:
				return getNameSpacePredicate();
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
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN:
				setNameSpacePattern((BExpression)newValue);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE:
				setVersionRange((VersionRange)newValue);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate)newValue);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE:
				setNameSpacePredicate((BNamePredicate)newValue);
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
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN:
				setNameSpacePattern((BExpression)null);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE:
				setVersionRange(VERSION_RANGE_EDEFAULT);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate)null);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE:
				setNameSpacePredicate((BNamePredicate)null);
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
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PATTERN:
				return nameSpacePattern != null;
			case B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE:
				return VERSION_RANGE_EDEFAULT == null ? versionRange != null : !VERSION_RANGE_EDEFAULT.equals(versionRange);
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE:
				return namePredicate != null;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE:
				return nameSpacePredicate != null;
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
		result.append(" (versionRange: ");
		result.append(versionRange);
		result.append(')');
		return result.toString();
	}

} //CapabilityPredicateImpl
