/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2;

import java.net.URI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Metadata Repository</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2.MetadataRepository#getLocation <em>Location</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.MetadataRepository#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2.MetadataRepository#getInstallableUnits <em>Installable Units</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.p2.P2Package#getMetadataRepository()
 * @model superTypes="org.eclipse.b3.aggregator.p2.IQueryable"
 * @generated
 */
public interface MetadataRepository extends IMetadataRepository {
	/**
	 * Returns the value of the '<em><b>Installable Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.equinox.p2.metadata.IInstallableUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installable Units</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Installable Units</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.p2.P2Package#getMetadataRepository_InstallableUnits()
	 * @model type="org.eclipse.b3.aggregator.p2.IInstallableUnit" containment="true" resolveProxies="true"
	 *        keys="id version"
	 * @generated
	 */
	EList<IInstallableUnit> getInstallableUnits();

	/**
	 * Obtains the URI information from the proxy URI fragment
	 */
	URI getLocationFromProxy();

	/**
	 * Obtains the name information from the proxy URI fragment
	 */
	String getNameFromProxy();

	/**
	 * Returns the value of the '<em><b>Property Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Map</em>' map isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Map</em>' map.
	 * @see org.eclipse.b3.aggregator.p2.P2Package#getMetadataRepository_PropertyMap()
	 * @model 
	 *        mapType="org.eclipse.b3.aggregator.p2.Property<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getPropertyMap();

	/**
	 * Returns the value of the '<em><b>Repository References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.p2.RepositoryReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository References</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Repository References</em>' containment reference list.
	 * @see org.eclipse.b3.aggregator.p2.P2Package#getMetadataRepository_RepositoryReferences()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<RepositoryReference> getRepositoryReferences();

	/*
	 * Returns location URI
	 * 
	 * @return if "getLocation()" is not null, then returns "getLocation()" otherwise it returns
	 * "getLocationFromProxy()"
	 */
	URI getSafeLocation();
} // MetadataRepository
