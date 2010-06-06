/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import java.lang.reflect.Type;
import java.util.Map;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BMapEntry;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BLiteral Map Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BLiteralMapExpressionTest extends BExpressionTest {

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
		TestRunner.run(BLiteralMapExpressionTest.class);
	}

	/**
	 * Constructs a new BLiteral Map Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLiteralMapExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BLiteral Map Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BLiteralMapExpression getFixture() {
		return (BLiteralMapExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBLiteralMapExpression());
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

			BLiteralMapExpression map = b3.createBLiteralMapExpression();
			map.setKeyType(String.class);
			map.setValueType(Integer.class);
			EList<BMapEntry> entries = map.getEntries();

			BMapEntry e = b3.createBMapEntry();
			BLiteralExpression key;
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key1");
			BLiteralExpression val;
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(1);
			entries.add(e);

			e = b3.createBMapEntry();
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key2");
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(2);
			entries.add(e);

			e = b3.createBMapEntry();
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key3");
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(3);
			entries.add(e);

			Object result = map.evaluate(ctx);
			assertTrue(result instanceof Map<?, ?>);
			assertEquals(1, ((Map<?, ?>) result).get("key1"));
			assertEquals(2, ((Map<?, ?>) result).get("key2"));
			assertEquals(3, ((Map<?, ?>) result).get("key3"));
			assertEquals(3, ((Map<?, ?>) result).size());

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	public void testEvaluate_Errors() {
		try {
			B3Engine engine = new B3Engine();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			BExecutionContext ctx = engine.getContext();

			BLiteralMapExpression map = b3.createBLiteralMapExpression();
			map.setKeyType(String.class);
			map.setValueType(String.class);
			EList<BMapEntry> entries = map.getEntries();

			BMapEntry e = b3.createBMapEntry();
			BLiteralExpression key;
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key1");
			BLiteralExpression val;
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(1);
			entries.add(e);

			e = b3.createBMapEntry();
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key2");
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(2);
			entries.add(e);

			e = b3.createBMapEntry();
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key3");
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(3);
			entries.add(e);

			Object result = map.evaluate(ctx);
			assertTrue(result instanceof Map<?, ?>);
			assertEquals(1, ((Map<?, ?>) result).get("key1"));
			assertEquals(2, ((Map<?, ?>) result).get("key2"));
			assertEquals(3, ((Map<?, ?>) result).get("key3"));
			assertEquals(3, ((Map<?, ?>) result).size());

		}
		catch(B3BackendException e) {
			/* this is the expected result */
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

			BLiteralMapExpression map = b3.createBLiteralMapExpression();
			map.setKeyType(String.class);
			map.setValueType(Integer.class);
			EList<BMapEntry> entries = map.getEntries();

			BMapEntry e = b3.createBMapEntry();
			BLiteralExpression key;
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key1");
			BLiteralExpression val;
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(1);
			entries.add(e);

			e = b3.createBMapEntry();
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key2");
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(2);
			entries.add(e);

			e = b3.createBMapEntry();
			e.setKey(key = b3.createBLiteralExpression());
			key.setValue("key3");
			e.setValue(val = b3.createBLiteralExpression());
			val.setValue(3);
			entries.add(e);

			// TODO: Type system sucks, can not compare against a class
			// TODO: Handle generics
			assertEquals(Map.class, TypeUtils.getCommonSuperType(new Type[] { map.getDeclaredType(ctx), Map.class }));

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
} // BLiteralMapExpressionTest
