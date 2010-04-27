/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.util;

import static org.eclipse.b3.util.LogLevel.DEBUG;
import static org.eclipse.b3.util.LogLevel.ERROR;
import static org.eclipse.b3.util.LogLevel.INFO;
import static org.eclipse.b3.util.LogLevel.WARNING;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

/**
 * @author filip.hrbek@cloudsmith.com
 * 
 */
public class LogUtils {

	private static final int MAGIC = B3Util.getPluginID().hashCode();

	public static void debug(String msg, Object... args) {
		log(DEBUG, msg, args);
	}

	public static void debug(Throwable t, String msg, Object... args) {
		log(DEBUG, t, msg, args);
	}

	public static void error(String msg, Object... args) {
		log(ERROR, msg, args);
	}

	public static void error(Throwable t, String msg, Object... args) {
		log(ERROR, t, msg, args);
	}

	public static ILog getLog() {
		return Platform.getLog(B3Util.getPlugin().getBundle());
	}

	public static void info(String msg, Object... args) {
		log(INFO, msg, args);
	}

	public static void info(Throwable t, String msg, Object... args) {
		log(INFO, t, msg, args);
	}

	public static void log(LogLevel level, String msg, Object... args) {
		log(level, null, msg, args);
	}

	public static void log(LogLevel level, Throwable t, String msg, Object... args) {
		String fullMessage = (args == null || args.length == 0)
				? msg
				: String.format(msg, args);

		B3Util plugin = B3Util.getPlugin();
		if(level.ordinal() >= plugin.getConsoleLogLevel().ordinal())
			System.out.println(fullMessage);
		if(level.ordinal() >= plugin.getEclipseLogLevel().ordinal())
			getLog().log(new Status(level.getStatusLevel(), B3Util.getPluginID(), MAGIC, fullMessage, t));
	}

	public static void warning(String msg, Object... args) {
		log(WARNING, msg, args);
	}

	public static void warning(Throwable t, String msg, Object... args) {
		log(WARNING, t, msg, args);
	}
}
