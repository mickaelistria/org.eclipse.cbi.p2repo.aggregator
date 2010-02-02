/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Concern Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#getInputAdditions <em>Input Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#getInputRemovals <em>Input Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#getOutputAdditions <em>Output Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#getOutputRemovals <em>Output Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#getFuncExpr <em>Func Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderConcernContext#isMatchParameters <em>Match Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext()
 * @model
 * @generated
 */
public interface BuilderConcernContext extends BuildConcernContext {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_Query()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderConcernContext#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(BExpression value);

	/**
	 * Returns the value of the '<em><b>Input Additions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Prerequisite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Additions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Additions</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_InputAdditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Prerequisite> getInputAdditions();

	/**
	 * Returns the value of the '<em><b>Input Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.InputPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Removals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_InputRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPredicate> getInputRemovals();

	/**
	 * Returns the value of the '<em><b>Output Additions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.PathVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Additions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Additions</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_OutputAdditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathVector> getOutputAdditions();

	/**
	 * Returns the value of the '<em><b>Output Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.OutputPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Removals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_OutputRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPredicate> getOutputRemovals();

	/**
	 * Returns the value of the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func Expr</em>' containment reference.
	 * @see #setFuncExpr(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_FuncExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getFuncExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderConcernContext#getFuncExpr <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func Expr</em>' containment reference.
	 * @see #getFuncExpr()
	 * @generated
	 */
	void setFuncExpr(BExpression value);

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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_VarArgs()
	 * @model
	 * @generated
	 */
	boolean isVarArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderConcernContext#isVarArgs <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Args</em>' attribute.
	 * @see #isVarArgs()
	 * @generated
	 */
	void setVarArgs(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<BParameterPredicate> getParameters();

	/**
	 * Returns the value of the '<em><b>Match Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Parameters</em>' attribute.
	 * @see #setMatchParameters(boolean)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderConcernContext_MatchParameters()
	 * @model
	 * @generated
	 */
	boolean isMatchParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderConcernContext#isMatchParameters <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Parameters</em>' attribute.
	 * @see #isMatchParameters()
	 * @generated
	 */
	void setMatchParameters(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	boolean evaluateIfMatching(Object candidate, BExecutionContext ctx, BuildUnit promoteToUnit) throws Throwable;

} // BuilderConcernContext
