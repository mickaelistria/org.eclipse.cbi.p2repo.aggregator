/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.transformer;

import java.util.Map;

/**
 * Capable of adding data to context. It's used for aggregator transformations.
 *
 * @author Karel Brezina
 *
 */
public abstract class TransformerContextContributor {

	public interface IInteractiveHook {
		void contributeToContext(Map<String, Object> context);
	}

	private IInteractiveHook interactiveHook;

	/**
	 * Add data to context
	 *
	 * @param context
	 */
	public abstract void contributeDefaultsToContext(Map<String, Object> context);

	/**
	 * Add data to context, possibly obtained by an interactive user interface
	 *
	 * @param context
	 */
	public final void contributeToContext(Map<String, Object> context) {
		if(interactiveHook != null)
			interactiveHook.contributeToContext(context);
		else
			contributeDefaultsToContext(context);
	}

	/**
	 * @param interactiveHook
	 *            the interactiveHook to set
	 */
	public final void setInteractiveHook(IInteractiveHook interactiveHook) {
		this.interactiveHook = interactiveHook;
	}
}
