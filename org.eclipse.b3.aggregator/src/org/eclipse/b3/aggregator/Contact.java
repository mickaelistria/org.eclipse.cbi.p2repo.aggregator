/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Contact</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.Contact#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Contact#getEmail <em>Email</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Contact#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getContact()
 * @model
 * @generated
 */
public interface Contact {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.b3.aggregator.Aggregation#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregator</em>' container reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Aggregation</em>' container reference.
	 * @see #setAggregation(Aggregation)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getContact_Aggregation()
	 * @see org.eclipse.b3.aggregator.Aggregation#getContacts
	 * @model opposite="contacts" required="true" transient="false"
	 * @generated
	 */
	Aggregation getAggregation();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getContact_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getContact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Contact#getAggregation <em>Aggregation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Aggregation</em>' container reference.
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(Aggregation value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Contact#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Contact#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Contact
