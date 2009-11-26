/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import java.lang.reflect.Type;
import java.util.List;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BLiteral List Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BLiteralListExpressionTest extends BExpressionTest {

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
		TestRunner.run(BLiteralListExpressionTest.class);
	}

	/**
	 * Constructs a new BLiteral List Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralListExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BLiteral List Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BLiteralListExpression getFixture() {
		return (BLiteralListExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBLiteralListExpression());
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
			
			BLiteralListExpression list = b3.createBLiteralListExpression();
			EList<BExpression> entries = list.getEntries();
			BLiteralExpression int1;
			entries.add(int1 = b3.createBLiteralExpression()); int1.setValue(1);
			BLiteralExpression int2;
			entries.add(int2 = b3.createBLiteralExpression()); int2.setValue(2);
			BLiteralExpression int3;
			entries.add(int3 = b3.createBLiteralExpression()); int3.setValue(3);
			
			Object result = list.evaluate(ctx);
			assertTrue(result instanceof List<?>);
			assertEquals(1, ((List<?>)result).get(0));
			assertEquals(2, ((List<?>)result).get(1));
			assertEquals(3, ((List<?>)result).get(2));
			assertEquals(3, ((List<?>)result).size());
			
			
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	public void testEvaluate_Errors() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();
			
			BLiteralListExpression list = b3.createBLiteralListExpression();
			list.setEntryType(String.class);
			EList<BExpression> entries = list.getEntries();
			BLiteralExpression int1;
			entries.add(int1 = b3.createBLiteralExpression()); int1.setValue(1);
			BLiteralExpression int2;
			entries.add(int2 = b3.createBLiteralExpression()); int2.setValue(2);
			BLiteralExpression int3;
			entries.add(int3 = b3.createBLiteralExpression()); int3.setValue(3);
			
			Object result = list.evaluate(ctx);
			assertTrue(result instanceof List<?>);
			assertEquals(1, ((List<?>)result).get(0));
			assertEquals(2, ((List<?>)result).get(1));
			assertEquals(3, ((List<?>)result).get(2));
			assertEquals(3, ((List<?>)result).size());
			
			
		} catch (B3BackendException e) {
			/* this is the expected result */
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
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();
			
			BLiteralListExpression list = b3.createBLiteralListExpression();
			EList<BExpression> entries = list.getEntries();
			BLiteralExpression int1;
			entries.add(int1 = b3.createBLiteralExpression()); int1.setValue(1);
			BLiteralExpression int2;
			entries.add(int2 = b3.createBLiteralExpression()); int2.setValue(2);
			BLiteralExpression int3;
			entries.add(int3 = b3.createBLiteralExpression()); int3.setValue(3);

			// TODO: Typesystem sucks - comparison with equals against a class is == 
			// cheating...
			assertEquals(List.class, TypeUtils.getCommonSuperType(new Type[] {list.getDeclaredType(ctx), List.class}));
			
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
		
	}
} //BLiteralListExpressionTest
