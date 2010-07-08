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
