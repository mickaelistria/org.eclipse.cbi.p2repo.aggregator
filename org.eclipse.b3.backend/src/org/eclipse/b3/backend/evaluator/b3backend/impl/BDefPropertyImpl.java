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
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.core.B3NoContextException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BDefProperty;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.osgi.util.NLS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDef Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BDefPropertyImpl#isMutable <em>Mutable</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BDefPropertyImpl extends BDefValueImpl implements BDefProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTABLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * Properties are immutable by default.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected BDefPropertyImpl() {
		super();
		immutable = true; // properties are immutable by default
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3backendPackage.BDEF_PROPERTY__MUTABLE:
				return isMutable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3backendPackage.BDEF_PROPERTY__MUTABLE:
				return isMutable() != MUTABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BDEF_PROPERTY__MUTABLE:
				setMutable((Boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BDEF_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BDEF_PROPERTY__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * Evaluation defines the property in the first found scope return true on isPropertyScope.
	 * (i.e. a BContext).
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		BExecutionContext ctxToUse = ctx;
		while((!ctxToUse.isPropertyScope()) && ctxToUse.getParentContext() != null)
			ctxToUse = ctxToUse.getParentContext();
		if(ctxToUse == null || !ctxToUse.isPropertyScope())
			throw new B3NoContextException(NLS.bind(
				"No property context found for setting property {0} found.", getName()));
		// use same semantics as for variables, immutable, variable, value, etc.
		return super.evaluate(ctxToUse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object evaluateDefaults(BExecutionContext ctx, boolean allVisible) throws Throwable {
		if(ctx.containsValue(name, allVisible))
			return this;
		return evaluate(ctx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isMutable() {
		return !isImmutable();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setMutable(boolean newMutable) {
		setImmutable(!newMutable);
	}

} // BDefPropertyImpl
