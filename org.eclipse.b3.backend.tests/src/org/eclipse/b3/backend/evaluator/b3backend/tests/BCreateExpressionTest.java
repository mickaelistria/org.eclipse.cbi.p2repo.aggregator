/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import java.lang.reflect.Type;
import java.util.HashMap;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCreate Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BCreateExpressionTest extends BParameterizedExpressionTest {

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
		TestRunner.run(BCreateExpressionTest.class);
	}

	/**
	 * Constructs a new BCreate Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BCreateExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BCreate Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BCreateExpression getFixture() {
		return (BCreateExpression) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBCreateExpression());
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
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();

			BCreateExpression newcall = b3.createBCreateExpression();
			newcall.setName("a"); // TODO: Test alias handling
			BLiteralType literalType = b3.createBLiteralType();
			literalType.setType(HashMap.class);
			newcall.setTypeExpr(literalType);
			assertTrue("Should have been a hash map.", newcall.evaluate(ctx).getClass() == HashMap.class);
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

			BCreateExpression newcall = b3.createBCreateExpression();
			newcall.setName("a"); // TODO: Test alias handling
			BLiteralType literalType = b3.createBLiteralType();
			literalType.setType(HashMap.class);
			newcall.setTypeExpr(literalType);
			Type result = newcall.getDeclaredType(ctx);
			assertTrue("Should have been a hash map.", TypeUtils.getRaw(result) == HashMap.class);
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
} // BCreateExpressionTest
