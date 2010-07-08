/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.engine;

import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;

/**
 * Hack to make it possible to import certain java classes automatically via extension point without having
 * to declare use x.y.z
 * 
 */
public interface IKludgyImportProvider {
	List<B3JavaImport> getImports();
}
