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
package org.eclipse.b3.build.impl;

import java.util.Map;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BParameterDeclarationImpl;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.UnitParameterDeclaration;
import org.eclipse.b3.build.util.B3BuildValidator;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class UnitParameterDeclarationImpl extends BParameterDeclarationImpl implements UnitParameterDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected UnitParameterDeclarationImpl() {
		super();
		super.setName("unit");
		super.setFinal(true);
		super.setImmutable(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasCorrectState(DiagnosticChain chain, Map<Object, Object> map) {
		if(!"unit".equals(getName()) || !isFinal() || !isImmutable()) {
			if(chain != null) {
				chain.add(new BasicDiagnostic(
					Diagnostic.ERROR, B3BuildValidator.DIAGNOSTIC_SOURCE,
					B3BuildValidator.UNIT_PARAMETER_DECLARATION__HAS_CORRECT_STATE, EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"hasCorrectState: name must be 'unit' and be final and immutable",
								EObjectValidator.getObjectLabel(this, map) }), new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.UNIT_PARAMETER_DECLARATION;
	}

} // UnitParameterDeclarationImpl
