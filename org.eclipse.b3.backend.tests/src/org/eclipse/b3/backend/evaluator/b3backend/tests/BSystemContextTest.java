/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BSystemContext;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BSystem Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link org.eclipse.b3.backend.evaluator.b3backend.BSystemContext#loadMethod(java.lang.String, java.lang.reflect.Type[])
 * <em>Load Method</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BSystemContextTest extends BExecutionContextTest {

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
		TestRunner.run(BSystemContextTest.class);
	}

	/**
	 * Constructs a new BSystem Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BSystemContextTest(String name) {
		super(name);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.BSystemContext#callFunction(java.lang.String, java.lang.Object[], java.lang.reflect.Type[], org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * <em>Call Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSystemContext#callFunction(java.lang.String, java.lang.Object[],
	 *      java.lang.reflect.Type[], org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated NOT
	 */
	public void testCallFunction__String_Object_Type_BExecutionContext() {
		// Difficult to test without also testing function, function definition
		// context set up - this is done in BCallExpression test
		//
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.BSystemContext#loadMethod(java.lang.String, java.lang.reflect.Type[])
	 * <em>Load Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSystemContext#loadMethod(java.lang.String,
	 *      java.lang.reflect.Type[])
	 * @generated
	 */
	public void testLoadMethod__String_Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Returns the fixture for this BSystem Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BSystemContext getFixture() {
		return (BSystemContext) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBSystemContext());
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

} // BSystemContextTest
