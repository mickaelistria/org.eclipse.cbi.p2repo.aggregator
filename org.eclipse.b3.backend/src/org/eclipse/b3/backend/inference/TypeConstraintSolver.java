/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.util.List;

import com.google.inject.internal.Lists;

/**
 * An implementation of Constraint Unity - given a set of constraints on the form X = Y
 * is united into a set of substitutions.
 * 
 * The algorithm works as follows:
 * Two lists are maintained: constraints and subsitutions
 * The basic algorithm does the following:
 * 1. pops a constraint of the constraint stack
 * 2. evaluates a set of rules that leads to a refinement of the knowledge
 * 3. until the constraint stack is empty, or there is an error
 * 
 * Rules are as follows:
 * 1. If A equals B then do nothing
 * 2. If A is an identifier, then replace A with B in the constraints and in the substitutions
 * 3. If B is an identifier, then replace B with A in the constraints and in the substitutions
 * 4. If A and B are the same type-function and have the same arity i.e. A=f(X1, X2, ...Xn) and
 * B=f(Y1, Y2,...Yn) then add the constraints X1=Y1, X2=Y2, ... Xn=Yn to the set of constraints
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
 */
public class TypeConstraintSolver implements ITypeConstraintSolver {

	private List<ITypeConstraint> substitutions;

	private List<ITypeConstraint> constraints;

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
				throw new IllegalStateException("Unresolved Solution");
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
		for(ITypeConstraint c = popConstraint(); c != null; c = popConstraint()) {
			// RULE 1, X == Y
			if(c.getLeft().equals(c.getRight()))
				/* do nothing */;
			// RULE 2, identifier(X) ? replace(X, Y)
			else if(c.getLeft().isIdentifier()) {
				if(c.getRight().contains(c.getLeft())) {
					constraints.add(c);
					return RECURSIVE;
				}
				replaceAll(c.getLeft(), c.getRight());
				substitutions.add(c);
			}
			// RULE 3, identifier(Y) ? replace(Y, X)
			else if(c.getRight().isIdentifier()) {
				if(c.getLeft().contains(c.getRight())) {
					constraints.add(c);
					return RECURSIVE;
				}
				replaceAll(c.getRight(), c.getLeft());
				substitutions.add(c);
			}
			// RULE 4, C(X1...Xn) = C(Y1...Yn)
			else if(c.getLeft().isSameFunction(c.getRight())) {
				List<ITypeConstraint> eliminations = c.getLeft().eliminate(c.getRight());
				for(ITypeConstraint x : eliminations)
					constraints.add(x);
			}
			else
				return NOT_UNITABLE;
		}
		// stack is empty
		return SOLUTION_FOUND;
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

	private ITypeConstraint popConstraint() {
		if(constraints.size() == 0)
			return null;
		int lastIndex = constraints.size() - 1;
		for(int i = lastIndex; i >= 0; i--) {
			ITypeConstraint c = constraints.get(i);
			if(c.isResolvable()) {
				c.resolve();
				constraints.remove(i);
				return c;
			}
		}
		// only non resolvable left - just pop one
		return constraints.remove(lastIndex);
	}

	private void replaceAll(ITypeConstraintExpression toBeReplaced, ITypeConstraintExpression replacement) {
		for(ITypeConstraint c : constraints)
			c.replace(toBeReplaced, replacement);
		for(ITypeConstraint c : substitutions)
			c.replace(toBeReplaced, replacement);
	}
}
