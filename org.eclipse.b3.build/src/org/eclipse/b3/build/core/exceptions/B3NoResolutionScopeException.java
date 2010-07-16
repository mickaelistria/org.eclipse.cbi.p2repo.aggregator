package org.eclipse.b3.build.core.exceptions;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.osgi.util.NLS;

public class B3NoResolutionScopeException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3NoResolutionScopeException() {
		super(NLS.bind("No resolution scope found", new Object[] {}));
	}

}
