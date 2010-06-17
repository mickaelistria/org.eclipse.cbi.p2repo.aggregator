/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 * 
 */
package org.eclipse.b3.p2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.equinox.p2.metadata.IArtifactKey;
import org.eclipse.equinox.p2.repository.artifact.IArtifactDescriptor;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Repository</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.p2.ArtifactRepository#getArtifactMap <em>Artifact Map</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.p2.P2Package#getArtifactRepository()
 * @model superTypes="org.eclipse.b3.p2.Repository<org.eclipse.b3.p2.IArtifactKey> org.eclipse.b3.p2.IArtifactRepository"
 * @generated
 */
public interface ArtifactRepository extends Repository<IArtifactKey>, IArtifactRepository {
	/**
	 * Returns the value of the '<em><b>Artifact Map</b></em>' map.
	 * The key is of type {@link org.eclipse.equinox.p2.metadata.IArtifactKey},
	 * and the value is of type list of {@link org.eclipse.equinox.p2.repository.artifact.IArtifactDescriptor},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Map</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Artifact Map</em>' map.
	 * @see org.eclipse.b3.p2.P2Package#getArtifactRepository_ArtifactMap()
	 * @model mapType="org.eclipse.b3.p2.ArtifactsByKey<org.eclipse.b3.p2.IArtifactKey, org.eclipse.b3.p2.IArtifactDescriptor>"
	 * @generated
	 */
	EMap<IArtifactKey, EList<IArtifactDescriptor>> getArtifactMap();

} // ArtifactRepository
