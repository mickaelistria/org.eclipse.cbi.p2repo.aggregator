/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FunctionCandidateAdapterFactory extends AdapterFactoryImpl {

	public interface IFunctionCandidateAdapter extends TypeUtils.ICandidate, Adapter {

		public IFunction getTarget();

	}

	protected static class FunctionCandidateAdapter extends TypeUtils.Candidate implements IFunctionCandidateAdapter {

		private IFunction target;

		public FunctionCandidateAdapter(IFunction aTarget) {
			target = aTarget;
		}

		public Type[] getParameterTypes() {
			return target.getParameterTypes();
		}

		public IFunction getTarget() {
			return target;
		}

		public Type getVarargArrayType() {
			return target.getVarargArrayType();
		}

		public boolean isAdapterForType(Object type) {
			return (type instanceof Class<?>) && ((Class<?>) type).isAssignableFrom(getClass());
		}

		public boolean isVarArgs() {
			return target.isVarArgs();
		}

		public void notifyChanged(Notification notification) {
			// do nothing
		}

		public void setTarget(Notifier newTarget) {
			target = (IFunction) newTarget;
		}

	}

	protected static class JavaFunctionCandidateAdapter extends TypeUtils.JavaCandidate implements IFunctionCandidateAdapter {

		private BJavaFunction target;

		public JavaFunctionCandidateAdapter(BJavaFunction aTarget) {
			target = aTarget;
		}

		public Type[] getParameterTypes() {
			return target.getParameterTypes();
		}

		public BJavaFunction getTarget() {
			return target;
		}

		public Type getVarargArrayType() {
			return target.getVarargArrayType();
		}

		public boolean isAdapterForType(Object type) {
			return (type instanceof Class<?>) && ((Class<?>) type).isAssignableFrom(getClass());
		}

		public boolean isVarArgs() {
			return target.isVarArgs();
		}

		public void notifyChanged(Notification notification) {
			// TODO we might want to react to changes to parameters, isVarArgs, parameterTypes
		}

		public void setTarget(Notifier newTarget) {
			target = (BJavaFunction) newTarget;
		}

		@Override
		protected Type[] getJavaParameterTypes() {
			return target.getMethod().getGenericParameterTypes();
		}

		@Override
		protected void setParameterTypes(Type[] types) {
			target.setParameterTypes(types);
		}

		@Override
		protected void setVarargArrayType(Type type) {
			target.setVarargArrayType(type);
		}

	}

	public static final FunctionCandidateAdapterFactory eINSTANCE = new FunctionCandidateAdapterFactory();

	protected FunctionCandidateAdapterFactory() {
	}

	public IFunctionCandidateAdapter adapt(IFunction target) {
		return adapt(target, IFunctionCandidateAdapter.class);
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return type == IFunctionCandidateAdapter.class;
	}

	/**
	 * Type safe variant of adapt
	 * 
	 * @param <T>
	 * @param target
	 * @param type
	 * @return
	 */
	protected <T> T adapt(IFunction target, Class<T> type) {
		return type.cast(super.adapt(target, type));
	}

	@Override
	protected IFunctionCandidateAdapter createAdapter(Notifier target) {
		if(target instanceof BJavaFunction)
			return new JavaFunctionCandidateAdapter((BJavaFunction) target);
		if(target instanceof IFunction)
			return new FunctionCandidateAdapter((IFunction) target);
		return null;
	}

}
