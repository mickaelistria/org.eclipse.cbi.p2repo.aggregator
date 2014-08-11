/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2view;

import org.eclipse.equinox.p2.metadata.ICopyright;
import org.eclipse.equinox.p2.metadata.IUpdateDescriptor;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IU Details</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getRequirementsContainer <em>Requirements Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getProvidedCapabilitiesContainer <em>Provided Capabilities Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getPropertiesContainer <em>Properties Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getTouchpointsContainer <em>Touchpoints Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getUpdateDescriptor <em>Update Descriptor</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getCopyright <em>Copyright</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getLicensesContainer <em>Licenses Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails()
 * @model
 * @generated
 */
public interface IUDetails {
	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(ICopyright)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_Copyright()
	 * @model type="org.eclipse.b3.p2.ICopyright" containment="true"
	 * @generated
	 */
	ICopyright getCopyright();

	/**
	 * Returns the value of the '<em><b>Licenses Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Licenses Container</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Licenses Container</em>' containment reference.
	 * @see #setLicensesContainer(Licenses)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_LicensesContainer()
	 * @model containment="true"
	 * @generated
	 */
	Licenses getLicensesContainer();

	/**
	 * Returns the value of the '<em><b>Properties Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Container</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Properties Container</em>' containment reference.
	 * @see #setPropertiesContainer(Properties)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_PropertiesContainer()
	 * @model containment="true"
	 * @generated
	 */
	Properties getPropertiesContainer();

	/**
	 * Returns the value of the '<em><b>Provided Capabilities Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Capabilities Container</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Provided Capabilities Container</em>' containment reference.
	 * @see #setProvidedCapabilitiesContainer(ProvidedCapabilities)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_ProvidedCapabilitiesContainer()
	 * @model containment="true"
	 * @generated
	 */
	ProvidedCapabilities getProvidedCapabilitiesContainer();

	/**
	 * Returns the value of the '<em><b>Requirements Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements Container</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Requirements Container</em>' containment reference.
	 * @see #setRequirementsContainer(Requirements)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_RequirementsContainer()
	 * @model containment="true"
	 * @generated
	 */
	Requirements getRequirementsContainer();

	/**
	 * Returns the value of the '<em><b>Touchpoints Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touchpoints Container</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Touchpoints Container</em>' containment reference.
	 * @see #setTouchpointsContainer(Touchpoints)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_TouchpointsContainer()
	 * @model containment="true"
	 * @generated
	 */
	Touchpoints getTouchpointsContainer();

	/**
	 * Returns the value of the '<em><b>Update Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Descriptor</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Update Descriptor</em>' containment reference.
	 * @see #setUpdateDescriptor(IUpdateDescriptor)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_UpdateDescriptor()
	 * @model type="org.eclipse.b3.p2.IUpdateDescriptor" containment="true"
	 * @generated
	 */
	IUpdateDescriptor getUpdateDescriptor();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(ICopyright value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getLicensesContainer <em>Licenses Container</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Licenses Container</em>' containment reference.
	 * @see #getLicensesContainer()
	 * @generated
	 */
	void setLicensesContainer(Licenses value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getPropertiesContainer <em>Properties Container</em>}' containment
	 * reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Properties Container</em>' containment reference.
	 * @see #getPropertiesContainer()
	 * @generated
	 */
	void setPropertiesContainer(Properties value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getProvidedCapabilitiesContainer
	 * <em>Provided Capabilities Container</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Provided Capabilities Container</em>' containment reference.
	 * @see #getProvidedCapabilitiesContainer()
	 * @generated
	 */
	void setProvidedCapabilitiesContainer(ProvidedCapabilities value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getRequirementsContainer <em>Requirements Container</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Requirements Container</em>' containment reference.
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	void setRequirementsContainer(Requirements value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getTouchpointsContainer <em>Touchpoints Container</em>}' containment
	 * reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Touchpoints Container</em>' containment reference.
	 * @see #getTouchpointsContainer()
	 * @generated
	 */
	void setTouchpointsContainer(Touchpoints value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getUpdateDescriptor <em>Update Descriptor</em>}' containment
	 * reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Update Descriptor</em>' containment reference.
	 * @see #getUpdateDescriptor()
	 * @generated
	 */
	void setUpdateDescriptor(IUpdateDescriptor value);

} // IUDetails
