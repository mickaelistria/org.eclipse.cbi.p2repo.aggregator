/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.impl;

import java.util.Collection;

import org.eclipse.b3.aggregator.Aggregate;
import org.eclipse.b3.aggregator.AggregateView;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.LinkSource;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.impl.AggregateViewImpl#getContributions <em>Contributions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AggregateViewImpl extends MinimalEObjectImpl.Container implements AggregateView {

	/**
	 * An adapter we register with the {@link Aggregate} instance we are view of to receive
	 * (and process) notifications of changes in its features.
	 */
	protected Adapter notificationProcessingAdapter = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification notification) {
			if(notification.getFeatureID(Aggregate.class) == Notification.NO_FEATURE_ID) {
				Object linkSource;

				switch(notification.getEventType()) {
					case Notification.ADD:
						linkSource = notification.getNewValue();
						if(linkSource instanceof Contribution) {
							ContributionImpl contribution = (ContributionImpl) linkSource;
							if(contribution.eResource() != null)
								getContributions().add((Contribution) linkSource);
						}
						break;
					case Notification.REMOVE:
						linkSource = notification.getOldValue();
						if(linkSource instanceof Contribution) {
							ContributionImpl contribution = (ContributionImpl) linkSource;
							if(contribution.eResource() != null)
								getContributions().remove(linkSource);
						}
						break;
				}
			}
		}

	};

	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected int eFlags = 0;

	/**
	 * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<Contribution> contributions;

	protected AggregateImpl aggregate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AggregateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public AggregateViewImpl(AggregateImpl aggregate) {
		super();
		this.aggregate = aggregate;

		EList<Contribution> contributions = getContributions();
		for(LinkSource linkSource : aggregate.getLinkedSources()) {
			if(linkSource instanceof Contribution)
				contributions.add((Contribution) linkSource);
		}

		aggregate.eAdapters().add(notificationProcessingAdapter);
	}

	public void dispose() {
		aggregate.eAdapters().remove(notificationProcessingAdapter);
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
			case AggregatorPackage.AGGREGATE_VIEW__CONTRIBUTIONS:
				return getContributions();
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
			case AggregatorPackage.AGGREGATE_VIEW__CONTRIBUTIONS:
				return ((InternalEList<?>) getContributions()).basicRemove(otherEnd, msgs);
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
			case AggregatorPackage.AGGREGATE_VIEW__CONTRIBUTIONS:
				return contributions != null && !contributions.isEmpty();
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
			case AggregatorPackage.AGGREGATE_VIEW__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends Contribution>) newValue);
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
		return AggregatorPackage.Literals.AGGREGATE_VIEW;
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
			case AggregatorPackage.AGGREGATE_VIEW__CONTRIBUTIONS:
				getContributions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	public Aggregate getAggregate() {
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Contribution> getContributions() {
		if(contributions == null) {
			// we don't need a resolving list since this list can only contains resolved objects
			contributions = new EObjectEList<Contribution>(
				Contribution.class, this, AggregatorPackage.AGGREGATE_VIEW__CONTRIBUTIONS);
		}
		return contributions;
	}

} // AggregateViewImpl
