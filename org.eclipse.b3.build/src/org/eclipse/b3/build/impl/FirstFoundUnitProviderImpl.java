/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.impl;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.UnitProvider;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution Strategy First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FirstFoundUnitProviderImpl extends CompoundUnitProviderImpl implements FirstFoundUnitProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstFoundUnitProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.FIRST_FOUND_UNIT_PROVIDER;
	}

	// /*
	// * (non-Javadoc)
	// *
	// * @see
	// * org.eclipse.b3.build.impl.RepositoryConfigurationImpl#evaluate(org.eclipse.b3.backend.evaluator.b3backend
	// * .BExecutionContext)
	// */
	// @Override
	// public Object evaluate(BExecutionContext ctx) throws Throwable {
	// CompoundFirstFoundRepository repo = B3BuildFactory.eINSTANCE.createCompoundFirstFoundRepository();
	// for(UnitProvider rc : getProviders()) {
	// Object r = rc.evaluate(ctx);
	// if(r == null)
	// throw new B3InternalError("Repository declaration evaluation returned null");
	// if(!(r instanceof BuildUnitRepository))
	// throw new B3IncompatibleTypeException(BuildUnitRepository.class, r.getClass());
	// repo.getRepositories().add((BuildUnitRepository) r);
	// }
	// return repo;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.impl.UnitProviderImpl#resolve(org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext,
	 * org.eclipse.b3.build.RequiredCapability)
	 */
	@Override
	public BuildUnit resolve(BExecutionContext ctx, RequiredCapability requiredCapability) throws Throwable {
		BuildUnit result = null;
		for(UnitProvider provider : getProviders())
			if((result = provider.resolve(ctx, requiredCapability)) != null)
				return result;
		return null;
	}
} // ResolutionStrategyFirstImpl
