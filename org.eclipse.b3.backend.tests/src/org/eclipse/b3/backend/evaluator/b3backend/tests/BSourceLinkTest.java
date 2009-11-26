/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.TestCase;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.BSourceLink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BSource Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class BSourceLinkTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The fixture for this BSource Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSourceLink fixture = null;

	protected B3Engine engine = null;
	
	/**
	 * Constructs a new BSource Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSourceLinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BSource Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BSourceLink fixture) {
		this.fixture = fixture;
	}
	
	/**
	 * Returns the fixture for this BSource Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSourceLink getFixture() {
		return fixture;
	}
	protected void setEngine(B3Engine engine) {
		this.engine = engine;
	}
	protected B3Engine getEngine() { return engine; }
	
	protected void assertBooleanTrue(Object value) {
		assertEquals("Class should be Boolean", Boolean.class, value.getClass());
		assertTrue(((Boolean)value).booleanValue());
	}
	protected void assertBooleanFalse(Object value) {
		assertEquals("Class should be Boolean", Boolean.class, value.getClass());
		assertFalse(((Boolean)value).booleanValue());
	}

} //BSourceLinkTest
