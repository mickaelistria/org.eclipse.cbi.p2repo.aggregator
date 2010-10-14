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
package org.eclipse.b3.build;

import java.util.Map;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getUnitParameterDeclaration()
 * @model
 * @generated
 */
public interface UnitParameterDeclaration extends BParameterDeclaration {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	boolean hasCorrectState(DiagnosticChain chain, Map<Object, Object> map);
} // UnitParameterDeclaration
