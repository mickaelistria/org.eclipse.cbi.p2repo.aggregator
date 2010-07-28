/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.b3.backend.core.B3Debug;
import org.eclipse.b3.backend.core.adapters.TypeAdapter;
import org.eclipse.b3.backend.core.adapters.TypeAdapterFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;

/**
 * Basic implementation of ITypeProvider.
 * 
 */
public class DeclarativeTypeProvider implements ITypeProvider {
	private static final Logger log = Logger.getLogger(DeclarativeTypeProvider.class);

	private final PolymorphicDispatcher<Object> typeDispatcher = new PolymorphicDispatcher<Object>(
		"type", 1, 1, Collections.singletonList(this), new ErrorHandler<Object>() {
			public Object handle(Object[] params, Throwable e) {
				return handleError(params, e);
			}
		});

	private final PolymorphicDispatcher<B3FunctionType> signatureDispatcher = new PolymorphicDispatcher<B3FunctionType>(
		"signature", 1, 3, Collections.singletonList(this), new ErrorHandler<B3FunctionType>() {
			public B3FunctionType handle(Object[] params, Throwable e) {
				return handleFuncTypeError(params, e);
			}
		});

	private final PolymorphicDispatcher<Type> constraintDispatcher = new PolymorphicDispatcher<Type>(
		"constraint", 3, 3, Collections.singletonList(this), new ErrorHandler<Type>() {
			public Type handle(Object[] params, Throwable e) {
				return handleTypeError(params, e);
			}
		});

	private List<Object> inferenceStack = new ArrayList<Object>();

	private List<Object> signatureStack = new ArrayList<Object>();

	public Type constraint(EObject parent, EObject element, EStructuralFeature feature) {
		return null;
	}

	/**
	 * Returns a type in the (parent) containment that contains the type constraint for an element.
	 * Null may be returned if there is no such constraint.
	 * 
	 * @param element
	 * @return
	 */
	public Type doGetConstraint(EObject element) {
		return constraintDispatcher.invoke(element.eContainer(), element, element.eContainingFeature());
	}

	public Type doGetConstraint(EObject parent, EObject element, EStructuralFeature feature) {
		return constraintDispatcher.invoke(parent, element, feature);
	}

	public Type doGetInferredType(Object element) {
		if(inferenceStack.contains(element)) {
			if(B3Debug.typer)
				B3Debug.trace("Inference of element depends on itself: ", element.getClass().getName(), ", :", element);
			return null; // inference depends on itself
		}
		try {
			inferenceStack.add(element);
			// speed up inference by associating result with element in an adapter
			TypeAdapter ta = (element instanceof EObject)
					? TypeAdapterFactory.eINSTANCE.adapt((EObject) element)
					: null;
			Type type = null;
			if(ta != null && (type = ta.getAssociatedInfo(typeDispatcher)) != null)
				return type;
			type = (Type) typeDispatcher.invoke(element);
			if(type != null) {
				if(ta != null)
					ta.setAssociatedInfo(typeDispatcher, type);
				return type;
			}
			log.error("b3 type provider: null result for doGetInferredType() for element of type: " +
					element.getClass().getName());
			// System.err.print("Type provider - null result for: " + element.getClass().getName() + "\n");
			return null;
		}
		finally {
			inferenceStack.remove(element);
		}
	}

	public B3FunctionType doGetSignature(Object element) {
		if(signatureStack.contains(element)) {
			if(B3Debug.typer)
				B3Debug.trace(
					"Inference of element's signature depends on itself: ", element.getClass(), ", :", element);
			return null; // inference depends on itself
		}
		try {
			signatureStack.add(element);
			// speed up inference by associating result with element in an adapter
			TypeAdapter ta = (element instanceof EObject)
					? TypeAdapterFactory.eINSTANCE.adapt((EObject) element)
					: null;
			B3FunctionType type = null;
			if(ta != null && (type = (B3FunctionType) ta.getAssociatedInfo(signatureDispatcher)) != null)
				return type;
			type = signatureDispatcher.invoke(element);
			if(type != null) {
				if(ta != null)
					ta.setAssociatedInfo(signatureDispatcher, type);
				return type;
			}
			log.error("b3 type provider: null result for doGetSignature() for element of type: " +
					element.getClass().getName());
			// System.err.print("Signature provider - null result for: " + element.getClass().getName() + "\n");
			return null;
		}
		finally {
			signatureStack.remove(element);
		}
	}

	protected Object handleError(Object[] params, Throwable e) {
		// TODO: don't know how this is supposed to work - callers should expect a type at all times,
		// and get a "type can not be inferred exception" with some info about why.
		//
		if(e instanceof NullPointerException) {
			if(B3Debug.typer)
				B3Debug.trace(
					"b3 type provider: Default error handler type inference type(Object o)=>Object.class was used for:",
					params[0].getClass());

			return Object.class;
		}
		return Exceptions.throwUncheckedException(e);
	}

	protected B3FunctionType handleFuncTypeError(Object[] params, Throwable e) {
		return Exceptions.throwUncheckedException(e);
	}

	protected Type handleTypeError(Object[] params, Throwable e) {
		return null;
	}

	public B3FunctionType signature(Object o) {
		throw new UnsupportedOperationException("No suitable method for 'signature' of :" + o.getClass());
	}

	public Type type(Object o) {
		if(B3Debug.typer)
			B3Debug.trace("b3 type provider: Default type inference type(Object o)=>", o.getClass());
		return o.getClass();
	}
}
