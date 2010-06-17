/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 * 
 */
package org.eclipse.b3.p2;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.equinox.p2.repository.IRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.p2.Repository#getPropertyMap <em>Property Map</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.p2.P2Package#getRepository()
 * @model abstract="true" superTypes="org.eclipse.b3.p2.IRepository<T>"
 * @generated
 */
public interface Repository<T> extends IRepository<T> {
	/**
	 * Returns the value of the '<em><b>Property Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Map</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Map</em>' map.
	 * @see org.eclipse.b3.p2.P2Package#getRepository_PropertyMap()
	 * @model mapType="org.eclipse.b3.p2.Property<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getPropertyMap();

} // Repository
