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
import org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCatch;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTryExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BTry Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BTryExpressionTest extends BExpressionTest {

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
		TestRunner.run(BTryExpressionTest.class);
	}

	/**
	 * Constructs a new BTry Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTryExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BTry Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BTryExpression getFixture() {
		return (BTryExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBTryExpression());
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

	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;

			ctx.defineVariableValue("finale", "not seen", String.class);
			// a failing try Expr
			//
			BTryExpression eTry = b3.createBTryExpression();
			BVariableExpression tryExpr;
			eTry.setTryExpr(tryExpr = b3.createBVariableExpression()); // tries to get variable 'null'
			EList<BCatch> catchBlocks = eTry.getCatchBlocks();
			BCatch catcher = b3.createBCatch();
			catchBlocks.add(catcher);
			catcher.setType(Throwable.class);
			catcher.setName("e");
			BVariableExpression catchExpr = b3.createBVariableExpression();
			catchExpr.setName("e");
			catcher.setCatchExpr(catchExpr);
			BAssignmentExpression finallyExpr = b3.createBAssignmentExpression();
			BVariableExpression aVar;
			finallyExpr.setLeftExpr(aVar = b3.createBVariableExpression());
			aVar.setName("finale");
			BLiteralExpression aVal;
			finallyExpr.setRightExpr(aVal = b3.createBLiteralExpression());
			aVal.setValue("finally seen");
			eTry.setFinallyExpr(finallyExpr);

			Object result = eTry.evaluate(ctx);
			assertTrue(result instanceof Throwable);
			assertEquals("finally seen", ctx.getValue("finale"));

			// check that finally is called on successful try expression
			tryExpr.setName("finale"); // i.e. try to access the value of 'finale'
			ctx.getLValue("finale").set("finally not seen");
			result = eTry.evaluate(ctx);
			assertEquals("finally not seen", result);
			assertEquals("finally seen", ctx.getValue("finale"));

		}
		catch(AssertionFailedError t) {
			throw t;
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
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;

			ctx.defineVariableValue("finale", "not seen", String.class);
			ctx.defineVariableValue("anInt", 42, Integer.class);
			ctx.defineVariableValue("aDouble", 42.0, Double.class);

			// a working try Expr
			//
			BTryExpression eTry = b3.createBTryExpression();
			BVariableExpression tryExpr;
			eTry.setTryExpr(tryExpr = b3.createBVariableExpression());
			tryExpr.setName("aDouble");

			// Catches...

			EList<BCatch> catchBlocks = eTry.getCatchBlocks();
			// Catch 1
			{
				BCatch catcher = b3.createBCatch();
				catchBlocks.add(catcher);
				catcher.setType(Throwable.class);
				catcher.setName("e");
				BVariableExpression catchExpr = b3.createBVariableExpression();
				catchExpr.setName("anInt");
				catcher.setCatchExpr(catchExpr);
			}
			// Catch 2
			{
				BCatch catcher = b3.createBCatch();
				catchBlocks.add(catcher);
				catcher.setType(Exception.class);
				catcher.setName("e");
				BVariableExpression catchExpr = b3.createBVariableExpression();
				catchExpr.setName("aDouble");
				catcher.setCatchExpr(catchExpr);
			}

			assertEquals(Number.class, eTry.getDeclaredType(ctx));
		}
		catch(AssertionFailedError t) {
			throw t;
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}

	}

	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}
} // BTryExpressionTest
