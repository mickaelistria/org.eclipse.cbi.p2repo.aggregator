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

import org.eclipse.b3.aggregator.p2view.IUDetails;
import org.eclipse.b3.aggregator.p2view.IUPresentationWithDetails;
import org.eclipse.b3.aggregator.p2view.Licenses;
import org.eclipse.b3.aggregator.p2view.P2viewFactory;
import org.eclipse.b3.aggregator.p2view.P2viewPackage;
import org.eclipse.b3.aggregator.p2view.Properties;
import org.eclipse.b3.aggregator.p2view.ProvidedCapabilities;
import org.eclipse.b3.aggregator.p2view.Requirements;
import org.eclipse.b3.aggregator.p2view.Touchpoints;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.equinox.p2.metadata.ICopyright;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.IUpdateDescriptor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IU Presentation With Details</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#getRequirementsContainer <em>
 * Requirements Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#getProvidedCapabilitiesContainer <em>
 * Provided Capabilities Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#getPropertiesContainer <em>Properties
 * Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#getTouchpointsContainer <em>
 * Touchpoints Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#getUpdateDescriptor <em>Update
 * Descriptor</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#getCopyright <em>Copyright</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#getLicensesContainer <em>Licenses
 * Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.impl.IUPresentationWithDetailsImpl#isDetailsResolved <em>Details Resolved
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class IUPresentationWithDetailsImpl extends IUPresentationImpl implements IUPresentationWithDetails {
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
	 * The cached value of the '{@link #getLicensesContainer() <em>Licenses Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLicensesContainer()
	 * @generated
	 * @ordered
	 */
	protected Licenses licensesContainer;

	/**
	 * The default value of the '{@link #isDetailsResolved() <em>Details Resolved</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #isDetailsResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETAILS_RESOLVED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDetailsResolved() <em>Details Resolved</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDetailsResolved()
	 * @generated
	 * @ordered
	 */
	protected static final int DETAILS_RESOLVED_EFLAG = 1 << 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IUPresentationWithDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected IUPresentationWithDetailsImpl(IInstallableUnit iu) {
		super(iu);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == IUDetails.class) {
			switch(derivedFeatureID) {
			case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__REQUIREMENTS_CONTAINER:
				return P2viewPackage.IU_DETAILS__REQUIREMENTS_CONTAINER;
			case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
				return P2viewPackage.IU_DETAILS__PROVIDED_CAPABILITIES_CONTAINER;
			case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROPERTIES_CONTAINER:
				return P2viewPackage.IU_DETAILS__PROPERTIES_CONTAINER;
			case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__TOUCHPOINTS_CONTAINER:
				return P2viewPackage.IU_DETAILS__TOUCHPOINTS_CONTAINER;
			case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__UPDATE_DESCRIPTOR:
				return P2viewPackage.IU_DETAILS__UPDATE_DESCRIPTOR;
			case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__COPYRIGHT:
				return P2viewPackage.IU_DETAILS__COPYRIGHT;
			case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__LICENSES_CONTAINER:
				return P2viewPackage.IU_DETAILS__LICENSES_CONTAINER;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if(baseClass == IUDetails.class) {
			switch(baseFeatureID) {
			case P2viewPackage.IU_DETAILS__REQUIREMENTS_CONTAINER:
				return P2viewPackage.IU_PRESENTATION_WITH_DETAILS__REQUIREMENTS_CONTAINER;
			case P2viewPackage.IU_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
				return P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROVIDED_CAPABILITIES_CONTAINER;
			case P2viewPackage.IU_DETAILS__PROPERTIES_CONTAINER:
				return P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROPERTIES_CONTAINER;
			case P2viewPackage.IU_DETAILS__TOUCHPOINTS_CONTAINER:
				return P2viewPackage.IU_PRESENTATION_WITH_DETAILS__TOUCHPOINTS_CONTAINER;
			case P2viewPackage.IU_DETAILS__UPDATE_DESCRIPTOR:
				return P2viewPackage.IU_PRESENTATION_WITH_DETAILS__UPDATE_DESCRIPTOR;
			case P2viewPackage.IU_DETAILS__COPYRIGHT:
				return P2viewPackage.IU_PRESENTATION_WITH_DETAILS__COPYRIGHT;
			case P2viewPackage.IU_DETAILS__LICENSES_CONTAINER:
				return P2viewPackage.IU_PRESENTATION_WITH_DETAILS__LICENSES_CONTAINER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__REQUIREMENTS_CONTAINER:
			return getRequirementsContainer();
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			return getProvidedCapabilitiesContainer();
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROPERTIES_CONTAINER:
			return getPropertiesContainer();
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__TOUCHPOINTS_CONTAINER:
			return getTouchpointsContainer();
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__UPDATE_DESCRIPTOR:
			return getUpdateDescriptor();
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__COPYRIGHT:
			return getCopyright();
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__LICENSES_CONTAINER:
			return getLicensesContainer();
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__DETAILS_RESOLVED:
			return isDetailsResolved();
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
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__REQUIREMENTS_CONTAINER:
			return requirementsContainer != null;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			return providedCapabilitiesContainer != null;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROPERTIES_CONTAINER:
			return propertiesContainer != null;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__TOUCHPOINTS_CONTAINER:
			return touchpointsContainer != null;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__UPDATE_DESCRIPTOR:
			return updateDescriptor != null;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__COPYRIGHT:
			return copyright != null;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__LICENSES_CONTAINER:
			return licensesContainer != null;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__DETAILS_RESOLVED:
			return ((eFlags & DETAILS_RESOLVED_EFLAG) != 0) != DETAILS_RESOLVED_EDEFAULT;
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
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__REQUIREMENTS_CONTAINER:
			setRequirementsContainer((Requirements) newValue);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			setProvidedCapabilitiesContainer((ProvidedCapabilities) newValue);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROPERTIES_CONTAINER:
			setPropertiesContainer((Properties) newValue);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__TOUCHPOINTS_CONTAINER:
			setTouchpointsContainer((Touchpoints) newValue);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__UPDATE_DESCRIPTOR:
			setUpdateDescriptor((IUpdateDescriptor) newValue);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__COPYRIGHT:
			setCopyright((ICopyright) newValue);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__LICENSES_CONTAINER:
			setLicensesContainer((Licenses) newValue);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__DETAILS_RESOLVED:
			setDetailsResolved((Boolean) newValue);
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
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__REQUIREMENTS_CONTAINER:
			setRequirementsContainer((Requirements) null);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROVIDED_CAPABILITIES_CONTAINER:
			setProvidedCapabilitiesContainer((ProvidedCapabilities) null);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROPERTIES_CONTAINER:
			setPropertiesContainer((Properties) null);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__TOUCHPOINTS_CONTAINER:
			setTouchpointsContainer((Touchpoints) null);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__UPDATE_DESCRIPTOR:
			setUpdateDescriptor((IUpdateDescriptor) null);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__COPYRIGHT:
			setCopyright((ICopyright) null);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__LICENSES_CONTAINER:
			setLicensesContainer((Licenses) null);
			return;
		case P2viewPackage.IU_PRESENTATION_WITH_DETAILS__DETAILS_RESOLVED:
			setDetailsResolved(DETAILS_RESOLVED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ICopyright getCopyright() {
		if(!isDetailsResolved())
			resolveDetails();

		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Licenses getLicensesContainer() {
		return licensesContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Properties getPropertiesContainer() {
		if(!isDetailsResolved())
			resolveDetails();

		return propertiesContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ProvidedCapabilities getProvidedCapabilitiesContainer() {
		if(!isDetailsResolved())
			resolveDetails();

		return providedCapabilitiesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Requirements getRequirementsContainer() {
		if(!isDetailsResolved())
			resolveDetails();

		return requirementsContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Touchpoints getTouchpointsContainer() {
		if(!isDetailsResolved())
			resolveDetails();

		return touchpointsContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public IUpdateDescriptor getUpdateDescriptor() {
		if(!isDetailsResolved())
			resolveDetails();

		return updateDescriptor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDetailsResolved() {
		return (eFlags & DETAILS_RESOLVED_EFLAG) != 0;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDetailsResolved(boolean newDetailsResolved) {
		boolean oldDetailsResolved = (eFlags & DETAILS_RESOLVED_EFLAG) != 0;
		if(newDetailsResolved)
			eFlags |= DETAILS_RESOLVED_EFLAG;
		else
			eFlags &= ~DETAILS_RESOLVED_EFLAG;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__DETAILS_RESOLVED, oldDetailsResolved,
					newDetailsResolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLicensesContainer(Licenses newLicensesContainer) {
		Licenses oldLicensesContainer = licensesContainer;
		licensesContainer = newLicensesContainer;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__LICENSES_CONTAINER, oldLicensesContainer,
					licensesContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROPERTIES_CONTAINER, oldPropertiesContainer,
					propertiesContainer));
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
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__PROVIDED_CAPABILITIES_CONTAINER,
					oldProvidedCapabilitiesContainer, providedCapabilitiesContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__REQUIREMENTS_CONTAINER, oldRequirementsContainer,
					requirementsContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__TOUCHPOINTS_CONTAINER, oldTouchpointsContainer,
					touchpointsContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					P2viewPackage.IU_PRESENTATION_WITH_DETAILS__UPDATE_DESCRIPTOR, oldUpdateDescriptor,
					updateDescriptor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (detailsResolved: ");
		result.append((eFlags & DETAILS_RESOLVED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return P2viewPackage.Literals.IU_PRESENTATION_WITH_DETAILS;
	}

	private void resolveDetails() {
		IUDetails iuDetails = P2viewFactory.eINSTANCE.createIUDetails(getInstallableUnit());

		setRequirementsContainer(iuDetails.getRequirementsContainer());
		setProvidedCapabilitiesContainer(iuDetails.getProvidedCapabilitiesContainer());
		setPropertiesContainer(iuDetails.getPropertiesContainer());
		setTouchpointsContainer(iuDetails.getTouchpointsContainer());
		setUpdateDescriptor(iuDetails.getUpdateDescriptor());
		setCopyright(iuDetails.getCopyright());
		setLicensesContainer(iuDetails.getLicensesContainer());

		setDetailsResolved(true);
	}

} // IUPresentationWithDetailsImpl
