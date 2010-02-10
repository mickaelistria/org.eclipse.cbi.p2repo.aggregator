/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 */
package org.eclipse.b3.build.build;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effective Builder Reference Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade#getBuilderReference <em>Builder Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveBuilderReferenceFacade()
 * @model
 * @generated
 */
public interface EffectiveBuilderReferenceFacade extends EffectiveFacade {
	/**
	 * Returns the value of the '<em><b>Builder Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Reference</em>' reference.
	 * @see #setBuilderReference(BuilderReference)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getEffectiveBuilderReferenceFacade_BuilderReference()
	 * @model
	 * @generated
	 */
	BuilderReference getBuilderReference();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.EffectiveBuilderReferenceFacade#getBuilderReference <em>Builder Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Reference</em>' reference.
	 * @see #getBuilderReference()
	 * @generated
	 */
	void setBuilderReference(BuilderReference value);

} // EffectiveBuilderReferenceFacade
