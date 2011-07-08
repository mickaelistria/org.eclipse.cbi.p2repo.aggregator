/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.aggregator.p2view;

import org.eclipse.b3.aggregator.ChildrenProvider;
import org.eclipse.b3.aggregator.StatusProvider;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Browser</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.RepositoryBrowser#getRepositories <em>Repositories</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.RepositoryBrowser#isLoading <em>Loading</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getRepositoryBrowser()
 * @model
 * @generated
 */
public interface RepositoryBrowser extends StatusProvider, ChildrenProvider<MetadataRepositoryStructuredView> {
	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.b3.aggregator.p2view.MetadataRepositoryStructuredView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Repositories</em>' reference list.
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getRepositoryBrowser_Repositories()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<MetadataRepositoryStructuredView> getRepositories();

	/**
	 * Returns the value of the '<em><b>Loading</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loading</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Loading</em>' attribute.
	 * @see #isSetLoading()
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getRepositoryBrowser_Loading()
	 * @model default="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isLoading();

	/**
	 * Returns whether the value of the '{@link org.eclipse.b3.aggregator.p2view.RepositoryBrowser#isLoading <em>Loading</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Loading</em>' attribute is set.
	 * @see #isLoading()
	 * @generated
	 */
	boolean isSetLoading();

} // RepositoryBrowser
