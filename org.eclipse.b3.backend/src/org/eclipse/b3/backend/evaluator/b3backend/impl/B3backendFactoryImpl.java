/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.eclipse.b3.backend.core.B3DynamicClassLoader;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3FuncStore;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.core.ValueMap;
import org.eclipse.b3.backend.evaluator.b3backend.*;

import org.eclipse.core.runtime.CoreException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3backendFactoryImpl extends EFactoryImpl implements B3backendFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static B3backendFactory init() {
		try {
			B3backendFactory theB3backendFactory = (B3backendFactory)EPackage.Registry.INSTANCE.getEFactory("http://b3backend/1.0"); 
			if (theB3backendFactory != null) {
				return theB3backendFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new B3backendFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3backendFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case B3backendPackage.BLINE_REFERENCE: return createBLineReference();
			case B3backendPackage.BIF_EXPRESSION: return createBIfExpression();
			case B3backendPackage.BSWITCH_EXPRESSION: return createBSwitchExpression();
			case B3backendPackage.BCASE: return createBCase();
			case B3backendPackage.BTRY_EXPRESSION: return createBTryExpression();
			case B3backendPackage.BCATCH: return createBCatch();
			case B3backendPackage.BOR_EXPRESSION: return createBOrExpression();
			case B3backendPackage.BAND_EXPRESSION: return createBAndExpression();
			case B3backendPackage.BCHAINED_EXPRESSION: return createBChainedExpression();
			case B3backendPackage.BTHROW_EXPRESSION: return createBThrowExpression();
			case B3backendPackage.BUNARY_OP_EXPRESSION: return createBUnaryOpExpression();
			case B3backendPackage.BUNARY_POST_OP_EXPRESSION: return createBUnaryPostOpExpression();
			case B3backendPackage.BBINARY_OP_EXPRESSION: return createBBinaryOpExpression();
			case B3backendPackage.BCACHED_EXPRESSION: return createBCachedExpression();
			case B3backendPackage.BLITERAL_EXPRESSION: return createBLiteralExpression();
			case B3backendPackage.BLITERAL_LIST_EXPRESSION: return createBLiteralListExpression();
			case B3backendPackage.BLITERAL_MAP_EXPRESSION: return createBLiteralMapExpression();
			case B3backendPackage.BMAP_ENTRY: return createBMapEntry();
			case B3backendPackage.BFEATURE_EXPRESSION: return createBFeatureExpression();
			case B3backendPackage.BAT_EXPRESSION: return createBAtExpression();
			case B3backendPackage.BVARIABLE_EXPRESSION: return createBVariableExpression();
			case B3backendPackage.BCALL_EXPRESSION: return createBCallExpression();
			case B3backendPackage.BLITERAL_ANY: return createBLiteralAny();
			case B3backendPackage.BCREATE_EXPRESSION: return createBCreateExpression();
			case B3backendPackage.BGUARD_EXPRESSION: return createBGuardExpression();
			case B3backendPackage.BSYSTEM_CONTEXT: return createBSystemContext();
			case B3backendPackage.BCONTEXT: return createBContext();
			case B3backendPackage.BINNER_CONTEXT: return createBInnerContext();
			case B3backendPackage.BINVOCATION_CONTEXT: return createBInvocationContext();
			case B3backendPackage.BUNARY_PRE_OP_EXPRESSION: return createBUnaryPreOpExpression();
			case B3backendPackage.BASSIGNMENT_EXPRESSION: return createBAssignmentExpression();
			case B3backendPackage.B3_FUNCTION: return createB3Function();
			case B3backendPackage.BJAVA_FUNCTION: return createBJavaFunction();
			case B3backendPackage.BDEF_VALUE: return createBDefValue();
			case B3backendPackage.BREGULAR_EXPRESSION: return createBRegularExpression();
			case B3backendPackage.BPARAMETER_LIST: return createBParameterList();
			case B3backendPackage.BPARAMETER: return createBParameter();
			case B3backendPackage.BPARAMETER_DECLARATION: return createBParameterDeclaration();
			case B3backendPackage.B3_FUNCTION_TYPE: return createB3FunctionType();
			case B3backendPackage.B3_PARAMETERIZED_TYPE: return createB3ParameterizedType();
			case B3backendPackage.B3_WILDCARD_TYPE: return createB3WildcardType();
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE: return createB3FuncTypeVariable();
			case B3backendPackage.B3_JAVA_IMPORT: return createB3JavaImport();
			case B3backendPackage.BLITERAL_TYPE: return createBLiteralType();
			case B3backendPackage.BGUARD_FUNCTION: return createBGuardFunction();
			case B3backendPackage.BTYPE_CALCULATOR: return createBTypeCalculator();
			case B3backendPackage.BTYPE_CALCULATOR_FUNCTION: return createBTypeCalculatorFunction();
			case B3backendPackage.BINSTANCE_CONTEXT: return createBInstanceContext();
			case B3backendPackage.BDEF_PROPERTY: return createBDefProperty();
			case B3backendPackage.BPROPERTY_SET: return createBPropertySet();
			case B3backendPackage.BDEFAULT_PROPERTY_SET: return createBDefaultPropertySet();
			case B3backendPackage.BPROPERTY_DEFINITION_OPERATION: return createBPropertyDefinitionOperation();
			case B3backendPackage.BCONDITIONAL_PROPERTY_OPERATION: return createBConditionalPropertyOperation();
			case B3backendPackage.BPROPERTY_SET_OPERATION: return createBPropertySetOperation();
			case B3backendPackage.BADVICE: return createBAdvice();
			case B3backendPackage.BCONCERN: return createBConcern();
			case B3backendPackage.BWITH_EXPRESSION: return createBWithExpression();
			case B3backendPackage.BFUNCTION: return createBFunction();
			case B3backendPackage.BFUNCTION_WRAPPER: return createBFunctionWrapper();
			case B3backendPackage.BNAME_PREDICATE: return createBNamePredicate();
			case B3backendPackage.BFUNCTION_NAME_PREDICATE: return createBFunctionNamePredicate();
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT: return createBFunctionConcernContext();
			case B3backendPackage.BPARAMETER_PREDICATE: return createBParameterPredicate();
			case B3backendPackage.BPROCEED_EXPRESSION: return createBProceedExpression();
			case B3backendPackage.BDELEGATING_CONTEXT: return createBDelegatingContext();
			case B3backendPackage.BWRAPPING_CONTEXT: return createBWrappingContext();
			case B3backendPackage.B3_META_CLASS: return createB3MetaClass();
			case B3backendPackage.BEXPRESSION_WRAPPER: return createBExpressionWrapper();
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION: return createBWithContextExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case B3backendPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case B3backendPackage.EXECUTION_MODE:
				return createExecutionModeFromString(eDataType, initialValue);
			case B3backendPackage.BJAVA_CALL_TYPE:
				return createBJavaCallTypeFromString(eDataType, initialValue);
			case B3backendPackage.CORE_EXCEPTION:
				return createCoreExceptionFromString(eDataType, initialValue);
			case B3backendPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case B3backendPackage.OBJECT_ARRAY:
				return createObjectArrayFromString(eDataType, initialValue);
			case B3backendPackage.VALUE_MAP:
				return createValueMapFromString(eDataType, initialValue);
			case B3backendPackage.B3_ENGINE_EXCEPTION:
				return createB3EngineExceptionFromString(eDataType, initialValue);
			case B3backendPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			case B3backendPackage.LVALUE:
				return createLValueFromString(eDataType, initialValue);
			case B3backendPackage.TYPE_ARRAY:
				return createTypeArrayFromString(eDataType, initialValue);
			case B3backendPackage.METHOD:
				return createMethodFromString(eDataType, initialValue);
			case B3backendPackage.TYPE_VARIABLE_ARRAY:
				return createTypeVariableArrayFromString(eDataType, initialValue);
			case B3backendPackage.FUNC_STORE:
				return createFuncStoreFromString(eDataType, initialValue);
			case B3backendPackage.REGEXP_PATTERN:
				return createRegexpPatternFromString(eDataType, initialValue);
			case B3backendPackage.STRING_ARRAY:
				return createStringArrayFromString(eDataType, initialValue);
			case B3backendPackage.B3_DYNAMIC_CLASS_LOADER:
				return createB3DynamicClassLoaderFromString(eDataType, initialValue);
			case B3backendPackage.JAVA_ITERATOR:
				return createJavaIteratorFromString(eDataType, initialValue);
			case B3backendPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case B3backendPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case B3backendPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case B3backendPackage.EXECUTION_MODE:
				return convertExecutionModeToString(eDataType, instanceValue);
			case B3backendPackage.BJAVA_CALL_TYPE:
				return convertBJavaCallTypeToString(eDataType, instanceValue);
			case B3backendPackage.CORE_EXCEPTION:
				return convertCoreExceptionToString(eDataType, instanceValue);
			case B3backendPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case B3backendPackage.OBJECT_ARRAY:
				return convertObjectArrayToString(eDataType, instanceValue);
			case B3backendPackage.VALUE_MAP:
				return convertValueMapToString(eDataType, instanceValue);
			case B3backendPackage.B3_ENGINE_EXCEPTION:
				return convertB3EngineExceptionToString(eDataType, instanceValue);
			case B3backendPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			case B3backendPackage.LVALUE:
				return convertLValueToString(eDataType, instanceValue);
			case B3backendPackage.TYPE_ARRAY:
				return convertTypeArrayToString(eDataType, instanceValue);
			case B3backendPackage.METHOD:
				return convertMethodToString(eDataType, instanceValue);
			case B3backendPackage.TYPE_VARIABLE_ARRAY:
				return convertTypeVariableArrayToString(eDataType, instanceValue);
			case B3backendPackage.FUNC_STORE:
				return convertFuncStoreToString(eDataType, instanceValue);
			case B3backendPackage.REGEXP_PATTERN:
				return convertRegexpPatternToString(eDataType, instanceValue);
			case B3backendPackage.STRING_ARRAY:
				return convertStringArrayToString(eDataType, instanceValue);
			case B3backendPackage.B3_DYNAMIC_CLASS_LOADER:
				return convertB3DynamicClassLoaderToString(eDataType, instanceValue);
			case B3backendPackage.JAVA_ITERATOR:
				return convertJavaIteratorToString(eDataType, instanceValue);
			case B3backendPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case B3backendPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLineReference createBLineReference() {
		BLineReferenceImpl bLineReference = new BLineReferenceImpl();
		return bLineReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIfExpression createBIfExpression() {
		BIfExpressionImpl bIfExpression = new BIfExpressionImpl();
		return bIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSwitchExpression createBSwitchExpression() {
		BSwitchExpressionImpl bSwitchExpression = new BSwitchExpressionImpl();
		return bSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCase createBCase() {
		BCaseImpl bCase = new BCaseImpl();
		return bCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTryExpression createBTryExpression() {
		BTryExpressionImpl bTryExpression = new BTryExpressionImpl();
		return bTryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCatch createBCatch() {
		BCatchImpl bCatch = new BCatchImpl();
		return bCatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOrExpression createBOrExpression() {
		BOrExpressionImpl bOrExpression = new BOrExpressionImpl();
		return bOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAndExpression createBAndExpression() {
		BAndExpressionImpl bAndExpression = new BAndExpressionImpl();
		return bAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BChainedExpression createBChainedExpression() {
		BChainedExpressionImpl bChainedExpression = new BChainedExpressionImpl();
		return bChainedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BThrowExpression createBThrowExpression() {
		BThrowExpressionImpl bThrowExpression = new BThrowExpressionImpl();
		return bThrowExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUnaryOpExpression createBUnaryOpExpression() {
		BUnaryOpExpressionImpl bUnaryOpExpression = new BUnaryOpExpressionImpl();
		return bUnaryOpExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUnaryPostOpExpression createBUnaryPostOpExpression() {
		BUnaryPostOpExpressionImpl bUnaryPostOpExpression = new BUnaryPostOpExpressionImpl();
		return bUnaryPostOpExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBinaryOpExpression createBBinaryOpExpression() {
		BBinaryOpExpressionImpl bBinaryOpExpression = new BBinaryOpExpressionImpl();
		return bBinaryOpExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCachedExpression createBCachedExpression() {
		BCachedExpressionImpl bCachedExpression = new BCachedExpressionImpl();
		return bCachedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralExpression createBLiteralExpression() {
		BLiteralExpressionImpl bLiteralExpression = new BLiteralExpressionImpl();
		return bLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralListExpression createBLiteralListExpression() {
		BLiteralListExpressionImpl bLiteralListExpression = new BLiteralListExpressionImpl();
		return bLiteralListExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralMapExpression createBLiteralMapExpression() {
		BLiteralMapExpressionImpl bLiteralMapExpression = new BLiteralMapExpressionImpl();
		return bLiteralMapExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMapEntry createBMapEntry() {
		BMapEntryImpl bMapEntry = new BMapEntryImpl();
		return bMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFeatureExpression createBFeatureExpression() {
		BFeatureExpressionImpl bFeatureExpression = new BFeatureExpressionImpl();
		return bFeatureExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAtExpression createBAtExpression() {
		BAtExpressionImpl bAtExpression = new BAtExpressionImpl();
		return bAtExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BVariableExpression createBVariableExpression() {
		BVariableExpressionImpl bVariableExpression = new BVariableExpressionImpl();
		return bVariableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCallExpression createBCallExpression() {
		BCallExpressionImpl bCallExpression = new BCallExpressionImpl();
		return bCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralAny createBLiteralAny() {
		BLiteralAnyImpl bLiteralAny = new BLiteralAnyImpl();
		return bLiteralAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCreateExpression createBCreateExpression() {
		BCreateExpressionImpl bCreateExpression = new BCreateExpressionImpl();
		return bCreateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGuardExpression createBGuardExpression() {
		BGuardExpressionImpl bGuardExpression = new BGuardExpressionImpl();
		return bGuardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSystemContext createBSystemContext() {
		BSystemContextImpl bSystemContext = new BSystemContextImpl();
		return bSystemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BContext createBContext() {
		BContextImpl bContext = new BContextImpl();
		return bContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInnerContext createBInnerContext() {
		BInnerContextImpl bInnerContext = new BInnerContextImpl();
		return bInnerContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInvocationContext createBInvocationContext() {
		BInvocationContextImpl bInvocationContext = new BInvocationContextImpl();
		return bInvocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUnaryPreOpExpression createBUnaryPreOpExpression() {
		BUnaryPreOpExpressionImpl bUnaryPreOpExpression = new BUnaryPreOpExpressionImpl();
		return bUnaryPreOpExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAssignmentExpression createBAssignmentExpression() {
		BAssignmentExpressionImpl bAssignmentExpression = new BAssignmentExpressionImpl();
		return bAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3Function createB3Function() {
		B3FunctionImpl b3Function = new B3FunctionImpl();
		return b3Function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BJavaFunction createBJavaFunction() {
		BJavaFunctionImpl bJavaFunction = new BJavaFunctionImpl();
		return bJavaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDefValue createBDefValue() {
		BDefValueImpl bDefValue = new BDefValueImpl();
		return bDefValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRegularExpression createBRegularExpression() {
		BRegularExpressionImpl bRegularExpression = new BRegularExpressionImpl();
		return bRegularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BParameterList createBParameterList() {
		BParameterListImpl bParameterList = new BParameterListImpl();
		return bParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BParameter createBParameter() {
		BParameterImpl bParameter = new BParameterImpl();
		return bParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BParameterDeclaration createBParameterDeclaration() {
		BParameterDeclarationImpl bParameterDeclaration = new BParameterDeclarationImpl();
		return bParameterDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3FunctionType createB3FunctionType() {
		B3FunctionTypeImpl b3FunctionType = new B3FunctionTypeImpl();
		return b3FunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3ParameterizedType createB3ParameterizedType() {
		B3ParameterizedTypeImpl b3ParameterizedType = new B3ParameterizedTypeImpl();
		return b3ParameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3WildcardType createB3WildcardType() {
		B3WildcardTypeImpl b3WildcardType = new B3WildcardTypeImpl();
		return b3WildcardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3FuncTypeVariable createB3FuncTypeVariable() {
		B3FuncTypeVariableImpl b3FuncTypeVariable = new B3FuncTypeVariableImpl();
		return b3FuncTypeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3JavaImport createB3JavaImport() {
		B3JavaImportImpl b3JavaImport = new B3JavaImportImpl();
		return b3JavaImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralType createBLiteralType() {
		BLiteralTypeImpl bLiteralType = new BLiteralTypeImpl();
		return bLiteralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGuardFunction createBGuardFunction() {
		BGuardFunctionImpl bGuardFunction = new BGuardFunctionImpl();
		return bGuardFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTypeCalculator createBTypeCalculator() {
		BTypeCalculatorImpl bTypeCalculator = new BTypeCalculatorImpl();
		return bTypeCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTypeCalculatorFunction createBTypeCalculatorFunction() {
		BTypeCalculatorFunctionImpl bTypeCalculatorFunction = new BTypeCalculatorFunctionImpl();
		return bTypeCalculatorFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInstanceContext createBInstanceContext() {
		BInstanceContextImpl bInstanceContext = new BInstanceContextImpl();
		return bInstanceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDefProperty createBDefProperty() {
		BDefPropertyImpl bDefProperty = new BDefPropertyImpl();
		return bDefProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySet createBPropertySet() {
		BPropertySetImpl bPropertySet = new BPropertySetImpl();
		return bPropertySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDefaultPropertySet createBDefaultPropertySet() {
		BDefaultPropertySetImpl bDefaultPropertySet = new BDefaultPropertySetImpl();
		return bDefaultPropertySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertyDefinitionOperation createBPropertyDefinitionOperation() {
		BPropertyDefinitionOperationImpl bPropertyDefinitionOperation = new BPropertyDefinitionOperationImpl();
		return bPropertyDefinitionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BConditionalPropertyOperation createBConditionalPropertyOperation() {
		BConditionalPropertyOperationImpl bConditionalPropertyOperation = new BConditionalPropertyOperationImpl();
		return bConditionalPropertyOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPropertySetOperation createBPropertySetOperation() {
		BPropertySetOperationImpl bPropertySetOperation = new BPropertySetOperationImpl();
		return bPropertySetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAdvice createBAdvice() {
		BAdviceImpl bAdvice = new BAdviceImpl();
		return bAdvice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BConcern createBConcern() {
		BConcernImpl bConcern = new BConcernImpl();
		return bConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWithExpression createBWithExpression() {
		BWithExpressionImpl bWithExpression = new BWithExpressionImpl();
		return bWithExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunction createBFunction() {
		BFunctionImpl bFunction = new BFunctionImpl();
		return bFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionWrapper createBFunctionWrapper() {
		BFunctionWrapperImpl bFunctionWrapper = new BFunctionWrapperImpl();
		return bFunctionWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BNamePredicate createBNamePredicate() {
		BNamePredicateImpl bNamePredicate = new BNamePredicateImpl();
		return bNamePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionNamePredicate createBFunctionNamePredicate() {
		BFunctionNamePredicateImpl bFunctionNamePredicate = new BFunctionNamePredicateImpl();
		return bFunctionNamePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFunctionConcernContext createBFunctionConcernContext() {
		BFunctionConcernContextImpl bFunctionConcernContext = new BFunctionConcernContextImpl();
		return bFunctionConcernContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BParameterPredicate createBParameterPredicate() {
		BParameterPredicateImpl bParameterPredicate = new BParameterPredicateImpl();
		return bParameterPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BProceedExpression createBProceedExpression() {
		BProceedExpressionImpl bProceedExpression = new BProceedExpressionImpl();
		return bProceedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDelegatingContext createBDelegatingContext() {
		BDelegatingContextImpl bDelegatingContext = new BDelegatingContextImpl();
		return bDelegatingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWrappingContext createBWrappingContext() {
		BWrappingContextImpl bWrappingContext = new BWrappingContextImpl();
		return bWrappingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3MetaClass createB3MetaClass() {
		B3MetaClassImpl b3MetaClass = new B3MetaClassImpl();
		return b3MetaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpressionWrapper createBExpressionWrapper() {
		BExpressionWrapperImpl bExpressionWrapper = new BExpressionWrapperImpl();
		return bExpressionWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWithContextExpression createBWithContextExpression() {
		BWithContextExpressionImpl bWithContextExpression = new BWithContextExpressionImpl();
		return bWithContextExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionMode createExecutionModeFromString(EDataType eDataType, String initialValue) {
		ExecutionMode result = ExecutionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BJavaCallType createBJavaCallTypeFromString(EDataType eDataType, String initialValue) {
		BJavaCallType result = BJavaCallType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBJavaCallTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreException createCoreExceptionFromString(EDataType eDataType, String initialValue) {
		return (CoreException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoreExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		return (Type)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] createObjectArrayFromString(EDataType eDataType, String initialValue) {
		return (Object[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueMap createValueMapFromString(EDataType eDataType, String initialValue) {
		return (ValueMap)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3EngineException createB3EngineExceptionFromString(EDataType eDataType, String initialValue) {
		return (B3EngineException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertB3EngineExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LValue createLValueFromString(EDataType eDataType, String initialValue) {
		return (LValue)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLValueToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] createTypeArrayFromString(EDataType eDataType, String initialValue) {
		return (Type[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethodFromString(EDataType eDataType, String initialValue) {
		return (Method)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public TypeVariable[] createTypeVariableArrayFromString(EDataType eDataType, String initialValue) {
		return (TypeVariable[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeVariableArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3FuncStore createFuncStoreFromString(EDataType eDataType, String initialValue) {
		return (B3FuncStore)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFuncStoreToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createRegexpPatternFromString(EDataType eDataType, String initialValue) {
		return (Pattern)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegexpPatternToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
		return (String[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3DynamicClassLoader createB3DynamicClassLoaderFromString(EDataType eDataType, String initialValue) {
		return (B3DynamicClassLoader)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertB3DynamicClassLoaderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator<?> createJavaIteratorFromString(EDataType eDataType, String initialValue) {
		return (Iterator<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIteratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3backendPackage getB3backendPackage() {
		return (B3backendPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static B3backendPackage getPackage() {
		return B3backendPackage.eINSTANCE;
	}

} //B3backendFactoryImpl
