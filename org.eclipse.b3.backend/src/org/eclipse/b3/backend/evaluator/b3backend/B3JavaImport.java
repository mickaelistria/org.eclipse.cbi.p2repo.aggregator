/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend;

import java.lang.reflect.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B3 Java Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#isReexport <em>Reexport</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3JavaImport()
 * @model superTypes="org.eclipse.b3.backend.evaluator.b3backend.IType org.eclipse.b3.backend.evaluator.b3backend.ITypedValue"
 * @generated
 */
public interface B3JavaImport extends Type, ITypedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3JavaImport_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Reexport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reexport</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reexport</em>' attribute.
	 * @see #setReexport(boolean)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3JavaImport_Reexport()
	 * @model
	 * @generated
	 */
	boolean isReexport();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport#isReexport <em>Reexport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reexport</em>' attribute.
	 * @see #isReexport()
	 * @generated
	 */
	void setReexport(boolean value);

} // B3JavaImport
