/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Enabled Status Provider</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.EnabledStatusProvider#isBranchEnabled <em>Branch Enabled</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.EnabledStatusProvider#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getEnabledStatusProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EnabledStatusProvider {
	/**
	 * Returns the value of the '<em><b>Branch Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Enabled</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Branch Enabled</em>' attribute.
	 * @see #isSetBranchEnabled()
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getEnabledStatusProvider_BranchEnabled()
	 * @model default="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isBranchEnabled();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getEnabledStatusProvider_Enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Returns whether the value of the '{@link org.eclipse.b3.aggregator.EnabledStatusProvider#isBranchEnabled <em>Branch Enabled</em>}' attribute is
	 * set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>Branch Enabled</em>' attribute is set.
	 * @see #isBranchEnabled()
	 * @generated
	 */
	boolean isSetBranchEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.EnabledStatusProvider#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

} // EnabledStatusProvider
