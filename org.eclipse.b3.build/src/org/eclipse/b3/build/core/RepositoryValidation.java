/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.build.repository.IRepositoryValidator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Lists;

public class RepositoryValidation {
	private static Map<String, IRepositoryValidator> validators;

	public static IRepositoryValidator getValidator(String name) {
		return validators.get(name);
	}

	/**
	 * Returns a sorted list of valid repository names.
	 */
	public static List<String> getValidNames() {
		if(validators == null)
			loadValidNames();
		return Lists.sortedCopy(validators.keySet());
	}

	public static boolean isNameRegistered(String name) {
		if(validators == null)
			loadValidNames();
		return validators.containsKey(name);
	}

	private static synchronized void loadValidNames() {
		if(validators != null)
			return;
		validators = new HashMap<String, IRepositoryValidator>();
		IConfigurationElement[] ceDecl = Platform.getExtensionRegistry().getConfigurationElementsFor(
			B3BuildConstants.REPOSITORIES_EXT_ID);
		for(int i = 0; i < ceDecl.length; i++) {
			IConfigurationElement ce = ceDecl[i];
			try {
				validators.put(
					ce.getAttribute(B3BuildConstants.REPOSITORIES_EXTATTR_REPOTYPE),
					(IRepositoryValidator) ce.createExecutableExtension(B3BuildConstants.REPOSITORIES_EXTATTR_REPOVALIDATOR));
			}
			catch(InvalidRegistryObjectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
