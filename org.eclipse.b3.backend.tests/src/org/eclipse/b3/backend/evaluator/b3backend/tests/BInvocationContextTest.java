/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.textui.TestRunner;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BInvocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext#evaluateIfNotCached(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression) <em>Evaluate If Not Cached</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BInvocationContextTest extends BExecutionContextTest {

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
		TestRunner.run(BInvocationContextTest.class);
	}

	/**
	 * Constructs a new BInvocation Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInvocationContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BInvocation Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BInvocationContext getFixture() {
		return (BInvocationContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBInvocationContext());
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

	/**
	 * Tests the '
	 * {@link org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext#evaluateIfNotCached(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext, org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression)
	 * <em>Evaluate If Not Cached</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext#evaluateIfNotCached(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 *      org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression)
	 * @generated NOT
	 */
	public void testEvaluateIfNotCached__BExecutionContext_BCachedExpression() {
		// This is tested by BCachedExpressionTest
		//
	}

} // BInvocationContextTest
