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
			return isAssignableFrom(type, getClass());
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

	protected static class JavaFunctionCandidateAdapter extends TypeUtils.JavaCandidate implements
			IFunctionCandidateAdapter {

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
			return isAssignableFrom(type, getClass());
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

	protected static boolean isAssignableFrom(Object baseType, Class<?> fromType) {
		return (baseType instanceof Class<?>) && ((Class<?>) baseType).isAssignableFrom(fromType);
	}

	protected FunctionCandidateAdapterFactory() {
	}

	public IFunctionCandidateAdapter adapt(Notifier target) {
		return adapt(target, IFunctionCandidateAdapter.class);
	}

	public <T> T adapt(Notifier target, Class<T> type) {
		// this cast is safe as the createAdapter(Notifier target, Object type) - a result of which is eventually
		// returned by super.adapt() - never creates an adapter not matching the required type (at worst it returns
		// null)
		return type.cast(super.adapt(target, type));
	}

	@Override
	public void adaptAllNew(Notifier target) {
		adapt(target);
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return isAssignableFrom(type, IFunctionCandidateAdapter.class);
	}

	@Override
	protected Adapter createAdapter(Notifier target) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected IFunctionCandidateAdapter createAdapter(Notifier target, Object type) {
		if(type instanceof Class<?>) {
			Class<?> typeClass = (Class<?>) type;
			if(target instanceof BJavaFunction && typeClass.isAssignableFrom(JavaFunctionCandidateAdapter.class))
				return new JavaFunctionCandidateAdapter((BJavaFunction) target);
			if(target instanceof IFunction && typeClass.isAssignableFrom(FunctionCandidateAdapter.class))
				return new FunctionCandidateAdapter((IFunction) target);
		}
		return null;
	}

}
