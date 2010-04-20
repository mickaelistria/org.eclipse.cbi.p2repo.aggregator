/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BCallExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCall Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class BCallExpressionTest extends BParameterizedExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Constructs a new BCall Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BCallExpressionTest(String name) {
		super(name);
	}

	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}

	protected BParameter createLiteralParameter(Object val) {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		BParameter param = b3.createBParameter();
		BLiteralExpression v;
		param.setExpr(v = b3.createBLiteralExpression());
		v.setValue(val);
		return param;
	}

	/**
	 * Returns the fixture for this BCall Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BCallExpression getFixture() {
		return (BCallExpression) fixture;
	}
} // BCallExpressionTest
