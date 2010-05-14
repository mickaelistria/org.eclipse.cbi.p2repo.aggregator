/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.core.runtime.IStatus;

public interface IBuildUnitResolver {

	/**
	 * Transitively Resolve all BuildUnit instances defined in the given BuildContext.
	 * 
	 * @param ctx
	 * @return a MultiStatus describing the outcome of the resolution of all found build units
	 */
	public IStatus resolveAll(BuildContext ctx);

	/**
	 * Transitively resolve one defined BuildUnit instances defined in the given BuildContext.
	 * 
	 * @param unit
	 *            the BuildUnit to resolve
	 * @param ctx
	 * @return a MultiStatus describing the outcome of the resolution
	 */
	public IStatus resolveUnit(BuildUnit unit, BuildContext ctx);

}
