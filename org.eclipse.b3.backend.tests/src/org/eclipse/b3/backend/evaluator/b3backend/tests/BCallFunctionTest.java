/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCallExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCall Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BCallFunctionTest extends BCallExpressionTest {

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
		TestRunner.run(BCallFunctionTest.class);
	}

	/**
	 * Constructs a new BCall Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCallFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BCall Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BCallFunction getFixture() {
		return (BCallFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBCallFunction());
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
	 * Tests an expression call - other test methods test a feature call, and a function call
	 * test: a = {| 1 + 2}; (a)();
	 */
	@Override
	public void testEvaluate__BExecutionContext() {
		try{
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();

			BCallExpression ce = createExpressionCall(ctx);
			Object result = ce.evaluate(ctx);
			assertEquals(3, result);
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			
			BCallExpression ce = createExpressionCall(ctx);
			assertEquals(Integer.class, ce.getDeclaredType(ctx));
			
		}catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	private BCallExpression createExpressionCall(BExecutionContext ctx) throws Throwable {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;

		// this is really a lambda function call test, but it also verifies that the function was loaded
		// as there is really no other way of querying if functions where loaded ok.
		//
		
		// func = 2 + 1
		B3Function func = b3.createB3Function(); {
			func.setReturnType(Integer.class);
			// func.setParameterTypes(new Type[] { Integer.class });
			BLiteralExpression valx = b3.createBLiteralExpression();
			valx.setValue(2);
			BLiteralExpression valy = b3.createBLiteralExpression();
			valy.setValue(1);
			BBinaryOpExpression op = b3.createBBinaryOpExpression();
			func.setFuncExpr(op);
			op.setFunctionName("+");
			op.setLeftExpr(valx);
			op.setRightExpr(valy);
		}
		// a = func : 2 + 1;
		B3FunctionType funcType = b3.createB3FunctionType();
		funcType.setFunctionType(BFunction.class);
		funcType.setReturnType(Integer.class);
		funcType.setVarArgs(false);
		ctx.defineVariableValue("a", func, funcType);
		BCallExpression ce = b3.createBCallFunction();
		BVariableExpression vara = b3.createBVariableExpression();
		vara.setName("a");
		ce.setFuncExpr(vara);
		
		return ce;
	}

} //BCallFunctionTest
