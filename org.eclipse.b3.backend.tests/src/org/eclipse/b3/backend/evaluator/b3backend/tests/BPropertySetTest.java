/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BProperty Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#evaluateDefaults(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, boolean)
 * <em>Evaluate Defaults</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BPropertySetTest extends BAdviceTest {

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
		TestRunner.run(BPropertySetTest.class);
	}

	/**
	 * Constructs a new BProperty Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BPropertySetTest(String name) {
		super(name);
	}

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#evaluateDefaults(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, boolean)
	 * <em>Evaluate Defaults</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BPropertySet#evaluateDefaults(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 *      boolean)
	 * @generated
	 */
	public void testEvaluateDefaults__BExecutionContext_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Returns the fixture for this BProperty Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BPropertySet getFixture() {
		return (BPropertySet) fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createBPropertySet());
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

} // BPropertySetTest
