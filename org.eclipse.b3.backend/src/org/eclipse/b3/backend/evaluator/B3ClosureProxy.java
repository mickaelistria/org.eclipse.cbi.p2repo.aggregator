/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;

/**
 * A B3ClosureProxy delegates all calls to the object it is a proxy for except "getClosure" which is
 * returned from the proxy.
 * 
 */
public class B3ClosureProxy implements InvocationHandler {
	public static Object newInstance(Object o, BExecutionContext ctx) {
		Class<?> interfaces[] = o.getClass().getInterfaces();
		Class<?> extended[] = new Class<?>[interfaces.length + 1];
		// add all interfaces implemented by object
		for(int i = 0; i < interfaces.length; i++)
			extended[i] = interfaces[i];
		// add the IClosure interface
		extended[interfaces.length] = IClosure.class;
		return Proxy.newProxyInstance(B3ClosureProxy.class.getClassLoader(), extended, new B3ClosureProxy(o, ctx));
	}

	private final Object theObject;

	private final BExecutionContext closure;

	private B3ClosureProxy(Object anObject, BExecutionContext ctx) {
		if(anObject == null)
			throw new IllegalArgumentException("Can not create a B3ClosureProxy on a null Object.");
		if(ctx == null)
			throw new IllegalArgumentException("Can not create a B3ClosureProxy with a null BExecutionContext.");
		theObject = anObject;
		closure = ctx;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("getClosure"))
			return closure;
		return method.invoke(theObject, args);
	}
}
