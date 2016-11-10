/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/
package org.eclipse.cbi.p2repo.p2.maven;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

import org.eclipse.cbi.p2repo.p2.maven.util.DigestUtil;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.equinox.internal.p2.core.AgentLocation;
import org.eclipse.equinox.internal.p2.core.helpers.ServiceHelper;
import org.eclipse.equinox.internal.p2.core.helpers.URLUtil;
import org.eclipse.equinox.p2.core.IAgentLocation;
import org.osgi.framework.BundleContext;

public class MavenActivator extends Plugin {
	public static final String ID = "org.eclipse.cbi.p2repo.p2.maven";

	public static MavenActivator plugin;

	public static MavenActivator getPlugin() {
		return plugin;
	}

	private AgentLocation agentLocation;

	public MavenActivator() {
		plugin = this;
	}

	public File getCacheDirectory(URI location) throws MalformedURLException {
		URI dataArea = agentLocation.getDataArea(ID + "/cache/" + encodeURI(location)); //$NON-NLS-1$
		return URLUtil.toFile(dataArea.toURL());
	}

	@Override
	public void start(BundleContext context) throws Exception {
		agentLocation = (AgentLocation) ServiceHelper.getService(context, IAgentLocation.SERVICE_NAME);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

	private String encodeURI(URI location) {
		return DigestUtil.encodeMD5(location.toString());
	}
}
