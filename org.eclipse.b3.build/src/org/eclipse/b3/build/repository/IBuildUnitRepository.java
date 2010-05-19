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
package org.eclipse.b3.build.repository;

import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.build.build.RequiredCapability;

/**
 * This is the b3 main interface for a repository of Build Units.
 * Instances of this interface are used to lookup build units.
 * An implementor must have a default constructor.
 * After an instance has been constructed, it will receive a call to the initialize method with
 * the data to use to set up processing.
 * An implementation should do its initialization lazily on a call to resolve. BuildUnitRepository instances will be
 * created even if they are never used.
 * Note that long running tasks should pick up the progress monitor from the execution context.
 * 
 */
public interface IBuildUnitRepository {
	/**
	 * Initializes a newly created build unit repository from a Repository (which has all the required data
	 * to make it possible to connect to a remote repository, perform local caching, find branches, etc.).
	 * 
	 * Note that a progress monitor is available in the ctx.
	 * 
	 * @param ctx
	 *            supplied primarily to enable picking up the relevant progress monitor
	 * @param repository
	 *            initialization data
	 * @param options
	 *            named initialization data that is specific to a particular type of repository
	 * @throws Throwable
	 */
	void initialize(BExecutionContext ctx, Repository repository, Map<String, Object> options) throws Throwable;

	/**
	 * Returns a BuilUnit, or null if a build unit fulfilling the required capability can not be found.
	 * The unitPath is a path from a 'root' where the caller believes that the build unit should be found.
	 * The unitPath is relative to 'a branch'.
	 * 
	 * @param ctx
	 *            supplied primarily to enable picking up the relevant progress monitor
	 * @param requiredCapability
	 *            contains the original request
	 * @param options
	 *            contains provider specific options (path from root, dual identifiers, etc)
	 */
	BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability, Map<String, Object> options)
			throws Throwable;

} // BuildUnitRepository
