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
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each
 * class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage
 * @generated
 */
public class B3backendSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static B3backendPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public B3backendSwitch() {
		if(modelPackage == null) {
			modelPackage = B3backendPackage.eINSTANCE;
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3Function(B3Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3FunctionType(B3FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Func Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
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
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Java Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3JavaImport(B3JavaImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Meta Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Meta Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3MetaClass(B3MetaClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Parameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3ParameterizedType(B3ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3Type(B3Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>B3 Wildcard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>B3 Wildcard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseB3WildcardType(B3WildcardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAdvice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAdvice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAdvice(BAdvice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAnd Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAnd Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAndExpression(BAndExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAssignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAssignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAssignmentExpression(BAssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAt Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAt Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAtExpression(BAtExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBinary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBinary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBinaryExpression(BBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBinary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
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
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCached Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCachedExpression(BCachedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCall Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCall Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCallExpression(BCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCall Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCall Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCallFeature(BCallFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCall Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCall Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCallFunction(BCallFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCall Named Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCall Named Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCallNamedFunction(BCallNamedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCase(BCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCatch(BCatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BChained Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BChained Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBChainedExpression(BChainedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BConcern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BConcern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBConcern(BConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BConcern Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BConcern Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBConcernContext(BConcernContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BConditional Property Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BConditional Property Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBConditionalPropertyOperation(BConditionalPropertyOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBContext(BContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BCreate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BCreate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBCreateExpression(BCreateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDefault Property Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDefault Property Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDefaultPropertySet(BDefaultPropertySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDef Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDef Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDefProperty(BDefProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDef Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDef Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDefValue(BDefValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BDelegating Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BDelegating Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBDelegatingContext(BDelegatingContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExecution Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExecution Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExecutionContext(BExecutionContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExpression(BExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExpression Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExpression Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExpressionWrapper(BExpressionWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFeature Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFeature Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFeatureExpression(BFeatureExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunction(BFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Concern Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Concern Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionConcernContext(BFunctionConcernContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionContainer(BFunctionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Name Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Name Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionNamePredicate(BFunctionNamePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFunction Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFunction Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFunctionWrapper(BFunctionWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGuard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGuard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGuard(BGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGuard Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGuard Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGuardExpression(BGuardExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BGuard Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BGuard Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBGuardFunction(BGuardFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BIf Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBIfExpression(BIfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInner Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInner Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInnerContext(BInnerContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInstance Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInstance Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInstanceContext(BInstanceContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BInvocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BInvocation Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBInvocationContext(BInvocationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BJava Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BJava Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBJavaFunction(BJavaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLiteral Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLiteral Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLiteralAny(BLiteralAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLiteral Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
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
	 * 
	 * @param object
	 *            the target of the switch.
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
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLiteral Map Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLiteralMapExpression(BLiteralMapExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BLiteral Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BLiteral Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBLiteralType(BLiteralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BMap Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BMap Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMapEntry(BMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BName Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BName Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBNamePredicate(BNamePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOr Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOr Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOrExpression(BOrExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
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
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameterDeclaration(BParameterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameterized Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameterized Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameterizedExpression(BParameterizedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameterList(BParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BParameter Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BParameter Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBParameterPredicate(BParameterPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPattern Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPattern Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPatternLiteralExpression(BPatternLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProceed Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProceed Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBProceedExpression(BProceedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProperty Definition Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProperty Definition Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPropertyDefinitionOperation(BPropertyDefinitionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProperty Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProperty Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPropertyOperation(BPropertyOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProperty Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProperty Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPropertySet(BPropertySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BProperty Set Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BProperty Set Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPropertySetOperation(BPropertySetOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRegular Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRegular Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBRegularExpression(BRegularExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSimple Pattern Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSimple Pattern Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSimplePatternExpression(BSimplePatternExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSwitch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSwitch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSwitchExpression(BSwitchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSystem Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSystem Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSystemContext(BSystemContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BThrow Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BThrow Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBThrowExpression(BThrowExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTry Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTry Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTryExpression(BTryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BType Calculator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BType Calculator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTypeCalculator(BTypeCalculator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BType Calculator Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BType Calculator Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTypeCalculatorFunction(BTypeCalculatorFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUnary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUnary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUnaryExpression(BUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUnary Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
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
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUnary Post Op Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUnaryPostOpExpression(BUnaryPostOpExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BUnary Pre Op Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BUnary Pre Op Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBUnaryPreOpExpression(BUnaryPreOpExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BVariable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BVariable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBVariableExpression(BVariableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWith Context Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWith Context Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBWithContextExpression(BWithContextExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWith Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWith Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBWithExpression(BWithExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BWrapping Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BWrapping Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBWrappingContext(BWrappingContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFunction(IFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGeneric Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGeneric Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGenericDeclaration(GenericDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamedValue(INamedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IParameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IParameterized Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIParameterizedType(ParameterizedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITyped Value Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITyped Value Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypedValueContainer(ITypedValueContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <D extends GenericDeclaration> T caseITypeVariable(TypeVariable<D> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IWildcard Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IWildcard Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIWildcardType(WildcardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if(theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
					? defaultCase(theEObject)
					: doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch(classifierID) {
			case B3backendPackage.BEXPRESSION: {
				BExpression bExpression = (BExpression) theEObject;
				T result = caseBExpression(bExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BEXECUTION_CONTEXT: {
				BExecutionContext bExecutionContext = (BExecutionContext) theEObject;
				T result = caseBExecutionContext(bExecutionContext);
				if(result == null)
					result = caseITypedValueContainer(bExecutionContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BIF_EXPRESSION: {
				BIfExpression bIfExpression = (BIfExpression) theEObject;
				T result = caseBIfExpression(bIfExpression);
				if(result == null)
					result = caseBExpression(bIfExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BSWITCH_EXPRESSION: {
				BSwitchExpression bSwitchExpression = (BSwitchExpression) theEObject;
				T result = caseBSwitchExpression(bSwitchExpression);
				if(result == null)
					result = caseBExpression(bSwitchExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCASE: {
				BCase bCase = (BCase) theEObject;
				T result = caseBCase(bCase);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BTRY_EXPRESSION: {
				BTryExpression bTryExpression = (BTryExpression) theEObject;
				T result = caseBTryExpression(bTryExpression);
				if(result == null)
					result = caseBExpression(bTryExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCATCH: {
				BCatch bCatch = (BCatch) theEObject;
				T result = caseBCatch(bCatch);
				if(result == null)
					result = caseINamedValue(bCatch);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BBINARY_EXPRESSION: {
				BBinaryExpression bBinaryExpression = (BBinaryExpression) theEObject;
				T result = caseBBinaryExpression(bBinaryExpression);
				if(result == null)
					result = caseBExpression(bBinaryExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BOR_EXPRESSION: {
				BOrExpression bOrExpression = (BOrExpression) theEObject;
				T result = caseBOrExpression(bOrExpression);
				if(result == null)
					result = caseBBinaryExpression(bOrExpression);
				if(result == null)
					result = caseBExpression(bOrExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BAND_EXPRESSION: {
				BAndExpression bAndExpression = (BAndExpression) theEObject;
				T result = caseBAndExpression(bAndExpression);
				if(result == null)
					result = caseBBinaryExpression(bAndExpression);
				if(result == null)
					result = caseBExpression(bAndExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCHAINED_EXPRESSION: {
				BChainedExpression bChainedExpression = (BChainedExpression) theEObject;
				T result = caseBChainedExpression(bChainedExpression);
				if(result == null)
					result = caseBExpression(bChainedExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_EXPRESSION: {
				BUnaryExpression bUnaryExpression = (BUnaryExpression) theEObject;
				T result = caseBUnaryExpression(bUnaryExpression);
				if(result == null)
					result = caseBExpression(bUnaryExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BTHROW_EXPRESSION: {
				BThrowExpression bThrowExpression = (BThrowExpression) theEObject;
				T result = caseBThrowExpression(bThrowExpression);
				if(result == null)
					result = caseBUnaryExpression(bThrowExpression);
				if(result == null)
					result = caseBExpression(bThrowExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_OP_EXPRESSION: {
				BUnaryOpExpression bUnaryOpExpression = (BUnaryOpExpression) theEObject;
				T result = caseBUnaryOpExpression(bUnaryOpExpression);
				if(result == null)
					result = caseBUnaryExpression(bUnaryOpExpression);
				if(result == null)
					result = caseBExpression(bUnaryOpExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_POST_OP_EXPRESSION: {
				BUnaryPostOpExpression bUnaryPostOpExpression = (BUnaryPostOpExpression) theEObject;
				T result = caseBUnaryPostOpExpression(bUnaryPostOpExpression);
				if(result == null)
					result = caseBUnaryOpExpression(bUnaryPostOpExpression);
				if(result == null)
					result = caseBUnaryExpression(bUnaryPostOpExpression);
				if(result == null)
					result = caseBExpression(bUnaryPostOpExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BBINARY_OP_EXPRESSION: {
				BBinaryOpExpression bBinaryOpExpression = (BBinaryOpExpression) theEObject;
				T result = caseBBinaryOpExpression(bBinaryOpExpression);
				if(result == null)
					result = caseBBinaryExpression(bBinaryOpExpression);
				if(result == null)
					result = caseBExpression(bBinaryOpExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCACHED_EXPRESSION: {
				BCachedExpression bCachedExpression = (BCachedExpression) theEObject;
				T result = caseBCachedExpression(bCachedExpression);
				if(result == null)
					result = caseBUnaryExpression(bCachedExpression);
				if(result == null)
					result = caseBExpression(bCachedExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_EXPRESSION: {
				BLiteralExpression bLiteralExpression = (BLiteralExpression) theEObject;
				T result = caseBLiteralExpression(bLiteralExpression);
				if(result == null)
					result = caseBExpression(bLiteralExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_LIST_EXPRESSION: {
				BLiteralListExpression bLiteralListExpression = (BLiteralListExpression) theEObject;
				T result = caseBLiteralListExpression(bLiteralListExpression);
				if(result == null)
					result = caseBExpression(bLiteralListExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_MAP_EXPRESSION: {
				BLiteralMapExpression bLiteralMapExpression = (BLiteralMapExpression) theEObject;
				T result = caseBLiteralMapExpression(bLiteralMapExpression);
				if(result == null)
					result = caseBExpression(bLiteralMapExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BMAP_ENTRY: {
				BMapEntry bMapEntry = (BMapEntry) theEObject;
				T result = caseBMapEntry(bMapEntry);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFEATURE_EXPRESSION: {
				BFeatureExpression bFeatureExpression = (BFeatureExpression) theEObject;
				T result = caseBFeatureExpression(bFeatureExpression);
				if(result == null)
					result = caseBExpression(bFeatureExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BAT_EXPRESSION: {
				BAtExpression bAtExpression = (BAtExpression) theEObject;
				T result = caseBAtExpression(bAtExpression);
				if(result == null)
					result = caseBExpression(bAtExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BVARIABLE_EXPRESSION: {
				BVariableExpression bVariableExpression = (BVariableExpression) theEObject;
				T result = caseBVariableExpression(bVariableExpression);
				if(result == null)
					result = caseBExpression(bVariableExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCALL_EXPRESSION: {
				BCallExpression bCallExpression = (BCallExpression) theEObject;
				T result = caseBCallExpression(bCallExpression);
				if(result == null)
					result = caseBParameterizedExpression(bCallExpression);
				if(result == null)
					result = caseBExpression(bCallExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETERIZED_EXPRESSION: {
				BParameterizedExpression bParameterizedExpression = (BParameterizedExpression) theEObject;
				T result = caseBParameterizedExpression(bParameterizedExpression);
				if(result == null)
					result = caseBExpression(bParameterizedExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_ANY: {
				BLiteralAny bLiteralAny = (BLiteralAny) theEObject;
				T result = caseBLiteralAny(bLiteralAny);
				if(result == null)
					result = caseBPatternLiteralExpression(bLiteralAny);
				if(result == null)
					result = caseBExpression(bLiteralAny);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCREATE_EXPRESSION: {
				BCreateExpression bCreateExpression = (BCreateExpression) theEObject;
				T result = caseBCreateExpression(bCreateExpression);
				if(result == null)
					result = caseBParameterizedExpression(bCreateExpression);
				if(result == null)
					result = caseINamedValue(bCreateExpression);
				if(result == null)
					result = caseBExpression(bCreateExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.IFUNCTION: {
				IFunction iFunction = (IFunction) theEObject;
				T result = caseIFunction(iFunction);
				if(result == null)
					result = caseIGenericDeclaration(iFunction);
				if(result == null)
					result = caseBExpression(iFunction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BGUARD: {
				BGuard bGuard = (BGuard) theEObject;
				T result = caseBGuard(bGuard);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BGUARD_EXPRESSION: {
				BGuardExpression bGuardExpression = (BGuardExpression) theEObject;
				T result = caseBGuardExpression(bGuardExpression);
				if(result == null)
					result = caseBGuard(bGuardExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BSYSTEM_CONTEXT: {
				BSystemContext bSystemContext = (BSystemContext) theEObject;
				T result = caseBSystemContext(bSystemContext);
				if(result == null)
					result = caseBExecutionContext(bSystemContext);
				if(result == null)
					result = caseITypedValueContainer(bSystemContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCONTEXT: {
				BContext bContext = (BContext) theEObject;
				T result = caseBContext(bContext);
				if(result == null)
					result = caseBExecutionContext(bContext);
				if(result == null)
					result = caseITypedValueContainer(bContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BINNER_CONTEXT: {
				BInnerContext bInnerContext = (BInnerContext) theEObject;
				T result = caseBInnerContext(bInnerContext);
				if(result == null)
					result = caseBExecutionContext(bInnerContext);
				if(result == null)
					result = caseITypedValueContainer(bInnerContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BINVOCATION_CONTEXT: {
				BInvocationContext bInvocationContext = (BInvocationContext) theEObject;
				T result = caseBInvocationContext(bInvocationContext);
				if(result == null)
					result = caseBExecutionContext(bInvocationContext);
				if(result == null)
					result = caseITypedValueContainer(bInvocationContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BUNARY_PRE_OP_EXPRESSION: {
				BUnaryPreOpExpression bUnaryPreOpExpression = (BUnaryPreOpExpression) theEObject;
				T result = caseBUnaryPreOpExpression(bUnaryPreOpExpression);
				if(result == null)
					result = caseBUnaryOpExpression(bUnaryPreOpExpression);
				if(result == null)
					result = caseBUnaryExpression(bUnaryPreOpExpression);
				if(result == null)
					result = caseBExpression(bUnaryPreOpExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BASSIGNMENT_EXPRESSION: {
				BAssignmentExpression bAssignmentExpression = (BAssignmentExpression) theEObject;
				T result = caseBAssignmentExpression(bAssignmentExpression);
				if(result == null)
					result = caseBBinaryOpExpression(bAssignmentExpression);
				if(result == null)
					result = caseBBinaryExpression(bAssignmentExpression);
				if(result == null)
					result = caseBExpression(bAssignmentExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_FUNCTION: {
				B3Function b3Function = (B3Function) theEObject;
				T result = caseB3Function(b3Function);
				if(result == null)
					result = caseBFunction(b3Function);
				if(result == null)
					result = caseIFunction(b3Function);
				if(result == null)
					result = caseBExpression(b3Function);
				if(result == null)
					result = caseIGenericDeclaration(b3Function);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BJAVA_FUNCTION: {
				BJavaFunction bJavaFunction = (BJavaFunction) theEObject;
				T result = caseBJavaFunction(bJavaFunction);
				if(result == null)
					result = caseBFunction(bJavaFunction);
				if(result == null)
					result = caseIFunction(bJavaFunction);
				if(result == null)
					result = caseBExpression(bJavaFunction);
				if(result == null)
					result = caseIGenericDeclaration(bJavaFunction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFUNCTION_CONTAINER: {
				BFunctionContainer bFunctionContainer = (BFunctionContainer) theEObject;
				T result = caseBFunctionContainer(bFunctionContainer);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BDEF_VALUE: {
				BDefValue bDefValue = (BDefValue) theEObject;
				T result = caseBDefValue(bDefValue);
				if(result == null)
					result = caseBExpression(bDefValue);
				if(result == null)
					result = caseINamedValue(bDefValue);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BREGULAR_EXPRESSION: {
				BRegularExpression bRegularExpression = (BRegularExpression) theEObject;
				T result = caseBRegularExpression(bRegularExpression);
				if(result == null)
					result = caseBPatternLiteralExpression(bRegularExpression);
				if(result == null)
					result = caseBExpression(bRegularExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETER_LIST: {
				BParameterList bParameterList = (BParameterList) theEObject;
				T result = caseBParameterList(bParameterList);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETER: {
				BParameter bParameter = (BParameter) theEObject;
				T result = caseBParameter(bParameter);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETER_DECLARATION: {
				BParameterDeclaration bParameterDeclaration = (BParameterDeclaration) theEObject;
				T result = caseBParameterDeclaration(bParameterDeclaration);
				if(result == null)
					result = caseINamedValue(bParameterDeclaration);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_FUNCTION_TYPE: {
				B3FunctionType b3FunctionType = (B3FunctionType) theEObject;
				T result = caseB3FunctionType(b3FunctionType);
				if(result == null)
					result = caseIType(b3FunctionType);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_PARAMETERIZED_TYPE: {
				B3ParameterizedType b3ParameterizedType = (B3ParameterizedType) theEObject;
				T result = caseB3ParameterizedType(b3ParameterizedType);
				if(result == null)
					result = caseIParameterizedType(b3ParameterizedType);
				if(result == null)
					result = caseIType(b3ParameterizedType);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_WILDCARD_TYPE: {
				B3WildcardType b3WildcardType = (B3WildcardType) theEObject;
				T result = caseB3WildcardType(b3WildcardType);
				if(result == null)
					result = caseIWildcardType(b3WildcardType);
				if(result == null)
					result = caseIType(b3WildcardType);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_FUNC_TYPE_VARIABLE: {
				B3FuncTypeVariable b3FuncTypeVariable = (B3FuncTypeVariable) theEObject;
				T result = caseB3FuncTypeVariable(b3FuncTypeVariable);
				if(result == null)
					result = caseITypeVariable(b3FuncTypeVariable);
				if(result == null)
					result = caseIType(b3FuncTypeVariable);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_JAVA_IMPORT: {
				B3JavaImport b3JavaImport = (B3JavaImport) theEObject;
				T result = caseB3JavaImport(b3JavaImport);
				if(result == null)
					result = caseIType(b3JavaImport);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BLITERAL_TYPE: {
				BLiteralType bLiteralType = (BLiteralType) theEObject;
				T result = caseBLiteralType(bLiteralType);
				if(result == null)
					result = caseBExpression(bLiteralType);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BGUARD_FUNCTION: {
				BGuardFunction bGuardFunction = (BGuardFunction) theEObject;
				T result = caseBGuardFunction(bGuardFunction);
				if(result == null)
					result = caseBGuard(bGuardFunction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BTYPE_CALCULATOR: {
				BTypeCalculator bTypeCalculator = (BTypeCalculator) theEObject;
				T result = caseBTypeCalculator(bTypeCalculator);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BTYPE_CALCULATOR_FUNCTION: {
				BTypeCalculatorFunction bTypeCalculatorFunction = (BTypeCalculatorFunction) theEObject;
				T result = caseBTypeCalculatorFunction(bTypeCalculatorFunction);
				if(result == null)
					result = caseBTypeCalculator(bTypeCalculatorFunction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BINSTANCE_CONTEXT: {
				BInstanceContext bInstanceContext = (BInstanceContext) theEObject;
				T result = caseBInstanceContext(bInstanceContext);
				if(result == null)
					result = caseBInnerContext(bInstanceContext);
				if(result == null)
					result = caseBExecutionContext(bInstanceContext);
				if(result == null)
					result = caseITypedValueContainer(bInstanceContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BDEF_PROPERTY: {
				BDefProperty bDefProperty = (BDefProperty) theEObject;
				T result = caseBDefProperty(bDefProperty);
				if(result == null)
					result = caseBDefValue(bDefProperty);
				if(result == null)
					result = caseBExpression(bDefProperty);
				if(result == null)
					result = caseINamedValue(bDefProperty);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPROPERTY_SET: {
				BPropertySet bPropertySet = (BPropertySet) theEObject;
				T result = caseBPropertySet(bPropertySet);
				if(result == null)
					result = caseBAdvice(bPropertySet);
				if(result == null)
					result = caseBExpression(bPropertySet);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BDEFAULT_PROPERTY_SET: {
				BDefaultPropertySet bDefaultPropertySet = (BDefaultPropertySet) theEObject;
				T result = caseBDefaultPropertySet(bDefaultPropertySet);
				if(result == null)
					result = caseBPropertySet(bDefaultPropertySet);
				if(result == null)
					result = caseBAdvice(bDefaultPropertySet);
				if(result == null)
					result = caseBExpression(bDefaultPropertySet);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPROPERTY_OPERATION: {
				BPropertyOperation bPropertyOperation = (BPropertyOperation) theEObject;
				T result = caseBPropertyOperation(bPropertyOperation);
				if(result == null)
					result = caseBExpression(bPropertyOperation);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPROPERTY_DEFINITION_OPERATION: {
				BPropertyDefinitionOperation bPropertyDefinitionOperation = (BPropertyDefinitionOperation) theEObject;
				T result = caseBPropertyDefinitionOperation(bPropertyDefinitionOperation);
				if(result == null)
					result = caseBPropertyOperation(bPropertyDefinitionOperation);
				if(result == null)
					result = caseBExpression(bPropertyDefinitionOperation);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCONDITIONAL_PROPERTY_OPERATION: {
				BConditionalPropertyOperation bConditionalPropertyOperation = (BConditionalPropertyOperation) theEObject;
				T result = caseBConditionalPropertyOperation(bConditionalPropertyOperation);
				if(result == null)
					result = caseBPropertyOperation(bConditionalPropertyOperation);
				if(result == null)
					result = caseBExpression(bConditionalPropertyOperation);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPROPERTY_SET_OPERATION: {
				BPropertySetOperation bPropertySetOperation = (BPropertySetOperation) theEObject;
				T result = caseBPropertySetOperation(bPropertySetOperation);
				if(result == null)
					result = caseBPropertyOperation(bPropertySetOperation);
				if(result == null)
					result = caseBExpression(bPropertySetOperation);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BADVICE: {
				BAdvice bAdvice = (BAdvice) theEObject;
				T result = caseBAdvice(bAdvice);
				if(result == null)
					result = caseBExpression(bAdvice);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCONCERN: {
				BConcern bConcern = (BConcern) theEObject;
				T result = caseBConcern(bConcern);
				if(result == null)
					result = caseBAdvice(bConcern);
				if(result == null)
					result = caseBFunctionContainer(bConcern);
				if(result == null)
					result = caseBExpression(bConcern);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BWITH_EXPRESSION: {
				BWithExpression bWithExpression = (BWithExpression) theEObject;
				T result = caseBWithExpression(bWithExpression);
				if(result == null)
					result = caseBExpression(bWithExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCONCERN_CONTEXT: {
				BConcernContext bConcernContext = (BConcernContext) theEObject;
				T result = caseBConcernContext(bConcernContext);
				if(result == null)
					result = caseBExpression(bConcernContext);
				if(result == null)
					result = caseBFunctionContainer(bConcernContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFUNCTION: {
				BFunction bFunction = (BFunction) theEObject;
				T result = caseBFunction(bFunction);
				if(result == null)
					result = caseIFunction(bFunction);
				if(result == null)
					result = caseBExpression(bFunction);
				if(result == null)
					result = caseIGenericDeclaration(bFunction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFUNCTION_WRAPPER: {
				BFunctionWrapper bFunctionWrapper = (BFunctionWrapper) theEObject;
				T result = caseBFunctionWrapper(bFunctionWrapper);
				if(result == null)
					result = caseIFunction(bFunctionWrapper);
				if(result == null)
					result = caseBExpression(bFunctionWrapper);
				if(result == null)
					result = caseIGenericDeclaration(bFunctionWrapper);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BNAME_PREDICATE: {
				BNamePredicate bNamePredicate = (BNamePredicate) theEObject;
				T result = caseBNamePredicate(bNamePredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFUNCTION_NAME_PREDICATE: {
				BFunctionNamePredicate bFunctionNamePredicate = (BFunctionNamePredicate) theEObject;
				T result = caseBFunctionNamePredicate(bFunctionNamePredicate);
				if(result == null)
					result = caseBExpression(bFunctionNamePredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BFUNCTION_CONCERN_CONTEXT: {
				BFunctionConcernContext bFunctionConcernContext = (BFunctionConcernContext) theEObject;
				T result = caseBFunctionConcernContext(bFunctionConcernContext);
				if(result == null)
					result = caseBConcernContext(bFunctionConcernContext);
				if(result == null)
					result = caseBExpression(bFunctionConcernContext);
				if(result == null)
					result = caseBFunctionContainer(bFunctionConcernContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPARAMETER_PREDICATE: {
				BParameterPredicate bParameterPredicate = (BParameterPredicate) theEObject;
				T result = caseBParameterPredicate(bParameterPredicate);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPROCEED_EXPRESSION: {
				BProceedExpression bProceedExpression = (BProceedExpression) theEObject;
				T result = caseBProceedExpression(bProceedExpression);
				if(result == null)
					result = caseBExpression(bProceedExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BDELEGATING_CONTEXT: {
				BDelegatingContext bDelegatingContext = (BDelegatingContext) theEObject;
				T result = caseBDelegatingContext(bDelegatingContext);
				if(result == null)
					result = caseBInnerContext(bDelegatingContext);
				if(result == null)
					result = caseBExecutionContext(bDelegatingContext);
				if(result == null)
					result = caseITypedValueContainer(bDelegatingContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BWRAPPING_CONTEXT: {
				BWrappingContext bWrappingContext = (BWrappingContext) theEObject;
				T result = caseBWrappingContext(bWrappingContext);
				if(result == null)
					result = caseBDelegatingContext(bWrappingContext);
				if(result == null)
					result = caseBInnerContext(bWrappingContext);
				if(result == null)
					result = caseBExecutionContext(bWrappingContext);
				if(result == null)
					result = caseITypedValueContainer(bWrappingContext);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_META_CLASS: {
				B3MetaClass b3MetaClass = (B3MetaClass) theEObject;
				T result = caseB3MetaClass(b3MetaClass);
				if(result == null)
					result = caseIType(b3MetaClass);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BEXPRESSION_WRAPPER: {
				BExpressionWrapper bExpressionWrapper = (BExpressionWrapper) theEObject;
				T result = caseBExpressionWrapper(bExpressionWrapper);
				if(result == null)
					result = caseBExpression(bExpressionWrapper);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BWITH_CONTEXT_EXPRESSION: {
				BWithContextExpression bWithContextExpression = (BWithContextExpression) theEObject;
				T result = caseBWithContextExpression(bWithContextExpression);
				if(result == null)
					result = caseBExpression(bWithContextExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.ITYPED_VALUE_CONTAINER: {
				ITypedValueContainer iTypedValueContainer = (ITypedValueContainer) theEObject;
				T result = caseITypedValueContainer(iTypedValueContainer);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCALL_FEATURE: {
				BCallFeature bCallFeature = (BCallFeature) theEObject;
				T result = caseBCallFeature(bCallFeature);
				if(result == null)
					result = caseBCallExpression(bCallFeature);
				if(result == null)
					result = caseBParameterizedExpression(bCallFeature);
				if(result == null)
					result = caseBExpression(bCallFeature);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCALL_NAMED_FUNCTION: {
				BCallNamedFunction bCallNamedFunction = (BCallNamedFunction) theEObject;
				T result = caseBCallNamedFunction(bCallNamedFunction);
				if(result == null)
					result = caseBCallExpression(bCallNamedFunction);
				if(result == null)
					result = caseBParameterizedExpression(bCallNamedFunction);
				if(result == null)
					result = caseBExpression(bCallNamedFunction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BCALL_FUNCTION: {
				BCallFunction bCallFunction = (BCallFunction) theEObject;
				T result = caseBCallFunction(bCallFunction);
				if(result == null)
					result = caseBCallExpression(bCallFunction);
				if(result == null)
					result = caseBParameterizedExpression(bCallFunction);
				if(result == null)
					result = caseBExpression(bCallFunction);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BPATTERN_LITERAL_EXPRESSION: {
				BPatternLiteralExpression bPatternLiteralExpression = (BPatternLiteralExpression) theEObject;
				T result = caseBPatternLiteralExpression(bPatternLiteralExpression);
				if(result == null)
					result = caseBExpression(bPatternLiteralExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.BSIMPLE_PATTERN_EXPRESSION: {
				BSimplePatternExpression bSimplePatternExpression = (BSimplePatternExpression) theEObject;
				T result = caseBSimplePatternExpression(bSimplePatternExpression);
				if(result == null)
					result = caseBPatternLiteralExpression(bSimplePatternExpression);
				if(result == null)
					result = caseBExpression(bSimplePatternExpression);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.INAMED_VALUE: {
				INamedValue iNamedValue = (INamedValue) theEObject;
				T result = caseINamedValue(iNamedValue);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case B3backendPackage.B3_TYPE: {
				B3Type b3Type = (B3Type) theEObject;
				T result = caseB3Type(b3Type);
				if(result == null)
					result = caseIType(b3Type);
				if(result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

} // B3backendSwitch
