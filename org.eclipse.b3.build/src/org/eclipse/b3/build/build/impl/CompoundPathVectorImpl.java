/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collection;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.CompoundPathVector;
import org.eclipse.b3.build.build.PathVector;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Path Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.CompoundPathVectorImpl#getPathVectors <em>Path Vectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundPathVectorImpl extends PathVectorImpl implements CompoundPathVector {
	/**
	 * The cached value of the '{@link #getPathVectors() <em>Path Vectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVectors()
	 * @generated
	 * @ordered
	 */
	protected EList<PathVector> pathVectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundPathVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.COMPOUND_PATH_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathVector> getPathVectors() {
		if (pathVectors == null) {
			pathVectors = new EObjectContainmentEList<PathVector>(PathVector.class, this, B3BuildPackage.COMPOUND_PATH_VECTOR__PATH_VECTORS);
		}
		return pathVectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case B3BuildPackage.COMPOUND_PATH_VECTOR__PATH_VECTORS:
				return ((InternalEList<?>)getPathVectors()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.COMPOUND_PATH_VECTOR__PATH_VECTORS:
				return getPathVectors();
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
			case B3BuildPackage.COMPOUND_PATH_VECTOR__PATH_VECTORS:
				getPathVectors().clear();
				getPathVectors().addAll((Collection<? extends PathVector>)newValue);
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
			case B3BuildPackage.COMPOUND_PATH_VECTOR__PATH_VECTORS:
				getPathVectors().clear();
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
			case B3BuildPackage.COMPOUND_PATH_VECTOR__PATH_VECTORS:
				return pathVectors != null && !pathVectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundPathVectorImpl
