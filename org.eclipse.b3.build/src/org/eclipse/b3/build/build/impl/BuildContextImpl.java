/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;

import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildUnit;
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void defineBuildUnit(BuildUnit unit, boolean isWeaving) throws B3EngineException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines the build unit if it is not already defined.
	 * TODO: Should probably throw an exception if already defined
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void defineBuildUnit(BuildUnit unit) throws B3EngineException {
		BuildUnitProxyAdapter p = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(unit);
		Class<? extends BuildUnit> iface = p.getIface();
		if(!unitStore.containsKey(iface)) {
			// add the unit, but check for advice first
			// TODO: check for advice
			unitStore.put(iface, unit);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: UNFINISHED - DEFINE BEEMODEL
	 * <!-- end-user-doc -->
	 * @throws B3EngineException 
	 * @generated NOT
	 */
	public BuildContext defineBeeModel(BeeModel beeModel) throws B3EngineException {
		IFunction main = null;
		for(IFunction f : beeModel.getFunctions()) {
			this.defineFunction(f);
		}
//		// Define all imports as constants
//		for(Type t : ((BeeModel) state).getImports()) {
//			if(t instanceof B3JavaImport) {
//				Class<?> x = TypeUtils.getRaw(t);
//				B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
//				metaClass.setInstanceClass(x);
//				engine.getContext().defineValue(((B3JavaImport) t).getName(), x, metaClass);
//			}
//		}
		return this;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildUnit getEffectiveBuildUnit(BuildUnit unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public Map<Class<? extends BuildUnit>, BuildUnit> getBuildUnitStore() {
		return Collections.unmodifiableMap(unitStore);
	}
} //BuildContextImpl
