/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.build.build.B3BuildPackage
 * @generated
 */
public interface B3BuildFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	B3BuildFactory eINSTANCE = org.eclipse.b3.build.build.impl.B3BuildFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Build Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Unit</em>'.
	 * @generated
	 */
	BuildUnit createBuildUnit();

	/**
	 * Returns a new object of class '<em>Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Builder</em>'.
	 * @generated
	 */
	Builder createBuilder();

	/**
	 * Returns a new object of class '<em>Versioned Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned Capability</em>'.
	 * @generated
	 */
	VersionedCapability createVersionedCapability();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Required Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Capability</em>'.
	 * @generated
	 */
	RequiredCapability createRequiredCapability();

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
	 * Returns a new object of class '<em>Path Vector Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Vector Element</em>'.
	 * @generated
	 */
	PathVectorElement createPathVectorElement();

	/**
	 * Returns a new object of class '<em>Synchronization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization</em>'.
	 * @generated
	 */
	Synchronization createSynchronization();

	/**
	 * Returns a new object of class '<em>Synchronized Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronized Builder</em>'.
	 * @generated
	 */
	SynchronizedBuilder createSynchronizedBuilder();

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
	 * Returns a new object of class '<em>Resolution Strategy First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Strategy First</em>'.
	 * @generated
	 */
	ResolutionStrategyFirst createResolutionStrategyFirst();

	/**
	 * Returns a new object of class '<em>Resolution Strategy Best</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Strategy Best</em>'.
	 * @generated
	 */
	ResolutionStrategyBest createResolutionStrategyBest();

	/**
	 * Returns a new object of class '<em>Container Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Configuration</em>'.
	 * @generated
	 */
	ContainerConfiguration createContainerConfiguration();

	/**
	 * Returns a new object of class '<em>Builder Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Builder Input</em>'.
	 * @generated
	 */
	BuilderInput createBuilderInput();

	/**
	 * Returns a new object of class '<em>Path Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Group</em>'.
	 * @generated
	 */
	PathGroup createPathGroup();

	/**
	 * Returns a new object of class '<em>Prerequisite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prerequisite</em>'.
	 * @generated
	 */
	Prerequisite createPrerequisite();

	/**
	 * Returns a new object of class '<em>Build Result Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Result Reference</em>'.
	 * @generated
	 */
	BuildResultReference createBuildResultReference();

	/**
	 * Returns a new object of class '<em>Compound Build Result Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Build Result Reference</em>'.
	 * @generated
	 */
	CompoundBuildResultReference createCompoundBuildResultReference();

	/**
	 * Returns a new object of class '<em>Builder Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Builder Reference</em>'.
	 * @generated
	 */
	BuilderReference createBuilderReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	B3BuildPackage getB3BuildPackage();

} //B3BuildFactory
