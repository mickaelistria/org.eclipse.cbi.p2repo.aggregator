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

package org.eclipse.b3.build.build.impl;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3WeavingFailedException;
import org.eclipse.b3.backend.core.ParentContextIterator;

import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.IBuilder;
import org.eclipse.b3.build.core.BuildUnitProxyAdapter;
import org.eclipse.b3.build.core.BuildUnitProxyAdapterFactory;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BuildContextImpl extends BExecutionContextImpl implements BuildContext {
	/**
	 * Holds build units keyed by their special interface.
	 */
	private Map<Class<? extends BuildUnit>, BuildUnit> unitStore = new HashMap<Class<? extends BuildUnit>, BuildUnit>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3BuildPackage.Literals.BUILD_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Define a build unit. Any bequested matching advice is applied.
	 * TODO: SEMANTICS OF REDEFINING A UNIT (All sorts of bad things happen) - now exception is thrown
	 * <!-- end-user-doc -->
	 * @throws IllegalArgumentException if the unit has been defined in this context.
	 * @generated NOT
	 */
	public void defineBuildUnit(BuildUnit unit, boolean isWeaving) throws B3EngineException {
		BuildUnitProxyAdapter p = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(unit);
		Class<? extends BuildUnit> iface = p.getIface();
		if(unitStore.containsKey(iface))
			throw new IllegalArgumentException("Attempt to redefine a build unit named: "+unit.getName());

		BuildUnit unitToStore = unit;
		boolean woven = false;
		// check for advice is not weaving
		if(!isWeaving) {
			for(BExecutionContext ctx = this; ctx.getParentContext() != null; ctx = ctx.getParentContext()) {
				for(BConcern c : ctx.getEffectiveConcerns())
					try {
						if(c.evaluateIfMatching(unit, this))
							woven = true;
					} catch (Throwable e) {
						throw new B3WeavingFailedException(e);
					}
			}
		}
		// do not store original if it was woven
		if(!woven)
			unitStore.put(iface, unitToStore);
		
		// define all of the unit's builders
		for(IBuilder b : unit.getBuilders())
			defineFunction(b);
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: DOES NOT NEED TO RETURN THE CTX
	 * <!-- end-user-doc -->
	 * @throws B3EngineException 
	 * @generated NOT
	 */
	public BuildContext defineBeeModel(BeeModel beeModel) throws B3EngineException {
		
		// Define all IMPORTS as constants
		for(Type t : beeModel.getImports()) {
			if(t instanceof B3JavaImport) {
				Class<?> x = TypeUtils.getRaw(t);
				B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
				metaClass.setInstanceClass(x);
				defineValue(((B3JavaImport) t).getName(), x, metaClass);
			}
		}
		
		// Define all FUNCTIONS
		for(IFunction f : beeModel.getFunctions()) {
			this.defineFunction(f);
		}
		
		// Define all BUILD UNITS (currently only one - could easily have more than one)
		for(BuildUnit u : beeModel.getBuildUnits())
			if(u != null)
				defineBuildUnit(u, false);

		// Concerns, and defined property sets are only used via direct model references,
		// so these are not defined in the context.
		
		return this;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BuildUnit getEffectiveBuildUnit(BuildUnit unit) {
		ParentContextIterator pitor = new ParentContextIterator(this, BuildContext.class);
		while(pitor.hasNext()) {
			BuildContextImpl ctx = (BuildContextImpl)pitor.next();
			BuildUnit u = ctx.getBuildUnitStore().get(BuildUnitProxyAdapterFactory.eINSTANCE.adapt(unit).getIface());
			if(u != null)
				return u;
		}
		return null; // TODO: Should probably throw "NoSuchUnit" instead
	}

	public Map<Class<? extends BuildUnit>, BuildUnit> getBuildUnitStore() {
		return Collections.unmodifiableMap(unitStore);
	}
} //BuildContextImpl
