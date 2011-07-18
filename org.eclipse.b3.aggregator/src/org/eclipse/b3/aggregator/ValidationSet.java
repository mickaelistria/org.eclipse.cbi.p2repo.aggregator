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
 * A representation of the model object '<em><b>ValidationSet</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.ValidationSet#isAbstract <em>Abstract</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.ValidationSet#isExtension <em>Extension</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.ValidationSet#getLabel <em>Label</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.ValidationSet#getContributions <em>Contributions</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.ValidationSet#getValidationRepositories <em>Validation Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.ValidationSet#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage#getValidationSet()
 * @model
 * @generated
 */
public interface ValidationSet extends EnabledStatusProvider, DescriptionProvider, StatusProvider, InfosProvider,
		IdentificationProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	EList<Contribution> getAllContributions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	EList<MetadataRepositoryReference> getAllValidationRepositories();

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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getValidationSet_Contributions()
	 * @model containment="true" resolveProxies="true" keys="label"
	 * @generated
	 */
	EList<Contribution> getContributions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	EList<Contribution> getDeclaredContributions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	EList<MetadataRepositoryReference> getDeclaredValidationRepositories();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.ValidationSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getValidationSet_Extends()
	 * @model
	 * @generated
	 */
	EList<ValidationSet> getExtends();

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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getValidationSet_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

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
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getValidationSet_ValidationRepositories()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<MetadataRepositoryReference> getValidationRepositories();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getValidationSet_Abstract()
	 * @model default="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #isSetExtension()
	 * @see org.eclipse.b3.aggregator.AggregatorPackage#getValidationSet_Extension()
	 * @model default="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isExtension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean isExtensionOf(ValidationSet validationSet);

	/**
	 * Returns whether the value of the '{@link org.eclipse.b3.aggregator.ValidationSet#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #isAbstract()
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns whether the value of the '{@link org.eclipse.b3.aggregator.ValidationSet#isExtension <em>Extension</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Extension</em>' attribute is set.
	 * @see #isExtension()
	 * @generated
	 */
	boolean isSetExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.ValidationSet#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ValidationSet
