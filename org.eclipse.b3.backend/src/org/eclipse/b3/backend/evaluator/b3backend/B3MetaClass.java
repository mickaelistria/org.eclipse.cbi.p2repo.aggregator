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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B3 Meta Class</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * Represents the type of a class "instance". In java there is no type that describes the difference between the type of instances, and the type of
 * the class - for String, both are represented by Class<T> (java.lang.String).
 * An instance of B3MetaClass has an attribute {@link #instanceClass} that is reference to the class.
 * It only computes equal to another B3MetaClass instance for the same instance class.
 * It computes isAssignableTo to true for any B3MetaClass with an instanceClass being a subclass.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass#getInstanceClass <em>Instance Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3MetaClass()
 * @model superTypes="org.eclipse.b3.backend.evaluator.b3backend.IType"
 * @generated
 */
public interface B3MetaClass extends EObject, Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see #setInstanceClass(Class)
	 * @see org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage#getB3MetaClass_InstanceClass()
	 * @model
	 * @generated
	 */
	Class<?> getInstanceClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model typeType="org.eclipse.b3.backend.evaluator.b3backend.IType"
	 * @generated
	 */
	boolean isAssignableFrom(Type type);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass#getInstanceClass <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Instance Class</em>' attribute.
	 * @see #getInstanceClass()
	 * @generated
	 */
	void setInstanceClass(Class<?> value);

} // B3MetaClass
