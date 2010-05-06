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

import java.lang.reflect.Type;

import java.net.URI;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Handler</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getHandlerType <em>Handler Type</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getLocal <em>Local</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getRemote <em>Remote</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getBranches <em>Branches</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getDocumentation <em>Documentation</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getUser <em>User</em>}</li>
 * <li>{@link org.eclipse.b3.build.build.RepositoryHandler#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler()
 * @model
 * @generated
 */
public interface RepositoryHandler extends EObject {
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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Returns the value of the '<em><b>Handler Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Type</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Handler Type</em>' containment reference.
	 * @see #setHandlerType(Type)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_HandlerType()
	 * @model type="org.eclipse.b3.backend.evaluator.b3backend.IType" containment="true"
	 * @generated
	 */
	Type getHandlerType();

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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_Local()
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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_Name()
	 * @model
	 * @generated
	 */
	String getName();

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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_Password()
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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_Remote()
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
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getRepositoryHandler_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability, String unitPath) throws Throwable;

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryHandler#getDocumentation <em>Documentation</em>}' attribute.
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
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryHandler#getHandlerType <em>Handler Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Handler Type</em>' containment reference.
	 * @see #getHandlerType()
	 * @generated
	 */
	void setHandlerType(Type value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryHandler#getLocal <em>Local</em>}' attribute.
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
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryHandler#getName <em>Name</em>}' attribute.
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
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryHandler#getPassword <em>Password</em>}' attribute.
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
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryHandler#getRemote <em>Remote</em>}' attribute.
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
	 * Sets the value of the '{@link org.eclipse.b3.build.build.RepositoryHandler#getUser <em>User</em>}' attribute.
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
