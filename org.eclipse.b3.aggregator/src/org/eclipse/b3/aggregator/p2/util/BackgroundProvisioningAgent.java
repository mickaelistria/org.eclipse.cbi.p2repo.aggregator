/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.p2.util;

import org.eclipse.equinox.p2.core.IProvisioningAgent;

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
			agent.stop();
		}
	}
}
