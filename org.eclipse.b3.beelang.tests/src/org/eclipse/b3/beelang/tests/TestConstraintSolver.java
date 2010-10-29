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

import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.inference.ITypeConstraint;
import org.eclipse.b3.backend.inference.ITypeConstraintExpression;
import org.eclipse.b3.backend.inference.ITypeConstraintSolver;
import org.eclipse.b3.backend.inference.ITypeScheme;
import org.eclipse.b3.backend.inference.TypeScheme;
import org.eclipse.b3.backend.inference.TypeConstraintSolver;
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
		}
	}

	private Injector injector;

	private ITypeScheme factory;

	/**
	 * invoke(| x, y | x + y, 1, 2)
	 * Maps to the type constraints:
	 * Test a simple case a = x, b = y, c = (+ a b), d = (x,y)=>c, e = 1, f = 2, g = (invoke d e f)
	 */
	public void testLambdaCase() {
		// Needs some EObject to test, what they are does not matter
		// They are only used to hang adapters off that contain type.
		BExpression a = expression();
		BExpression b = expression();
		BExpression c = expression();
		BExpression d = expression();
		BExpression e = expression();
		BExpression f = expression();
		BExpression x = expression();
		BExpression y = expression();

		// List<ITypeConstraint> constraints = Lists.newArrayList();
		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);

		// a = x
		solver.add(constraint(variable(a), variable(x)));

		// b = y
		solver.add(constraint(variable(b), variable(y)));

		// x = e
		solver.add(constraint(variable(x), variable(e)));

		// y = f
		solver.add(constraint(variable(y), variable(f)));

		// c = (+ a b)
		solver.add(constraint(variable(c), selectFunction("+", variable(a), variable(b))));

		// d = (x, y) => c
		// i.e. a function of two variables x and y that returns something of the type of c
		solver.add(constraint(variable(d), produces(variable(c), variable(x), variable(y))));

		// e = Integer.class
		solver.add(constraint(variable(e), type(Integer.class)));

		// f = Long.class
		solver.add(constraint(variable(f), type(Long.class)));

		// g = (invoke d e f)
		//

		int result = solver.solve();

		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint ce : solver.getSubstitutions()) {
			System.out.println(ce.toString());
			assertTrue("Solution should be resolved: " + ce.toString(), ce.isResolved());
		}
		solver.applySolution();
		assertEquals("Solver should have solved (+ a b) to Long", Long.class, variable(c).getType());
	}

	/**
	 * Test a simple case a = d, b = d, d = Integer.class
	 */
	public void testSimpleConstraint() {
		// Needs some EObject to test, what they are does not really matter
		BExpression a = expression();
		BExpression b = expression();
		BExpression d = expression();

		List<ITypeConstraint> constraints = Lists.newArrayList();

		// a = d
		constraints.add(constraint(variable(a), variable(d)));

		// b = d
		constraints.add(constraint(variable(b), variable(d)));

		// d = Integer.class
		constraints.add(constraint(variable(d), type(Integer.class)));

		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);
		int result = solver.solve(constraints);
		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint c : solver.getSubstitutions()) {
			System.out.println(c.toString());
			assertTrue("Solution should be resolved", c.isResolved());
			assertEquals("Solution should be Integer.class", Integer.class, c.getRight().getType());
		}
	}

	/**
	 * Test a simple case a = x, b = y, c = (+ a b), x = Integer.class y = Long.class
	 */
	public void testSimpleFunction() {
		// Needs some EObject to test, what they are does not matter
		// They are only used to hang adapters off that contain type.
		BExpression a = expression();
		BExpression b = expression();
		BExpression c = expression();
		BExpression x = expression();
		BExpression y = expression();

		List<ITypeConstraint> constraints = Lists.newArrayList();

		// a = x
		constraints.add(constraint(variable(a), variable(x)));

		// b = y
		constraints.add(constraint(variable(b), variable(y)));

		// x = Integer.class
		constraints.add(constraint(variable(x), type(Integer.class)));

		// y = Long.class
		constraints.add(constraint(variable(y), type(Long.class)));

		// c = (+ a b)
		constraints.add(constraint(variable(c), selectFunction("+", variable(a), variable(b))));

		ITypeConstraintSolver solver = injector.getInstance(TypeConstraintSolver.class);
		int result = solver.solve(constraints);

		assertEquals("Solver should return 0 == ok", 0, result);

		for(ITypeConstraint ce : solver.getSubstitutions()) {
			System.out.println(ce.toString());
			assertTrue("Solution should be resolved: " + ce.toString(), ce.isResolved());
		}
		solver.applySolution();
		assertEquals("Solver should have solved (+ a b) to Long", Long.class, variable(c).getType());
	}

	@Override
	protected void setUp() throws Exception {
		injector = Guice.createInjector(new TestConstraintSolverModule());
		factory = injector.getInstance(TypeScheme.class);

		super.setUp();
	}

	private ITypeConstraint constraint(ITypeConstraintExpression a, ITypeConstraintExpression b) {
		return factory.constraint(a, b);
	}

	private BExpression expression() {
		return B3backendFactory.eINSTANCE.createBLiteralAny();
	}

	private ITypeConstraintExpression produces(ITypeConstraintExpression product, ITypeConstraintExpression... given) {
		return factory.produces(product, given);
	}

	private ITypeConstraintExpression selectFunction(String funcName,
			ITypeConstraintExpression... constraintExpressions) {
		return factory.function(funcName, null, constraintExpressions);
	}

	private ITypeConstraintExpression type(Type x) {
		return factory.type(x);
	}

	private ITypeConstraintExpression variable(EObject x) {
		return factory.variable(x);
	}
}
