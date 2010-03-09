/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.util;

import java.lang.reflect.GenericDeclaration;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer;
import org.eclipse.b3.build.build.*;

import org.eclipse.b3.build.core.IBuildUnitRepository;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.build.build.B3BuildPackage
 * @generated
 */
public class B3BuildAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static B3BuildPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildAdapterFactory() {
		if(modelPackage == null) {
			modelPackage = B3BuildPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
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

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B3BuildSwitch<Adapter> modelSwitch = new B3BuildSwitch<Adapter>() {
		@Override
		public Adapter caseBuildUnit(BuildUnit object) {
			return createBuildUnitAdapter();
		}

		@Override
		public Adapter caseIBuilder(IBuilder object) {
			return createIBuilderAdapter();
		}

		@Override
		public Adapter caseVersionedCapability(VersionedCapability object) {
			return createVersionedCapabilityAdapter();
		}

		@Override
		public Adapter caseBuilderInput(BuilderInput object) {
			return createBuilderInputAdapter();
		}

		@Override
		public Adapter casePathGroup(PathGroup object) {
			return createPathGroupAdapter();
		}

		@Override
		public Adapter casePrerequisite(Prerequisite object) {
			return createPrerequisiteAdapter();
		}

		@Override
		public Adapter caseBuildResultReference(BuildResultReference object) {
			return createBuildResultReferenceAdapter();
		}

		@Override
		public Adapter caseCompoundBuildResultReference(CompoundBuildResultReference object) {
			return createCompoundBuildResultReferenceAdapter();
		}

		@Override
		public Adapter caseBuilderReference(BuilderReference object) {
			return createBuilderReferenceAdapter();
		}

		@Override
		public Adapter caseCapability(Capability object) {
			return createCapabilityAdapter();
		}

		@Override
		public Adapter caseRequiredCapability(RequiredCapability object) {
			return createRequiredCapabilityAdapter();
		}

		@Override
		public Adapter caseConditionalPathVector(ConditionalPathVector object) {
			return createConditionalPathVectorAdapter();
		}

		@Override
		public Adapter casePathVector(PathVector object) {
			return createPathVectorAdapter();
		}

		@Override
		public Adapter caseSynchronization(Synchronization object) {
			return createSynchronizationAdapter();
		}

		@Override
		public Adapter caseRepositoryConfiguration(RepositoryConfiguration object) {
			return createRepositoryConfigurationAdapter();
		}

		@Override
		public Adapter caseRepositoryDeclaration(RepositoryDeclaration object) {
			return createRepositoryDeclarationAdapter();
		}

		@Override
		public Adapter caseResolutionStrategy(ResolutionStrategy object) {
			return createResolutionStrategyAdapter();
		}

		@Override
		public Adapter caseResolutionStrategyFirst(ResolutionStrategyFirst object) {
			return createResolutionStrategyFirstAdapter();
		}

		@Override
		public Adapter caseResolutionStrategyBest(ResolutionStrategyBest object) {
			return createResolutionStrategyBestAdapter();
		}

		@Override
		public Adapter caseContainerConfiguration(ContainerConfiguration object) {
			return createContainerConfigurationAdapter();
		}

		@Override
		public Adapter caseBuildContext(BuildContext object) {
			return createBuildContextAdapter();
		}

		@Override
		public Adapter caseBuildConcernContext(BuildConcernContext object) {
			return createBuildConcernContextAdapter();
		}

		@Override
		public Adapter caseRequiresPredicate(RequiresPredicate object) {
			return createRequiresPredicateAdapter();
		}

		@Override
		public Adapter caseCapabilityPredicate(CapabilityPredicate object) {
			return createCapabilityPredicateAdapter();
		}

		@Override
		public Adapter caseImplementsPredicate(ImplementsPredicate object) {
			return createImplementsPredicateAdapter();
		}

		@Override
		public Adapter caseProvidesPredicate(ProvidesPredicate object) {
			return createProvidesPredicateAdapter();
		}

		@Override
		public Adapter caseNameSpacePredicate(NameSpacePredicate object) {
			return createNameSpacePredicateAdapter();
		}

		@Override
		public Adapter caseUnitNamePredicate(UnitNamePredicate object) {
			return createUnitNamePredicateAdapter();
		}

		@Override
		public Adapter caseBuilderNamePredicate(BuilderNamePredicate object) {
			return createBuilderNamePredicateAdapter();
		}

		@Override
		public Adapter caseInputPredicate(InputPredicate object) {
			return createInputPredicateAdapter();
		}

		@Override
		public Adapter caseUnitConcernContext(UnitConcernContext object) {
			return createUnitConcernContextAdapter();
		}

		@Override
		public Adapter caseBuilderConcernContext(BuilderConcernContext object) {
			return createBuilderConcernContextAdapter();
		}

		@Override
		public Adapter casePathGroupPredicate(PathGroupPredicate object) {
			return createPathGroupPredicateAdapter();
		}

		@Override
		public Adapter caseAliasedRequiredCapability(AliasedRequiredCapability object) {
			return createAliasedRequiredCapabilityAdapter();
		}

		@Override
		public Adapter caseIRequiredCapabilityContainer(IRequiredCapabilityContainer object) {
			return createIRequiredCapabilityContainerAdapter();
		}

		@Override
		public Adapter caseIProvidedCapabilityContainer(IProvidedCapabilityContainer object) {
			return createIProvidedCapabilityContainerAdapter();
		}

		@Override
		public Adapter caseBuilderQuery(BuilderQuery object) {
			return createBuilderQueryAdapter();
		}

		@Override
		public Adapter caseBuilder(Builder object) {
			return createBuilderAdapter();
		}

		@Override
		public Adapter caseBuilderJava(BuilderJava object) {
			return createBuilderJavaAdapter();
		}

		@Override
		public Adapter caseBuilderWrapper(BuilderWrapper object) {
			return createBuilderWrapperAdapter();
		}

		@Override
		public Adapter caseBeeModel(BeeModel object) {
			return createBeeModelAdapter();
		}

		@Override
		public Adapter caseBeeHive(BeeHive object) {
			return createBeeHiveAdapter();
		}

		@Override
		public Adapter caseResolutionInfo(ResolutionInfo object) {
			return createResolutionInfoAdapter();
		}

		@Override
		public Adapter caseEffectiveFacade(EffectiveFacade object) {
			return createEffectiveFacadeAdapter();
		}

		@Override
		public Adapter caseEffectiveUnitFacade(EffectiveUnitFacade object) {
			return createEffectiveUnitFacadeAdapter();
		}

		@Override
		public Adapter caseEffectiveRequirementFacade(EffectiveRequirementFacade object) {
			return createEffectiveRequirementFacadeAdapter();
		}

		@Override
		public Adapter caseEffectiveCapabilityFacade(EffectiveCapabilityFacade object) {
			return createEffectiveCapabilityFacadeAdapter();
		}

		@Override
		public Adapter caseEffectiveBuilderReferenceFacade(EffectiveBuilderReferenceFacade object) {
			return createEffectiveBuilderReferenceFacadeAdapter();
		}

		@Override
		public Adapter caseBuildSet(BuildSet object) {
			return createBuildSetAdapter();
		}

		@Override
		public Adapter caseBuildResultContext(BuildResultContext object) {
			return createBuildResultContextAdapter();
		}

		@Override
		public Adapter caseOutputPredicate(OutputPredicate object) {
			return createOutputPredicateAdapter();
		}

		@Override
		public Adapter caseSourcePredicate(SourcePredicate object) {
			return createSourcePredicateAdapter();
		}

		@Override
		public Adapter caseBuildUnitRepository(BuildUnitRepository object) {
			return createBuildUnitRepositoryAdapter();
		}

		@Override
		public Adapter caseCompoundBuildUnitRepository(CompoundBuildUnitRepository object) {
			return createCompoundBuildUnitRepositoryAdapter();
		}

		@Override
		public Adapter caseCompoundFirstFoundRepository(CompoundFirstFoundRepository object) {
			return createCompoundFirstFoundRepositoryAdapter();
		}

		@Override
		public Adapter caseCompoundBestFoundRepository(CompoundBestFoundRepository object) {
			return createCompoundBestFoundRepositoryAdapter();
		}

		@Override
		public Adapter caseExecutionStackRepository(ExecutionStackRepository object) {
			return createExecutionStackRepositoryAdapter();
		}

		@Override
		public Adapter caseSimpleRepository(SimpleRepository object) {
			return createSimpleRepositoryAdapter();
		}

		@Override
		public Adapter caseIBuildUnitRepository(IBuildUnitRepository object) {
			return createIBuildUnitRepositoryAdapter();
		}

		@Override
		public Adapter caseUnitResolutionInfo(UnitResolutionInfo object) {
			return createUnitResolutionInfoAdapter();
		}

		@Override
		public Adapter caseBFunctionContainer(BFunctionContainer object) {
			return createBFunctionContainerAdapter();
		}

		@Override
		public Adapter caseIGenericDeclaration(GenericDeclaration object) {
			return createIGenericDeclarationAdapter();
		}

		@Override
		public Adapter caseBExpression(BExpression object) {
			return createBExpressionAdapter();
		}

		@Override
		public Adapter caseIFunction(IFunction object) {
			return createIFunctionAdapter();
		}

		@Override
		public Adapter caseITypedValueContainer(ITypedValueContainer object) {
			return createITypedValueContainerAdapter();
		}

		@Override
		public Adapter caseBExecutionContext(BExecutionContext object) {
			return createBExecutionContextAdapter();
		}

		@Override
		public Adapter caseBConcernContext(BConcernContext object) {
			return createBConcernContextAdapter();
		}

		@Override
		public Adapter caseBFunction(BFunction object) {
			return createBFunctionAdapter();
		}

		@Override
		public Adapter caseB3Function(B3Function object) {
			return createB3FunctionAdapter();
		}

		@Override
		public Adapter caseBJavaFunction(BJavaFunction object) {
			return createBJavaFunctionAdapter();
		}

		@Override
		public Adapter caseBFunctionWrapper(BFunctionWrapper object) {
			return createBFunctionWrapperAdapter();
		}

		@Override
		public Adapter caseBInnerContext(BInnerContext object) {
			return createBInnerContextAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuildUnit <em>Build Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuildUnit
	 * @generated
	 */
	public Adapter createBuildUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.IBuilder <em>IBuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.IBuilder
	 * @generated
	 */
	public Adapter createIBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.Builder <em>Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.Builder
	 * @generated
	 */
	public Adapter createBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuilderJava <em>Builder Java</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuilderJava
	 * @generated
	 */
	public Adapter createBuilderJavaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuilderWrapper <em>Builder Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuilderWrapper
	 * @generated
	 */
	public Adapter createBuilderWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BeeModel <em>Bee Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BeeModel
	 * @generated
	 */
	public Adapter createBeeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BeeHive <em>Bee Hive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BeeHive
	 * @generated
	 */
	public Adapter createBeeHiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ResolutionInfo <em>Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ResolutionInfo
	 * @generated
	 */
	public Adapter createResolutionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.EffectiveFacade <em>Effective Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.EffectiveFacade
	 * @generated
	 */
	public Adapter createEffectiveFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.EffectiveUnitFacade <em>Effective Unit Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.EffectiveUnitFacade
	 * @generated
	 */
	public Adapter createEffectiveUnitFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.EffectiveRequirementFacade <em>Effective Requirement Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.EffectiveRequirementFacade
	 * @generated
	 */
	public Adapter createEffectiveRequirementFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.EffectiveCapabilityFacade <em>Effective Capability Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.EffectiveCapabilityFacade
	 * @generated
	 */
	public Adapter createEffectiveCapabilityFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade <em>Effective Builder Reference Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade
	 * @generated
	 */
	public Adapter createEffectiveBuilderReferenceFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuildSet <em>Build Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuildSet
	 * @generated
	 */
	public Adapter createBuildSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuildResultContext <em>Build Result Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuildResultContext
	 * @generated
	 */
	public Adapter createBuildResultContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.OutputPredicate <em>Output Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.OutputPredicate
	 * @generated
	 */
	public Adapter createOutputPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.SourcePredicate <em>Source Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.SourcePredicate
	 * @generated
	 */
	public Adapter createSourcePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuildUnitRepository <em>Build Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuildUnitRepository
	 * @generated
	 */
	public Adapter createBuildUnitRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.CompoundBuildUnitRepository <em>Compound Build Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.CompoundBuildUnitRepository
	 * @generated
	 */
	public Adapter createCompoundBuildUnitRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.CompoundFirstFoundRepository <em>Compound First Found Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.CompoundFirstFoundRepository
	 * @generated
	 */
	public Adapter createCompoundFirstFoundRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.CompoundBestFoundRepository <em>Compound Best Found Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.CompoundBestFoundRepository
	 * @generated
	 */
	public Adapter createCompoundBestFoundRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ExecutionStackRepository <em>Execution Stack Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ExecutionStackRepository
	 * @generated
	 */
	public Adapter createExecutionStackRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.SimpleRepository <em>Simple Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.SimpleRepository
	 * @generated
	 */
	public Adapter createSimpleRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.core.IBuildUnitRepository <em>IBuild Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.core.IBuildUnitRepository
	 * @generated
	 */
	public Adapter createIBuildUnitRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.UnitResolutionInfo <em>Unit Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.UnitResolutionInfo
	 * @generated
	 */
	public Adapter createUnitResolutionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.VersionedCapability <em>Versioned Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.VersionedCapability
	 * @generated
	 */
	public Adapter createVersionedCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.RequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.RequiredCapability
	 * @generated
	 */
	public Adapter createRequiredCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ConditionalPathVector <em>Conditional Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ConditionalPathVector
	 * @generated
	 */
	public Adapter createConditionalPathVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.PathVector <em>Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.PathVector
	 * @generated
	 */
	public Adapter createPathVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.Synchronization
	 * @generated
	 */
	public Adapter createSynchronizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.RepositoryConfiguration <em>Repository Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.RepositoryConfiguration
	 * @generated
	 */
	public Adapter createRepositoryConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.RepositoryDeclaration <em>Repository Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.RepositoryDeclaration
	 * @generated
	 */
	public Adapter createRepositoryDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ResolutionStrategy <em>Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ResolutionStrategy
	 * @generated
	 */
	public Adapter createResolutionStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ResolutionStrategyFirst <em>Resolution Strategy First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ResolutionStrategyFirst
	 * @generated
	 */
	public Adapter createResolutionStrategyFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ResolutionStrategyBest <em>Resolution Strategy Best</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ResolutionStrategyBest
	 * @generated
	 */
	public Adapter createResolutionStrategyBestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ContainerConfiguration <em>Container Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ContainerConfiguration
	 * @generated
	 */
	public Adapter createContainerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuildContext <em>Build Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuildContext
	 * @generated
	 */
	public Adapter createBuildContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuildConcernContext <em>Build Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuildConcernContext
	 * @generated
	 */
	public Adapter createBuildConcernContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.RequiresPredicate <em>Requires Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.RequiresPredicate
	 * @generated
	 */
	public Adapter createRequiresPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.CapabilityPredicate <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.CapabilityPredicate
	 * @generated
	 */
	public Adapter createCapabilityPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ImplementsPredicate <em>Implements Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ImplementsPredicate
	 * @generated
	 */
	public Adapter createImplementsPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.ProvidesPredicate <em>Provides Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.ProvidesPredicate
	 * @generated
	 */
	public Adapter createProvidesPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.NameSpacePredicate <em>Name Space Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.NameSpacePredicate
	 * @generated
	 */
	public Adapter createNameSpacePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.UnitNamePredicate <em>Unit Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.UnitNamePredicate
	 * @generated
	 */
	public Adapter createUnitNamePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuilderNamePredicate <em>Builder Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuilderNamePredicate
	 * @generated
	 */
	public Adapter createBuilderNamePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.InputPredicate <em>Input Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.InputPredicate
	 * @generated
	 */
	public Adapter createInputPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.UnitConcernContext <em>Unit Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.UnitConcernContext
	 * @generated
	 */
	public Adapter createUnitConcernContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuilderConcernContext <em>Builder Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuilderConcernContext
	 * @generated
	 */
	public Adapter createBuilderConcernContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.PathGroupPredicate <em>Path Group Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.PathGroupPredicate
	 * @generated
	 */
	public Adapter createPathGroupPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.AliasedRequiredCapability <em>Aliased Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.AliasedRequiredCapability
	 * @generated
	 */
	public Adapter createAliasedRequiredCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.IRequiredCapabilityContainer
	 * @generated
	 */
	public Adapter createIRequiredCapabilityContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.IProvidedCapabilityContainer
	 * @generated
	 */
	public Adapter createIProvidedCapabilityContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuilderQuery <em>Builder Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuilderQuery
	 * @generated
	 */
	public Adapter createBuilderQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer <em>BFunction Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer
	 * @generated
	 */
	public Adapter createBFunctionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuilderInput <em>Builder Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuilderInput
	 * @generated
	 */
	public Adapter createBuilderInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.PathGroup <em>Path Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.PathGroup
	 * @generated
	 */
	public Adapter createPathGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.Prerequisite <em>Prerequisite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.Prerequisite
	 * @generated
	 */
	public Adapter createPrerequisiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuildResultReference <em>Build Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuildResultReference
	 * @generated
	 */
	public Adapter createBuildResultReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.CompoundBuildResultReference <em>Compound Build Result Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.CompoundBuildResultReference
	 * @generated
	 */
	public Adapter createCompoundBuildResultReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.BuilderReference <em>Builder Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.BuilderReference
	 * @generated
	 */
	public Adapter createBuilderReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression <em>BExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression
	 * @generated
	 */
	public Adapter createBExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.reflect.GenericDeclaration <em>IGeneric Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.reflect.GenericDeclaration
	 * @generated
	 */
	public Adapter createIGenericDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction <em>IFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction
	 * @generated
	 */
	public Adapter createIFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer <em>ITyped Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer
	 * @generated
	 */
	public Adapter createITypedValueContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunction <em>BFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunction
	 * @generated
	 */
	public Adapter createBFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.B3Function <em>B3 Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3Function
	 * @generated
	 */
	public Adapter createB3FunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction <em>BJava Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction
	 * @generated
	 */
	public Adapter createBJavaFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper <em>BFunction Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper
	 * @generated
	 */
	public Adapter createBFunctionWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BInnerContext <em>BInner Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInnerContext
	 * @generated
	 */
	public Adapter createBInnerContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext <em>BExecution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext
	 * @generated
	 */
	public Adapter createBExecutionContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BConcernContext <em>BConcern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BConcernContext
	 * @generated
	 */
	public Adapter createBConcernContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //B3BuildAdapterFactory
