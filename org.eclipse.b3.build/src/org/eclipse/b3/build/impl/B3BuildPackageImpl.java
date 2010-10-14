/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */

package org.eclipse.b3.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.build.AliasedRequiredCapability;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BeeHive;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BeeModelRepository;
import org.eclipse.b3.build.BestFoundUnitProvider;
import org.eclipse.b3.build.Branch;
import org.eclipse.b3.build.BranchPointType;
import org.eclipse.b3.build.BuildCallMultiple;
import org.eclipse.b3.build.BuildCallOnDeclaredRequirement;
import org.eclipse.b3.build.BuildCallOnReferencedRequirement;
import org.eclipse.b3.build.BuildCallOnSelectedRequirements;
import org.eclipse.b3.build.BuildCallSingle;
import org.eclipse.b3.build.BuildConcernContext;
import org.eclipse.b3.build.BuildResultContext;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.BuildUnitRepository;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.BuilderCall;
import org.eclipse.b3.build.BuilderCallFacade;
import org.eclipse.b3.build.BuilderConcernContext;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderInputCondition;
import org.eclipse.b3.build.BuilderInputContextDecorator;
import org.eclipse.b3.build.BuilderInputDecorator;
import org.eclipse.b3.build.BuilderInputGroup;
import org.eclipse.b3.build.BuilderInputNameDecorator;
import org.eclipse.b3.build.BuilderJava;
import org.eclipse.b3.build.BuilderNamePredicate;
import org.eclipse.b3.build.BuilderQuery;
import org.eclipse.b3.build.BuilderWrapper;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.CompoundBuildUnitRepository;
import org.eclipse.b3.build.CompoundFirstFoundRepository;
import org.eclipse.b3.build.CompoundUnitProvider;
import org.eclipse.b3.build.ConditionalPathVector;
import org.eclipse.b3.build.ContainerConfiguration;
import org.eclipse.b3.build.DelegatingUnitProvider;
import org.eclipse.b3.build.EffectiveBuilderCallFacade;
import org.eclipse.b3.build.EffectiveCapabilityFacade;
import org.eclipse.b3.build.EffectiveFacade;
import org.eclipse.b3.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.EffectiveUnitFacade;
import org.eclipse.b3.build.ExecutionStackRepository;
import org.eclipse.b3.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.FragmentHost;
import org.eclipse.b3.build.IBuildUnitContainer;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.IEffectiveFacade;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.ImplementsPredicate;
import org.eclipse.b3.build.InputPredicate;
import org.eclipse.b3.build.MergeConflictStrategy;
import org.eclipse.b3.build.NameSpacePredicate;
import org.eclipse.b3.build.OutputPredicate;
import org.eclipse.b3.build.PathGroup;
import org.eclipse.b3.build.PathGroupPredicate;
import org.eclipse.b3.build.PathVector;
import org.eclipse.b3.build.ProvidesPredicate;
import org.eclipse.b3.build.RepoOption;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RepositoryUnitProvider;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.RequiresPredicate;
import org.eclipse.b3.build.ResolutionInfo;
import org.eclipse.b3.build.SourcePredicate;
import org.eclipse.b3.build.SwitchUnitProvider;
import org.eclipse.b3.build.Synchronization;
import org.eclipse.b3.build.TriState;
import org.eclipse.b3.build.UnitConcernContext;
import org.eclipse.b3.build.UnitNamePredicate;
import org.eclipse.b3.build.UnitParameterDeclaration;
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.b3.build.UnitRepositoryDescription;
import org.eclipse.b3.build.UnitResolutionInfo;
import org.eclipse.b3.build.VersionedCapability;
import org.eclipse.b3.build.core.B3BuilderJob;
import org.eclipse.b3.build.core.iterators.PathIterator;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.b3.build.util.B3BuildValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;
import org.eclipse.equinox.p2.metadata.expression.IMatchExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class B3BuildPackageImpl extends EPackageImpl implements B3BuildPackage {
	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link B3BuildPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static B3BuildPackage init() {
		if(isInited)
			return (B3BuildPackage) EPackage.Registry.INSTANCE.getEPackage(B3BuildPackage.eNS_URI);

		// Obtain or create and register package
		B3BuildPackageImpl theB3BuildPackage = (B3BuildPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof B3BuildPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new B3BuildPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		B3backendPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theB3BuildPackage.createPackageContents();

		// Initialize created meta-data
		theB3BuildPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theB3BuildPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return B3BuildValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theB3BuildPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(B3BuildPackage.eNS_URI, theB3BuildPackage);
		return theB3BuildPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderJavaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass beeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass beeHiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resolutionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass effectiveFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass effectiveUnitFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass effectiveRequirementFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass effectiveCapabilityFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderCallFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass effectiveBuilderCallFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iBuildUnitContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass fragmentHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass unitParameterDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildResultContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass outputPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sourcePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildUnitRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass compoundBuildUnitRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass compoundFirstFoundRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass executionStackRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass beeModelRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iBuildUnitRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass unitResolutionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass switchUnitProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass delegatingUnitProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass repoOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass unitRepositoryDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildCallOnSelectedRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderInputNameDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderInputContextDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderInputConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildCallMultipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildCallSingleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildCallOnDeclaredRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildCallOnReferencedRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderInputGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iEffectiveFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum mergeConflictStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum branchPointTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum triStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass versionedCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass requiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass conditionalPathVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass pathVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass synchronizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass unitProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass repositoryUnitProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass compoundUnitProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass firstFoundUnitProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bestFoundUnitProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass containerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass buildConcernContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass requiresPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass capabilityPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass implementsPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass providesPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nameSpacePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass unitNamePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderNamePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass inputPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass unitConcernContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderConcernContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass pathGroupPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass aliasedRequiredCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iRequiredCapabilityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iProvidedCapabilityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass pathGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderInputDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass builderCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType versionRangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iStatusEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType pathIteratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType b3BuilderJobEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iMatchExpressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iInstallableUnitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.b3.build.B3BuildPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private B3BuildPackageImpl() {
		super(eNS_URI, B3BuildFactory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if(isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		buildUnitEClass = createEClass(BUILD_UNIT);
		createEReference(buildUnitEClass, BUILD_UNIT__BUILDERS);
		createEAttribute(buildUnitEClass, BUILD_UNIT__DOCUMENTATION);
		createEAttribute(buildUnitEClass, BUILD_UNIT__EXECUTION_MODE);
		createEReference(buildUnitEClass, BUILD_UNIT__META_REQUIRED_CAPABILITIES);
		createEReference(buildUnitEClass, BUILD_UNIT__IMPLEMENTS);
		createEReference(buildUnitEClass, BUILD_UNIT__CONCERNS);
		createEReference(buildUnitEClass, BUILD_UNIT__DEFAULT_PROPERTIES);
		createEReference(buildUnitEClass, BUILD_UNIT__SYNCHRONIZATIONS);
		createEReference(buildUnitEClass, BUILD_UNIT__REPOSITORIES);
		createEReference(buildUnitEClass, BUILD_UNIT__CONTAINERS);
		createEReference(buildUnitEClass, BUILD_UNIT__PROPERTY_SETS);
		createEAttribute(buildUnitEClass, BUILD_UNIT__SOURCE_LOCATION);
		createEAttribute(buildUnitEClass, BUILD_UNIT__OUTPUT_LOCATION);
		createEReference(buildUnitEClass, BUILD_UNIT__PROVIDERS);
		createEReference(buildUnitEClass, BUILD_UNIT__PARENT);
		createEReference(buildUnitEClass, BUILD_UNIT__FRAGMENT_HOSTS);
		createEAttribute(buildUnitEClass, BUILD_UNIT__PLATFORM_FILTER);

		iBuilderEClass = createEClass(IBUILDER);
		createEReference(iBuilderEClass, IBUILDER__POSTCOND_EXPR);
		createEReference(iBuilderEClass, IBUILDER__PRECOND_EXPR);
		createEReference(iBuilderEClass, IBUILDER__INPUT);
		createEReference(iBuilderEClass, IBUILDER__OUTPUT);
		createEReference(iBuilderEClass, IBUILDER__DEFAULT_PROPERTIES);
		createEReference(iBuilderEClass, IBUILDER__POSTINPUTCOND_EXPR);
		createEAttribute(iBuilderEClass, IBUILDER__UNIT_TYPE);
		createEReference(iBuilderEClass, IBUILDER__EXPLICIT_UNIT_TYPE);
		createEReference(iBuilderEClass, IBUILDER__SOURCE);

		versionedCapabilityEClass = createEClass(VERSIONED_CAPABILITY);
		createEAttribute(versionedCapabilityEClass, VERSIONED_CAPABILITY__VERSION);

		builderInputEClass = createEClass(BUILDER_INPUT);

		pathGroupEClass = createEClass(PATH_GROUP);
		createEReference(pathGroupEClass, PATH_GROUP__ANNOTATIONS);
		createEReference(pathGroupEClass, PATH_GROUP__PATH_VECTORS);

		builderInputDecoratorEClass = createEClass(BUILDER_INPUT_DECORATOR);
		createEReference(builderInputDecoratorEClass, BUILDER_INPUT_DECORATOR__BUILDER_INPUT);

		builderCallEClass = createEClass(BUILDER_CALL);
		createEReference(builderCallEClass, BUILDER_CALL__PARAMETERS);
		createEAttribute(builderCallEClass, BUILDER_CALL__BUILDER_NAME);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__NAME_SPACE);
		createEReference(capabilityEClass, CAPABILITY__COND_EXPR);

		requiredCapabilityEClass = createEClass(REQUIRED_CAPABILITY);
		createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__VERSION_RANGE);
		createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__GREEDY);
		createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__MAX);
		createEAttribute(requiredCapabilityEClass, REQUIRED_CAPABILITY__MIN);

		conditionalPathVectorEClass = createEClass(CONDITIONAL_PATH_VECTOR);
		createEReference(conditionalPathVectorEClass, CONDITIONAL_PATH_VECTOR__COND_EXPR);
		createEReference(conditionalPathVectorEClass, CONDITIONAL_PATH_VECTOR__PATH_VECTORS);

		pathVectorEClass = createEClass(PATH_VECTOR);
		createEAttribute(pathVectorEClass, PATH_VECTOR__PATHS);
		createEAttribute(pathVectorEClass, PATH_VECTOR__BASE_PATH);

		synchronizationEClass = createEClass(SYNCHRONIZATION);
		createEReference(synchronizationEClass, SYNCHRONIZATION__BUILDER_QUERIES);

		unitProviderEClass = createEClass(UNIT_PROVIDER);
		createEAttribute(unitProviderEClass, UNIT_PROVIDER__DOCUMENTATION);

		repositoryUnitProviderEClass = createEClass(REPOSITORY_UNIT_PROVIDER);
		createEReference(repositoryUnitProviderEClass, REPOSITORY_UNIT_PROVIDER__REPOSITORY);
		createEReference(repositoryUnitProviderEClass, REPOSITORY_UNIT_PROVIDER__OPTIONS);
		createEReference(repositoryUnitProviderEClass, REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY);

		compoundUnitProviderEClass = createEClass(COMPOUND_UNIT_PROVIDER);
		createEReference(compoundUnitProviderEClass, COMPOUND_UNIT_PROVIDER__PROVIDERS);

		firstFoundUnitProviderEClass = createEClass(FIRST_FOUND_UNIT_PROVIDER);

		bestFoundUnitProviderEClass = createEClass(BEST_FOUND_UNIT_PROVIDER);

		containerConfigurationEClass = createEClass(CONTAINER_CONFIGURATION);
		createEAttribute(containerConfigurationEClass, CONTAINER_CONFIGURATION__DOCUMENTATION);
		createEAttribute(containerConfigurationEClass, CONTAINER_CONFIGURATION__NAME);
		createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__AGENT_TYPE);
		createEReference(containerConfigurationEClass, CONTAINER_CONFIGURATION__CONTEXT_BLOCK);

		buildConcernContextEClass = createEClass(BUILD_CONCERN_CONTEXT);
		createEAttribute(buildConcernContextEClass, BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS);
		createEReference(buildConcernContextEClass, BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS);

		requiresPredicateEClass = createEClass(REQUIRES_PREDICATE);
		createEReference(requiresPredicateEClass, REQUIRES_PREDICATE__CAPABILITY_PREDICATE);
		createEAttribute(requiresPredicateEClass, REQUIRES_PREDICATE__META);

		capabilityPredicateEClass = createEClass(CAPABILITY_PREDICATE);
		createEAttribute(capabilityPredicateEClass, CAPABILITY_PREDICATE__VERSION_RANGE);
		createEReference(capabilityPredicateEClass, CAPABILITY_PREDICATE__NAME_PREDICATE);
		createEReference(capabilityPredicateEClass, CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE);

		implementsPredicateEClass = createEClass(IMPLEMENTS_PREDICATE);
		createEReference(implementsPredicateEClass, IMPLEMENTS_PREDICATE__TYPE);

		providesPredicateEClass = createEClass(PROVIDES_PREDICATE);
		createEReference(providesPredicateEClass, PROVIDES_PREDICATE__CAPABILITY_PREDICATE);

		nameSpacePredicateEClass = createEClass(NAME_SPACE_PREDICATE);
		createEAttribute(nameSpacePredicateEClass, NAME_SPACE_PREDICATE__NAME_SPACE);

		unitNamePredicateEClass = createEClass(UNIT_NAME_PREDICATE);

		builderNamePredicateEClass = createEClass(BUILDER_NAME_PREDICATE);
		createEReference(builderNamePredicateEClass, BUILDER_NAME_PREDICATE__NAME_PREDICATE);

		inputPredicateEClass = createEClass(INPUT_PREDICATE);
		createEReference(inputPredicateEClass, INPUT_PREDICATE__CAPABILITY_PREDICATE);
		createEReference(inputPredicateEClass, INPUT_PREDICATE__BUILDER_PREDICATE);

		unitConcernContextEClass = createEClass(UNIT_CONCERN_CONTEXT);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__QUERY);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS);
		createEAttribute(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__SOURCE_LOCATION);
		createEAttribute(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION);
		createEReference(unitConcernContextEClass, UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS);

		builderConcernContextEClass = createEClass(BUILDER_CONCERN_CONTEXT);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__QUERY);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__FUNC_EXPR);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__VAR_ARGS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__PARAMETERS);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__PRECOND_EXPR);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS);
		createEAttribute(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS);
		createEReference(builderConcernContextEClass, BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS);

		pathGroupPredicateEClass = createEClass(PATH_GROUP_PREDICATE);
		createEReference(pathGroupPredicateEClass, PATH_GROUP_PREDICATE__PATH_VECTOR);
		createEReference(pathGroupPredicateEClass, PATH_GROUP_PREDICATE__PATH_PATTERN);

		aliasedRequiredCapabilityEClass = createEClass(ALIASED_REQUIRED_CAPABILITY);
		createEAttribute(aliasedRequiredCapabilityEClass, ALIASED_REQUIRED_CAPABILITY__ALIAS);

		iRequiredCapabilityContainerEClass = createEClass(IREQUIRED_CAPABILITY_CONTAINER);
		createEReference(iRequiredCapabilityContainerEClass, IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES);
		createEReference(iRequiredCapabilityContainerEClass, IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_PREDICATES);

		iProvidedCapabilityContainerEClass = createEClass(IPROVIDED_CAPABILITY_CONTAINER);
		createEReference(iProvidedCapabilityContainerEClass, IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES);

		builderQueryEClass = createEClass(BUILDER_QUERY);
		createEReference(builderQueryEClass, BUILDER_QUERY__BUILDER_QUERIES);
		createEReference(builderQueryEClass, BUILDER_QUERY__UNIT_QUERY);

		builderEClass = createEClass(BUILDER);

		builderJavaEClass = createEClass(BUILDER_JAVA);

		builderWrapperEClass = createEClass(BUILDER_WRAPPER);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__INPUT_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__OUTPUT_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__UNIT_TYPE_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__PROVIDES_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED);
		createEAttribute(builderWrapperEClass, BUILDER_WRAPPER__SOURCE_ADVISED);

		beeModelEClass = createEClass(BEE_MODEL);
		createEReference(beeModelEClass, BEE_MODEL__IMPORTS);
		createEReference(beeModelEClass, BEE_MODEL__FUNCTIONS);
		createEReference(beeModelEClass, BEE_MODEL__CONCERNS);
		createEReference(beeModelEClass, BEE_MODEL__PROPERTY_SETS);
		createEReference(beeModelEClass, BEE_MODEL__REPOSITORIES);
		createEReference(beeModelEClass, BEE_MODEL__PROVIDERS);
		createEReference(beeModelEClass, BEE_MODEL__DEFAULT_PROPERTIES);

		beeHiveEClass = createEClass(BEE_HIVE);
		createEReference(beeHiveEClass, BEE_HIVE__BEE_MODELS);
		createEReference(beeHiveEClass, BEE_HIVE__PARENT);
		createEAttribute(beeHiveEClass, BEE_HIVE__RESOLUTIONS);

		resolutionInfoEClass = createEClass(RESOLUTION_INFO);
		createEAttribute(resolutionInfoEClass, RESOLUTION_INFO__STATUS);

		effectiveFacadeEClass = createEClass(EFFECTIVE_FACADE);

		effectiveUnitFacadeEClass = createEClass(EFFECTIVE_UNIT_FACADE);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__UNIT);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES);
		createEReference(effectiveUnitFacadeEClass, EFFECTIVE_UNIT_FACADE__UNIT_REQUIRED_CAPABILITIES);

		effectiveRequirementFacadeEClass = createEClass(EFFECTIVE_REQUIREMENT_FACADE);
		createEReference(effectiveRequirementFacadeEClass, EFFECTIVE_REQUIREMENT_FACADE__REQUIREMENT);

		effectiveCapabilityFacadeEClass = createEClass(EFFECTIVE_CAPABILITY_FACADE);
		createEReference(effectiveCapabilityFacadeEClass, EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY);

		builderCallFacadeEClass = createEClass(BUILDER_CALL_FACADE);
		createEReference(builderCallFacadeEClass, BUILDER_CALL_FACADE__BUILDER_REFERENCE);
		createEAttribute(builderCallFacadeEClass, BUILDER_CALL_FACADE__ALIASES);
		createEReference(builderCallFacadeEClass, BUILDER_CALL_FACADE__REQUIRED_CAPABILITY);

		buildSetEClass = createEClass(BUILD_SET);
		createEReference(buildSetEClass, BUILD_SET__PATH_VECTORS);
		createEAttribute(buildSetEClass, BUILD_SET__VALUE_MAP);
		createEAttribute(buildSetEClass, BUILD_SET__PATH_ITERATOR);

		buildResultContextEClass = createEClass(BUILD_RESULT_CONTEXT);

		outputPredicateEClass = createEClass(OUTPUT_PREDICATE);

		sourcePredicateEClass = createEClass(SOURCE_PREDICATE);

		buildUnitRepositoryEClass = createEClass(BUILD_UNIT_REPOSITORY);

		compoundBuildUnitRepositoryEClass = createEClass(COMPOUND_BUILD_UNIT_REPOSITORY);
		createEReference(compoundBuildUnitRepositoryEClass, COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES);

		compoundFirstFoundRepositoryEClass = createEClass(COMPOUND_FIRST_FOUND_REPOSITORY);

		executionStackRepositoryEClass = createEClass(EXECUTION_STACK_REPOSITORY);

		beeModelRepositoryEClass = createEClass(BEE_MODEL_REPOSITORY);
		createEReference(beeModelRepositoryEClass, BEE_MODEL_REPOSITORY__BEE_MODELS);

		iBuildUnitRepositoryEClass = createEClass(IBUILD_UNIT_REPOSITORY);

		unitResolutionInfoEClass = createEClass(UNIT_RESOLUTION_INFO);
		createEReference(unitResolutionInfoEClass, UNIT_RESOLUTION_INFO__UNIT);
		createEReference(unitResolutionInfoEClass, UNIT_RESOLUTION_INFO__CONTEXT);

		switchUnitProviderEClass = createEClass(SWITCH_UNIT_PROVIDER);
		createEReference(switchUnitProviderEClass, SWITCH_UNIT_PROVIDER__REPO_SWITCH);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__NAME);
		createEReference(repositoryEClass, REPOSITORY__BRANCHES);
		createEAttribute(repositoryEClass, REPOSITORY__DOCUMENTATION);
		createEAttribute(repositoryEClass, REPOSITORY__HANDLER_TYPE);
		createEReference(repositoryEClass, REPOSITORY__OPTIONS);
		createEReference(repositoryEClass, REPOSITORY__BUILD_UNIT_REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__ADDRESS);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__NAME);
		createEAttribute(branchEClass, BRANCH__DOCUMENTATION);
		createEAttribute(branchEClass, BRANCH__BRANCH_POINT_TYPE);
		createEReference(branchEClass, BRANCH__INCLUDE);
		createEReference(branchEClass, BRANCH__EXCLUDE);
		createEReference(branchEClass, BRANCH__BRANCH_POINT);
		createEAttribute(branchEClass, BRANCH__MERGE_STRATEGY);
		createEAttribute(branchEClass, BRANCH__CHECKOUT);
		createEAttribute(branchEClass, BRANCH__ACCEPT_DIRTY);
		createEAttribute(branchEClass, BRANCH__UPDATE);
		createEAttribute(branchEClass, BRANCH__REPLACE);

		delegatingUnitProviderEClass = createEClass(DELEGATING_UNIT_PROVIDER);
		createEReference(delegatingUnitProviderEClass, DELEGATING_UNIT_PROVIDER__DELEGATE);

		repoOptionEClass = createEClass(REPO_OPTION);
		createEAttribute(repoOptionEClass, REPO_OPTION__NAME);
		createEReference(repoOptionEClass, REPO_OPTION__EXPR);

		unitRepositoryDescriptionEClass = createEClass(UNIT_REPOSITORY_DESCRIPTION);
		createEReference(unitRepositoryDescriptionEClass, UNIT_REPOSITORY_DESCRIPTION__REPOSITORY);
		createEAttribute(unitRepositoryDescriptionEClass, UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS);

		buildCallOnSelectedRequirementsEClass = createEClass(BUILD_CALL_ON_SELECTED_REQUIREMENTS);
		createEReference(buildCallOnSelectedRequirementsEClass, BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE);

		builderInputNameDecoratorEClass = createEClass(BUILDER_INPUT_NAME_DECORATOR);

		builderInputContextDecoratorEClass = createEClass(BUILDER_INPUT_CONTEXT_DECORATOR);
		createEReference(builderInputContextDecoratorEClass, BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR);

		builderInputConditionEClass = createEClass(BUILDER_INPUT_CONDITION);
		createEReference(builderInputConditionEClass, BUILDER_INPUT_CONDITION__COND_EXPR);

		buildCallMultipleEClass = createEClass(BUILD_CALL_MULTIPLE);

		buildCallSingleEClass = createEClass(BUILD_CALL_SINGLE);
		createEReference(buildCallSingleEClass, BUILD_CALL_SINGLE__REQUIRED_CAPABILITY);

		buildCallOnDeclaredRequirementEClass = createEClass(BUILD_CALL_ON_DECLARED_REQUIREMENT);
		createEReference(
			buildCallOnDeclaredRequirementEClass, BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION);

		buildCallOnReferencedRequirementEClass = createEClass(BUILD_CALL_ON_REFERENCED_REQUIREMENT);
		createEReference(
			buildCallOnReferencedRequirementEClass, BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE);

		builderInputGroupEClass = createEClass(BUILDER_INPUT_GROUP);

		iEffectiveFacadeEClass = createEClass(IEFFECTIVE_FACADE);
		createEReference(iEffectiveFacadeEClass, IEFFECTIVE_FACADE__CONTEXT);

		effectiveBuilderCallFacadeEClass = createEClass(EFFECTIVE_BUILDER_CALL_FACADE);

		iBuildUnitContainerEClass = createEClass(IBUILD_UNIT_CONTAINER);
		createEReference(iBuildUnitContainerEClass, IBUILD_UNIT_CONTAINER__BUILD_UNITS);

		fragmentHostEClass = createEClass(FRAGMENT_HOST);
		createEReference(fragmentHostEClass, FRAGMENT_HOST__HOST_REQUIREMENTS);

		unitParameterDeclarationEClass = createEClass(UNIT_PARAMETER_DECLARATION);

		// Create enums
		mergeConflictStrategyEEnum = createEEnum(MERGE_CONFLICT_STRATEGY);
		branchPointTypeEEnum = createEEnum(BRANCH_POINT_TYPE);
		triStateEEnum = createEEnum(TRI_STATE);

		// Create data types
		versionRangeEDataType = createEDataType(VERSION_RANGE);
		versionEDataType = createEDataType(VERSION);
		iStatusEDataType = createEDataType(ISTATUS);
		pathIteratorEDataType = createEDataType(PATH_ITERATOR);
		b3BuilderJobEDataType = createEDataType(B3_BUILDER_JOB);
		iMatchExpressionEDataType = createEDataType(IMATCH_EXPRESSION);
		iInstallableUnitEDataType = createEDataType(IINSTALLABLE_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAliasedRequiredCapability() {
		return aliasedRequiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAliasedRequiredCapability_Alias() {
		return (EAttribute) aliasedRequiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getB3BuilderJob() {
		return b3BuilderJobEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public B3BuildFactory getB3BuildFactory() {
		return (B3BuildFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBeeHive() {
		return beeHiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeHive_BeeModels() {
		return (EReference) beeHiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeHive_Parent() {
		return (EReference) beeHiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBeeHive_Resolutions() {
		return (EAttribute) beeHiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBeeModel() {
		return beeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModel_Concerns() {
		return (EReference) beeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModel_DefaultProperties() {
		return (EReference) beeModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModel_Functions() {
		return (EReference) beeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModel_Imports() {
		return (EReference) beeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModel_PropertySets() {
		return (EReference) beeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModel_Providers() {
		return (EReference) beeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModel_Repositories() {
		return (EReference) beeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBeeModelRepository() {
		return beeModelRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBeeModelRepository_BeeModels() {
		return (EReference) beeModelRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBestFoundUnitProvider() {
		return bestFoundUnitProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_AcceptDirty() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBranch_BranchPoint() {
		return (EReference) branchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_BranchPointType() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_Checkout() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_Documentation() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBranch_Exclude() {
		return (EReference) branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBranch_Include() {
		return (EReference) branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_MergeStrategy() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_Name() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_Replace() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBranch_Update() {
		return (EAttribute) branchEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getBranchPointType() {
		return branchPointTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildCallMultiple() {
		return buildCallMultipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildCallOnDeclaredRequirement() {
		return buildCallOnDeclaredRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildCallOnDeclaredRequirement_RequiredCapabilityDeclaration() {
		return (EReference) buildCallOnDeclaredRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildCallOnReferencedRequirement() {
		return buildCallOnReferencedRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildCallOnReferencedRequirement_RequiredCapabilityReference() {
		return (EReference) buildCallOnReferencedRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildCallOnSelectedRequirements() {
		return buildCallOnSelectedRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildCallOnSelectedRequirements_RequiredPredicate() {
		return (EReference) buildCallOnSelectedRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildCallSingle() {
		return buildCallSingleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildCallSingle_RequiredCapability() {
		return (EReference) buildCallSingleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildConcernContext() {
		return buildConcernContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildConcernContext_DefaultPropertiesAdditions() {
		return (EReference) buildConcernContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildConcernContext_DefaultPropertiesRemovals() {
		return (EAttribute) buildConcernContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilder() {
		return builderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderCall() {
		return builderCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderCall_BuilderName() {
		return (EAttribute) builderCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderCall_Parameters() {
		return (EReference) builderCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderCallFacade() {
		return builderCallFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderCallFacade_Aliases() {
		return (EAttribute) builderCallFacadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderCallFacade_BuilderReference() {
		return (EReference) builderCallFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderCallFacade_RequiredCapability() {
		return (EReference) builderCallFacadeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderConcernContext() {
		return builderConcernContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_FuncExpr() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_InputAdditions() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_InputRemovals() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_MatchParameters() {
		return (EAttribute) builderConcernContextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_OutputAdditions() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_OutputAnnotationAdditions() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_OutputAnnotationsRemovals() {
		return (EAttribute) builderConcernContextEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_OutputRemovals() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_Parameters() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_PostcondExpr() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_PostinputcondExpr() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_PrecondExpr() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_ProvidesRemovals() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_Query() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_RemovePostCondition() {
		return (EAttribute) builderConcernContextEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_RemovePostInputCondition() {
		return (EAttribute) builderConcernContextEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_RemovePreCondition() {
		return (EAttribute) builderConcernContextEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_SourceAdditions() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_SourceAnnotationAdditions() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_SourceAnnotationsRemovals() {
		return (EAttribute) builderConcernContextEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderConcernContext_SourceRemovals() {
		return (EReference) builderConcernContextEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderConcernContext_VarArgs() {
		return (EAttribute) builderConcernContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderInput() {
		return builderInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderInputCondition() {
		return builderInputConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderInputCondition_CondExpr() {
		return (EReference) builderInputConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderInputContextDecorator() {
		return builderInputContextDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderInputContextDecorator_WithExpr() {
		return (EReference) builderInputContextDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderInputDecorator() {
		return builderInputDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderInputDecorator_BuilderInput() {
		return (EReference) builderInputDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderInputGroup() {
		return builderInputGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderInputNameDecorator() {
		return builderInputNameDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderJava() {
		return builderJavaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderNamePredicate() {
		return builderNamePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderNamePredicate_NamePredicate() {
		return (EReference) builderNamePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderQuery() {
		return builderQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderQuery_BuilderQueries() {
		return (EReference) builderQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuilderQuery_UnitQuery() {
		return (EReference) builderQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuilderWrapper() {
		return builderWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderWrapper_DefaultPropertiesAdvised() {
		return (EAttribute) builderWrapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderWrapper_InputAdvised() {
		return (EAttribute) builderWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderWrapper_OutputAdvised() {
		return (EAttribute) builderWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderWrapper_ProvidesAdvised() {
		return (EAttribute) builderWrapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderWrapper_SourceAdvised() {
		return (EAttribute) builderWrapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuilderWrapper_UnitTypeAdvised() {
		return (EAttribute) builderWrapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildResultContext() {
		return buildResultContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildSet() {
		return buildSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildSet_PathIterator() {
		return (EAttribute) buildSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildSet_PathVectors() {
		return (EReference) buildSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildSet_ValueMap() {
		return (EAttribute) buildSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildUnit() {
		return buildUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Builders() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Concerns() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Containers() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_DefaultProperties() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildUnit_Documentation() {
		return (EAttribute) buildUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildUnit_ExecutionMode() {
		return (EAttribute) buildUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_FragmentHosts() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Implements() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_MetaRequiredCapabilities() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildUnit_OutputLocation() {
		return (EAttribute) buildUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Parent() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildUnit_PlatformFilter() {
		return (EAttribute) buildUnitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_PropertySets() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Providers() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Repositories() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBuildUnit_SourceLocation() {
		return (EAttribute) buildUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBuildUnit_Synchronizations() {
		return (EReference) buildUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBuildUnitRepository() {
		return buildUnitRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCapability_CondExpr() {
		return (EReference) capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCapability_NameSpace() {
		return (EAttribute) capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCapabilityPredicate() {
		return capabilityPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCapabilityPredicate_NamePredicate() {
		return (EReference) capabilityPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCapabilityPredicate_NameSpacePredicate() {
		return (EReference) capabilityPredicateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCapabilityPredicate_VersionRange() {
		return (EAttribute) capabilityPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCompoundBuildUnitRepository() {
		return compoundBuildUnitRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCompoundBuildUnitRepository_Repositories() {
		return (EReference) compoundBuildUnitRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCompoundFirstFoundRepository() {
		return compoundFirstFoundRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCompoundUnitProvider() {
		return compoundUnitProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCompoundUnitProvider_Providers() {
		return (EReference) compoundUnitProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConditionalPathVector() {
		return conditionalPathVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getConditionalPathVector_CondExpr() {
		return (EReference) conditionalPathVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getConditionalPathVector_PathVectors() {
		return (EReference) conditionalPathVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getContainerConfiguration() {
		return containerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getContainerConfiguration_AgentType() {
		return (EReference) containerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getContainerConfiguration_ContextBlock() {
		return (EReference) containerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getContainerConfiguration_Documentation() {
		return (EAttribute) containerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getContainerConfiguration_Name() {
		return (EAttribute) containerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDelegatingUnitProvider() {
		return delegatingUnitProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDelegatingUnitProvider_Delegate() {
		return (EReference) delegatingUnitProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEffectiveBuilderCallFacade() {
		return effectiveBuilderCallFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEffectiveCapabilityFacade() {
		return effectiveCapabilityFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEffectiveCapabilityFacade_ProvidedCapability() {
		return (EReference) effectiveCapabilityFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEffectiveFacade() {
		return effectiveFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEffectiveRequirementFacade() {
		return effectiveRequirementFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEffectiveRequirementFacade_Requirement() {
		return (EReference) effectiveRequirementFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEffectiveUnitFacade() {
		return effectiveUnitFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_MetaRequiredCapabilities() {
		return (EReference) effectiveUnitFacadeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_ProvidedCapabilities() {
		return (EReference) effectiveUnitFacadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_RequiredCapabilities() {
		return (EReference) effectiveUnitFacadeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_Unit() {
		return (EReference) effectiveUnitFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEffectiveUnitFacade_UnitRequiredCapabilities() {
		return (EReference) effectiveUnitFacadeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExecutionStackRepository() {
		return executionStackRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFirstFoundUnitProvider() {
		return firstFoundUnitProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFragmentHost() {
		return fragmentHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFragmentHost_HostRequirements() {
		return (EReference) fragmentHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIBuilder() {
		return iBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_DefaultProperties() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_ExplicitUnitType() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_Input() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_Output() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_PostcondExpr() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_PostinputcondExpr() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_PrecondExpr() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuilder_Source() {
		return (EReference) iBuilderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIBuilder_UnitType() {
		return (EAttribute) iBuilderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIBuildUnitContainer() {
		return iBuildUnitContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIBuildUnitContainer_BuildUnits() {
		return (EReference) iBuildUnitContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIBuildUnitRepository() {
		return iBuildUnitRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIEffectiveFacade() {
		return iEffectiveFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIEffectiveFacade_Context() {
		return (EReference) iEffectiveFacadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIInstallableUnit() {
		return iInstallableUnitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIMatchExpression() {
		return iMatchExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getImplementsPredicate() {
		return implementsPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getImplementsPredicate_Type() {
		return (EReference) implementsPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getInputPredicate() {
		return inputPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInputPredicate_BuilderPredicate() {
		return (EReference) inputPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getInputPredicate_CapabilityPredicate() {
		return (EReference) inputPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIProvidedCapabilityContainer() {
		return iProvidedCapabilityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIProvidedCapabilityContainer_ProvidedCapabilities() {
		return (EReference) iProvidedCapabilityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIRequiredCapabilityContainer() {
		return iRequiredCapabilityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIRequiredCapabilityContainer_RequiredCapabilities() {
		return (EReference) iRequiredCapabilityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIRequiredCapabilityContainer_RequiredPredicates() {
		return (EReference) iRequiredCapabilityContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIStatus() {
		return iStatusEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getMergeConflictStrategy() {
		return mergeConflictStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNameSpacePredicate() {
		return nameSpacePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNameSpacePredicate_NameSpace() {
		return (EAttribute) nameSpacePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOutputPredicate() {
		return outputPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPathGroup() {
		return pathGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPathGroup_Annotations() {
		return (EReference) pathGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPathGroup_PathVectors() {
		return (EReference) pathGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPathGroupPredicate() {
		return pathGroupPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPathGroupPredicate_PathPattern() {
		return (EReference) pathGroupPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPathGroupPredicate_PathVector() {
		return (EReference) pathGroupPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getPathIterator() {
		return pathIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPathVector() {
		return pathVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPathVector_BasePath() {
		return (EAttribute) pathVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPathVector_Paths() {
		return (EAttribute) pathVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProvidesPredicate() {
		return providesPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProvidesPredicate_CapabilityPredicate() {
		return (EReference) providesPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRepoOption() {
		return repoOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepoOption_Expr() {
		return (EReference) repoOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepoOption_Name() {
		return (EAttribute) repoOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepository_Address() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepository_Branches() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepository_BuildUnitRepository() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepository_Documentation() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepository_HandlerType() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRepository_Name() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepository_Options() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRepositoryUnitProvider() {
		return repositoryUnitProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepositoryUnitProvider_BuildUnitRepository() {
		return (EReference) repositoryUnitProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepositoryUnitProvider_Options() {
		return (EReference) repositoryUnitProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRepositoryUnitProvider_Repository() {
		return (EReference) repositoryUnitProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRequiredCapability() {
		return requiredCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRequiredCapability_Greedy() {
		return (EAttribute) requiredCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRequiredCapability_Max() {
		return (EAttribute) requiredCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRequiredCapability_Min() {
		return (EAttribute) requiredCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRequiredCapability_VersionRange() {
		return (EAttribute) requiredCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRequiresPredicate() {
		return requiresPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRequiresPredicate_CapabilityPredicate() {
		return (EReference) requiresPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRequiresPredicate_Meta() {
		return (EAttribute) requiresPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResolutionInfo() {
		return resolutionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResolutionInfo_Status() {
		return (EAttribute) resolutionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSourcePredicate() {
		return sourcePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSwitchUnitProvider() {
		return switchUnitProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSwitchUnitProvider_RepoSwitch() {
		return (EReference) switchUnitProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSynchronization_BuilderQueries() {
		return (EReference) synchronizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getTriState() {
		return triStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnitConcernContext() {
		return unitConcernContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitConcernContext_BuilderContexts() {
		return (EReference) unitConcernContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUnitConcernContext_OutputLocation() {
		return (EAttribute) unitConcernContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitConcernContext_ProvidesRemovals() {
		return (EReference) unitConcernContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitConcernContext_Query() {
		return (EReference) unitConcernContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitConcernContext_RequiredPredicatesRemovals() {
		return (EReference) unitConcernContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitConcernContext_RequiresRemovals() {
		return (EReference) unitConcernContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUnitConcernContext_SourceLocation() {
		return (EAttribute) unitConcernContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnitNamePredicate() {
		return unitNamePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnitParameterDeclaration() {
		return unitParameterDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnitProvider() {
		return unitProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUnitProvider_Documentation() {
		return (EAttribute) unitProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnitRepositoryDescription() {
		return unitRepositoryDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUnitRepositoryDescription_EvaluatedOptions() {
		return (EAttribute) unitRepositoryDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitRepositoryDescription_Repository() {
		return (EReference) unitRepositoryDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnitResolutionInfo() {
		return unitResolutionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitResolutionInfo_Context() {
		return (EReference) unitResolutionInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnitResolutionInfo_Unit() {
		return (EReference) unitResolutionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVersionedCapability() {
		return versionedCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVersionedCapability_Version() {
		return (EAttribute) versionedCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getVersionRange() {
		return versionRangeEDataType;
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if(isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		B3backendPackage theB3backendPackage = (B3backendPackage) EPackage.Registry.INSTANCE.getEPackage(B3backendPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(iMatchExpressionEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		buildUnitEClass.getESuperTypes().add(this.getVersionedCapability());
		buildUnitEClass.getESuperTypes().add(theB3backendPackage.getBFunctionContainer());
		buildUnitEClass.getESuperTypes().add(this.getIRequiredCapabilityContainer());
		buildUnitEClass.getESuperTypes().add(this.getIProvidedCapabilityContainer());
		buildUnitEClass.getESuperTypes().add(theB3backendPackage.getIVarName());
		iBuilderEClass.getESuperTypes().add(this.getIProvidedCapabilityContainer());
		iBuilderEClass.getESuperTypes().add(theB3backendPackage.getIFunction());
		versionedCapabilityEClass.getESuperTypes().add(this.getCapability());
		builderInputDecoratorEClass.getESuperTypes().add(this.getBuilderInput());
		builderCallEClass.getESuperTypes().add(this.getBuilderInput());
		capabilityEClass.getESuperTypes().add(theB3backendPackage.getINamedValue());
		requiredCapabilityEClass.getESuperTypes().add(this.getCapability());
		unitProviderEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		repositoryUnitProviderEClass.getESuperTypes().add(this.getUnitProvider());
		compoundUnitProviderEClass.getESuperTypes().add(this.getUnitProvider());
		firstFoundUnitProviderEClass.getESuperTypes().add(this.getCompoundUnitProvider());
		bestFoundUnitProviderEClass.getESuperTypes().add(this.getCompoundUnitProvider());
		buildConcernContextEClass.getESuperTypes().add(theB3backendPackage.getBConcernContext());
		buildConcernContextEClass.getESuperTypes().add(this.getIProvidedCapabilityContainer());
		requiresPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		capabilityPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		implementsPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		providesPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		unitNamePredicateEClass.getESuperTypes().add(this.getCapabilityPredicate());
		builderNamePredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		inputPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		unitConcernContextEClass.getESuperTypes().add(this.getBuildConcernContext());
		unitConcernContextEClass.getESuperTypes().add(this.getIRequiredCapabilityContainer());
		builderConcernContextEClass.getESuperTypes().add(this.getBuildConcernContext());
		pathGroupPredicateEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		aliasedRequiredCapabilityEClass.getESuperTypes().add(this.getRequiredCapability());
		builderEClass.getESuperTypes().add(theB3backendPackage.getB3Function());
		builderEClass.getESuperTypes().add(this.getIBuilder());
		builderJavaEClass.getESuperTypes().add(theB3backendPackage.getBJavaFunction());
		builderJavaEClass.getESuperTypes().add(this.getIBuilder());
		builderWrapperEClass.getESuperTypes().add(theB3backendPackage.getBFunctionWrapper());
		builderWrapperEClass.getESuperTypes().add(this.getIBuilder());
		beeModelEClass.getESuperTypes().add(theB3backendPackage.getBChainedExpression());
		beeModelEClass.getESuperTypes().add(this.getIBuildUnitContainer());
		effectiveFacadeEClass.getESuperTypes().add(this.getIEffectiveFacade());
		effectiveUnitFacadeEClass.getESuperTypes().add(this.getEffectiveFacade());
		effectiveRequirementFacadeEClass.getESuperTypes().add(this.getEffectiveFacade());
		effectiveCapabilityFacadeEClass.getESuperTypes().add(this.getEffectiveFacade());
		buildSetEClass.getESuperTypes().add(theB3backendPackage.getITypedValueContainer());
		buildResultContextEClass.getESuperTypes().add(theB3backendPackage.getBInnerContext());
		outputPredicateEClass.getESuperTypes().add(this.getPathGroupPredicate());
		sourcePredicateEClass.getESuperTypes().add(this.getPathGroupPredicate());
		buildUnitRepositoryEClass.getESuperTypes().add(this.getIBuildUnitRepository());
		compoundBuildUnitRepositoryEClass.getESuperTypes().add(this.getBuildUnitRepository());
		compoundFirstFoundRepositoryEClass.getESuperTypes().add(this.getCompoundBuildUnitRepository());
		executionStackRepositoryEClass.getESuperTypes().add(this.getBuildUnitRepository());
		beeModelRepositoryEClass.getESuperTypes().add(this.getBuildUnitRepository());
		unitResolutionInfoEClass.getESuperTypes().add(this.getResolutionInfo());
		switchUnitProviderEClass.getESuperTypes().add(this.getUnitProvider());
		repositoryEClass.getESuperTypes().add(theB3backendPackage.getBExpression());
		delegatingUnitProviderEClass.getESuperTypes().add(this.getUnitProvider());
		unitRepositoryDescriptionEClass.getESuperTypes().add(this.getBuildUnitRepository());
		buildCallOnSelectedRequirementsEClass.getESuperTypes().add(this.getBuildCallMultiple());
		builderInputNameDecoratorEClass.getESuperTypes().add(this.getBuilderInputDecorator());
		builderInputNameDecoratorEClass.getESuperTypes().add(theB3backendPackage.getINamedValue());
		builderInputContextDecoratorEClass.getESuperTypes().add(this.getBuilderInputDecorator());
		builderInputConditionEClass.getESuperTypes().add(this.getBuilderInputDecorator());
		buildCallMultipleEClass.getESuperTypes().add(this.getBuilderCall());
		buildCallSingleEClass.getESuperTypes().add(this.getBuilderCall());
		buildCallOnDeclaredRequirementEClass.getESuperTypes().add(this.getBuildCallSingle());
		buildCallOnReferencedRequirementEClass.getESuperTypes().add(this.getBuildCallSingle());
		builderInputGroupEClass.getESuperTypes().add(this.getBuilderInputDecorator());
		effectiveBuilderCallFacadeEClass.getESuperTypes().add(this.getBuilderCallFacade());
		effectiveBuilderCallFacadeEClass.getESuperTypes().add(this.getIEffectiveFacade());
		unitParameterDeclarationEClass.getESuperTypes().add(theB3backendPackage.getBParameterDeclaration());

		// Initialize classes and features; add operations and parameters
		initEClass(
			buildUnitEClass, BuildUnit.class, "BuildUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuildUnit_Builders(), this.getIBuilder(), null, "builders", null, 0, -1, BuildUnit.class, IS_TRANSIENT,
			IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED,
			IS_ORDERED);
		initEAttribute(
			getBuildUnit_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, BuildUnit.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuildUnit_ExecutionMode(), theB3backendPackage.getExecutionMode(), "executionMode", null, 0, 1,
			BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_MetaRequiredCapabilities(), this.getRequiredCapability(), null, "metaRequiredCapabilities",
			null, 0, -1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_Implements(), theB3backendPackage.getIType(), null, "implements", null, 0, -1,
			BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_Concerns(), theB3backendPackage.getBConcern(), null, "concerns", null, 0, -1, BuildUnit.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null,
			0, 1, BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_Synchronizations(), this.getSynchronization(), null, "synchronizations", null, 0, -1,
			BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, BuildUnit.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_Containers(), this.getContainerConfiguration(), null, "containers", null, 0, -1,
			BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_PropertySets(), theB3backendPackage.getBPropertySet(), null, "propertySets", null, 0, -1,
			BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuildUnit_SourceLocation(), theB3backendPackage.getURI(), "sourceLocation", "resource:/", 0, 1,
			BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuildUnit_OutputLocation(), theB3backendPackage.getURI(), "outputLocation", null, 0, 1, BuildUnit.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_Providers(), this.getFirstFoundUnitProvider(), null, "providers", null, 0, -1,
			BuildUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_Parent(), this.getIBuildUnitContainer(), null, "parent", null, 0, 1, BuildUnit.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildUnit_FragmentHosts(), this.getFragmentHost(), null, "fragmentHosts", null, 0, -1, BuildUnit.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getIMatchExpression());
		EGenericType g2 = createEGenericType(this.getIInstallableUnit());
		g1.getETypeArguments().add(g2);
		initEAttribute(
			getBuildUnit_PlatformFilter(), g1, "platformFilter", null, 0, 1, BuildUnit.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(
			buildUnitEClass, this.getEffectiveUnitFacade(), "getEffectiveFacade", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		addEOperation(buildUnitEClass, this.getFirstFoundUnitProvider(), "getUnitProvider", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iBuilderEClass, IBuilder.class, "IBuilder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getIBuilder_PostcondExpr(), theB3backendPackage.getBExpression(), null, "postcondExpr", null, 0, 1,
			IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getIBuilder_PrecondExpr(), theB3backendPackage.getBExpression(), null, "precondExpr", null, 0, 1,
			IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getIBuilder_Input(), this.getBuilderInput(), null, "input", null, 0, 1, IBuilder.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getIBuilder_Output(), this.getPathGroup(), null, "output", null, 0, 1, IBuilder.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getIBuilder_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null, 0,
			1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getIBuilder_PostinputcondExpr(), theB3backendPackage.getBExpression(), null, "postinputcondExpr", null, 0,
			1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getBuildUnit());
		g2.setEUpperBound(g3);
		initEAttribute(
			getIBuilder_UnitType(), g1, "unitType", null, 0, 1, IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getIBuilder_ExplicitUnitType(), this.getUnitParameterDeclaration(), null, "explicitUnitType", null, 0, 1,
			IBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getIBuilder_Source(), this.getPathGroup(), null, "source", null, 0, 1, IBuilder.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(
			versionedCapabilityEClass, VersionedCapability.class, "VersionedCapability", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getVersionedCapability_Version(), this.getVersion(), "version", null, 0, 1, VersionedCapability.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderInputEClass, BuilderInput.class, "BuilderInput", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			pathGroupEClass, PathGroup.class, "PathGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getPathGroup_Annotations(), theB3backendPackage.getBPropertySet(), null, "annotations", null, 0, 1,
			PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPathGroup_PathVectors(), this.getConditionalPathVector(), null, "pathVectors", null, 0, -1,
			PathGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderInputDecoratorEClass, BuilderInputDecorator.class, "BuilderInputDecorator", IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderInputDecorator_BuilderInput(), this.getBuilderInput(), null, "builderInput", null, 0, -1,
			BuilderInputDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderCallEClass, BuilderCall.class, "BuilderCall", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderCall_Parameters(), theB3backendPackage.getBParameterList(), null, "parameters", null, 0, 1,
			BuilderCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderCall_BuilderName(), ecorePackage.getEString(), "builderName", null, 0, 1, BuilderCall.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getCapability_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1, Capability.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCapability_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1,
			Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(capabilityEClass, ecorePackage.getEBoolean(), "satisfies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "requirement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			requiredCapabilityEClass, RequiredCapability.class, "RequiredCapability", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getRequiredCapability_VersionRange(), this.getVersionRange(), "versionRange", null, 0, 1,
			RequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getRequiredCapability_Greedy(), ecorePackage.getEBoolean(), "greedy", null, 0, 1, RequiredCapability.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getRequiredCapability_Max(), ecorePackage.getEInt(), "max", "1", 0, 1, RequiredCapability.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getRequiredCapability_Min(), ecorePackage.getEInt(), "min", "1", 0, 1, RequiredCapability.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			conditionalPathVectorEClass, ConditionalPathVector.class, "ConditionalPathVector", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getConditionalPathVector_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1,
			ConditionalPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getConditionalPathVector_PathVectors(), this.getPathVector(), null, "pathVectors", null, 0, -1,
			ConditionalPathVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			pathVectorEClass, PathVector.class, "PathVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getPathVector_Paths(), theB3backendPackage.getURI(), "paths", null, 0, -1, PathVector.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPathVector_BasePath(), theB3backendPackage.getURI(), "basePath", null, 0, 1, PathVector.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(pathVectorEClass, this.getPathVector(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getURI(), "baseUri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getSynchronization_BuilderQueries(), this.getBuilderQuery(), null, "builderQueries", null, 0, -1,
			Synchronization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			unitProviderEClass, UnitProvider.class, "UnitProvider", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getUnitProvider_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1,
			UnitProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		op = addEOperation(unitProviderEClass, this.getBuildUnit(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "requiredCapability", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		op = addEOperation(unitProviderEClass, this.getBuildUnit(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEffectiveRequirementFacade(), "effectiveRequirement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		initEClass(
			repositoryUnitProviderEClass, RepositoryUnitProvider.class, "RepositoryUnitProvider", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getRepositoryUnitProvider_Repository(), this.getRepository(), null, "repository", null, 0, 1,
			RepositoryUnitProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getRepositoryUnitProvider_Options(), this.getRepoOption(), null, "options", null, 0, -1,
			RepositoryUnitProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getRepositoryUnitProvider_BuildUnitRepository(), this.getIBuildUnitRepository(), null,
			"buildUnitRepository", null, 0, 1, RepositoryUnitProvider.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			compoundUnitProviderEClass, CompoundUnitProvider.class, "CompoundUnitProvider", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCompoundUnitProvider_Providers(), this.getUnitProvider(), null, "providers", null, 0, -1,
			CompoundUnitProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			firstFoundUnitProviderEClass, FirstFoundUnitProvider.class, "FirstFoundUnitProvider", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			bestFoundUnitProviderEClass, BestFoundUnitProvider.class, "BestFoundUnitProvider", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			containerConfigurationEClass, ContainerConfiguration.class, "ContainerConfiguration", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getContainerConfiguration_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1,
			ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getContainerConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
			ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getContainerConfiguration_AgentType(), theB3backendPackage.getIType(), null, "agentType", null, 1, 1,
			ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getContainerConfiguration_ContextBlock(), theB3backendPackage.getBExpression(), null, "contextBlock", null,
			0, 1, ContainerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			buildConcernContextEClass, BuildConcernContext.class, "BuildConcernContext", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getBuildConcernContext_DefaultPropertiesRemovals(), ecorePackage.getEString(), "defaultPropertiesRemovals",
			null, 0, -1, BuildConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuildConcernContext_DefaultPropertiesAdditions(), theB3backendPackage.getBPropertySet(), null,
			"defaultPropertiesAdditions", null, 0, 1, BuildConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			requiresPredicateEClass, RequiresPredicate.class, "RequiresPredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getRequiresPredicate_CapabilityPredicate(), this.getCapabilityPredicate(), null, "capabilityPredicate",
			null, 1, 1, RequiresPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getRequiresPredicate_Meta(), ecorePackage.getEBoolean(), "meta", null, 0, 1, RequiresPredicate.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(requiresPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			capabilityPredicateEClass, CapabilityPredicate.class, "CapabilityPredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getCapabilityPredicate_VersionRange(), this.getVersionRange(), "versionRange", null, 0, 1,
			CapabilityPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getCapabilityPredicate_NamePredicate(), theB3backendPackage.getBNamePredicate(), null, "namePredicate",
			null, 0, 1, CapabilityPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCapabilityPredicate_NameSpacePredicate(), theB3backendPackage.getBNamePredicate(), null,
			"nameSpacePredicate", null, 0, 1, CapabilityPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(
			capabilityPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			capabilityPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVersionedCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			capabilityPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			implementsPredicateEClass, ImplementsPredicate.class, "ImplementsPredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getImplementsPredicate_Type(), theB3backendPackage.getIType(), null, "type", null, 0, 1,
			ImplementsPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			providesPredicateEClass, ProvidesPredicate.class, "ProvidesPredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getProvidesPredicate_CapabilityPredicate(), this.getCapabilityPredicate(), null, "capabilityPredicate",
			null, 0, 1, ProvidesPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(providesPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(providesPredicateEClass, ecorePackage.getEBoolean(), "matches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVersionedCapability(), "candidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			providesPredicateEClass, ecorePackage.getEBoolean(), "removeMatching", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getCapability());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			nameSpacePredicateEClass, NameSpacePredicate.class, "NameSpacePredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getNameSpacePredicate_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1,
			NameSpacePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			unitNamePredicateEClass, UnitNamePredicate.class, "UnitNamePredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			builderNamePredicateEClass, BuilderNamePredicate.class, "BuilderNamePredicate", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderNamePredicate_NamePredicate(), theB3backendPackage.getBNamePredicate(), null, "namePredicate",
			null, 0, 1, BuilderNamePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			inputPredicateEClass, InputPredicate.class, "InputPredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getInputPredicate_CapabilityPredicate(), this.getCapabilityPredicate(), null, "capabilityPredicate", null,
			0, 1, InputPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getInputPredicate_BuilderPredicate(), theB3backendPackage.getBNamePredicate(), null, "builderPredicate",
			null, 1, 1, InputPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			unitConcernContextEClass, UnitConcernContext.class, "UnitConcernContext", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getUnitConcernContext_BuilderContexts(), this.getBuilderConcernContext(), null, "builderContexts", null, 0,
			-1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getUnitConcernContext_Query(), theB3backendPackage.getBExpression(), null, "query", null, 0, 1,
			UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getUnitConcernContext_RequiresRemovals(), this.getRequiresPredicate(), null, "requiresRemovals", null, 0,
			-1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getUnitConcernContext_ProvidesRemovals(), this.getProvidesPredicate(), null, "providesRemovals", null, 0,
			-1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getUnitConcernContext_SourceLocation(), theB3backendPackage.getURI(), "sourceLocation", null, 0, 1,
			UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getUnitConcernContext_OutputLocation(), theB3backendPackage.getURI(), "outputLocation", null, 0, 1,
			UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getUnitConcernContext_RequiredPredicatesRemovals(), this.getCapabilityPredicate(), null,
			"requiredPredicatesRemovals", null, 0, -1, UnitConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderConcernContextEClass, BuilderConcernContext.class, "BuilderConcernContext", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderConcernContext_Query(), theB3backendPackage.getBExpression(), null, "query", null, 0, 1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_InputAdditions(), this.getBuilderInput(), null, "inputAdditions", null, 0, -1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_InputRemovals(), this.getInputPredicate(), null, "inputRemovals", null, 0, -1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_OutputAdditions(), this.getConditionalPathVector(), null, "outputAdditions", null,
			0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_OutputRemovals(), this.getOutputPredicate(), null, "outputRemovals", null, 0, -1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_FuncExpr(), theB3backendPackage.getBExpression(), null, "funcExpr", null, 0, 1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderConcernContext_VarArgs(), ecorePackage.getEBoolean(), "varArgs", null, 0, 1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_Parameters(), theB3backendPackage.getBParameterPredicate(), null, "parameters",
			null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderConcernContext_MatchParameters(), ecorePackage.getEBoolean(), "matchParameters", null, 0, 1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderConcernContext_RemovePreCondition(), ecorePackage.getEBoolean(), "removePreCondition", null, 0,
			1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderConcernContext_RemovePostCondition(), ecorePackage.getEBoolean(), "removePostCondition", null, 0,
			1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderConcernContext_RemovePostInputCondition(), ecorePackage.getEBoolean(),
			"removePostInputCondition", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_PrecondExpr(), theB3backendPackage.getBExpression(), null, "precondExpr", null, 0,
			1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_PostcondExpr(), theB3backendPackage.getBExpression(), null, "postcondExpr", null,
			0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_PostinputcondExpr(), theB3backendPackage.getBExpression(), null,
			"postinputcondExpr", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_ProvidesRemovals(), this.getProvidesPredicate(), null, "providesRemovals", null,
			0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderConcernContext_OutputAnnotationsRemovals(), ecorePackage.getEString(),
			"outputAnnotationsRemovals", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_OutputAnnotationAdditions(), theB3backendPackage.getBPropertySet(), null,
			"outputAnnotationAdditions", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_SourceRemovals(), this.getSourcePredicate(), null, "sourceRemovals", null, 0, -1,
			BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_SourceAdditions(), this.getConditionalPathVector(), null, "sourceAdditions", null,
			0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderConcernContext_SourceAnnotationsRemovals(), ecorePackage.getEString(),
			"sourceAnnotationsRemovals", null, 0, -1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderConcernContext_SourceAnnotationAdditions(), theB3backendPackage.getBPropertySet(), null,
			"sourceAnnotationAdditions", null, 0, 1, BuilderConcernContext.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			pathGroupPredicateEClass, PathGroupPredicate.class, "PathGroupPredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getPathGroupPredicate_PathVector(), this.getPathVector(), null, "pathVector", null, 0, 1,
			PathGroupPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getPathGroupPredicate_PathPattern(), theB3backendPackage.getBExpression(), null, "pathPattern", null, 0, 1,
			PathGroupPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(
			pathGroupPredicateEClass, ecorePackage.getEBoolean(), "removeMatching", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPathGroup(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			aliasedRequiredCapabilityEClass, AliasedRequiredCapability.class, "AliasedRequiredCapability",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getAliasedRequiredCapability_Alias(), ecorePackage.getEString(), "alias", null, 0, 1,
			AliasedRequiredCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			iRequiredCapabilityContainerEClass, IRequiredCapabilityContainer.class, "IRequiredCapabilityContainer",
			IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getIRequiredCapabilityContainer_RequiredCapabilities(), this.getRequiredCapability(), null,
			"requiredCapabilities", null, 0, -1, IRequiredCapabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getIRequiredCapabilityContainer_RequiredPredicates(), this.getCapabilityPredicate(), null,
			"requiredPredicates", null, 0, -1, IRequiredCapabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			iProvidedCapabilityContainerEClass, IProvidedCapabilityContainer.class, "IProvidedCapabilityContainer",
			IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getIProvidedCapabilityContainer_ProvidedCapabilities(), this.getCapability(), null, "providedCapabilities",
			null, 0, -1, IProvidedCapabilityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderQueryEClass, BuilderQuery.class, "BuilderQuery", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderQuery_BuilderQueries(), theB3backendPackage.getBExpression(), null, "builderQueries", null, 1,
			-1, BuilderQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderQuery_UnitQuery(), theB3backendPackage.getBExpression(), null, "unitQuery", null, 0, 1,
			BuilderQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builderEClass, Builder.class, "Builder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			builderJavaEClass, BuilderJava.class, "BuilderJava", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			builderWrapperEClass, BuilderWrapper.class, "BuilderWrapper", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getBuilderWrapper_InputAdvised(), ecorePackage.getEBoolean(), "inputAdvised", null, 0, 1,
			BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderWrapper_OutputAdvised(), ecorePackage.getEBoolean(), "outputAdvised", null, 0, 1,
			BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderWrapper_UnitTypeAdvised(), ecorePackage.getEBoolean(), "unitTypeAdvised", null, 0, 1,
			BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderWrapper_ProvidesAdvised(), ecorePackage.getEBoolean(), "providesAdvised", null, 0, 1,
			BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderWrapper_DefaultPropertiesAdvised(), ecorePackage.getEBoolean(), "defaultPropertiesAdvised", null,
			0, 1, BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderWrapper_SourceAdvised(), ecorePackage.getEBoolean(), "sourceAdvised", null, 0, 1,
			BuilderWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(beeModelEClass, BeeModel.class, "BeeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBeeModel_Imports(), theB3backendPackage.getIType(), null, "imports", null, 0, -1, BeeModel.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBeeModel_Functions(), theB3backendPackage.getIFunction(), null, "functions", null, 0, -1,
			BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBeeModel_Concerns(), theB3backendPackage.getBConcern(), null, "concerns", null, 0, -1, BeeModel.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBeeModel_PropertySets(), theB3backendPackage.getBPropertySet(), null, "propertySets", null, 0, -1,
			BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBeeModel_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, BeeModel.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBeeModel_Providers(), this.getFirstFoundUnitProvider(), null, "providers", null, 0, -1, BeeModel.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBeeModel_DefaultProperties(), theB3backendPackage.getBPropertySet(), null, "defaultProperties", null, 0,
			1, BeeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(beeModelEClass, this.getFirstFoundUnitProvider(), "getUnitProvider", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(beeHiveEClass, BeeHive.class, "BeeHive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBeeHive_BeeModels(), this.getBeeModel(), null, "beeModels", null, 0, -1, BeeHive.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getBeeHive_Parent(), this.getBeeHive(), null, "parent", null, 0, 1, BeeHive.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getRequiredCapability());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCapability());
		g1.getETypeArguments().add(g2);
		initEAttribute(
			getBeeHive_Resolutions(), g1, "resolutions", null, 0, 1, BeeHive.class, IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(
			beeHiveEClass, this.getIProvidedCapabilityContainer(), "getResolvedCapabilityContainer", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "requiredCapability", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			resolutionInfoEClass, ResolutionInfo.class, "ResolutionInfo", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getResolutionInfo_Status(), this.getIStatus(), "status", null, 0, 1, ResolutionInfo.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			effectiveFacadeEClass, EffectiveFacade.class, "EffectiveFacade", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			effectiveUnitFacadeEClass, EffectiveUnitFacade.class, "EffectiveUnitFacade", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEffectiveUnitFacade_Unit(), this.getBuildUnit(), null, "unit", null, 0, 1, EffectiveUnitFacade.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getEffectiveUnitFacade_ProvidedCapabilities(), this.getEffectiveCapabilityFacade(), null,
			"providedCapabilities", null, 0, -1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEffectiveUnitFacade_RequiredCapabilities(), this.getEffectiveRequirementFacade(), null,
			"requiredCapabilities", null, 0, -1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEffectiveUnitFacade_MetaRequiredCapabilities(), this.getEffectiveRequirementFacade(), null,
			"metaRequiredCapabilities", null, 0, -1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEffectiveUnitFacade_UnitRequiredCapabilities(), this.getEffectiveRequirementFacade(), null,
			"unitRequiredCapabilities", null, 0, -1, EffectiveUnitFacade.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			effectiveRequirementFacadeEClass, EffectiveRequirementFacade.class, "EffectiveRequirementFacade",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEffectiveRequirementFacade_Requirement(), this.getRequiredCapability(), null, "requirement", null, 0, 1,
			EffectiveRequirementFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			effectiveCapabilityFacadeEClass, EffectiveCapabilityFacade.class, "EffectiveCapabilityFacade",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEffectiveCapabilityFacade_ProvidedCapability(), this.getCapability(), null, "providedCapability", null,
			0, 1, EffectiveCapabilityFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderCallFacadeEClass, BuilderCallFacade.class, "BuilderCallFacade", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderCallFacade_BuilderReference(), this.getBuilderCall(), null, "builderReference", null, 0, 1,
			BuilderCallFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuilderCallFacade_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, BuilderCallFacade.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBuilderCallFacade_RequiredCapability(), this.getRequiredCapability(), null, "requiredCapability", null,
			0, 1, BuilderCallFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildSetEClass, BuildSet.class, "BuildSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuildSet_PathVectors(), this.getPathVector(), null, "pathVectors", null, 0, -1, BuildSet.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuildSet_ValueMap(), theB3backendPackage.getValueMap(), "valueMap", null, 0, 1, BuildSet.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBuildSet_PathIterator(), this.getPathIterator(), "pathIterator", "", 0, 1, BuildSet.class, IS_TRANSIENT,
			IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = addEOperation(buildSetEClass, this.getBuildSet(), "merge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBuildSet(), "buildResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getB3EngineException());

		initEClass(
			buildResultContextEClass, BuildResultContext.class, "BuildResultContext", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			outputPredicateEClass, OutputPredicate.class, "OutputPredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			sourcePredicateEClass, SourcePredicate.class, "SourcePredicate", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			buildUnitRepositoryEClass, BuildUnitRepository.class, "BuildUnitRepository", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(buildUnitRepositoryEClass, this.getBuildUnit(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRequiredCapability(), "requiredCapability", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		op = addEOperation(buildUnitRepositoryEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theB3backendPackage.getBExecutionContext(), "ctx", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRepository(), "repository", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "options", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theB3backendPackage.getThrowable());

		initEClass(
			compoundBuildUnitRepositoryEClass, CompoundBuildUnitRepository.class, "CompoundBuildUnitRepository",
			IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCompoundBuildUnitRepository_Repositories(), this.getIBuildUnitRepository(), null, "repositories", null,
			0, -1, CompoundBuildUnitRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			compoundFirstFoundRepositoryEClass, CompoundFirstFoundRepository.class, "CompoundFirstFoundRepository",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			executionStackRepositoryEClass, ExecutionStackRepository.class, "ExecutionStackRepository", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			beeModelRepositoryEClass, BeeModelRepository.class, "BeeModelRepository", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBeeModelRepository_BeeModels(), this.getBeeModel(), null, "beeModels", null, 0, -1,
			BeeModelRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			iBuildUnitRepositoryEClass, IBuildUnitRepository.class, "IBuildUnitRepository", IS_ABSTRACT, IS_INTERFACE,
			!IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			unitResolutionInfoEClass, UnitResolutionInfo.class, "UnitResolutionInfo", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getUnitResolutionInfo_Unit(), this.getBuildUnit(), null, "unit", null, 0, 1, UnitResolutionInfo.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getUnitResolutionInfo_Context(), theB3backendPackage.getBExecutionContext(), null, "context", null, 0, 1,
			UnitResolutionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			switchUnitProviderEClass, SwitchUnitProvider.class, "SwitchUnitProvider", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getSwitchUnitProvider_RepoSwitch(), theB3backendPackage.getBSwitchExpression(), null, "repoSwitch", null,
			1, 1, SwitchUnitProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, Repository.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getRepository_Branches(), this.getBranch(), null, "branches", null, 0, -1, Repository.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(
			getRepository_Documentation(), ecorePackage.getEString(), "documentation", "", 0, 1, Repository.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getRepository_HandlerType(), ecorePackage.getEString(), "handlerType", null, 0, 1, Repository.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getRepository_Options(), this.getRepoOption(), null, "options", null, 0, -1, Repository.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getRepository_BuildUnitRepository(), this.getIBuildUnitRepository(), null, "buildUnitRepository", null, 0,
			1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getRepository_Address(), theB3backendPackage.getBExpression(), null, "address", null, 0, 1,
			Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getBranch_Name(), ecorePackage.getEString(), "name", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBranch_Documentation(), ecorePackage.getEString(), "documentation", "", 0, 1, Branch.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBranch_BranchPointType(), this.getBranchPointType(), "branchPointType", "Latest", 1, 1, Branch.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getBranch_Include(), theB3backendPackage.getBNamePredicate(), null, "include", null, 0, -1, Branch.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBranch_Exclude(), theB3backendPackage.getBNamePredicate(), null, "exclude", null, 0, -1, Branch.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getBranch_BranchPoint(), theB3backendPackage.getBExpression(), null, "branchPoint", null, 0, 1,
			Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBranch_MergeStrategy(), this.getMergeConflictStrategy(), "mergeStrategy", "Default", 1, 1, Branch.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBranch_Checkout(), this.getTriState(), "checkout", "Default", 0, 1, Branch.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBranch_AcceptDirty(), this.getTriState(), "acceptDirty", "Default", 0, 1, Branch.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBranch_Update(), this.getTriState(), "update", "Default", 0, 1, Branch.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getBranch_Replace(), this.getTriState(), "replace", "Default", 0, 1, Branch.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(
			branchEClass, this.getMergeConflictStrategy(), "getEffectiveMergeStrategy", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(branchEClass, ecorePackage.getEBoolean(), "getEffectiveCheckout", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(branchEClass, ecorePackage.getEBoolean(), "getEffectiveAcceptDirty", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(branchEClass, ecorePackage.getEBoolean(), "getEffectiveUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(branchEClass, ecorePackage.getEBoolean(), "getEffectiveReplace", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(branchEClass, ecorePackage.getEBoolean(), "hasValidState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "map", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			delegatingUnitProviderEClass, DelegatingUnitProvider.class, "DelegatingUnitProvider", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getDelegatingUnitProvider_Delegate(), this.getUnitProvider(), null, "delegate", null, 1, 1,
			DelegatingUnitProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			repoOptionEClass, RepoOption.class, "RepoOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getRepoOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, RepoOption.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getRepoOption_Expr(), theB3backendPackage.getBExpression(), null, "expr", null, 0, 1, RepoOption.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			unitRepositoryDescriptionEClass, UnitRepositoryDescription.class, "UnitRepositoryDescription",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getUnitRepositoryDescription_Repository(), this.getRepository(), null, "repository", null, 0, 1,
			UnitRepositoryDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(
			getUnitRepositoryDescription_EvaluatedOptions(), g1, "evaluatedOptions", null, 0, 1,
			UnitRepositoryDescription.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			buildCallOnSelectedRequirementsEClass, BuildCallOnSelectedRequirements.class,
			"BuildCallOnSelectedRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuildCallOnSelectedRequirements_RequiredPredicate(), this.getCapabilityPredicate(), null,
			"requiredPredicate", null, 0, 1, BuildCallOnSelectedRequirements.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderInputNameDecoratorEClass, BuilderInputNameDecorator.class, "BuilderInputNameDecorator",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			builderInputContextDecoratorEClass, BuilderInputContextDecorator.class, "BuilderInputContextDecorator",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderInputContextDecorator_WithExpr(), theB3backendPackage.getBWithExpression(), null, "withExpr",
			null, 0, 1, BuilderInputContextDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			builderInputConditionEClass, BuilderInputCondition.class, "BuilderInputCondition", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuilderInputCondition_CondExpr(), theB3backendPackage.getBExpression(), null, "condExpr", null, 0, 1,
			BuilderInputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			buildCallMultipleEClass, BuildCallMultiple.class, "BuildCallMultiple", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			buildCallSingleEClass, BuildCallSingle.class, "BuildCallSingle", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuildCallSingle_RequiredCapability(), this.getRequiredCapability(), null, "requiredCapability", null, 0,
			1, BuildCallSingle.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			buildCallOnDeclaredRequirementEClass, BuildCallOnDeclaredRequirement.class,
			"BuildCallOnDeclaredRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuildCallOnDeclaredRequirement_RequiredCapabilityDeclaration(), this.getRequiredCapability(), null,
			"requiredCapabilityDeclaration", null, 0, 1, BuildCallOnDeclaredRequirement.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(
			buildCallOnReferencedRequirementEClass, BuildCallOnReferencedRequirement.class,
			"BuildCallOnReferencedRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getBuildCallOnReferencedRequirement_RequiredCapabilityReference(), this.getRequiredCapability(), null,
			"requiredCapabilityReference", null, 0, 1, BuildCallOnReferencedRequirement.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(
			builderInputGroupEClass, BuilderInputGroup.class, "BuilderInputGroup", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			iEffectiveFacadeEClass, IEffectiveFacade.class, "IEffectiveFacade", IS_ABSTRACT, IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getIEffectiveFacade_Context(), theB3backendPackage.getBExecutionContext(), null, "context", null, 0, 1,
			IEffectiveFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			effectiveBuilderCallFacadeEClass, EffectiveBuilderCallFacade.class, "EffectiveBuilderCallFacade",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			iBuildUnitContainerEClass, IBuildUnitContainer.class, "IBuildUnitContainer", IS_ABSTRACT, IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getIBuildUnitContainer_BuildUnits(), this.getBuildUnit(), null, "buildUnits", null, 0, -1,
			IBuildUnitContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			fragmentHostEClass, FragmentHost.class, "FragmentHost", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getFragmentHost_HostRequirements(), this.getRequiredCapability(), null, "hostRequirements", null, 0, -1,
			FragmentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			unitParameterDeclarationEClass, UnitParameterDeclaration.class, "UnitParameterDeclaration", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			unitParameterDeclarationEClass, ecorePackage.getEBoolean(), "hasCorrectState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "map", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mergeConflictStrategyEEnum, MergeConflictStrategy.class, "MergeConflictStrategy");
		addEEnumLiteral(mergeConflictStrategyEEnum, MergeConflictStrategy.DEFAULT);
		addEEnumLiteral(mergeConflictStrategyEEnum, MergeConflictStrategy.USE_WORKSPACE);
		addEEnumLiteral(mergeConflictStrategyEEnum, MergeConflictStrategy.USE_SCM);
		addEEnumLiteral(mergeConflictStrategyEEnum, MergeConflictStrategy.FAIL);

		initEEnum(branchPointTypeEEnum, BranchPointType.class, "BranchPointType");
		addEEnumLiteral(branchPointTypeEEnum, BranchPointType.LATEST);
		addEEnumLiteral(branchPointTypeEEnum, BranchPointType.TAG);
		addEEnumLiteral(branchPointTypeEEnum, BranchPointType.TIMESTAMP);
		addEEnumLiteral(branchPointTypeEEnum, BranchPointType.REVISION);

		initEEnum(triStateEEnum, TriState.class, "TriState");
		addEEnumLiteral(triStateEEnum, TriState.DEFAULT);
		addEEnumLiteral(triStateEEnum, TriState.TRUE);
		addEEnumLiteral(triStateEEnum, TriState.FALSE);

		// Initialize data types
		initEDataType(
			versionRangeEDataType, VersionRange.class, "VersionRange", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iStatusEDataType, IStatus.class, "IStatus", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			pathIteratorEDataType, PathIterator.class, "PathIterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			b3BuilderJobEDataType, B3BuilderJob.class, "B3BuilderJob", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			iMatchExpressionEDataType, IMatchExpression.class, "IMatchExpression", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			iInstallableUnitEDataType, IInstallableUnit.class, "IInstallableUnit", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // B3BuildPackageImpl
