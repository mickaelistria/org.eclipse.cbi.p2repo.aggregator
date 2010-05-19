/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.internal.core;

import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;
import org.eclipse.equinox.security.storage.StorageException;

public class AuthenticationHelper {
	/**
	 * Template - example making use of secure preferences
	 */
	public void foo() {
		// get the default secure preferences
		// or use method that takes a file: URL to a directory where secure preferences are stored
		//
		ISecurePreferences prefs = SecurePreferencesFactory.getDefault();
		// SecurePreferencesFactory.open(location, options).
		if(prefs == null) {
			// unable to obtain secure preferences using default location
		}
		ISecurePreferences node = prefs.node("a/b/c");
		try {
			node.get("akey", "aDefaultValue");
		}
		catch(IllegalStateException e) {
			// node was deleted
			e.printStackTrace();
		}
		catch(StorageException e) {
			// problem during decryption
			e.printStackTrace();
		}
	}
}
