/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2view.impl;

import java.util.Collection;

import org.eclipse.b3.aggregator.p2view.IUDetails;
import org.eclipse.b3.aggregator.p2view.P2viewPackage;
import org.eclipse.b3.aggregator.p2view.Properties;
import org.eclipse.b3.aggregator.p2view.ProvidedCapabilities;
import org.eclipse.b3.aggregator.p2view.Requirements;
import org.eclipse.b3.aggregator.p2view.Touchpoints;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.equinox.p2.metadata.ICopyright;
import org.eclipse.equinox.p2.metadata.ILicense;
import org.eclipse.equinox.p2.metadata.IUpdateDescriptor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IU Details</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUDetailsImpl#getRequirementsContainer <em>Requirements Container
 * </em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUDetailsImpl#getProvidedCapabilitiesContainer <em>Provided
 * Capabilities Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUDetailsImpl#getPropertiesContainer <em>Properties Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUDetailsImpl#getTouchpointsContainer <em>Touchpoints Container
 * </em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUDetailsImpl#getUpdateDescriptor <em>Update Descriptor</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUDetailsImpl#getCopyright <em>Copyright</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUDetailsImpl#getLicenses <em>Licenses</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IUDetailsImpl extends MinimalEObjectImpl.Container implements IUDetails {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected int eFlags = 0;

	/**
	 * The cached value of the '{@link #getRequirementsContainer() <em>Requirements Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRequirementsContainer()
	 * @generated
	 * @ordered
	 */
	protected Requirements requirementsContainer;

	/**
	 * The cached value of the '{@link #getProvidedCapabilitiesContainer() <em>Provided Capabilities Container</em>}'
	 * reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProvidedCapabilitiesContainer()
	 * @generated
	 * @ordered
	 */
	protected ProvidedCapabilities providedCapabilitiesContainer;

	/**
	 * The cached value of the '{@link #getPropertiesContainer() <em>Properties Container</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPropertiesContainer()
	 * @generated
	 * @ordered
	 */
	protected Properties propertiesContainer;

	/**
	 * The cached value of the '{@link #getTouchpointsContainer() <em>Touchpoints Container</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTouchpointsContainer()
	 * @generated
	 * @ordered
	 */
	protected Touchpoints touchpointsContainer;

	/**
	 * The cached value of the '{@link #getUpdateDescriptor() <em>Update Descriptor</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUpdateDescriptor()
	 * @generated
	 * @ordered
	 */
	protected IUpdateDescriptor updateDescriptor;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected ICopyright copyright;

	/**
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected EList<ILicense> licenses;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IUDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case P2viewPackage.IU_DETAILS__REQUIREMENTS_CONTAINER:
			return getRequirementsContainer();
		case P2viewPackage.IU_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			return getProvidedCapabilitiesContainer();
		case P2viewPackage.IU_DETAILS__PROPERTIES_CONTAINER:
			return getPropertiesContainer();
		case P2viewPackage.IU_DETAILS__TOUCHPOINTS_CONTAINER:
			return getTouchpointsContainer();
		case P2viewPackage.IU_DETAILS__UPDATE_DESCRIPTOR:
			return getUpdateDescriptor();
		case P2viewPackage.IU_DETAILS__COPYRIGHT:
			return getCopyright();
		case P2viewPackage.IU_DETAILS__LICENSES:
			return getLicenses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
		case P2viewPackage.IU_DETAILS__REQUIREMENTS_CONTAINER:
			return requirementsContainer != null;
		case P2viewPackage.IU_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			return providedCapabilitiesContainer != null;
		case P2viewPackage.IU_DETAILS__PROPERTIES_CONTAINER:
			return propertiesContainer != null;
		case P2viewPackage.IU_DETAILS__TOUCHPOINTS_CONTAINER:
			return touchpointsContainer != null;
		case P2viewPackage.IU_DETAILS__UPDATE_DESCRIPTOR:
			return updateDescriptor != null;
		case P2viewPackage.IU_DETAILS__COPYRIGHT:
			return copyright != null;
		case P2viewPackage.IU_DETAILS__LICENSES:
			return licenses != null && !licenses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case P2viewPackage.IU_DETAILS__REQUIREMENTS_CONTAINER:
			setRequirementsContainer((Requirements) newValue);
			return;
		case P2viewPackage.IU_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			setProvidedCapabilitiesContainer((ProvidedCapabilities) newValue);
			return;
		case P2viewPackage.IU_DETAILS__PROPERTIES_CONTAINER:
			setPropertiesContainer((Properties) newValue);
			return;
		case P2viewPackage.IU_DETAILS__TOUCHPOINTS_CONTAINER:
			setTouchpointsContainer((Touchpoints) newValue);
			return;
		case P2viewPackage.IU_DETAILS__UPDATE_DESCRIPTOR:
			setUpdateDescriptor((IUpdateDescriptor) newValue);
			return;
		case P2viewPackage.IU_DETAILS__COPYRIGHT:
			setCopyright((ICopyright) newValue);
			return;
		case P2viewPackage.IU_DETAILS__LICENSES:
			getLicenses().clear();
			getLicenses().addAll((Collection<? extends ILicense>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
		case P2viewPackage.IU_DETAILS__REQUIREMENTS_CONTAINER:
			setRequirementsContainer((Requirements) null);
			return;
		case P2viewPackage.IU_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			setProvidedCapabilitiesContainer((ProvidedCapabilities) null);
			return;
		case P2viewPackage.IU_DETAILS__PROPERTIES_CONTAINER:
			setPropertiesContainer((Properties) null);
			return;
		case P2viewPackage.IU_DETAILS__TOUCHPOINTS_CONTAINER:
			setTouchpointsContainer((Touchpoints) null);
			return;
		case P2viewPackage.IU_DETAILS__UPDATE_DESCRIPTOR:
			setUpdateDescriptor((IUpdateDescriptor) null);
			return;
		case P2viewPackage.IU_DETAILS__COPYRIGHT:
			setCopyright((ICopyright) null);
			return;
		case P2viewPackage.IU_DETAILS__LICENSES:
			getLicenses().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ICopyright getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ILicense> getLicenses() {
		if(licenses == null) {
			licenses = new EObjectEList<ILicense>(ILicense.class, this, P2viewPackage.IU_DETAILS__LICENSES);
		}
		return licenses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Properties getPropertiesContainer() {
		return propertiesContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProvidedCapabilities getProvidedCapabilitiesContainer() {
		return providedCapabilitiesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Requirements getRequirementsContainer() {
		return requirementsContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Touchpoints getTouchpointsContainer() {
		return touchpointsContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IUpdateDescriptor getUpdateDescriptor() {
		return updateDescriptor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCopyright(ICopyright newCopyright) {
		ICopyright oldCopyright = copyright;
		copyright = newCopyright;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2viewPackage.IU_DETAILS__COPYRIGHT, oldCopyright,
					copyright));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPropertiesContainer(Properties newPropertiesContainer) {
		Properties oldPropertiesContainer = propertiesContainer;
		propertiesContainer = newPropertiesContainer;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2viewPackage.IU_DETAILS__PROPERTIES_CONTAINER,
					oldPropertiesContainer, propertiesContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProvidedCapabilitiesContainer(ProvidedCapabilities newProvidedCapabilitiesContainer) {
		ProvidedCapabilities oldProvidedCapabilitiesContainer = providedCapabilitiesContainer;
		providedCapabilitiesContainer = newProvidedCapabilitiesContainer;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_DETAILS__PROVIDED_CAPABILITIES_CONTAINER, oldProvidedCapabilitiesContainer,
					providedCapabilitiesContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequirementsContainer(Requirements newRequirementsContainer) {
		Requirements oldRequirementsContainer = requirementsContainer;
		requirementsContainer = newRequirementsContainer;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2viewPackage.IU_DETAILS__REQUIREMENTS_CONTAINER,
					oldRequirementsContainer, requirementsContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTouchpointsContainer(Touchpoints newTouchpointsContainer) {
		Touchpoints oldTouchpointsContainer = touchpointsContainer;
		touchpointsContainer = newTouchpointsContainer;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2viewPackage.IU_DETAILS__TOUCHPOINTS_CONTAINER,
					oldTouchpointsContainer, touchpointsContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUpdateDescriptor(IUpdateDescriptor newUpdateDescriptor) {
		IUpdateDescriptor oldUpdateDescriptor = updateDescriptor;
		updateDescriptor = newUpdateDescriptor;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, P2viewPackage.IU_DETAILS__UPDATE_DESCRIPTOR,
					oldUpdateDescriptor, updateDescriptor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2viewPackage.Literals.IU_DETAILS;
	}

} // IUDetailsImpl
