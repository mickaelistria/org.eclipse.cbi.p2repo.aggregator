/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.core;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3NoSuchVariableException;
import org.eclipse.b3.build.build.B3BuildFactory;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.DelegatingUnitProvider;
import org.eclipse.b3.build.build.EffectiveRequirementFacade;
import org.eclipse.b3.build.build.EffectiveUnitFacade;
import org.eclipse.b3.build.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.build.RepositoryUnitProvider;
import org.eclipse.b3.build.build.RequiredCapability;
import org.eclipse.b3.build.build.ResolutionInfo;
import org.eclipse.b3.build.build.UnitProvider;
import org.eclipse.b3.build.build.UnitResolutionInfo;
import org.eclipse.b3.build.internal.B3BuildActivator;
import org.eclipse.b3.build.repository.IBuildUnitResolver;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;

/**
 * A simplistic (brute force) resolver that resolves all units defined in the specified context.
 * An attempt is made to satisfy all effective requirements by resolving each against the
 * effective requirement's context's view of repository configuration.
 * 
 */
public class SimpleResolver implements IBuildUnitResolver {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.core.IBuildUnitResolver#resolveAll(org.eclipse.b3.build.build.BuildContext)
	 */
	public IStatus resolveAll(BuildContext ctx) {
		EffectiveUnitIterator uItor = new EffectiveUnitIterator(ctx);
		MultiStatus ms = new MultiStatus(B3BuildActivator.instance.getBundle().getSymbolicName(), 0, "", null);
		while(uItor.hasNext())
			ms.add(resolveUnit(uItor.next(), ctx));
		return ms;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.build.core.IBuildUnitResolver#resolveUnit(org.eclipse.b3.build.build.BuildUnit, org.eclipse.b3.build.build.BuildContext)
	 */
	public IStatus resolveUnit(BuildUnit unit, BuildContext ctx) {

		// ALREADY RESOLVED
		// check if the unit is already resolved
		ResolutionInfoAdapter unitAdapter = ResolutionInfoAdapterFactory.eINSTANCE.adapt(unit);
		ResolutionInfo ri = unitAdapter.getAssociatedInfo(this);
		if(ri != null && ri.getStatus().isOK())
			return ri.getStatus();

		// DEFINE UNIT IF NOT DEFINED
		// check if the unit is defined, and define it (and its parent BeeModel) if not
		BuildUnit u = ctx.getEffectiveBuildUnit(unit);
		if(u == null) {
			BuildContext outer = B3BuildFactory.eINSTANCE.createBuildContext();
			outer.setParentContext(ctx);
			ctx = outer;
			try {
				if(unit.eContainer() instanceof BeeModel)
					ctx.defineBeeModel((BeeModel) unit.eContainer());
				else
					ctx.defineBuildUnit(unit, false);
			}
			catch(B3EngineException e) {
				ri = B3BuildFactory.eINSTANCE.createResolutionInfo();
				ri.setStatus(new Status(
					IStatus.ERROR, B3BuildActivator.instance.getBundle().getSymbolicName(),
					"Resolution failed with exception when defining a candidate unit", e));
				return ri.getStatus(); // give up on unit
			}
		}

		// EFFECTIVE UNIT
		EffectiveUnitFacade uFacade;
		try {
			uFacade = unit.getEffectiveFacade(ctx);
		}
		catch(Throwable e1) {
			ri = B3BuildFactory.eINSTANCE.createResolutionInfo();
			ri.setStatus(new Status(
				IStatus.ERROR, B3BuildActivator.instance.getBundle().getSymbolicName(),
				"Resolution failed with exception when getting effective unit", e1));
			return ri.getStatus(); // give up on unit
		}

		// PROCESS ALL REQUIREMENTS
		// If there are no requirements, return OK status after having updated the Unit's resolution Info.
		EList<EffectiveRequirementFacade> requiredCapabilities = uFacade.getRequiredCapabilities();
		// trivial case - no requirements
		if(requiredCapabilities.size() < 1) {
			ri = B3BuildFactory.eINSTANCE.createResolutionInfo();
			ri.setStatus(Status.OK_STATUS);
			unitAdapter.setAssociatedInfo(this, ri);
			return ri.getStatus();
		}
		// Satisfy all requirements
		//
		MultiStatus ms = new MultiStatus(B3BuildActivator.instance.getBundle().getSymbolicName(), 0, "", null);
		// create a stack provider (to be used in front of any defined providers)
		final RepositoryUnitProvider stackProvider = B3BuildFactory.eINSTANCE.createRepositoryUnitProvider();
		stackProvider.setBuildUnitRepository(B3BuildFactory.eINSTANCE.createExecutionStackRepository());

		for(EffectiveRequirementFacade ereq : requiredCapabilities) {
			RequiredCapability r = ereq.getRequirement();

			if(r == null) {
				// bad model state (should have been caught by validation).
				ri = B3BuildFactory.eINSTANCE.createResolutionInfo();
				ri.setStatus(new Status(
					IStatus.ERROR, B3BuildActivator.instance.getBundle().getSymbolicName(),
					"Unit contains null requirement"));
				unitAdapter.setAssociatedInfo(this, ri);
				return ri.getStatus();
			}
			ResolutionInfoAdapter reqAdapter = ResolutionInfoAdapterFactory.eINSTANCE.adapt(r);
			ri = reqAdapter.getAssociatedInfo(this);
			if(ri != null)
				continue; // already processed and it has a status (ok, error, cancel)

			// get the effective unit providers to use for resolution
			try {
				UnitProvider repos = null;
				UnitProvider providerToUse = stackProvider;
				try {
					repos = UnitProvider.class.cast(ereq.getContext().getValue(
						B3BuildConstants.B3ENGINE_VAR_UNITPROVIDERS));
				}
				catch(B3NoSuchVariableException e) {
					// ignore - repos remain null
				}
				// if providers were configured, combine them with a first found using the stack
				// if combination of multiple provider definitions should be performed, this is up
				// to whoever assigns B3ENGINE_CAR_UNITPROVIDERS (i.e. delegate first, or last).
				//
				if(repos != null) {
					FirstFoundUnitProvider ff = B3BuildFactory.eINSTANCE.createFirstFoundUnitProvider();
					EList<UnitProvider> plist = ff.getProviders();
					plist.add(stackProvider);
					DelegatingUnitProvider delegate = B3BuildFactory.eINSTANCE.createDelegatingUnitProvider();
					delegate.setDelegate(repos);
					plist.add(delegate);
					providerToUse = ff;
				}
				// note effective requirement has reference to the context to use
				BuildUnit result = providerToUse.resolve(ereq);
				if(result == null) {
					ri = B3BuildFactory.eINSTANCE.createResolutionInfo();
					ri.setStatus(new Status(
						IStatus.WARNING, B3BuildActivator.instance.getBundle().getSymbolicName(), "Unresolved."));
					reqAdapter.setAssociatedInfo(this, ri);
				}
				else {
					UnitResolutionInfo unitRi = B3BuildFactory.eINSTANCE.createUnitResolutionInfo();
					unitRi.setUnit(result);
					unitRi.setStatus(Status.OK_STATUS); // prevent recursion
					reqAdapter.setAssociatedInfo(this, unitRi);
					unitRi.setStatus(resolveUnit(result, ctx)); // update status with resulting status graph
					ms.add(unitRi.getStatus());
				}
			}
			catch(Throwable e) {
				// associate the error information with the requirement
				ri = B3BuildFactory.eINSTANCE.createResolutionInfo();
				ri.setStatus(new Status(
					IStatus.ERROR, B3BuildActivator.instance.getBundle().getSymbolicName(),
					"Resolution failed with exception", e));
				// TODO: do something better than print stack trace
				// e.printStackTrace();
				reqAdapter.setAssociatedInfo(this, ri);
				ms.add(ri.getStatus());
			}

		}
		// update the unit with the status information from resolving all of its requirements
		ri = B3BuildFactory.eINSTANCE.createResolutionInfo();
		ri.setStatus(ms);
		unitAdapter.setAssociatedInfo(this, ri);
		return ms;
	}

}
