/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class OkResultStatus extends Status implements IResultStatus {

	private Object result;

	/**
	 * @param severity
	 * @param pluginId
	 * @param message
	 */
	public OkResultStatus(Object result, String pluginId) {
		super(IStatus.OK, pluginId, B3BackendStatusCodes.RESULT_OK, "OK", null);
		this.result = result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.backend.core.IResultStatus#getResult()
	 */
	public Object getResult() {
		return result;
	}

}
