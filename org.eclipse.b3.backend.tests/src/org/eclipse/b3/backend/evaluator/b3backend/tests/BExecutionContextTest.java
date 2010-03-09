/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import java.lang.reflect.Type;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3FinalVariableRedefinitionException;
import org.eclipse.b3.backend.core.B3VariableRedefinitionException;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.functions.ArithmeticFunctions;
import org.eclipse.b3.backend.functions.RelationalFunctions;
import org.eclipse.core.runtime.AssertionFailedException;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BExecution Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#loadFunctions(java.lang.Class) <em>Load Functions</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#loadFunction(java.lang.reflect.Method) <em>Load Function</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFunction(org.eclipse.b3.backend.evaluator.b3backend.IFunction) <em>Define Function</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#callFunction(java.lang.String, java.lang.Object[], java.lang.reflect.Type[]) <em>Call Function</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getInvocationContext() <em>Get Invocation Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createInnerContext() <em>Create Inner Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createWrappedInnerContext() <em>Create Wrapped Inner Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createOuterContext() <em>Create Outer Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getDeclaredFunctionType(java.lang.String, java.lang.reflect.Type[]) <em>Get Declared Function Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#isPropertyScope() <em>Is Property Scope</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getContext(java.lang.Class) <em>Get Context</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator() <em>Get Function Iterator</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator(java.lang.String) <em>Get Function Iterator</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator(java.lang.reflect.Type, java.lang.Class) <em>Get Function Iterator</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getConcernIterator(java.lang.Object) <em>Get Concern Iterator</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#getValue(java.lang.String) <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#getLValue(java.lang.String) <em>Get LValue</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#defineValue(java.lang.String, java.lang.Object, java.lang.reflect.Type) <em>Define Value</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#defineFinalValue(java.lang.String, java.lang.Object, java.lang.reflect.Type) <em>Define Final Value</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#defineVariableValue(java.lang.String, java.lang.Object, java.lang.reflect.Type) <em>Define Variable Value</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#defineFinalVariableValue(java.lang.String, java.lang.Object, java.lang.reflect.Type) <em>Define Final Variable Value</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#isFinal(java.lang.String) <em>Is Final</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#isImmutable(java.lang.String) <em>Is Immutable</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#getDeclaredValueType(java.lang.String) <em>Get Declared Value Type</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#containsValue(java.lang.String) <em>Contains Value</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#containsValue(java.lang.String, boolean) <em>Contains Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BExecutionContextTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";
	/**
	 * The fixture for this BExecution Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BExecutionContext fixture = null;
	
	/**
	 * Constructs a new BExecution Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExecutionContextTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BExecution Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BExecutionContext fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BExecution Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BExecutionContext getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#loadFunctions(java.lang.Class) <em>Load Functions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#loadFunctions(java.lang.Class)
	 * @generated NOT
	 */
	public void testLoadFunctions__Class() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.loadFunctions(ArithmeticFunctions.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			// this is really a function call test, but it also verifies that the function was loaded
			// as there is really no other way of querying if functions where loaded ok.
			//
			Type[] intint = new Type[] { Integer.class, Integer.class };
			
			Object result = ctx.getFuncStore().callFunction("+", 
					new Object[] { new Integer(2), new Integer(3) }, intint, ctx);
			assertEquals("call of + function", result, new Integer(5));
			result = ctx.getFuncStore().callFunction("add", 
					new Object[] { new Integer(2), new Integer(3) }, intint, ctx);
			assertEquals("call of add function", result, new Integer(5));
			result = ctx.getFuncStore().callFunction("-", 
					new Object[] { new Integer(2), new Integer(3) }, intint, ctx);
			assertEquals("call of - function", result, new Integer(-1));
			result = ctx.getFuncStore().callFunction("*", 
					new Object[] { new Integer(2), new Integer(3) }, intint, ctx);
			assertEquals("call of * function", result, new Integer(6));
			result = ctx.getFuncStore().callFunction("/", 
					new Object[] { new Integer(6), new Integer(2) }, intint, ctx);
			assertEquals("call of / function", result, new Integer(3));

			result = ctx.getFuncStore().callFunction("%", 
					new Object[] { new Integer(10), new Integer(3) }, intint, ctx);
			assertEquals("call of % function", result, new Integer(1));

			result = ctx.getFuncStore().callFunction("&", 
					new Object[] { new Integer(0x7), new Integer(0x2) }, intint, ctx);
			assertEquals("call of & function", result, new Integer(0x2));

			result = ctx.getFuncStore().callFunction("|", 
					new Object[] { new Integer(0x6), new Integer(0x1) }, intint, ctx);
			assertEquals("call of & function", result, new Integer(0x7));

			result = ctx.getFuncStore().callFunction("^", 
					new Object[] { new Integer(0x7), new Integer(0x1) }, intint, ctx);
			assertEquals("call of ^ function", result, new Integer(0x6));

			result = ctx.getFuncStore().callFunction("<<", 
					new Object[] { new Integer(0x2), new Integer(0x1) }, intint, ctx);
			assertEquals("call of << function", result, new Integer(0x4));

			result = ctx.getFuncStore().callFunction(">>", 
					new Object[] { new Integer(0x4), new Integer(0x1) }, intint, ctx);
			assertEquals("call of << function", result, new Integer(0x2));

			result = ctx.getFuncStore().callFunction(">>>", 
					new Object[] { new Integer(-0x4), new Integer(0x1) }, intint, ctx);

			assertEquals("call of >>> function", result, new Integer(-0x4 >>> 1));

		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}
	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#loadFunction(java.lang.reflect.Method) <em>Load Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#loadFunction(java.lang.reflect.Method)
	 * @generated
	 */
	public void testLoadFunction__Method() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFunction(org.eclipse.b3.backend.evaluator.b3backend.IFunction) <em>Define Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFunction(org.eclipse.b3.backend.evaluator.b3backend.IFunction)
	 * @generated
	 */
	public void testDefineFunction__IFunction() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	public void testLoadSystemFunctions__Class() {
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		B3Engine engine = new B3Engine();
		BExecutionContext octx = engine.getContext();
		BExecutionContext ctx;
//		try {
//			octx.loadFunctions(SystemFunctions.class);
//		} catch (B3EngineException e) {
//			e.printStackTrace();
//			fail();
//		}
		try {
			// this is really a lambda function call test, but it also verifies that the function was loaded
			// as there is really no other way of querying if functions where loaded ok.
			//
			ctx =  octx.createOuterContext(); // to declare som variables.
			ctx.defineVariableValue("a", 42, Integer.class);
			ctx.defineVariableValue("b", 84, Integer.class);
			
			B3Function func = b3.createB3Function();
			func.setReturnType(Integer.class);
			EList<BParameterDeclaration> params = func.getParameters();
			BParameterDeclaration pdecl;
			params.add(pdecl = b3.createBParameterDeclaration());
			pdecl.setName("x");
			pdecl.setType(Integer.class);

			BVariableExpression varx = b3.createBVariableExpression();
			varx.setName("x");
			BLiteralExpression val = b3.createBLiteralExpression();
			val.setValue(1);
			BBinaryOpExpression op = b3.createBBinaryOpExpression();
			func.setFuncExpr(op);
			op.setFunctionName("+");
			op.setLeftExpr(varx);
			op.setRightExpr(val);
						
			Object result = octx.getFuncStore().callFunction("evaluate", 
					new Object[] { func, 3 }, new Type[] {BFunction.class, Integer.class}, ctx);
			
			assertEquals("call of + function", result, new Integer(4));

		} catch(AssertionFailedError e) {
			throw e;
		}
		catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#callFunction(java.lang.String, java.lang.Object[]) <em>Call Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#callFunction(java.lang.String, java.lang.Object[])
	 * @generated NOT
	 */
	public void testCallFunction__String_Object() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.loadFunctions(RelationalFunctions.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			// this is really a function call test, but it also verifies that the function was loaded
			// as there is really no other way of querying if functions where loaded ok.
			//
			Type[] intint = new Type[] { Integer.class, Integer.class };

			Object result = ctx.getFuncStore().callFunction("<", 
					new Object[] { new Integer(2), new Integer(3) }, intint, ctx);
			assertEquals("call of < function", result, Boolean.TRUE);
			result = ctx.getFuncStore().callFunction(">", 
					new Object[] { new Integer(2), new Integer(3) }, intint, ctx);
			assertEquals("call of > function", result, Boolean.FALSE);
			result = ctx.getFuncStore().callFunction("!=", 
					new Object[] { new Integer(2), new Integer(3) }, intint, ctx);
			assertEquals("call of != function", result, Boolean.TRUE);
			result = ctx.getFuncStore().callFunction("==", 
					new Object[] { new Integer(3), new Integer(3) }, intint, ctx);
			assertEquals("call of == function", result, Boolean.TRUE);
			result = ctx.getFuncStore().callFunction("!=", 
					new Object[] { new Integer(3), new Integer(3) }, intint, ctx);
			
			assertEquals("call of != on equal function", result, Boolean.FALSE);
		} catch(AssertionFailedError e) {
			throw e;
		} catch (Throwable e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getValue(java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getValue(java.lang.String)
	 * @generated NOT
	 */
	public void testGetValue__String() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.defineValue("hello_getValue", "world", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			assertEquals("world", ctx.getValue("hello_getValue"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineValue(java.lang.String, java.lang.Object) <em>Define Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineValue(java.lang.String, java.lang.Object)
	 * @generated NOT
	 */
	public void testDefineValue__String_Object_Type() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.defineValue("hello", "world", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			assertEquals("world", ctx.getValue("hello"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			ctx.defineValue("hello", "brave new world", String.class);
		} catch (B3VariableRedefinitionException e) {
			/* passed redefinition error test */
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			assertEquals("should not have changed", "world", ctx.getValue("hello"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFinalValue(java.lang.String, java.lang.Object) <em>Define Final Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFinalValue(java.lang.String, java.lang.Object)
	 * @generated NOT
	 */
	public void testDefineFinalValue__String_Object_Type() {
		BExecutionContext ctx = getFixture();
		BExecutionContext octx = ctx.createInnerContext();
		assertFalse(ctx == octx);
		assertFalse(ctx.getValueMap() == octx.getValueMap());
		try {
			ctx.defineFinalValue("goodbye", "cruel world", String.class);
			ctx.defineValue("culater", "see you later", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			assertEquals("cruel world", ctx.getValue("goodbye"));
			assertEquals("see you later", ctx.getValue("culater"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		// should allow redefinition of culater in octx
		try {
			octx.defineValue("culater", "ttyl", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail("Should have allowed definition in inner context of culater");
		}
		// should not allow definition of final goodbye
		try {
			octx.defineValue("goodbye", "see you tomorrow", String.class);
		} catch (B3FinalVariableRedefinitionException e) {
			/* passed redefinition of final error test */
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}

		
		try {
			assertEquals("should not have changed", "cruel world", octx.getValue("goodbye"));
			assertEquals("should have changed", "ttyl", octx.getValue("culater"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineVariableValue(java.lang.String, java.lang.Object) <em>Define Variable Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineVariableValue(java.lang.String, java.lang.Object)
	 * @generated NOT
	 */
	public void testDefineVariableValue__String_Object_Type() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.defineVariableValue("politician", "what is my opinion", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			LValue lval = ctx.getLValue("politician");
			lval.set("your opinion is my opinion");
			assertEquals(lval.get(), ctx.getValue("politician"));
			assertEquals("your opinion is my opinion", ctx.getValue("politician"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFinalVariableValue(java.lang.String, java.lang.Object) <em>Define Final Variable Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFinalVariableValue(java.lang.String, java.lang.Object)
	 * @generated NOT
	 */
	public void testDefineFinalVariableValue__String_Object_Type() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.defineFinalVariableValue("no", "no way", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		try {
			LValue lval = ctx.getLValue("no");
			lval.set("not in a million years");
			assertEquals(lval.get(), ctx.getValue("no"));
			assertEquals("not in a million years", ctx.getValue("no"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		BExecutionContext octx = ctx.createInnerContext();
		try {
			octx.defineVariableValue("no", "yes yes yes", String.class);
			fail();
		} catch (B3EngineException e) {
			/* ignored - the above should fail since no is final */
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#isFinal(java.lang.String) <em>Is Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#isFinal(java.lang.String)
	 * @generated NOT
	 */
	public void testIsFinal__String() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.defineFinalVariableValue("testFinal1", "aFinalValue", String.class);
			ctx.defineVariableValue("testFinal2", "aNonFinalValue", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(ctx.isFinal("testFinal1"));
		assertFalse(ctx.isFinal("testFinal2"));
		
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#isImmutable(java.lang.String) <em>Is Immutable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#isImmutable(java.lang.String)
	 * @generated NOT
	 */
	public void testIsImmutable__String() {
		BExecutionContext ctx = getFixture();
		try {
			ctx.defineValue("testImmutable1", "anImmutableValue", String.class);
			ctx.defineVariableValue("testImmutable2", "aNonImmutableValue", String.class);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(ctx.isImmutable("testImmutable1"));
		assertFalse(ctx.isImmutable("testImmutable2"));
		
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getInvocationContext() <em>Get Invocation Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getInvocationContext()
	 * @generated NOT
	 */
	public void testGetInvocationContext() {
		B3Engine engine = new B3Engine();
		BExecutionContext ctx = engine.getContext();
		BExecutionContext octx = ctx.createOuterContext();
		try {
			assertTrue(octx.getInvocationContext() instanceof BInvocationContext);
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
		
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createInnerContext() <em>Create Inner Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createInnerContext()
	 * @generated NOT
	 */
	public void testCreateInnerContext() {
		BExecutionContext ctx = getFixture();
		try {
			// test inner provides access to outer value and lvalue
			ctx.defineVariableValue("innerTest1", "innerValue1", String.class);
			BExecutionContext octx = ctx.createInnerContext();
			assertTrue(ctx != octx);
			assertEquals(octx.getValue("innerTest1"), ctx.getValue("innerTest1"));
			LValue lval = octx.getLValue("innerTest1");
			assertEquals(octx.getValue("innerTest1"), lval.get());
			assertEquals(ctx.getValue("innerTest1"), lval.get());
			lval.set("innerValue2");
			assertEquals(octx.getValue("innerTest1"), lval.get());
			assertEquals(ctx.getValue("innerTest1"), lval.get());
			
			// test that inner hides outer
			octx.defineVariableValue("innerTest1", "innerValue3", String.class);
			assertFalse(octx.getValue("innerTest1").equals(ctx.getValue("innerTest1")));
			
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createWrappedInnerContext() <em>Create Wrapped Inner Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createWrappedInnerContext()
	 * @generated
	 */
	public void testCreateWrappedInnerContext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createOuterContext() <em>Create Outer Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#createOuterContext()
	 * @generated NOT
	 */
	public void testCreateOuterContext() {		
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext octx = engine.getContext();
			BExecutionContext ctx = octx.createOuterContext();
			
			ctx.defineVariableValue("x", "in-ctx", String.class);
			BExecutionContext ictx = ctx.createInnerContext();
			assertTrue(ctx != ictx);
			assertEquals(ictx.getValue("x"), ctx.getValue("x"));
						
			// test that inner hides outer
			ictx.defineVariableValue("x", "in-ictx", String.class);
			assertFalse(ictx.getValue("x").equals(ctx.getValue("x")));
			
			BExecutionContext octx2 = ictx.createOuterContext();
			assertTrue(octx2.getParentContext() == ctx);
			assertTrue(octx2 != ictx);
			assertEquals(octx2.getValue("x"), ctx.getValue("x"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getDeclaredValueType(java.lang.String) <em>Get Declared Value Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getDeclaredValueType(java.lang.String)
	 * @generated NOT
	 */
	public void testGetDeclaredValueType__String() {
		try {
		BExecutionContext octx = getFixture();
		BExecutionContext ctx = octx.createOuterContext();
		ctx.defineVariableValue("x", 1, Integer.class);
		
		assertEquals(Integer.class, ctx.getDeclaredValueType("x"));
		} catch (AssertionFailedException e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail(t.getMessage());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#containsValue(java.lang.String) <em>Contains Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#containsValue(java.lang.String)
	 * @generated
	 */
	public void testContainsValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getDeclaredFunctionType(java.lang.String, java.lang.reflect.Type[]) <em>Get Declared Function Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getDeclaredFunctionType(java.lang.String, java.lang.reflect.Type[])
	 * @generated NOT
	 */
	public void testGetDeclaredFunctionType__String_Type() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			Type type = ctx.getDeclaredFunctionType("+", new Type[] { Integer.class, Integer.class });
			
			// TODO  functions like + should return generaltity, not the Number class
			// but for now checking against Number.class
			assertEquals(Number.class, type);
		} catch (AssertionFailedError e) {
			throw e;
		} catch (Throwable t) {
			t.printStackTrace();
			fail(t.getMessage());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#isPropertyScope() <em>Is Property Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#isPropertyScope()
	 * @generated
	 */
	public void testIsPropertyScope() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getContext(java.lang.Class) <em>Get Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getContext(java.lang.Class)
	 * @generated
	 */
	public void testGetContext__Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator() <em>Get Function Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator()
	 * @generated
	 */
	public void testGetFunctionIterator() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator(java.lang.String) <em>Get Function Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator(java.lang.String)
	 * @generated
	 */
	public void testGetFunctionIterator__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator(java.lang.reflect.Type, java.lang.Class) <em>Get Function Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getFunctionIterator(java.lang.reflect.Type, java.lang.Class)
	 * @generated
	 */
	public void testGetFunctionIterator__Type_Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getConcernIterator(java.lang.Object) <em>Get Concern Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getConcernIterator(java.lang.Object)
	 * @generated
	 */
	public void testGetConcernIterator__Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#containsValue(java.lang.String, boolean) <em>Contains Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.ITypedValueContainer#containsValue(java.lang.String, boolean)
	 * @generated
	 */
	public void testContainsValue__String_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getLValue(java.lang.String) <em>Get LValue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#getLValue(java.lang.String)
	 * @generated NOT
	 */
	public void testGetLValue__String() {
		BExecutionContext ctx = getFixture();
		BExecutionContext ictx = ctx.createInnerContext();
		try {
			ictx.defineVariableValue("a", "value a", String.class);
			LValue lval = ictx.getLValue("a");
			assertEquals(lval.get(), ictx.getValue("a"));
		} catch (B3EngineException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFunction(org.eclipse.b3.backend.evaluator.b3backend.BFunction) <em>Define Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineFunction(org.eclipse.b3.backend.evaluator.b3backend.BFunction)
	 * @generated NOT
	 */
	public void testDefineFunction__BFunction() {
		B3Engine engine = new B3Engine();
		BExecutionContext ctx = engine.getContext();
		B3backendFactory b3 = B3backendFactory.eINSTANCE;
		// Define a b3 function
		try {
			B3Function f = B3backendFactory.eINSTANCE.createB3Function();
			f.setName("woot");
			f.setReturnType(String.class);
			EList<BParameterDeclaration> params = f.getParameters();
			BParameterDeclaration pdecl;
			params.add(pdecl = b3.createBParameterDeclaration());
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
			
			Object result = ctx.callFunction("woot", new Object[] {"us"}, new Type[] {String.class});
			assertEquals(result, "All your bases are belong to us");
				
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Tests the '{@link org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#callFunction(java.lang.String, java.lang.Object[], java.lang.reflect.Type[]) <em>Call Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#callFunction(java.lang.String, java.lang.Object[], java.lang.reflect.Type[])
	 * @generated NOT
	 */
	public void testCallFunction__String_Object_Type() {
		// Difficult to test without also testing function, function definition
		// context set up - this is done in BCallExpression test
		//
	}

} //BExecutionContextTest
