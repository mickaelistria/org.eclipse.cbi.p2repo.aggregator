/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;

import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.VersionedCapability;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.impl.CapabilityPredicateImpl#getVersionRange <em>Version Range</em>}</li>
 *   <li>{@link org.eclipse.b3.build.impl.CapabilityPredicateImpl#getNamePredicate <em>Name Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.build.impl.CapabilityPredicateImpl#getNameSpacePredicate <em>Name Space Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityPredicateImpl extends BExpressionImpl implements CapabilityPredicate {
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

	private boolean basicMatches(Capability candidate) {
		if(nameSpacePredicate != null && !nameSpacePredicate.matches(candidate.getNameSpace()))
			return false;

		if(namePredicate != null && !namePredicate.matches(candidate.getName()))
			return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamePredicate(BNamePredicate newNamePredicate, NotificationChain msgs) {
		BNamePredicate oldNamePredicate = namePredicate;
		namePredicate = newNamePredicate;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, oldNamePredicate,
				newNamePredicate);
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
	 * @generated
	 */
	public NotificationChain basicSetNameSpacePredicate(BNamePredicate newNameSpacePredicate, NotificationChain msgs) {
		BNamePredicate oldNameSpacePredicate = nameSpacePredicate;
		nameSpacePredicate = newNameSpacePredicate;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE,
				oldNameSpacePredicate, newNameSpacePredicate);
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
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
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE:
				return VERSION_RANGE_EDEFAULT == null
						? versionRange != null
						: !VERSION_RANGE_EDEFAULT.equals(versionRange);
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
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE:
				setVersionRange((VersionRange) newValue);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate) newValue);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE:
				setNameSpacePredicate((BNamePredicate) newValue);
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
		return B3BuildPackage.Literals.CAPABILITY_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE:
				setVersionRange(VERSION_RANGE_EDEFAULT);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate) null);
				return;
			case B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE:
				setNameSpacePredicate((BNamePredicate) null);
				return;
		}
		super.eUnset(featureID);
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
	public BNamePredicate getNameSpacePredicate() {
		return nameSpacePredicate;
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
	 * Matches name and namespace against the (optional) predicates for name and namespace.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean matches(Capability candidate) {
		if(candidate instanceof VersionedCapability)
			return matches((VersionedCapability) candidate);
		if(candidate instanceof RequiredCapability)
			return matches((RequiredCapability) candidate);
		return basicMatches(candidate);

	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true, if the candidate matches as an unversioned capability {@link #matches(Capability)}, and
	 * if this predicate has a version range, the candidate must have a version range that intersects.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean matches(RequiredCapability candidate) {
		if(basicMatches(candidate)) {
			if(versionRange == null)
				return true;
			VersionRange vr = candidate.getVersionRange();
			if(vr == null)
				return false;
			return versionRange.intersect(vr) != null;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns true, if the candidate matches as an unversioned capability {@link #matches(Capability)}, and
	 * if this predicate has a version range, the candidate must have a version in this range.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean matches(VersionedCapability candidate) {
		if(basicMatches(candidate)) {
			if(versionRange == null)
				return true;
			Version v = candidate.getVersion();
			if(v == null)
				return false;
			return versionRange.isIncluded(v);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePredicate(BNamePredicate newNamePredicate) {
		if(newNamePredicate != namePredicate) {
			NotificationChain msgs = null;
			if(namePredicate != null)
				msgs = ((InternalEObject) namePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, null, msgs);
			if(newNamePredicate != null)
				msgs = ((InternalEObject) newNamePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, null, msgs);
			msgs = basicSetNamePredicate(newNamePredicate, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_PREDICATE, newNamePredicate,
				newNamePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpacePredicate(BNamePredicate newNameSpacePredicate) {
		if(newNameSpacePredicate != nameSpacePredicate) {
			NotificationChain msgs = null;
			if(nameSpacePredicate != null)
				msgs = ((InternalEObject) nameSpacePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE, null, msgs);
			if(newNameSpacePredicate != null)
				msgs = ((InternalEObject) newNameSpacePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE, null, msgs);
			msgs = basicSetNameSpacePredicate(newNameSpacePredicate, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE,
				newNameSpacePredicate, newNameSpacePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionRange(VersionRange newVersionRange) {
		VersionRange oldVersionRange = versionRange;
		versionRange = newVersionRange;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.CAPABILITY_PREDICATE__VERSION_RANGE, oldVersionRange,
				versionRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (versionRange: ");
		result.append(versionRange);
		result.append(')');
		return result.toString();
	}

} // CapabilityPredicateImpl
