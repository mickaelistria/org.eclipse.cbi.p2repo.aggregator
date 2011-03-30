/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Aggregator</b></em>'.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getConfigurations <em>Configurations</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getContributions <em>Contributions</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getBuildmaster <em>Buildmaster</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getContacts <em>Contacts</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getCustomCategories <em>Custom Categories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getBuildRoot <em>Build Root</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getPackedStrategy <em>Packed Strategy</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#isSendmail <em>Sendmail</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#isMavenResult <em>Maven Result</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getValidationRepositories <em>Validation Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.Aggregation#getMavenMappings <em>Maven Mappings</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends EnabledStatusProvider, DescriptionProvider, StatusProvider, InfosProvider {
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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getAggregation_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.Aggregation#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Aggregation
