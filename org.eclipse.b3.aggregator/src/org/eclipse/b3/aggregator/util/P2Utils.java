/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.util;

import java.net.URI;

import org.eclipse.b3.util.B3Util;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.equinox.internal.provisional.p2.director.IPlanner;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.IProvisioningAgentProvider;
import org.eclipse.equinox.p2.core.spi.IAgentServiceFactory;
import org.eclipse.equinox.p2.engine.IProfileRegistry;
import org.eclipse.equinox.p2.repository.IRepositoryManager;

/**
 * @author filip.hrbek@cloudsmith.com
 * 
 */
public class P2Utils {

	public static IProvisioningAgent createDedicatedProvisioningAgent(URI location) throws CoreException {
		IProvisioningAgentProvider agentProvider = null;

		try {
			agentProvider = B3Util.getPlugin().getService(IProvisioningAgentProvider.class);
			return agentProvider.createAgent(location);
		}
		finally {
			B3Util.getPlugin().ungetService(agentProvider);
		}
	}

	public static IPlanner getPlanner(IProvisioningAgent agent) {
		return getP2Service(agent, IPlanner.class);
	}

	public static IProfileRegistry getProfileRegistry(IProvisioningAgent agent) {
		return getP2Service(agent, IProfileRegistry.class);
	}

	public static <T extends IRepositoryManager<?>> T getRepositoryManager(Class<T> clazz) {
		return getP2Service(null, clazz);
	}

	public static <T extends IRepositoryManager<?>> T getRepositoryManager(IProvisioningAgent agent, Class<T> clazz) {
		return getP2Service(agent, clazz);
	}

	public static void ungetPlanner(IPlanner planner) {
		B3Util.getPlugin().ungetService(planner);
	}

	public static void ungetProfileRegistry(IProfileRegistry registry) {
		B3Util.getPlugin().ungetService(registry);
	}

	public static void ungetRepositoryManager(IRepositoryManager<?> manager) {
		B3Util.getPlugin().ungetService(manager);
	}

	private static <T> T getP2Service(IProvisioningAgent agent, Class<T> clazz) {
		try {
			if(agent == null) {
				try {
					agent = B3Util.getPlugin().getService(IProvisioningAgent.class);
				}
				catch(CoreException e) {
					// agent is null, further steps may fix it
				}

				if(agent == null) {
					IProvisioningAgentProvider agentProvider = B3Util.getPlugin().getService(
							IProvisioningAgentProvider.class);
					agent = agentProvider.createAgent(null);
					B3Util.getPlugin().ungetService(agentProvider);
				}
			}

			Object service = agent.getService(clazz.getName());
			if(service == null) {
				String filter = "(&(p2.agent.servicename=" + clazz.getName() + "))";
				IAgentServiceFactory serviceFactory = B3Util.getPlugin().getService(IAgentServiceFactory.class, filter);
				service = serviceFactory.createService(agent);
				B3Util.getPlugin().ungetService(serviceFactory);
			}
			T result = clazz.cast(service);

			B3Util.getPlugin().ungetService(agent);

			if(result != null)
				return result;
		}
		catch(Throwable t) {
			throw new RuntimeException(t);
		}

		throw new RuntimeException("p2 service " + clazz.getName() + "not available");
	}

}
