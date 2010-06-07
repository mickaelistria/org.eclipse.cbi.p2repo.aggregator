/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BFunction Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterTypes() <em>Parameter Types</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterNames() <em>Parameter Names</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVarargArrayType() <em>Vararg Array Type</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#call(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[])
 * <em>Call</em>}</li>
 * <li>
 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#internalCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[])
 * <em>Internal Call</em>}</li>
 * <li>
 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#prepareCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[])
 * <em>Prepare Call</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getSignature() <em>Get Signature</em>}</li>
 * <li>
 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getReturnTypeForParameterTypes(java.lang.reflect.Type[], org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
 * <em>Get Return Type For Parameter Types</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BFunctionWrapperTest extends BExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BFunctionWrapperTest.class);
	}

	/**
	 * Constructs a new BFunction Wrapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BFunctionWrapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BFunction Wrapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BFunctionWrapper getFixture() {
		return (BFunctionWrapper) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBFunctionWrapper());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#call(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[])
	 * <em>Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#call(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 *      java.lang.Object[], java.lang.reflect.Type[])
	 * @generated
	 */
	public void testCall__BExecutionContext_Object_Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterNames() <em>Parameter Names</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterNames()
	 * @generated
	 */
	public void testGetParameterNames() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterTypes() <em>Parameter Types</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getParameterTypes()
	 * @generated
	 */
	public void testGetParameterTypes() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getReturnTypeForParameterTypes(java.lang.reflect.Type[], org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * <em>Get Return Type For Parameter Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getReturnTypeForParameterTypes(java.lang.reflect.Type[],
	 *      org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated
	 */
	public void testGetReturnTypeForParameterTypes__Type_BExecutionContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getSignature() <em>Get Signature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getSignature()
	 * @generated
	 */
	public void testGetSignature() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVarargArrayType() <em>Vararg Array Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#getVarargArrayType()
	 * @generated
	 */
	public void testGetVarargArrayType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#internalCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[])
	 * <em>Internal Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#internalCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 *      java.lang.Object[], java.lang.reflect.Type[])
	 * @generated
	 */
	public void testInternalCall__BExecutionContext_Object_Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#prepareCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object[], java.lang.reflect.Type[])
	 * <em>Prepare Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#prepareCall(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 *      java.lang.Object[], java.lang.reflect.Type[])
	 * @generated
	 */
	public void testPrepareCall__BExecutionContext_Object_Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#setParameterNames(java.lang.String[]) <em>Parameter Names</em>}' feature
	 * setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#setParameterNames(java.lang.String[])
	 * @generated
	 */
	public void testSetParameterNames() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#setParameterTypes(java.lang.reflect.Type[]) <em>Parameter Types</em>}'
	 * feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#setParameterTypes(java.lang.reflect.Type[])
	 * @generated
	 */
	public void testSetParameterTypes() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.IFunction#setVarargArrayType(java.lang.reflect.Type) <em>Vararg Array Type</em>}'
	 * feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.IFunction#setVarargArrayType(java.lang.reflect.Type)
	 * @generated
	 */
	public void testSetVarargArrayType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} // BFunctionWrapperTest
