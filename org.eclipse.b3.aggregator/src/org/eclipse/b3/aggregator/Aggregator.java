/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Aggregator</b></em>'.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getConfigurations <em>Configurations</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getContributions <em>Contributions</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getBuildmaster <em>Buildmaster</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getContacts <em>Contacts</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getCustomCategories <em>Custom Categories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getBuildRoot <em>Build Root</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getPackedStrategy <em>Packed Strategy</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#isSendmail <em>Sendmail</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#isMavenResult <em>Maven Result</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getValidationRepositories <em>Validation Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregator#getMavenMappings <em>Maven Mappings</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator()
 * @model
 * @generated
 */
public interface Aggregator extends DescriptionProvider, StatusProvider, InfosProvider {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EList<MetadataRepositoryReference> getAllMetadataRepositoryReferences(boolean enabledOnly);

	/**
	 * Returns the value of the '<em><b>Buildmaster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildmaster</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Buildmaster</em>' reference.
	 * @see #setBuildmaster(Contact)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_Buildmaster()
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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_BuildRoot()
	 * @model default="${user.home}/build"
	 * @generated
	 */
	String getBuildRoot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EList<Contribution> getCompositeChildContributions(CompositeChild compositeChild);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EList<Contribution> getCompositeChildContributions(CompositeChild compositeChild, boolean enabledOnly);

	/**
	 * Returns the value of the '<em><b>Composite Childs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.CompositeChild}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CompositeChilds</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Composite Childs</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_CompositeChilds()
	 * @model containment="true" resolveProxies="true" keys="label"
	 * @generated
	 */
	EList<CompositeChild> getCompositeChilds();

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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_Configurations()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.Contact}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.b3.aggregator.Contact#getAggregator <em>Aggregator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_Contacts()
	 * @see org.eclipse.b3.aggregator.Contact#getAggregator
	 * @model opposite="aggregator" containment="true" resolveProxies="true" keys="email"
	 * @generated
	 */
	EList<Contact> getContacts();

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.Contribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Contributions</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_Contributions()
	 * @model containment="true" resolveProxies="true" keys="label"
	 * @generated
	 */
	EList<Contribution> getContributions();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_CustomCategories()
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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Maven Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.MavenMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maven Mappings</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Maven Mappings</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_MavenMappings()
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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_PackedStrategy()
	 * @model
	 * @generated
	 */
	PackedStrategy getPackedStrategy();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.b3.aggregator.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.b3.aggregator.AggregationType
	 * @see #setType(AggregationType)
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_Type()
	 * @model required="true"
	 * @generated
	 */
	AggregationType getType();

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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_ValidationRepositories()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<MetadataRepositoryReference> getValidationRepositories();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_MavenResult()
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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregator_Sendmail()
	 * @model
	 * @generated
	 */
	boolean isSendmail();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregator#getBuildmaster <em>Buildmaster</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Buildmaster</em>' reference.
	 * @see #getBuildmaster()
	 * @generated
	 */
	void setBuildmaster(Contact value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregator#getBuildRoot <em>Build Root</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Build Root</em>' attribute.
	 * @see #getBuildRoot()
	 * @generated
	 */
	void setBuildRoot(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregator#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregator#isMavenResult <em>Maven Result</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Maven Result</em>' attribute.
	 * @see #isMavenResult()
	 * @generated
	 */
	void setMavenResult(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregator#getPackedStrategy <em>Packed Strategy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Packed Strategy</em>' attribute.
	 * @see org.eclipse.b3.aggregator.PackedStrategy
	 * @see #getPackedStrategy()
	 * @generated
	 */
	void setPackedStrategy(PackedStrategy value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregator#isSendmail <em>Sendmail</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sendmail</em>' attribute.
	 * @see #isSendmail()
	 * @generated
	 */
	void setSendmail(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.b3.aggregator.AggregationType
	 * @see #getType()
	 * @generated
	 */
	void setType(AggregationType value);

} // Aggregator
