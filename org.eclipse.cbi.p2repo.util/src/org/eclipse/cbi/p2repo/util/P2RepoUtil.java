/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 * @author filip.hrbek@cloudsmith.com
 */
package org.eclipse.cbi.p2repo.util;

import java.util.IdentityHashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class P2RepoUtil extends Plugin {
	private static Plugin plugin;

	public static P2RepoUtil getPlugin() {
		return (P2RepoUtil) plugin;
	}

	public static String getPluginID() {
		return plugin.getBundle().getSymbolicName();
	}

	private LogLevel eclipseLogLevel = LogLevel.INFO;

	private LogLevel consoleLogLevel = LogLevel.INFO;

	private IdentityHashMap<Object, ServiceReference<?>> services;

	public P2RepoUtil() {
		plugin = this;
	}

	/**
	 * @return the consoleLogLevel
	 */
	public final LogLevel getConsoleLogLevel() {
		return consoleLogLevel;
	}

	/**
	 * @return the eclipseLogLevel
	 */
	public final LogLevel getEclipseLogLevel() {
		return eclipseLogLevel;
	}

	public <T> T getService(Class<T> serviceClass) throws CoreException {
		return getService(serviceClass, null);
	}

	public <T> T getService(Class<T> serviceClass, String filter) throws CoreException {
		BundleContext context = getPlugin().getBundle().getBundleContext();
		String serviceName = serviceClass.getName();
		ServiceReference<?>[] serviceRef;
		try {
			serviceRef = context.getAllServiceReferences(serviceName, filter);
		}
		catch(InvalidSyntaxException e) {
			throw ExceptionUtils.wrap(e);
		}
		if(serviceRef == null || serviceRef.length == 0)
			throw ExceptionUtils.fromMessage("Missing OSGi Service %s", serviceName);
		T service = serviceClass.cast(context.getService(serviceRef[0]));
		if(services == null)
			services = new IdentityHashMap<Object, ServiceReference<?>>();
		services.put(service, serviceRef[0]);
		return service;
	}

	/**
	 * @param consoleLogLevel
	 *            the consoleLogLevel to set
	 */
	public final void setConsoleLogLevel(LogLevel consoleLogLevel) {
		this.consoleLogLevel = consoleLogLevel;
	}

	/**
	 * @param eclipseLogLevel
	 *            the eclipseLogLevel to set
	 */
	public final void setEclipseLogLevel(LogLevel eclipseLogLevel) {
		this.eclipseLogLevel = eclipseLogLevel;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	public void ungetService(Object service) {
		if(services != null && service != null) {
			ServiceReference<?> serviceRef = services.remove(service);
			if(serviceRef != null)
				getPlugin().getBundle().getBundleContext().ungetService(serviceRef);
		}
	}
}
