/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.util;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage
 * @generated
 */
public class B3backendSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static B3backendPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3backendSwitch() {
		if (modelPackage == null) {
			modelPackage = B3backendPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case B3backendPackage.BEXPRESSION: {
				BExpression bExpression = (BExpression)theEObject;
				T result = caseBExpression(bExpression);
				if (result == null) result = caseBSourceLink(bExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BSOURCE_LINK: {
				BSourceLink bSourceLink = (BSourceLink)theEObject;
				T result = caseBSourceLink(bSourceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFILE_REFERENCE: {
				BFileReference bFileReference = (BFileReference)theEObject;
				T result = caseBFileReference(bFileReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLINE_REFERENCE: {
				BLineReference bLineReference = (BLineReference)theEObject;
				T result = caseBLineReference(bLineReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BEXECUTION_CONTEXT: {
				BExecutionContext bExecutionContext = (BExecutionContext)theEObject;
				T result = caseBExecutionContext(bExecutionContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BIF_EXPRESSION: {
				BIfExpression bIfExpression = (BIfExpression)theEObject;
				T result = caseBIfExpression(bIfExpression);
				if (result == null) result = caseBExpression(bIfExpression);
				if (result == null) result = caseBSourceLink(bIfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BSWITCH_EXPRESSION: {
				BSwitchExpression bSwitchExpression = (BSwitchExpression)theEObject;
				T result = caseBSwitchExpression(bSwitchExpression);
				if (result == null) result = caseBExpression(bSwitchExpression);
				if (result == null) result = caseBSourceLink(bSwitchExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCASE: {
				BCase bCase = (BCase)theEObject;
				T result = caseBCase(bCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BTRY_EXPRESSION: {
				BTryExpression bTryExpression = (BTryExpression)theEObject;
				T result = caseBTryExpression(bTryExpression);
				if (result == null) result = caseBExpression(bTryExpression);
				if (result == null) result = caseBSourceLink(bTryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCATCH: {
				BCatch bCatch = (BCatch)theEObject;
				T result = caseBCatch(bCatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BBINARY_EXPRESSION: {
				BBinaryExpression bBinaryExpression = (BBinaryExpression)theEObject;
				T result = caseBBinaryExpression(bBinaryExpression);
				if (result == null) result = caseBExpression(bBinaryExpression);
				if (result == null) result = caseBSourceLink(bBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BOR_EXPRESSION: {
				BOrExpression bOrExpression = (BOrExpression)theEObject;
				T result = caseBOrExpression(bOrExpression);
				if (result == null) result = caseBBinaryExpression(bOrExpression);
				if (result == null) result = caseBExpression(bOrExpression);
				if (result == null) result = caseBSourceLink(bOrExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BAND_EXPRESSION: {
				BAndExpression bAndExpression = (BAndExpression)theEObject;
				T result = caseBAndExpression(bAndExpression);
				if (result == null) result = caseBBinaryExpression(bAndExpression);
				if (result == null) result = caseBExpression(bAndExpression);
				if (result == null) result = caseBSourceLink(bAndExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCHAINED_EXPRESSION: {
				BChainedExpression bChainedExpression = (BChainedExpression)theEObject;
				T result = caseBChainedExpression(bChainedExpression);
				if (result == null) result = caseBExpression(bChainedExpression);
				if (result == null) result = caseBSourceLink(bChainedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_EXPRESSION: {
				BUnaryExpression bUnaryExpression = (BUnaryExpression)theEObject;
				T result = caseBUnaryExpression(bUnaryExpression);
				if (result == null) result = caseBExpression(bUnaryExpression);
				if (result == null) result = caseBSourceLink(bUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BTHROW_EXPRESSION: {
				BThrowExpression bThrowExpression = (BThrowExpression)theEObject;
				T result = caseBThrowExpression(bThrowExpression);
				if (result == null) result = caseBUnaryExpression(bThrowExpression);
				if (result == null) result = caseBExpression(bThrowExpression);
				if (result == null) result = caseBSourceLink(bThrowExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_OP_EXPRESSION: {
				BUnaryOpExpression bUnaryOpExpression = (BUnaryOpExpression)theEObject;
				T result = caseBUnaryOpExpression(bUnaryOpExpression);
				if (result == null) result = caseBUnaryExpression(bUnaryOpExpression);
				if (result == null) result = caseBExpression(bUnaryOpExpression);
				if (result == null) result = caseBSourceLink(bUnaryOpExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_POST_OP_EXPRESSION: {
				BUnaryPostOpExpression bUnaryPostOpExpression = (BUnaryPostOpExpression)theEObject;
				T result = caseBUnaryPostOpExpression(bUnaryPostOpExpression);
				if (result == null) result = caseBUnaryOpExpression(bUnaryPostOpExpression);
				if (result == null) result = caseBUnaryExpression(bUnaryPostOpExpression);
				if (result == null) result = caseBExpression(bUnaryPostOpExpression);
				if (result == null) result = caseBSourceLink(bUnaryPostOpExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BBINARY_OP_EXPRESSION: {
				BBinaryOpExpression bBinaryOpExpression = (BBinaryOpExpression)theEObject;
				T result = caseBBinaryOpExpression(bBinaryOpExpression);
				if (result == null) result = caseBBinaryExpression(bBinaryOpExpression);
				if (result == null) result = caseBExpression(bBinaryOpExpression);
				if (result == null) result = caseBSourceLink(bBinaryOpExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCACHED_EXPRESSION: {
				BCachedExpression bCachedExpression = (BCachedExpression)theEObject;
				T result = caseBCachedExpression(bCachedExpression);
				if (result == null) result = caseBUnaryExpression(bCachedExpression);
				if (result == null) result = caseBExpression(bCachedExpression);
				if (result == null) result = caseBSourceLink(bCachedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_EXPRESSION: {
				BLiteralExpression bLiteralExpression = (BLiteralExpression)theEObject;
				T result = caseBLiteralExpression(bLiteralExpression);
				if (result == null) result = caseBExpression(bLiteralExpression);
				if (result == null) result = caseBSourceLink(bLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_LIST_EXPRESSION: {
				BLiteralListExpression bLiteralListExpression = (BLiteralListExpression)theEObject;
				T result = caseBLiteralListExpression(bLiteralListExpression);
				if (result == null) result = caseBExpression(bLiteralListExpression);
				if (result == null) result = caseBSourceLink(bLiteralListExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_MAP_EXPRESSION: {
				BLiteralMapExpression bLiteralMapExpression = (BLiteralMapExpression)theEObject;
				T result = caseBLiteralMapExpression(bLiteralMapExpression);
				if (result == null) result = caseBExpression(bLiteralMapExpression);
				if (result == null) result = caseBSourceLink(bLiteralMapExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BMAP_ENTRY: {
				BMapEntry bMapEntry = (BMapEntry)theEObject;
				T result = caseBMapEntry(bMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFEATURE_EXPRESSION: {
				BFeatureExpression bFeatureExpression = (BFeatureExpression)theEObject;
				T result = caseBFeatureExpression(bFeatureExpression);
				if (result == null) result = caseBExpression(bFeatureExpression);
				if (result == null) result = caseBSourceLink(bFeatureExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BAT_EXPRESSION: {
				BAtExpression bAtExpression = (BAtExpression)theEObject;
				T result = caseBAtExpression(bAtExpression);
				if (result == null) result = caseBExpression(bAtExpression);
				if (result == null) result = caseBSourceLink(bAtExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BVARIABLE_EXPRESSION: {
				BVariableExpression bVariableExpression = (BVariableExpression)theEObject;
				T result = caseBVariableExpression(bVariableExpression);
				if (result == null) result = caseBExpression(bVariableExpression);
				if (result == null) result = caseBSourceLink(bVariableExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCALL_EXPRESSION: {
				BCallExpression bCallExpression = (BCallExpression)theEObject;
				T result = caseBCallExpression(bCallExpression);
				if (result == null) result = caseBParameterizedExpression(bCallExpression);
				if (result == null) result = caseBExpression(bCallExpression);
				if (result == null) result = caseBSourceLink(bCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETERIZED_EXPRESSION: {
				BParameterizedExpression bParameterizedExpression = (BParameterizedExpression)theEObject;
				T result = caseBParameterizedExpression(bParameterizedExpression);
				if (result == null) result = caseBExpression(bParameterizedExpression);
				if (result == null) result = caseBSourceLink(bParameterizedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_ANY: {
				BLiteralAny bLiteralAny = (BLiteralAny)theEObject;
				T result = caseBLiteralAny(bLiteralAny);
				if (result == null) result = caseBExpression(bLiteralAny);
				if (result == null) result = caseBSourceLink(bLiteralAny);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCREATE_EXPRESSION: {
				BCreateExpression bCreateExpression = (BCreateExpression)theEObject;
				T result = caseBCreateExpression(bCreateExpression);
				if (result == null) result = caseBParameterizedExpression(bCreateExpression);
				if (result == null) result = caseBExpression(bCreateExpression);
				if (result == null) result = caseBSourceLink(bCreateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFUNCTION: {
				BFunction bFunction = (BFunction)theEObject;
				T result = caseBFunction(bFunction);
				if (result == null) result = caseBExpression(bFunction);
				if (result == null) result = caseIGenericDeclaration(bFunction);
				if (result == null) result = caseBSourceLink(bFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BGUARD: {
				BGuard bGuard = (BGuard)theEObject;
				T result = caseBGuard(bGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BGUARD_INSTANCE: {
				BGuardInstance bGuardInstance = (BGuardInstance)theEObject;
				T result = caseBGuardInstance(bGuardInstance);
				if (result == null) result = caseBGuard(bGuardInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BGUARD_EXPRESSION: {
				BGuardExpression bGuardExpression = (BGuardExpression)theEObject;
				T result = caseBGuardExpression(bGuardExpression);
				if (result == null) result = caseBGuard(bGuardExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BSYSTEM_CONTEXT: {
				BSystemContext bSystemContext = (BSystemContext)theEObject;
				T result = caseBSystemContext(bSystemContext);
				if (result == null) result = caseBExecutionContext(bSystemContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCONTEXT: {
				BContext bContext = (BContext)theEObject;
				T result = caseBContext(bContext);
				if (result == null) result = caseBExecutionContext(bContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BINNER_CONTEXT: {
				BInnerContext bInnerContext = (BInnerContext)theEObject;
				T result = caseBInnerContext(bInnerContext);
				if (result == null) result = caseBExecutionContext(bInnerContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BINVOCATION_CONTEXT: {
				BInvocationContext bInvocationContext = (BInvocationContext)theEObject;
				T result = caseBInvocationContext(bInvocationContext);
				if (result == null) result = caseBExecutionContext(bInvocationContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_PRE_OP_EXPRESSION: {
				BUnaryPreOpExpression bUnaryPreOpExpression = (BUnaryPreOpExpression)theEObject;
				T result = caseBUnaryPreOpExpression(bUnaryPreOpExpression);
				if (result == null) result = caseBUnaryOpExpression(bUnaryPreOpExpression);
				if (result == null) result = caseBUnaryExpression(bUnaryPreOpExpression);
				if (result == null) result = caseBExpression(bUnaryPreOpExpression);
				if (result == null) result = caseBSourceLink(bUnaryPreOpExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BASSIGNMENT_EXPRESSION: {
				BAssignmentExpression bAssignmentExpression = (BAssignmentExpression)theEObject;
				T result = caseBAssignmentExpression(bAssignmentExpression);
				if (result == null) result = caseBBinaryOpExpression(bAssignmentExpression);
				if (result == null) result = caseBBinaryExpression(bAssignmentExpression);
				if (result == null) result = caseBExpression(bAssignmentExpression);
				if (result == null) result = caseBSourceLink(bAssignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_FUNCTION: {
				B3Function b3Function = (B3Function)theEObject;
				T result = caseB3Function(b3Function);
				if (result == null) result = caseBFunction(b3Function);
				if (result == null) result = caseBExpression(b3Function);
				if (result == null) result = caseIGenericDeclaration(b3Function);
				if (result == null) result = caseBSourceLink(b3Function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BJAVA_FUNCTION: {
				BJavaFunction bJavaFunction = (BJavaFunction)theEObject;
				T result = caseBJavaFunction(bJavaFunction);
				if (result == null) result = caseBFunction(bJavaFunction);
				if (result == null) result = caseBExpression(bJavaFunction);
				if (result == null) result = caseIGenericDeclaration(bJavaFunction);
				if (result == null) result = caseBSourceLink(bJavaFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BDEF_FUNCTION: {
				BDefFunction bDefFunction = (BDefFunction)theEObject;
				T result = caseBDefFunction(bDefFunction);
				if (result == null) result = caseBExpression(bDefFunction);
				if (result == null) result = caseBSourceLink(bDefFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BDEF_VALUE: {
				BDefValue bDefValue = (BDefValue)theEObject;
				T result = caseBDefValue(bDefValue);
				if (result == null) result = caseBExpression(bDefValue);
				if (result == null) result = caseBSourceLink(bDefValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BREGULAR_EXPRESSION: {
				BRegularExpression bRegularExpression = (BRegularExpression)theEObject;
				T result = caseBRegularExpression(bRegularExpression);
				if (result == null) result = caseBExpression(bRegularExpression);
				if (result == null) result = caseBSourceLink(bRegularExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETER_LIST: {
				BParameterList bParameterList = (BParameterList)theEObject;
				T result = caseBParameterList(bParameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETER: {
				BParameter bParameter = (BParameter)theEObject;
				T result = caseBParameter(bParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETER_DECLARATION: {
				BParameterDeclaration bParameterDeclaration = (BParameterDeclaration)theEObject;
				T result = caseBParameterDeclaration(bParameterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_FUNCTION_TYPE: {
				B3FunctionType b3FunctionType = (B3FunctionType)theEObject;
				T result = caseB3FunctionType(b3FunctionType);
				if (result == null) result = caseIType(b3FunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_PARAMETERIZED_TYPE: {
				B3ParameterizedType b3ParameterizedType = (B3ParameterizedType)theEObject;
				T result = caseB3ParameterizedType(b3ParameterizedType);
				if (result == null) result = caseIParameterizedType(b3ParameterizedType);
				if (result == null) result = caseIType(b3ParameterizedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_WILDCARD_TYPE: {
				B3WildcardType b3WildcardType = (B3WildcardType)theEObject;
				T result = caseB3WildcardType(b3WildcardType);
				if (result == null) result = caseIWildcardType(b3WildcardType);
				if (result == null) result = caseIType(b3WildcardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE: {
				B3FuncTypeVariable b3FuncTypeVariable = (B3FuncTypeVariable)theEObject;
				T result = caseB3FuncTypeVariable(b3FuncTypeVariable);
				if (result == null) result = caseITypeVariable(b3FuncTypeVariable);
				if (result == null) result = caseIType(b3FuncTypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_JAVA_IMPORT: {
				B3JavaImport b3JavaImport = (B3JavaImport)theEObject;
				T result = caseB3JavaImport(b3JavaImport);
				if (result == null) result = caseIType(b3JavaImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExpression(BExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSource Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSource Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSourceLink(BSourceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFile Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFile Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFileReference(BFileReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLine Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLine Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLineReference(BLineReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExecution Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExecution Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExecutionContext(BExecutionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BIf Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBIfExpression(BIfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSwitch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSwitch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSwitchExpression(BSwitchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCase(BCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTry Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTry Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTryExpression(BTryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCatch(BCatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBinary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBinary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBinaryExpression(BBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOr Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOr Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOrExpression(BOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAnd Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAnd Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAndExpression(BAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BChained Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BChained Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBChainedExpression(BChainedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUnary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUnary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUnaryExpression(BUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BThrow Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BThrow Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBThrowExpression(BThrowExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUnary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUnary Op Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUnaryOpExpression(BUnaryOpExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUnary Post Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUnary Post Op Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUnaryPostOpExpression(BUnaryPostOpExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBinary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBinary Op Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBinaryOpExpression(BBinaryOpExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCached Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCached Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCachedExpression(BCachedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLiteral Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLiteral Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLiteralExpression(BLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLiteral List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLiteral List Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLiteralListExpression(BLiteralListExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLiteral Map Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLiteral Map Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLiteralMapExpression(BLiteralMapExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BMap Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BMap Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMapEntry(BMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFeature Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFeature Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFeatureExpression(BFeatureExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAt Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAt Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAtExpression(BAtExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BVariable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BVariable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBVariableExpression(BVariableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCall Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCall Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCallExpression(BCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameterized Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameterized Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameterizedExpression(BParameterizedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLiteral Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLiteral Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLiteralAny(BLiteralAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCreate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCreate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCreateExpression(BCreateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunction(BFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGuard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGuard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGuard(BGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGuard Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGuard Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGuardInstance(BGuardInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGuard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGuard Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGuardExpression(BGuardExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSystem Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSystem Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSystemContext(BSystemContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBContext(BContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInner Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInner Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInnerContext(BInnerContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInvocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInvocation Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInvocationContext(BInvocationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUnary Pre Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUnary Pre Op Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUnaryPreOpExpression(BUnaryPreOpExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAssignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAssignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAssignmentExpression(BAssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3Function(B3Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BJava Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BJava Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBJavaFunction(BJavaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDef Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDef Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDefFunction(BDefFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDef Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDef Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDefValue(BDefValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRegular Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRegular Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBRegularExpression(BRegularExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameterList(BParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameter(BParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameterDeclaration(BParameterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3FunctionType(B3FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IParameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IParameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIParameterizedType(ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGeneric Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGeneric Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGenericDeclaration(GenericDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Parameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3ParameterizedType(B3ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IWildcard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IWildcard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIWildcardType(WildcardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Wildcard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Wildcard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3WildcardType(B3WildcardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <D extends GenericDeclaration> T caseITypeVariable(TypeVariable<D> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Func Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Func Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3FuncTypeVariable(B3FuncTypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Java Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Java Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3JavaImport(B3JavaImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //B3backendSwitch