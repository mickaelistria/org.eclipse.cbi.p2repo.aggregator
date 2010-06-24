/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.tests.repo;

import java.net.URI;

import org.eclipse.b3.build.ExecutionStackRepository;
import org.eclipse.b3.build.impl.ExecutionStackRepositoryImpl;

/**
 * A test repository that delegates to a stack repository
 * 
 */
public class TestRepo extends ExecutionStackRepositoryImpl {

	@SuppressWarnings("unused")
	private URI location;

	private ExecutionStackRepository repo;

	public TestRepo() {
		super();
	}

	public TestRepo(URI location) {
		this();
		this.location = location;
	}

	// /*
	// * (non-Javadoc)
	// *
	// * @see
	// *
	// org.eclipse.b3.build.core.IBuildUnitRepository#resolve(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext
	// * , org.eclipse.b3.build.RequiredCapability)
	// */
	// public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
	// return repo.resolve(ctx, requiredCapability);
	// }
	//
	// /*
	// * (non-Javadoc)
	// *
	// * @see
	// * org.eclipse.b3.build.core.IBuildUnitRepository#resolve(org.eclipse.b3.build.EffectiveRequirementFacade)
	// */
	// public BuildUnit resolve(EffectiveRequirementFacade effectiveRequirement) throws Throwable {
	// return repo.resolve(effectiveRequirement);
	// }

}
