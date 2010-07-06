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
import java.lang.reflect.TypeVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B3 Func Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getBounds <em>Bounds</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getGenericDeclaration <em>Generic Declaration</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FuncTypeVariable()
 * @model superTypes="org.eclipse.b3.backend.evaluator.b3backend.ITypeVariable<org.eclipse.b3.backend.evaluator.b3backend.IFunction>"
 * @generated
 */
public interface B3FuncTypeVariable extends EObject, TypeVariable<IFunction> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bounds</em>' attribute.
	 * @see #setBounds(Type[])
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FuncTypeVariable_Bounds()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.TypeArray"
	 * @generated
	 */
	Type[] getBounds();

	/**
	 * Returns the value of the '<em><b>Generic Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Declaration</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generic Declaration</em>' containment reference.
	 * @see #setGenericDeclaration(IFunction)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FuncTypeVariable_GenericDeclaration()
	 * @model containment="true"
	 * @generated
	 */
	IFunction getGenericDeclaration();

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
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3FuncTypeVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getBounds <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Bounds</em>' attribute.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Type[] value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getGenericDeclaration <em>Generic Declaration</em>}
	 * ' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Generic Declaration</em>' containment reference.
	 * @see #getGenericDeclaration()
	 * @generated
	 */
	void setGenericDeclaration(IFunction value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3FuncTypeVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // B3FuncTypeVariable
