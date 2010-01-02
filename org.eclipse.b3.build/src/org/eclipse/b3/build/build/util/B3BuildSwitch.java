/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.util;

import java.lang.reflect.GenericDeclaration;

import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BSourceLink;

import org.eclipse.b3.build.build.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.build.build.B3BuildPackage
 * @generated
 */
public class B3BuildSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static B3BuildPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3BuildSwitch() {
		if (modelPackage == null) {
			modelPackage = B3BuildPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case B3BuildPackage.BUILD_UNIT: {
				BuildUnit buildUnit = (BuildUnit)theEObject;
				T result = caseBuildUnit(buildUnit);
				if (result == null) result = caseVersionedCapability(buildUnit);
				if (result == null) result = caseCapability(buildUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER: {
				Builder builder = (Builder)theEObject;
				T result = caseBuilder(builder);
				if (result == null) result = caseB3Function(builder);
				if (result == null) result = caseBFunction(builder);
				if (result == null) result = caseBExpression(builder);
				if (result == null) result = caseIGenericDeclaration(builder);
				if (result == null) result = caseBSourceLink(builder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.VERSIONED_CAPABILITY: {
				VersionedCapability versionedCapability = (VersionedCapability)theEObject;
				T result = caseVersionedCapability(versionedCapability);
				if (result == null) result = caseCapability(versionedCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_INPUT: {
				BuilderInput builderInput = (BuilderInput)theEObject;
				T result = caseBuilderInput(builderInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PATH_GROUP: {
				PathGroup pathGroup = (PathGroup)theEObject;
				T result = casePathGroup(pathGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PREREQUISITE: {
				Prerequisite prerequisite = (Prerequisite)theEObject;
				T result = casePrerequisite(prerequisite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_RESULT_REFERENCE: {
				BuildResultReference buildResultReference = (BuildResultReference)theEObject;
				T result = caseBuildResultReference(buildResultReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.COMPOUND_BUILD_RESULT_REFERENCE: {
				CompoundBuildResultReference compoundBuildResultReference = (CompoundBuildResultReference)theEObject;
				T result = caseCompoundBuildResultReference(compoundBuildResultReference);
				if (result == null) result = caseBuildResultReference(compoundBuildResultReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_REFERENCE: {
				BuilderReference builderReference = (BuilderReference)theEObject;
				T result = caseBuilderReference(builderReference);
				if (result == null) result = caseBuildResultReference(builderReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REQUIRED_CAPABILITY: {
				RequiredCapability requiredCapability = (RequiredCapability)theEObject;
				T result = caseRequiredCapability(requiredCapability);
				if (result == null) result = caseCapability(requiredCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PATH_VECTOR: {
				PathVector pathVector = (PathVector)theEObject;
				T result = casePathVector(pathVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.COMPOUND_PATH_VECTOR: {
				CompoundPathVector compoundPathVector = (CompoundPathVector)theEObject;
				T result = caseCompoundPathVector(compoundPathVector);
				if (result == null) result = casePathVector(compoundPathVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PATH_VECTOR_ELEMENT: {
				PathVectorElement pathVectorElement = (PathVectorElement)theEObject;
				T result = casePathVectorElement(pathVectorElement);
				if (result == null) result = casePathVector(pathVectorElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization)theEObject;
				T result = caseSynchronization(synchronization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.SYNCHRONIZED_BUILDER: {
				SynchronizedBuilder synchronizedBuilder = (SynchronizedBuilder)theEObject;
				T result = caseSynchronizedBuilder(synchronizedBuilder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REPOSITORY_CONFIGURATION: {
				RepositoryConfiguration repositoryConfiguration = (RepositoryConfiguration)theEObject;
				T result = caseRepositoryConfiguration(repositoryConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REPOSITORY_DECLARATION: {
				RepositoryDeclaration repositoryDeclaration = (RepositoryDeclaration)theEObject;
				T result = caseRepositoryDeclaration(repositoryDeclaration);
				if (result == null) result = caseRepositoryConfiguration(repositoryDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.RESOLUTION_STRATEGY: {
				ResolutionStrategy resolutionStrategy = (ResolutionStrategy)theEObject;
				T result = caseResolutionStrategy(resolutionStrategy);
				if (result == null) result = caseRepositoryConfiguration(resolutionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.RESOLUTION_STRATEGY_FIRST: {
				ResolutionStrategyFirst resolutionStrategyFirst = (ResolutionStrategyFirst)theEObject;
				T result = caseResolutionStrategyFirst(resolutionStrategyFirst);
				if (result == null) result = caseResolutionStrategy(resolutionStrategyFirst);
				if (result == null) result = caseRepositoryConfiguration(resolutionStrategyFirst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.RESOLUTION_STRATEGY_BEST: {
				ResolutionStrategyBest resolutionStrategyBest = (ResolutionStrategyBest)theEObject;
				T result = caseResolutionStrategyBest(resolutionStrategyBest);
				if (result == null) result = caseResolutionStrategy(resolutionStrategyBest);
				if (result == null) result = caseRepositoryConfiguration(resolutionStrategyBest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.CONTAINER_CONFIGURATION: {
				ContainerConfiguration containerConfiguration = (ContainerConfiguration)theEObject;
				T result = caseContainerConfiguration(containerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildUnit(BuildUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilder(Builder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedCapability(VersionedCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredCapability(RequiredCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathVector(PathVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Path Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Path Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundPathVector(CompoundPathVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Vector Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Vector Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathVectorElement(PathVectorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronization(Synchronization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Builder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Builder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizedBuilder(SynchronizedBuilder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryConfiguration(RepositoryConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryDeclaration(RepositoryDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionStrategy(ResolutionStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Strategy First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Strategy First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionStrategyFirst(ResolutionStrategyFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Strategy Best</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Strategy Best</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionStrategyBest(ResolutionStrategyBest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerConfiguration(ContainerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderInput(BuilderInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathGroup(PathGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerequisite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrerequisite(Prerequisite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Result Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Result Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildResultReference(BuildResultReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Build Result Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Build Result Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundBuildResultReference(CompoundBuildResultReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderReference(BuilderReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSource Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSource Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSourceLink(BSourceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExpression(BExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGeneric Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGeneric Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGenericDeclaration(GenericDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunction(BFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3Function(B3Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //B3BuildSwitch
