/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BIfExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BIf Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BIfExpressionTest extends BExpressionTest {

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
		TestRunner.run(BIfExpressionTest.class);
	}

	/**
	 * Constructs a new BIf Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIfExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BIf Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BIfExpression getFixture() {
		return (BIfExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBIfExpression());
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
		// if true then 1 else 2
		// if true then 1 else if true then 3 else 2
		try {
		B3Engine e = new B3Engine();
		e.getContext().defineVariableValue("a", Boolean.TRUE, Boolean.class);
		LValue lvalA = e.getContext().getLValue("a");
		BIfExpression ife = getFixture();
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		BVariableExpression varA = b3.createBVariableExpression();
		varA.setName("a");
		ife.setConditionExpr(varA);
		BLiteralExpression one = b3.createBLiteralExpression();
		one.setValue(new Integer(1));
		BLiteralExpression two = b3.createBLiteralExpression();
		two.setValue(new Integer(2));
		BLiteralExpression three = b3.createBLiteralExpression();
		three.setValue(new Integer(3));
		ife.setThenExpr(one);
		ife.setElseExpr(two);
		
		assertEquals(ife.evaluate(e.getContext()), new Integer(1));
		lvalA.set(Boolean.FALSE);
		assertEquals(ife.evaluate(e.getContext()), new Integer(2));
		
		BIfExpression if2 = b3.createBIfExpression();
		BVariableExpression varB;
		if2.setConditionExpr(varB = b3.createBVariableExpression());
		if2.setThenExpr(two);
		if2.setElseExpr(three);
		varB.setName("b");
		e.getContext().defineVariableValue("b", Boolean.TRUE, Boolean.class);
		LValue lvalB = e.getContext().getLValue("b");
		ife.setElseExpr(if2);

		lvalA.set(Boolean.FALSE);
		assertEquals(ife.evaluate(e.getContext()), new Integer(2));
		lvalB.set(Boolean.FALSE);
		assertEquals(ife.evaluate(e.getContext()), new Integer(3));
		
		
		} catch (Throwable e1) {
			e1.printStackTrace();
			fail();
		}
	}
	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}
	// TODO - THIS IS A COPY OF EVAL - SHOULD TEST RETURN TYPE
	@Override
	public void testGetDeclaredType__BExecutionContext() {
		// if true then 1 else 2
		// if true then 1 else if true then 3 else 2
		try {
		B3Engine e = new B3Engine();
		e.getContext().defineVariableValue("a", Boolean.TRUE, Boolean.class);
		LValue lvalA = e.getContext().getLValue("a");
		BIfExpression ife = getFixture();
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		BVariableExpression varA = b3.createBVariableExpression();
		varA.setName("a");
		ife.setConditionExpr(varA);
		BLiteralExpression one = b3.createBLiteralExpression();
		one.setValue(new Integer(1));
		BLiteralExpression two = b3.createBLiteralExpression();
		two.setValue(new Integer(2));
		BLiteralExpression three = b3.createBLiteralExpression();
		three.setValue(new Integer(3));
		ife.setThenExpr(one);
		ife.setElseExpr(two);
		
		assertEquals(ife.evaluate(e.getContext()), new Integer(1));
		lvalA.set(Boolean.FALSE);
		assertEquals(ife.evaluate(e.getContext()), new Integer(2));
		
		BIfExpression if2 = b3.createBIfExpression();
		BVariableExpression varB;
		if2.setConditionExpr(varB = b3.createBVariableExpression());
		if2.setThenExpr(two);
		if2.setElseExpr(three);
		varB.setName("b");
		e.getContext().defineVariableValue("b", Boolean.TRUE, Boolean.class);
		LValue lvalB = e.getContext().getLValue("b");
		ife.setElseExpr(if2);

		lvalA.set(Boolean.FALSE);
		assertEquals(ife.evaluate(e.getContext()), new Integer(2));
		lvalB.set(Boolean.FALSE);
		assertEquals(ife.evaluate(e.getContext()), new Integer(3));
		
		
		} catch (Throwable e1) {
			e1.printStackTrace();
			fail();
		}
	}
} //BIfExpressionTest
