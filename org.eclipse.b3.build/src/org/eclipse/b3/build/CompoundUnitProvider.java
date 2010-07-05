/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.CompoundUnitProvider#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.B3BuildPackage#getCompoundUnitProvider()
 * @model abstract="true"
 * @generated
 */
public interface CompoundUnitProvider extends UnitProvider {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.UnitProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getCompoundUnitProvider_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitProvider> getProviders();

} // ResolutionStrategy
