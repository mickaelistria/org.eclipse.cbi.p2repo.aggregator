/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.util;

import java.lang.reflect.GenericDeclaration;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BSourceLink;

import org.eclipse.b3.build.build.*;

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
		if (modelPackage == null) {
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
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B3BuildSwitch<Adapter> modelSwitch =
		new B3BuildSwitch<Adapter>() {
			@Override
			public Adapter caseBuildUnit(BuildUnit object) {
				return createBuildUnitAdapter();
			}
			@Override
			public Adapter caseBuilder(Builder object) {
				return createBuilderAdapter();
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
			public Adapter casePathVector(PathVector object) {
				return createPathVectorAdapter();
			}
			@Override
			public Adapter caseCompoundPathVector(CompoundPathVector object) {
				return createCompoundPathVectorAdapter();
			}
			@Override
			public Adapter casePathVectorElement(PathVectorElement object) {
				return createPathVectorElementAdapter();
			}
			@Override
			public Adapter caseSynchronization(Synchronization object) {
				return createSynchronizationAdapter();
			}
			@Override
			public Adapter caseSynchronizedBuilder(SynchronizedBuilder object) {
				return createSynchronizedBuilderAdapter();
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
			public Adapter caseBSourceLink(BSourceLink object) {
				return createBSourceLinkAdapter();
			}
			@Override
			public Adapter caseBExpression(BExpression object) {
				return createBExpressionAdapter();
			}
			@Override
			public Adapter caseIGenericDeclaration(GenericDeclaration object) {
				return createIGenericDeclarationAdapter();
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
			public Adapter caseBExecutionContext(BExecutionContext object) {
				return createBExecutionContextAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.CompoundPathVector <em>Compound Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.CompoundPathVector
	 * @generated
	 */
	public Adapter createCompoundPathVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.PathVectorElement <em>Path Vector Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.PathVectorElement
	 * @generated
	 */
	public Adapter createPathVectorElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.build.build.SynchronizedBuilder <em>Synchronized Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.build.build.SynchronizedBuilder
	 * @generated
	 */
	public Adapter createSynchronizedBuilderAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.b3.backend.evaluator.b3backend.BSourceLink <em>BSource Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSourceLink
	 * @generated
	 */
	public Adapter createBSourceLinkAdapter() {
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
