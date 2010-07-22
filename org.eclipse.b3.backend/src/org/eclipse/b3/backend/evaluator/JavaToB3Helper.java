/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.backend.evaluator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.b3.backend.core.B3Backend;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3FunctionLoadException;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BGuard;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterDeclaration;
import org.eclipse.b3.backend.evaluator.b3backend.BTypeCalculator;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.FunctionCandidateAdapterFactory;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

/**
 * Converts a class with (optional) B3 annotations into B3 Functions.
 * 
 */
public class JavaToB3Helper {
	/**
	 * <!-- begin-user-doc -->
	 * Create and initialize a BJavaFunction to represent the method m.
	 * 
	 * @param m
	 *            the method to create the BJavaFunction representation for
	 * @param callType
	 *            the intended call type of the BJavaFunction to be created
	 * @return the BJavaFunction representation of the method m
	 *         <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static BJavaFunction createJavaFunction(Method m, BJavaCallType callType) {
		int modifiers = m.getModifiers();
		boolean isStatic;

		// only handle public methods and also require the methods to be static if the call type is different from
		// BJavaCallType.METHOD
		if(!(Modifier.isPublic(modifiers) && ((isStatic = Modifier.isStatic(modifiers)) || callType == BJavaCallType.METHOD)))
			return null;

		BJavaFunction f = B3backendFactory.eINSTANCE.createBJavaFunction();

		// TODO: f's Resource ?!?
		// String fileName = m.getDeclaringClass().getCanonicalName();
		// fileRef.setFileName(fileName == null ? "anonymous class" : fileName);

		f.setName(m.getName());
		f.setMethod(m); // add the thing to call
		f.setFinal(Modifier.isFinal(modifiers)); // make it final in b3 as well
		f.setCallType(callType);
		f.setVarArgs(m.isVarArgs());
		f.setTypeParameters(m.getTypeParameters());

		Type[] instanceParameterTypes;
		String[] instanceParameterNames;

		if(callType == BJavaCallType.METHOD) {
			// only set this for methods with call type == BJavaCallType.METHOD
			f.setClassFunction(isStatic); // invokable via class - i.e. "static" in java
			if(isStatic) {
				B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
				metaClass.setInstanceClass(m.getDeclaringClass());
				instanceParameterTypes = new Type[] { metaClass };
				instanceParameterNames = new String[] { "class" };
			}
			else {
				instanceParameterTypes = new Type[] { m.getDeclaringClass() };
				instanceParameterNames = new String[] { "this" };
			}
		}
		else {
			instanceParameterTypes = null;
			instanceParameterNames = null;
		}

		TypeUtils.JavaCandidate javaFunctionCandidate = FunctionCandidateAdapterFactory.eINSTANCE.adapt(
			f, TypeUtils.JavaCandidate.class);
		// this eventually calls f.setParameterTypes()
		javaFunctionCandidate.processJavaParameterTypes(instanceParameterTypes);

		f.setParameterNames(getParameterNames(m.getParameterAnnotations(), instanceParameterNames));

		setParameterDeclarations(f);

		f.setReturnType(TypeUtils.objectify(m.getGenericReturnType()));
		f.setExceptionTypes(m.getGenericExceptionTypes());

		return f;
	}

	public static Iterable<IFunction> getNamedFunctions(Class<?> clazz, String name) {
		List<IFunction> result = new ArrayList<IFunction>();
		Method[] ms = clazz.getMethods();
		for(int i = 0; i < ms.length; i++) {
			if(!name.equals(ms[i].getName()))
				continue;
			result.add(createJavaFunction(ms[i], BJavaCallType.METHOD));
		}
		return result;
	}

	private static String[] getParameterNames(Annotation[][] allParametersAnnotations, String... instanceParameterNames) {
		int instanceParameterNamesCount = instanceParameterNames != null
				? instanceParameterNames.length
				: 0;
		String parameterNames[] = new String[instanceParameterNamesCount + allParametersAnnotations.length];
		HashSet<String> usedNames = new HashSet<String>();
		// first process the instance parameter names - don't allow duplicates
		for(int i = 0; i < instanceParameterNamesCount; ++i) {
			String name = instanceParameterNames[i];
			if(!usedNames.contains(name)) {
				parameterNames[i] = name;
				usedNames.add(name);
			}
		}
		// now look for parameter names defined by annotations - watch for duplicates again
		for(int i = 0; i < allParametersAnnotations.length; ++i) {
			Annotation[] parameterAnnotations = allParametersAnnotations[i];
			if(parameterAnnotations != null) {
				for(int j = 0; j < parameterAnnotations.length; ++j) {
					if(parameterAnnotations[j] instanceof B3Backend) {
						String name = ((B3Backend) parameterAnnotations[j]).name();
						if(!usedNames.contains(name)) {
							parameterNames[instanceParameterNamesCount + i] = name;
							usedNames.add(name);
						}
						break; // only use first name declared for the parameter
					}
				}
			}
		}
		// finally supply default unique names for those parameters which have no name assigned by now
		for(int i = 0, j = 0; i < parameterNames.length; ++i) {
			if(parameterNames[i] == null) {
				String name;
				while(usedNames.contains(name = toAlphabetString(j++)))
					;
				parameterNames[i] = name;
			}
		}
		return parameterNames;
	}

	/**
	 * Loads static functions from a java class. Using (optional) B3Backend annotations to
	 * direct the translation into B3 functions.
	 * Returns a Multimap of each defined function (as key), and for each function one or more names (aliases).
	 * 
	 */
	public static Multimap<IFunction, String> loadFunctions(Class<? extends Object> clazz) throws B3EngineException {
		Multimap<IFunction, String> result = Multimaps.newHashMultimap();
		Map<String, BJavaFunction> systemFunctions = new HashMap<String, BJavaFunction>();
		Map<String, BJavaFunction> guards = new HashMap<String, BJavaFunction>();
		Map<String, BJavaFunction> typeCalculators = new HashMap<String, BJavaFunction>();

		Map<String, List<BJavaFunction>> systemProxies = new HashMap<String, List<BJavaFunction>>();
		Map<String, List<BJavaFunction>> guardedFunctions = new HashMap<String, List<BJavaFunction>>();
		Map<String, List<BJavaFunction>> typeCalculatedFunctions = new HashMap<String, List<BJavaFunction>>();

		// create and initialize a BJavaFunction to represent each public static function
		for(Method m : clazz.getDeclaredMethods()) {
			// the call type of the function may later change to system call
			BJavaFunction f = createJavaFunction(m, BJavaCallType.FUNCTION);

			if(f == null)
				continue;

			// check for annotations
			B3Backend annotation = m.getAnnotation(B3Backend.class);

			// take a shortcut if there is no annotation
			if(annotation == null) {
				result.put(f, m.getName());
				continue;
			}

			String[] names = annotation.funcNames();

			if(annotation.hideOriginal()) {
				if(names == null || names.length == 0)
					throw new B3FunctionLoadException(
						"hideOriginal annotation specified but not funcNames annotation", m);
				f.setName(names[0]);
			}

			f.setExecutionMode(BackendHelper.getExecutionMode(annotation));
			f.setVisibility(BackendHelper.getVisibility(annotation));

			// If the function is a system function, set it aside and patch the functions proxying it later.
			if(annotation.system()) {
				systemFunctions.put(f.getName(), f);
				continue;
			}

			// If the function is a guard, set it aside and patch the functions using it later.
			if(annotation.guard()) {
				// guards are called using system calling convention
				f.setCallType(BJavaCallType.SYSTEM);
				guards.put(f.getName(), f);
				continue;
			}

			// If the function is a type calculator, set it aside and patch the functions using it later.
			if(annotation.typeCalculator()) {
				typeCalculators.put(f.getName(), f);
				continue;
			}

			// add defined function to the result
			if(!annotation.hideOriginal())
				result.put(f, m.getName());

			if(names != null) {
				for(String fname : names)
					result.put(f, fname);

			}

			// if a function is a proxy for a system function, remember it
			{
				String systemFunctionName = annotation.systemFunction();
				if(systemFunctionName != null && systemFunctionName.length() > 0) {
					List<BJavaFunction> fs = null;
					if((fs = systemProxies.get(systemFunctionName)) == null)
						systemProxies.put(systemFunctionName, fs = new ArrayList<BJavaFunction>());
					fs.add(f);
				}
			}

			// if a function is guarded, remember it
			{
				String guardFunctionName = annotation.guardFunction();
				if(guardFunctionName != null && guardFunctionName.length() > 0) {
					List<BJavaFunction> gf = null;
					if((gf = guardedFunctions.get(guardFunctionName)) == null)
						guardedFunctions.put(guardFunctionName, gf = new ArrayList<BJavaFunction>());
					gf.add(f);
				}
			}

			// if a function has a type calculator, remember it
			{
				String typeCalculatorFunctionName = annotation.typeFunction();
				if(typeCalculatorFunctionName != null && typeCalculatorFunctionName.length() > 0) {
					List<BJavaFunction> tf = null;
					if((tf = typeCalculatedFunctions.get(typeCalculatorFunctionName)) == null)
						typeCalculatedFunctions.put(typeCalculatorFunctionName, tf = new ArrayList<BJavaFunction>());
					tf.add(f);
				}
			}
		}

		// patch system functions
		// ---
		// revisit all functions that reference a system function and replace their method
		// with the system method, and also indicate that the call should be made as a system
		// call.
		for(Entry<String, List<BJavaFunction>> e : systemProxies.entrySet()) {
			for(BJavaFunction s : e.getValue()) {
				BJavaFunction sys = systemFunctions.get(e.getKey());
				if(sys == null)
					throw new B3FunctionLoadException("reference to system function: " + e.getKey() +
							" can not be satisfied - no such method found.", s.getMethod());
				// patch the method in the func store with values from the system function
				s.setCallType(BJavaCallType.SYSTEM);
				s.setMethod(sys.getMethod());
			}
		}

		// link guards
		// ---
		// revisit all functions that reference a guardFunction and set that function as a guard
		//
		for(Entry<String, List<BJavaFunction>> e : guardedFunctions.entrySet()) {
			for(BJavaFunction guarded : e.getValue()) {
				BJavaFunction g = guards.get(e.getKey());
				if(g == null)
					throw new B3FunctionLoadException("reference to guard function: " + e.getKey() +
							" can not be satisfied - no such guard found.", guarded.getMethod());
				// set the guard function, wrapped in a guard
				BGuard gf = B3backendFactory.eINSTANCE.createBGuard();
				gf.setFunc(g);
				guarded.setGuard(gf);
			}
		}

		// link type calculators
		// ---
		// revisit all functions that reference a typeFunction and set that function as a typeCalculator
		//
		for(Entry<String, List<BJavaFunction>> e : typeCalculatedFunctions.entrySet()) {
			for(BJavaFunction typed : e.getValue()) {
				BJavaFunction tc = typeCalculators.get(e.getKey());
				if(tc == null)
					throw new B3FunctionLoadException("reference to type calculator function: " + e.getKey() +
							" can not be satisfied - no such function found.", typed.getMethod());
				// set the type calculator function, wrapped in a BTypeCalculator
				BTypeCalculator tcf = B3backendFactory.eINSTANCE.createBTypeCalculator();
				tcf.setFunc(tc);
				typed.setTypeCalculator(tcf);
			}
		}
		return Multimaps.unmodifiableMultimap(result);
	}

	private static void setParameterDeclarations(BJavaFunction f) {
		// note: Makes use of BJavaFunction's parameter type/names as array.
		Type[] types = f.getParameterTypes();
		// Type[] types = FunctionUtils.getParameterTypes(f);
		String[] names = f.getParameterNames();
		if(types.length != names.length)
			throw new IllegalArgumentException("All types must have a name");
		EList<BParameterDeclaration> parameters = f.getParameters();
		for(int i = 0; i < types.length; i++) {
			BParameterDeclaration decl = B3backendFactory.eINSTANCE.createBParameterDeclaration();
			Type type = types[i];
			if(!(type instanceof EObject)) {
				B3ParameterizedType b3type = B3backendFactory.eINSTANCE.createB3ParameterizedType();
				b3type.setRawType(type);
				types[i] = type = b3type; // modify the parameterTypes array as well to keep it in sync
			}
			decl.setType(type);
			decl.setName(names[i]);
			parameters.add(decl);
		}
	}

	private static String toAlphabetString(long number) {
		if(number < 0)
			throw new IllegalArgumentException();

		StringBuilder buf = new StringBuilder();

		while(number >= ('z' - 'a' + 1)) {
			buf.append((char) ('a' + (int) (number % ('z' - 'a' + 1))));
			number = number / ('z' - 'a' + 1) - 1;
		}
		buf.append((char) ('a' + (int) number));

		return buf.reverse().toString();
	}
}
