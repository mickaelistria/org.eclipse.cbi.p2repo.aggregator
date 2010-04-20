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
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BChained Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BChainedExpressionTest extends BExpressionTest {

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
		TestRunner.run(BChainedExpressionTest.class);
	}

	/**
	 * Constructs a new BChained Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BChainedExpressionTest(String name) {
		super(name);
	}

	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BChainedExpression block = b3.createBChainedExpression();
			EList<BExpression> list = block.getExpressions();
			BLiteralExpression e;
			list.add(e = b3.createBLiteralExpression());
			e.setValue("a");
			list.add(e = b3.createBLiteralExpression());
			e.setValue("b");
			list.add(e = b3.createBLiteralExpression());
			e.setValue("c");

			Object result = block.evaluate(ctx);
			assertEquals("c", result);

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
			BChainedExpression block = b3.createBChainedExpression();
			EList<BExpression> list = block.getExpressions();
			BLiteralExpression e;
			list.add(e = b3.createBLiteralExpression());
			e.setValue(1);
			list.add(e = b3.createBLiteralExpression());
			e.setValue("hello");
			list.add(e = b3.createBLiteralExpression());
			e.setValue(new Double(3.14));

			assertEquals(Double.class, block.getDeclaredType(ctx));

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
	 * Returns the fixture for this BChained Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BChainedExpression getFixture() {
		return (BChainedExpression) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBChainedExpression());
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
} // BChainedExpressionTest
