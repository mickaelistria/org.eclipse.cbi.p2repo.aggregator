/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.cbi.p2repo.p2.maven.pom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Profiles Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.cbi.p2repo.p2.maven.pom.ProfilesType#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cbi.p2repo.p2.maven.pom.PomPackage#getProfilesType()
 * @model extendedMetaData="name='profiles_._type' kind='elementOnly'"
 * @generated
 */
public interface ProfilesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cbi.p2repo.p2.maven.pom.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Profile</em>' containment reference list.
	 * @see org.eclipse.cbi.p2repo.p2.maven.pom.PomPackage#getProfilesType_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Profile> getProfile();

} // ProfilesType
