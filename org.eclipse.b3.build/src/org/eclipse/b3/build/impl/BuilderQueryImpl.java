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

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuilderQuery;
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
 * An implementation of the model object '<em><b>Builder Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BuilderQueryImpl#getBuilderQueries <em>Builder Queries</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderQueryImpl#getUnitQuery <em>Unit Query</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BuilderQueryImpl extends EObjectImpl implements BuilderQuery {
	/**
	 * The cached value of the '{@link #getBuilderQueries() <em>Builder Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBuilderQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<BExpression> builderQueries;

	/**
	 * The cached value of the '{@link #getUnitQuery() <em>Unit Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUnitQuery()
	 * @generated
	 * @ordered
	 */
	protected BExpression unitQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuilderQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetUnitQuery(BExpression newUnitQuery, NotificationChain msgs) {
		BExpression oldUnitQuery = unitQuery;
		unitQuery = newUnitQuery;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_QUERY__UNIT_QUERY, oldUnitQuery, newUnitQuery);
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
			case B3BuildPackage.BUILDER_QUERY__BUILDER_QUERIES:
				return getBuilderQueries();
			case B3BuildPackage.BUILDER_QUERY__UNIT_QUERY:
				return getUnitQuery();
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
			case B3BuildPackage.BUILDER_QUERY__BUILDER_QUERIES:
				return ((InternalEList<?>) getBuilderQueries()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_QUERY__UNIT_QUERY:
				return basicSetUnitQuery(null, msgs);
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
			case B3BuildPackage.BUILDER_QUERY__BUILDER_QUERIES:
				return builderQueries != null && !builderQueries.isEmpty();
			case B3BuildPackage.BUILDER_QUERY__UNIT_QUERY:
				return unitQuery != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_QUERY__BUILDER_QUERIES:
				getBuilderQueries().clear();
				getBuilderQueries().addAll((Collection<? extends BExpression>) newValue);
				return;
			case B3BuildPackage.BUILDER_QUERY__UNIT_QUERY:
				setUnitQuery((BExpression) newValue);
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
			case B3BuildPackage.BUILDER_QUERY__BUILDER_QUERIES:
				getBuilderQueries().clear();
				return;
			case B3BuildPackage.BUILDER_QUERY__UNIT_QUERY:
				setUnitQuery((BExpression) null);
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
	public EList<BExpression> getBuilderQueries() {
		if(builderQueries == null) {
			builderQueries = new EObjectContainmentEList<BExpression>(
				BExpression.class, this, B3BuildPackage.BUILDER_QUERY__BUILDER_QUERIES);
		}
		return builderQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getUnitQuery() {
		return unitQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUnitQuery(BExpression newUnitQuery) {
		if(newUnitQuery != unitQuery) {
			NotificationChain msgs = null;
			if(unitQuery != null)
				msgs = ((InternalEObject) unitQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_QUERY__UNIT_QUERY, null, msgs);
			if(newUnitQuery != null)
				msgs = ((InternalEObject) newUnitQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_QUERY__UNIT_QUERY, null, msgs);
			msgs = basicSetUnitQuery(newUnitQuery, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_QUERY__UNIT_QUERY, newUnitQuery, newUnitQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILDER_QUERY;
	}

} // BuilderQueryImpl
