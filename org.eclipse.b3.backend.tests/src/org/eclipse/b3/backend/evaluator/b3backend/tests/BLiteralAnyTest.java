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
import org.eclipse.b3.backend.core.B3NotLValueException;
import org.eclipse.b3.backend.evaluator.Any;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BLiteral Any</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BLiteralAnyTest extends BExpressionTest {

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
		TestRunner.run(BLiteralAnyTest.class);
	}

	/**
	 * Constructs a new BLiteral Any test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BLiteralAnyTest(String name) {
		super(name);
	}

	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = getEngine();
			Object result = getFixture().evaluate(engine.getContext());
			assertTrue("Any is returned", result instanceof Any);
		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			fail(t.getMessage());
		}
	}

	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = getEngine();
			assertEquals(Any.class, getFixture().getDeclaredType(engine.getContext()));
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
			B3Engine engine = getEngine();
			Object result = getFixture().getLValue(engine.getContext());
			assertTrue("Any is returned", result instanceof Any);
		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			assertEquals("Should throw special exception", B3NotLValueException.class, t.getClass());
		}
	}

	/**
	 * Returns the fixture for this BLiteral Any test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BLiteralAny getFixture() {
		return (BLiteralAny) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBLiteralAny());
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
} // BLiteralAnyTest
