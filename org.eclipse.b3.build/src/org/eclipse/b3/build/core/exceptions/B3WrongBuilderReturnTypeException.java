/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.core.exceptions;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.osgi.util.NLS;

public class B3WrongBuilderReturnTypeException extends B3EngineException {

	private static final long serialVersionUID = 1L;

	public B3WrongBuilderReturnTypeException(String unitName, String builder, String resultVariable, Type used) {
		super(NLS.bind(
			"A Builder must evaluate to an instance of BuildSet. Result of getting {0}.{1}()[{2}] has type {3}",
			new Object[] { unitName, builder, resultVariable, used }));
	}

	public B3WrongBuilderReturnTypeException(String builder, Type used) {
		super(NLS.bind("A Builder must evaluate to an instance of BuildSet. Result of {0} has type {1}", new Object[] {
				builder, used }));
	}

}
