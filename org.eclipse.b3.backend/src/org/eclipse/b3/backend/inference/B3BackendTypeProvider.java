/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.inference;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.b3.backend.core.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.core.SimplePattern;
import org.eclipse.b3.backend.evaluator.Any;
import org.eclipse.b3.backend.evaluator.PojoFeatureLValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3Function;
import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BAndExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BAssignmentExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BAtExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BBinaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCachedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFeature;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BCallNamedFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BCatch;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BDefProperty;
import org.eclipse.b3.backend.evaluator.b3backend.BDefValue;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BIfExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralListExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralMapExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralType;
import org.eclipse.b3.backend.evaluator.b3backend.BMapEntry;
import org.eclipse.b3.backend.evaluator.b3backend.BOrExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BRegularExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSimplePatternExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BTryExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPostOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BUnaryPreOpExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithContextExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

/**
 * Provides the type of expressions using declared type and type inference.
 * 
 */
public class B3BackendTypeProvider extends DeclarativeTypeProvider {

	@Inject
	protected FunctionUtils functionUtils;

	/**
	 * Adds inference of return type.
	 * 
	 * @param o
	 * @return B3FunctionType with possible inferred return type
	 */
	public Type type(B3Function o) {
		B3FunctionType t = (B3FunctionType) type((BFunction) o);
		if(t.getReturnType() == null) {
			t.setReturnType(doGetInferredType(o.getFuncExpr()));
		}
		return t;
	}

	public Type type(B3JavaImport o) {
		return o.getType();
	}

	public Type type(BAndExpression o) {
		return Boolean.class;
	}

	public Type type(BAssignmentExpression o) {
		Type t = doGetInferredType(o.getLeftExpr());
		if(t == null)
			t = doGetInferredType(o.getRightExpr());
		return t;
	}

	public Type type(BAtExpression o) {
		// TODO: Assumes that lhs is a list or map - if so, the value element type is returned
		// or, if not list, map, or these are raw - then object is returned.
		// This is probably not enough - should probably get <?> type instead if not known
		// to be able to give editor/compiler a hint that specification is missing.
		//
		return TypeUtils.getElementType(doGetInferredType(o.getObjExpr()));
	}

	public Type type(BBinaryOpExpression o) {
		Type lhsT = doGetInferredType(o.getLeftExpr());
		Type rhsT = doGetInferredType(o.getRightExpr());
		// TODO: consider if java should be consulted directly for operator on lhs type
		List<IFunction> candidates = functionUtils.findEffectiveFunctions(o, o.getFunctionName(), lhsT);
		try {
			Type[] types = new Type[] { lhsT, rhsT };
			IFunction f = functionUtils.selectInstanceFunction(o.getFunctionName(), candidates, types);
			return functionUtils.getReturnType(f, types);
			// B3FunctionType t = FunctionUtils.getSignature(f);
			// BTypeCalculator tc = t.getTypeCalculator();
			// if(tc == null)
			// return t.getReturnType();
			// return tc.getReturnTypeForParameterTypes(types);
		}
		catch(Exception e) {
			return Object.class;
		}
		/*
		 * OLD WAY:
		 * return ctx.getDeclaredFunctionType(
		 * functionName, new Type[] { leftExpr.getDeclaredType(ctx), rightExpr.getDeclaredType(ctx) });
		 */
	}

	public Type type(BCachedExpression o) {
		return doGetInferredType(o.getExpr());
	}

	public Type type(BCallFeature o) {
		// TODO: This method can be simplified by delegating to selectFunction instead of
		// doing two lookups.
		Type[] types = null;
		boolean staticAttempt = false;
		try {
			types = functionUtils.asTypeArray(o, true);

			types[0] = doGetInferredType(o.getFuncExpr());
			List<IFunction> candidates = functionUtils.findEffectiveFunctions(o, o.getName(), types[0]);
			IFunction f = functionUtils.selectInstanceFunction(o.getName(), candidates, types);
			return functionUtils.getReturnType(f, types);
		}
		catch(InferenceExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(B3NoSuchFunctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(B3NoSuchFunctionSignatureException e) {
			staticAttempt = true;
		}
		catch(B3AmbiguousFunctionSignatureException e) {
			staticAttempt = true;
		}
		// Try again, this time with a static call
		if(staticAttempt) {
			if(types.length > 0) {
				// static call
				B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
				metaClass.setInstanceClass(TypeUtils.getRaw(types[0]));
				Type[] newTypes = new Type[types.length + 1];
				System.arraycopy(types, 0, newTypes, 1, types.length);
				newTypes[0] = metaClass;

				List<IFunction> candidates = functionUtils.findEffectiveFunctions(o, o.getName(), types[0]);
				IFunction f;
				try {
					f = functionUtils.selectInstanceFunction(o.getName(), candidates, newTypes);
					return functionUtils.getReturnType(f, types);
				}
				catch(B3EngineException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// survive syntax errors by returning Object.class
		return Object.class;
	}

	public Type type(BCallFunction o) {
		Type t = doGetInferredType(o.getFuncExpr());
		if(t instanceof B3MetaClass) {
			// the class this meta class represents (i.e. what it casts to).
			return ((B3MetaClass) t).getInstanceClass();
		}
		if(!(t instanceof B3FunctionType))
			// invalid expression, this is not the concern of the type provider? Just return null ?
			throw new IllegalArgumentException("Invalid call - LHS is neither a class nor function. Was: " +
					t.toString());

		return ((B3FunctionType) t).getReturnType();
	}

	public Type type(BCallNamedFunction o) {
		// Find functions by name
		// Match parameters
		// get return type
		String name = o.getFuncRef().getName();
		if(Strings.isEmpty(name))
			name = o.getName();
		if(Strings.isEmpty(name))
			return null;
		Type[] types = null;
		try {
			types = functionUtils.asTypeArray(o, false);
		}
		catch(InferenceExceptions e) {
			return null;
		}
		Type referenceType = types.length > 0
				? types[0]
				: null;
		List<IFunction> candidates = functionUtils.findEffectiveFunctions(o, name, referenceType);
		boolean staticAttempt = false;
		try {
			IFunction func = functionUtils.selectInstanceFunction(name, candidates, types);
			return functionUtils.getReturnType(func, types);
		}
		catch(B3NoSuchFunctionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(B3NoSuchFunctionSignatureException e) {
			staticAttempt = true;
		}
		catch(B3AmbiguousFunctionSignatureException e) {
			staticAttempt = true;
		}
		// Try again, this time with a static call
		if(staticAttempt) {
			if(types.length > 0) {
				// static call
				B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
				metaClass.setInstanceClass(TypeUtils.getRaw(types[0]));
				Type[] newTypes = new Type[types.length + 1];
				System.arraycopy(types, 0, newTypes, 1, types.length);
				newTypes[0] = metaClass;

				try {
					candidates = functionUtils.findEffectiveFunctions(o, o.getName(), types[0]);
					IFunction f = functionUtils.selectInstanceFunction(o.getName(), candidates, newTypes);
					return functionUtils.getReturnType(f, types);
				}
				catch(B3EngineException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// survive syntax errors by returning Object.class
		return Object.class;

	}

	public Type type(BCase o) {
		return doGetInferredType(o.getThenExpr());
	}

	public Type type(BCatch o) {
		return doGetInferredType(o.getCatchExpr());

	}

	public Type type(BChainedExpression o) {
		final EList<BExpression> exprList = o.getExpressions();
		final int sz = exprList.size();
		if(sz == 0)
			return Object.class; // TODO: result is null, but could be seen as null of expected type...
		return doGetInferredType(exprList.get(sz - 1));
	}

	public Type type(BCreateExpression o) {
		BExpression t = o.getTypeExpr();
		if(!(t instanceof BLiteralType))
			throw new IllegalArgumentException("Can only create literal type. Was: " + t.getClass().toString());
		// note: use the type the type represents, not the type that describes it
		return ((BLiteralType) t).getType();
	}

	public Type type(BDefProperty o) {
		final Type t = o.getType();
		return t == null
				? doGetInferredType(o.getValueExpr())
				: t;
	}

	public Type type(BDefValue o) {
		final Type t = o.getType();
		return t == null
				? doGetInferredType(o.getValueExpr())
				: t;
	}

	/**
	 * TODO: only supports POJO LValue at the moment (but don't think it is possible yet to
	 * really use model instances without a concrete impl.
	 * 
	 * @param o
	 * @return
	 */
	public Type type(BFeatureExpression o) {
		Type t = doGetInferredType(o.getObjExpr());
		try {
			return new PojoFeatureLValue(TypeUtils.getRaw(t), o.getFeatureName()).getDeclaredType();
		}
		catch(B3EngineException e) {
			throw new IllegalArgumentException("Could not determine type of feature expression due to error.", e);
		}
	}

	public Type type(BFunction o) {
		B3FunctionType t = B3backendFactory.eINSTANCE.createB3FunctionType();
		// TODO: This is probably wrong - but current impl uses this class for
		// both B3Function, and JavaFunction ??? Probably a Bug??
		t.setFunctionType(B3Function.class);

		Type returnType = o.getReturnType();
		t.setReturnType(returnType);
		t.setVarArgs(o.isVarArgs());
		t.setTypeCalculator(o.getTypeCalculator());

		// Infer the type of the parameters
		EList<Type> pt = t.getParameterTypes();
		for(BParameterDeclaration p : o.getParameters())
			pt.add(doGetInferredType(p));

		// override the inference that a varargs parameter is a List<T> and use only a T
		if(o.isVarArgs()) {
			int lastIndex = pt.size() - 1;
			pt.set(lastIndex, TypeUtils.getElementType(pt.get(lastIndex)));
		}

		// Type[] ptarray = o.getParameterTypes();
		// for(int i = 0; i < ptarray.length; i++)
		// pt.add(ptarray[i]);
		return t;
		// return FunctionUtils.getSignature(o);
	}

	public Type type(BFunctionWrapper o) {
		return doGetInferredType(o.getOriginal()); // wrapper can never change the signature
	}

	public Type type(BIfExpression o) {
		return TypeUtils.getCommonSuperType(new Type[] {
				doGetInferredType(o.getThenExpr()), doGetInferredType(o.getElseExpr()) });
	}

	public Type type(BLiteralAny o) {
		return Any.class;
	}

	public Type type(BLiteralExpression o) {
		Object v = null;
		return (v = o.getValue()) == null
				? Object.class
				: v.getClass();
	}

	/**
	 * Type of list is declared, or derived from the elements in the list (the common supertype).
	 * 
	 * @param o
	 * @return
	 */
	public Type type(BLiteralListExpression o) {
		B3ParameterizedType pt = B3backendFactory.eINSTANCE.createB3ParameterizedType();
		pt.setRawType(List.class);

		Type eType = o.getEntryType();
		ArrayList<Type> typeList = eType != null
				? null
				: new ArrayList<Type>();
		if(eType == null) {
			if(o.getEntries().size() > 0) {
				for(BExpression c : o.getEntries()) {
					typeList.add(doGetInferredType(c));
				}
			}
			else {
				eType = Object.class;
			}
		}
		pt.getActualArgumentsList().add(eType != null
				? eType
				: TypeUtils.getCommonSuperType(typeList.toArray(new Type[typeList.size()])));
		return pt;

	}

	/**
	 * Type is either declared, or inferred. This implementation will infer both keys and values.
	 * The most common type is inferred.
	 * An empty map will be inferred to have the type Map<String, Object>.
	 * 
	 * @param o
	 * @return
	 */
	// Type kt = keyType == null
	// ? String.class
	// : keyType;
	// Type vt = valueType == null
	// ? Object.class
	// : valueType;
	// B3ParameterizedType pt = B3backendFactory.eINSTANCE.createB3ParameterizedType();
	// pt.setRawType(Map.class);
	// pt.getActualArgumentsList().add(kt);
	// pt.getActualArgumentsList().add(vt);
	// return pt;
	public Type type(BLiteralMapExpression o) {
		Type kt = o.getKeyType();
		Type vt = o.getValueType();

		ArrayList<Type> typeListKey = kt != null
				? null
				: new ArrayList<Type>();
		ArrayList<Type> typeListVal = vt != null
				? null
				: new ArrayList<Type>();

		if(kt == null || vt == null) {
			if(o.getEntries().size() > 0)
				for(BMapEntry e : o.getEntries()) {
					if(kt == null)
						typeListKey.add(doGetInferredType(e.getKey()));
					if(vt == null)
						typeListVal.add(doGetInferredType(e.getValue()));
				}
			else {
				// defaults for an empty Map without declared type.
				kt = String.class;
				vt = Object.class;
			}
		}
		B3ParameterizedType pt = B3backendFactory.eINSTANCE.createB3ParameterizedType();
		pt.setRawType(Map.class);

		pt.getActualArgumentsList().add(kt != null
				? kt
				: TypeUtils.getCommonSuperType(typeListKey.toArray(new Type[typeListKey.size()])));
		pt.getActualArgumentsList().add(vt != null
				? vt
				: TypeUtils.getCommonSuperType(typeListVal.toArray(new Type[typeListVal.size()])));

		return pt;
	}

	/**
	 * @param o
	 * @return the type of the type - not the represented type
	 */
	public Type type(BLiteralType o) {
		Object v = null;
		return (v = o.getType()) == null
				? Object.class
				: v.getClass();
	}

	public Type type(BOrExpression o) {
		return Boolean.class;
	}

	public Type type(BParameter o) {
		return doGetInferredType(o.getExpr());
	}

	/**
	 * The type of a declared parameter is either:
	 * - the declared
	 * - the declared varargs
	 * - inferred from:
	 * 1. lambda parent being passed as arg
	 * 2. lambda parent being called with args of known type
	 * 3. lambda parent being assigned to var with signature type
	 * 4. lambda parent being in list or map with signature type
	 * 
	 * - a default Object.class
	 * 
	 * @param o
	 * @return
	 */
	public Type type(BParameterDeclaration o) {
		Type t = o.getType(); // declared type
		if(t != null) {
			// check if it is a varargs parameter
			if(((IFunction) o.eContainer()).isVarArgs()) {
				EList<BParameterDeclaration> params = ((IFunction) o.eContainer()).getParameters();
				if(params.indexOf(o) == params.size() - 1) {
					B3ParameterizedType t2 = B3backendFactory.eINSTANCE.createB3ParameterizedType();
					t2.setRawType(List.class);
					t2.getActualArgumentsList().add(t);
					t = t2;
				}
			}
			return t;
		}
		// possible inferences:
		// 1. a lambda passed as an argument to function - the declared signature determines the type
		// 2. a lambda being called can infer the type to the type used in the call.
		// 3. a lambda assigned to a declared type can use the type declaration
		// 4. a lambda in a Literal List or Map where the container defines the type
		// 3. defaults to Object

		// is it a lambda (i.e. unnamed)
		EObject container = o.eContainer();
		if((container instanceof IFunction) && ((IFunction) container).getName() == null) {
			// this is a lambda
			EObject funcContainer = container.eContainer();

			if(funcContainer instanceof BParameter) {
				// this is a literal lambda used as a parameter in a call
				// TODO: The container of the BParameter is the call that knows about the target of the call
				// its parameter declaration for the position of the BParameter can be used.
				//
				// the container of a BParameter is a BParameterizedExpression (specialized to either a
				// BCallExpression (has subtypes), or BCreateExpression).
				// - these do not yet know the signature of the call, only have a name as reference, so
				// currently not possible to infer the type. TODO. revisit when calls know what they are calling.

				t = null; // placeholder
				// ////
				// TODO: This method can be simplified by delegating to selectFunction instead of
				// doing two lookups.
				// Type[] types = null;
				// try {
				// BParameterizedExpression called = (BParameterizedExpression) funcContainer.eContainer().eContainer();
				// types = functionUtils.asTypeArray(called, true);
				// types[0] = doGetInferredType(called.getFuncExpr());
				// List<IFunction> candidates = functionUtils.findEffectiveFunctions(o, o.getName(), types[0]);
				// IFunction f = functionUtils.selectInstanceFunction(o.getName(), candidates, types);
				// return functionUtils.getReturnType(f, types);
				// }
				// catch(InferenceExceptions e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// catch(B3NoSuchFunctionException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// catch(B3NoSuchFunctionSignatureException e) {
				// staticAttempt = true;
				// }
				// catch(B3AmbiguousFunctionSignatureException e) {
				// staticAttempt = true;
				// }

				// ////

			}
			else if(funcContainer instanceof BCallFunction) {
				// this is a lambda immediately being called
				int idx = ((IFunction) container).getParameters().indexOf(o);
				BParameter expr = ((BCallFunction) funcContainer).getParameterList().getParameters().get(idx);
				t = doGetInferredType(expr);
			}
			// var (T1, T2)=>T3 a = {a,b| a+b;}, infers a=T1, b=T2,
			else if(funcContainer instanceof BAssignmentExpression) {
				if(((BAssignmentExpression) funcContainer).getRightExpr() == container) {
					Type signature = doGetInferredType(((BAssignmentExpression) funcContainer).getLeftExpr());
					if(signature instanceof B3FunctionType) {
						int idx = ((IFunction) container).getParameters().indexOf(o);
						t = ((B3FunctionType) signature).getParameterTypes().get(idx);
					}
				}
			}
			// if in a list
			else if(funcContainer instanceof BLiteralListExpression) {
				Type entryType = ((BLiteralListExpression) funcContainer).getEntryType();
				if(entryType != null && entryType instanceof ParameterizedType) {
					Type[] typeArgs = ((ParameterizedType) entryType).getActualTypeArguments();
					if(typeArgs != null && typeArgs.length == 1) {
						Type signature = typeArgs[0];
						if(signature instanceof B3FunctionType) {
							int idx = ((IFunction) container).getParameters().indexOf(o);
							t = ((B3FunctionType) signature).getParameterTypes().get(idx);
						}
					}
				}
			}
			// if in a map
			else if(funcContainer instanceof BMapEntry) {
				BLiteralMapExpression map = (BLiteralMapExpression) funcContainer.eContainer();
				Type entryType = null;
				if(((BMapEntry) funcContainer).getKey() == container)
					entryType = map.getKeyType();
				else
					entryType = map.getValueType();

				if(entryType != null && entryType instanceof ParameterizedType) {
					Type[] typeArgs = ((ParameterizedType) entryType).getActualTypeArguments();
					if(typeArgs != null && typeArgs.length == 1) {
						Type signature = typeArgs[0];
						if(signature instanceof B3FunctionType) {
							int idx = ((IFunction) container).getParameters().indexOf(o);
							t = ((B3FunctionType) signature).getParameterTypes().get(idx);
						}
					}
				}
			}
		}
		// if no other inference succeeded
		if(t == null)
			t = Object.class;
		return t;
	}

	public Type type(BParameterPredicate o) {
		return o.getType();
	}

	/**
	 * TODO: Proceed is used in FunctionConcern and in BuilderConcern. Must be handled as overriding type provider
	 * TODO: Proceed can not get return type from ConcernContext !! always returns Object.class
	 * 
	 * @param o
	 * @return
	 */
	public Type type(BProceedExpression o) {
		EObject container = o.eContainer();
		while(container != null) {
			if(container instanceof BFunctionConcernContext) // || container instanceof BuilderConcernContext)
				break; // ok
			container = container.eContainer();
		}
		if(container == null)
			return Object.class; // Syntax error, but try to survive
		// TODO: The return type is currently not declared in the Function Context
		// ((BFunctionConcernContext)container).getReturnType()
		return Object.class;
	}

	public Type type(BRegularExpression o) {
		return Pattern.class;
	}

	public Type type(BSimplePatternExpression o) {
		return SimplePattern.class;
	}

	/**
	 * The type of a switch is the common type of the case expressions.
	 * 
	 * @param o
	 * @return
	 */
	public Type type(BSwitchExpression o) {
		ArrayList<Type> typeList = new ArrayList<Type>();
		for(BCase c : o.getCaseList()) {
			typeList.add(doGetInferredType(c));
		}
		return TypeUtils.getCommonSuperType(typeList.toArray(new Type[typeList.size()]));

	}

	public Type type(BThrowExpression o) {
		// This is a lie - should be void.
		return Object.class;
	}

	/**
	 * The type of a 'try' is the common type of the try and all catch blocks.
	 * 
	 * @param o
	 * @return
	 */
	public Type type(BTryExpression o) {
		Type[] types = new Type[o.getCatchBlocks().size() + 1];
		types[0] = doGetInferredType(o.getTryExpr());
		int counter = 1;
		for(BCatch catchBlock : o.getCatchBlocks())
			types[counter++] = doGetInferredType(catchBlock);

		return TypeUtils.getCommonSuperType(types);

	}

	public Type type(BUnaryOpExpression o) {
		Type lhsT = doGetInferredType(o.getExpr());
		// TODO: consider if java should be consulted directly for operator on lhs type
		List<IFunction> candidates = functionUtils.findEffectiveFunctions(o, o.getFunctionName(), lhsT);
		try {
			Type[] types = new Type[] { lhsT };
			IFunction f = functionUtils.selectInstanceFunction(o.getFunctionName(), candidates, types);
			return functionUtils.getReturnType(f, types);
		}
		catch(Exception e) {
			return Object.class;
		}
	}

	public Type type(BUnaryPostOpExpression o) {
		// somewhat cheating - it is assumed that postop results in same type
		return doGetInferredType(o.getExpr());

	}

	public Type type(BUnaryPreOpExpression o) {
		// somewhat cheating - it is assumed that preop results in same type
		return doGetInferredType(o.getExpr());
	}

	public Type type(BVariableExpression o) {
		return doGetInferredType(o.getNamedValue());
	}

	public Type type(BWithContextExpression o) {
		return doGetInferredType(o.getExpr());
	}

	public Type type(BWithExpression o) {
		BExpression f = o.getFuncExpr();
		if(f != null)
			return doGetInferredType(f);
		return Object.class;
	}
}
