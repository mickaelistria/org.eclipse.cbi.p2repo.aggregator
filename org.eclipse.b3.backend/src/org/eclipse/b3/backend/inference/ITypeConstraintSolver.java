/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.util.List;

/**
 * Defines the interface for a type constraint solver.
 * 
 */
public interface ITypeConstraintSolver {

	public final static int SOLUTION_FOUND = 0;

	public final static int RECURSIVE = 1;

	public final static int NOT_UNITABLE = 2;

	public final static int TOO_MANY_ITERATIONS = 3;

	/**
	 * Add a single constraint to the set of constraint to solve. May be added in the middle of solving
	 * if new constraints are discovered.
	 * 
	 * @param constraint
	 */
	public void add(ITypeConstraint constraint);

	/**
	 * Add multiple constraints to the set of constraints to solve. may be added in the middle of solving
	 * if new constraints are discovered.
	 * 
	 * @param constraints
	 */
	public void add(List<ITypeConstraint> constraints);

	/**
	 * Applies the solution to the type variables. If there are unresolved constraints an IllegalStateException
	 * is thrown. Only resolved isIdentifier() solutions are applied.
	 */
	public void applySolution();

	public List<ITypeConstraint> getSubstitutions();

	/**
	 * Solves the set of constraints added to the solver.
	 * Returns {@link #SOLUTION_FOUND} if a solution was found, {@link #RECURSIVE}, if the constraints are recursive, and {@link #NOT_UNITABLE},
	 * if there are conflicting constraints.
	 * 
	 * Note that a set of substitutions - i.e. the result is always available, but it may be empty, or contain
	 * unresolved entries if the returned status is not {@link #SOLUTION_FOUND}.
	 * 
	 * @return status code indicating the outcome
	 */
	public int solve();

	/**
	 * Add a set of constraints and then solve them. Note that the set of constraints will be unaffected, but
	 * the constraints themselves will be modified as a side effect of solving. This is a convenience method doing
	 * the same as {@link #add(List)} followed by {@link #solve()}.
	 * 
	 * @param constraints
	 * @return
	 */
	public int solve(List<ITypeConstraint> constraints);

}
