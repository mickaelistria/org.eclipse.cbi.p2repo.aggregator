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
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getAggregations <em>Aggregations</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getConfigurations <em>Configurations</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getCustomCategories <em>Custom Categories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getBuildmaster <em>Buildmaster</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getContacts <em>Contacts</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getBuildRoot <em>Build Root</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getPackedStrategy <em>Packed Strategy</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#isSendmail <em>Sendmail</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#isMavenResult <em>Maven Result</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getValidationRepositories <em>Validation Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Composite#getMavenMappings <em>Maven Mappings</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends DescriptionProvider, StatusProvider, InfosProvider {
	/**
	 * Returns the value of the '<em><b>Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregations</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Aggregations</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_Aggregations()
	 * @model containment="true" resolveProxies="true" keys="label"
	 * @generated
	 */
	EList<Aggregation> getAggregations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EList<MetadataRepositoryReference> getAllMetadataRepositoryReferences(boolean enabledOnly);

	/**
	 * Returns the value of the '<em><b>Buildmaster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildmaster</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Buildmaster</em>' reference.
	 * @see #setBuildmaster(Contact)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_Buildmaster()
	 * @model keys="email"
	 * @generated
	 */
	Contact getBuildmaster();

	/**
	 * Returns the value of the '<em><b>Build Root</b></em>' attribute.
	 * The default value is <code>"${user.home}/build"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Root</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Build Root</em>' attribute.
	 * @see #setBuildRoot(String)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_BuildRoot()
	 * @model default="${user.home}/build"
	 * @generated
	 */
	String getBuildRoot();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_Configurations()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_Contacts()
	 * @model containment="true" resolveProxies="true" keys="email"
	 * @generated
	 */
	EList<Contact> getContacts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EList<Contribution> getContributions(boolean enabledOnly);

	/**
	 * Returns the value of the '<em><b>Custom Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.CustomCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Categories</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Custom Categories</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_CustomCategories()
	 * @model containment="true" resolveProxies="true" keys="identifier"
	 * @generated
	 */
	EList<CustomCategory> getCustomCategories();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Maven Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.MavenMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Mappings</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Maven Mappings</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_MavenMappings()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<MavenMapping> getMavenMappings();

	/**
	 * Returns the value of the '<em><b>Packed Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.aggregator.PackedStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packed Strategy</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Packed Strategy</em>' attribute.
	 * @see org.eclipse.b3.aggregator.PackedStrategy
	 * @see #setPackedStrategy(PackedStrategy)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_PackedStrategy()
	 * @model
	 * @generated
	 */
	PackedStrategy getPackedStrategy();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.aggregator.AggregateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.b3.aggregator.AggregateType
	 * @see #setType(AggregateType)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_Type()
	 * @model required="true"
	 * @generated
	 */
	AggregateType getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EList<MetadataRepositoryReference> getValidationRepositories(boolean enabledOnly);

	/**
	 * Returns the value of the '<em><b>Maven Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Result</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Maven Result</em>' attribute.
	 * @see #setMavenResult(boolean)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_MavenResult()
	 * @model
	 * @generated
	 */
	boolean isMavenResult();

	/**
	 * Returns the value of the '<em><b>Sendmail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendmail</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sendmail</em>' attribute.
	 * @see #setSendmail(boolean)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_Sendmail()
	 * @model
	 * @generated
	 */
	boolean isSendmail();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Composite#getBuildmaster <em>Buildmaster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Buildmaster</em>' reference.
	 * @see #getBuildmaster()
	 * @generated
	 */
	void setBuildmaster(Contact value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Composite#getBuildRoot <em>Build Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Build Root</em>' attribute.
	 * @see #getBuildRoot()
	 * @generated
	 */
	void setBuildRoot(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Composite#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Composite#isMavenResult <em>Maven Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Maven Result</em>' attribute.
	 * @see #isMavenResult()
	 * @generated
	 */
	void setMavenResult(boolean value);

	/**
	 * Returns the value of the '<em><b>Validation Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.MetadataRepositoryReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Repositories</em>' containment reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Validation Repositories</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getComposite_ValidationRepositories()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<MetadataRepositoryReference> getValidationRepositories();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Composite#getPackedStrategy <em>Packed Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Packed Strategy</em>' attribute.
	 * @see org.eclipse.b3.aggregator.PackedStrategy
	 * @see #getPackedStrategy()
	 * @generated
	 */
	void setPackedStrategy(PackedStrategy value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Composite#isSendmail <em>Sendmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sendmail</em>' attribute.
	 * @see #isSendmail()
	 * @generated
	 */
	void setSendmail(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Composite#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.b3.aggregator.AggregateType
	 * @see #getType()
	 * @generated
	 */
	void setType(AggregateType value);

} // Composite
