/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.p2.util;

import org.eclipse.equinox.internal.p2.metadata.TranslationSupport;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.query.IQueryable;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public class RepositoryTranslationSupport extends TranslationSupport {

	public static TranslationSupport getInstance(IQueryable<IInstallableUnit> mdr) {
		return new RepositoryTranslationSupport(mdr);
	}

	private RepositoryTranslationSupport(IQueryable<IInstallableUnit> mdr) {
		super();
		setTranslationSource(mdr);
	}
}
