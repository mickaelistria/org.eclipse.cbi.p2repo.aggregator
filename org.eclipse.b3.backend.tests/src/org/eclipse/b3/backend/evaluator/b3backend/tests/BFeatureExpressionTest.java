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
import org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BFeature Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BFeatureExpressionTest extends BExpressionTest {

	public static class Person {
		String name;

		public Person() {
			name = "A person";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

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
		TestRunner.run(BFeatureExpressionTest.class);
	}

	/**
	 * Constructs a new BFeature Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFeatureExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BFeature Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BFeatureExpression getFixture() {
		return (BFeatureExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBFeatureExpression());
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
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();

			BFeatureExpression fe = b3.createBFeatureExpression();
			BLiteralExpression val = b3.createBLiteralExpression();

			// Test an EObject
			fe.setObjExpr(val);
			val.setValue(ctx);
			fe.setFeatureName("parentContext");
			Object result = fe.evaluate(ctx);
			assertEquals(result, ctx.getParentContext());

			// Test a java object
			val.setValue("I am a teapot");
			fe.setFeatureName("class");
			result = fe.evaluate(ctx);
			assertEquals(String.class, result);

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

			BFeatureExpression fe = b3.createBFeatureExpression();
			BLiteralExpression val = b3.createBLiteralExpression();

			// Test an EObject
			fe.setObjExpr(val);
			val.setValue(ctx);
			fe.setFeatureName("parentContext");
			assertEquals(BExecutionContext.class, fe.getDeclaredType(ctx));

			// Test a java object
			val.setValue(new Person());
			fe.setFeatureName("name");

			assertEquals(String.class, fe.getDeclaredType(ctx));

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

			BFeatureExpression fe = b3.createBFeatureExpression();
			BLiteralExpression val = b3.createBLiteralExpression();

			// Test an EObject
			fe.setObjExpr(val);
			val.setValue(ctx);
			fe.setFeatureName("parentContext");
			assertEquals(ctx.getParentContext(), fe.getLValue(ctx).get());

			// Test a java object
			val.setValue(new Person());
			fe.setFeatureName("name");

			assertEquals("A person", fe.getLValue(ctx).get());
			fe.getLValue(ctx).set("Froderick");
			assertEquals("Froderick", fe.getLValue(ctx).get());

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
} // BFeatureExpressionTest
