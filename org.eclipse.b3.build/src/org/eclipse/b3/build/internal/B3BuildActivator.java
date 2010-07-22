/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.internal;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class B3BuildActivator extends Plugin {

	public static final String EXTENSION__B3_FILE = "org.eclipse.b3.build.B3File";

	public static final String EXTENSION__KLUDGY_IMPORT = "org.eclipse.b3.build.B3KludgeImport";

	public static final String PLUGIN_ID = "org.eclipse.b3.build";

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
