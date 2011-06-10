/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource View</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.AggregatorResourceView#getAggregator <em>Aggregator</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.AggregatorResourceView#getCompositeChildren <em>Composite Children</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregatorResourceView()
 * @model
 * @generated
 */
public interface AggregatorResourceView {
	/**
	 * Returns the value of the '<em><b>Aggregator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregator</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Aggregator</em>' containment reference.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregatorResourceView_Aggregator()
	 * @model containment="true" resolveProxies="true" keys="label" required="true" changeable="false"
	 * @generated
	 */
	Aggregator getAggregator();

	/**
	 * Returns the value of the '<em><b>Composite Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.CompositeChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CompositeChildren</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Composite Children</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregatorResourceView_CompositeChildren()
	 * @model containment="true" resolveProxies="true" keys="label"
	 * @generated
	 */
	EList<CompositeChild> getCompositeChildren();

} // AggregatorResourceView
