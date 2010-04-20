package org.eclipse.b3.backend.core;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.b3.backend.core.messages"; //$NON-NLS-1$

	public static String B3IncompatibleTypeException_0;

	public static String B3IncompatibleTypeException_1;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
