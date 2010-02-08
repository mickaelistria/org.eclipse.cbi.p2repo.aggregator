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
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
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
				if (result == null) result = caseBFunctionContainer(buildUnit);
				if (result == null) result = caseIRequiredCapabilityContainer(buildUnit);
				if (result == null) result = caseIProvidedCapabilityContainer(buildUnit);
				if (result == null) result = caseCapability(buildUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IBUILDER: {
				IBuilder iBuilder = (IBuilder)theEObject;
				T result = caseIBuilder(iBuilder);
				if (result == null) result = caseIProvidedCapabilityContainer(iBuilder);
				if (result == null) result = caseIFunction(iBuilder);
				if (result == null) result = caseIGenericDeclaration(iBuilder);
				if (result == null) result = caseBExpression(iBuilder);
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
			case B3BuildPackage.BUILD_CONTEXT: {
				BuildContext buildContext = (BuildContext)theEObject;
				T result = caseBuildContext(buildContext);
				if (result == null) result = caseBExecutionContext(buildContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_CONCERN_CONTEXT: {
				BuildConcernContext buildConcernContext = (BuildConcernContext)theEObject;
				T result = caseBuildConcernContext(buildConcernContext);
				if (result == null) result = caseBConcernContext(buildConcernContext);
				if (result == null) result = caseIProvidedCapabilityContainer(buildConcernContext);
				if (result == null) result = caseBExpression(buildConcernContext);
				if (result == null) result = caseBFunctionContainer(buildConcernContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REQUIRES_PREDICATE: {
				RequiresPredicate requiresPredicate = (RequiresPredicate)theEObject;
				T result = caseRequiresPredicate(requiresPredicate);
				if (result == null) result = caseBExpression(requiresPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.CAPABILITY_PREDICATE: {
				CapabilityPredicate capabilityPredicate = (CapabilityPredicate)theEObject;
				T result = caseCapabilityPredicate(capabilityPredicate);
				if (result == null) result = caseBExpression(capabilityPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IMPLEMENTS_PREDICATE: {
				ImplementsPredicate implementsPredicate = (ImplementsPredicate)theEObject;
				T result = caseImplementsPredicate(implementsPredicate);
				if (result == null) result = caseBExpression(implementsPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PROVIDES_PREDICATE: {
				ProvidesPredicate providesPredicate = (ProvidesPredicate)theEObject;
				T result = caseProvidesPredicate(providesPredicate);
				if (result == null) result = caseBExpression(providesPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.NAME_SPACE_PREDICATE: {
				NameSpacePredicate nameSpacePredicate = (NameSpacePredicate)theEObject;
				T result = caseNameSpacePredicate(nameSpacePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.UNIT_NAME_PREDICATE: {
				UnitNamePredicate unitNamePredicate = (UnitNamePredicate)theEObject;
				T result = caseUnitNamePredicate(unitNamePredicate);
				if (result == null) result = caseCapabilityPredicate(unitNamePredicate);
				if (result == null) result = caseBExpression(unitNamePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_NAME_PREDICATE: {
				BuilderNamePredicate builderNamePredicate = (BuilderNamePredicate)theEObject;
				T result = caseBuilderNamePredicate(builderNamePredicate);
				if (result == null) result = caseBExpression(builderNamePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.INPUT_PREDICATE: {
				InputPredicate inputPredicate = (InputPredicate)theEObject;
				T result = caseInputPredicate(inputPredicate);
				if (result == null) result = caseBExpression(inputPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.UNIT_CONCERN_CONTEXT: {
				UnitConcernContext unitConcernContext = (UnitConcernContext)theEObject;
				T result = caseUnitConcernContext(unitConcernContext);
				if (result == null) result = caseBuildConcernContext(unitConcernContext);
				if (result == null) result = caseIRequiredCapabilityContainer(unitConcernContext);
				if (result == null) result = caseBConcernContext(unitConcernContext);
				if (result == null) result = caseIProvidedCapabilityContainer(unitConcernContext);
				if (result == null) result = caseBExpression(unitConcernContext);
				if (result == null) result = caseBFunctionContainer(unitConcernContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT: {
				BuilderConcernContext builderConcernContext = (BuilderConcernContext)theEObject;
				T result = caseBuilderConcernContext(builderConcernContext);
				if (result == null) result = caseBuildConcernContext(builderConcernContext);
				if (result == null) result = caseBConcernContext(builderConcernContext);
				if (result == null) result = caseIProvidedCapabilityContainer(builderConcernContext);
				if (result == null) result = caseBExpression(builderConcernContext);
				if (result == null) result = caseBFunctionContainer(builderConcernContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.OUTPUT_PREDICATE: {
				OutputPredicate outputPredicate = (OutputPredicate)theEObject;
				T result = caseOutputPredicate(outputPredicate);
				if (result == null) result = caseBExpression(outputPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.ALIASED_REQUIRED_CAPABILITY: {
				AliasedRequiredCapability aliasedRequiredCapability = (AliasedRequiredCapability)theEObject;
				T result = caseAliasedRequiredCapability(aliasedRequiredCapability);
				if (result == null) result = caseRequiredCapability(aliasedRequiredCapability);
				if (result == null) result = caseCapability(aliasedRequiredCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER: {
				IRequiredCapabilityContainer iRequiredCapabilityContainer = (IRequiredCapabilityContainer)theEObject;
				T result = caseIRequiredCapabilityContainer(iRequiredCapabilityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER: {
				IProvidedCapabilityContainer iProvidedCapabilityContainer = (IProvidedCapabilityContainer)theEObject;
				T result = caseIProvidedCapabilityContainer(iProvidedCapabilityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_QUERY: {
				BuilderQuery builderQuery = (BuilderQuery)theEObject;
				T result = caseBuilderQuery(builderQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER: {
				Builder builder = (Builder)theEObject;
				T result = caseBuilder(builder);
				if (result == null) result = caseB3Function(builder);
				if (result == null) result = caseIBuilder(builder);
				if (result == null) result = caseBFunction(builder);
				if (result == null) result = caseIProvidedCapabilityContainer(builder);
				if (result == null) result = caseIFunction(builder);
				if (result == null) result = caseBExpression(builder);
				if (result == null) result = caseIGenericDeclaration(builder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_JAVA: {
				BuilderJava builderJava = (BuilderJava)theEObject;
				T result = caseBuilderJava(builderJava);
				if (result == null) result = caseBJavaFunction(builderJava);
				if (result == null) result = caseIBuilder(builderJava);
				if (result == null) result = caseBFunction(builderJava);
				if (result == null) result = caseIProvidedCapabilityContainer(builderJava);
				if (result == null) result = caseIFunction(builderJava);
				if (result == null) result = caseBExpression(builderJava);
				if (result == null) result = caseIGenericDeclaration(builderJava);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_WRAPPER: {
				BuilderWrapper builderWrapper = (BuilderWrapper)theEObject;
				T result = caseBuilderWrapper(builderWrapper);
				if (result == null) result = caseBFunctionWrapper(builderWrapper);
				if (result == null) result = caseIBuilder(builderWrapper);
				if (result == null) result = caseIFunction(builderWrapper);
				if (result == null) result = caseIProvidedCapabilityContainer(builderWrapper);
				if (result == null) result = caseBExpression(builderWrapper);
				if (result == null) result = caseIGenericDeclaration(builderWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BEE_MODEL: {
				BeeModel beeModel = (BeeModel)theEObject;
				T result = caseBeeModel(beeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BEE_HIVE: {
				BeeHive beeHive = (BeeHive)theEObject;
				T result = caseBeeHive(beeHive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.RESOLUTION_INFO: {
				ResolutionInfo resolutionInfo = (ResolutionInfo)theEObject;
				T result = caseResolutionInfo(resolutionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_FACADE: {
				EffectiveFacade effectiveFacade = (EffectiveFacade)theEObject;
				T result = caseEffectiveFacade(effectiveFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE: {
				EffectiveUnitFacade effectiveUnitFacade = (EffectiveUnitFacade)theEObject;
				T result = caseEffectiveUnitFacade(effectiveUnitFacade);
				if (result == null) result = caseEffectiveFacade(effectiveUnitFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_REQUIREMENT_FACADE: {
				EffectiveRequirementFacade effectiveRequirementFacade = (EffectiveRequirementFacade)theEObject;
				T result = caseEffectiveRequirementFacade(effectiveRequirementFacade);
				if (result == null) result = caseEffectiveFacade(effectiveRequirementFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE: {
				EffectiveCapabilityFacade effectiveCapabilityFacade = (EffectiveCapabilityFacade)theEObject;
				T result = caseEffectiveCapabilityFacade(effectiveCapabilityFacade);
				if (result == null) result = caseEffectiveFacade(effectiveCapabilityFacade);
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
	 * Returns the result of interpreting the object as an instance of '<em>IBuilder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBuilder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBuilder(IBuilder object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Builder Java</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Java</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderJava(BuilderJava object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderWrapper(BuilderWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bee Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bee Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeeModel(BeeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bee Hive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bee Hive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeeHive(BeeHive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionInfo(ResolutionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effective Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effective Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectiveFacade(EffectiveFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effective Unit Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effective Unit Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectiveUnitFacade(EffectiveUnitFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effective Requirement Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effective Requirement Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectiveRequirementFacade(EffectiveRequirementFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effective Capability Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effective Capability Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectiveCapabilityFacade(EffectiveCapabilityFacade object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Build Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildContext(BuildContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Concern Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildConcernContext(BuildConcernContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresPredicate(RequiresPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityPredicate(CapabilityPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implements Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implements Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementsPredicate(ImplementsPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidesPredicate(ProvidesPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Space Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Space Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSpacePredicate(NameSpacePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Name Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Name Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitNamePredicate(UnitNamePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Name Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Name Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderNamePredicate(BuilderNamePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPredicate(InputPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Concern Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitConcernContext(UnitConcernContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Concern Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderConcernContext(BuilderConcernContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPredicate(OutputPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aliased Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aliased Required Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasedRequiredCapability(AliasedRequiredCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRequired Capability Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRequired Capability Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRequiredCapabilityContainer(IRequiredCapabilityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProvided Capability Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProvided Capability Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProvidedCapabilityContainer(IProvidedCapabilityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderQuery(BuilderQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionContainer(BFunctionContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFunction(IFunction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>BJava Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BJava Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBJavaFunction(BJavaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionWrapper(BFunctionWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExecution Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExecution Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExecutionContext(BExecutionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BConcern Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BConcern Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBConcernContext(BConcernContext object) {
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
