/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.util;

import java.lang.reflect.GenericDeclaration;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer;
import org.eclipse.b3.build.*;
import org.eclipse.b3.build.AliasedRequiredCapability;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BeeHive;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BeeModelRepository;
import org.eclipse.b3.build.BestFoundUnitProvider;
import org.eclipse.b3.build.Branch;
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
import org.eclipse.b3.build.IBuildUnitContainer;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.IEffectiveFacade;
import org.eclipse.b3.build.IProvidedCapabilityContainer;
import org.eclipse.b3.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.ImplementsPredicate;
import org.eclipse.b3.build.InputPredicate;
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
import org.eclipse.b3.build.UnitConcernContext;
import org.eclipse.b3.build.UnitNamePredicate;
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.b3.build.UnitRepositoryDescription;
import org.eclipse.b3.build.UnitResolutionInfo;
import org.eclipse.b3.build.VersionedCapability;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each
 * class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.build.B3BuildPackage
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
		if(modelPackage == null) {
			modelPackage = B3BuildPackage.eINSTANCE;
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>BChained Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BChained Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBChainedExpression(BChainedExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bee Model Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bee Model Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeeModelRepository(BeeModelRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Best Found Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Best Found Unit Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBestFoundUnitProvider(BestFoundUnitProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>BInner Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInner Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInnerContext(BInnerContext object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Call Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Call Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildCallMultiple(BuildCallMultiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Call On Declared Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Call On Declared Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildCallOnDeclaredRequirement(BuildCallOnDeclaredRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Call On Referenced Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Call On Referenced Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildCallOnReferencedRequirement(BuildCallOnReferencedRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Call On Selected Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Call On Selected Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildCallOnSelectedRequirements(BuildCallOnSelectedRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Call Single</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Call Single</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildCallSingle(BuildCallSingle object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Builder Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderCall(BuilderCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Call Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Call Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderCallFacade(BuilderCallFacade object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Builder Input Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Input Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderInputCondition(BuilderInputCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Input Context Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Input Context Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderInputContextDecorator(BuilderInputContextDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Input Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Input Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderInputDecorator(BuilderInputDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Input Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderInputGroup(BuilderInputGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Builder Input Name Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Builder Input Name Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilderInputNameDecorator(BuilderInputNameDecorator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Build Result Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Result Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildResultContext(BuildResultContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildSet(BuildSet object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Build Unit Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Unit Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildUnitRepository(BuildUnitRepository object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Compound Build Unit Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Build Unit Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundBuildUnitRepository(CompoundBuildUnitRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound First Found Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound First Found Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundFirstFoundRepository(CompoundFirstFoundRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Unit Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundUnitProvider(CompoundUnitProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Path Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Path Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalPathVector(ConditionalPathVector object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Delegating Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegating Unit Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegatingUnitProvider(DelegatingUnitProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effective Builder Call Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effective Builder Call Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectiveBuilderCallFacade(EffectiveBuilderCallFacade object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Execution Stack Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Stack Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionStackRepository(ExecutionStackRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Found Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Found Unit Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstFoundUnitProvider(FirstFoundUnitProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IBuild Unit Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBuild Unit Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBuildUnitContainer(IBuildUnitContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentHost(FragmentHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBuild Unit Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBuild Unit Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBuildUnitRepository(IBuildUnitRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEffective Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEffective Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEffectiveFacade(IEffectiveFacade object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamedValue(INamedValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ITyped Value Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITyped Value Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypedValueContainer(ITypedValueContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Path Group Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Group Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathGroupPredicate(PathGroupPredicate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Repo Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repo Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepoOption(RepoOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Unit Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryUnitProvider(RepositoryUnitProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Source Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourcePredicate(SourcePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Unit Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchUnitProvider(SwitchUnitProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitProvider(UnitProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Repository Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Repository Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitRepositoryDescription(UnitRepositoryDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Resolution Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Resolution Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitResolutionInfo(UnitResolutionInfo object) {
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

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if(theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
					? defaultCase(theEObject)
					: doSwitch(eSuperTypes.get(0), theEObject);
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch(classifierID) {
			case B3BuildPackage.BUILD_UNIT: {
				BuildUnit buildUnit = (BuildUnit) theEObject;
				T result = caseBuildUnit(buildUnit);
				if(result == null)
					result = caseVersionedCapability(buildUnit);
				if(result == null)
					result = caseBFunctionContainer(buildUnit);
				if(result == null)
					result = caseIRequiredCapabilityContainer(buildUnit);
				if(result == null)
					result = caseIProvidedCapabilityContainer(buildUnit);
				if(result == null)
					result = caseCapability(buildUnit);
				if(result == null)
					result = caseINamedValue(buildUnit);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IBUILDER: {
				IBuilder iBuilder = (IBuilder) theEObject;
				T result = caseIBuilder(iBuilder);
				if(result == null)
					result = caseIProvidedCapabilityContainer(iBuilder);
				if(result == null)
					result = caseIFunction(iBuilder);
				if(result == null)
					result = caseIGenericDeclaration(iBuilder);
				if(result == null)
					result = caseBExpression(iBuilder);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.VERSIONED_CAPABILITY: {
				VersionedCapability versionedCapability = (VersionedCapability) theEObject;
				T result = caseVersionedCapability(versionedCapability);
				if(result == null)
					result = caseCapability(versionedCapability);
				if(result == null)
					result = caseINamedValue(versionedCapability);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_INPUT: {
				BuilderInput builderInput = (BuilderInput) theEObject;
				T result = caseBuilderInput(builderInput);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PATH_GROUP: {
				PathGroup pathGroup = (PathGroup) theEObject;
				T result = casePathGroup(pathGroup);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_INPUT_DECORATOR: {
				BuilderInputDecorator builderInputDecorator = (BuilderInputDecorator) theEObject;
				T result = caseBuilderInputDecorator(builderInputDecorator);
				if(result == null)
					result = caseBuilderInput(builderInputDecorator);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_CALL: {
				BuilderCall builderCall = (BuilderCall) theEObject;
				T result = caseBuilderCall(builderCall);
				if(result == null)
					result = caseBuilderInput(builderCall);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.CAPABILITY: {
				Capability capability = (Capability) theEObject;
				T result = caseCapability(capability);
				if(result == null)
					result = caseINamedValue(capability);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REQUIRED_CAPABILITY: {
				RequiredCapability requiredCapability = (RequiredCapability) theEObject;
				T result = caseRequiredCapability(requiredCapability);
				if(result == null)
					result = caseCapability(requiredCapability);
				if(result == null)
					result = caseINamedValue(requiredCapability);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR: {
				ConditionalPathVector conditionalPathVector = (ConditionalPathVector) theEObject;
				T result = caseConditionalPathVector(conditionalPathVector);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PATH_VECTOR: {
				PathVector pathVector = (PathVector) theEObject;
				T result = casePathVector(pathVector);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.SYNCHRONIZATION: {
				Synchronization synchronization = (Synchronization) theEObject;
				T result = caseSynchronization(synchronization);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.UNIT_PROVIDER: {
				UnitProvider unitProvider = (UnitProvider) theEObject;
				T result = caseUnitProvider(unitProvider);
				if(result == null)
					result = caseBExpression(unitProvider);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER: {
				RepositoryUnitProvider repositoryUnitProvider = (RepositoryUnitProvider) theEObject;
				T result = caseRepositoryUnitProvider(repositoryUnitProvider);
				if(result == null)
					result = caseUnitProvider(repositoryUnitProvider);
				if(result == null)
					result = caseBExpression(repositoryUnitProvider);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.COMPOUND_UNIT_PROVIDER: {
				CompoundUnitProvider compoundUnitProvider = (CompoundUnitProvider) theEObject;
				T result = caseCompoundUnitProvider(compoundUnitProvider);
				if(result == null)
					result = caseUnitProvider(compoundUnitProvider);
				if(result == null)
					result = caseBExpression(compoundUnitProvider);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.FIRST_FOUND_UNIT_PROVIDER: {
				FirstFoundUnitProvider firstFoundUnitProvider = (FirstFoundUnitProvider) theEObject;
				T result = caseFirstFoundUnitProvider(firstFoundUnitProvider);
				if(result == null)
					result = caseCompoundUnitProvider(firstFoundUnitProvider);
				if(result == null)
					result = caseUnitProvider(firstFoundUnitProvider);
				if(result == null)
					result = caseBExpression(firstFoundUnitProvider);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BEST_FOUND_UNIT_PROVIDER: {
				BestFoundUnitProvider bestFoundUnitProvider = (BestFoundUnitProvider) theEObject;
				T result = caseBestFoundUnitProvider(bestFoundUnitProvider);
				if(result == null)
					result = caseCompoundUnitProvider(bestFoundUnitProvider);
				if(result == null)
					result = caseUnitProvider(bestFoundUnitProvider);
				if(result == null)
					result = caseBExpression(bestFoundUnitProvider);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.CONTAINER_CONFIGURATION: {
				ContainerConfiguration containerConfiguration = (ContainerConfiguration) theEObject;
				T result = caseContainerConfiguration(containerConfiguration);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_CONCERN_CONTEXT: {
				BuildConcernContext buildConcernContext = (BuildConcernContext) theEObject;
				T result = caseBuildConcernContext(buildConcernContext);
				if(result == null)
					result = caseBConcernContext(buildConcernContext);
				if(result == null)
					result = caseIProvidedCapabilityContainer(buildConcernContext);
				if(result == null)
					result = caseBExpression(buildConcernContext);
				if(result == null)
					result = caseBFunctionContainer(buildConcernContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REQUIRES_PREDICATE: {
				RequiresPredicate requiresPredicate = (RequiresPredicate) theEObject;
				T result = caseRequiresPredicate(requiresPredicate);
				if(result == null)
					result = caseBExpression(requiresPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.CAPABILITY_PREDICATE: {
				CapabilityPredicate capabilityPredicate = (CapabilityPredicate) theEObject;
				T result = caseCapabilityPredicate(capabilityPredicate);
				if(result == null)
					result = caseBExpression(capabilityPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IMPLEMENTS_PREDICATE: {
				ImplementsPredicate implementsPredicate = (ImplementsPredicate) theEObject;
				T result = caseImplementsPredicate(implementsPredicate);
				if(result == null)
					result = caseBExpression(implementsPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PROVIDES_PREDICATE: {
				ProvidesPredicate providesPredicate = (ProvidesPredicate) theEObject;
				T result = caseProvidesPredicate(providesPredicate);
				if(result == null)
					result = caseBExpression(providesPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.NAME_SPACE_PREDICATE: {
				NameSpacePredicate nameSpacePredicate = (NameSpacePredicate) theEObject;
				T result = caseNameSpacePredicate(nameSpacePredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.UNIT_NAME_PREDICATE: {
				UnitNamePredicate unitNamePredicate = (UnitNamePredicate) theEObject;
				T result = caseUnitNamePredicate(unitNamePredicate);
				if(result == null)
					result = caseCapabilityPredicate(unitNamePredicate);
				if(result == null)
					result = caseBExpression(unitNamePredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_NAME_PREDICATE: {
				BuilderNamePredicate builderNamePredicate = (BuilderNamePredicate) theEObject;
				T result = caseBuilderNamePredicate(builderNamePredicate);
				if(result == null)
					result = caseBExpression(builderNamePredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.INPUT_PREDICATE: {
				InputPredicate inputPredicate = (InputPredicate) theEObject;
				T result = caseInputPredicate(inputPredicate);
				if(result == null)
					result = caseBExpression(inputPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.UNIT_CONCERN_CONTEXT: {
				UnitConcernContext unitConcernContext = (UnitConcernContext) theEObject;
				T result = caseUnitConcernContext(unitConcernContext);
				if(result == null)
					result = caseBuildConcernContext(unitConcernContext);
				if(result == null)
					result = caseIRequiredCapabilityContainer(unitConcernContext);
				if(result == null)
					result = caseBConcernContext(unitConcernContext);
				if(result == null)
					result = caseIProvidedCapabilityContainer(unitConcernContext);
				if(result == null)
					result = caseBExpression(unitConcernContext);
				if(result == null)
					result = caseBFunctionContainer(unitConcernContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT: {
				BuilderConcernContext builderConcernContext = (BuilderConcernContext) theEObject;
				T result = caseBuilderConcernContext(builderConcernContext);
				if(result == null)
					result = caseBuildConcernContext(builderConcernContext);
				if(result == null)
					result = caseBConcernContext(builderConcernContext);
				if(result == null)
					result = caseIProvidedCapabilityContainer(builderConcernContext);
				if(result == null)
					result = caseBExpression(builderConcernContext);
				if(result == null)
					result = caseBFunctionContainer(builderConcernContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.PATH_GROUP_PREDICATE: {
				PathGroupPredicate pathGroupPredicate = (PathGroupPredicate) theEObject;
				T result = casePathGroupPredicate(pathGroupPredicate);
				if(result == null)
					result = caseBExpression(pathGroupPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.ALIASED_REQUIRED_CAPABILITY: {
				AliasedRequiredCapability aliasedRequiredCapability = (AliasedRequiredCapability) theEObject;
				T result = caseAliasedRequiredCapability(aliasedRequiredCapability);
				if(result == null)
					result = caseRequiredCapability(aliasedRequiredCapability);
				if(result == null)
					result = caseCapability(aliasedRequiredCapability);
				if(result == null)
					result = caseINamedValue(aliasedRequiredCapability);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER: {
				IRequiredCapabilityContainer iRequiredCapabilityContainer = (IRequiredCapabilityContainer) theEObject;
				T result = caseIRequiredCapabilityContainer(iRequiredCapabilityContainer);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER: {
				IProvidedCapabilityContainer iProvidedCapabilityContainer = (IProvidedCapabilityContainer) theEObject;
				T result = caseIProvidedCapabilityContainer(iProvidedCapabilityContainer);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_QUERY: {
				BuilderQuery builderQuery = (BuilderQuery) theEObject;
				T result = caseBuilderQuery(builderQuery);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER: {
				Builder builder = (Builder) theEObject;
				T result = caseBuilder(builder);
				if(result == null)
					result = caseB3Function(builder);
				if(result == null)
					result = caseIBuilder(builder);
				if(result == null)
					result = caseBFunction(builder);
				if(result == null)
					result = caseIProvidedCapabilityContainer(builder);
				if(result == null)
					result = caseIFunction(builder);
				if(result == null)
					result = caseBExpression(builder);
				if(result == null)
					result = caseIGenericDeclaration(builder);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_JAVA: {
				BuilderJava builderJava = (BuilderJava) theEObject;
				T result = caseBuilderJava(builderJava);
				if(result == null)
					result = caseBJavaFunction(builderJava);
				if(result == null)
					result = caseIBuilder(builderJava);
				if(result == null)
					result = caseBFunction(builderJava);
				if(result == null)
					result = caseIProvidedCapabilityContainer(builderJava);
				if(result == null)
					result = caseIFunction(builderJava);
				if(result == null)
					result = caseBExpression(builderJava);
				if(result == null)
					result = caseIGenericDeclaration(builderJava);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_WRAPPER: {
				BuilderWrapper builderWrapper = (BuilderWrapper) theEObject;
				T result = caseBuilderWrapper(builderWrapper);
				if(result == null)
					result = caseBFunctionWrapper(builderWrapper);
				if(result == null)
					result = caseIBuilder(builderWrapper);
				if(result == null)
					result = caseIFunction(builderWrapper);
				if(result == null)
					result = caseIProvidedCapabilityContainer(builderWrapper);
				if(result == null)
					result = caseBExpression(builderWrapper);
				if(result == null)
					result = caseIGenericDeclaration(builderWrapper);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BEE_MODEL: {
				BeeModel beeModel = (BeeModel) theEObject;
				T result = caseBeeModel(beeModel);
				if(result == null)
					result = caseBChainedExpression(beeModel);
				if(result == null)
					result = caseIBuildUnitContainer(beeModel);
				if(result == null)
					result = caseBExpression(beeModel);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BEE_HIVE: {
				BeeHive beeHive = (BeeHive) theEObject;
				T result = caseBeeHive(beeHive);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.RESOLUTION_INFO: {
				ResolutionInfo resolutionInfo = (ResolutionInfo) theEObject;
				T result = caseResolutionInfo(resolutionInfo);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_FACADE: {
				EffectiveFacade effectiveFacade = (EffectiveFacade) theEObject;
				T result = caseEffectiveFacade(effectiveFacade);
				if(result == null)
					result = caseIEffectiveFacade(effectiveFacade);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE: {
				EffectiveUnitFacade effectiveUnitFacade = (EffectiveUnitFacade) theEObject;
				T result = caseEffectiveUnitFacade(effectiveUnitFacade);
				if(result == null)
					result = caseEffectiveFacade(effectiveUnitFacade);
				if(result == null)
					result = caseIEffectiveFacade(effectiveUnitFacade);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_REQUIREMENT_FACADE: {
				EffectiveRequirementFacade effectiveRequirementFacade = (EffectiveRequirementFacade) theEObject;
				T result = caseEffectiveRequirementFacade(effectiveRequirementFacade);
				if(result == null)
					result = caseEffectiveFacade(effectiveRequirementFacade);
				if(result == null)
					result = caseIEffectiveFacade(effectiveRequirementFacade);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE: {
				EffectiveCapabilityFacade effectiveCapabilityFacade = (EffectiveCapabilityFacade) theEObject;
				T result = caseEffectiveCapabilityFacade(effectiveCapabilityFacade);
				if(result == null)
					result = caseEffectiveFacade(effectiveCapabilityFacade);
				if(result == null)
					result = caseIEffectiveFacade(effectiveCapabilityFacade);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_CALL_FACADE: {
				BuilderCallFacade builderCallFacade = (BuilderCallFacade) theEObject;
				T result = caseBuilderCallFacade(builderCallFacade);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_SET: {
				BuildSet buildSet = (BuildSet) theEObject;
				T result = caseBuildSet(buildSet);
				if(result == null)
					result = caseITypedValueContainer(buildSet);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_RESULT_CONTEXT: {
				BuildResultContext buildResultContext = (BuildResultContext) theEObject;
				T result = caseBuildResultContext(buildResultContext);
				if(result == null)
					result = caseBInnerContext(buildResultContext);
				if(result == null)
					result = caseBExecutionContext(buildResultContext);
				if(result == null)
					result = caseITypedValueContainer(buildResultContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.OUTPUT_PREDICATE: {
				OutputPredicate outputPredicate = (OutputPredicate) theEObject;
				T result = caseOutputPredicate(outputPredicate);
				if(result == null)
					result = casePathGroupPredicate(outputPredicate);
				if(result == null)
					result = caseBExpression(outputPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.SOURCE_PREDICATE: {
				SourcePredicate sourcePredicate = (SourcePredicate) theEObject;
				T result = caseSourcePredicate(sourcePredicate);
				if(result == null)
					result = casePathGroupPredicate(sourcePredicate);
				if(result == null)
					result = caseBExpression(sourcePredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_UNIT_REPOSITORY: {
				BuildUnitRepository buildUnitRepository = (BuildUnitRepository) theEObject;
				T result = caseBuildUnitRepository(buildUnitRepository);
				if(result == null)
					result = caseIBuildUnitRepository(buildUnitRepository);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.COMPOUND_BUILD_UNIT_REPOSITORY: {
				CompoundBuildUnitRepository compoundBuildUnitRepository = (CompoundBuildUnitRepository) theEObject;
				T result = caseCompoundBuildUnitRepository(compoundBuildUnitRepository);
				if(result == null)
					result = caseBuildUnitRepository(compoundBuildUnitRepository);
				if(result == null)
					result = caseIBuildUnitRepository(compoundBuildUnitRepository);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.COMPOUND_FIRST_FOUND_REPOSITORY: {
				CompoundFirstFoundRepository compoundFirstFoundRepository = (CompoundFirstFoundRepository) theEObject;
				T result = caseCompoundFirstFoundRepository(compoundFirstFoundRepository);
				if(result == null)
					result = caseCompoundBuildUnitRepository(compoundFirstFoundRepository);
				if(result == null)
					result = caseBuildUnitRepository(compoundFirstFoundRepository);
				if(result == null)
					result = caseIBuildUnitRepository(compoundFirstFoundRepository);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EXECUTION_STACK_REPOSITORY: {
				ExecutionStackRepository executionStackRepository = (ExecutionStackRepository) theEObject;
				T result = caseExecutionStackRepository(executionStackRepository);
				if(result == null)
					result = caseBuildUnitRepository(executionStackRepository);
				if(result == null)
					result = caseIBuildUnitRepository(executionStackRepository);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BEE_MODEL_REPOSITORY: {
				BeeModelRepository beeModelRepository = (BeeModelRepository) theEObject;
				T result = caseBeeModelRepository(beeModelRepository);
				if(result == null)
					result = caseBuildUnitRepository(beeModelRepository);
				if(result == null)
					result = caseIBuildUnitRepository(beeModelRepository);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.UNIT_RESOLUTION_INFO: {
				UnitResolutionInfo unitResolutionInfo = (UnitResolutionInfo) theEObject;
				T result = caseUnitResolutionInfo(unitResolutionInfo);
				if(result == null)
					result = caseResolutionInfo(unitResolutionInfo);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.SWITCH_UNIT_PROVIDER: {
				SwitchUnitProvider switchUnitProvider = (SwitchUnitProvider) theEObject;
				T result = caseSwitchUnitProvider(switchUnitProvider);
				if(result == null)
					result = caseUnitProvider(switchUnitProvider);
				if(result == null)
					result = caseBExpression(switchUnitProvider);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REPOSITORY: {
				Repository repository = (Repository) theEObject;
				T result = caseRepository(repository);
				if(result == null)
					result = caseBExpression(repository);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BRANCH: {
				Branch branch = (Branch) theEObject;
				T result = caseBranch(branch);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.DELEGATING_UNIT_PROVIDER: {
				DelegatingUnitProvider delegatingUnitProvider = (DelegatingUnitProvider) theEObject;
				T result = caseDelegatingUnitProvider(delegatingUnitProvider);
				if(result == null)
					result = caseUnitProvider(delegatingUnitProvider);
				if(result == null)
					result = caseBExpression(delegatingUnitProvider);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.REPO_OPTION: {
				RepoOption repoOption = (RepoOption) theEObject;
				T result = caseRepoOption(repoOption);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION: {
				UnitRepositoryDescription unitRepositoryDescription = (UnitRepositoryDescription) theEObject;
				T result = caseUnitRepositoryDescription(unitRepositoryDescription);
				if(result == null)
					result = caseBuildUnitRepository(unitRepositoryDescription);
				if(result == null)
					result = caseIBuildUnitRepository(unitRepositoryDescription);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS: {
				BuildCallOnSelectedRequirements buildCallOnSelectedRequirements = (BuildCallOnSelectedRequirements) theEObject;
				T result = caseBuildCallOnSelectedRequirements(buildCallOnSelectedRequirements);
				if(result == null)
					result = caseBuildCallMultiple(buildCallOnSelectedRequirements);
				if(result == null)
					result = caseBuilderCall(buildCallOnSelectedRequirements);
				if(result == null)
					result = caseBuilderInput(buildCallOnSelectedRequirements);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_INPUT_NAME_DECORATOR: {
				BuilderInputNameDecorator builderInputNameDecorator = (BuilderInputNameDecorator) theEObject;
				T result = caseBuilderInputNameDecorator(builderInputNameDecorator);
				if(result == null)
					result = caseBuilderInputDecorator(builderInputNameDecorator);
				if(result == null)
					result = caseINamedValue(builderInputNameDecorator);
				if(result == null)
					result = caseBuilderInput(builderInputNameDecorator);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR: {
				BuilderInputContextDecorator builderInputContextDecorator = (BuilderInputContextDecorator) theEObject;
				T result = caseBuilderInputContextDecorator(builderInputContextDecorator);
				if(result == null)
					result = caseBuilderInputDecorator(builderInputContextDecorator);
				if(result == null)
					result = caseBuilderInput(builderInputContextDecorator);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_INPUT_CONDITION: {
				BuilderInputCondition builderInputCondition = (BuilderInputCondition) theEObject;
				T result = caseBuilderInputCondition(builderInputCondition);
				if(result == null)
					result = caseBuilderInputDecorator(builderInputCondition);
				if(result == null)
					result = caseBuilderInput(builderInputCondition);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_CALL_MULTIPLE: {
				BuildCallMultiple buildCallMultiple = (BuildCallMultiple) theEObject;
				T result = caseBuildCallMultiple(buildCallMultiple);
				if(result == null)
					result = caseBuilderCall(buildCallMultiple);
				if(result == null)
					result = caseBuilderInput(buildCallMultiple);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_CALL_SINGLE: {
				BuildCallSingle buildCallSingle = (BuildCallSingle) theEObject;
				T result = caseBuildCallSingle(buildCallSingle);
				if(result == null)
					result = caseBuilderCall(buildCallSingle);
				if(result == null)
					result = caseBuilderInput(buildCallSingle);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT: {
				BuildCallOnDeclaredRequirement buildCallOnDeclaredRequirement = (BuildCallOnDeclaredRequirement) theEObject;
				T result = caseBuildCallOnDeclaredRequirement(buildCallOnDeclaredRequirement);
				if(result == null)
					result = caseBuildCallSingle(buildCallOnDeclaredRequirement);
				if(result == null)
					result = caseBuilderCall(buildCallOnDeclaredRequirement);
				if(result == null)
					result = caseBuilderInput(buildCallOnDeclaredRequirement);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT: {
				BuildCallOnReferencedRequirement buildCallOnReferencedRequirement = (BuildCallOnReferencedRequirement) theEObject;
				T result = caseBuildCallOnReferencedRequirement(buildCallOnReferencedRequirement);
				if(result == null)
					result = caseBuildCallSingle(buildCallOnReferencedRequirement);
				if(result == null)
					result = caseBuilderCall(buildCallOnReferencedRequirement);
				if(result == null)
					result = caseBuilderInput(buildCallOnReferencedRequirement);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.BUILDER_INPUT_GROUP: {
				BuilderInputGroup builderInputGroup = (BuilderInputGroup) theEObject;
				T result = caseBuilderInputGroup(builderInputGroup);
				if(result == null)
					result = caseBuilderInputDecorator(builderInputGroup);
				if(result == null)
					result = caseBuilderInput(builderInputGroup);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IEFFECTIVE_FACADE: {
				IEffectiveFacade iEffectiveFacade = (IEffectiveFacade) theEObject;
				T result = caseIEffectiveFacade(iEffectiveFacade);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.EFFECTIVE_BUILDER_CALL_FACADE: {
				EffectiveBuilderCallFacade effectiveBuilderCallFacade = (EffectiveBuilderCallFacade) theEObject;
				T result = caseEffectiveBuilderCallFacade(effectiveBuilderCallFacade);
				if(result == null)
					result = caseBuilderCallFacade(effectiveBuilderCallFacade);
				if(result == null)
					result = caseIEffectiveFacade(effectiveBuilderCallFacade);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.IBUILD_UNIT_CONTAINER: {
				IBuildUnitContainer iBuildUnitContainer = (IBuildUnitContainer) theEObject;
				T result = caseIBuildUnitContainer(iBuildUnitContainer);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3BuildPackage.FRAGMENT_HOST: {
				FragmentHost fragmentHost = (FragmentHost) theEObject;
				T result = caseFragmentHost(fragmentHost);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

} // B3BuildSwitch
