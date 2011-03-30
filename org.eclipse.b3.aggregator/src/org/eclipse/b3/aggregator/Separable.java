/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.Separable#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getSeparable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Separable {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Aggregation</em>' containment reference.
	 * @see #setAggregation(Aggregation)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getSeparable_Aggregation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Aggregation getAggregation();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Separable#getAggregation <em>Aggregation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Aggregation</em>' containment reference.
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(Aggregation value);

} // Separable
