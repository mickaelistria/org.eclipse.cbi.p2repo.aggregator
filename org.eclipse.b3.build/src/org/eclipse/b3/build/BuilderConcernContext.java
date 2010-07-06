/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getQuery <em>Query</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getInputAdditions <em>Input Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getInputRemovals <em>Input Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getOutputAdditions <em>Output Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getOutputRemovals <em>Output Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getFuncExpr <em>Func Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#isVarArgs <em>Var Args</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getParameters <em>Parameters</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#isMatchParameters <em>Match Parameters</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePreCondition <em>Remove Pre Condition</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePostCondition <em>Remove Post Condition</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePostInputCondition <em>Remove Post Input Condition</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getPrecondExpr <em>Precond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getPostcondExpr <em>Postcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getPostinputcondExpr <em>Postinputcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getProvidesRemovals <em>Provides Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getOutputAnnotationsRemovals <em>Output Annotations Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getOutputAnnotationAdditions <em>Output Annotation Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getSourceRemovals <em>Source Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getSourceAdditions <em>Source Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getSourceAnnotationsRemovals <em>Source Annotations Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.BuilderConcernContext#getSourceAnnotationAdditions <em>Source Annotation Additions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext()
 * @model
 * @generated
 */
public interface BuilderConcernContext extends BuildConcernContext {
	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// *
	// * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	// * @generated
	// */
	// boolean evaluateIfMatching(Object candidate, BExecutionContext ctx, BuildUnit promoteToUnit) throws Throwable;

	/**
	 * Returns the value of the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Func Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Func Expr</em>' containment reference.
	 * @see #setFuncExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_FuncExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getFuncExpr();

	/**
	 * Returns the value of the '<em><b>Input Additions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.BuilderInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Additions</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Additions</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_InputAdditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuilderInput> getInputAdditions();

	/**
	 * Returns the value of the '<em><b>Input Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.InputPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Removals</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Input Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_InputRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPredicate> getInputRemovals();

	/**
	 * Returns the value of the '<em><b>Output Additions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.ConditionalPathVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Additions</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Additions</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_OutputAdditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalPathVector> getOutputAdditions();

	/**
	 * Returns the value of the '<em><b>Output Annotation Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Annotation Additions</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Annotation Additions</em>' containment reference.
	 * @see #setOutputAnnotationAdditions(BPropertySet)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_OutputAnnotationAdditions()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getOutputAnnotationAdditions();

	/**
	 * Returns the value of the '<em><b>Output Annotations Removals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Annotations Removals</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Annotations Removals</em>' attribute list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_OutputAnnotationsRemovals()
	 * @model
	 * @generated
	 */
	EList<String> getOutputAnnotationsRemovals();

	/**
	 * Returns the value of the '<em><b>Output Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.OutputPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Removals</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_OutputRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPredicate> getOutputRemovals();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<BParameterPredicate> getParameters();

	/**
	 * Returns the value of the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Postcond Expr</em>' containment reference.
	 * @see #setPostcondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_PostcondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPostcondExpr();

	/**
	 * Returns the value of the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postinputcond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Postinputcond Expr</em>' containment reference.
	 * @see #setPostinputcondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_PostinputcondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPostinputcondExpr();

	/**
	 * Returns the value of the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Precond Expr</em>' containment reference.
	 * @see #setPrecondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_PrecondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getPrecondExpr();

	/**
	 * Returns the value of the '<em><b>Provides Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.ProvidesPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Removals</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provides Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_ProvidesRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidesPredicate> getProvidesRemovals();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_Query()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getQuery();

	/**
	 * Returns the value of the '<em><b>Source Additions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.ConditionalPathVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Additions</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Additions</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_SourceAdditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalPathVector> getSourceAdditions();

	/**
	 * Returns the value of the '<em><b>Source Annotation Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Annotation Additions</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Annotation Additions</em>' containment reference.
	 * @see #setSourceAnnotationAdditions(BPropertySet)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_SourceAnnotationAdditions()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getSourceAnnotationAdditions();

	/**
	 * Returns the value of the '<em><b>Source Annotations Removals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Annotations Removals</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Annotations Removals</em>' attribute list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_SourceAnnotationsRemovals()
	 * @model
	 * @generated
	 */
	EList<String> getSourceAnnotationsRemovals();

	/**
	 * Returns the value of the '<em><b>Source Removals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.SourcePredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Removals</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Removals</em>' containment reference list.
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_SourceRemovals()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourcePredicate> getSourceRemovals();

	/**
	 * Returns the value of the '<em><b>Match Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match Parameters</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Match Parameters</em>' attribute.
	 * @see #setMatchParameters(boolean)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_MatchParameters()
	 * @model
	 * @generated
	 */
	boolean isMatchParameters();

	/**
	 * Returns the value of the '<em><b>Remove Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Post Condition</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Remove Post Condition</em>' attribute.
	 * @see #setRemovePostCondition(boolean)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_RemovePostCondition()
	 * @model
	 * @generated
	 */
	boolean isRemovePostCondition();

	/**
	 * Returns the value of the '<em><b>Remove Post Input Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Post Input Condition</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Remove Post Input Condition</em>' attribute.
	 * @see #setRemovePostInputCondition(boolean)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_RemovePostInputCondition()
	 * @model
	 * @generated
	 */
	boolean isRemovePostInputCondition();

	/**
	 * Returns the value of the '<em><b>Remove Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Pre Condition</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Remove Pre Condition</em>' attribute.
	 * @see #setRemovePreCondition(boolean)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_RemovePreCondition()
	 * @model
	 * @generated
	 */
	boolean isRemovePreCondition();

	/**
	 * Returns the value of the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Args</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Var Args</em>' attribute.
	 * @see #setVarArgs(boolean)
	 * @see org.eclipse.b3.build.B3BuildPackage#getBuilderConcernContext_VarArgs()
	 * @model
	 * @generated
	 */
	boolean isVarArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#getFuncExpr <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Func Expr</em>' containment reference.
	 * @see #getFuncExpr()
	 * @generated
	 */
	void setFuncExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#isMatchParameters <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Match Parameters</em>' attribute.
	 * @see #isMatchParameters()
	 * @generated
	 */
	void setMatchParameters(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#getOutputAnnotationAdditions <em>Output Annotation Additions</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Output Annotation Additions</em>' containment reference.
	 * @see #getOutputAnnotationAdditions()
	 * @generated
	 */
	void setOutputAnnotationAdditions(BPropertySet value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#getPostcondExpr <em>Postcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Postcond Expr</em>' containment reference.
	 * @see #getPostcondExpr()
	 * @generated
	 */
	void setPostcondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#getPostinputcondExpr <em>Postinputcond Expr</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Postinputcond Expr</em>' containment reference.
	 * @see #getPostinputcondExpr()
	 * @generated
	 */
	void setPostinputcondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#getPrecondExpr <em>Precond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Precond Expr</em>' containment reference.
	 * @see #getPrecondExpr()
	 * @generated
	 */
	void setPrecondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePostCondition <em>Remove Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Remove Post Condition</em>' attribute.
	 * @see #isRemovePostCondition()
	 * @generated
	 */
	void setRemovePostCondition(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePostInputCondition <em>Remove Post Input Condition</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Remove Post Input Condition</em>' attribute.
	 * @see #isRemovePostInputCondition()
	 * @generated
	 */
	void setRemovePostInputCondition(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePreCondition <em>Remove Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Remove Pre Condition</em>' attribute.
	 * @see #isRemovePreCondition()
	 * @generated
	 */
	void setRemovePreCondition(boolean value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#getSourceAnnotationAdditions <em>Source Annotation Additions</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Annotation Additions</em>' containment reference.
	 * @see #getSourceAnnotationAdditions()
	 * @generated
	 */
	void setSourceAnnotationAdditions(BPropertySet value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.BuilderConcernContext#isVarArgs <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Var Args</em>' attribute.
	 * @see #isVarArgs()
	 * @generated
	 */
	void setVarArgs(boolean value);

} // BuilderConcernContext
