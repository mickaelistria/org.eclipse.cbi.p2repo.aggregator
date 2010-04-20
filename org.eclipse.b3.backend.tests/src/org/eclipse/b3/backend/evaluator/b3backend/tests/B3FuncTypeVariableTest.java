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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>B3 Func Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class B3FuncTypeVariableTest extends TestCase {

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
		TestRunner.run(B3FuncTypeVariableTest.class);
	}

	/**
	 * The fixture for this B3 Func Type Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected B3FuncTypeVariable fixture = null;

	/**
	 * Constructs a new B3 Func Type Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public B3FuncTypeVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this B3 Func Type Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected B3FuncTypeVariable getFixture() {
		return fixture;
	}

	/**
	 * Sets the fixture for this B3 Func Type Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(B3FuncTypeVariable fixture) {
		this.fixture = fixture;
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
		setFixture(B3backendFactory.eINSTANCE.createB3FuncTypeVariable());
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

} // B3FuncTypeVariableTest
