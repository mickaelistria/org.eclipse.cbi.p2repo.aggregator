package org.eclipse.b3.backend.functions.tests;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCallExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BIfExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.emf.common.util.EList;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class TestSystemLibrary extends TestCase {

	public void test_whileTrue() {
		try {
			EngineData b3 = new EngineData();
			BExpression condLambda = createTrueUntilXIsFalse();
			BExpression repeatLambda = createAdd1ToSumAndSetXFalseIfSumIsGt9();
			// lambdas communicate via these
			b3.ctx.defineVariableValue("sum", 0, Integer.class);
			b3.ctx.defineVariableValue("x", Boolean.TRUE, Boolean.class);
			
			BExpression call = createTargetCall(condLambda.evaluate(b3.ctx), "whileTrue", new BExpression[] {repeatLambda});
			call.evaluate(b3.ctx);
			assertEquals("whileTrue 1 to 10 should produce sum == 10", 10, b3.ctx.getValue("sum"));

		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
		
	}
	public void test_do() {
		try {
			EngineData b3 = new EngineData();
			
			BExpression call = createTargetCall(listWith1To9(), "do", new BExpression[] {literal(20), literalAny(), createSumFunc()});
			assertEquals("do 20 + 1 to 9 ", new Integer(29), call.evaluate(b3.ctx));

		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	public void test_evaluate() {
		try {
			EngineData b3 = new EngineData();
			
			BExpression call = createTargetCall(createSumFunc().evaluate(b3.ctx), "evaluate", new BExpression[] {literal(4), literal(12)});
			assertEquals("evaluate 4 + 12", 16, call.evaluate(b3.ctx));
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	public void test_select() {
		try {
			EngineData b3 = new EngineData();
			
			BExpression call = createTargetCall(listWithAllRed(), "select", new BExpression[] {literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			List<?> r = (List<?>)call.evaluate(b3.ctx);
			assertEquals("select red == true", 5, r.size());
			for(int i = 0; i < 5; i++)
				assertEquals("red", r.get(i));

			call = createTargetCall(listWithOneRed(), "select", new BExpression[] { literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			r = (List<?>)call.evaluate(b3.ctx);
			assertEquals("select red != true", 1, r.size());
			assertEquals("red", r.get(0));
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	public void test_reject() {
		try {
			EngineData b3 = new EngineData();
			
			BExpression call = createTargetCall(listWithAllRed(), "reject", new BExpression[] {literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			List<?> r = (List<?>)call.evaluate(b3.ctx);
			assertEquals("reject red == true", 0, r.size());

			call = createTargetCall(listWithOneRed(), "reject", new BExpression[] { literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			r = (List<?>)call.evaluate(b3.ctx);
			assertEquals("select red != true", 5, r.size());
			for(int i = 0; i < 5; i++)
				assertEquals("blue", r.get(i));
			call = createTargetCall(listWith27Colors9Red(), "reject", new BExpression[] { literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			r = (List<?>)call.evaluate(b3.ctx);
			assertEquals("select red != true", 18, r.size());
			for(int i = 0; i < 18; i++)
				assertFalse("red".equals(r.get(i)));
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	public void test_inject() {
		try {
			EngineData b3 = new EngineData();
			
			BExpression call = createTargetCall(listWith1To9(), "inject", new BExpression[] {literal(0), createSumFunc()});
			assertEquals("sum of 1-9 == 45", new Integer(45), call.evaluate(b3.ctx));

			call = createTargetCall(listWith1To9(), "inject", new BExpression[] {literal(10), createSumFunc()});
			assertEquals("sum of 10 + 1..9 == 55", new Integer(55), call.evaluate(b3.ctx));

			call = createTargetCall(listWith1To9(), "inject", new BExpression[] {literal(10), literalAny(), createSumFunc()});
			assertEquals("sum of 10 + 1..9 == 55", new Integer(55), call.evaluate(b3.ctx));
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	public void test_exists() {
		try {
			EngineData b3 = new EngineData();
			
			BExpression call = createTargetCall(listWithAllRed(), "exists", new BExpression[] {literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			assertEquals("exists red == true", Boolean.TRUE, call.evaluate(b3.ctx));
			call = createTargetCall(listWithOneRed(), "exists", new BExpression[] { literalAny(), literal("dummy"), createTrueIfNNNLambda("pink")});
			assertEquals("exists red != true", Boolean.FALSE, call.evaluate(b3.ctx));
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}
	public void test_allexists() {
		try {
			EngineData b3 = new EngineData();
			
			BExpression call = createTargetCall(listWithAllRed(), "all", new BExpression[] {literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			assertEquals("all red == true", Boolean.TRUE, call.evaluate(b3.ctx));
			call = createTargetCall(listWithOneRed(), "all", new BExpression[] { literalAny(), literal("dummy"), createTrueIfNNNLambda("red")});
			assertEquals("all red != true", Boolean.FALSE, call.evaluate(b3.ctx));
			
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	public static class EngineData {
		public B3Engine engine;
		public BExecutionContext ctx;
		public B3backendFactory factory;
		public EngineData() {
			factory = B3backendFactory.eINSTANCE;
			engine = new B3Engine();
			ctx = engine.getContext();
		}
	}
	private BExpression createTargetCall(Object target, String functionName, BExpression[] params) {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		BCallExpression call = b3.createBCallExpression();
		BLiteralExpression texpr;
		call.setFuncExpr(texpr = b3.createBLiteralExpression());
		texpr.setValue(target);
		call.setName(functionName);
		EList<BExpression> pList = call.getParameters();
		for(int i = 0; i < params.length; i++)
			pList.add(params[i]);
		return call;
	}
	private List<Integer> listWith1To9() {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++)
			list.add(i);
		return list;
	}
	private List<String> listWithAllRed() {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 5; i++)
			list.add("red");
		return list;
	}
	private List<String> listWithOneRed() {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 5; i++)
			list.add("blue");
		list.add("red");
		return list;
	}
	private List<String> listWith27Colors9Red() {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++) {
				list.add("blue");
				list.add("red");
				list.add("green");
			}
		list.add("red");
		return list;
	}

	private BExpression createTrueIfNNNLambda(String nnn) {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;

		B3Function func = b3.createB3Function();
		func.setReturnType(Boolean.class);
		
		EList<String> names = func.getParameterNames();
		names.add("x");
		names.add("y");
		func.setParameterTypes(new Type[] { String.class, String.class });
		BVariableExpression varx = b3.createBVariableExpression();
		varx.setName("x");
		BLiteralExpression val = b3.createBLiteralExpression();
		val.setValue(nnn);
		BBinaryOpExpression op = b3.createBBinaryOpExpression();
		func.setFuncExpr(op);
		op.setFunctionName("==");
		op.setLeftExpr(varx);
		op.setRightExpr(val);
		BLiteralExpression literalFunc = b3.createBLiteralExpression();
		literalFunc.setValue(func);
		return literalFunc;
		
	}
	private BExpression createSumFunc() {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;

		B3Function func = b3.createB3Function();
		func.setReturnType(Integer.class);
		
		EList<String> names = func.getParameterNames();
		names.add("sum");
		names.add("x");
		func.setParameterTypes(new Type[] { Integer.class, Integer.class });
		
		BVariableExpression varx = b3.createBVariableExpression();
		varx.setName("x");
		BVariableExpression varSum = b3.createBVariableExpression();
		varSum.setName("sum");
		BBinaryOpExpression op = b3.createBBinaryOpExpression();
		func.setFuncExpr(op);
		op.setFunctionName("+");
		op.setLeftExpr(varx);
		op.setRightExpr(varSum);
		BLiteralExpression literalFunc = b3.createBLiteralExpression();
		literalFunc.setValue(func);
		return literalFunc;		
	}
	private BExpression createTrueUntilXIsFalse() {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;

		B3Function func = b3.createB3Function();
		func.setReturnType(Integer.class);
				
		BVariableExpression varx = b3.createBVariableExpression();
		varx.setName("x");
		BLiteralExpression valx= b3.createBLiteralExpression();
		valx.setValue(Boolean.TRUE);
		BBinaryOpExpression op = b3.createBBinaryOpExpression();
		func.setFuncExpr(op);
		op.setFunctionName("==");
		op.setLeftExpr(varx);
		op.setRightExpr(valx);
		BLiteralExpression literalFunc = b3.createBLiteralExpression();
		literalFunc.setValue(func);
		return literalFunc;		
	}
	/**
	 * Creates "{| if sum += 1 > 9 then x = false endif }"
	 * @return
	 */
	private BExpression createAdd1ToSumAndSetXFalseIfSumIsGt9() {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;

		B3Function func = b3.createB3Function();
		func.setReturnType(Integer.class);
				
		BVariableExpression varx = b3.createBVariableExpression();
		varx.setName("x");
		BVariableExpression varSum = b3.createBVariableExpression();
		varSum.setName("sum");

		// sum += 1
		BAssignmentExpression sumPlus1 = b3.createBAssignmentExpression(); {
			sumPlus1.setLeftExpr(varSum);
			sumPlus1.setRightExpr(literal(1));
			sumPlus1.setFunctionName("+");
		}
		// x = false;
		BAssignmentExpression xFalse = b3.createBAssignmentExpression(); {
			xFalse.setLeftExpr(varx);
			xFalse.setRightExpr(literal(Boolean.FALSE));
			xFalse.setFunctionName("=");
		}
		// sum > 9
		BBinaryOpExpression sumGt9 = b3.createBBinaryOpExpression(); {
			sumGt9.setLeftExpr(sumPlus1);
			sumGt9.setRightExpr(literal(9));
			sumGt9.setFunctionName(">");
		}
		BIfExpression ifexpr = b3.createBIfExpression(); {
			ifexpr.setConditionExpr(sumGt9);
			ifexpr.setThenExpr(xFalse);
		}
		
		BLiteralExpression literalFunc = b3.createBLiteralExpression();

		func.setFuncExpr(ifexpr);

		literalFunc.setValue(func);
		return literalFunc;		
	}

	private BExpression literal(Object x) {
		BLiteralExpression lit = B3backendFactory.eINSTANCE.createBLiteralExpression();
		lit.setValue(x);
		return lit;
	}
	private BExpression literalAny() {
		return B3backendFactory.eINSTANCE.createBLiteralAny();
	}
}
