package org.eclipse.b3.build.internal;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class B3BuildActivator extends Plugin {

	public static B3BuildActivator instance;

	public B3BuildActivator() {
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
