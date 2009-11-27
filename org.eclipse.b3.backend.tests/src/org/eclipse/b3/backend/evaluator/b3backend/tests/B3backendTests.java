/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>b3backend</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class B3backendTests extends TestSuite {

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
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new B3backendTests("b3backend Tests");
		suite.addTestSuite(BIfExpressionTest.class);
		suite.addTestSuite(BSwitchExpressionTest.class);
		suite.addTestSuite(BCaseTest.class);
		suite.addTestSuite(BTryExpressionTest.class);
		suite.addTestSuite(BCatchTest.class);
		suite.addTestSuite(BOrExpressionTest.class);
		suite.addTestSuite(BAndExpressionTest.class);
		suite.addTestSuite(BChainedExpressionTest.class);
		suite.addTestSuite(BThrowExpressionTest.class);
		suite.addTestSuite(BUnaryOpExpressionTest.class);
		suite.addTestSuite(BUnaryPostOpExpressionTest.class);
		suite.addTestSuite(BBinaryOpExpressionTest.class);
		suite.addTestSuite(BCachedExpressionTest.class);
		suite.addTestSuite(BLiteralExpressionTest.class);
		suite.addTestSuite(BLiteralListExpressionTest.class);
		suite.addTestSuite(BLiteralMapExpressionTest.class);
		suite.addTestSuite(BFeatureExpressionTest.class);
		suite.addTestSuite(BAtExpressionTest.class);
		suite.addTestSuite(BVariableExpressionTest.class);
		suite.addTestSuite(BCallExpressionTest.class);
		suite.addTestSuite(BLiteralAnyTest.class);
		suite.addTestSuite(BCreateExpressionTest.class);
		suite.addTestSuite(BGuardInstanceTest.class);
		suite.addTestSuite(BGuardExpressionTest.class);
		suite.addTestSuite(BSystemContextTest.class);
		suite.addTestSuite(BContextTest.class);
		suite.addTestSuite(BInnerContextTest.class);
		suite.addTestSuite(BInvocationContextTest.class);
		suite.addTestSuite(BUnaryPreOpExpressionTest.class);
		suite.addTestSuite(BAssignmentExpressionTest.class);
		suite.addTestSuite(B3FunctionTest.class);
		suite.addTestSuite(BJavaFunctionTest.class);
		suite.addTestSuite(BDefFunctionTest.class);
		suite.addTestSuite(BDefValueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public B3backendTests(String name) {
		super(name);
	}

} //B3backendTests
