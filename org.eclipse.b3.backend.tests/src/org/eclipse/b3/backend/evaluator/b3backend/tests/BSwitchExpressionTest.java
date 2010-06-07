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
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BSwitch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression#hasUnreachableCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Has Unreachable Case</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BSwitchExpressionTest extends BExpressionTest {

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
		TestRunner.run(BSwitchExpressionTest.class);
	}

	/**
	 * Constructs a new BSwitch Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BSwitchExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BSwitch Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BSwitchExpression getFixture() {
		return (BSwitchExpression) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBSwitchExpression());
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

	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BSwitchExpression swe = getFixture();

			BLiteralExpression int1 = b3.createBLiteralExpression();
			int1.setValue(new Integer(1));
			BLiteralExpression int2 = b3.createBLiteralExpression();
			int2.setValue(new Integer(2));

			// switch a literal value against 2 cases
			ctx.defineVariableValue("a", "hello", String.class);
			LValue varA = ctx.getLValue("a");

			BVariableExpression val1 = b3.createBVariableExpression();
			val1.setName("a");
			swe.setSwitchExpression(val1);

			BLiteralExpression val2 = b3.createBLiteralExpression();
			val2.setValue("goodbye");

			BLiteralExpression val3 = b3.createBLiteralExpression();
			val3.setValue("hello");

			EList<BCase> caseList = swe.getCaseList();
			BCase case1 = b3.createBCase();
			case1.setConditionExpr(val2);
			case1.setThenExpr(int1);
			caseList.add(case1);

			BCase case2 = b3.createBCase();
			case2.setConditionExpr(val3);
			case2.setThenExpr(int2);
			caseList.add(case2);

			varA.set("hello");
			assertEquals(new Integer(2), swe.evaluate(ctx));
			varA.set("goodbye");
			assertEquals(new Integer(1), swe.evaluate(ctx));
			varA.set("tjabba");
			assertNull(swe.evaluate(ctx));

			BCase case3 = b3.createBCase();
			case3.setConditionExpr(b3.createBLiteralAny());
			case3.setThenExpr(int2);
			caseList.add(case3);
			assertEquals(new Integer(2), swe.evaluate(ctx));

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BSwitchExpression swe = getFixture();

			BLiteralExpression int1 = b3.createBLiteralExpression();
			int1.setValue(new Integer(1));
			BLiteralExpression int2 = b3.createBLiteralExpression();
			int2.setValue(new Integer(2));
			BLiteralExpression str1 = b3.createBLiteralExpression();
			str1.setValue("and now for something different");

			// switch a literal value against 2 cases
			ctx.defineVariableValue("a", "hello", String.class);
			// LValue varA = ctx.getLValue("a");

			BVariableExpression val1 = b3.createBVariableExpression();
			val1.setName("a");
			swe.setSwitchExpression(val1);

			BLiteralExpression val2 = b3.createBLiteralExpression();
			val2.setValue("goodbye");

			BLiteralExpression val3 = b3.createBLiteralExpression();
			val3.setValue("hello");

			EList<BCase> caseList = swe.getCaseList();
			BCase case1 = b3.createBCase();
			case1.setConditionExpr(val2);
			case1.setThenExpr(int1);
			caseList.add(case1);

			BCase case2 = b3.createBCase();
			case2.setConditionExpr(val3);
			case2.setThenExpr(int2);
			caseList.add(case2);

			assertEquals(Integer.class, swe.getDeclaredType(ctx));
			BCase case3 = b3.createBCase();
			case3.setConditionExpr(b3.createBLiteralAny());
			case3.setThenExpr(str1);
			caseList.add(case3);
			assertEquals(Object.class, swe.getDeclaredType(ctx));

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression#hasUnreachableCase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Has Unreachable Case</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression#hasUnreachableCase(org.eclipse.emf.common.util.DiagnosticChain,
	 *      java.util.Map)
	 * @generated
	 */
	public void testHasUnreachableCase__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
} // BSwitchExpressionTest
