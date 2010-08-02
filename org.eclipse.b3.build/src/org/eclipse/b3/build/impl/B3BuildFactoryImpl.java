/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.impl;

import org.eclipse.b3.build.*;
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
import org.eclipse.b3.build.BuildConcernContext;
import org.eclipse.b3.build.BuildResultContext;
import org.eclipse.b3.build.BuildSet;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.BuilderCallFacade;
import org.eclipse.b3.build.BuilderConcernContext;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderInputCondition;
import org.eclipse.b3.build.BuilderInputContextDecorator;
import org.eclipse.b3.build.BuilderInputGroup;
import org.eclipse.b3.build.BuilderInputNameDecorator;
import org.eclipse.b3.build.BuilderJava;
import org.eclipse.b3.build.BuilderNamePredicate;
import org.eclipse.b3.build.BuilderQuery;
import org.eclipse.b3.build.BuilderWrapper;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.CompoundFirstFoundRepository;
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
import org.eclipse.b3.build.UnitRepositoryDescription;
import org.eclipse.b3.build.UnitResolutionInfo;
import org.eclipse.b3.build.VersionedCapability;
import org.eclipse.b3.build.core.iterators.PathIterator;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static B3BuildPackage getPackage() {
		return B3BuildPackage.eINSTANCE;
	}

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
	public String convertBranchPointTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
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
	public String convertMergeConflictStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
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
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch(eDataType.getClassifierID()) {
			case B3BuildPackage.MERGE_CONFLICT_STRATEGY:
				return convertMergeConflictStrategyToString(eDataType, instanceValue);
			case B3BuildPackage.BRANCH_POINT_TYPE:
				return convertBranchPointTypeToString(eDataType, instanceValue);
			case B3BuildPackage.TRI_STATE:
				return convertTriStateToString(eDataType, instanceValue);
			case B3BuildPackage.VERSION_RANGE:
				return convertVersionRangeToString(eDataType, instanceValue);
			case B3BuildPackage.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			case B3BuildPackage.ISTATUS:
				return convertIStatusToString(eDataType, instanceValue);
			case B3BuildPackage.PATH_ITERATOR:
				return convertPathIteratorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
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
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER:
				return createRepositoryUnitProvider();
			case B3BuildPackage.FIRST_FOUND_UNIT_PROVIDER:
				return createFirstFoundUnitProvider();
			case B3BuildPackage.BEST_FOUND_UNIT_PROVIDER:
				return createBestFoundUnitProvider();
			case B3BuildPackage.CONTAINER_CONFIGURATION:
				return createContainerConfiguration();
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
			case B3BuildPackage.BUILDER_CALL_FACADE:
				return createBuilderCallFacade();
			case B3BuildPackage.BUILD_SET:
				return createBuildSet();
			case B3BuildPackage.BUILD_RESULT_CONTEXT:
				return createBuildResultContext();
			case B3BuildPackage.OUTPUT_PREDICATE:
				return createOutputPredicate();
			case B3BuildPackage.SOURCE_PREDICATE:
				return createSourcePredicate();
			case B3BuildPackage.COMPOUND_FIRST_FOUND_REPOSITORY:
				return createCompoundFirstFoundRepository();
			case B3BuildPackage.EXECUTION_STACK_REPOSITORY:
				return createExecutionStackRepository();
			case B3BuildPackage.BEE_MODEL_REPOSITORY:
				return createBeeModelRepository();
			case B3BuildPackage.UNIT_RESOLUTION_INFO:
				return createUnitResolutionInfo();
			case B3BuildPackage.SWITCH_UNIT_PROVIDER:
				return createSwitchUnitProvider();
			case B3BuildPackage.REPOSITORY:
				return createRepository();
			case B3BuildPackage.BRANCH:
				return createBranch();
			case B3BuildPackage.DELEGATING_UNIT_PROVIDER:
				return createDelegatingUnitProvider();
			case B3BuildPackage.REPO_OPTION:
				return createRepoOption();
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION:
				return createUnitRepositoryDescription();
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS:
				return createBuildCallOnSelectedRequirements();
			case B3BuildPackage.BUILDER_INPUT_NAME_DECORATOR:
				return createBuilderInputNameDecorator();
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR:
				return createBuilderInputContextDecorator();
			case B3BuildPackage.BUILDER_INPUT_CONDITION:
				return createBuilderInputCondition();
			case B3BuildPackage.BUILD_CALL_MULTIPLE:
				return createBuildCallMultiple();
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT:
				return createBuildCallOnDeclaredRequirement();
			case B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT:
				return createBuildCallOnReferencedRequirement();
			case B3BuildPackage.BUILDER_INPUT_GROUP:
				return createBuilderInputGroup();
			case B3BuildPackage.EFFECTIVE_BUILDER_CALL_FACADE:
				return createEffectiveBuilderCallFacade();
			case B3BuildPackage.FRAGMENT_HOST:
				return createFragmentHost();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public BeeHive createBeeHive() {
		BeeHiveImpl beeHive = new BeeHiveImpl();
		return beeHive;
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
	public BeeModelRepository createBeeModelRepository() {
		BeeModelRepositoryImpl beeModelRepository = new BeeModelRepositoryImpl();
		return beeModelRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BestFoundUnitProvider createBestFoundUnitProvider() {
		BestFoundUnitProviderImpl bestFoundUnitProvider = new BestFoundUnitProviderImpl();
		return bestFoundUnitProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchPointType createBranchPointTypeFromString(EDataType eDataType, String initialValue) {
		BranchPointType result = BranchPointType.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildCallMultiple createBuildCallMultiple() {
		BuildCallMultipleImpl buildCallMultiple = new BuildCallMultipleImpl();
		return buildCallMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildCallOnDeclaredRequirement createBuildCallOnDeclaredRequirement() {
		BuildCallOnDeclaredRequirementImpl buildCallOnDeclaredRequirement = new BuildCallOnDeclaredRequirementImpl();
		return buildCallOnDeclaredRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildCallOnReferencedRequirement createBuildCallOnReferencedRequirement() {
		BuildCallOnReferencedRequirementImpl buildCallOnReferencedRequirement = new BuildCallOnReferencedRequirementImpl();
		return buildCallOnReferencedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildCallOnSelectedRequirements createBuildCallOnSelectedRequirements() {
		BuildCallOnSelectedRequirementsImpl buildCallOnSelectedRequirements = new BuildCallOnSelectedRequirementsImpl();
		return buildCallOnSelectedRequirements;
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
	public Builder createBuilder() {
		BuilderImpl builder = new BuilderImpl();
		return builder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderCallFacade createBuilderCallFacade() {
		BuilderCallFacadeImpl builderCallFacade = new BuilderCallFacadeImpl();
		return builderCallFacade;
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
	public BuilderInput createBuilderInput() {
		BuilderInputImpl builderInput = new BuilderInputImpl();
		return builderInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderInputCondition createBuilderInputCondition() {
		BuilderInputConditionImpl builderInputCondition = new BuilderInputConditionImpl();
		return builderInputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderInputContextDecorator createBuilderInputContextDecorator() {
		BuilderInputContextDecoratorImpl builderInputContextDecorator = new BuilderInputContextDecoratorImpl();
		return builderInputContextDecorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderInputGroup createBuilderInputGroup() {
		BuilderInputGroupImpl builderInputGroup = new BuilderInputGroupImpl();
		return builderInputGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuilderInputNameDecorator createBuilderInputNameDecorator() {
		BuilderInputNameDecoratorImpl builderInputNameDecorator = new BuilderInputNameDecoratorImpl();
		return builderInputNameDecorator;
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
	public BuilderNamePredicate createBuilderNamePredicate() {
		BuilderNamePredicateImpl builderNamePredicate = new BuilderNamePredicateImpl();
		return builderNamePredicate;
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
	public BuilderWrapper createBuilderWrapper() {
		BuilderWrapperImpl builderWrapper = new BuilderWrapperImpl();
		return builderWrapper;
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
	public BuildSet createBuildSet() {
		BuildSetImpl buildSet = new BuildSetImpl();
		return buildSet;
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
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
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
	public CompoundFirstFoundRepository createCompoundFirstFoundRepository() {
		CompoundFirstFoundRepositoryImpl compoundFirstFoundRepository = new CompoundFirstFoundRepositoryImpl();
		return compoundFirstFoundRepository;
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
	public ContainerConfiguration createContainerConfiguration() {
		ContainerConfigurationImpl containerConfiguration = new ContainerConfigurationImpl();
		return containerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegatingUnitProvider createDelegatingUnitProvider() {
		DelegatingUnitProviderImpl delegatingUnitProvider = new DelegatingUnitProviderImpl();
		return delegatingUnitProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectiveBuilderCallFacade createEffectiveBuilderCallFacade() {
		EffectiveBuilderCallFacadeImpl effectiveBuilderCallFacade = new EffectiveBuilderCallFacadeImpl();
		return effectiveBuilderCallFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentHost createFragmentHost() {
		FragmentHostImpl fragmentHost = new FragmentHostImpl();
		return fragmentHost;
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
	public EffectiveFacade createEffectiveFacade() {
		EffectiveFacadeImpl effectiveFacade = new EffectiveFacadeImpl();
		return effectiveFacade;
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
	public EffectiveUnitFacade createEffectiveUnitFacade() {
		EffectiveUnitFacadeImpl effectiveUnitFacade = new EffectiveUnitFacadeImpl();
		return effectiveUnitFacade;
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
	public FirstFoundUnitProvider createFirstFoundUnitProvider() {
		FirstFoundUnitProviderImpl firstFoundUnitProvider = new FirstFoundUnitProviderImpl();
		return firstFoundUnitProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch(eDataType.getClassifierID()) {
			case B3BuildPackage.MERGE_CONFLICT_STRATEGY:
				return createMergeConflictStrategyFromString(eDataType, initialValue);
			case B3BuildPackage.BRANCH_POINT_TYPE:
				return createBranchPointTypeFromString(eDataType, initialValue);
			case B3BuildPackage.TRI_STATE:
				return createTriStateFromString(eDataType, initialValue);
			case B3BuildPackage.VERSION_RANGE:
				return createVersionRangeFromString(eDataType, initialValue);
			case B3BuildPackage.VERSION:
				return createVersionFromString(eDataType, initialValue);
			case B3BuildPackage.ISTATUS:
				return createIStatusFromString(eDataType, initialValue);
			case B3BuildPackage.PATH_ITERATOR:
				return createPathIteratorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
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
	public InputPredicate createInputPredicate() {
		InputPredicateImpl inputPredicate = new InputPredicateImpl();
		return inputPredicate;
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
	public MergeConflictStrategy createMergeConflictStrategyFromString(EDataType eDataType, String initialValue) {
		MergeConflictStrategy result = MergeConflictStrategy.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		return result;
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
	public OutputPredicate createOutputPredicate() {
		OutputPredicateImpl outputPredicate = new OutputPredicateImpl();
		return outputPredicate;
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
	public PathGroupPredicate createPathGroupPredicate() {
		PathGroupPredicateImpl pathGroupPredicate = new PathGroupPredicateImpl();
		return pathGroupPredicate;
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
	public PathVector createPathVector() {
		PathVectorImpl pathVector = new PathVectorImpl();
		return pathVector;
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
	public RepoOption createRepoOption() {
		RepoOptionImpl repoOption = new RepoOptionImpl();
		return repoOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryUnitProvider createRepositoryUnitProvider() {
		RepositoryUnitProviderImpl repositoryUnitProvider = new RepositoryUnitProviderImpl();
		return repositoryUnitProvider;
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
	public RequiresPredicate createRequiresPredicate() {
		RequiresPredicateImpl requiresPredicate = new RequiresPredicateImpl();
		return requiresPredicate;
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
	public SourcePredicate createSourcePredicate() {
		SourcePredicateImpl sourcePredicate = new SourcePredicateImpl();
		return sourcePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchUnitProvider createSwitchUnitProvider() {
		SwitchUnitProviderImpl switchUnitProvider = new SwitchUnitProviderImpl();
		return switchUnitProvider;
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
	public TriState createTriStateFromString(EDataType eDataType, String initialValue) {
		TriState result = TriState.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		return result;
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
	public UnitNamePredicate createUnitNamePredicate() {
		UnitNamePredicateImpl unitNamePredicate = new UnitNamePredicateImpl();
		return unitNamePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitRepositoryDescription createUnitRepositoryDescription() {
		UnitRepositoryDescriptionImpl unitRepositoryDescription = new UnitRepositoryDescriptionImpl();
		return unitRepositoryDescription;
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
	public Version createVersionFromString(EDataType eDataType, String initialValue) {
		return (Version) super.createFromString(eDataType, initialValue);
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
	public B3BuildPackage getB3BuildPackage() {
		return (B3BuildPackage) getEPackage();
	}

} // B3BuildFactoryImpl
