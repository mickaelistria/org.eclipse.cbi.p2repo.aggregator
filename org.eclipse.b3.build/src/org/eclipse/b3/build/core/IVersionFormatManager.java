/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import java.util.List;

import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionRange;

/**
 * An interface for a manager of versions.
 * 
 */
public interface IVersionFormatManager {
	public interface VersionProposal {
		public String getFormatDescription();

		public String getFormatName();

		public String getFormatSample();
	}

	List<VersionProposal> getVersionProposals();

	List<VersionProposal> getVersionRangeProposals();

	String toString(Version v);

	String toString(VersionRange r);

	VersionRange toVersionRangeValue(String s);

	Version toVersionValue(String s);
}
