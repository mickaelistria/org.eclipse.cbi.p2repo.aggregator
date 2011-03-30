/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.impl;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.AggregatorResourceView;
import org.eclipse.b3.aggregator.util.AggregatorResource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregatorViewImpl_bak#getAggregator <em>Aggregator</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregatorViewImpl_bak#getAggregations <em>Aggregations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated NOT
 */
public class AggregatorResourceViewImpl extends MinimalEObjectImpl.Container implements AggregatorResourceView {
	/**
	 * The cached value of the '{@link #getAggregator() <em>Aggregator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAggregator()
	 * @generated NOT
	 * @ordered
	 */
	protected AggregatorImpl aggregator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public AggregatorResourceViewImpl(AggregatorResource aggregatorResource) {
		if(aggregatorResource != null)
			aggregator = (AggregatorImpl) aggregatorResource.getContents().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetAggregator(Aggregator newAggregator, NotificationChain msgs) {
		Aggregator oldAggregator = aggregator;
		aggregator = (AggregatorImpl) newAggregator;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR, oldAggregator,
				newAggregator);
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
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR:
				return getAggregator();
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATIONS:
				return getAggregations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR:
				return basicSetAggregator(null, msgs);
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATIONS:
				return aggregator.eInverseRemove(otherEnd, AggregatorPackage.AGGREGATOR__AGGREGATIONS, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATOR:
				return aggregator != null;
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATIONS:
				return getAggregations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATIONS:
				aggregator.eSet(AggregatorPackage.AGGREGATOR__AGGREGATIONS, newValue);
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
		return AggregatorPackage.Literals.AGGREGATOR_RESOURCE_VIEW;
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
			case AggregatorPackage.AGGREGATOR_RESOURCE_VIEW__AGGREGATIONS:
				getAggregations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Aggregation> getAggregations() {
		return aggregator.getAggregations();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Aggregator getAggregator() {
		return aggregator;
	}

} // AggregatorViewImpl
