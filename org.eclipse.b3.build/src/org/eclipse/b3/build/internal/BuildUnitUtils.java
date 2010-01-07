package org.eclipse.b3.build.internal;

import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.equinox.internal.provisional.p2.core.Version;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Type;

@SuppressWarnings("restriction")
public class BuildUnitUtils {
	public static ClassLoader dynamicClassLoader = new BuildUtilsDynamicClassLoader(BuildUnitUtils.class.getClassLoader());
	
	public final static String BUILDUNIT_INTERFACE_PREFIX = "b3_BuildUnit_";
	
	/**
	 * Returns a string that can be used to load an interface for a particular build unit.
	 * @param unit
	 * @return
	 */
	public static String getBuildUnitInterfaceName(BuildUnit unit) {
		StringBuffer buf = new StringBuffer();
		buf.append(BUILDUNIT_INTERFACE_PREFIX);
		buf.append(unit.getName());
		Version v = unit.getVersion();
		if(v != null) {
			buf.append("_");
			v.toString(buf);
		}
		return buf.toString();
	}
	/**
	 * Dynamically get/load/create a marker interface for a BuildUnit that is named after the build unit.
	 * @param unit
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Class<? extends BuildUnit> getBuildUnitInterface(BuildUnit unit) {
		try {
			return (Class<? extends BuildUnit>)dynamicClassLoader.loadClass(getBuildUnitInterfaceName(unit));
		} catch (ClassNotFoundException e) {
			throw new B3InternalError("B3 Interal error - Could not create a BuildUnit interface", e);
		}
	}
	/**
	 * Creates a proxy instance for a BuildUnit. The created proxy implements the special build unit
	 * instance interface, as well as all interfaces listed in the build unit.
	 * @param unit
	 * @param iface
	 * @return
	 */
	public static BuildUnit createBuildUnitProxy(BuildUnit unit) {
		return (BuildUnit) BuildUnitProxy.newInstance(unit);
		
	}
//	private static class BuildUnitProxyFactory implements Opcodes {
//		@SuppressWarnings("unchecked")
//		public static Class<? extends BuildUnit> createBuildUnitInterface(BuildUnit unit, B3DynamicClassLoader classLoader) {
//			ClassWriter cw = new ClassWriter(0);
//			cw.visit(V1_5, 
//					ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE, 	// access
//					dottedToInternal(unit.getName()), 			// interface name in internal form
//					null, 										// generics
//					"java/lang/Object", 						// superclass
//					new String[] {								// extended interfaces
//						"org/eclipse/b3/build/build/BuildUnit"	
//				});
//			cw.visitEnd();
//			byte bytes[] = cw.toByteArray();
//			Class<? extends BuildUnit> clazz = (Class<? extends BuildUnit>)((classLoader.defineClass(unit.getName(), bytes)));
//			return clazz;
//		}
//		public static String dottedToInternal(String str) {
//			return str.replaceAll("\\.", "/");
//		}
//	}
//	private static class DynamicClassLoader extends ClassLoader {
//		public DynamicClassLoader() {
//			super(BuildUnitUtils.class.getClassLoader());
//		}
//		public Class<?> defineClass(String name, byte[] b) {
//			return defineClass(name, b, 0, b.length);
//		}
//		
//	}
	public static class BuildUnitProxy implements InvocationHandler {
		private BuildUnit unit;
		public  static Object newInstance(BuildUnit unit) {
			Class<?> interfaces[] = unit.getClass().getInterfaces();
			EList<Type> implementsList = unit.getImplements();
			Class<?> extended[] = new Class<?>[interfaces.length + 1 + implementsList.size()];
			// add all interfaces implemented by BuildUnit
			for(int i = 0; i < interfaces.length; i++)
				extended[i] = interfaces[i];
			// add the special interface for the BuildUnit instance
			extended[interfaces.length] = getBuildUnitInterface(unit);
			// add all interfaces declared to be implemented by the Build Unit
			int limit = interfaces.length + 1 + implementsList.size();
			for(int i = interfaces.length+1; i < limit; i++)
				extended[i] = TypeUtils.getRaw(implementsList.get(i)); // TODO: TYPESYSTEM improvement, use Raw for now
			return Proxy.newProxyInstance(dynamicClassLoader, 
					extended, new BuildUnitProxy(unit));
		}
		private BuildUnitProxy(BuildUnit unit) {
			this.unit = unit;
		}
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// simple implementation - all interfaces except BuildUnit are marker interfaces
			// so all calls can go straight through
			return method.invoke(unit, args);
		}
		
	}

	public static class BuildUtilsDynamicClassLoader extends ClassLoader implements Opcodes {
		public BuildUtilsDynamicClassLoader(ClassLoader parent) {
			super(parent);
		}

		public Class<?> defineClass(String name, byte[] b) {
			return defineClass(name, b, 0, b.length);
		}
		@SuppressWarnings("unchecked")
		@Override
		public Class<?> findClass(String name) throws ClassNotFoundException {
			if(name.startsWith(BUILDUNIT_INTERFACE_PREFIX)) {
				ClassWriter cw = new ClassWriter(0);
				cw.visit(V1_5, 
						ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE, 	// access
						dottedToInternal(name), 					// interface name in internal form
						null, 										// generics
						"java/lang/Object", 						// superclass
						new String[] {								// extended interfaces
							"org/eclipse/b3/build/build/BuildUnit"	
					});
				cw.visitEnd();
				byte bytes[] = cw.toByteArray();
				Class<? extends BuildUnit> clazz = (Class<? extends BuildUnit>)(defineClass(name, bytes, 0, bytes.length));
				return clazz;
			}
			else
				return super.loadClass(name);
		}
		private String dottedToInternal(String str) {
			return str.replaceAll("\\.", "/");
		}
	}
}
