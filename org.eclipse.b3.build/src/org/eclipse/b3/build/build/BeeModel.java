/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bee Model</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.BeeModel#getImports <em>Imports</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BeeModel#getFunctions <em>Functions</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BeeModel#getConcerns <em>Concerns</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BeeModel#getBuildUnits <em>Build Units</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BeeModel#getPropertySets <em>Property Sets</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BeeModel#getRepositories <em>Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.BeeModel#getProvider <em>Provider</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel()
 * @model
 * @generated
 */
public interface BeeModel extends BChainedExpression {
	/**
	 * Returns the value of the '<em><b>Build Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.BuildUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Units</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Build Units</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel_BuildUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuildUnit> getBuildUnits();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BConcern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<BConcern> getConcerns();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<IFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link java.lang.reflect.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel_Imports()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	EList<Type> getImports();

	/**
	 * Returns the value of the '<em><b>Property Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Sets</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Sets</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel_PropertySets()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPropertySet> getPropertySets();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(FirstFoundUnitProvider)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel_Provider()
	 * @model containment="true"
	 * @generated
	 */
	FirstFoundUnitProvider getProvider();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBeeModel_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BeeModel#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(FirstFoundUnitProvider value);

} // BeeModel
