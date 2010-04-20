/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.CapabilityPredicate;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.RequiresPredicate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.RequiresPredicateImpl#getCapabilityPredicate <em>Capability Predicate </em>}</li>
 * <li>{@link org.eclipse.b3.build.build.impl.RequiresPredicateImpl#isMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RequiresPredicateImpl extends BExpressionImpl implements RequiresPredicate {
	/**
	 * The cached value of the '{@link #getCapabilityPredicate() <em>Capability Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCapabilityPredicate()
	 * @generated
	 * @ordered
	 */
	protected CapabilityPredicate capabilityPredicate;

	/**
	 * The default value of the '{@link #isMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isMeta()
	 * @generated
	 * @ordered
	 */
	protected static final boolean META_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isMeta()
	 * @generated
	 * @ordered
	 */
	protected boolean meta = META_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RequiresPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCapabilityPredicate(CapabilityPredicate newCapabilityPredicate,
			NotificationChain msgs) {
		CapabilityPredicate oldCapabilityPredicate = capabilityPredicate;
		capabilityPredicate = newCapabilityPredicate;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE,
				oldCapabilityPredicate, newCapabilityPredicate);
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
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE:
				return getCapabilityPredicate();
			case B3BuildPackage.REQUIRES_PREDICATE__META:
				return isMeta();
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
			case B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE:
				return basicSetCapabilityPredicate(null, msgs);
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
			case B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE:
				return capabilityPredicate != null;
			case B3BuildPackage.REQUIRES_PREDICATE__META:
				return meta != META_EDEFAULT;
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
			case B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE:
				setCapabilityPredicate((CapabilityPredicate) newValue);
				return;
			case B3BuildPackage.REQUIRES_PREDICATE__META:
				setMeta((Boolean) newValue);
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
			case B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE:
				setCapabilityPredicate((CapabilityPredicate) null);
				return;
			case B3BuildPackage.REQUIRES_PREDICATE__META:
				setMeta(META_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Iterates over the BuildUnit referenced as the context value "@test" and returns true if one of the requirements
	 * matches the predicate. Handles the distinction between meta/env requirements and regular requirements.
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof BuildUnit))
			throw new B3InternalError("Attempt to evaluate RequiresPredicate against non BuildUnit or Builder");
		BuildUnit u = (BuildUnit) test;
		EList<RequiredCapability> rcList = isMeta()
				? u.getMetaRequiredCapabilities()
				: u.getRequiredCapabilities();
		for(RequiredCapability r : rcList) {
			if(capabilityPredicate.matches(r))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CapabilityPredicate getCapabilityPredicate() {
		return capabilityPredicate;
	}

	/**
	 * Always returns Boolean.
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return Boolean.class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Matches the required capability - note that it is the caller's responsibility to check if the predicate
	 * is for a meta requirement or not.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean matches(RequiredCapability candidate) {
		return capabilityPredicate.matches(candidate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCapabilityPredicate(CapabilityPredicate newCapabilityPredicate) {
		if(newCapabilityPredicate != capabilityPredicate) {
			NotificationChain msgs = null;
			if(capabilityPredicate != null)
				msgs = ((InternalEObject) capabilityPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE, null, msgs);
			if(newCapabilityPredicate != null)
				msgs = ((InternalEObject) newCapabilityPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE, null, msgs);
			msgs = basicSetCapabilityPredicate(newCapabilityPredicate, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REQUIRES_PREDICATE__CAPABILITY_PREDICATE,
				newCapabilityPredicate, newCapabilityPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMeta(boolean newMeta) {
		boolean oldMeta = meta;
		meta = newMeta;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.REQUIRES_PREDICATE__META, oldMeta, meta));
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
		result.append(" (meta: ");
		result.append(meta);
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
		return B3BuildPackage.Literals.REQUIRES_PREDICATE;
	}
} // RequiresPredicateImpl
