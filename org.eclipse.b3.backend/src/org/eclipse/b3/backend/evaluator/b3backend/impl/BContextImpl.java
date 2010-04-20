/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BContext</b></em>'.
 * This Context represents an OuterContext - it's implementation is handled by the
 * BExecutionContextImpl. This class exists to restrict BInnerContext's reference to an
 * outer context to not include an inner context.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BContextImpl extends BExecutionContextImpl implements BContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BContextImpl() {
		super();
	}

	@Override
	public boolean isPropertyScope() {
		return true;
	}

	@Override
	public void setParentContext(BExecutionContext newParentContext) {
		super.setParentContext(newParentContext);
		// BContexts uses for bequests may get functions defined after child contexts have been spawned
		// and current implementation will fail to link the func stores if BContext is missing one.
		createFuncStore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BCONTEXT;
	}
} // BContextImpl
