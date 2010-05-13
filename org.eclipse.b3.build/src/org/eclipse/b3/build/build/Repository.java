/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.build;

import java.net.URI;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.build.core.IBuildUnitRepository;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Handler</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.Repository#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getLocal <em>Local</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getRemote <em>Remote</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getBranches <em>Branches</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getUser <em>User</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getPassword <em>Password</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getHandlerType <em>Handler Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getOptions <em>Options</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.Repository#getBuildUnitRepository <em>Build Unit Repository</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends BExpression {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.Branch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Build Unit Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Unit Repository</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Build Unit Repository</em>' reference.
	 * @see #setBuildUnitRepository(IBuildUnitRepository)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_BuildUnitRepository()
	 * @model type="org.eclipse.b3.build.build.IBuildUnitRepository"
	 * @generated
	 */
	IBuildUnitRepository getBuildUnitRepository();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_Documentation()
	 * @model default=""
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Returns the value of the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Type</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Handler Type</em>' attribute.
	 * @see #setHandlerType(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_HandlerType()
	 * @model
	 * @generated
	 */
	String getHandlerType();

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(URI)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_Local()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getLocal();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.b3.build.build.RepoOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<RepoOption> getOptions();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #setRemote(URI)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_Remote()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getRemote();

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepository_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getBuildUnitRepository <em>Build Unit Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Build Unit Repository</em>' reference.
	 * @see #getBuildUnitRepository()
	 * @generated
	 */
	void setBuildUnitRepository(IBuildUnitRepository value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getHandlerType <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Handler Type</em>' attribute.
	 * @see #getHandlerType()
	 * @generated
	 */
	void setHandlerType(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Local</em>' attribute.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(URI value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Remote</em>' attribute.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(URI value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.Repository#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // RepositoryHandler
