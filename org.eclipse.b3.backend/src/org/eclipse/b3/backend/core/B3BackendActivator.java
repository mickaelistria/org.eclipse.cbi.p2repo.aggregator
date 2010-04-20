package org.eclipse.b3.backend.core;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class B3BackendActivator extends Plugin {

	public static B3BackendActivator instance;

	public B3BackendActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		super.stop(context);
	}
}
