/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.util.List;

import org.eclipse.b3.backend.core.B3Debug;

import com.google.inject.Inject;
import com.google.inject.internal.Lists;

/**
 * An implementation of "Constraint Unity" - given a set of <i>constraints</i> on the form X = Y
 * the algorithm unites these into a set of <i>substitutions</i>.
 * 
 * The algorithm works as follows:
 * Two lists are maintained: <i>constraints</i> and <i>substitutions</i>
 * The basic algorithm does the following:
 * <ol>
 * <li>pops a constraint of the constraint stack</li>
 * <li>evaluates a set of rules that leads to a refinement of the knowledge</li>
 * <li>until the constraint stack is empty, or there is an error</li>
 * </ol>
 * 
 * Rules are as follows:
 * <ol>
 * <li>If A matches B then do nothing (e.g. 'integer' = 'integer')</li>
 * <li>If A is an identifier, then replace A with B in the constraints and in the substitutions (e.g. A = 'integer')</li>
 * <li>If B is an identifier, then replace B with A in the constraints and in the substitutions (e.g. 'integer' = A)</li>
 * <li>If A and B are the same type-function and have the same arity i.e. A=f(X1, X2, ...Xn) and B=f(Y1, Y2,...Yn) then add the constraints X1=Y1,
 * X2=Y2, ... Xn=Yn to the set of constraints (e.g (+ integer integer) = (+ a b) results in integer = a, integer = b)</li>
 * </ol>
 * 
 * If in step 2 or 3, the replaced occurs in the replacement - this is an error (a recursive constraint).
 * 
 * This algorithm works independent of the order of how constraints are stated, but to reduce the number of steps,
 * as much as possible is reduced before reducing those constraints that requires search. All constraints
 * that are popped from the constraint stack are resolved if it states that it is resolvable (there is enough
 * information to make an attempt at finding a type meaningful). The resolvable constraints are popped before
 * un-resolvable constraints (they may become resolvable later).
 * 
 * When constraint expressions are replaced, and if the replacement represents an instantiated type, the type value
 * is applied to the type variable (i.e. changes the value of that variable).
 * 
 * This solver can (probably) be used as the only means to infer types, but operates just a well when a first pass
 * is made solving all trivial cases - this dramatically reduces the size of the constraint problem to solve.
 * 
 * For instance, all expressions like 1 + 1 are trivially solved, while expressions like
 * [1 2 3].collect(3, _ |constant, x| (x + constant) * 2.0 ) requires constraints to produce [<Double>].
 * 
 * The Solver solves constraints in a given ITypeScheme. This scheme is used to create subschemes required
 * when an overall constraint problem needs to be divided into smaller parts (this part not yet used or tested).
 * 
 * The basic algorithm is used from an outer loop where an additional pass allows each constraint to produce a new
 * set of constraints based on what was solved in the first pass. This continues until no additional constraints
 * have been produced. There is currently a max emergency break at 10 iterations - which typically indicates a problem
 * with the implementation of type constraint expressions.
 * 
 * <h2>Usage</h2>
 * <ul>
 * <li>Instantiate a TypeConstraintSolver (or inject one via Guice).</li>
 * <li>Create constraints using an instance of a ITypeScheme) and pass to the {@link #solve(List)}, or add constraints using
 * {@link #add(ITypeConstraint)} or {@link #add(List)}.</li>
 * <li>It is possible to keep adding constraints and calling {@link #solve()} multiple times.</li>
 * <li>Calling {@link #solve(List)} will clear the state of the solver).</li>
 * </ul>
 */
public class TypeConstraintSolver implements ITypeConstraintSolver {

	private List<ITypeConstraint> substitutions;

	private List<ITypeConstraint> constraints;

	private static final int MAX_RETRY = 5;

	@Inject
	public TypeConstraintSolver() {
		substitutions = Lists.newArrayList();
		constraints = Lists.newArrayList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.inference.ITypeConstraintSolver#add(org.eclipse.b3.backend.inference.ITypeConstraint)
	 */
	public void add(ITypeConstraint constraint) {
		this.constraints.add(constraint);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.inference.ITypeConstraintSolver#add(java.util.List)
	 */
	public void add(List<ITypeConstraint> constraints) {
		this.constraints.addAll(constraints);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.inference.ITypeConstraintSolver#applySolution()
	 */
	public void applySolution() {
		for(ITypeConstraint solved : substitutions) {
			if(!solved.isResolved())
				throw new IllegalStateException("Unresolved Solution: " + solved.toString());
			if(solved.getLeft().isIdentifier())
				solved.apply();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.inference.ITypeConstraintSolver#getSubstitutions()
	 */
	public List<ITypeConstraint> getSubstitutions() {
		return substitutions;
	}

	public int solve() {
		int result = -1;

		// The emergency break is there if something is wrong with the implementation in the
		// constraint expressions
		//
		int emergencyBreak = MAX_RETRY;
		while(constraints.size() > 0) {
			if(B3Debug.solver) {
				B3Debug.trace(
					"[solver] PHASE(" + (MAX_RETRY - emergencyBreak) + ") there are: ", constraints.size(),
					" constraints left to solve:");
				dump();
			}
			emergencyBreak--;
			if(emergencyBreak <= 0) {
				if(B3Debug.solver)
					B3Debug.trace("[solver] => TOO MANY ITERATIONS");
				return TOO_MANY_ITERATIONS;
			}
			result = unify();
			if(result == SOLUTION_FOUND || result == NOT_UNITABLE) {
				String before = ""; // used only when debugging
				for(ITypeConstraint c : substitutions) {
					if(B3Debug.solver) {
						before = c.toString();
					}
					List<ITypeConstraint> additions = c.resolve();
					if(B3Debug.solver) {
						String after = c.toString();
						if(!before.equals(after))
							B3Debug.trace("[solver] RESOLVED: [", before, "] TO: ", after);
						if(additions.size() > 0)
							B3Debug.trace("[solver] Resolve of: ", before, "adds constraint: ", additions);
					}
					constraints.addAll(additions);
				}
			}
			else
				break;
		}
		if(emergencyBreak <= 0 || constraints.size() > 0) {
			if(B3Debug.solver)
				B3Debug.trace("[solver] => NOT UNITEABLE");
			result = NOT_UNITABLE;
		}
		if(B3Debug.solver)
			B3Debug.trace("[solver] Number of phases used: ", MAX_RETRY - emergencyBreak);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.inference.ITypeConstraintSolver#solve(java.util.List)
	 */
	public int solve(List<ITypeConstraint> constraints) {
		this.constraints.addAll(constraints);
		substitutions = Lists.newArrayList();
		return solve();
	}

	public int unify() {
		ITypeConstraint c;
		while((c = popConstraint()) != null) {
			// RULE 1, X == Y
			if(c.getLeft().matches(c.getRight())) {
				/* do nothing */;
				if(B3Debug.solver) {
					B3Debug.trace("[solver] unify(", c.getLeft(), " == ", c.getRight(), ") => CONSTRAINT DROPPED");
				}
			}
			// RULE 2, identifier(X) ? replace(X, Y)
			else if(c.getLeft().isIdentifier()) {
				if(c.getRight().contains(c.getLeft())) {
					// put it back for inspection
					constraints.add(c);
					if(B3Debug.solver)
						B3Debug.trace("[solver] unify(", c.getRight(), " contains ", c.getLeft(), ") => RECURSION");

					return RECURSIVE;
				}
				if(B3Debug.solver) {
					B3Debug.trace("[solver] unify(", c.getLeft(), " replaced by: ", c.getRight(), ") => NEW STATE");
				}
				replaceAll(c.getLeft(), c.getRight());
				substitutions.add(c);
				if(B3Debug.solver) {
					dump();
				}
			}
			// RULE 3, identifier(Y) ? replace(Y, X)
			else if(c.getRight().isIdentifier()) {
				if(c.getLeft().contains(c.getRight())) {
					// put it back for inspection
					constraints.add(c);
					if(B3Debug.solver)
						B3Debug.trace("[solver] unify(", c.getRight(), " contains ", c.getLeft(), ") => RECURSION");
					return RECURSIVE;
				}
				replaceAll(c.getRight(), c.getLeft());
				substitutions.add(c);
				if(B3Debug.solver) {
					B3Debug.trace("[solver] unify(", c.getRight(), " replaced by: ", c.getLeft(), ") => NEW STATE");
					dump();
				}
			}
			// RULE 4, C(X1...Xn) = C(Y1...Yn)
			else if(c.getLeft().isSameFunction(c.getRight())) {
				List<ITypeConstraint> eliminations = c.getLeft().eliminate(c.getRight());
				for(ITypeConstraint x : eliminations)
					constraints.add(x);
				if(B3Debug.solver) {
					B3Debug.trace("[solver] unify(", c.getLeft(), " eliminated by: ", c.getRight(), ") => NEW STATE");
					dump();
				}
			}
			else {
				if(B3Debug.solver) {
					B3Debug.trace("[solver] => NOT UNITABLE: ", c.getLeft(), " and ", c.getRight());
					dump();
				}
				return NOT_UNITABLE;
			}
		}
		// stack is empty
		if(B3Debug.solver) {
			B3Debug.trace("[solver] => ALL CONSTRAINTS PROCESSED");
			dump();
		}
		return SOLUTION_FOUND;
	}

	private void dump() {
		B3Debug.trace("[solver] Constraints -----");
		for(ITypeConstraint c : constraints)
			B3Debug.trace("         ", c);
		B3Debug.trace("[solver] Substitutions -----");
		for(ITypeConstraint c : substitutions)
			B3Debug.trace("                         ", c);
		B3Debug.trace("[solver] End Solver State");
	}

	private ITypeConstraint popConstraint() {
		if(constraints.size() == 0)
			return null;

		// TODO: it may be faster if constraints are processed in some order other than
		// the (LIFO) order as less manipulation may be required if simple facts are
		// processed first.

		int lastIndex = constraints.size() - 1;
		return constraints.remove(lastIndex);
	}

	/**
	 * Replaces toBeReplaced in both constraints and substitutions.
	 * 
	 * @param toBeReplaced
	 * @param replacement
	 */
	private void replaceAll(ITypeExpression toBeReplaced, ITypeExpression replacement) {
		for(ITypeConstraint c : constraints)
			c.replace(toBeReplaced, replacement);
		for(ITypeConstraint c : substitutions)
			c.replace(toBeReplaced, replacement);
	}
}
