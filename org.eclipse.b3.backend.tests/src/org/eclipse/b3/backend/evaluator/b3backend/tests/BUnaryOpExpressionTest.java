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
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BUnary Op Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BUnaryOpExpressionTest extends BUnaryExpressionTest {

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
		TestRunner.run(BUnaryOpExpressionTest.class);
	}

	/**
	 * Constructs a new BUnary Op Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BUnaryOpExpressionTest(String name) {
		super(name);
	}

	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();

			BUnaryOpExpression eUnary = b3.createBUnaryOpExpression();
			BLiteralExpression e;
			eUnary.setExpr(e = b3.createBLiteralExpression());
			e.setValue(new Integer(-3));
			eUnary.setFunctionName("~");
			assertEquals(new Integer(2), eUnary.evaluate(ctx));
			e.setValue(Boolean.TRUE);
			eUnary.setFunctionName("!");
			assertEquals(Boolean.FALSE, eUnary.evaluate(ctx));
			e.setValue(Boolean.FALSE);
			assertEquals(Boolean.TRUE, eUnary.evaluate(ctx));

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

			BUnaryOpExpression eUnary = b3.createBUnaryOpExpression();
			BLiteralExpression e;
			eUnary.setExpr(e = b3.createBLiteralExpression());
			e.setValue(new Integer(-3));
			eUnary.setFunctionName("~");
			assertEquals(Number.class, eUnary.getDeclaredType(ctx));

			e.setValue(Boolean.TRUE);
			eUnary.setFunctionName("!");
			assertEquals(Boolean.class, eUnary.getDeclaredType(ctx));

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
		super.assertLValShouldFail();
	}

	/**
	 * Returns the fixture for this BUnary Op Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BUnaryOpExpression getFixture() {
		return (BUnaryOpExpression) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBUnaryOpExpression());
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
} // BUnaryOpExpressionTest
