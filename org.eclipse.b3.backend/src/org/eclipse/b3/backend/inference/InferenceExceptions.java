/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.util.Collections;
import java.util.List;

import org.eclipse.b3.backend.core.exceptions.B3EngineException;

/**
 * An exception for multiple inference exceptions.
 * 
 */
public class InferenceExceptions extends B3EngineException {
	private static final long serialVersionUID = -6988917850475245897L;

	List<InferenceException> exceptions;

	public InferenceExceptions(List<InferenceException> exceptions) {
		super("Type not declared or inferable");
		this.exceptions = Collections.unmodifiableList(exceptions);
	}

	public List<InferenceException> getExceptions() {
		return exceptions;
	}
}
