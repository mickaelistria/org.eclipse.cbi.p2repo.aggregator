/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BVariable Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BVariableExpressionTest extends BExpressionTest {

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
		TestRunner.run(BVariableExpressionTest.class);
	}

	/**
	 * Constructs a new BVariable Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BVariableExpressionTest(String name) {
		super(name);
	}

	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();
			ctx.defineVariableValue("x", "hello", String.class);
			BVariableExpression var = b3.createBVariableExpression();
			var.setName("x");
			assertEquals("hello", var.evaluate(ctx));

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();
			ctx.defineVariableValue("x", "hello", String.class);
			BVariableExpression var = b3.createBVariableExpression();
			var.setName("x");

			assertEquals(String.class, var.getDeclaredType(ctx));

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	@Override
	public void testGetLValue__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();
			ctx.defineVariableValue("x", "hello", String.class);
			BVariableExpression var = b3.createBVariableExpression();
			var.setName("x");
			LValue lval = var.getLValue(ctx);
			assertEquals("hello", lval.get());
			lval.set("goodbye");
			assertEquals("goodbye", lval.get());

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	/**
	 * Returns the fixture for this BVariable Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BVariableExpression getFixture() {
		return (BVariableExpression) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBVariableExpression());
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
} // BVariableExpressionTest
