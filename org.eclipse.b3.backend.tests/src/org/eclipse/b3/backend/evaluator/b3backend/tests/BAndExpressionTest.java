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
import org.eclipse.b3.backend.evaluator.b3backend.BAndExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BAnd Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BAndExpressionTest extends BBinaryExpressionTest {

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
		TestRunner.run(BAndExpressionTest.class);
	}

	/**
	 * Constructs a new BAnd Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAndExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BAnd Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BAndExpression getFixture() {
		return (BAndExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBAndExpression());
		setEngine(new B3Engine());
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
		setEngine(null);
	}
	@Override
	public void testEvaluate__BExecutionContext() {
	
		BLiteralExpression left = B3backendFactory.eINSTANCE.createBLiteralExpression();
		left.setValue(Boolean.TRUE);
		BLiteralExpression right = B3backendFactory.eINSTANCE.createBLiteralExpression();
		right.setValue(Boolean.TRUE);
		BAndExpression expr = getFixture();
		expr.setLeftExpr(left);
		expr.setRightExpr(right);
		try {
			assertBooleanTrue(expr.evaluate(getEngine().getContext()));
		} catch (Throwable e) {
			e.printStackTrace();
			fail("True || True => Exception");
		}
		
		left.setValue(Boolean.FALSE);
		expr.setLeftExpr(left);
		expr.setRightExpr(right);
		try {
			assertBooleanFalse(expr.evaluate(getEngine().getContext()));
		} catch (Throwable e) {
			e.printStackTrace();
			fail("False || True => Exception");
		}
	
		expr.setLeftExpr(right);
		expr.setRightExpr(left);
		try {
			assertBooleanFalse(expr.evaluate(getEngine().getContext()));
		} catch (Throwable e) {
			e.printStackTrace();
			fail("True || False => Exception");
		}
		expr.setLeftExpr(left);
		right.setValue(Boolean.FALSE);
		expr.setRightExpr(right);
		try {
			assertBooleanFalse(expr.evaluate(getEngine().getContext()));
		} catch (Throwable e) {
			e.printStackTrace();
			fail("False || False => Exception");
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
		assertEquals(Boolean.class, getFixture().getDeclaredType(engine.getContext()));
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

} //BAndExpressionTest
