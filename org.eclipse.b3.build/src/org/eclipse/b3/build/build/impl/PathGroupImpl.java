/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */

package org.eclipse.b3.build.build.impl;

import java.util.Collection;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.ConditionalPathVector;
import org.eclipse.b3.build.build.PathGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.PathGroupImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.PathGroupImpl#getPathVectors <em>Path Vectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathGroupImpl extends EObjectImpl implements PathGroup {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet annotations;

	/**
	 * The cached value of the '{@link #getPathVectors() <em>Path Vectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathVectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalPathVector> pathVectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(BPropertySet newAnnotations, NotificationChain msgs) {
		BPropertySet oldAnnotations = annotations;
		annotations = newAnnotations;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PATH_GROUP__ANNOTATIONS, oldAnnotations, newAnnotations);
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
			case B3BuildPackage.PATH_GROUP__ANNOTATIONS:
				return getAnnotations();
			case B3BuildPackage.PATH_GROUP__PATH_VECTORS:
				return getPathVectors();
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
			case B3BuildPackage.PATH_GROUP__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case B3BuildPackage.PATH_GROUP__PATH_VECTORS:
				return ((InternalEList<?>) getPathVectors()).basicRemove(otherEnd, msgs);
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
			case B3BuildPackage.PATH_GROUP__ANNOTATIONS:
				return annotations != null;
			case B3BuildPackage.PATH_GROUP__PATH_VECTORS:
				return pathVectors != null && !pathVectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.PATH_GROUP__ANNOTATIONS:
				setAnnotations((BPropertySet) newValue);
				return;
			case B3BuildPackage.PATH_GROUP__PATH_VECTORS:
				getPathVectors().clear();
				getPathVectors().addAll((Collection<? extends ConditionalPathVector>) newValue);
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
		return B3BuildPackage.Literals.PATH_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.PATH_GROUP__ANNOTATIONS:
				setAnnotations((BPropertySet) null);
				return;
			case B3BuildPackage.PATH_GROUP__PATH_VECTORS:
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
	public BPropertySet getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalPathVector> getPathVectors() {
		if(pathVectors == null) {
			pathVectors = new EObjectContainmentEList<ConditionalPathVector>(
				ConditionalPathVector.class, this, B3BuildPackage.PATH_GROUP__PATH_VECTORS);
		}
		return pathVectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(BPropertySet newAnnotations) {
		if(newAnnotations != annotations) {
			NotificationChain msgs = null;
			if(annotations != null)
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PATH_GROUP__ANNOTATIONS, null, msgs);
			if(newAnnotations != null)
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.PATH_GROUP__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.PATH_GROUP__ANNOTATIONS, newAnnotations, newAnnotations));
	}

} // PathGroupImpl
