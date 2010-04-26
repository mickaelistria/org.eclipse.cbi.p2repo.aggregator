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
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuilderNamePredicate;
import org.eclipse.b3.build.build.IBuilder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Name Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.impl.BuilderNamePredicateImpl#getNamePredicate <em>Name Predicate</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuilderNamePredicateImpl extends BExpressionImpl implements BuilderNamePredicate {
	/**
	 * The cached value of the '{@link #getNamePredicate() <em>Name Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNamePredicate()
	 * @generated
	 * @ordered
	 */
	protected BNamePredicate namePredicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuilderNamePredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNamePredicate(BNamePredicate newNamePredicate, NotificationChain msgs) {
		BNamePredicate oldNamePredicate = namePredicate;
		namePredicate = newNamePredicate;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE, oldNamePredicate,
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
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE:
				return getNamePredicate();
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
			case B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE:
				return basicSetNamePredicate(null, msgs);
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
			case B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE:
				return namePredicate != null;
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
			case B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate) newValue);
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
		return B3BuildPackage.Literals.BUILDER_NAME_PREDICATE;
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
			case B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE:
				setNamePredicate((BNamePredicate) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof IBuilder))
			throw new B3InternalError("Attempt to evaluate BuilderNamePredicate against non IBuilder");
		IBuilder b = (IBuilder) test;
		return Boolean.valueOf(namePredicate.matches(b.getName()));
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
	public BNamePredicate getNamePredicate() {
		return namePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNamePredicate(BNamePredicate newNamePredicate) {
		if(newNamePredicate != namePredicate) {
			NotificationChain msgs = null;
			if(namePredicate != null)
				msgs = ((InternalEObject) namePredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE, null, msgs);
			if(newNamePredicate != null)
				msgs = ((InternalEObject) newNamePredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE, null, msgs);
			msgs = basicSetNamePredicate(newNamePredicate, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_NAME_PREDICATE__NAME_PREDICATE, newNamePredicate,
				newNamePredicate));
	}

} // BuilderNamePredicateImpl
