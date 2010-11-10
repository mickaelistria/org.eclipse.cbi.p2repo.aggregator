/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.tests;

import java.lang.reflect.Type;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.inference.ITypeConstraint;
import org.eclipse.b3.backend.inference.ITypeConstraintSolver;
import org.eclipse.b3.backend.inference.ITypeExpression;
import org.eclipse.b3.backend.inference.ITypeScheme;
import org.eclipse.b3.backend.inference.TypeConstraintSolver;
import org.eclipse.b3.backend.inference.TypeScheme;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.internal.Lists;

/**
 *
 */
public class TestConstraintSolver extends TestCase {
	public static class TestConstraintSolverModule extends AbstractModule {

		@Override
		protected void configure() {
			// bind whatever is needed here

			binder().requestStaticInjection(B3Debug.class);

		}
	}

	private Injector injector;

	private ITypeScheme factory;

	/**
	 * val call = invoke(| x, y | x + y, 1, 2);
	 * 
	 * Maps to the type constraints:
	 * call = product(g)
	 * g = select('invoke', d , type(1), type(2));
	 * d = lambda(variable(x), variable(y)
	 * Test a simple case a = x, b = y, c = (+ a b), d = (x,y)=>c, e = 1, f = 2, g = (invoke d e f)
	 */
	public void testFirstLambdaTCCase() {
		// Needs some EObject to test, what they are does not matter
		// They are only used to hang adapters off that contain type.
		BExpression a = expression("a"); // the lhs in the + binop
		BExpression b = expression("b"); // the rhs in the + binop
		BExpression c = expression("c"); // the funcExpr of the λ d
		BExpression d = expression("d"); // the λ parameter
		BExpression e = expression("e"); // 1
		BExpression f = expression("f"); // 2
		BExpression g = expression("g"); // the invoke function (being called) having the λ as parameter
		BExpression call = expression("call"); // the call of g
		BExpression x = expression("x"); // a parameter in the λ
		BExpression y = expression("y"); // - " -

		// List<ITypeConstraint> constraints = Lists.newArrayList();
		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);

		// a = x
		solver.add(constraint(variable(a), variable(x)));

		// b = y
		solver.add(constraint(variable(b), variable(y)));

		// setting x = e, and y = f is cheating, this is set by the tc for 'invoke').
		// // x = e
		// solver.add(constraint(variable(x), variable(e)));
		// // y = f
		// solver.add(constraint(variable(y), variable(f)));

		// c = (+ a b)
		solver.add(constraint(variable(c), selectFunction("+", c, variable(a), variable(b))));

		// d = (x, y) => c
		// i.e. a function of two variables x and y that returns something of the type of c
		solver.add(constraint(
		// variable(d), produces(product(selectFunction("+", c, variable(a), variable(b))), variable(x), variable(y))));
			variable(d), lambda(product(variable(c)), variable(x), variable(y))));

		// e = Integer.class
		solver.add(constraint(variable(e), type(Integer.class)));

		// f = Long.class
		solver.add(constraint(variable(f), type(Long.class)));

		// g = (invoke d e f)
		//
		// solver.add(constraint(variable(g), selectFunction("invoke", call, variable(d), variable(e), variable(f))));

		// call = product(g)
		solver.add(constraint(
			variable(call), product(selectFunction("firstLambda", g, variable(d), variable(e), variable(f)))));

		int result = solver.solve();

		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint ce : solver.getSubstitutions()) {
			assertTrue("Solution should be resolved: " + ce.toString(), ce.isResolved());
		}
		solver.applySolution();
		assertEquals("Solver should have solved (+ a b) to Long", Long.class, variable(c).getType());
		assertEquals("Solver should have solved call λ to Long", Long.class, variable(call).getType());
	}

	/**
	 * val call = invoke(| x, y | x + y, 1, 2);
	 * 
	 * Maps to the type constraints:
	 * call = product(g)
	 * g = select('invoke', d , type(1), type(2));
	 * d = lambda(variable(x), variable(y)
	 * Test a simple case a = x, b = y, c = (+ a b), d = (x,y)=>c, e = 1, f = 2, g = (invoke d e f)
	 */
	public void testLambdaCase() {
		// Needs some EObject to test, what they are does not matter
		// They are only used to hang adapters off that contain type.
		BExpression a = expression("a"); // the lhs in the + binop
		BExpression b = expression("b"); // the rhs in the + binop
		BExpression c = expression("c"); // the funcExpr of the λ d
		BExpression d = expression("d"); // the λ parameter
		BExpression e = expression("e"); // 1
		BExpression f = expression("f"); // 2
		BExpression g = expression("g"); // the invoke function (being called) having the λ as parameter
		BExpression call = expression("call"); // the call of g
		BExpression x = expression("x"); // a parameter in the λ
		BExpression y = expression("y"); // - " -

		// List<ITypeConstraint> constraints = Lists.newArrayList();
		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);

		// a = x
		solver.add(constraint(variable(a), variable(x)));

		// b = y
		solver.add(constraint(variable(b), variable(y)));

		// c = (+ a b)
		solver.add(constraint(variable(c), selectFunction("+", c, variable(a), variable(b))));

		// d = (x, y) => c
		// i.e. a function of two variables x and y that returns something of the type of c
		solver.add(constraint(
		// variable(d), produces(product(selectFunction("+", c, variable(a), variable(b))), variable(x), variable(y))));
			variable(d), lambda(product(variable(c)), variable(x), variable(y))));

		// e = Integer.class
		solver.add(constraint(variable(e), type(Integer.class)));

		// f = Long.class
		solver.add(constraint(variable(f), type(Long.class)));

		// g = (invoke d e f)
		//
		// solver.add(constraint(variable(g), selectFunction("invoke", call, variable(d), variable(e), variable(f))));

		// call = product(g)
		solver.add(constraint(
			variable(call), product(selectFunction("invoke", g, variable(d), variable(e), variable(f)))));

		int result = solver.solve();

		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint ce : solver.getSubstitutions()) {
			assertTrue("Solution should be resolved: " + ce.toString(), ce.isResolved());
		}
		solver.applySolution();
		assertEquals("Solver should have solved (+ a b) to Long", Long.class, variable(c).getType());
		assertEquals("Solver should have solved call λ to Long", Long.class, variable(call).getType());
	}

	/**
	 * Example:
	 * val call = reject(List<Integer> e, | x | x % 2 == 0);
	 * 
	 * Maps to the type constraints:
	 * call = product (select('reject' theList theLambda))
	 * theList = type(List<Integer>)
	 * theLambda = (x)=>product(select(== product(select(% x 2)) 0)) // although shortened to Boolean in this test
	 */
	public void testLastBooleanLambdaTCCase() {
		// Needs some EObject to test, what they are does not matter
		// They are only used to hang adapters off that contain type.
		BExpression call = expression("call");

		BExpression theList = expression("theList");
		BExpression theLambda = expression("theLambda");
		BExpression c = expression("c"); // used as scope "inside lambda"
		BExpression x = expression("x"); // a λ parameter

		// List<ITypeConstraint> constraints = Lists.newArrayList();
		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);

		// theList = List<Double>.class
		B3ParameterizedType ptype = B3backendFactory.eINSTANCE.createB3ParameterizedType();
		ptype.setRawType(List.class);
		ptype.getActualArgumentsList().add(Integer.class);
		solver.add(constraint(variable(theList), type(ptype)));

		// λ = (x)=>Boolean.class
		solver.add(constraint(variable(theLambda), lambda(type(Boolean.class), variable(x))));

		// call = product((lastLambda theList theLambda)=>σlastLambda)
		solver.add(constraint(
			variable(call), product(selectFunction("booleanLambda", call, variable(theList), variable(theLambda)))));

		int result = solver.solve();

		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint ce : solver.getSubstitutions()) {
			assertTrue("Solution should be resolved: " + ce.toString(), ce.isResolved());
		}
		solver.applySolution();
		assertEquals("Solver should have solved call λ to Double", ptype, variable(call).getType());
	}

	/**
	 * Example:
	 * val call = do(List<Double> e, | x | x + 1.0);
	 * 
	 * Maps to the type constraints:
	 * call = product (select('do' theList theLambda))
	 * theList = type(List<Double>)
	 * theLambda = (x)=>product(select (+ x 1.0))
	 */
	public void testLastLambdaTCCase() {
		// Needs some EObject to test, what they are does not matter
		// They are only used to hang adapters off that contain type.
		BExpression call = expression("call");

		BExpression theList = expression("theList");
		BExpression theLambda = expression("theLambda");
		BExpression c = expression("c"); // used as scope "inside lambda"
		BExpression x = expression("x"); // a λ parameter

		// List<ITypeConstraint> constraints = Lists.newArrayList();
		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);

		// theList = List<Double>.class
		B3ParameterizedType ptype = B3backendFactory.eINSTANCE.createB3ParameterizedType();
		ptype.setRawType(List.class);
		ptype.getActualArgumentsList().add(Integer.class);
		solver.add(constraint(variable(theList), type(ptype)));

		// λ = (x)=>product((+ x Double.class)=>σ+)
		solver.add(constraint(
			variable(theLambda),
			lambda(product(selectFunction("+", theLambda, variable(x), type(Double.class))), variable(x))));

		// call = product((lastLambda theList theLambda)=>σlastLambda)
		solver.add(constraint(
			variable(call), product(selectFunction("lastLambda", call, variable(theList), variable(theLambda)))));

		int result = solver.solve();

		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint ce : solver.getSubstitutions()) {
			assertTrue("Solution should be resolved: " + ce.toString(), ce.isResolved());
		}
		solver.applySolution();
		assertEquals("Solver should have solved call λ to Double", Double.class, variable(call).getType());
	}

	/**
	 * Test a simple case a = c, b = c, c = Integer.class - should result in a == b == c == Integer.class
	 */
	public void testSimpleConstraint() {
		// Needs some EObject to test, what they are does not really matter
		BExpression a = expression("a");
		BExpression b = expression("b");
		BExpression c = expression("c");

		List<ITypeConstraint> constraints = Lists.newArrayList();

		// a = d
		constraints.add(constraint(variable(a), variable(c)));

		// b = d
		constraints.add(constraint(variable(b), variable(c)));

		// d = Integer.class
		constraints.add(constraint(variable(c), type(Integer.class)));

		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);
		int result = solver.solve(constraints);
		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint subst : solver.getSubstitutions()) {
			System.out.println(subst.toString());
			assertTrue("Solution should be resolved", subst.isResolved());
			assertEquals("Solution should be Integer.class", Integer.class, subst.getRight().getType());
		}
	}

	/**
	 * Test a simple case a = x, b = y, c = (+ a b), x = Integer.class y = Long.class
	 */
	public void testSimpleFunction() {
		// Needs some EObject to test, what they are does not matter
		// They are only used to hang adapters off that contain type.
		BExpression a = expression("a");
		BExpression b = expression("b");
		BExpression c = expression("c");
		BExpression d = expression("d"); // call of λ c
		BExpression x = expression("x");
		BExpression y = expression("y");

		List<ITypeConstraint> tbSolved = Lists.newArrayList();

		// a = x
		// b = y
		// x = Integer.class
		// y = Long.class
		tbSolved.add(constraint(variable(a), variable(x)));
		tbSolved.add(constraint(variable(b), variable(y)));
		tbSolved.add(constraint(variable(x), type(Integer.class)));
		tbSolved.add(constraint(variable(y), type(Long.class)));

		// c = (+ a b)
		// The lambda parameter is not that interesting,

		// d = evaluatation of (+a b)
		tbSolved.add(constraint(variable(d), product(selectFunction("+", c, variable(a), variable(b)))));

		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);
		int result = solver.solve(tbSolved);

		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint ce : solver.getSubstitutions()) {
			System.out.println(ce.toString());
			assertTrue("Solution should be resolved: " + ce.toString(), ce.isResolved());
		}
		solver.applySolution();
		assertEquals("Solver should have solved (+ a b) to Long", Long.class, variable(d).getType());
	}

	/**
	 * Test a simple case a = d, b = d, d = Integer.class
	 */
	public void testSimpleGeneric() {
		// Needs some EObject to test, what they are does not really matter
		BExpression a = expression("a"); // Iterator<Integer>
		BExpression b = expression("b"); // generic(1, a)
		BExpression c = expression("c");

		List<ITypeConstraint> constraints = Lists.newArrayList();

		// a = List<Integer>.class
		B3ParameterizedType ptype = B3backendFactory.eINSTANCE.createB3ParameterizedType();
		ptype.setRawType(List.class);
		ptype.getActualArgumentsList().add(Integer.class);
		constraints.add(constraint(variable(a), type(ptype)));

		// b = generic(1, a)
		constraints.add(constraint(variable(b), generic(a)));

		// c = b
		constraints.add(constraint(variable(c), variable(b)));

		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);
		int result = solver.solve(constraints);
		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint constraint : solver.getSubstitutions()) {
			System.out.println(constraint.toString());
			assertTrue("Solution should be resolved", constraint.isResolved());
		}
		solver.applySolution();
		assertEquals("Solution should be Integer.class", Integer.class, variable(b).getType());
	}

	// /**
	// * Test that the BTCLambda produces constraints as expected
	// */
	// public void testBTCLastLambda() {
	// BTCFirstLambda tc = B3backendFactory.eINSTANCE.createBTCFirstLambda();
	// BExpression expr = expression("callExpression"); // scope for function lookup
	// List<ITypeExpression> parameterConstraints = Lists.newArrayList();
	//
	// // a = List<Integer>.class
	// B3ParameterizedType ptype = B3backendFactory.eINSTANCE.createB3ParameterizedType();
	// ptype.setRawType(List.class);
	// ptype.getActualArgumentsList().add(Integer.class);
	// parameterConstraints.add(type(ptype));
	//
	// final List<ITypeConstraint> producedConstraints = tc.getConstraints("invoke", expr, factory, parameterConstraints);
	// }
	@Override
	protected void setUp() throws Exception {
		injector = Guice.createInjector(new TestConstraintSolverModule());
		factory = injector.getInstance(TypeScheme.class);
		super.setUp();
	}

	private ITypeConstraint constraint(ITypeExpression a, ITypeExpression b) {
		return factory.constraint(a, b);
	}

	private BExpression expression(String name) {
		BDefValue x = B3backendFactory.eINSTANCE.createBDefValue();
		x.setName(name);
		return x;
	}

	private ITypeExpression generic(EObject x) {
		return factory.generic(x);
	}

	private ITypeExpression lambda(ITypeExpression product, ITypeExpression... given) {
		return factory.lambda(product, given);
	}

	private ITypeExpression product(ITypeExpression a) {
		return factory.lambda(a);
	}

	private ITypeExpression selectFunction(String funcName, BExpression expr, ITypeExpression... constraintExpressions) {
		return factory.select(funcName, expr, constraintExpressions);
	}

	private ITypeExpression type(Type x) {
		return factory.type(x);
	}

	private ITypeExpression variable(EObject x) {
		return factory.variable(x);
	}
}
