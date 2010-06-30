/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import org.eclipse.emf.ecore.EObject;

/**
 *
 */
public class InferenceException extends Exception {
	private static final long serialVersionUID = 1L;

	private String message;

	private EObject source;

	private Integer feature;

	public InferenceException(String message, EObject source, Integer feature) {
		this.message = message;
		this.source = source;
		this.feature = feature;
	}

	/**
	 * @return the feature
	 */
	public Integer getFeature() {
		return feature;
	}

	/**
	 * @return the message
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * @return the source
	 */
	public EObject getSource() {
		return source;
	}
}
