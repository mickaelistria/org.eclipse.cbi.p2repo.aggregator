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
