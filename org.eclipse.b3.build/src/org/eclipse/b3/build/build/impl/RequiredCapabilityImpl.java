/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.RequiredCapability;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl#getVersionRange <em>Version Range</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl#isGreedy <em>Greedy</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl#getMax <em>Max</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RequiredCapabilityImpl#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RequiredCapabilityImpl extends CapabilityImpl implements RequiredCapability {
	/**
	 * The default value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersionRange()
	 * @generated
	 * @ordered
	 */
	protected static final VersionRange VERSION_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionRange() <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersionRange()
	 * @generated
	 * @ordered
	 */
	protected VersionRange versionRange = VERSION_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGreedy() <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isGreedy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GREEDY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGreedy() <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isGreedy()
	 * @generated
	 * @ordered
	 */
	protected boolean greedy = GREEDY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RequiredCapabilityImpl() {
		super();
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
			case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
				return getVersionRange();
			case B3BuildPackage.REQUIRED_CAPABILITY__GREEDY:
				return isGreedy();
			case B3BuildPackage.REQUIRED_CAPABILITY__MAX:
				return getMax();
			case B3BuildPackage.REQUIRED_CAPABILITY__MIN:
				return getMin();
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
			case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
				return VERSION_RANGE_EDEFAULT == null
						? versionRange != null
						: !VERSION_RANGE_EDEFAULT.equals(versionRange);
			case B3BuildPackage.REQUIRED_CAPABILITY__GREEDY:
				return greedy != GREEDY_EDEFAULT;
			case B3BuildPackage.REQUIRED_CAPABILITY__MAX:
				return max != MAX_EDEFAULT;
			case B3BuildPackage.REQUIRED_CAPABILITY__MIN:
				return min != MIN_EDEFAULT;
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
			case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
				setVersionRange((VersionRange) newValue);
				return;
			case B3BuildPackage.REQUIRED_CAPABILITY__GREEDY:
				setGreedy((Boolean) newValue);
				return;
			case B3BuildPackage.REQUIRED_CAPABILITY__MAX:
				setMax((Integer) newValue);
				return;
			case B3BuildPackage.REQUIRED_CAPABILITY__MIN:
				setMin((Integer) newValue);
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
			case B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE:
				setVersionRange(VERSION_RANGE_EDEFAULT);
				return;
			case B3BuildPackage.REQUIRED_CAPABILITY__GREEDY:
				setGreedy(GREEDY_EDEFAULT);
				return;
			case B3BuildPackage.REQUIRED_CAPABILITY__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case B3BuildPackage.REQUIRED_CAPABILITY__MIN:
				setMin(MIN_EDEFAULT);
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
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VersionRange getVersionRange() {
		return versionRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isGreedy() {
		return greedy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGreedy(boolean newGreedy) {
		boolean oldGreedy = greedy;
		greedy = newGreedy;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REQUIRED_CAPABILITY__GREEDY, oldGreedy, greedy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.REQUIRED_CAPABILITY__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.REQUIRED_CAPABILITY__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersionRange(VersionRange newVersionRange) {
		VersionRange oldVersionRange = versionRange;
		versionRange = newVersionRange;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REQUIRED_CAPABILITY__VERSION_RANGE, oldVersionRange,
				versionRange));
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
		result.append(" (versionRange: ");
		result.append(versionRange);
		result.append(", greedy: ");
		result.append(greedy);
		result.append(", max: ");
		result.append(max);
		result.append(", min: ");
		result.append(min);
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
		return B3BuildPackage.Literals.REQUIRED_CAPABILITY;
	}

} // RequiredCapabilityImpl
