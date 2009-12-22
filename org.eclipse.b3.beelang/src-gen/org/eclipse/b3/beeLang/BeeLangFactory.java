/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.beeLang.BeeLangPackage
 * @generated
 */
public interface BeeLangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BeeLangFactory eINSTANCE = org.eclipse.b3.beeLang.impl.BeeLangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Bee Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bee Model</em>'.
   * @generated
   */
  BeeModel createBeeModel();

  /**
   * Returns a new object of class '<em>Build Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Unit</em>'.
   * @generated
   */
  BuildUnit createBuildUnit();

  /**
   * Returns a new object of class '<em>Provided Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Capability</em>'.
   * @generated
   */
  ProvidedCapability createProvidedCapability();

  /**
   * Returns a new object of class '<em>Required Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Capability</em>'.
   * @generated
   */
  RequiredCapability createRequiredCapability();

  /**
   * Returns a new object of class '<em>Filtered Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filtered Capability</em>'.
   * @generated
   */
  FilteredCapability createFilteredCapability();

  /**
   * Returns a new object of class '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability</em>'.
   * @generated
   */
  Capability createCapability();

  /**
   * Returns a new object of class '<em>Set Property Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Property Operation</em>'.
   * @generated
   */
  SetPropertyOperation createSetPropertyOperation();

  /**
   * Returns a new object of class '<em>Unset Property Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unset Property Operation</em>'.
   * @generated
   */
  UnsetPropertyOperation createUnsetPropertyOperation();

  /**
   * Returns a new object of class '<em>Synchronization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Synchronization</em>'.
   * @generated
   */
  Synchronization createSynchronization();

  /**
   * Returns a new object of class '<em>Path Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Group</em>'.
   * @generated
   */
  PathGroup createPathGroup();

  /**
   * Returns a new object of class '<em>Path Vector Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Vector Element</em>'.
   * @generated
   */
  PathVectorElement createPathVectorElement();

  /**
   * Returns a new object of class '<em>Filtered Path Vector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filtered Path Vector</em>'.
   * @generated
   */
  FilteredPathVector createFilteredPathVector();

  /**
   * Returns a new object of class '<em>Path Vector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Vector</em>'.
   * @generated
   */
  PathVector createPathVector();

  /**
   * Returns a new object of class '<em>Compound Path Vector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound Path Vector</em>'.
   * @generated
   */
  CompoundPathVector createCompoundPathVector();

  /**
   * Returns a new object of class '<em>Prerequisite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prerequisite</em>'.
   * @generated
   */
  Prerequisite createPrerequisite();

  /**
   * Returns a new object of class '<em>With Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Clause</em>'.
   * @generated
   */
  WithClause createWithClause();

  /**
   * Returns a new object of class '<em>Prerequisite Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prerequisite Entry</em>'.
   * @generated
   */
  PrerequisiteEntry createPrerequisiteEntry();

  /**
   * Returns a new object of class '<em>Direct Part Referemce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Part Referemce</em>'.
   * @generated
   */
  DirectPartReferemce createDirectPartReferemce();

  /**
   * Returns a new object of class '<em>Capability Referenced Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability Referenced Part</em>'.
   * @generated
   */
  CapabilityReferencedPart createCapabilityReferencedPart();

  /**
   * Returns a new object of class '<em>Compound References</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound References</em>'.
   * @generated
   */
  CompoundReferences createCompoundReferences();

  /**
   * Returns a new object of class '<em>Builder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builder</em>'.
   * @generated
   */
  Builder createBuilder();

  /**
   * Returns a new object of class '<em>Parameter Declaration List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Declaration List</em>'.
   * @generated
   */
  ParameterDeclarationList createParameterDeclarationList();

  /**
   * Returns a new object of class '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Declaration</em>'.
   * @generated
   */
  ParameterDeclaration createParameterDeclaration();

  /**
   * Returns a new object of class '<em>Builder Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builder Output</em>'.
   * @generated
   */
  BuilderOutput createBuilderOutput();

  /**
   * Returns a new object of class '<em>Builder Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builder Input</em>'.
   * @generated
   */
  BuilderInput createBuilderInput();

  /**
   * Returns a new object of class '<em>Repository Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository Configuration</em>'.
   * @generated
   */
  RepositoryConfiguration createRepositoryConfiguration();

  /**
   * Returns a new object of class '<em>Repository Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository Declaration</em>'.
   * @generated
   */
  RepositoryDeclaration createRepositoryDeclaration();

  /**
   * Returns a new object of class '<em>Resolution Strategy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resolution Strategy</em>'.
   * @generated
   */
  ResolutionStrategy createResolutionStrategy();

  /**
   * Returns a new object of class '<em>Container Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Configuration</em>'.
   * @generated
   */
  ContainerConfiguration createContainerConfiguration();

  /**
   * Returns a new object of class '<em>Concern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concern</em>'.
   * @generated
   */
  Concern createConcern();

  /**
   * Returns a new object of class '<em>Concern Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concern Block</em>'.
   * @generated
   */
  ConcernBlock createConcernBlock();

  /**
   * Returns a new object of class '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>Pre Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Condition</em>'.
   * @generated
   */
  PreCondition createPreCondition();

  /**
   * Returns a new object of class '<em>Post Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Condition</em>'.
   * @generated
   */
  PostCondition createPostCondition();

  /**
   * Returns a new object of class '<em>Assertion Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertion Expression</em>'.
   * @generated
   */
  AssertionExpression createAssertionExpression();

  /**
   * Returns a new object of class '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression List</em>'.
   * @generated
   */
  ExpressionList createExpressionList();

  /**
   * Returns a new object of class '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context</em>'.
   * @generated
   */
  Context createContext();

  /**
   * Returns a new object of class '<em>Context Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Selector</em>'.
   * @generated
   */
  ContextSelector createContextSelector();

  /**
   * Returns a new object of class '<em>Expression Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Selector</em>'.
   * @generated
   */
  ExpressionSelector createExpressionSelector();

  /**
   * Returns a new object of class '<em>Unit Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit Selector</em>'.
   * @generated
   */
  UnitSelector createUnitSelector();

  /**
   * Returns a new object of class '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version</em>'.
   * @generated
   */
  Version createVersion();

  /**
   * Returns a new object of class '<em>Version Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version Range</em>'.
   * @generated
   */
  VersionRange createVersionRange();

  /**
   * Returns a new object of class '<em>Compoundd References</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compoundd References</em>'.
   * @generated
   */
  CompounddReferences createCompounddReferences();

  /**
   * Returns a new object of class '<em>Vararg Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vararg Parameter Declaration</em>'.
   * @generated
   */
  VarargParameterDeclaration createVarargParameterDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BeeLangPackage getBeeLangPackage();

} //BeeLangFactory
