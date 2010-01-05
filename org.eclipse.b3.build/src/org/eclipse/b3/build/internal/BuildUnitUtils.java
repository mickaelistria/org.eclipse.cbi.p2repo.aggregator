package org.eclipse.b3.build.internal;

import org.eclipse.b3.backend.core.B3DynamicClassLoader;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.emf.common.util.EList;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Type;

public class BuildUnitUtils {
	
	/**
	 * Dynamically creates a marker interface for a BuildUnit that is named after the build unit.
	 * @param unit
	 * @return
	 */
	public static Class<? extends BuildUnit> createBuildUnitInterface(BuildUnit unit, B3DynamicClassLoader classLoader) {
		return BuildUnitProxyFactory.createBuildUnitInterface(unit, classLoader);
	}
	public static BuildUnit createBuildUnitProxy(BuildUnit unit, Class<? extends BuildUnit> iface, B3DynamicClassLoader classLoader) {
		return (BuildUnit) BuildUnitProxy.newInstance(unit, iface, classLoader);
		
	}
	private static class BuildUnitProxyFactory implements Opcodes {
		@SuppressWarnings("unchecked")
		public static Class<? extends BuildUnit> createBuildUnitInterface(BuildUnit unit, B3DynamicClassLoader classLoader) {
			ClassWriter cw = new ClassWriter(0);
			cw.visit(V1_5, 
					ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE, 	// access
					dottedToInternal(unit.getName()), 			// interface name in internal form
					null, 										// generics
					"java/lang/Object", 						// superclass
					new String[] {								// extended interfaces
						"org/eclipse/b3/build/build/BuildUnit"	
				});
			cw.visitEnd();
			byte bytes[] = cw.toByteArray();
			Class<? extends BuildUnit> clazz = (Class<? extends BuildUnit>)((classLoader.defineClass(unit.getName(), bytes)));
			return clazz;
		}
		public static String dottedToInternal(String str) {
			return str.replaceAll("\\.", "/");
		}
	}
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
		public  static Object newInstance(BuildUnit unit, Class<? extends BuildUnit> iface, B3DynamicClassLoader classLoader) {
			Class<?> interfaces[] = unit.getClass().getInterfaces();
			EList<Type> implementsList = unit.getImplements();
			Class<?> extended[] = new Class<?>[interfaces.length + 1 + implementsList.size()];
			// add all interfaces implemented by BuildUnit
			for(int i = 0; i < interfaces.length; i++)
				extended[i] = interfaces[i];
			// add the special interface for the BuildUnit instance
			extended[interfaces.length] = iface;
			// add all interfaces declared to be implemented by the Build Unit
			int limit = interfaces.length + 1 + implementsList.size();
			for(int i = interfaces.length+1; i < limit; i++)
				extended[i] = TypeUtils.getRaw(implementsList.get(i)); // TODO: TYPESYSTEM improvement, use Raw for now
			return Proxy.newProxyInstance(classLoader, 
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
}
