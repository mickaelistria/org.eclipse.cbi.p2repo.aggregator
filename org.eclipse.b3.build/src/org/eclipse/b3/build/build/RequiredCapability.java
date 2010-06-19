/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.RequiredCapability#getVersionRange <em>Version Range</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.RequiredCapability#isGreedy <em>Greedy</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.RequiredCapability#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.RequiredCapability#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiredCapability()
 * @model
 * @generated
 */
public interface RequiredCapability extends Capability {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiredCapability_Max()
	 * @model default="1"
	 * @generated
	 */
	int getMax();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiredCapability_Min()
	 * @model default="1"
	 * @generated
	 */
	int getMin();

	/**
	 * Returns the value of the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Range</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Range</em>' attribute.
	 * @see #setVersionRange(VersionRange)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiredCapability_VersionRange()
	 * @model dataType="org.eclipse.b3.build.build.VersionRange"
	 * @generated
	 */
	VersionRange getVersionRange();

	/**
	 * Returns the value of the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Greedy</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greedy</em>' attribute.
	 * @see #setGreedy(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRequiredCapability_Greedy()
	 * @model
	 * @generated
	 */
	boolean isGreedy();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RequiredCapability#isGreedy <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greedy</em>' attribute.
	 * @see #isGreedy()
	 * @generated
	 */
	void setGreedy(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RequiredCapability#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RequiredCapability#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RequiredCapability#getVersionRange <em>Version Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Range</em>' attribute.
	 * @see #getVersionRange()
	 * @generated
	 */
	void setVersionRange(VersionRange value);

} // RequiredCapability
