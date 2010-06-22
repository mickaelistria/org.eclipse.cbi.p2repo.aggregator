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
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BGuardExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BGuard Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BGuardExpressionTest extends BGuardTest {

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
		TestRunner.run(BGuardExpressionTest.class);
	}

	/**
	 * Constructs a new BGuard Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGuardExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BGuard Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BGuardExpression getFixture() {
		return (BGuardExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBGuardExpression());
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

	// @Override
	public void testAccepts__BFunction_BExecutionContext_Object_Type() {
		B3Engine engine = new B3Engine();
		BExecutionContext ctx = engine.getContext();
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		// Define a b3 function
		try {

			// create a guard expression 'name == "us"'
			BGuardExpression guard = B3backendFactory.eINSTANCE.createBGuardExpression();
			{
				BVariableExpression gvar = B3backendFactory.eINSTANCE.createBVariableExpression();
				gvar.setName("name");
				BBinaryOpExpression op = B3backendFactory.eINSTANCE.createBBinaryOpExpression();
				op.setLeftExpr(gvar);
				op.setFunctionName("==");
				BLiteralExpression lit;
				op.setRightExpr(lit = B3backendFactory.eINSTANCE.createBLiteralExpression());
				lit.setValue("us");
				guard.setGuardExpr(op);
			}
			// create a function that declares a string parameter 'name'
			B3Function f = B3backendFactory.eINSTANCE.createB3Function();
			{
				f.setName("woot");
				f.setReturnType(String.class);
				EList<BParameterDeclaration> parameters = f.getParameters();
				BParameterDeclaration pdecl;
				parameters.add(pdecl = b3.createBParameterDeclaration());
				pdecl.setName("name");
				pdecl.setType(String.class);

				BLiteralExpression left = B3backendFactory.eINSTANCE.createBLiteralExpression();
				BVariableExpression right = B3backendFactory.eINSTANCE.createBVariableExpression();
				left.setValue("All your bases are belong to ");
				right.setName("name");
				BBinaryOpExpression op = B3backendFactory.eINSTANCE.createBBinaryOpExpression();
				op.setLeftExpr(left);
				op.setRightExpr(right);
				op.setFunctionName("+");
				f.setFuncExpr(op);

				ctx.defineFunction(f);
				f.setGuard(guard);
			}
			// real code will evaluate the guard when selecting a function - here
			// we perform this manually.

			assertTrue(f.getGuard().accepts(f, new Type[] { String.class }));
			assertFalse(f.getGuard().accepts(f, new Type[] { String.class }));

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} // BGuardExpressionTest
