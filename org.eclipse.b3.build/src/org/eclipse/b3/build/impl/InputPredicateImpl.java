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

import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.InputPredicate;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.InputPredicateImpl#getCapabilityPredicate <em>Capability Predicate</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.InputPredicateImpl#getBuilderPredicate <em>Builder Predicate</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InputPredicateImpl extends BExpressionImpl implements InputPredicate {
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
	 * The cached value of the '{@link #getBuilderPredicate() <em>Builder Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBuilderPredicate()
	 * @generated
	 * @ordered
	 */
	protected BNamePredicate builderPredicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InputPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBuilderPredicate(BNamePredicate newBuilderPredicate, NotificationChain msgs) {
		BNamePredicate oldBuilderPredicate = builderPredicate;
		builderPredicate = newBuilderPredicate;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE, oldBuilderPredicate,
				newBuilderPredicate);
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
	public NotificationChain basicSetCapabilityPredicate(CapabilityPredicate newCapabilityPredicate,
			NotificationChain msgs) {
		CapabilityPredicate oldCapabilityPredicate = capabilityPredicate;
		capabilityPredicate = newCapabilityPredicate;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE, oldCapabilityPredicate,
				newCapabilityPredicate);
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
			case B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE:
				return getCapabilityPredicate();
			case B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE:
				return getBuilderPredicate();
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
			case B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE:
				return basicSetCapabilityPredicate(null, msgs);
			case B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE:
				return basicSetBuilderPredicate(null, msgs);
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
			case B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE:
				return capabilityPredicate != null;
			case B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE:
				return builderPredicate != null;
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
			case B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE:
				setCapabilityPredicate((CapabilityPredicate) newValue);
				return;
			case B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE:
				setBuilderPredicate((BNamePredicate) newValue);
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
			case B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE:
				setCapabilityPredicate((CapabilityPredicate) null);
				return;
			case B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE:
				setBuilderPredicate((BNamePredicate) null);
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
	public BNamePredicate getBuilderPredicate() {
		return builderPredicate;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBuilderPredicate(BNamePredicate newBuilderPredicate) {
		if(newBuilderPredicate != builderPredicate) {
			NotificationChain msgs = null;
			if(builderPredicate != null)
				msgs = ((InternalEObject) builderPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE, null, msgs);
			if(newBuilderPredicate != null)
				msgs = ((InternalEObject) newBuilderPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE, null, msgs);
			msgs = basicSetBuilderPredicate(newBuilderPredicate, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.INPUT_PREDICATE__BUILDER_PREDICATE, newBuilderPredicate,
				newBuilderPredicate));
	}

	// private boolean removeMatches(ListIterator<BuilderInput> reqItor) {
	// boolean modified = false;
	// while(reqItor.hasNext()) {
	// BuilderInput brr = reqItor.next();
	//
	// BuildResultReference brr = reqItor.next().getBuildResult();
	// if(brr instanceof BuilderReference) {
	// BuilderReference br = (BuilderReference) brr;
	// if(builderPredicate != null && !builderPredicate.matches(br.getBuilderName()))
	// continue;
	// RequiredCapability rc = br.getRequiredCapability();
	// if(rc == null) {
	// rc = br.getRequiredCapabilityReference();
	// if(rc == null)
	// throw new B3InternalError(
	// "A BulderReference had neither a RequiredCapability nor a reference to one");
	// }
	// if(capabilityPredicate != null && !capabilityPredicate.matches(rc))
	// continue;
	//
	// reqItor.remove();
	// modified = true;
	// }
	// else if(brr instanceof CompoundBuildResultReference) {
	// EList<Prerequisite> reqs = ((CompoundBuildResultReference) brr).getPrerequisites();
	// modified = removeMatches(reqs.listIterator()) || modified;
	// // compound may be empty after the operation - remove it
	// if(reqs.size() == 0) {
	// reqItor.remove();
	// modified = true;
	// }
	// }
	// else
	// throw new B3InternalError("InputPredicate can not handle unknown subclass of BuildResultReference :" +
	// brr.getClass().toString());
	// }
	// return modified;
	// }

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
						B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE, null, msgs);
			if(newCapabilityPredicate != null)
				msgs = ((InternalEObject) newCapabilityPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE, null, msgs);
			msgs = basicSetCapabilityPredicate(newCapabilityPredicate, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.INPUT_PREDICATE__CAPABILITY_PREDICATE, newCapabilityPredicate,
				newCapabilityPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.INPUT_PREDICATE;
	}

} // InputPredicateImpl
