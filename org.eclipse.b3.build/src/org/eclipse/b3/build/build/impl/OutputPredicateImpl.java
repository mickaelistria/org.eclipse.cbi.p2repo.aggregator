/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BExpressionImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.OutputPredicate;
import org.eclipse.b3.build.build.PathVectorElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.OutputPredicateImpl#getPathVector <em>Path Vector</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.OutputPredicateImpl#getPathPattern <em>Path Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPredicateImpl extends BExpressionImpl implements OutputPredicate {
	/**
	 * The cached value of the '{@link #getPathVector() <em>Path Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVector()
	 * @generated
	 * @ordered
	 */
	protected PathVectorElement pathVector;

	/**
	 * The cached value of the '{@link #getPathPattern() <em>Path Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPattern()
	 * @generated
	 * @ordered
	 */
	protected BExpression pathPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.OUTPUT_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathVectorElement getPathVector() {
		return pathVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathVector(PathVectorElement newPathVector, NotificationChain msgs) {
		PathVectorElement oldPathVector = pathVector;
		pathVector = newPathVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR, oldPathVector, newPathVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathVector(PathVectorElement newPathVector) {
		if (newPathVector != pathVector) {
			NotificationChain msgs = null;
			if (pathVector != null)
				msgs = ((InternalEObject)pathVector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR, null, msgs);
			if (newPathVector != null)
				msgs = ((InternalEObject)newPathVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR, null, msgs);
			msgs = basicSetPathVector(newPathVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR, newPathVector, newPathVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getPathPattern() {
		return pathPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathPattern(BExpression newPathPattern, NotificationChain msgs) {
		BExpression oldPathPattern = pathPattern;
		pathPattern = newPathPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN, oldPathPattern, newPathPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPattern(BExpression newPathPattern) {
		if (newPathPattern != pathPattern) {
			NotificationChain msgs = null;
			if (pathPattern != null)
				msgs = ((InternalEObject)pathPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN, null, msgs);
			if (newPathPattern != null)
				msgs = ((InternalEObject)newPathPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN, null, msgs);
			msgs = basicSetPathPattern(newPathPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN, newPathPattern, newPathPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR:
				return basicSetPathVector(null, msgs);
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN:
				return basicSetPathPattern(null, msgs);
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
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR:
				return getPathVector();
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN:
				return getPathPattern();
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
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR:
				setPathVector((PathVectorElement)newValue);
				return;
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN:
				setPathPattern((BExpression)newValue);
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
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR:
				setPathVector((PathVectorElement)null);
				return;
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN:
				setPathPattern((BExpression)null);
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
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_VECTOR:
				return pathVector != null;
			case B3BuildPackage.OUTPUT_PREDICATE__PATH_PATTERN:
				return pathPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputPredicateImpl
