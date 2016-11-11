/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.cbi.p2repo.aggregator.p2view;

import org.eclipse.cbi.p2repo.aggregator.ChildrenProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.p2.repository.IRepositoryReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cbi.p2repo.aggregator.p2view.RepositoryReferences#getRepositoryReferences <em>Repository References</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cbi.p2repo.aggregator.p2view.P2viewPackage#getRepositoryReferences()
 * @model superTypes="org.eclipse.cbi.p2repo.aggregator.ChildrenProvider<org.eclipse.cbi.p2repo.p2.IRepositoryReference>"
 * @generated
 */
public interface RepositoryReferences extends ChildrenProvider<IRepositoryReference> {
	/**
	 * Returns the value of the '<em><b>Repository References</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.equinox.p2.repository.IRepositoryReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository References</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository References</em>' reference list.
	 * @see org.eclipse.cbi.p2repo.aggregator.p2view.P2viewPackage#getRepositoryReferences_RepositoryReferences()
	 * @model type="org.eclipse.cbi.p2repo.p2.IRepositoryReference"
	 * @generated
	 */
	EList<IRepositoryReference> getRepositoryReferences();

} // RepositoryReferences
