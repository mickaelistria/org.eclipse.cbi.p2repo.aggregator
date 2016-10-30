/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.util;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.AvailableVersion;
import org.eclipse.b3.aggregator.AvailableVersionsHeader;
import org.eclipse.b3.aggregator.Bundle;
import org.eclipse.b3.aggregator.Category;
import org.eclipse.b3.aggregator.ChildrenProvider;
import org.eclipse.b3.aggregator.Configuration;
import org.eclipse.b3.aggregator.Contact;
import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.CustomCategory;
import org.eclipse.b3.aggregator.DescriptionProvider;
import org.eclipse.b3.aggregator.EnabledStatusProvider;
import org.eclipse.b3.aggregator.ExclusionRule;
import org.eclipse.b3.aggregator.Feature;
import org.eclipse.b3.aggregator.IdentificationProvider;
import org.eclipse.b3.aggregator.InfosProvider;
import org.eclipse.b3.aggregator.InstallableUnitRequest;
import org.eclipse.b3.aggregator.LabelProvider;
import org.eclipse.b3.aggregator.MapRule;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.b3.aggregator.MavenItem;
import org.eclipse.b3.aggregator.MavenMapping;
import org.eclipse.b3.aggregator.MetadataRepositoryReference;
import org.eclipse.b3.aggregator.Product;
import org.eclipse.b3.aggregator.Property;
import org.eclipse.b3.aggregator.Status;
import org.eclipse.b3.aggregator.StatusProvider;
import org.eclipse.b3.aggregator.ValidConfigurationsRule;
import org.eclipse.b3.aggregator.ValidationSet;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.aggregator.AggregatorPackage
 * @generated
 */
public class AggregatorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static AggregatorPackage modelPackage;

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AggregatorSwitch<Adapter> modelSwitch = new AggregatorSwitch<Adapter>() {
		@Override
		public Adapter caseAggregation(Aggregation object) {
			return createAggregationAdapter();
		}

		@Override
		public Adapter caseAvailableVersion(AvailableVersion object) {
			return createAvailableVersionAdapter();
		}

		@Override
		public Adapter caseAvailableVersionsHeader(AvailableVersionsHeader object) {
			return createAvailableVersionsHeaderAdapter();
		}

		@Override
		public Adapter caseBundle(Bundle object) {
			return createBundleAdapter();
		}

		@Override
		public Adapter caseCategory(Category object) {
			return createCategoryAdapter();
		}

		@Override
		public <T> Adapter caseChildrenProvider(ChildrenProvider<T> object) {
			return createChildrenProviderAdapter();
		}

		@Override
		public <T> Adapter caseComparable(Comparable<T> object) {
			return createComparableAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter caseContact(Contact object) {
			return createContactAdapter();
		}

		@Override
		public Adapter caseContribution(Contribution object) {
			return createContributionAdapter();
		}

		@Override
		public Adapter caseCustomCategory(CustomCategory object) {
			return createCustomCategoryAdapter();
		}

		@Override
		public Adapter caseDescriptionProvider(DescriptionProvider object) {
			return createDescriptionProviderAdapter();
		}

		@Override
		public Adapter caseEnabledStatusProvider(EnabledStatusProvider object) {
			return createEnabledStatusProviderAdapter();
		}

		@Override
		public Adapter caseExclusionRule(ExclusionRule object) {
			return createExclusionRuleAdapter();
		}

		@Override
		public Adapter caseFeature(Feature object) {
			return createFeatureAdapter();
		}

		@Override
		public Adapter caseIdentificationProvider(IdentificationProvider object) {
			return createIdentificationProviderAdapter();
		}

		@Override
		public Adapter caseInfosProvider(InfosProvider object) {
			return createInfosProviderAdapter();
		}

		@Override
		public Adapter caseInstallableUnitRequest(InstallableUnitRequest object) {
			return createInstallableUnitRequestAdapter();
		}

		@Override
		public Adapter caseLabelProvider(LabelProvider object) {
			return createLabelProviderAdapter();
		}

		@Override
		public Adapter caseMappedRepository(MappedRepository object) {
			return createMappedRepositoryAdapter();
		}

		@Override
		public Adapter caseMappedUnit(MappedUnit object) {
			return createMappedUnitAdapter();
		}

		@Override
		public Adapter caseMapRule(MapRule object) {
			return createMapRuleAdapter();
		}

		@Override
		public Adapter caseMavenItem(MavenItem object) {
			return createMavenItemAdapter();
		}

		@Override
		public Adapter caseMavenMapping(MavenMapping object) {
			return createMavenMappingAdapter();
		}

		@Override
		public Adapter caseMetadataRepositoryReference(MetadataRepositoryReference object) {
			return createMetadataRepositoryReferenceAdapter();
		}

		@Override
		public Adapter caseProduct(Product object) {
			return createProductAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseStatus(Status object) {
			return createStatusAdapter();
		}

		@Override
		public Adapter caseStatusProvider(StatusProvider object) {
			return createStatusProviderAdapter();
		}

		@Override
		public Adapter caseValidationSet(ValidationSet object) {
			return createValidationSetAdapter();
		}

		@Override
		public Adapter caseValidConfigurationsRule(ValidConfigurationsRule object) {
			return createValidConfigurationsRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregatorAdapterFactory() {
		if(modelPackage == null) {
			modelPackage = AggregatorPackage.eINSTANCE;
		}
	}

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.AvailableVersion <em>Available Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.AvailableVersion
	 * @generated
	 */
	public Adapter createAvailableVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.AvailableVersionsHeader <em>Available Versions Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.AvailableVersionsHeader
	 * @generated
	 */
	public Adapter createAvailableVersionsHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Category
	 * <em>Category</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.ChildrenProvider <em>Children Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.ChildrenProvider
	 * @generated
	 */
	public Adapter createChildrenProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Comparable</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see java.lang.Comparable
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Configuration
	 * <em>Configuration</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Contribution
	 * <em>Contribution</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.CustomCategory <em>Custom Category</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.CustomCategory
	 * @generated
	 */
	public Adapter createCustomCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.DescriptionProvider <em>Description Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.DescriptionProvider
	 * @generated
	 */
	public Adapter createDescriptionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.EnabledStatusProvider <em>Enabled Status Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.EnabledStatusProvider
	 * @generated
	 */
	public Adapter createEnabledStatusProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.ExclusionRule
	 * <em>Exclusion Rule</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.ExclusionRule
	 * @generated
	 */
	public Adapter createExclusionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.IdentificationProvider <em>Identification Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.IdentificationProvider
	 * @generated
	 */
	public Adapter createIdentificationProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.InfosProvider
	 * <em>Infos Provider</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.InfosProvider
	 * @generated
	 */
	public Adapter createInfosProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.InstallableUnitRequest <em>Installable Unit Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.InstallableUnitRequest
	 * @generated
	 */
	public Adapter createInstallableUnitRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.LabelProvider
	 * <em>Label Provider</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.LabelProvider
	 * @generated
	 */
	public Adapter createLabelProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.MappedRepository <em>Mapped Repository</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.MappedRepository
	 * @generated
	 */
	public Adapter createMappedRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.MappedUnit
	 * <em>Mapped Unit</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.MappedUnit
	 * @generated
	 */
	public Adapter createMappedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.MapRule
	 * <em>Map Rule</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.MapRule
	 * @generated
	 */
	public Adapter createMapRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.MavenItem
	 * <em>Maven Item</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.MavenItem
	 * @generated
	 */
	public Adapter createMavenItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.MavenMapping
	 * <em>Maven Mapping</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.MavenMapping
	 * @generated
	 */
	public Adapter createMavenMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.MetadataRepositoryReference
	 * <em>Metadata Repository Reference</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.MetadataRepositoryReference
	 * @generated
	 */
	public Adapter createMetadataRepositoryReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Product <em>Product</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Property
	 * <em>Property</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.Status <em>Status</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
	 * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.StatusProvider <em>Status Provider</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.StatusProvider
	 * @generated
	 */
	public Adapter createStatusProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.ValidationSet <em>Validation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.ValidationSet
	 * @generated
	 */
	public Adapter createValidationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.aggregator.ValidConfigurationsRule <em>Valid Configurations Rule</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.eclipse.b3.aggregator.ValidConfigurationsRule
	 * @generated
	 */
	public Adapter createValidConfigurationsRuleAdapter() {
		return null;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if(object == modelPackage) {
			return true;
		}
		if(object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

} // AggregatorAdapterFactory
