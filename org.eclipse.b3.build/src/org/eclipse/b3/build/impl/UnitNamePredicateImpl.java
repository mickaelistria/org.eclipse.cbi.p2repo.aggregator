/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.UnitNamePredicate;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Name Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class UnitNamePredicateImpl extends CapabilityPredicateImpl implements UnitNamePredicate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UnitNamePredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.UNIT_NAME_PREDICATE;
	}

	@Override
	@Deprecated
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		// pick up "@test" parameter from context
		Object test = ctx.getValue("@test");
		if(!(test instanceof BuildUnit))
			throw new B3InternalError("Attempt to evaluate UnitNamePredicate against non BuildUnit");
		BuildUnit u = (BuildUnit) test;
		return Boolean.valueOf(namePredicate.matches(u.getName()));
	}

	/**
	 * Always returns Boolean.
	 */
	@Override
	public Type getDeclaredType(BExecutionContext ctx) throws Throwable {
		return Boolean.class;
	}

} // UnitNamePredicateImpl
