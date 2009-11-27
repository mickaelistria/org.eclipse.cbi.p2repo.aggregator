/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object) <em>Evaluate</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BCaseTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The fixture for this BCase test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCase fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BCaseTest.class);
	}

	/**
	 * Constructs a new BCase test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCaseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BCase test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BCase fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BCase test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCase getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCase#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, java.lang.Object)
	 * @generated NOT
	 */
	public void testEvaluate__BExecutionContext_Object() {
		// too difficult to test in isolation - tested as part of switch expression
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCase#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCase#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated NOT
	 */
	public void testGetDeclaredType__BExecutionContext() {
		// not meaningful to test in isolation - tested as part of switch expression
	}
} //BCaseTest
