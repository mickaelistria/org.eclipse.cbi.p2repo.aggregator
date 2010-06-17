/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.p2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;

import org.eclipse.equinox.p2.repository.IRepositoryReference;

import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Repository</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.p2.MetadataRepository#getInstallableUnits <em>Installable Units</em>}</li>
 * <li>{@link org.eclipse.b3.p2.MetadataRepository#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.p2.P2Package#getMetadataRepository()
 * @model superTypes="org.eclipse.b3.p2.Repository<org.eclipse.b3.p2.IInstallableUnit> org.eclipse.b3.p2.IMetadataRepository"
 * @generated
 */
public interface MetadataRepository extends Repository<IInstallableUnit>, IMetadataRepository {
	/**
	 * Returns the value of the '<em><b>Installable Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.equinox.p2.metadata.IInstallableUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installable Units</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Installable Units</em>' containment reference list.
	 * @see org.eclipse.b3.p2.P2Package#getMetadataRepository_InstallableUnits()
	 * @model type="org.eclipse.b3.p2.IInstallableUnit" containment="true" resolveProxies="true" keys="id version"
	 * @generated
	 */
	EList<IInstallableUnit> getInstallableUnits();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.equinox.p2.repository.IRepositoryReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.eclipse.b3.p2.P2Package#getMetadataRepository_References()
	 * @model type="org.eclipse.b3.p2.IRepositoryReference" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<IRepositoryReference> getReferences();

} // MetadataRepository
