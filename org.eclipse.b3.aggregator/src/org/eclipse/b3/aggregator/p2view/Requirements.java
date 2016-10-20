/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.p2view;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.Requirements#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getRequirements()
 * @model
 * @generated
 */
public interface Requirements {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.p2view.RequirementWrapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getRequirements_Requirements()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<RequirementWrapper> getRequirements();

} // Requirements
