package org.eclipse.b3.backend.core;

public class B3DynamicClassLoader extends ClassLoader {
	public B3DynamicClassLoader(ClassLoader parent) {
		super(parent);
	}

	public Class<?> defineClass(String name, byte[] b) {
		return defineClass(name, b, 0, b.length);
	}
}
