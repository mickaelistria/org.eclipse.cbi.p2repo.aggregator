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
 * A representation of the model object '<em><b>Link Source</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.LinkSource#getReceiver <em>Receiver</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getLinkSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LinkSource {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(LinkReceiver)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getLinkSource_Receiver()
	 * @model
	 * @generated
	 */
	LinkReceiver getReceiver();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.LinkSource#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(LinkReceiver value);

} // LinkSource
