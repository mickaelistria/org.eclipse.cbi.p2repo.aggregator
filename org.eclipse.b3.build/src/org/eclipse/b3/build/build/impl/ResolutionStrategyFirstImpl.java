/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import org.eclipse.b3.backend.core.B3IncompatibleTypeException;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildUnitRepository;
import org.eclipse.b3.build.build.CompoundFirstFoundRepository;
import org.eclipse.b3.build.build.RepositoryConfiguration;
import org.eclipse.b3.build.build.ResolutionStrategyFirst;
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
public class ResolutionStrategyFirstImpl extends ResolutionStrategyImpl implements ResolutionStrategyFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolutionStrategyFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.RESOLUTION_STRATEGY_FIRST;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.b3.build.build.impl.RepositoryConfigurationImpl#evaluate(org.eclipse.b3.backend.evaluator.b3backend
	 * .BExecutionContext)
	 */
	@Override
	public Object evaluate(BExecutionContext ctx) throws Throwable {
		CompoundFirstFoundRepository repo = B3BuildFactory.eINSTANCE.createCompoundFirstFoundRepository();
		for(RepositoryConfiguration rc : getRepositories()) {
			Object r = rc.evaluate(ctx);
			if(r == null)
				throw new B3InternalError("Repository declaration evaluation returned null");
			if(!(r instanceof BuildUnitRepository))
				throw new B3IncompatibleTypeException(BuildUnitRepository.class, r.getClass());
			repo.getRepositories().add((BuildUnitRepository) r);
		}
		return repo;
	}
} // ResolutionStrategyFirstImpl
