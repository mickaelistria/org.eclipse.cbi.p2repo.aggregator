/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.cli.helpers;

import org.eclipse.b3.cli.AbstractCommand;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public final class EmptyCommand extends AbstractCommand {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.b3.cli.AbstractCommand#getShortDescription()
	 */
	@Override
	public String getShortDescription() {
		return "This is a dummy command";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.b3.cli.AbstractCommand#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected int run(IProgressMonitor monitor) throws Exception {
		return AbstractCommand.EXIT_OK;
	}

}
