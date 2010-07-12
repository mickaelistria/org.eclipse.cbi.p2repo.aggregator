/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import org.eclipse.core.runtime.IStatus;

/**
 * Simple status that have an Object result.
 * 
 */
public interface IResultStatus extends IStatus {

	public Object getResult();
}
