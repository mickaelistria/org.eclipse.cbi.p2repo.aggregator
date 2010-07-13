package org.eclipse.b3.build.core;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.osgi.util.NLS;

public class B3WrongBuilderReturnType extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3WrongBuilderReturnType(String unitName, String builder, String resultVariable, Type used) {
		super(NLS.bind(
			"A Builder must evaluate to an instance of BuildSet. Result of getting {0}.{1}()[{2}] has type {3}",
			new Object[] { unitName, builder, resultVariable, used }));
	}

	public B3WrongBuilderReturnType(String builder, Type used) {
		super(NLS.bind("A Builder must evaluate to an instance of BuildSet. Result of {0} has type {1}", new Object[] {
				builder, used }));
	}

}
