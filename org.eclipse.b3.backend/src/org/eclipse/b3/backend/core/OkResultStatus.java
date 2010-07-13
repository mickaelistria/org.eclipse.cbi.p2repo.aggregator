/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import org.eclipse.core.runtime.Status;

public class OkResultStatus extends Status implements IResultStatus {

	private Object result;

	/**
	 * @param severity
	 * @param pluginId
	 * @param message
	 */
	public OkResultStatus(Object result, String pluginId) {
		super(Status.OK, pluginId, "OK Result");
		this.result = result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.core.IResultStatus#getResult()
	 */
	// @Override
	public Object getResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
