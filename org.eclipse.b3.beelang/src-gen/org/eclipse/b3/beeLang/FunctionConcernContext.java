/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.b3.beeLang;

import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Concern Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.beeLang.FunctionConcernContext#getNamePredicate <em>Name Predicate</em>}</li>
 *   <li>{@link org.eclipse.b3.beeLang.FunctionConcernContext#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.beeLang.FunctionConcernContext#isVarArgs <em>Var Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.beeLang.BeeLangPackage#getFunctionConcernContext()
 * @model
 * @generated
 */
public interface FunctionConcernContext extends BConcernContext
{
  /**
   * Returns the value of the '<em><b>Name Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Predicate</em>' containment reference.
   * @see #setNamePredicate(BNamePredicate)
   * @see org.eclipse.b3.beeLang.BeeLangPackage#getFunctionConcernContext_NamePredicate()
   * @model containment="true"
   * @generated
   */
  BNamePredicate getNamePredicate();

  /**
   * Sets the value of the '{@link org.eclipse.b3.beeLang.FunctionConcernContext#getNamePredicate <em>Name Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Predicate</em>' containment reference.
   * @see #getNamePredicate()
   * @generated
   */
  void setNamePredicate(BNamePredicate value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.eclipse.b3.beeLang.BeeLangPackage#getFunctionConcernContext_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getParameters();

  /**
   * Returns the value of the '<em><b>Var Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Args</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Args</em>' attribute.
   * @see #setVarArgs(boolean)
   * @see org.eclipse.b3.beeLang.BeeLangPackage#getFunctionConcernContext_VarArgs()
   * @model
   * @generated
   */
  boolean isVarArgs();

  /**
   * Sets the value of the '{@link org.eclipse.b3.beeLang.FunctionConcernContext#isVarArgs <em>Var Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Args</em>' attribute.
   * @see #isVarArgs()
   * @generated
   */
  void setVarArgs(boolean value);

} // FunctionConcernContext
