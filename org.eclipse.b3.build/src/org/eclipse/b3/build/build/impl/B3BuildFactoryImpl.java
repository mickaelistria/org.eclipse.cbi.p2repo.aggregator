/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.build.build.*;

import org.eclipse.b3.build.core.PathIterator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3BuildFactoryImpl extends EFactoryImpl implements B3BuildFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static B3BuildFactory init() {
		try {
			B3BuildFactory theB3BuildFactory = (B3BuildFactory) EPackage.Registry.INSTANCE.getEFactory("http://b3build/1.0");
			if(theB3BuildFactory != null) {
				return theB3BuildFactory;
			}
		}
		catch(Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new B3BuildFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch(eClass.getClassifierID()) {
		case B3BuildPackage.BUILD_UNIT:
			return createBuildUnit();
		case B3BuildPackage.VERSIONED_CAPABILITY:
			return createVersionedCapability();
		case B3BuildPackage.BUILDER_INPUT:
			return createBuilderInput();
		case B3BuildPackage.PATH_GROUP:
			return createPathGroup();
		case B3BuildPackage.PREREQUISITE:
			return createPrerequisite();
		case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE:
			return createCompoundBuildResultReference();
		case B3BuildPackage.BUILDER_REFERENCE:
			return createBuilderReference();
		case B3BuildPackage.CAPABILITY:
			return createCapability();
		case B3BuildPackage.REQUIRED_CAPABILITY:
			return createRequiredCapability();
		case B3BuildPackage.CONDITIONAL_PATH_VECTOR:
			return createConditionalPathVector();
		case B3BuildPackage.PATH_VECTOR:
			return createPathVector();
		case B3BuildPackage.SYNCHRONIZATION:
			return createSynchronization();
		case B3BuildPackage.REPOSITORY_DECLARATION:
			return createRepositoryDeclaration();
		case B3BuildPackage.RESOLUTION_STRATEGY_FIRST:
			return createResolutionStrategyFirst();
		case B3BuildPackage.RESOLUTION_STRATEGY_BEST:
			return createResolutionStrategyBest();
		case B3BuildPackage.CONTAINER_CONFIGURATION:
			return createContainerConfiguration();
		case B3BuildPackage.BUILD_CONTEXT:
			return createBuildContext();
		case B3BuildPackage.BUILD_CONCERN_CONTEXT:
			return createBuildConcernContext();
		case B3BuildPackage.REQUIRES_PREDICATE:
			return createRequiresPredicate();
		case B3BuildPackage.CAPABILITY_PREDICATE:
			return createCapabilityPredicate();
		case B3BuildPackage.IMPLEMENTS_PREDICATE:
			return createImplementsPredicate();
		case B3BuildPackage.PROVIDES_PREDICATE:
			return createProvidesPredicate();
		case B3BuildPackage.NAME_SPACE_PREDICATE:
			return createNameSpacePredicate();
		case B3BuildPackage.UNIT_NAME_PREDICATE:
			return createUnitNamePredicate();
		case B3BuildPackage.BUILDER_NAME_PREDICATE:
			return createBuilderNamePredicate();
		case B3BuildPackage.INPUT_PREDICATE:
			return createInputPredicate();
		case B3BuildPackage.UNIT_CONCERN_CONTEXT:
			return createUnitConcernContext();
		case B3BuildPackage.BUILDER_CONCERN_CONTEXT:
			return createBuilderConcernContext();
		case B3BuildPackage.PATH_GROUP_PREDICATE:
			return createPathGroupPredicate();
		case B3BuildPackage.ALIASED_REQUIRED_CAPABILITY:
			return createAliasedRequiredCapability();
		case B3BuildPackage.BUILDER_QUERY:
			return createBuilderQuery();
		case B3BuildPackage.BUILDER:
			return createBuilder();
		case B3BuildPackage.BUILDER_JAVA:
			return createBuilderJava();
		case B3BuildPackage.BUILDER_WRAPPER:
			return createBuilderWrapper();
		case B3BuildPackage.BEE_MODEL:
			return createBeeModel();
		case B3BuildPackage.BEE_HIVE:
			return createBeeHive();
		case B3BuildPackage.RESOLUTION_INFO:
			return createResolutionInfo();
		case B3BuildPackage.EFFECTIVE_FACADE:
			return createEffectiveFacade();
		case B3BuildPackage.EFFECTIVE_UNIT_FACADE:
			return createEffectiveUnitFacade();
		case B3BuildPackage.EFFECTIVE_REQUIREMENT_FACADE:
			return createEffectiveRequirementFacade();
		case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE:
			return createEffectiveCapabilityFacade();
		case B3BuildPackage.EFFECTIVE_BUILDER_REFERENCE_FACADE:
			return createEffectiveBuilderReferenceFacade();
		case B3BuildPackage.BUILD_RESULT:
			return createBuildResult();
		case B3BuildPackage.BUILD_RESULT_CONTEXT:
			return createBuildResultContext();
		case B3BuildPackage.OUTPUT_PREDICATE:
			return createOutputPredicate();
		case B3BuildPackage.SOURCE_PREDICATE:
			return createSourcePredicate();
		case B3BuildPackage.COMPOUND_FIRST_FOUND_REPOSITORY:
			return createCompoundFirstFoundRepository();
		case B3BuildPackage.COMPOUND_BEST_FOUND_REPOSITORY:
			return createCompoundBestFoundRepository();
		case B3BuildPackage.EXECUTION_STACK_REPOSITORY:
			return createExecutionStackRepository();
		case B3BuildPackage.SIMPLE_REPOSITORY:
			return createSimpleRepository();
		case B3BuildPackage.UNIT_RESOLUTION_INFO:
			return createUnitResolutionInfo();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch(eDataType.getClassifierID()) {
		case B3BuildPackage.VERSION_RANGE:
			return createVersionRangeFromString(eDataType, initialValue);
		case B3BuildPackage.VERSION:
			return createVersionFromString(eDataType, initialValue);
		case B3BuildPackage.ISTATUS:
			return createIStatusFromString(eDataType, initialValue);
		case B3BuildPackage.PATH_ITERATOR:
			return createPathIteratorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch(eDataType.getClassifierID()) {
		case B3BuildPackage.VERSION_RANGE:
			return convertVersionRangeToString(eDataType, instanceValue);
		case B3BuildPackage.VERSION:
			return convertVersionToString(eDataType, instanceValue);
		case B3BuildPackage.ISTATUS:
			return convertIStatusToString(eDataType, instanceValue);
		case B3BuildPackage.PATH_ITERATOR:
			return convertPathIteratorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildUnit createBuildUnit() {
		BuildUnitImpl buildUnit = new BuildUnitImpl();
		return buildUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Builder createBuilder() {
		BuilderImpl builder = new BuilderImpl();
		return builder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderJava createBuilderJava() {
		BuilderJavaImpl builderJava = new BuilderJavaImpl();
		return builderJava;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderWrapper createBuilderWrapper() {
		BuilderWrapperImpl builderWrapper = new BuilderWrapperImpl();
		return builderWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeeModel createBeeModel() {
		BeeModelImpl beeModel = new BeeModelImpl();
		return beeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeeHive createBeeHive() {
		BeeHiveImpl beeHive = new BeeHiveImpl();
		return beeHive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionInfo createResolutionInfo() {
		ResolutionInfoImpl resolutionInfo = new ResolutionInfoImpl();
		return resolutionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectiveFacade createEffectiveFacade() {
		EffectiveFacadeImpl effectiveFacade = new EffectiveFacadeImpl();
		return effectiveFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectiveUnitFacade createEffectiveUnitFacade() {
		EffectiveUnitFacadeImpl effectiveUnitFacade = new EffectiveUnitFacadeImpl();
		return effectiveUnitFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectiveRequirementFacade createEffectiveRequirementFacade() {
		EffectiveRequirementFacadeImpl effectiveRequirementFacade = new EffectiveRequirementFacadeImpl();
		return effectiveRequirementFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectiveCapabilityFacade createEffectiveCapabilityFacade() {
		EffectiveCapabilityFacadeImpl effectiveCapabilityFacade = new EffectiveCapabilityFacadeImpl();
		return effectiveCapabilityFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectiveBuilderReferenceFacade createEffectiveBuilderReferenceFacade() {
		EffectiveBuilderReferenceFacadeImpl effectiveBuilderReferenceFacade = new EffectiveBuilderReferenceFacadeImpl();
		return effectiveBuilderReferenceFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildResult createBuildResult() {
		BuildResultImpl buildResult = new BuildResultImpl();
		return buildResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildResultContext createBuildResultContext() {
		BuildResultContextImpl buildResultContext = new BuildResultContextImpl();
		return buildResultContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPredicate createOutputPredicate() {
		OutputPredicateImpl outputPredicate = new OutputPredicateImpl();
		return outputPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePredicate createSourcePredicate() {
		SourcePredicateImpl sourcePredicate = new SourcePredicateImpl();
		return sourcePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundFirstFoundRepository createCompoundFirstFoundRepository() {
		CompoundFirstFoundRepositoryImpl compoundFirstFoundRepository = new CompoundFirstFoundRepositoryImpl();
		return compoundFirstFoundRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundBestFoundRepository createCompoundBestFoundRepository() {
		CompoundBestFoundRepositoryImpl compoundBestFoundRepository = new CompoundBestFoundRepositoryImpl();
		return compoundBestFoundRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStackRepository createExecutionStackRepository() {
		ExecutionStackRepositoryImpl executionStackRepository = new ExecutionStackRepositoryImpl();
		return executionStackRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRepository createSimpleRepository() {
		SimpleRepositoryImpl simpleRepository = new SimpleRepositoryImpl();
		return simpleRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitResolutionInfo createUnitResolutionInfo() {
		UnitResolutionInfoImpl unitResolutionInfo = new UnitResolutionInfoImpl();
		return unitResolutionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedCapability createVersionedCapability() {
		VersionedCapabilityImpl versionedCapability = new VersionedCapabilityImpl();
		return versionedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCapability createRequiredCapability() {
		RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
		return requiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalPathVector createConditionalPathVector() {
		ConditionalPathVectorImpl conditionalPathVector = new ConditionalPathVectorImpl();
		return conditionalPathVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathVector createPathVector() {
		PathVectorImpl pathVector = new PathVectorImpl();
		return pathVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryDeclaration createRepositoryDeclaration() {
		RepositoryDeclarationImpl repositoryDeclaration = new RepositoryDeclarationImpl();
		return repositoryDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionStrategyFirst createResolutionStrategyFirst() {
		ResolutionStrategyFirstImpl resolutionStrategyFirst = new ResolutionStrategyFirstImpl();
		return resolutionStrategyFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionStrategyBest createResolutionStrategyBest() {
		ResolutionStrategyBestImpl resolutionStrategyBest = new ResolutionStrategyBestImpl();
		return resolutionStrategyBest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerConfiguration createContainerConfiguration() {
		ContainerConfigurationImpl containerConfiguration = new ContainerConfigurationImpl();
		return containerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildContext createBuildContext() {
		BuildContextImpl buildContext = new BuildContextImpl();
		return buildContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildConcernContext createBuildConcernContext() {
		BuildConcernContextImpl buildConcernContext = new BuildConcernContextImpl();
		return buildConcernContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresPredicate createRequiresPredicate() {
		RequiresPredicateImpl requiresPredicate = new RequiresPredicateImpl();
		return requiresPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPredicate createCapabilityPredicate() {
		CapabilityPredicateImpl capabilityPredicate = new CapabilityPredicateImpl();
		return capabilityPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementsPredicate createImplementsPredicate() {
		ImplementsPredicateImpl implementsPredicate = new ImplementsPredicateImpl();
		return implementsPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidesPredicate createProvidesPredicate() {
		ProvidesPredicateImpl providesPredicate = new ProvidesPredicateImpl();
		return providesPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameSpacePredicate createNameSpacePredicate() {
		NameSpacePredicateImpl nameSpacePredicate = new NameSpacePredicateImpl();
		return nameSpacePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitNamePredicate createUnitNamePredicate() {
		UnitNamePredicateImpl unitNamePredicate = new UnitNamePredicateImpl();
		return unitNamePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderNamePredicate createBuilderNamePredicate() {
		BuilderNamePredicateImpl builderNamePredicate = new BuilderNamePredicateImpl();
		return builderNamePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPredicate createInputPredicate() {
		InputPredicateImpl inputPredicate = new InputPredicateImpl();
		return inputPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitConcernContext createUnitConcernContext() {
		UnitConcernContextImpl unitConcernContext = new UnitConcernContextImpl();
		return unitConcernContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderConcernContext createBuilderConcernContext() {
		BuilderConcernContextImpl builderConcernContext = new BuilderConcernContextImpl();
		return builderConcernContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathGroupPredicate createPathGroupPredicate() {
		PathGroupPredicateImpl pathGroupPredicate = new PathGroupPredicateImpl();
		return pathGroupPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasedRequiredCapability createAliasedRequiredCapability() {
		AliasedRequiredCapabilityImpl aliasedRequiredCapability = new AliasedRequiredCapabilityImpl();
		return aliasedRequiredCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderQuery createBuilderQuery() {
		BuilderQueryImpl builderQuery = new BuilderQueryImpl();
		return builderQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderInput createBuilderInput() {
		BuilderInputImpl builderInput = new BuilderInputImpl();
		return builderInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathGroup createPathGroup() {
		PathGroupImpl pathGroup = new PathGroupImpl();
		return pathGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prerequisite createPrerequisite() {
		PrerequisiteImpl prerequisite = new PrerequisiteImpl();
		return prerequisite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundBuildResultReference createCompoundBuildResultReference() {
		CompoundBuildResultReferenceImpl compoundBuildResultReference = new CompoundBuildResultReferenceImpl();
		return compoundBuildResultReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderReference createBuilderReference() {
		BuilderReferenceImpl builderReference = new BuilderReferenceImpl();
		return builderReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionRange createVersionRangeFromString(EDataType eDataType, String initialValue) {
		return (VersionRange) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionRangeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersionFromString(EDataType eDataType, String initialValue) {
		return (Version) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatus createIStatusFromString(EDataType eDataType, String initialValue) {
		return (IStatus) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIStatusToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathIterator createPathIteratorFromString(EDataType eDataType, String initialValue) {
		return (PathIterator) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathIteratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildPackage getB3BuildPackage() {
		return (B3BuildPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static B3BuildPackage getPackage() {
		return B3BuildPackage.eINSTANCE;
	}

} //B3BuildFactoryImpl
