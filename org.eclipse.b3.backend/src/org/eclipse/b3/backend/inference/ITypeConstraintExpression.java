/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.List;

/**
 * 
 */
public interface ITypeConstraintExpression {

	/**
	 * Apply the resolved type described by right to a type variable. Throws IllegalState if applied
	 * the wrong way.
	 * 
	 * @param right
	 * @return
	 */
	public Type apply(ITypeConstraintExpression right);

	/**
	 * Returns true if this expression matches the expr, or if the expr is contained.
	 * 
	 * @param expr
	 * @return
	 */
	public boolean contains(ITypeConstraintExpression expr);

	/**
	 * Rewrite this expression and the given expression into a list of simpler constraints
	 * i.e. f(A,B,C) f(X,Y,Z) => [A=X, B=Y, C=Z].
	 * 
	 * @param expr
	 * @return
	 * @throws IllegalArgumentException
	 *             if this.isSameFunction(expr) == false
	 */
	public List<ITypeConstraint> eliminate(ITypeConstraintExpression expr);

	/**
	 * Constraint expressions that can represent a concrete instantiate type returns the type,
	 * others return null.
	 */
	public Type getType();

	public boolean isIdentifier();

	/**
	 * Return true if it is meaningful to resolve the constraint expression.
	 * Simple expressions always return true, only expressions that benefits
	 * from being resolved late returns false.
	 */
	public boolean isResolvable();

	/**
	 * Return true if the constraint represents a concrete instantiated type.
	 */
	public boolean isResolved();

	/**
	 * Return true if this expression is a non Identifier and this expression has the same arity (number of arguments)
	 * as the given expression.
	 * 
	 * @param expr
	 * @return
	 */
	public boolean isSameFunction(ITypeConstraintExpression expr);

	/**
	 * Return true if the two expressions express the same constraint.
	 */
	public boolean matches(ITypeConstraintExpression expr);

	/**
	 * If being a container of ConstraintExpr
	 * replacement is performed. Has no effect on leaf expressions (their parent will replace them if
	 * they match - they can't replace themselves).
	 * 
	 * @param toBeReplaced
	 * @param replacement
	 */
	public void replace(ITypeConstraintExpression toBeReplaced, ITypeConstraintExpression replacement);

	/**
	 * Containers of ConstraintExpr resolves children.
	 * Constraints that want to introduce additional constraints should return those.
	 */
	public List<ITypeConstraint> resolve();

}
