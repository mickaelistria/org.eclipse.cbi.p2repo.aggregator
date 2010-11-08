/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Describes a Type Constraint where the right expression should be assignable to the left expression.
 * 
 */
public interface ITypeConstraint {

	/**
	 * Apply resolved type to variable. Throws IllegalStateException if not resolved.
	 * 
	 * @return
	 */
	public Type apply();

	/**
	 * True if the given expression is contained in the right expression.
	 * 
	 * @param expr
	 * @return
	 */
	public boolean contains(ITypeExpression expr);

	public ITypeExpression getLeft();

	public ITypeExpression getRight();

	public boolean isResolvable();

	public boolean isResolved();

	/**
	 * Replaces all constraint expressions that match toBeReplaced both on the left and right side.
	 * 
	 * @param toBeReplaced
	 * @param replacement
	 */
	public void replace(ITypeExpression toBeReplaced, ITypeExpression replacement);

	public List<ITypeConstraint> resolve();

}
