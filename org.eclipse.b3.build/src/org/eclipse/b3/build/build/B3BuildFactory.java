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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	B3BuildPackage getB3BuildPackage();

} //B3BuildFactory
