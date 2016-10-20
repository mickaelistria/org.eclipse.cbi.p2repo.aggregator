/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.p2.util;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.p2.core.IProvisioningAgent;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public class ResourceSetWithAgent extends ResourceSetImpl {
	private IProvisioningAgent agent;

	/**
	 * @return the agent
	 */
	public IProvisioningAgent getProvisioningAgent() {
		return agent;
	}

	/**
	 * @param agent
	 *            the agent to set
	 */
	public void setProvisioningAgent(IProvisioningAgent agent) {
		this.agent = agent;
	}
}
