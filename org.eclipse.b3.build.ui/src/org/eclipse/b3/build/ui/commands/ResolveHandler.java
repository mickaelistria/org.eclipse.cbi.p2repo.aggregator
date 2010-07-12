/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 * 
 */

package org.eclipse.b3.build.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class ResolveHandler extends ExecuteHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		setPerformResolve(true);
		return super.execute(event);
	}

}
