/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.backend.core.B3EngineException;

import org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BuildContext;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.internal.BuildUnitUtils;

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
	 * Defines the build unit if it is not already defined.
	 * TODO: should probably check if the unit is defined and throw an error.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void defineBuildUnit(BuildUnit unit) throws B3EngineException {
		defineUnitIfNotAlreadyDefined(unit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines the build unit if not already defined, and returns its proxy
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BuildUnit getBuildUnitProxy(BuildUnit unit) throws B3EngineException {
		BuildUnitStore.Info info = defineUnitIfNotAlreadyDefined(unit);
		return info.getProxy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines the build unit if not already defined, and returns its generated interface.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Class<? extends BuildUnit> getBuildUnitInterface(BuildUnit unit) throws B3EngineException {
		BuildUnitStore.Info info = defineUnitIfNotAlreadyDefined(unit);
		return info.getIface();
	}
	private BuildUnitStore.Info defineUnitIfNotAlreadyDefined(BuildUnit unit) throws B3EngineException{
		BuildUnitStore.Info info = unitStore.getInfo(unit);
		if(info != null)
			return info;
		Class<? extends BuildUnit> iface = BuildUnitUtils.createBuildUnitInterface(unit, getClassLoader());
		BuildUnit proxy = BuildUnitUtils.createBuildUnitProxy(unit, iface, getClassLoader());
		// TODO:
		// Define all builders
		
		return unitStore.put(unit, iface, proxy);
	}
	private BuildUnitStore unitStore = new BuildUnitStore();
	
	private static class BuildUnitStore {
		private Map<String, Entry> store = new HashMap<String, Entry>();
		
		public Info getInfo(BuildUnit unit) {
			Entry e = store.get(unit.getName());
			if(e == null)
				return null;
			return e.getInfo(unit);
		}
		public Info put(BuildUnit unit, Class<? extends BuildUnit> iface, BuildUnit proxy) {
			Entry e = new Entry();
			return e.put(unit, iface, proxy);
		}
		private static class Entry {
			private Map<Object, Info> infos = new HashMap<Object, Info>();
			
			public Info put(BuildUnit unit, Class<? extends BuildUnit> iface, BuildUnit proxy) {
				Info info = new Info(unit, iface, proxy);
				Object key = unit.getVersion();
				if(key == null)
					key = "";
				infos.put(key, info);
				return info;
			}
			public Info getInfo(BuildUnit unit) {
				Object key = unit.getVersion();
				if(key == null)
					key = "";
				return infos.get(key);
			}
		}
		private static class Info {
			public BuildUnit getUnit() {
				return unit;
			}
			public Class<? extends BuildUnit> getIface() {
				return iface;
			}
			public BuildUnit getProxy() {
				return proxy;
			}
			private BuildUnit unit;
			private Class<? extends BuildUnit> iface;
			private BuildUnit proxy;
			public Info(BuildUnit unit, Class<? extends BuildUnit> iface, BuildUnit proxy) {
				this.unit = unit;
				this.iface = iface;
				this.proxy = proxy;
			}
		}
	}
} //BuildContextImpl
