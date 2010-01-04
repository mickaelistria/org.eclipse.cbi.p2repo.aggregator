package org.eclipse.b3.build.internal;

import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.build.BuildUnit;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

public class BuildUnitUtils {
	private static DynamicClassLoader myClassLoader = new DynamicClassLoader();
	
	/**
	 * Dynamically creates a marker interface for a BuildUnit that is named after the build unit.
	 * @param unit
	 * @return
	 */
	public static Class<?> createBuildUnitInterface(BuildUnit unit) {
		return BuildUnitProxyFactory.createBuildUnitInterface(unit);
	}
	public static BuildUnit createBuildUnitProxy(BuildUnit unit) {
		return (BuildUnit) BuildUnitProxy.newInstance(unit);
		
	}
	private static class BuildUnitProxyFactory implements Opcodes {
		public static Class<?> createBuildUnitInterface(BuildUnit unit) {
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
			Class<?> clazz = myClassLoader.defineClass(unit.getName(), bytes);
			return clazz;
		}
		public static String dottedToInternal(String str) {
			return str.replaceAll("\\.", "/");
		}
	}
	private static class DynamicClassLoader extends ClassLoader {
		public DynamicClassLoader() {
			super(BuildUnitUtils.class.getClassLoader());
		}
		public Class<?> defineClass(String name, byte[] b) {
			return defineClass(name, b, 0, b.length);
		}
		
	}
	public static class BuildUnitProxy implements InvocationHandler {
		private BuildUnit unit;
		public  static Object newInstance(BuildUnit unit) {
			Class<?> interfaces[] = unit.getClass().getInterfaces();
			Class<?> extended[] = new Class<?>[interfaces.length+1];
			for(int i = 0; i < interfaces.length; i++)
				extended[i] = interfaces[i];
			// add the unit instance interface last
			extended[extended.length-1] = TypeUtils.getRaw(unit.getBuildUnitInterface());
			return Proxy.newProxyInstance(myClassLoader, 
					extended, new BuildUnitProxy(unit));
		}
		public BuildUnitProxy(BuildUnit unit) {
			this.unit = unit;
		}
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// simple implementation - all interfaces except BuildUnit are marker interfaces
			// so all calls can go straight through
			return method.invoke(unit, args);
		}
		
	}
}
