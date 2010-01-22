/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.cli;

import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.ProgressProvider;
import org.eclipse.equinox.app.IApplication;
import org.kohsuke.args4j.Option;

/**
 * @author filip.hrbek@cloudsmith.com
 * 
 */
public abstract class AbstractCommand implements Comparable<AbstractCommand> {
	public static final Integer EXIT_OK = IApplication.EXIT_OK;

	public static final Integer EXIT_ERROR = Integer.valueOf(13);

	@Option(name = "-?", aliases = { "--help" }, usage = "Print help screen for specified command")
	private boolean help;

	@Option(name = "--stacktrace", usage = "Display stack trace on error")
	private boolean displayStacktrace;

	private String name;

	public final int compareTo(AbstractCommand another) {
		return another == null
				? 1
				: getName().compareTo(another.getName());
	}

	public InputStream getHelpStream() {
		return null;
	}

	public final String getName() {
		return name;
	};

	public ProgressProvider getProgressProvider() {
		return new ProgressProvider() {
			@Override
			public IProgressMonitor createMonitor(Job job) {
				return getDefaultMonitor();
			}
		};
	}

	public abstract String getShortDescription();

	public String getUsageTitle() {
		return getName() + " [options...]";
	}

	public boolean isDisplayStacktrace() {
		return displayStacktrace;
	}

	public boolean isHelp() {
		return help;
	}

	public final int run() throws Exception {
		IProgressMonitor monitor = getProgressProvider().getDefaultMonitor();
		if(monitor == null)
			monitor = new NullProgressMonitor();
		try {
			return run(monitor);
		}
		finally {
			monitor.done();
		}
	}

	protected abstract int run(IProgressMonitor monitor) throws Exception;

	final void setName(String name) {
		this.name = name;
	}
}
