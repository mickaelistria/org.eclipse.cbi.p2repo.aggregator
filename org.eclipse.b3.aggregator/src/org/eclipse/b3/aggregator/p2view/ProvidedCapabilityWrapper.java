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

import org.eclipse.b3.aggregator.LabelProvider;
import org.eclipse.equinox.p2.metadata.IProvidedCapability;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Provided Capability Wrapper</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.ProvidedCapabilityWrapper#getGenuine <em>Genuine</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getProvidedCapabilityWrapper()
 * @model superTypes="org.eclipse.b3.p2.IProvidedCapability org.eclipse.b3.aggregator.LabelProvider"
 * @generated
 */
public interface ProvidedCapabilityWrapper extends IProvidedCapability, LabelProvider {
	/**
	 * Returns the value of the '<em><b>Genuine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genuine</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Genuine</em>' reference.
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getProvidedCapabilityWrapper_Genuine()
	 * @model type="org.eclipse.b3.p2.IProvidedCapability" resolveProxies="false" required="true" changeable="false"
	 * @generated
	 */
	IProvidedCapability getGenuine();

} // ProvidedCapabilityWrapper
