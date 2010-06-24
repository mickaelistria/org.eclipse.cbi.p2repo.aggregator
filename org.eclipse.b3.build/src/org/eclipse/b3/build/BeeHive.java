/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bee Hive</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.BeeHive#getBeeModels <em>Bee Models</em>}</li>
 * <li>{@link org.eclipse.b3.build.BeeHive#getParent <em>Parent</em>}</li>
 * <li>{@link org.eclipse.b3.build.BeeHive#getResolutions <em>Resolutions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getBeeHive()
 * @model
 * @generated
 */
public interface BeeHive extends EObject {
	/**
	 * Returns the value of the '<em><b>Bee Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.BeeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bee Models</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bee Models</em>' reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBeeHive_BeeModels()
	 * @model
	 * @generated
	 */
	EList<BeeModel> getBeeModels();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(BeeHive)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBeeHive_Parent()
	 * @model
	 * @generated
	 */
	BeeHive getParent();

	/**
	 * Returns the value of the '<em><b>Resolutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolutions</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resolutions</em>' attribute.
	 * @see #setResolutions(Map)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBeeHive_Resolutions()
	 * @model transient="true"
	 * @generated
	 */
	Map<RequiredCapability, Capability> getResolutions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the {@link IProvidedCapabilityContainer} that was the result of resolving the {@link RequiredCapability} referenced by the
	 * requiredCapability parameter. The returned capability container is one of {@link BuildUnit} or {@link Builder}. Naturally, to get the actual
	 * capability from a builder, the result must first be built.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @model
	 * @generated
	 */
	IProvidedCapabilityContainer getResolvedCapabilityContainer(RequiredCapability requiredCapability);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BeeHive#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BeeHive value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BeeHive#getResolutions <em>Resolutions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resolutions</em>' attribute.
	 * @see #getResolutions()
	 * @generated
	 */
	void setResolutions(Map<RequiredCapability, Capability> value);

} // BeeHive
