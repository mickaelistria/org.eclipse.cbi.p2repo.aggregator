/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.p2.util;

import java.lang.reflect.Method;

import org.eclipse.core.internal.preferences.EclipsePreferences;
import org.eclipse.equinox.internal.p2.repository.helpers.AbstractRepositoryManager;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * @author filip.hrbek@cloudsmith.com
 * 
 */
public class BackgroundProvisioningAgent implements IProvisioningAgent {

	private IProvisioningAgent agent;

	private boolean aboutToStop;

	private boolean stopped;

	private int activeTasks;

	public BackgroundProvisioningAgent(IProvisioningAgent agent) {
		this.agent = agent;
	}

	public Object getService(String serviceName) {
		return agent.getService(serviceName);
	}

	public void registerService(String serviceName, Object service) {
		agent.registerService(serviceName, service);
	}

	synchronized public void registerTask() {
		if(!aboutToStop)
			activeTasks++;
	}

	synchronized public void stop() {
		aboutToStop = true;
		conditionalStop();
	}

	public void unregisterService(String serviceName, Object service) {
		agent.unregisterService(serviceName, service);
	}

	synchronized public void unregisterTask() {
		if(!aboutToStop && activeTasks > 0)
			activeTasks--;
		conditionalStop();
	}

	private void conditionalStop() {
		if(aboutToStop && activeTasks == 0 && !stopped) {
			stopped = true;

			// This is a workaround - if the profile is not removed, it tries to reuse the stopped agent later
			// (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=304899)
			// Let's obtain the preferences first (unfortunately, we need to use reflection)
			Preferences prefs = getProfilePreferences();

			agent.stop();

			try {
				// now, remove the obsolete preferences
				if(prefs != null)
					prefs.removeNode();
			}
			catch(BackingStoreException e) {
				// let's print a stacktrace at least
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	private Preferences getProfilePreferences() {
		AbstractRepositoryManager<IInstallableUnit> mdrMgr = (AbstractRepositoryManager<IInstallableUnit>) agent.getService(IMetadataRepositoryManager.SERVICE_NAME);
		if(mdrMgr == null)
			return null;

		try {
			Method getPreferences = AbstractRepositoryManager.class.getDeclaredMethod("getPreferences");
			if(getPreferences == null)
				return null;
			getPreferences.setAccessible(true);
			Preferences prefs = (Preferences) getPreferences.invoke(mdrMgr);
			if(prefs instanceof EclipsePreferences) {
				Method getLoadLevel = EclipsePreferences.class.getDeclaredMethod("getLoadLevel");
				if(getLoadLevel == null)
					return null;
				getLoadLevel.setAccessible(true);
				return (Preferences) getLoadLevel.invoke(prefs);
			}
		}
		catch(Exception e) {
			// let's print a stacktrace at least
			e.printStackTrace();
		}

		return null;
	}
}
