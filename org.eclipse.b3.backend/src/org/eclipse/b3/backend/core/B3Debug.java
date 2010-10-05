/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.core;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Utility to help with debugging/tracing.
 * To add formatting of a particular traced element, simply add implementation of a 'str(ElementType element)'.
 * The default is to trace using element.toString().
 */
public class B3Debug {
	@Inject
	private static Injector injector;

	private static final Logger log = Logger.getLogger(B3Debug.class);

	public static final String B3_GLOBAL_DEBUG_OPTION = "org.eclipse.b3.backend/debug";

	public static final String B3_EVALUATOR_DEBUG_OPTION = "org.eclipse.b3.backend/debug/evaluator";

	public static final String B3_TYPER_DEBUG_OPTION = "org.eclipse.b3.backend/debug/typer";

	public static final String B3_ENGINE_DEBUG_OPTION = "org.eclipse.b3.backend/debug/engine";

	public static final String B3_WEAVER_DEBUG_OPTION = "org.eclipse.b3.backend/debug/weaver";

	public static final String B3_UI_PROPOSAL_DEBUG_OPTION = "org.eclipse.b3.backend/debug/proposals";

	public static boolean global = false;

	public static boolean engine = false;

	public static boolean typer = false;

	public static boolean evaluator = false;

	public static boolean weaver = false;

	private static boolean configured = false;

	public static boolean proposals = false;

	private static final B3Debug eINSTANCE = new B3Debug();

	/**
	 * Configures the debugging flags - called once from activator.
	 * (Flags may be manipulated in the debugger at a later point).
	 */
	public static void configure() {
		if(configured)
			return;
		boolean platform = Platform.inDebugMode();
		global = platform && getDebugOption(B3_GLOBAL_DEBUG_OPTION);
		evaluator = global && getDebugOption(B3_EVALUATOR_DEBUG_OPTION);
		typer = global && getDebugOption(B3_TYPER_DEBUG_OPTION);
		engine = global && getDebugOption(B3_ENGINE_DEBUG_OPTION);
		weaver = global && getDebugOption(B3_WEAVER_DEBUG_OPTION);
		proposals = global && getDebugOption(B3_UI_PROPOSAL_DEBUG_OPTION);
		configured = true;
		if(global)
			log.setLevel(org.apache.log4j.Level.DEBUG);
	}

	public static void trace(String message, Object... objects) {
		StringBuffer buf = new StringBuffer(message.length() + objects.length * 10);
		buf.append(message);
		for(int i = 0; i < objects.length; i++)
			buf.append(eINSTANCE.getStringProvider().doToString(objects[i]));
		log.debug(buf.toString());
	}

	/**
	 * Safe way of getting the debug option
	 * 
	 * @param option
	 * @return
	 */
	private static boolean getDebugOption(String option) {
		String value = Platform.getDebugOption(option);
		return (value != null && "true".equals(value))
				? true
				: false;
	}

	private IStringProvider stringProvider;

	private synchronized IStringProvider getStringProvider() {
		if(stringProvider == null)
			stringProvider = injector.getInstance(IStringProvider.class);
		return stringProvider;
	}

}
