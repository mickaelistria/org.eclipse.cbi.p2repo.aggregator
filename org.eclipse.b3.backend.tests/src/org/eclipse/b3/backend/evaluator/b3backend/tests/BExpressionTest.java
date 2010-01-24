/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.TestCase;
import junit.framework.AssertionFailedError;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BExpression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Evaluate</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getLValue(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get LValue</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BExpressionTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The fixture for this BExpression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BExpression fixture = null;

	/**
	 * Constructs a new BExpression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpressionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BExpression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BExpression fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BExpression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BExpression getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression#evaluate(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated NOT
	 */
	@SuppressWarnings("unused")
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();
			// PUT STUFF HERE IN OVERRIDDEN METHODS
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
		fail("THIS IS AN ABSTRACT TEST - SHOULD BE OVERRIDDEN");
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getLValue(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get LValue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression#getLValue(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated
	 */
	public void testGetLValue__BExecutionContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
	
	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExpression#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext) <em>Get Declared Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExpression#getDeclaredType(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext)
	 * @generated
	 */
	public void testGetDeclaredType__BExecutionContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	protected void assertLValShouldFail() {
		try {
			getFixture().getLValue(getEngine().getContext());
		} catch (Throwable e) {
			return;
		}
		fail("Get LVal should have thrown an exception");
	}
	protected B3Engine engine = null;

	protected void setEngine(B3Engine engine) {
		this.engine = engine;
	}
	protected B3Engine getEngine() { return engine; }
	
	protected void assertBooleanTrue(Object value) {
		assertEquals("Class should be Boolean", Boolean.class, value.getClass());
		assertTrue(((Boolean)value).booleanValue());
	}
	protected void assertBooleanFalse(Object value) {
		assertEquals("Class should be Boolean", Boolean.class, value.getClass());
		assertFalse(((Boolean)value).booleanValue());
	}

} //BExpressionTest
