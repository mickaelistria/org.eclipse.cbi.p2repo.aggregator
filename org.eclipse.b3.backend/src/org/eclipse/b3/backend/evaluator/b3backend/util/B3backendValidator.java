/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.backend.evaluator.b3backend.util;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.evaluator.B3ExpressionCache;
import org.eclipse.b3.backend.evaluator.B3FuncStore;
import org.eclipse.b3.backend.evaluator.ValueMap;
import org.eclipse.b3.backend.evaluator.b3backend.*;
import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.core.datatypes.SimplePattern;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3Type;
import org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BAdvice;
import org.eclipse.b3.backend.evaluator.b3backend.BAndExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCallExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFeature;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BCallNamedFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BCatch;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BConditionalPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BDefProperty;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.backend.evaluator.b3backend.BDefaultPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BDelegatingContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionContainer;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;
import org.eclipse.b3.backend.evaluator.b3backend.BIfExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInstanceContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BMapEntry;
import org.eclipse.b3.backend.evaluator.b3backend.BNamePredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BOrExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterizedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPatternLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySetOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSimplePatternExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSystemContext;
import org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTryExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWrappingContext;
import org.eclipse.b3.backend.evaluator.b3backend.ExecutionMode;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.INamedValue;
import org.eclipse.b3.backend.evaluator.b3backend.ITypedValue;
import org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer;
import org.eclipse.b3.backend.evaluator.b3backend.Visibility;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import com.google.inject.Injector;
import java.lang.CharSequence;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage
 * @generated
 */
public class B3backendValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final B3backendValidator INSTANCE = new B3backendValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic
	 * {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.b3.backend.evaluator.b3backend";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Unreachable Case' of 'BSwitch Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * Custom constants
	 * 
	 * @generated NOT
	 */
	public static final int BSWITCH_EXPRESSION__HAS_UNREACHABLE_CASE__OFFENDER = GENERATED_DIAGNOSTIC_CODE_COUNT + 1;

	public static final int HANDWRITTEN_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public B3backendValidator() {
		super();
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3EngineException(B3EngineException b3EngineException, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3ExpressionCache(B3ExpressionCache b3ExpressionCache, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3Function(B3Function b3Function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b3Function, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3FunctionType(B3FunctionType b3FunctionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b3FunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3FuncTypeVariable(B3FuncTypeVariable b3FuncTypeVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b3FuncTypeVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3JavaImport(B3JavaImport b3JavaImport, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b3JavaImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3MetaClass(B3MetaClass b3MetaClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b3MetaClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateB3ParameterizedType(B3ParameterizedType b3ParameterizedType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: B3ParameterizedType has a non EObject feature somewhere (sometimes)
		// return validate_EveryDefaultConstraint(b3ParameterizedType, diagnostics, context);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3Type(B3Type b3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b3Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateB3WildcardType(B3WildcardType b3WildcardType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(b3WildcardType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBAdvice(BAdvice bAdvice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bAdvice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBAndExpression(BAndExpression bAndExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bAndExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBAssignmentExpression(BAssignmentExpression bAssignmentExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bAssignmentExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBAtExpression(BAtExpression bAtExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bAtExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBBinaryExpression(BBinaryExpression bBinaryExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bBinaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBBinaryOpExpression(BBinaryOpExpression bBinaryOpExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bBinaryOpExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCachedExpression(BCachedExpression bCachedExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCachedExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCallExpression(BCallExpression bCallExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCallExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCallFeature(BCallFeature bCallFeature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCallFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCallFunction(BCallFunction bCallFunction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCallFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCallNamedFunction(BCallNamedFunction bCallNamedFunction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCallNamedFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCase(BCase bCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCatch(BCatch bCatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCatch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBChainedExpression(BChainedExpression bChainedExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bChainedExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBConcern(BConcern bConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bConcern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBConcernContext(BConcernContext bConcernContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bConcernContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBConditionalPropertyOperation(BConditionalPropertyOperation bConditionalPropertyOperation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bConditionalPropertyOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBContext(BContext bContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBCreateExpression(BCreateExpression bCreateExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bCreateExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBDefaultPropertySet(BDefaultPropertySet bDefaultPropertySet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bDefaultPropertySet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBDefProperty(BDefProperty bDefProperty, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bDefProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBDefValue(BDefValue bDefValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bDefValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBDelegatingContext(BDelegatingContext bDelegatingContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bDelegatingContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBEchoExpression(BEchoExpression bEchoExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bEchoExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBExecutionContext(BExecutionContext bExecutionContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bExecutionContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBExpression(BExpression bExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBExpressionWrapper(BExpressionWrapper bExpressionWrapper, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bExpressionWrapper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBFeatureExpression(BFeatureExpression bFeatureExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bFeatureExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBFunction(BFunction bFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBFunctionConcernContext(BFunctionConcernContext bFunctionConcernContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bFunctionConcernContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBFunctionContainer(BFunctionContainer bFunctionContainer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bFunctionContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBFunctionNamePredicate(BFunctionNamePredicate bFunctionNamePredicate,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bFunctionNamePredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBFunctionWrapper(BFunctionWrapper bFunctionWrapper, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bFunctionWrapper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBGuard(BGuard bGuard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bGuard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBIfExpression(BIfExpression bIfExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bIfExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBInnerContext(BInnerContext bInnerContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bInnerContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBInstanceContext(BInstanceContext bInstanceContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bInstanceContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBInvocationContext(BInvocationContext bInvocationContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bInvocationContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBJavaCallType(BJavaCallType bJavaCallType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBJavaFunction(BJavaFunction bJavaFunction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bJavaFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBLiteralAny(BLiteralAny bLiteralAny, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bLiteralAny, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBLiteralExpression(BLiteralExpression bLiteralExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bLiteralExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBLiteralListExpression(BLiteralListExpression bLiteralListExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bLiteralListExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBLiteralMapExpression(BLiteralMapExpression bLiteralMapExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bLiteralMapExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBLiteralType(BLiteralType bLiteralType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bLiteralType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBMapEntry(BMapEntry bMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBNamePredicate(BNamePredicate bNamePredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bNamePredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBOrExpression(BOrExpression bOrExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bOrExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBParameter(BParameter bParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBParameterDeclaration(BParameterDeclaration bParameterDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bParameterDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBParameterizedExpression(BParameterizedExpression bParameterizedExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bParameterizedExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBParameterList(BParameterList bParameterList, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bParameterList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBParameterPredicate(BParameterPredicate bParameterPredicate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bParameterPredicate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBPatternLiteralExpression(BPatternLiteralExpression bPatternLiteralExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bPatternLiteralExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBProceedExpression(BProceedExpression bProceedExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bProceedExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBPropertyDefinitionOperation(BPropertyDefinitionOperation bPropertyDefinitionOperation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bPropertyDefinitionOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBPropertyOperation(BPropertyOperation bPropertyOperation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bPropertyOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBPropertySet(BPropertySet bPropertySet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bPropertySet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBPropertySetOperation(BPropertySetOperation bPropertySetOperation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bPropertySetOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBRegularExpression(BRegularExpression bRegularExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bRegularExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBSimplePatternExpression(BSimplePatternExpression bSimplePatternExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bSimplePatternExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBSwitchExpression(BSwitchExpression bSwitchExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if(!validate_NoCircularContainment(bSwitchExpression, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryDataValueConforms(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryProxyResolves(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_UniqueID(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryKeyUnique(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(bSwitchExpression, diagnostics, context);
		if(result || diagnostics != null)
			result &= validateBSwitchExpression_hasUnreachableCase(bSwitchExpression, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasUnreachableCase constraint of '<em>BSwitch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBSwitchExpression_hasUnreachableCase(BSwitchExpression bSwitchExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bSwitchExpression.hasUnreachableCase(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBSystemContext(BSystemContext bSystemContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bSystemContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBTemplate(BTemplate bTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBThrowExpression(BThrowExpression bThrowExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bThrowExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBTryExpression(BTryExpression bTryExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bTryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBTypeCalculator(BTypeCalculator bTypeCalculator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bTypeCalculator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBUnaryExpression(BUnaryExpression bUnaryExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bUnaryExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBUnaryOpExpression(BUnaryOpExpression bUnaryOpExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bUnaryOpExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBUnaryPostOpExpression(BUnaryPostOpExpression bUnaryPostOpExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bUnaryPostOpExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBUnaryPreOpExpression(BUnaryPreOpExpression bUnaryPreOpExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bUnaryPreOpExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBVariableExpression(BVariableExpression bVariableExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bVariableExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBWithContextExpression(BWithContextExpression bWithContextExpression,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bWithContextExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBWithExpression(BWithExpression bWithExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bWithExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBWrappingContext(BWrappingContext bWrappingContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bWrappingContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCharSequence(CharSequence charSequence, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCoreException(CoreException coreException, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateExecutionMode(ExecutionMode executionMode, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFuncStore(B3FuncStore funcStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIFunction(IFunction iFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIGenericDeclaration(GenericDeclaration iGenericDeclaration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) iGenericDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateINamedValue(INamedValue iNamedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iNamedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInjector(Injector injector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIParameterizedType(ParameterizedType iParameterizedType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) iParameterizedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIProgressMonitor(IProgressMonitor iProgressMonitor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIType(Type iType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) iType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateITypedValue(ITypedValue iTypedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iTypedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateITypedValueContainer(ITypedValueContainer iTypedValueContainer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iTypedValueContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateITypeVariable(TypeVariable<?> iTypeVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) iTypeVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIVarName(IVarName iVarName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iVarName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateIWildcardType(WildcardType iWildcardType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject) iWildcardType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateJavaIterator(Iterator<?> javaIterator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLValue(LValue lValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateObjectArray(Object[] objectArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRegexpPattern(Pattern regexpPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSimplePattern(SimplePattern simplePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStringArray(String[] stringArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateThrowable(Throwable throwable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTypeArray(Type[] typeArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTypeVariableArray(TypeVariable[] typeVariableArray, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateURI(URI uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateValueMap(ValueMap valueMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVisibility(Visibility visibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return B3backendPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch(classifierID) {
			case B3backendPackage.BEXPRESSION:
				return validateBExpression((BExpression) value, diagnostics, context);
			case B3backendPackage.BEXECUTION_CONTEXT:
				return validateBExecutionContext((BExecutionContext) value, diagnostics, context);
			case B3backendPackage.BIF_EXPRESSION:
				return validateBIfExpression((BIfExpression) value, diagnostics, context);
			case B3backendPackage.BSWITCH_EXPRESSION:
				return validateBSwitchExpression((BSwitchExpression) value, diagnostics, context);
			case B3backendPackage.BCASE:
				return validateBCase((BCase) value, diagnostics, context);
			case B3backendPackage.BTRY_EXPRESSION:
				return validateBTryExpression((BTryExpression) value, diagnostics, context);
			case B3backendPackage.BCATCH:
				return validateBCatch((BCatch) value, diagnostics, context);
			case B3backendPackage.BBINARY_EXPRESSION:
				return validateBBinaryExpression((BBinaryExpression) value, diagnostics, context);
			case B3backendPackage.BOR_EXPRESSION:
				return validateBOrExpression((BOrExpression) value, diagnostics, context);
			case B3backendPackage.BAND_EXPRESSION:
				return validateBAndExpression((BAndExpression) value, diagnostics, context);
			case B3backendPackage.BCHAINED_EXPRESSION:
				return validateBChainedExpression((BChainedExpression) value, diagnostics, context);
			case B3backendPackage.BUNARY_EXPRESSION:
				return validateBUnaryExpression((BUnaryExpression) value, diagnostics, context);
			case B3backendPackage.BTHROW_EXPRESSION:
				return validateBThrowExpression((BThrowExpression) value, diagnostics, context);
			case B3backendPackage.BUNARY_OP_EXPRESSION:
				return validateBUnaryOpExpression((BUnaryOpExpression) value, diagnostics, context);
			case B3backendPackage.BUNARY_POST_OP_EXPRESSION:
				return validateBUnaryPostOpExpression((BUnaryPostOpExpression) value, diagnostics, context);
			case B3backendPackage.BBINARY_OP_EXPRESSION:
				return validateBBinaryOpExpression((BBinaryOpExpression) value, diagnostics, context);
			case B3backendPackage.BCACHED_EXPRESSION:
				return validateBCachedExpression((BCachedExpression) value, diagnostics, context);
			case B3backendPackage.BLITERAL_EXPRESSION:
				return validateBLiteralExpression((BLiteralExpression) value, diagnostics, context);
			case B3backendPackage.BLITERAL_LIST_EXPRESSION:
				return validateBLiteralListExpression((BLiteralListExpression) value, diagnostics, context);
			case B3backendPackage.BLITERAL_MAP_EXPRESSION:
				return validateBLiteralMapExpression((BLiteralMapExpression) value, diagnostics, context);
			case B3backendPackage.BMAP_ENTRY:
				return validateBMapEntry((BMapEntry) value, diagnostics, context);
			case B3backendPackage.BFEATURE_EXPRESSION:
				return validateBFeatureExpression((BFeatureExpression) value, diagnostics, context);
			case B3backendPackage.BAT_EXPRESSION:
				return validateBAtExpression((BAtExpression) value, diagnostics, context);
			case B3backendPackage.BVARIABLE_EXPRESSION:
				return validateBVariableExpression((BVariableExpression) value, diagnostics, context);
			case B3backendPackage.BCALL_EXPRESSION:
				return validateBCallExpression((BCallExpression) value, diagnostics, context);
			case B3backendPackage.BPARAMETERIZED_EXPRESSION:
				return validateBParameterizedExpression((BParameterizedExpression) value, diagnostics, context);
			case B3backendPackage.BLITERAL_ANY:
				return validateBLiteralAny((BLiteralAny) value, diagnostics, context);
			case B3backendPackage.BCREATE_EXPRESSION:
				return validateBCreateExpression((BCreateExpression) value, diagnostics, context);
			case B3backendPackage.IFUNCTION:
				return validateIFunction((IFunction) value, diagnostics, context);
			case B3backendPackage.BGUARD:
				return validateBGuard((BGuard) value, diagnostics, context);
			case B3backendPackage.BSYSTEM_CONTEXT:
				return validateBSystemContext((BSystemContext) value, diagnostics, context);
			case B3backendPackage.BCONTEXT:
				return validateBContext((BContext) value, diagnostics, context);
			case B3backendPackage.BINNER_CONTEXT:
				return validateBInnerContext((BInnerContext) value, diagnostics, context);
			case B3backendPackage.BINVOCATION_CONTEXT:
				return validateBInvocationContext((BInvocationContext) value, diagnostics, context);
			case B3backendPackage.BUNARY_PRE_OP_EXPRESSION:
				return validateBUnaryPreOpExpression((BUnaryPreOpExpression) value, diagnostics, context);
			case B3backendPackage.BASSIGNMENT_EXPRESSION:
				return validateBAssignmentExpression((BAssignmentExpression) value, diagnostics, context);
			case B3backendPackage.B3_FUNCTION:
				return validateB3Function((B3Function) value, diagnostics, context);
			case B3backendPackage.BJAVA_FUNCTION:
				return validateBJavaFunction((BJavaFunction) value, diagnostics, context);
			case B3backendPackage.BFUNCTION_CONTAINER:
				return validateBFunctionContainer((BFunctionContainer) value, diagnostics, context);
			case B3backendPackage.BDEF_VALUE:
				return validateBDefValue((BDefValue) value, diagnostics, context);
			case B3backendPackage.BREGULAR_EXPRESSION:
				return validateBRegularExpression((BRegularExpression) value, diagnostics, context);
			case B3backendPackage.BPARAMETER_LIST:
				return validateBParameterList((BParameterList) value, diagnostics, context);
			case B3backendPackage.BPARAMETER:
				return validateBParameter((BParameter) value, diagnostics, context);
			case B3backendPackage.BPARAMETER_DECLARATION:
				return validateBParameterDeclaration((BParameterDeclaration) value, diagnostics, context);
			case B3backendPackage.ITYPE:
				return validateIType((Type) value, diagnostics, context);
			case B3backendPackage.B3_FUNCTION_TYPE:
				return validateB3FunctionType((B3FunctionType) value, diagnostics, context);
			case B3backendPackage.IPARAMETERIZED_TYPE:
				return validateIParameterizedType((ParameterizedType) value, diagnostics, context);
			case B3backendPackage.IGENERIC_DECLARATION:
				return validateIGenericDeclaration((GenericDeclaration) value, diagnostics, context);
			case B3backendPackage.B3_PARAMETERIZED_TYPE:
				return validateB3ParameterizedType((B3ParameterizedType) value, diagnostics, context);
			case B3backendPackage.IWILDCARD_TYPE:
				return validateIWildcardType((WildcardType) value, diagnostics, context);
			case B3backendPackage.B3_WILDCARD_TYPE:
				return validateB3WildcardType((B3WildcardType) value, diagnostics, context);
			case B3backendPackage.ITYPE_VARIABLE:
				return validateITypeVariable((TypeVariable<?>) value, diagnostics, context);
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE:
				return validateB3FuncTypeVariable((B3FuncTypeVariable) value, diagnostics, context);
			case B3backendPackage.B3_JAVA_IMPORT:
				return validateB3JavaImport((B3JavaImport) value, diagnostics, context);
			case B3backendPackage.BLITERAL_TYPE:
				return validateBLiteralType((BLiteralType) value, diagnostics, context);
			case B3backendPackage.BTYPE_CALCULATOR:
				return validateBTypeCalculator((BTypeCalculator) value, diagnostics, context);
			case B3backendPackage.BINSTANCE_CONTEXT:
				return validateBInstanceContext((BInstanceContext) value, diagnostics, context);
			case B3backendPackage.BDEF_PROPERTY:
				return validateBDefProperty((BDefProperty) value, diagnostics, context);
			case B3backendPackage.BPROPERTY_SET:
				return validateBPropertySet((BPropertySet) value, diagnostics, context);
			case B3backendPackage.BDEFAULT_PROPERTY_SET:
				return validateBDefaultPropertySet((BDefaultPropertySet) value, diagnostics, context);
			case B3backendPackage.BPROPERTY_OPERATION:
				return validateBPropertyOperation((BPropertyOperation) value, diagnostics, context);
			case B3backendPackage.BPROPERTY_DEFINITION_OPERATION:
				return validateBPropertyDefinitionOperation((BPropertyDefinitionOperation) value, diagnostics, context);
			case B3backendPackage.BCONDITIONAL_PROPERTY_OPERATION:
				return validateBConditionalPropertyOperation(
					(BConditionalPropertyOperation) value, diagnostics, context);
			case B3backendPackage.BPROPERTY_SET_OPERATION:
				return validateBPropertySetOperation((BPropertySetOperation) value, diagnostics, context);
			case B3backendPackage.BADVICE:
				return validateBAdvice((BAdvice) value, diagnostics, context);
			case B3backendPackage.BCONCERN:
				return validateBConcern((BConcern) value, diagnostics, context);
			case B3backendPackage.BWITH_EXPRESSION:
				return validateBWithExpression((BWithExpression) value, diagnostics, context);
			case B3backendPackage.BCONCERN_CONTEXT:
				return validateBConcernContext((BConcernContext) value, diagnostics, context);
			case B3backendPackage.BFUNCTION:
				return validateBFunction((BFunction) value, diagnostics, context);
			case B3backendPackage.BFUNCTION_WRAPPER:
				return validateBFunctionWrapper((BFunctionWrapper) value, diagnostics, context);
			case B3backendPackage.BNAME_PREDICATE:
				return validateBNamePredicate((BNamePredicate) value, diagnostics, context);
			case B3backendPackage.BFUNCTION_NAME_PREDICATE:
				return validateBFunctionNamePredicate((BFunctionNamePredicate) value, diagnostics, context);
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT:
				return validateBFunctionConcernContext((BFunctionConcernContext) value, diagnostics, context);
			case B3backendPackage.BPARAMETER_PREDICATE:
				return validateBParameterPredicate((BParameterPredicate) value, diagnostics, context);
			case B3backendPackage.BPROCEED_EXPRESSION:
				return validateBProceedExpression((BProceedExpression) value, diagnostics, context);
			case B3backendPackage.BDELEGATING_CONTEXT:
				return validateBDelegatingContext((BDelegatingContext) value, diagnostics, context);
			case B3backendPackage.BWRAPPING_CONTEXT:
				return validateBWrappingContext((BWrappingContext) value, diagnostics, context);
			case B3backendPackage.B3_META_CLASS:
				return validateB3MetaClass((B3MetaClass) value, diagnostics, context);
			case B3backendPackage.BEXPRESSION_WRAPPER:
				return validateBExpressionWrapper((BExpressionWrapper) value, diagnostics, context);
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION:
				return validateBWithContextExpression((BWithContextExpression) value, diagnostics, context);
			case B3backendPackage.ITYPED_VALUE_CONTAINER:
				return validateITypedValueContainer((ITypedValueContainer) value, diagnostics, context);
			case B3backendPackage.BCALL_FEATURE:
				return validateBCallFeature((BCallFeature) value, diagnostics, context);
			case B3backendPackage.BCALL_NAMED_FUNCTION:
				return validateBCallNamedFunction((BCallNamedFunction) value, diagnostics, context);
			case B3backendPackage.BCALL_FUNCTION:
				return validateBCallFunction((BCallFunction) value, diagnostics, context);
			case B3backendPackage.BPATTERN_LITERAL_EXPRESSION:
				return validateBPatternLiteralExpression((BPatternLiteralExpression) value, diagnostics, context);
			case B3backendPackage.BSIMPLE_PATTERN_EXPRESSION:
				return validateBSimplePatternExpression((BSimplePatternExpression) value, diagnostics, context);
			case B3backendPackage.INAMED_VALUE:
				return validateINamedValue((INamedValue) value, diagnostics, context);
			case B3backendPackage.B3_TYPE:
				return validateB3Type((B3Type) value, diagnostics, context);
			case B3backendPackage.ITYPED_VALUE:
				return validateITypedValue((ITypedValue) value, diagnostics, context);
			case B3backendPackage.IVAR_NAME:
				return validateIVarName((IVarName) value, diagnostics, context);
			case B3backendPackage.BTEMPLATE:
				return validateBTemplate((BTemplate) value, diagnostics, context);
			case B3backendPackage.BECHO_EXPRESSION:
				return validateBEchoExpression((BEchoExpression) value, diagnostics, context);
			case B3backendPackage.VISIBILITY:
				return validateVisibility((Visibility) value, diagnostics, context);
			case B3backendPackage.EXECUTION_MODE:
				return validateExecutionMode((ExecutionMode) value, diagnostics, context);
			case B3backendPackage.BJAVA_CALL_TYPE:
				return validateBJavaCallType((BJavaCallType) value, diagnostics, context);
			case B3backendPackage.CORE_EXCEPTION:
				return validateCoreException((CoreException) value, diagnostics, context);
			case B3backendPackage.TYPE:
				return validateType((Type) value, diagnostics, context);
			case B3backendPackage.OBJECT_ARRAY:
				return validateObjectArray((Object[]) value, diagnostics, context);
			case B3backendPackage.VALUE_MAP:
				return validateValueMap((ValueMap) value, diagnostics, context);
			case B3backendPackage.B3_ENGINE_EXCEPTION:
				return validateB3EngineException((B3EngineException) value, diagnostics, context);
			case B3backendPackage.B3_EXPRESSION_CACHE:
				return validateB3ExpressionCache((B3ExpressionCache) value, diagnostics, context);
			case B3backendPackage.THROWABLE:
				return validateThrowable((Throwable) value, diagnostics, context);
			case B3backendPackage.LVALUE:
				return validateLValue((LValue) value, diagnostics, context);
			case B3backendPackage.TYPE_ARRAY:
				return validateTypeArray((Type[]) value, diagnostics, context);
			case B3backendPackage.METHOD:
				return validateMethod((Method) value, diagnostics, context);
			case B3backendPackage.TYPE_VARIABLE_ARRAY:
				return validateTypeVariableArray((TypeVariable[]) value, diagnostics, context);
			case B3backendPackage.FUNC_STORE:
				return validateFuncStore((B3FuncStore) value, diagnostics, context);
			case B3backendPackage.REGEXP_PATTERN:
				return validateRegexpPattern((Pattern) value, diagnostics, context);
			case B3backendPackage.STRING_ARRAY:
				return validateStringArray((String[]) value, diagnostics, context);
			case B3backendPackage.JAVA_ITERATOR:
				return validateJavaIterator((Iterator<?>) value, diagnostics, context);
			case B3backendPackage.URI:
				return validateURI((URI) value, diagnostics, context);
			case B3backendPackage.IPROGRESS_MONITOR:
				return validateIProgressMonitor((IProgressMonitor) value, diagnostics, context);
			case B3backendPackage.SIMPLE_PATTERN:
				return validateSimplePattern((SimplePattern) value, diagnostics, context);
			case B3backendPackage.CHAR_SEQUENCE:
				return validateCharSequence((CharSequence) value, diagnostics, context);
			case B3backendPackage.INJECTOR:
				return validateInjector((Injector) value, diagnostics, context);
			default:
				return true;
		}
	}

} // B3backendValidator
