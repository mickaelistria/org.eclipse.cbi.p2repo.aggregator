/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.cli;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kohsuke.args4j.Option;

/**
 * @author filip.hrbek@cloudsmith.com
 * 
 */
public class TestCommand extends AbstractCommand {

	@Option(name = "-g", aliases = { "--greeting" }, required = true, usage = "Greeting text", metaVar = "<greeting>")
	private String greeting;

	/**
	 * @return the greeting
	 */
	public String getGreeting() {
		return greeting;
	}

	@Override
	public InputStream getHelpStream() {
		return new ByteArrayInputStream(
				"This testing command will copy your greeting to the screen.\nEnjoy it!".getBytes());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.cli.AbstractCommand#getShortDescription()
	 */
	@Override
	public String getShortDescription() {
		return "This is only a test and will be removed";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.cli.AbstractCommand#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected int run(IProgressMonitor monitor) throws Exception {
		System.out.println("Test OK with greeting set to " + getGreeting());
		return 0;
	}

}
