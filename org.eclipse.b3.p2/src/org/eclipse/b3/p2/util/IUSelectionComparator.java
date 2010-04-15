/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.p2.util;

import java.util.Comparator;

import org.eclipse.b3.p2.InstallableUnit;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.metadata.VersionedId;

/**
 * @author filip.hrbek@cloudsmith.com
 * 
 */
// Compares IU by id (ascending) and version (descending)
public class IUSelectionComparator implements Comparator<IInstallableUnit> {
	public static Comparator<IInstallableUnit> INSTANCE = new IUSelectionComparator();

	public int compare(IInstallableUnit iu1, IInstallableUnit iu2) {
		if(iu1 != null)
			if(iu2 == null)
				return 1;
			else {
				VersionedId vid1 = IUUtils.getVersionedName((InstallableUnit) iu1);
				VersionedId vid2 = IUUtils.getVersionedName((InstallableUnit) iu2);

				String id1 = vid1.getId();
				String id2 = vid2.getId();

				if(id1 != null)
					if(id2 == null)
						return 1;
					else {
						int result = id1.toLowerCase().compareTo(id2.toLowerCase());

						if(result == 0) {
							// Order by version in descending order
							Version version1 = vid1.getVersion();
							Version version2 = vid2.getVersion();

							if(version1 != null)
								if(version2 == null)
									return -1;
								else
									return -version1.compareTo(version2);
							else if(version2 != null)
								return 1;
							else
								return 0;
						}

						return result;
					}
				else if(id2 != null)
					return -1;
				else
					return 0;
			}
		else if(iu2 != null)
			return -1;
		else
			return 0;
	}
}
