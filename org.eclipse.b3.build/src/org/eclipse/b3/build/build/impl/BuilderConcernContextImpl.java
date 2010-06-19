/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.core.TypePattern;
import org.eclipse.b3.backend.core.TypePattern.Matcher;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;

import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.build.build.ConditionalPathVector;
import org.eclipse.b3.build.build.BuilderInput;
import org.eclipse.b3.build.build.BuilderWrapper;
import org.eclipse.b3.build.build.Capability;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.build.InputPredicate;
import org.eclipse.b3.build.build.OutputPredicate;
import org.eclipse.b3.build.build.PathGroup;
import org.eclipse.b3.build.build.Prerequisite;
import org.eclipse.b3.build.build.ProvidesPredicate;
import org.eclipse.b3.build.build.SourcePredicate;
import org.eclipse.b3.build.core.BuildUnitProxyAdapterFactory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getInputAdditions <em>Input Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getInputRemovals <em>Input Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getOutputAdditions <em>Output Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getOutputRemovals <em>Output Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getFuncExpr <em>Func Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#isVarArgs <em>Var Args</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#isMatchParameters <em>Match Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#isRemovePreCondition <em>Remove Pre Condition</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#isRemovePostCondition <em>Remove Post Condition</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#isRemovePostInputCondition <em>Remove Post Input Condition</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getPrecondExpr <em>Precond Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getPostcondExpr <em>Postcond Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getPostinputcondExpr <em>Postinputcond Expr</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getProvidesRemovals <em>Provides Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getOutputAnnotationsRemovals <em>Output Annotations Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getOutputAnnotationAdditions <em>Output Annotation Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getSourceRemovals <em>Source Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getSourceAdditions <em>Source Additions</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getSourceAnnotationsRemovals <em>Source Annotations Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.impl.BuilderConcernContextImpl#getSourceAnnotationAdditions <em>Source Annotation Additions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuilderConcernContextImpl extends BuildConcernContextImpl implements BuilderConcernContext {
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected BExpression query;

	/**
	 * The cached value of the '{@link #getInputAdditions() <em>Input Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Prerequisite> inputAdditions;

	/**
	 * The cached value of the '{@link #getInputRemovals() <em>Input Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPredicate> inputRemovals;

	/**
	 * The cached value of the '{@link #getOutputAdditions() <em>Output Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalPathVector> outputAdditions;

	/**
	 * The cached value of the '{@link #getOutputRemovals() <em>Output Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPredicate> outputRemovals;

	/**
	 * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression funcExpr;

	/**
	 * The default value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarArgs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VAR_ARGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarArgs()
	 * @generated
	 * @ordered
	 */
	protected boolean varArgs = VAR_ARGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<BParameterPredicate> parameters;

	/**
	 * The default value of the '{@link #isMatchParameters() <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchParameters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_PARAMETERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMatchParameters() <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchParameters()
	 * @generated
	 * @ordered
	 */
	protected boolean matchParameters = MATCH_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemovePreCondition() <em>Remove Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemovePreCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_PRE_CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemovePreCondition() <em>Remove Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemovePreCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean removePreCondition = REMOVE_PRE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemovePostCondition() <em>Remove Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemovePostCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_POST_CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemovePostCondition() <em>Remove Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemovePostCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean removePostCondition = REMOVE_POST_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemovePostInputCondition() <em>Remove Post Input Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemovePostInputCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_POST_INPUT_CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemovePostInputCondition() <em>Remove Post Input Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemovePostInputCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean removePostInputCondition = REMOVE_POST_INPUT_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondExpr() <em>Precond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression precondExpr;

	/**
	 * The cached value of the '{@link #getPostcondExpr() <em>Postcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postcondExpr;

	/**
	 * The cached value of the '{@link #getPostinputcondExpr() <em>Postinputcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostinputcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postinputcondExpr;

	/**
	 * The cached value of the '{@link #getProvidesRemovals() <em>Provides Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesPredicate> providesRemovals;

	/**
	 * The cached value of the '{@link #getOutputAnnotationsRemovals() <em>Output Annotations Removals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAnnotationsRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputAnnotationsRemovals;

	/**
	 * The cached value of the '{@link #getOutputAnnotationAdditions() <em>Output Annotation Additions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAnnotationAdditions()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet outputAnnotationAdditions;

	/**
	 * The cached value of the '{@link #getSourceRemovals() <em>Source Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<SourcePredicate> sourceRemovals;

	/**
	 * The cached value of the '{@link #getSourceAdditions() <em>Source Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalPathVector> sourceAdditions;

	/**
	 * The cached value of the '{@link #getSourceAnnotationsRemovals() <em>Source Annotations Removals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAnnotationsRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sourceAnnotationsRemovals;

	/**
	 * The cached value of the '{@link #getSourceAnnotationAdditions() <em>Source Annotation Additions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAnnotationAdditions()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet sourceAnnotationAdditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuilderConcernContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncExpr(BExpression newFuncExpr, NotificationChain msgs) {
		BExpression oldFuncExpr = funcExpr;
		funcExpr = newFuncExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, oldFuncExpr, newFuncExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputAnnotationAdditions(BPropertySet newOutputAnnotationAdditions,
			NotificationChain msgs) {
		BPropertySet oldOutputAnnotationAdditions = outputAnnotationAdditions;
		outputAnnotationAdditions = newOutputAnnotationAdditions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS,
				oldOutputAnnotationAdditions, newOutputAnnotationAdditions);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondExpr(BExpression newPostcondExpr, NotificationChain msgs) {
		BExpression oldPostcondExpr = postcondExpr;
		postcondExpr = newPostcondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR, oldPostcondExpr,
				newPostcondExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostinputcondExpr(BExpression newPostinputcondExpr, NotificationChain msgs) {
		BExpression oldPostinputcondExpr = postinputcondExpr;
		postinputcondExpr = newPostinputcondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR,
				oldPostinputcondExpr, newPostinputcondExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondExpr(BExpression newPrecondExpr, NotificationChain msgs) {
		BExpression oldPrecondExpr = precondExpr;
		precondExpr = newPrecondExpr;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR, oldPrecondExpr,
				newPrecondExpr);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(BExpression newQuery, NotificationChain msgs) {
		BExpression oldQuery = query;
		query = newQuery;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, oldQuery, newQuery);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceAnnotationAdditions(BPropertySet newSourceAnnotationAdditions,
			NotificationChain msgs) {
		BPropertySet oldSourceAnnotationAdditions = sourceAnnotationAdditions;
		sourceAnnotationAdditions = newSourceAnnotationAdditions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS,
				oldSourceAnnotationAdditions, newSourceAnnotationAdditions);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				return getQuery();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				return getInputAdditions();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				return getInputRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				return getOutputAdditions();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				return getOutputRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				return getFuncExpr();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				return isVarArgs();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				return getParameters();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				return isMatchParameters();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION:
				return isRemovePreCondition();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION:
				return isRemovePostCondition();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION:
				return isRemovePostInputCondition();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR:
				return getPrecondExpr();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR:
				return getPostcondExpr();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR:
				return getPostinputcondExpr();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return getProvidesRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS:
				return getOutputAnnotationsRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS:
				return getOutputAnnotationAdditions();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS:
				return getSourceRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS:
				return getSourceAdditions();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS:
				return getSourceAnnotationsRemovals();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS:
				return getSourceAnnotationAdditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				return basicSetQuery(null, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				return ((InternalEList<?>) getInputAdditions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				return ((InternalEList<?>) getInputRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				return ((InternalEList<?>) getOutputAdditions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				return ((InternalEList<?>) getOutputRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				return basicSetFuncExpr(null, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR:
				return basicSetPrecondExpr(null, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR:
				return basicSetPostcondExpr(null, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR:
				return basicSetPostinputcondExpr(null, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return ((InternalEList<?>) getProvidesRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS:
				return basicSetOutputAnnotationAdditions(null, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS:
				return ((InternalEList<?>) getSourceRemovals()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS:
				return ((InternalEList<?>) getSourceAdditions()).basicRemove(otherEnd, msgs);
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS:
				return basicSetSourceAnnotationAdditions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				return query != null;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				return inputAdditions != null && !inputAdditions.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				return inputRemovals != null && !inputRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				return outputAdditions != null && !outputAdditions.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				return outputRemovals != null && !outputRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				return funcExpr != null;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				return varArgs != VAR_ARGS_EDEFAULT;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				return matchParameters != MATCH_PARAMETERS_EDEFAULT;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION:
				return removePreCondition != REMOVE_PRE_CONDITION_EDEFAULT;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION:
				return removePostCondition != REMOVE_POST_CONDITION_EDEFAULT;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION:
				return removePostInputCondition != REMOVE_POST_INPUT_CONDITION_EDEFAULT;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR:
				return precondExpr != null;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR:
				return postcondExpr != null;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR:
				return postinputcondExpr != null;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				return providesRemovals != null && !providesRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS:
				return outputAnnotationsRemovals != null && !outputAnnotationsRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS:
				return outputAnnotationAdditions != null;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS:
				return sourceRemovals != null && !sourceRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS:
				return sourceAdditions != null && !sourceAdditions.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS:
				return sourceAnnotationsRemovals != null && !sourceAnnotationsRemovals.isEmpty();
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS:
				return sourceAnnotationAdditions != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				getInputAdditions().clear();
				getInputAdditions().addAll((Collection<? extends Prerequisite>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				getInputRemovals().clear();
				getInputRemovals().addAll((Collection<? extends InputPredicate>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				getOutputAdditions().clear();
				getOutputAdditions().addAll((Collection<? extends ConditionalPathVector>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				getOutputRemovals().clear();
				getOutputRemovals().addAll((Collection<? extends OutputPredicate>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				setFuncExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				setVarArgs((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends BParameterPredicate>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				setMatchParameters((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION:
				setRemovePreCondition((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION:
				setRemovePostCondition((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION:
				setRemovePostInputCondition((Boolean) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR:
				setPrecondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR:
				setPostcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				getProvidesRemovals().clear();
				getProvidesRemovals().addAll((Collection<? extends ProvidesPredicate>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS:
				getOutputAnnotationsRemovals().clear();
				getOutputAnnotationsRemovals().addAll((Collection<? extends String>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS:
				setOutputAnnotationAdditions((BPropertySet) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS:
				getSourceRemovals().clear();
				getSourceRemovals().addAll((Collection<? extends SourcePredicate>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS:
				getSourceAdditions().clear();
				getSourceAdditions().addAll((Collection<? extends ConditionalPathVector>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS:
				getSourceAnnotationsRemovals().clear();
				getSourceAnnotationsRemovals().addAll((Collection<? extends String>) newValue);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS:
				setSourceAnnotationAdditions((BPropertySet) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILDER_CONCERN_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY:
				setQuery((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS:
				getInputAdditions().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS:
				getInputRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS:
				getOutputAdditions().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS:
				getOutputRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR:
				setFuncExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS:
				setVarArgs(VAR_ARGS_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS:
				getParameters().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS:
				setMatchParameters(MATCH_PARAMETERS_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION:
				setRemovePreCondition(REMOVE_PRE_CONDITION_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION:
				setRemovePostCondition(REMOVE_POST_CONDITION_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION:
				setRemovePostInputCondition(REMOVE_POST_INPUT_CONDITION_EDEFAULT);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR:
				setPrecondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR:
				setPostcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR:
				setPostinputcondExpr((BExpression) null);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS:
				getProvidesRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS:
				getOutputAnnotationsRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS:
				setOutputAnnotationAdditions((BPropertySet) null);
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS:
				getSourceRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS:
				getSourceAdditions().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS:
				getSourceAnnotationsRemovals().clear();
				return;
			case B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS:
				setSourceAnnotationAdditions((BPropertySet) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Applies the advice to all already defined builders matching the query and type pattern specified
	 * in this context. Each matching builder is wrapped with a BuildWrapper and added to the context passed
	 * as a parameter.
	 * 
	 * @returns this
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// Find all builders that match the predicate
		// Add wrappers for all found builders
		Iterator<IFunction> fItor = ctx.getFunctionIterator();
		TypePattern pattern = TypePattern.compile(getParameters());

		while(fItor.hasNext()) {
			IFunction f = fItor.next();
			if(f instanceof IBuilder && matchesQuery((IBuilder) f, ctx))
				weaveIfParametersMatch(pattern, (IBuilder) f, ctx, null); // do not promote
		}
		return this;
	}

	/**
	 * Performs the same operation as {@link #evaluate(BExecutionContext)} but for a single object (candidate).
	 */
	@Override
	public boolean evaluateIfMatching(Object candidate, BExecutionContext ctx) throws Throwable {
		return evaluateIfMatching(candidate, ctx, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Performs the same operation as {@link #evaluate(BExecutionContext)} but for a single object (candidate), and
	 * with resulting wrapped builders being promoted to promoteToUnit (if set).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean evaluateIfMatching(Object candidate, BExecutionContext ctx, BuildUnit promoteToUnit)
			throws Throwable {
		TypePattern pattern = TypePattern.compile(getParameters());
		if(candidate instanceof IBuilder && matchesQuery((IBuilder) candidate, ctx))
			return weaveIfParametersMatch(pattern, (IBuilder) candidate, ctx, null); // do not promote
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getFuncExpr() {
		return funcExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prerequisite> getInputAdditions() {
		if(inputAdditions == null) {
			inputAdditions = new EObjectContainmentEList<Prerequisite>(
				Prerequisite.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS);
		}
		return inputAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPredicate> getInputRemovals() {
		if(inputRemovals == null) {
			inputRemovals = new EObjectContainmentEList<InputPredicate>(
				InputPredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS);
		}
		return inputRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalPathVector> getOutputAdditions() {
		if(outputAdditions == null) {
			outputAdditions = new EObjectContainmentEList<ConditionalPathVector>(
				ConditionalPathVector.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS);
		}
		return outputAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySet getOutputAnnotationAdditions() {
		return outputAnnotationAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOutputAnnotationsRemovals() {
		if(outputAnnotationsRemovals == null) {
			outputAnnotationsRemovals = new EDataTypeUniqueEList<String>(
				String.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS);
		}
		return outputAnnotationsRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPredicate> getOutputRemovals() {
		if(outputRemovals == null) {
			outputRemovals = new EObjectContainmentEList<OutputPredicate>(
				OutputPredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS);
		}
		return outputRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BParameterPredicate> getParameters() {
		if(parameters == null) {
			parameters = new EObjectContainmentEList<BParameterPredicate>(
				BParameterPredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getPostcondExpr() {
		return postcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getPostinputcondExpr() {
		return postinputcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getPrecondExpr() {
		return precondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidesPredicate> getProvidesRemovals() {
		if(providesRemovals == null) {
			providesRemovals = new EObjectContainmentEList<ProvidesPredicate>(
				ProvidesPredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS);
		}
		return providesRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpression getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalPathVector> getSourceAdditions() {
		if(sourceAdditions == null) {
			sourceAdditions = new EObjectContainmentEList<ConditionalPathVector>(
				ConditionalPathVector.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS);
		}
		return sourceAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySet getSourceAnnotationAdditions() {
		return sourceAnnotationAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSourceAnnotationsRemovals() {
		if(sourceAnnotationsRemovals == null) {
			sourceAnnotationsRemovals = new EDataTypeUniqueEList<String>(
				String.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS);
		}
		return sourceAnnotationsRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourcePredicate> getSourceRemovals() {
		if(sourceRemovals == null) {
			sourceRemovals = new EObjectContainmentEList<SourcePredicate>(
				SourcePredicate.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS);
		}
		return sourceRemovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMatchParameters() {
		return matchParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemovePostCondition() {
		return removePostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemovePostInputCondition() {
		return removePostInputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemovePreCondition() {
		return removePreCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVarArgs() {
		return varArgs;
	}

	/**
	 * Returns true if the candidate object matches the query and parameter type pattern.
	 */
	@Override
	public boolean matches(Object candidate, BExecutionContext ctx) {
		if(!(candidate instanceof IBuilder))
			return false;
		IBuilder b = (IBuilder) candidate;
		try {
			if(matchParameters) {
				TypePattern pattern = TypePattern.compile(getParameters());
				Matcher matcher = pattern.match(b.getParameterTypes());
				if(!matcher.isMatch())
					return false;

			}
			return matchesQuery(b, ctx);

		}
		catch(Throwable e) {
			throw new B3InternalError("Error while evaluating if BuilderConcernContext matches a Builder", e);
		}
	}

	/**
	 * Evaluates the query and returns true, if the candidate matches the query. This method does not include
	 * parameter type matching.
	 * 
	 * @param candidate
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	private boolean matchesQuery(IBuilder candidate, BExecutionContext ctx) throws Throwable {
		BExecutionContext ictx = ctx.createInnerContext();
		ictx.defineVariableValue("@test", candidate, Builder.class);
		return getQuery().evaluate(ictx) == Boolean.TRUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncExpr(BExpression newFuncExpr) {
		if(newFuncExpr != funcExpr) {
			NotificationChain msgs = null;
			if(funcExpr != null)
				msgs = ((InternalEObject) funcExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, null, msgs);
			if(newFuncExpr != null)
				msgs = ((InternalEObject) newFuncExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, null, msgs);
			msgs = basicSetFuncExpr(newFuncExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__FUNC_EXPR, newFuncExpr, newFuncExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchParameters(boolean newMatchParameters) {
		boolean oldMatchParameters = matchParameters;
		matchParameters = newMatchParameters;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS, oldMatchParameters,
				matchParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputAnnotationAdditions(BPropertySet newOutputAnnotationAdditions) {
		if(newOutputAnnotationAdditions != outputAnnotationAdditions) {
			NotificationChain msgs = null;
			if(outputAnnotationAdditions != null)
				msgs = ((InternalEObject) outputAnnotationAdditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS, null, msgs);
			if(newOutputAnnotationAdditions != null)
				msgs = ((InternalEObject) newOutputAnnotationAdditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS, null, msgs);
			msgs = basicSetOutputAnnotationAdditions(newOutputAnnotationAdditions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS,
				newOutputAnnotationAdditions, newOutputAnnotationAdditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondExpr(BExpression newPostcondExpr) {
		if(newPostcondExpr != postcondExpr) {
			NotificationChain msgs = null;
			if(postcondExpr != null)
				msgs = ((InternalEObject) postcondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR, null, msgs);
			if(newPostcondExpr != null)
				msgs = ((InternalEObject) newPostcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR, null, msgs);
			msgs = basicSetPostcondExpr(newPostcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR, newPostcondExpr,
				newPostcondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostinputcondExpr(BExpression newPostinputcondExpr) {
		if(newPostinputcondExpr != postinputcondExpr) {
			NotificationChain msgs = null;
			if(postinputcondExpr != null)
				msgs = ((InternalEObject) postinputcondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR, null, msgs);
			if(newPostinputcondExpr != null)
				msgs = ((InternalEObject) newPostinputcondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR, null, msgs);
			msgs = basicSetPostinputcondExpr(newPostinputcondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR,
				newPostinputcondExpr, newPostinputcondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondExpr(BExpression newPrecondExpr) {
		if(newPrecondExpr != precondExpr) {
			NotificationChain msgs = null;
			if(precondExpr != null)
				msgs = ((InternalEObject) precondExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR, null, msgs);
			if(newPrecondExpr != null)
				msgs = ((InternalEObject) newPrecondExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR, null, msgs);
			msgs = basicSetPrecondExpr(newPrecondExpr, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__PRECOND_EXPR, newPrecondExpr,
				newPrecondExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(BExpression newQuery) {
		if(newQuery != query) {
			NotificationChain msgs = null;
			if(query != null)
				msgs = ((InternalEObject) query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, null, msgs);
			if(newQuery != null)
				msgs = ((InternalEObject) newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, null, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovePostCondition(boolean newRemovePostCondition) {
		boolean oldRemovePostCondition = removePostCondition;
		removePostCondition = newRemovePostCondition;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION,
				oldRemovePostCondition, removePostCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovePostInputCondition(boolean newRemovePostInputCondition) {
		boolean oldRemovePostInputCondition = removePostInputCondition;
		removePostInputCondition = newRemovePostInputCondition;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION,
				oldRemovePostInputCondition, removePostInputCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovePreCondition(boolean newRemovePreCondition) {
		boolean oldRemovePreCondition = removePreCondition;
		removePreCondition = newRemovePreCondition;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION,
				oldRemovePreCondition, removePreCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAnnotationAdditions(BPropertySet newSourceAnnotationAdditions) {
		if(newSourceAnnotationAdditions != sourceAnnotationAdditions) {
			NotificationChain msgs = null;
			if(sourceAnnotationAdditions != null)
				msgs = ((InternalEObject) sourceAnnotationAdditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS, null, msgs);
			if(newSourceAnnotationAdditions != null)
				msgs = ((InternalEObject) newSourceAnnotationAdditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS, null, msgs);
			msgs = basicSetSourceAnnotationAdditions(newSourceAnnotationAdditions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS,
				newSourceAnnotationAdditions, newSourceAnnotationAdditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarArgs(boolean newVarArgs) {
		boolean oldVarArgs = varArgs;
		varArgs = newVarArgs;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3BuildPackage.BUILDER_CONCERN_CONTEXT__VAR_ARGS, oldVarArgs, varArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (varArgs: ");
		result.append(varArgs);
		result.append(", matchParameters: ");
		result.append(matchParameters);
		result.append(", removePreCondition: ");
		result.append(removePreCondition);
		result.append(", removePostCondition: ");
		result.append(removePostCondition);
		result.append(", removePostInputCondition: ");
		result.append(removePostInputCondition);
		result.append(", outputAnnotationsRemovals: ");
		result.append(outputAnnotationsRemovals);
		result.append(", sourceAnnotationsRemovals: ");
		result.append(sourceAnnotationsRemovals);
		result.append(')');
		return result.toString();
	}

	/**
	 * Performs parameter type matching and if parameters match, a wrapper is created and added to the context.
	 * 
	 * NOTE: the wrapper may have different parameter names than the original, and may only see a few of them. It may
	 * however need to modify the first parameter (if the wrapper is promoting the builder to a specific unit).
	 * So... the wraper needs a copy of the parameter declarations - and return this (modified) copy instead of the
	 * original's - this will work since the wrapped first parameter is applicable to the unit even if it is
	 * narrowed in the wrapper. This is all done in wrapper.promoteToUnit().
	 * 
	 * @param pattern
	 * @param b
	 * @param ctx
	 * @return
	 * @throws B3EngineException
	 */
	private boolean weaveIfParametersMatch(TypePattern pattern, IBuilder b, BExecutionContext ctx,
			BuildUnit promoteToUnit) throws B3EngineException {
		Matcher matcher = pattern.match(b.getParameterTypes());
		if(matchParameters && !matcher.isMatch())
			return false;

		// create a map of parameter name in advise and parameter name in matched function
		Map<String, String> nameMap = new HashMap<String, String>();
		EList<BParameterPredicate> plist = getParameters(); // i.e. predicates
		int limit = plist.size();
		String pName = null;
		// find predicates that have a name (only named predicates can be mapped)
		for(int i = 0; i < limit; i++)
			if((pName = plist.get(i).getName()) != null) {
				int matchedIdx = matcher.getMatchStart(i);
				if(matchedIdx < 0)
					throw new B3InternalError("Matched parameter reported to have an index of -1");
				nameMap.put(pName, b.getParameters().get(matcher.getMatchStart(matchedIdx)).getName());
			}

		// Create a wrapping function and define it in the context
		BuilderWrapper wrapper = B3BuildFactory.eINSTANCE.createBuilderWrapper();
		wrapper.setOriginal(b);
		wrapper.setAroundExpr(this.funcExpr); // non containment, so ok to use this.funcExpr
		wrapper.setParameterMap(nameMap);
		if(promoteToUnit != null) {
			wrapper.setUnitType(BuildUnitProxyAdapterFactory.eINSTANCE.adapt(promoteToUnit).getIface());
			wrapper.setUnitTypeAdvised(true);
		}
		// if function has varargs, and the varargs parameter was mapped, the wrapper needs to know this
		if(isVarArgs() && ((pName = plist.get(plist.size() - 1).getName()) != null))
			wrapper.setVarargsName(pName);

		// WRAP ASSERTS by chaining any added condition with the original (unless original is removed).
		B3backendFactory factory = B3backendFactory.eINSTANCE;
		// --pre
		if(b.getPrecondExpr() != null || isRemovePreCondition() || getPrecondExpr() != null) {
			BChainedExpression pcExpr = factory.createBChainedExpression();
			if(getPrecondExpr() != null) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(getPrecondExpr());
				pcExpr.getExpressions().add(ew);
			}
			if(b.getPrecondExpr() != null && !removePreCondition) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(b.getPrecondExpr());
				pcExpr.getExpressions().add(ew);
			}
			// set, and optimize if there is only one expression
			wrapper.setPrecondExpr(pcExpr.getExpressions().size() == 1
					? pcExpr.getExpressions().get(0)
					: pcExpr);
		}
		// --postinput
		if(b.getPostinputcondExpr() != null || isRemovePostInputCondition() || getPostinputcondExpr() != null) {
			BChainedExpression pcExpr = factory.createBChainedExpression();
			if(getPostinputcondExpr() != null) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(getPostinputcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			if(b.getPostinputcondExpr() != null && !removePostInputCondition) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(b.getPostinputcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			// set, and optimize if there is only one expression
			wrapper.setPostinputcondExpr(pcExpr.getExpressions().size() == 1
					? pcExpr.getExpressions().get(0)
					: pcExpr);

		}
		// --post
		if(b.getPostcondExpr() != null || isRemovePostCondition() || getPostcondExpr() != null) {
			BChainedExpression pcExpr = factory.createBChainedExpression();
			if(getPostcondExpr() != null) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(getPostcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			if(b.getPostcondExpr() != null && !removePostCondition) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(b.getPostcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			// set, and optimize if there is only one expression
			wrapper.setPostcondExpr(pcExpr.getExpressions().size() == 1
					? pcExpr.getExpressions().get(0)
					: pcExpr);
		}

		// WRAP INPUT
		// by copying original input, setting a flag that input is advised, and then first do removals,
		// and then additions. Everything needs to be copied as input is by containment, and the input rules may
		// be needed multiple times.

		// is input advised?
		ADVICEINPUT: if(getInputRemovals().size() > 0 || getInputAdditions().size() > 0) {
			boolean modified = false;
			BuilderInput input = null;
			wrapper.setInput(input = BuilderInput.class.cast(EcoreUtil.copy(b.getInput())));
			// removal
			for(InputPredicate ip : getInputRemovals())
				modified = ip.removeMatching(input) || modified;
			// optimize if unchanged
			if(!modified && getInputAdditions().size() == 0) {
				wrapper.setInput(null);
				break ADVICEINPUT;
			}
			// addition
			EList<Prerequisite> prereqs = input.getPrerequisites();
			for(Prerequisite p : getInputAdditions())
				prereqs.add(Prerequisite.class.cast(EcoreUtil.copy(p)));

			wrapper.setInputAdvised(true);
		}

		// WRAP OUTPUT
		// by copying original output, setting a flag that output is advised, and then first do removals,
		// and then additions. Everything needs to be copied as output is by containment, and the output rules
		// may be needed multiple times.,

		// is output advised ?
		ADVICEOUTPUT: if(getOutputRemovals().size() > 0 || getOutputAdditions().size() > 0 ||
				getOutputAnnotationsRemovals().size() > 0 || getOutputAnnotationAdditions() != null) {
			boolean modified = false;
			PathGroup pg = null;
			PathGroup originalOutput = b.getOutput();
			if(originalOutput != null)
				wrapper.setOutput(pg = PathGroup.class.cast(EcoreUtil.copy(b.getOutput())));
			else {
				// TODO: Should probably log warning that empty output was created as a consequence of advice.
				originalOutput = B3BuildFactory.eINSTANCE.createPathGroup();
			}
			// removal
			for(OutputPredicate op : getOutputRemovals())
				modified = op.removeMatching(pg) || modified;

			// addition
			EList<ConditionalPathVector> vectors = pg.getPathVectors();
			for(ConditionalPathVector pv : getOutputAdditions())
				vectors.add(ConditionalPathVector.class.cast(EcoreUtil.copy(pv)));

			// WRAP ANNOTATIONS
			// Same as Default properties, but for annotations.
			// TODO: What to do if there is no output? It may still be useful to modify annotations in the produced
			// result
			// in input?? (Current impl will throw NPE if there is no output...)
			if(getOutputAnnotationsRemovals().size() > 0 || getOutputAnnotationAdditions() != null) {
				BPropertySet as = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
				modified = processProperties(
					as, getOutputAnnotationsRemovals(), b.getOutput().getAnnotations(), getOutputAnnotationAdditions()) ||
						modified;
				wrapper.getOutput().setAnnotations(as);
			}
			// optimize if unchanged
			if(!modified && getOutputAdditions().size() == 0 && getOutputAnnotationAdditions() != null) {
				wrapper.setOutput(null);
				break ADVICEOUTPUT;
			}
			wrapper.setOutputAdvised(true);

		}
		//
		// WRAP SOURCE
		// by copying original source, setting a flag that source is advised, and then first do removals,
		// and then additions. Everything needs to be copied as source is by containment, and the source rules
		// may be needed multiple times.

		// is source advised ?
		ADVICESOURCE: if(getSourceRemovals().size() > 0 || getOutputAdditions().size() > 0 ||
				getSourceAnnotationsRemovals().size() > 0 || getSourceAnnotationAdditions() != null) {
			boolean modified = false;
			PathGroup pg = null;
			PathGroup originalSource = b.getSource();
			if(originalSource != null)
				wrapper.setSource(pg = PathGroup.class.cast(EcoreUtil.copy(b.getSource())));
			else {
				// TODO: Should probably log warning that empty source was created as a consequence of advice.
				originalSource = B3BuildFactory.eINSTANCE.createPathGroup();
			}
			// removal
			for(SourcePredicate sp : getSourceRemovals())
				modified = sp.removeMatching(pg) || modified;

			// addition
			EList<ConditionalPathVector> vectors = pg.getPathVectors();
			for(ConditionalPathVector pv : getSourceAdditions())
				vectors.add(ConditionalPathVector.class.cast(EcoreUtil.copy(pv)));

			// WRAP ANNOTATIONS
			// Same as Default properties, but for annotations.
			// TODO: What to do if there is no source? It may still be useful to modify annotations in the produced
			// result
			// in input?? (Current impl will throw NPE if there is no source...)
			if(getSourceAnnotationsRemovals().size() > 0 || getSourceAnnotationAdditions() != null) {
				BPropertySet as = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
				modified = processProperties(
					as, getSourceAnnotationsRemovals(), b.getSource().getAnnotations(), getSourceAnnotationAdditions()) ||
						modified;
				wrapper.getSource().setAnnotations(as);
			}
			// optimize if unchanged
			if(!modified && getSourceAdditions().size() == 0 && getSourceAnnotationAdditions() != null) {
				wrapper.setSource(null);
				break ADVICESOURCE;
			}
			wrapper.setSourceAdvised(true);

		}

		//
		// WRAP PROVIDED CAPABILITIES
		ADVICEPROVIDES: if(getProvidesRemovals().size() > 0 || getProvidedCapabilities().size() > 0) {
			boolean modified = false;
			EList<Capability> provided = wrapper.getProvidedCapabilities();
			for(Capability c : b.getProvidedCapabilities())
				provided.add(Capability.class.cast(EcoreUtil.copy(c)));
			// removal
			for(ProvidesPredicate pp : getProvidesRemovals())
				modified = pp.removeMatching(provided) || modified;
			// optimize if unchanged
			if(!modified && getProvidedCapabilities().size() == 0) {
				provided.clear();
				break ADVICEPROVIDES;
			}
			// addition
			for(Capability c : getProvidedCapabilities())
				provided.add(Capability.class.cast(EcoreUtil.copy(c)));

			wrapper.setProvidesAdvised(true);
		}

		// WRAP DEFAULT PROPERTIES
		// if there are removals or additions, copy the property set from the original and then remove
		// specific property settings - nasty if other properties rely on previously set properties - but
		// user has to worry about that, then add copied definitions from additions.
		//
		if(getDefaultPropertiesRemovals().size() > 0 || getDefaultPropertiesAdditions() != null) {
			BPropertySet ps = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
			wrapper.setDefaultProperties(ps);
			processProperties(
				ps, getDefaultPropertiesRemovals(), b.getDefaultProperties(), getDefaultPropertiesAdditions());
		}

		// define the wrapper, and we are done
		ctx.defineFunction(wrapper);
		return true;
	}
} // BuilderConcernContextImpl
