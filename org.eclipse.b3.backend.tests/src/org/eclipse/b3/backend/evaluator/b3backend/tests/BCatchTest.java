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
import org.eclipse.b3.backend.evaluator.b3backend.BCatch;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Evaluate</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BCatchTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The fixture for this BCatch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCatch fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BCatchTest.class);
	}

	/**
	 * Constructs a new BCatch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCatchTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BCatch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BCatch fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BCatch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BCatch getFixture() {
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
		setFixture(B3backendFactory.eINSTANCE.createBCatch());
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
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCatch#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated NOT
	 */
	public void testEvaluate__BExecutionContext() {
		// TESTED AS PART OF TRY-CATCH, impossible to test on its own.
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BCatch#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BCatch#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated NOT
	 */
	public void testGetDeclaredType__BExecutionContext() {
		// TESTED AS PART OF TRY-CATCH
	}
	
} //BCatchTest
