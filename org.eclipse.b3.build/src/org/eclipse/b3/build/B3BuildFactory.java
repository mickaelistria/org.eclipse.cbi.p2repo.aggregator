/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.build.B3BuildPackage
 * @generated
 */
public interface B3BuildFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	B3BuildFactory eINSTANCE = org.eclipse.b3.build.impl.B3BuildFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aliased Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Aliased Required Capability</em>'.
	 * @generated
	 */
	AliasedRequiredCapability createAliasedRequiredCapability();

	/**
	 * Returns a new object of class '<em>Bee Hive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bee Hive</em>'.
	 * @generated
	 */
	BeeHive createBeeHive();

	/**
	 * Returns a new object of class '<em>Bee Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bee Model</em>'.
	 * @generated
	 */
	BeeModel createBeeModel();

	/**
	 * Returns a new object of class '<em>Bee Model Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bee Model Repository</em>'.
	 * @generated
	 */
	BeeModelRepository createBeeModelRepository();

	/**
	 * Returns a new object of class '<em>Best Found Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Best Found Unit Provider</em>'.
	 * @generated
	 */
	BestFoundUnitProvider createBestFoundUnitProvider();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Build Call Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Call Multiple</em>'.
	 * @generated
	 */
	BuildCallMultiple createBuildCallMultiple();

	/**
	 * Returns a new object of class '<em>Build Call On Declared Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Call On Declared Requirement</em>'.
	 * @generated
	 */
	BuildCallOnDeclaredRequirement createBuildCallOnDeclaredRequirement();

	/**
	 * Returns a new object of class '<em>Build Call On Referenced Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Call On Referenced Requirement</em>'.
	 * @generated
	 */
	BuildCallOnReferencedRequirement createBuildCallOnReferencedRequirement();

	/**
	 * Returns a new object of class '<em>Build Call On Selected Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Call On Selected Requirements</em>'.
	 * @generated
	 */
	BuildCallOnSelectedRequirements createBuildCallOnSelectedRequirements();

	/**
	 * Returns a new object of class '<em>Build Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Concern Context</em>'.
	 * @generated
	 */
	BuildConcernContext createBuildConcernContext();

	/**
	 * Returns a new object of class '<em>Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder</em>'.
	 * @generated
	 */
	Builder createBuilder();

	/**
	 * Returns a new object of class '<em>Builder Call Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Call Facade</em>'.
	 * @generated
	 */
	BuilderCallFacade createBuilderCallFacade();

	/**
	 * Returns a new object of class '<em>Builder Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Concern Context</em>'.
	 * @generated
	 */
	BuilderConcernContext createBuilderConcernContext();

	/**
	 * Returns a new object of class '<em>Builder Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Input</em>'.
	 * @generated
	 */
	BuilderInput createBuilderInput();

	/**
	 * Returns a new object of class '<em>Builder Input Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Input Condition</em>'.
	 * @generated
	 */
	BuilderInputCondition createBuilderInputCondition();

	/**
	 * Returns a new object of class '<em>Builder Input Context Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Input Context Decorator</em>'.
	 * @generated
	 */
	BuilderInputContextDecorator createBuilderInputContextDecorator();

	/**
	 * Returns a new object of class '<em>Builder Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Input Group</em>'.
	 * @generated
	 */
	BuilderInputGroup createBuilderInputGroup();

	/**
	 * Returns a new object of class '<em>Builder Input Name Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Input Name Decorator</em>'.
	 * @generated
	 */
	BuilderInputNameDecorator createBuilderInputNameDecorator();

	/**
	 * Returns a new object of class '<em>Builder Java</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Java</em>'.
	 * @generated
	 */
	BuilderJava createBuilderJava();

	/**
	 * Returns a new object of class '<em>Builder Name Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Name Predicate</em>'.
	 * @generated
	 */
	BuilderNamePredicate createBuilderNamePredicate();

	/**
	 * Returns a new object of class '<em>Builder Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Query</em>'.
	 * @generated
	 */
	BuilderQuery createBuilderQuery();

	/**
	 * Returns a new object of class '<em>Builder Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Builder Wrapper</em>'.
	 * @generated
	 */
	BuilderWrapper createBuilderWrapper();

	/**
	 * Returns a new object of class '<em>Build Result Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Result Context</em>'.
	 * @generated
	 */
	BuildResultContext createBuildResultContext();

	/**
	 * Returns a new object of class '<em>Build Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Set</em>'.
	 * @generated
	 */
	BuildSet createBuildSet();

	/**
	 * Returns a new object of class '<em>Build Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Build Unit</em>'.
	 * @generated
	 */
	BuildUnit createBuildUnit();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Capability Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Capability Predicate</em>'.
	 * @generated
	 */
	CapabilityPredicate createCapabilityPredicate();

	/**
	 * Returns a new object of class '<em>Compound First Found Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Compound First Found Repository</em>'.
	 * @generated
	 */
	CompoundFirstFoundRepository createCompoundFirstFoundRepository();

	/**
	 * Returns a new object of class '<em>Conditional Path Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Conditional Path Vector</em>'.
	 * @generated
	 */
	ConditionalPathVector createConditionalPathVector();

	/**
	 * Returns a new object of class '<em>Container Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Container Configuration</em>'.
	 * @generated
	 */
	ContainerConfiguration createContainerConfiguration();

	/**
	 * Returns a new object of class '<em>Delegating Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Delegating Unit Provider</em>'.
	 * @generated
	 */
	DelegatingUnitProvider createDelegatingUnitProvider();

	/**
	 * Returns a new object of class '<em>Effective Builder Call Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Effective Builder Call Facade</em>'.
	 * @generated
	 */
	EffectiveBuilderCallFacade createEffectiveBuilderCallFacade();

	/**
	 * Returns a new object of class '<em>Effective Capability Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Effective Capability Facade</em>'.
	 * @generated
	 */
	EffectiveCapabilityFacade createEffectiveCapabilityFacade();

	/**
	 * Returns a new object of class '<em>Effective Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Effective Facade</em>'.
	 * @generated
	 */
	EffectiveFacade createEffectiveFacade();

	/**
	 * Returns a new object of class '<em>Effective Requirement Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Effective Requirement Facade</em>'.
	 * @generated
	 */
	EffectiveRequirementFacade createEffectiveRequirementFacade();

	/**
	 * Returns a new object of class '<em>Effective Unit Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Effective Unit Facade</em>'.
	 * @generated
	 */
	EffectiveUnitFacade createEffectiveUnitFacade();

	/**
	 * Returns a new object of class '<em>Execution Stack Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Execution Stack Repository</em>'.
	 * @generated
	 */
	ExecutionStackRepository createExecutionStackRepository();

	/**
	 * Returns a new object of class '<em>First Found Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>First Found Unit Provider</em>'.
	 * @generated
	 */
	FirstFoundUnitProvider createFirstFoundUnitProvider();

	/**
	 * Returns a new object of class '<em>Fragment Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Fragment Host</em>'.
	 * @generated
	 */
	FragmentHost createFragmentHost();

	/**
	 * Returns a new object of class '<em>Implements Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Implements Predicate</em>'.
	 * @generated
	 */
	ImplementsPredicate createImplementsPredicate();

	/**
	 * Returns a new object of class '<em>Input Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Input Predicate</em>'.
	 * @generated
	 */
	InputPredicate createInputPredicate();

	/**
	 * Returns a new object of class '<em>Name Space Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Name Space Predicate</em>'.
	 * @generated
	 */
	NameSpacePredicate createNameSpacePredicate();

	/**
	 * Returns a new object of class '<em>Output Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Output Predicate</em>'.
	 * @generated
	 */
	OutputPredicate createOutputPredicate();

	/**
	 * Returns a new object of class '<em>Path Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Path Group</em>'.
	 * @generated
	 */
	PathGroup createPathGroup();

	/**
	 * Returns a new object of class '<em>Path Group Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Path Group Predicate</em>'.
	 * @generated
	 */
	PathGroupPredicate createPathGroupPredicate();

	/**
	 * Returns a new object of class '<em>Path Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Path Vector</em>'.
	 * @generated
	 */
	PathVector createPathVector();

	/**
	 * Returns a new object of class '<em>Provides Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Provides Predicate</em>'.
	 * @generated
	 */
	ProvidesPredicate createProvidesPredicate();

	/**
	 * Returns a new object of class '<em>Repo Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Repo Option</em>'.
	 * @generated
	 */
	RepoOption createRepoOption();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Repository Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Repository Unit Provider</em>'.
	 * @generated
	 */
	RepositoryUnitProvider createRepositoryUnitProvider();

	/**
	 * Returns a new object of class '<em>Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Required Capability</em>'.
	 * @generated
	 */
	RequiredCapability createRequiredCapability();

	/**
	 * Returns a new object of class '<em>Requires Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Requires Predicate</em>'.
	 * @generated
	 */
	RequiresPredicate createRequiresPredicate();

	/**
	 * Returns a new object of class '<em>Resolution Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Resolution Info</em>'.
	 * @generated
	 */
	ResolutionInfo createResolutionInfo();

	/**
	 * Returns a new object of class '<em>Source Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Source Predicate</em>'.
	 * @generated
	 */
	SourcePredicate createSourcePredicate();

	/**
	 * Returns a new object of class '<em>Switch Unit Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Switch Unit Provider</em>'.
	 * @generated
	 */
	SwitchUnitProvider createSwitchUnitProvider();

	/**
	 * Returns a new object of class '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Synchronization</em>'.
	 * @generated
	 */
	Synchronization createSynchronization();

	/**
	 * Returns a new object of class '<em>Unit Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Unit Concern Context</em>'.
	 * @generated
	 */
	UnitConcernContext createUnitConcernContext();

	/**
	 * Returns a new object of class '<em>Unit Name Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Unit Name Predicate</em>'.
	 * @generated
	 */
	UnitNamePredicate createUnitNamePredicate();

	/**
	 * Returns a new object of class '<em>Unit Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Unit Parameter Declaration</em>'.
	 * @generated
	 */
	UnitParameterDeclaration createUnitParameterDeclaration();

	/**
	 * Returns a new object of class '<em>Unit Repository Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Unit Repository Description</em>'.
	 * @generated
	 */
	UnitRepositoryDescription createUnitRepositoryDescription();

	/**
	 * Returns a new object of class '<em>Unit Resolution Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Unit Resolution Info</em>'.
	 * @generated
	 */
	UnitResolutionInfo createUnitResolutionInfo();

	/**
	 * Returns a new object of class '<em>Versioned Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Versioned Capability</em>'.
	 * @generated
	 */
	VersionedCapability createVersionedCapability();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	B3BuildPackage getB3BuildPackage();

} // B3BuildFactory
