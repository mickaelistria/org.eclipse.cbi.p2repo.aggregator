/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.impl;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuilderConcernContext;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.ConditionalPathVector;
import org.eclipse.b3.build.InputPredicate;
import org.eclipse.b3.build.OutputPredicate;
import org.eclipse.b3.build.ProvidesPredicate;
import org.eclipse.b3.build.SourcePredicate;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builder Concern Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getQuery <em>Query</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getInputAdditions <em>Input Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getInputRemovals <em>Input Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getOutputAdditions <em>Output Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getOutputRemovals <em>Output Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getFuncExpr <em>Func Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#isVarArgs <em>Var Args</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getParameters <em>Parameters</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#isMatchParameters <em>Match Parameters</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#isRemovePreCondition <em>Remove Pre Condition</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#isRemovePostCondition <em>Remove Post Condition</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#isRemovePostInputCondition <em>Remove Post Input Condition</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getPrecondExpr <em>Precond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getPostcondExpr <em>Postcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getPostinputcondExpr <em>Postinputcond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getProvidesRemovals <em>Provides Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getOutputAnnotationsRemovals <em>Output Annotations Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getOutputAnnotationAdditions <em>Output Annotation Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getSourceRemovals <em>Source Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getSourceAdditions <em>Source Additions</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getSourceAnnotationsRemovals <em>Source Annotations Removals</em>}</li>
 * <li>{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl#getSourceAnnotationAdditions <em>Source Annotation Additions</em>}</li>
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
	 * 
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected BExpression query;

	/**
	 * The cached value of the '{@link #getInputAdditions() <em>Input Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInputAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<BuilderInput> inputAdditions;

	/**
	 * The cached value of the '{@link #getInputRemovals() <em>Input Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInputRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPredicate> inputRemovals;

	/**
	 * The cached value of the '{@link #getOutputAdditions() <em>Output Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutputAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalPathVector> outputAdditions;

	/**
	 * The cached value of the '{@link #getOutputRemovals() <em>Output Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutputRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPredicate> outputRemovals;

	/**
	 * The cached value of the '{@link #getFuncExpr() <em>Func Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFuncExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression funcExpr;

	/**
	 * The default value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isVarArgs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VAR_ARGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVarArgs() <em>Var Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isVarArgs()
	 * @generated
	 * @ordered
	 */
	protected boolean varArgs = VAR_ARGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<BParameterPredicate> parameters;

	/**
	 * The default value of the '{@link #isMatchParameters() <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isMatchParameters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_PARAMETERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMatchParameters() <em>Match Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isMatchParameters()
	 * @generated
	 * @ordered
	 */
	protected boolean matchParameters = MATCH_PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemovePreCondition() <em>Remove Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRemovePreCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_PRE_CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemovePreCondition() <em>Remove Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRemovePreCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean removePreCondition = REMOVE_PRE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemovePostCondition() <em>Remove Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRemovePostCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_POST_CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemovePostCondition() <em>Remove Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRemovePostCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean removePostCondition = REMOVE_POST_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemovePostInputCondition() <em>Remove Post Input Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRemovePostInputCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_POST_INPUT_CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemovePostInputCondition() <em>Remove Post Input Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRemovePostInputCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean removePostInputCondition = REMOVE_POST_INPUT_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondExpr() <em>Precond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrecondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression precondExpr;

	/**
	 * The cached value of the '{@link #getPostcondExpr() <em>Postcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postcondExpr;

	/**
	 * The cached value of the '{@link #getPostinputcondExpr() <em>Postinputcond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPostinputcondExpr()
	 * @generated
	 * @ordered
	 */
	protected BExpression postinputcondExpr;

	/**
	 * The cached value of the '{@link #getProvidesRemovals() <em>Provides Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProvidesRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidesPredicate> providesRemovals;

	/**
	 * The cached value of the '{@link #getOutputAnnotationsRemovals() <em>Output Annotations Removals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutputAnnotationsRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputAnnotationsRemovals;

	/**
	 * The cached value of the '{@link #getOutputAnnotationAdditions() <em>Output Annotation Additions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutputAnnotationAdditions()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet outputAnnotationAdditions;

	/**
	 * The cached value of the '{@link #getSourceRemovals() <em>Source Removals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<SourcePredicate> sourceRemovals;

	/**
	 * The cached value of the '{@link #getSourceAdditions() <em>Source Additions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceAdditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalPathVector> sourceAdditions;

	/**
	 * The cached value of the '{@link #getSourceAnnotationsRemovals() <em>Source Annotations Removals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceAnnotationsRemovals()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sourceAnnotationsRemovals;

	/**
	 * The cached value of the '{@link #getSourceAnnotationAdditions() <em>Source Annotation Additions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSourceAnnotationAdditions()
	 * @generated
	 * @ordered
	 */
	protected BPropertySet sourceAnnotationAdditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BuilderConcernContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
				getInputAdditions().addAll((Collection<? extends BuilderInput>) newValue);
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
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILDER_CONCERN_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getFuncExpr() {
		return funcExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BuilderInput> getInputAdditions() {
		if(inputAdditions == null) {
			inputAdditions = new EObjectContainmentEList<BuilderInput>(
				BuilderInput.class, this, B3BuildPackage.BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS);
		}
		return inputAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
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
	 * 
	 * @generated
	 */
	public BPropertySet getOutputAnnotationAdditions() {
		return outputAnnotationAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
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
	 * 
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
	 * 
	 * @generated
	 */
	public BExpression getPostcondExpr() {
		return postcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPostinputcondExpr() {
		return postinputcondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExpression getPrecondExpr() {
		return precondExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	public BExpression getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	public BPropertySet getSourceAnnotationAdditions() {
		return sourceAnnotationAdditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
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
	 * 
	 * @generated
	 */
	public boolean isMatchParameters() {
		return matchParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isRemovePostCondition() {
		return removePostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isRemovePostInputCondition() {
		return removePostInputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isRemovePreCondition() {
		return removePreCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isVarArgs() {
		return varArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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

} // BuilderConcernContextImpl
