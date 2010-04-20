package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.osgi.util.NLS;

public class B3UnresolvedRequirementException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3UnresolvedRequirementException(BuildUnit unit, IBuilder builder, RequiredCapability requiredCapability) {
		super(NLS.bind(
			"Unresolved requirement in {0}::{1}. Requirement on namespace={2}, name={3}, range={4} not resolved.",
			new Object[] {
					unit.getName(), builder.getName(), requiredCapability.getNameSpace(), requiredCapability.getName(),
					requiredCapability.getVersionRange() }));
	}

}
