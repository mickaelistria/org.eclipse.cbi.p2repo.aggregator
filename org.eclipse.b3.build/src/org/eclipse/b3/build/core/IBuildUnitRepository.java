/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.RepositoryHandler;
import org.eclipse.b3.build.build.RequiredCapability;

/**
 * This is the b3 main interface for a repository of Build Units.
 * Instances of this interface are used to lookup build units.
 * An implementor must have a default constructor.
 * Note that long running tasks should pick up the progress monitor from the execution context.
 * 
 */
public interface IBuildUnitRepository {
	/**
	 * Initializes a newly created build unit repository from a Repository Handler (which has all the required data
	 * to make it possible to connect to a remote repository, perform local caching, etc.)
	 * Note that a progress monitor is available in the ctx.
	 * 
	 * @param ctx
	 *            supplied primarily to enable picking up the relevant progress monitor
	 * @param handlerData
	 *            initialization data
	 * @throws Throwable
	 */
	void initialize(BExecutionContext ctx, RepositoryHandler handlerData) throws Throwable;

	/**
	 * Returns a BuilUnit, or null if a build unit fulfilling the required capability can not be found.
	 * The unitPath is a path from a 'root' where the caller believes that the build unit should be found.
	 * The unitPath is relative to 'a branch'.
	 * 
	 * @param ctx
	 *            supplied primarily to enable picking up the relevant progress monitor
	 * @param requiredCapability
	 *            contains all request details
	 * @param unitPath
	 *            relative path from a 'branch root' to repository 'file' representing the unit
	 */
	BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability, String unitPath) throws Throwable;

} // BuildUnitRepository
