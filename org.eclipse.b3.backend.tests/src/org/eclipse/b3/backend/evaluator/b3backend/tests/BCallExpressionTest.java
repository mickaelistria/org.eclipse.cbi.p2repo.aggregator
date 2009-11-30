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
import org.eclipse.b3.backend.evaluator.b3backend.BCallExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BCall Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BCallExpressionTest extends BParameterizedExpressionTest {

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
		TestRunner.run(BCallExpressionTest.class);
	}

	/**
	 * Constructs a new BCall Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCallExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BCall Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BCallExpression getFixture() {
		return (BCallExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBCallExpression());
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
// before B3FunctionType was modeled
//		ctx.defineVariableValue("a", func, new B3FunctionType(BFunction.class, Integer.class, new Type[]{}, false));
		ctx.defineVariableValue("a", func, funcType);
		BCallExpression ce = b3.createBCallExpression();
		BVariableExpression vara = b3.createBVariableExpression();
		vara.setName("a");
		ce.setFuncExpr(vara);
		
		return ce;
	}

	/**
	 * Test '+'(1, 2);
	 */
	public void testEvaluateNamedFunctionCall() {
		try{
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			
			BCallExpression ce = createNamedCallExpression(ctx);			
			Object result = ce.evaluate(ctx);
			assertEquals(3, result);
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	private BCallExpression createNamedCallExpression(BExecutionContext ctx) throws Throwable {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		
		BCallExpression ce = b3.createBCallExpression();
		ce.setName("+");
		BParameterList parameterList = b3.createBParameterList();
		EList<BParameter> params = parameterList.getParameters();
		params.add(createLiteralParameter(1));
		params.add(createLiteralParameter(2));
		ce.setParameterList(parameterList);
		return ce;
	}

	/**
	 * Evaluate 1.'+'(2)
	 */
	public void testEvaluateTargetFunctionCall() {
		try{
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			BCallExpression ce = createTargetFunctionCall(ctx);
			Object result = ce.evaluate(ctx);
			assertEquals(3, result);
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	private BCallExpression createTargetFunctionCall(BExecutionContext ctx) throws Throwable {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		
		BCallExpression ce = b3.createBCallExpression();
		ce.setName("+");
		BLiteralExpression val1;
		ce.setFuncExpr(val1 = b3.createBLiteralExpression());
		val1.setValue(1);

		BParameterList parameterList;
		ce.setParameterList(parameterList = b3.createBParameterList());
		EList<BParameter> params = parameterList.getParameters();
		params.add(createLiteralParameter(2));

		return ce;
	}

	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}
	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			
			BCallExpression ce = createExpressionCall(ctx);
			assertEquals(Integer.class, ce.getDeclaredType(ctx));
			
			ce = createNamedCallExpression(ctx);
			assertEquals(Number.class, ce.getDeclaredType(ctx));

			ce = createTargetFunctionCall(ctx);
			assertEquals(Number.class, ce.getDeclaredType(ctx));
			
		}catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	private BParameter createLiteralParameter(Object val) {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		BParameter param = b3.createBParameter();
		BLiteralExpression v;
		param.setExpr(v = b3.createBLiteralExpression());
		v.setValue(val);
		return param;
	}
} //BCallExpressionTest
