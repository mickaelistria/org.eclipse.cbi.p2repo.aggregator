/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import java.lang.reflect.Type;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BGuardInstance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BGuard Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BGuardInstanceTest extends BGuardTest {

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
		TestRunner.run(BGuardInstanceTest.class);
	}

	/**
	 * Constructs a new BGuard Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGuardInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BGuard Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BGuardInstance getFixture() {
		return (BGuardInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBGuardInstance());
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
	public void testAccepts__BFunction_BExecutionContext_Object_Type() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;
			B3Function dummyFunc = b3.createB3Function();
			Object[] parameters = new Object[1];
			Type[] types = new Type[1];
			BGuardInstance guard = getFixture();
			Integer val;
			guard.setInstance(val = new Integer(42));
			parameters[0] = val;
			types[0] = Integer.class;
			// dummyFunc is never used by instance guard so can be uninitialized
			assertTrue(guard.accepts(dummyFunc, ctx, parameters, types));
			parameters[0] = new Integer(42);
			assertFalse(guard.accepts(dummyFunc, ctx, parameters, types));
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
		
	}
} //BGuardInstanceTest
