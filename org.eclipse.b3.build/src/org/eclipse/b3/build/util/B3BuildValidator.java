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
package org.eclipse.b3.build.util;

import java.util.Map;

import org.eclipse.b3.build.*;
import org.eclipse.b3.build.AliasedRequiredCapability;
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
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.b3.build.UnitRepositoryDescription;
import org.eclipse.b3.build.UnitResolutionInfo;
import org.eclipse.b3.build.VersionedCapability;
import org.eclipse.b3.build.core.B3BuilderJob;
import org.eclipse.b3.build.core.iterators.PathIterator;
import org.eclipse.b3.build.repository.IBuildUnitRepository;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;
import org.eclipse.equinox.p2.metadata.expression.IMatchExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.build.B3BuildPackage
 * @generated
 */
public class B3BuildValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final B3BuildValidator INSTANCE = new B3BuildValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic
	 * {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.b3.build";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid State' of 'Branch'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BRANCH__HAS_VALID_STATE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Correct State' of 'Unit Parameter Declaration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int UNIT_PARAMETER_DECLARATION__HAS_CORRECT_STATE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	public static final int NON_GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT +
			NON_GENERATED_DIAGNOSTIC_CODE_COUNT;

	public static final int BRANCH__HAS_NO_TIMESTAMP = GENERATED_DIAGNOSTIC_CODE_COUNT + 1;

	public static final int BRANCH__HAS_INVALID_TIMESTAMP = GENERATED_DIAGNOSTIC_CODE_COUNT + 2;

	public static final int BRANCH__HAS_TRANSFORMABLE_TIMESTAMP = GENERATED_DIAGNOSTIC_CODE_COUNT + 3;

	public static final int BRANCH__HAS_EXPRESSION_TIMESTAMP = GENERATED_DIAGNOSTIC_CODE_COUNT + 4;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public B3BuildValidator() {
		super();
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAliasedRequiredCapability(AliasedRequiredCapability aliasedRequiredCapability,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasedRequiredCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3BuilderJob(B3BuilderJob b3BuilderJob, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBeeHive(BeeHive beeHive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beeHive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateBeeModel(BeeModel beeModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// return validate_EveryDefaultConstraint(beeModel, diagnostics, context);
		boolean result = validate_EveryMultiplicityConforms(beeModel, diagnostics, context);
		if(result || diagnostics != null) {
			result &= validate_EveryProxyResolves(beeModel, diagnostics, context);
		}
		if(result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(beeModel, diagnostics, context);
		}
		if(result || diagnostics != null) {
			result &= validate_EveryBidirectionalReferenceIsPaired(beeModel, diagnostics, context);
		}
		if(result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(beeModel, diagnostics, context);
		}
		if(result || diagnostics != null) {
			result &= validate_UniqueID(beeModel, diagnostics, context);
		}
		if(result || diagnostics != null) {
			result &= validate_EveryKeyUnique(beeModel, diagnostics, context);
		}
		if(result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(beeModel, diagnostics, context);
		}
		return result;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBeeModelRepository(BeeModelRepository beeModelRepository, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(beeModelRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBestFoundUnitProvider(BestFoundUnitProvider bestFoundUnitProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bestFoundUnitProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(branch, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(branch, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateBranch_hasValidState(branch, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidState constraint of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBranch_hasValidState(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return branch.hasValidState(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBranchPointType(BranchPointType branchPointType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildCallMultiple(BuildCallMultiple buildCallMultiple, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildCallMultiple, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildCallOnDeclaredRequirement(
			BuildCallOnDeclaredRequirement buildCallOnDeclaredRequirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildCallOnDeclaredRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildCallOnReferencedRequirement(
			BuildCallOnReferencedRequirement buildCallOnReferencedRequirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildCallOnReferencedRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildCallOnSelectedRequirements(
			BuildCallOnSelectedRequirements buildCallOnSelectedRequirements, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildCallOnSelectedRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildCallSingle(BuildCallSingle buildCallSingle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildCallSingle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildConcernContext(BuildConcernContext buildConcernContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildConcernContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilder(Builder builder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderCall(BuilderCall builderCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderCallFacade(BuilderCallFacade builderCallFacade, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderCallFacade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderConcernContext(BuilderConcernContext builderConcernContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderConcernContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderInput(BuilderInput builderInput, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderInputCondition(BuilderInputCondition builderInputCondition,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderInputCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderInputContextDecorator(BuilderInputContextDecorator builderInputContextDecorator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderInputContextDecorator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderInputDecorator(BuilderInputDecorator builderInputDecorator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderInputDecorator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderInputGroup(BuilderInputGroup builderInputGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderInputGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderInputNameDecorator(BuilderInputNameDecorator builderInputNameDecorator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderInputNameDecorator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderJava(BuilderJava builderJava, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderJava, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderNamePredicate(BuilderNamePredicate builderNamePredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderNamePredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderQuery(BuilderQuery builderQuery, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuilderWrapper(BuilderWrapper builderWrapper, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(builderWrapper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildResultContext(BuildResultContext buildResultContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildResultContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildSet(BuildSet buildSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildUnit(BuildUnit buildUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBuildUnitRepository(BuildUnitRepository buildUnitRepository, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildUnitRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCapability(Capability capability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCapabilityPredicate(CapabilityPredicate capabilityPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCompoundBuildUnitRepository(CompoundBuildUnitRepository compoundBuildUnitRepository,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundBuildUnitRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCompoundFirstFoundRepository(CompoundFirstFoundRepository compoundFirstFoundRepository,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundFirstFoundRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCompoundUnitProvider(CompoundUnitProvider compoundUnitProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundUnitProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateConditionalPathVector(ConditionalPathVector conditionalPathVector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionalPathVector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateContainerConfiguration(ContainerConfiguration containerConfiguration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDelegatingUnitProvider(DelegatingUnitProvider delegatingUnitProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delegatingUnitProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEffectiveBuilderCallFacade(EffectiveBuilderCallFacade effectiveBuilderCallFacade,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(effectiveBuilderCallFacade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEffectiveCapabilityFacade(EffectiveCapabilityFacade effectiveCapabilityFacade,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(effectiveCapabilityFacade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEffectiveFacade(EffectiveFacade effectiveFacade, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(effectiveFacade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEffectiveRequirementFacade(EffectiveRequirementFacade effectiveRequirementFacade,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(effectiveRequirementFacade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEffectiveUnitFacade(EffectiveUnitFacade effectiveUnitFacade, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(effectiveUnitFacade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateExecutionStackRepository(ExecutionStackRepository executionStackRepository,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(executionStackRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFirstFoundUnitProvider(FirstFoundUnitProvider firstFoundUnitProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstFoundUnitProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFragmentHost(FragmentHost fragmentHost, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fragmentHost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIBuilder(IBuilder iBuilder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iBuilder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIBuildUnitContainer(IBuildUnitContainer iBuildUnitContainer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iBuildUnitContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIBuildUnitRepository(IBuildUnitRepository iBuildUnitRepository, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) iBuildUnitRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIEffectiveFacade(IEffectiveFacade iEffectiveFacade, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iEffectiveFacade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIInstallableUnit(IInstallableUnit iInstallableUnit, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIMatchExpression(IMatchExpression<?> iMatchExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateImplementsPredicate(ImplementsPredicate implementsPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementsPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInputPredicate(InputPredicate inputPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIProvidedCapabilityContainer(IProvidedCapabilityContainer iProvidedCapabilityContainer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iProvidedCapabilityContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIRequiredCapabilityContainer(IRequiredCapabilityContainer iRequiredCapabilityContainer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iRequiredCapabilityContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIStatus(IStatus iStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMergeConflictStrategy(MergeConflictStrategy mergeConflictStrategy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNameSpacePredicate(NameSpacePredicate nameSpacePredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameSpacePredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOutputPredicate(OutputPredicate outputPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePathGroup(PathGroup pathGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePathGroupPredicate(PathGroupPredicate pathGroupPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathGroupPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePathIterator(PathIterator pathIterator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePathVector(PathVector pathVector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathVector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateProvidesPredicate(ProvidesPredicate providesPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(providesPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRepoOption(RepoOption repoOption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repoOption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRepositoryUnitProvider(RepositoryUnitProvider repositoryUnitProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repositoryUnitProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRequiredCapability(RequiredCapability requiredCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRequiresPredicate(RequiresPredicate requiresPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiresPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateResolutionInfo(ResolutionInfo resolutionInfo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resolutionInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSourcePredicate(SourcePredicate sourcePredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourcePredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSwitchUnitProvider(SwitchUnitProvider switchUnitProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(switchUnitProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSynchronization(Synchronization synchronization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synchronization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTriState(TriState triState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUnitConcernContext(UnitConcernContext unitConcernContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitConcernContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUnitNamePredicate(UnitNamePredicate unitNamePredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitNamePredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUnitParameterDeclaration(UnitParameterDeclaration unitParameterDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if(!validate_NoCircularContainment(unitParameterDeclaration, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(unitParameterDeclaration, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateUnitParameterDeclaration_hasCorrectState(unitParameterDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasCorrectState constraint of '<em>Unit Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUnitParameterDeclaration_hasCorrectState(UnitParameterDeclaration unitParameterDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unitParameterDeclaration.hasCorrectState(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUnitProvider(UnitProvider unitProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUnitRepositoryDescription(UnitRepositoryDescription unitRepositoryDescription,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitRepositoryDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateUnitResolutionInfo(UnitResolutionInfo unitResolutionInfo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitResolutionInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVersionedCapability(VersionedCapability versionedCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionedCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVersionRange(VersionRange versionRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return B3BuildPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch(classifierID) {
			case B3BuildPackage.BUILD_UNIT:
				return validateBuildUnit((BuildUnit) value, diagnostics, context);
			case B3BuildPackage.IBUILDER:
				return validateIBuilder((IBuilder) value, diagnostics, context);
			case B3BuildPackage.VERSIONED_CAPABILITY:
				return validateVersionedCapability((VersionedCapability) value, diagnostics, context);
			case B3BuildPackage.BUILDER_INPUT:
				return validateBuilderInput((BuilderInput) value, diagnostics, context);
			case B3BuildPackage.PATH_GROUP:
				return validatePathGroup((PathGroup) value, diagnostics, context);
			case B3BuildPackage.BUILDER_INPUT_DECORATOR:
				return validateBuilderInputDecorator((BuilderInputDecorator) value, diagnostics, context);
			case B3BuildPackage.BUILDER_CALL:
				return validateBuilderCall((BuilderCall) value, diagnostics, context);
			case B3BuildPackage.CAPABILITY:
				return validateCapability((Capability) value, diagnostics, context);
			case B3BuildPackage.REQUIRED_CAPABILITY:
				return validateRequiredCapability((RequiredCapability) value, diagnostics, context);
			case B3BuildPackage.CONDITIONAL_PATH_VECTOR:
				return validateConditionalPathVector((ConditionalPathVector) value, diagnostics, context);
			case B3BuildPackage.PATH_VECTOR:
				return validatePathVector((PathVector) value, diagnostics, context);
			case B3BuildPackage.SYNCHRONIZATION:
				return validateSynchronization((Synchronization) value, diagnostics, context);
			case B3BuildPackage.UNIT_PROVIDER:
				return validateUnitProvider((UnitProvider) value, diagnostics, context);
			case B3BuildPackage.REPOSITORY_UNIT_PROVIDER:
				return validateRepositoryUnitProvider((RepositoryUnitProvider) value, diagnostics, context);
			case B3BuildPackage.COMPOUND_UNIT_PROVIDER:
				return validateCompoundUnitProvider((CompoundUnitProvider) value, diagnostics, context);
			case B3BuildPackage.FIRST_FOUND_UNIT_PROVIDER:
				return validateFirstFoundUnitProvider((FirstFoundUnitProvider) value, diagnostics, context);
			case B3BuildPackage.BEST_FOUND_UNIT_PROVIDER:
				return validateBestFoundUnitProvider((BestFoundUnitProvider) value, diagnostics, context);
			case B3BuildPackage.CONTAINER_CONFIGURATION:
				return validateContainerConfiguration((ContainerConfiguration) value, diagnostics, context);
			case B3BuildPackage.BUILD_CONCERN_CONTEXT:
				return validateBuildConcernContext((BuildConcernContext) value, diagnostics, context);
			case B3BuildPackage.REQUIRES_PREDICATE:
				return validateRequiresPredicate((RequiresPredicate) value, diagnostics, context);
			case B3BuildPackage.CAPABILITY_PREDICATE:
				return validateCapabilityPredicate((CapabilityPredicate) value, diagnostics, context);
			case B3BuildPackage.IMPLEMENTS_PREDICATE:
				return validateImplementsPredicate((ImplementsPredicate) value, diagnostics, context);
			case B3BuildPackage.PROVIDES_PREDICATE:
				return validateProvidesPredicate((ProvidesPredicate) value, diagnostics, context);
			case B3BuildPackage.NAME_SPACE_PREDICATE:
				return validateNameSpacePredicate((NameSpacePredicate) value, diagnostics, context);
			case B3BuildPackage.UNIT_NAME_PREDICATE:
				return validateUnitNamePredicate((UnitNamePredicate) value, diagnostics, context);
			case B3BuildPackage.BUILDER_NAME_PREDICATE:
				return validateBuilderNamePredicate((BuilderNamePredicate) value, diagnostics, context);
			case B3BuildPackage.INPUT_PREDICATE:
				return validateInputPredicate((InputPredicate) value, diagnostics, context);
			case B3BuildPackage.UNIT_CONCERN_CONTEXT:
				return validateUnitConcernContext((UnitConcernContext) value, diagnostics, context);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT:
				return validateBuilderConcernContext((BuilderConcernContext) value, diagnostics, context);
			case B3BuildPackage.PATH_GROUP_PREDICATE:
				return validatePathGroupPredicate((PathGroupPredicate) value, diagnostics, context);
			case B3BuildPackage.ALIASED_REQUIRED_CAPABILITY:
				return validateAliasedRequiredCapability((AliasedRequiredCapability) value, diagnostics, context);
			case B3BuildPackage.IREQUIRED_CAPABILITY_CONTAINER:
				return validateIRequiredCapabilityContainer((IRequiredCapabilityContainer) value, diagnostics, context);
			case B3BuildPackage.IPROVIDED_CAPABILITY_CONTAINER:
				return validateIProvidedCapabilityContainer((IProvidedCapabilityContainer) value, diagnostics, context);
			case B3BuildPackage.BUILDER_QUERY:
				return validateBuilderQuery((BuilderQuery) value, diagnostics, context);
			case B3BuildPackage.BUILDER:
				return validateBuilder((Builder) value, diagnostics, context);
			case B3BuildPackage.BUILDER_JAVA:
				return validateBuilderJava((BuilderJava) value, diagnostics, context);
			case B3BuildPackage.BUILDER_WRAPPER:
				return validateBuilderWrapper((BuilderWrapper) value, diagnostics, context);
			case B3BuildPackage.BEE_MODEL:
				return validateBeeModel((BeeModel) value, diagnostics, context);
			case B3BuildPackage.BEE_HIVE:
				return validateBeeHive((BeeHive) value, diagnostics, context);
			case B3BuildPackage.RESOLUTION_INFO:
				return validateResolutionInfo((ResolutionInfo) value, diagnostics, context);
			case B3BuildPackage.EFFECTIVE_FACADE:
				return validateEffectiveFacade((EffectiveFacade) value, diagnostics, context);
			case B3BuildPackage.EFFECTIVE_UNIT_FACADE:
				return validateEffectiveUnitFacade((EffectiveUnitFacade) value, diagnostics, context);
			case B3BuildPackage.EFFECTIVE_REQUIREMENT_FACADE:
				return validateEffectiveRequirementFacade((EffectiveRequirementFacade) value, diagnostics, context);
			case B3BuildPackage.EFFECTIVE_CAPABILITY_FACADE:
				return validateEffectiveCapabilityFacade((EffectiveCapabilityFacade) value, diagnostics, context);
			case B3BuildPackage.BUILDER_CALL_FACADE:
				return validateBuilderCallFacade((BuilderCallFacade) value, diagnostics, context);
			case B3BuildPackage.BUILD_SET:
				return validateBuildSet((BuildSet) value, diagnostics, context);
			case B3BuildPackage.BUILD_RESULT_CONTEXT:
				return validateBuildResultContext((BuildResultContext) value, diagnostics, context);
			case B3BuildPackage.OUTPUT_PREDICATE:
				return validateOutputPredicate((OutputPredicate) value, diagnostics, context);
			case B3BuildPackage.SOURCE_PREDICATE:
				return validateSourcePredicate((SourcePredicate) value, diagnostics, context);
			case B3BuildPackage.BUILD_UNIT_REPOSITORY:
				return validateBuildUnitRepository((BuildUnitRepository) value, diagnostics, context);
			case B3BuildPackage.COMPOUND_BUILD_UNIT_REPOSITORY:
				return validateCompoundBuildUnitRepository((CompoundBuildUnitRepository) value, diagnostics, context);
			case B3BuildPackage.COMPOUND_FIRST_FOUND_REPOSITORY:
				return validateCompoundFirstFoundRepository((CompoundFirstFoundRepository) value, diagnostics, context);
			case B3BuildPackage.EXECUTION_STACK_REPOSITORY:
				return validateExecutionStackRepository((ExecutionStackRepository) value, diagnostics, context);
			case B3BuildPackage.BEE_MODEL_REPOSITORY:
				return validateBeeModelRepository((BeeModelRepository) value, diagnostics, context);
			case B3BuildPackage.IBUILD_UNIT_REPOSITORY:
				return validateIBuildUnitRepository((IBuildUnitRepository) value, diagnostics, context);
			case B3BuildPackage.UNIT_RESOLUTION_INFO:
				return validateUnitResolutionInfo((UnitResolutionInfo) value, diagnostics, context);
			case B3BuildPackage.SWITCH_UNIT_PROVIDER:
				return validateSwitchUnitProvider((SwitchUnitProvider) value, diagnostics, context);
			case B3BuildPackage.REPOSITORY:
				return validateRepository((Repository) value, diagnostics, context);
			case B3BuildPackage.BRANCH:
				return validateBranch((Branch) value, diagnostics, context);
			case B3BuildPackage.DELEGATING_UNIT_PROVIDER:
				return validateDelegatingUnitProvider((DelegatingUnitProvider) value, diagnostics, context);
			case B3BuildPackage.REPO_OPTION:
				return validateRepoOption((RepoOption) value, diagnostics, context);
			case B3BuildPackage.UNIT_REPOSITORY_DESCRIPTION:
				return validateUnitRepositoryDescription((UnitRepositoryDescription) value, diagnostics, context);
			case B3BuildPackage.BUILD_CALL_ON_SELECTED_REQUIREMENTS:
				return validateBuildCallOnSelectedRequirements(
					(BuildCallOnSelectedRequirements) value, diagnostics, context);
			case B3BuildPackage.BUILDER_INPUT_NAME_DECORATOR:
				return validateBuilderInputNameDecorator((BuilderInputNameDecorator) value, diagnostics, context);
			case B3BuildPackage.BUILDER_INPUT_CONTEXT_DECORATOR:
				return validateBuilderInputContextDecorator((BuilderInputContextDecorator) value, diagnostics, context);
			case B3BuildPackage.BUILDER_INPUT_CONDITION:
				return validateBuilderInputCondition((BuilderInputCondition) value, diagnostics, context);
			case B3BuildPackage.BUILD_CALL_MULTIPLE:
				return validateBuildCallMultiple((BuildCallMultiple) value, diagnostics, context);
			case B3BuildPackage.BUILD_CALL_SINGLE:
				return validateBuildCallSingle((BuildCallSingle) value, diagnostics, context);
			case B3BuildPackage.BUILD_CALL_ON_DECLARED_REQUIREMENT:
				return validateBuildCallOnDeclaredRequirement(
					(BuildCallOnDeclaredRequirement) value, diagnostics, context);
			case B3BuildPackage.BUILD_CALL_ON_REFERENCED_REQUIREMENT:
				return validateBuildCallOnReferencedRequirement(
					(BuildCallOnReferencedRequirement) value, diagnostics, context);
			case B3BuildPackage.BUILDER_INPUT_GROUP:
				return validateBuilderInputGroup((BuilderInputGroup) value, diagnostics, context);
			case B3BuildPackage.IEFFECTIVE_FACADE:
				return validateIEffectiveFacade((IEffectiveFacade) value, diagnostics, context);
			case B3BuildPackage.EFFECTIVE_BUILDER_CALL_FACADE:
				return validateEffectiveBuilderCallFacade((EffectiveBuilderCallFacade) value, diagnostics, context);
			case B3BuildPackage.IBUILD_UNIT_CONTAINER:
				return validateIBuildUnitContainer((IBuildUnitContainer) value, diagnostics, context);
			case B3BuildPackage.FRAGMENT_HOST:
				return validateFragmentHost((FragmentHost) value, diagnostics, context);
			case B3BuildPackage.UNIT_PARAMETER_DECLARATION:
				return validateUnitParameterDeclaration((UnitParameterDeclaration) value, diagnostics, context);
			case B3BuildPackage.MERGE_CONFLICT_STRATEGY:
				return validateMergeConflictStrategy((MergeConflictStrategy) value, diagnostics, context);
			case B3BuildPackage.BRANCH_POINT_TYPE:
				return validateBranchPointType((BranchPointType) value, diagnostics, context);
			case B3BuildPackage.TRI_STATE:
				return validateTriState((TriState) value, diagnostics, context);
			case B3BuildPackage.VERSION_RANGE:
				return validateVersionRange((VersionRange) value, diagnostics, context);
			case B3BuildPackage.VERSION:
				return validateVersion((Version) value, diagnostics, context);
			case B3BuildPackage.ISTATUS:
				return validateIStatus((IStatus) value, diagnostics, context);
			case B3BuildPackage.PATH_ITERATOR:
				return validatePathIterator((PathIterator) value, diagnostics, context);
			case B3BuildPackage.B3_BUILDER_JOB:
				return validateB3BuilderJob((B3BuilderJob) value, diagnostics, context);
			case B3BuildPackage.IMATCH_EXPRESSION:
				return validateIMatchExpression((IMatchExpression<?>) value, diagnostics, context);
			case B3BuildPackage.IINSTALLABLE_UNIT:
				return validateIInstallableUnit((IInstallableUnit) value, diagnostics, context);
			default:
				return true;
		}
	}

} // B3BuildValidator
