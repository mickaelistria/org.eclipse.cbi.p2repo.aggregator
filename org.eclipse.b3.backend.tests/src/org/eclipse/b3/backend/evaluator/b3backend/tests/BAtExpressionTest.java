/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BAt Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BAtExpressionTest extends BExpressionTest {

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
		TestRunner.run(BAtExpressionTest.class);
	}

	/**
	 * Constructs a new BAt Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BAtExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BAt Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BAtExpression getFixture() {
		return (BAtExpression) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBAtExpression());
		setEngine(new B3Engine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
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
		BLiteralExpression x = B3backendFactory.eINSTANCE.createBLiteralExpression();
		List<String> aList = new ArrayList<String>();
		String[] values = new String[] { "at0", "at1", "at2" };
		aList.add(values[0]);
		aList.add(values[1]);
		aList.add(values[2]);
		x.setValue(aList);
		BAtExpression expr = getFixture();
		expr.setObjExpr(x);
		BLiteralExpression index = B3backendFactory.eINSTANCE.createBLiteralExpression();
		expr.setIndexExpr(index);
		for(int i = 0; i < 3; i++) {
			index.setValue(new Integer(i));
			try {
				assertEquals(expr.evaluate(getEngine().getContext()), values[i]);
			}
			catch(Throwable e) {
				e.printStackTrace();
				fail("Exception on evaluation of at expression");
			}
		}
	}

	public void testEvaluateMap__BExecutionContext() {
		BLiteralExpression x = B3backendFactory.eINSTANCE.createBLiteralExpression();
		Map<String, String> aMap = new HashMap<String, String>();
		String[] keys = new String[] { "at0", "at1", "at2" };
		String[] values = new String[] { "valat0", "valat1", "valat2" };
		aMap.put(keys[0], values[0]);
		aMap.put(keys[1], values[1]);
		aMap.put(keys[2], values[2]);
		x.setValue(aMap);
		BAtExpression expr = getFixture();
		expr.setObjExpr(x);
		BLiteralExpression index = B3backendFactory.eINSTANCE.createBLiteralExpression();
		expr.setIndexExpr(index);
		for(int i = 0; i < 3; i++) {
			index.setValue(keys[i]);
			try {
				assertEquals(expr.evaluate(getEngine().getContext()), values[i]);
			}
			catch(AssertionFailedError e) {
				throw e;
			}
			catch(Throwable e) {
				e.printStackTrace();
				fail("Exception on evaluation of at expression");
			}
		}
	}

	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;

			BLiteralListExpression aList = b3.createBLiteralListExpression();
			aList.setEntryType(String.class);

			BLiteralExpression idx = b3.createBLiteralExpression();
			idx.setValue(new Integer(0));

			BAtExpression atExpr = b3.createBAtExpression();
			atExpr.setObjExpr(aList);
			atExpr.setIndexExpr(idx);

			assertEquals(String.class, atExpr.getDeclaredType(ctx));

			BLiteralMapExpression aMap = b3.createBLiteralMapExpression();
			aMap.setKeyType(String.class);
			aMap.setValueType(String.class);
			atExpr.setObjExpr(aMap);
			idx.setValue("hello");

			assertEquals(String.class, atExpr.getDeclaredType(ctx));

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
		BLiteralExpression x = B3backendFactory.eINSTANCE.createBLiteralExpression();
		List<String> aList = new ArrayList<String>();
		String[] values = new String[] { "at0", "at1", "at2" };
		String[] svalues = new String[] { "sat0", "sat1", "sat2" };
		aList.add(values[0]);
		aList.add(values[1]);
		aList.add(values[2]);
		x.setValue(aList);
		BAtExpression expr = getFixture();
		expr.setObjExpr(x);
		BLiteralExpression index = B3backendFactory.eINSTANCE.createBLiteralExpression();
		expr.setIndexExpr(index);
		for(int i = 0; i < 3; i++) {
			index.setValue(new Integer(i));
			try {
				LValue lval = expr.getLValue(getEngine().getContext());
				assertEquals(lval.get(), values[i]);
			}
			catch(Throwable e) {
				e.printStackTrace();
				fail("Exception on evaluation of at expression");
			}
		}
		for(int i = 0; i < 3; i++) {
			index.setValue(new Integer(i));
			try {
				LValue lval = expr.getLValue(getEngine().getContext());
				lval.set(svalues[i]);
				assertEquals(lval.get(), svalues[i]);
			}
			catch(Throwable e) {
				e.printStackTrace();
				fail("Exception on evaluation of at expression");
			}
		}
	}

	public void testGetLValueMap__BExecutionContext() {
		BLiteralExpression x = B3backendFactory.eINSTANCE.createBLiteralExpression();
		Map<String, String> aMap = new HashMap<String, String>();
		String[] keys = new String[] { "at0", "at1", "at2" };
		String[] values = new String[] { "valueat0", "valueat1", "valueat2" };
		String[] svalues = new String[] { "svalueat0", "svalueat1", "svalueat2" };
		aMap.put(keys[0], values[0]);
		aMap.put(keys[1], values[1]);
		aMap.put(keys[2], values[2]);
		x.setValue(aMap);
		BAtExpression expr = getFixture();
		expr.setObjExpr(x);
		BLiteralExpression index = B3backendFactory.eINSTANCE.createBLiteralExpression();
		expr.setIndexExpr(index);
		for(int i = 0; i < 3; i++) {
			index.setValue(keys[i]);
			try {
				LValue lval = expr.getLValue(getEngine().getContext());
				assertEquals(lval.get(), values[i]);
			}
			catch(Throwable e) {
				e.printStackTrace();
				fail("Exception on evaluation of at expression");
			}
		}
		for(int i = 0; i < 3; i++) {
			index.setValue(keys[i]);
			try {
				LValue lval = expr.getLValue(getEngine().getContext());
				lval.set(svalues[i]);
				assertEquals(lval.get(), svalues[i]);
			}
			catch(Throwable e) {
				e.printStackTrace();
				fail("Exception on evaluation of at expression");
			}
		}
	}
} // BAtExpressionTest
