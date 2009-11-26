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
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BBinary Op Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BBinaryOpExpressionTest extends BBinaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BBinaryOpExpressionTest.class);
	}

	/**
	 * Constructs a new BBinary Op Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBinaryOpExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BBinary Op Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BBinaryOpExpression getFixture() {
		return (BBinaryOpExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBBinaryOpExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			ctx.defineVariableValue("a", new Integer(2), Integer.class);
			ctx.defineVariableValue("b", new Integer(3), Integer.class);
			
			BBinaryOpExpression op = b3.createBBinaryOpExpression();
			BVariableExpression left;
			op.setLeftExpr(left = b3.createBVariableExpression());
			BVariableExpression right;
			op.setRightExpr(right = b3.createBVariableExpression());
			left.setName("a");
			right.setName("b");
			
			op.setFunctionName("+");
			assertEquals(5, op.evaluate(ctx));
			op.setFunctionName("-");
			assertEquals(-1, op.evaluate(ctx));
			op.setFunctionName("*");
			assertEquals(6, op.evaluate(ctx));
			
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}
	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			ctx.defineVariableValue("a", new Integer(2), Integer.class);
			ctx.defineVariableValue("b", new Integer(3), Integer.class);
			
			BBinaryOpExpression op = b3.createBBinaryOpExpression();
			BVariableExpression left;
			op.setLeftExpr(left = b3.createBVariableExpression());
			BVariableExpression right;
			op.setRightExpr(right = b3.createBVariableExpression());
			left.setName("a");
			right.setName("b");
			
			op.setFunctionName("+");
			assertEquals(Number.class, op.getDeclaredType(ctx));
			op.setFunctionName("-");
			assertEquals(Number.class, op.getDeclaredType(ctx));
			op.setFunctionName("*");
			assertEquals(Number.class, op.getDeclaredType(ctx));
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}

	}
} //BBinaryOpExpressionTest
