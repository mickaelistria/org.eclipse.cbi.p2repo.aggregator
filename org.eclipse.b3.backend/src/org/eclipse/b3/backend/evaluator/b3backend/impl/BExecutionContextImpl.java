/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.b3.backend.core.B3EngineException;
import org.eclipse.b3.backend.core.B3FinalVariableRedefinitionException;
import org.eclipse.b3.backend.core.B3FuncStore;
import org.eclipse.b3.backend.core.B3InternalError;
import org.eclipse.b3.backend.core.B3NoContextException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.core.B3NoSuchVariableException;
import org.eclipse.b3.backend.core.B3WeavingFailedException;
import org.eclipse.b3.backend.core.JavaToB3Helper;
import org.eclipse.b3.backend.core.LValue;
import org.eclipse.b3.backend.core.ParentContextIterator;
import org.eclipse.b3.backend.core.ValueMap;
import org.eclipse.b3.backend.evaluator.b3backend.B3MetaClass;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BDelegatingContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInnerContext;
import org.eclipse.b3.backend.evaluator.b3backend.BInvocationContext;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaCallType;
import org.eclipse.b3.backend.evaluator.b3backend.BJavaFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BSystemContext;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.google.common.collect.Maps;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BExecution Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl#getParentContext <em>Parent Context</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl#getValueMap <em>Value Map</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl#getFuncStore <em>Func Store</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl#getEffectiveConcerns <em>Effective Concerns</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl#getProgressMonitor <em>Progress Monitor</em>}</li>
 * <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.BExecutionContextImpl#getInjector <em>Injector</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class BExecutionContextImpl extends EObjectImpl implements BExecutionContext {
	protected class ValueMapLVal implements LValue {
		private String name;

		ValueMapLVal(String name) {
			this.name = name;
		}

		public Object get() throws B3EngineException {
			return getValueMap().get(name);
		}

		public Type getDeclaredType() throws B3EngineException {
			return getValueMap().getType(name);
		}

		public boolean isGetable() throws B3EngineException {
			return true;
		}

		public boolean isSettable() {
			return !getValueMap().isImmutable(name);
		}

		public Object set(Object value) throws B3EngineException {
			return getValueMap().set(name, value);
		}

		public void setDeclaredType(Type t) throws B3EngineException {
			getValueMap().setType(name, t);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	public static void printStackOnStream(BExecutionContext ctx, PrintStream x) {
		x.printf("Stack Type: %s\n", ctx.getClass().getName());
		ValueMap vm = ctx.getValueMap();
		if(vm != null)
			vm.printDump(x, 4);
		B3FuncStore fs = ctx.getFuncStore();
		if(fs != null)
			fs.printDump(x, 4);
		Map<Class<?>, Map<Object, Object>> allT = null;
		if(ctx instanceof BExecutionContextImpl)
			allT = ((BExecutionContextImpl) ctx).allThings;
		if(allT != null)
			for(Entry<Class<?>, Map<Object, Object>> things : allT.entrySet()) {
				x.printf("    Things of type: %s\n", things.getKey().toString());
				for(Entry<Object, Object> o : things.getValue().entrySet()) {
					String value = o.getValue().toString();
					value.replace("\n", "            \n");
					x.printf("        Key:%s , value:%s\n", o.getKey().toString(), value);
				}
			}
	}

	/**
	 * The cached value of the '{@link #getParentContext() <em>Parent Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParentContext()
	 * @generated
	 * @ordered
	 */
	protected BExecutionContext parentContext;

	/**
	 * The default value of the '{@link #getValueMap() <em>Value Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Implementation note: Creates a static instance (that is never used). Generated code modified to set null value.
	 * Constructor
	 * creates a new value.
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueMap()
	 * @generated NOT
	 * @ordered
	 */
	protected static final ValueMap VALUE_MAP_EDEFAULT = null; // (ValueMap)B3backendFactory.eINSTANCE.createFromString(B3backendPackage.eINSTANCE.getValueMap(),
																// "");

	/**
	 * The cached value of the '{@link #getValueMap() <em>Value Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueMap()
	 * @generated
	 * @ordered
	 */
	protected ValueMap valueMap = VALUE_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuncStore() <em>Func Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFuncStore()
	 * @generated
	 * @ordered
	 */
	protected static final B3FuncStore FUNC_STORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuncStore() <em>Func Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFuncStore()
	 * @generated
	 * @ordered
	 */
	protected B3FuncStore funcStore = FUNC_STORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEffectiveConcerns() <em>Effective Concerns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEffectiveConcerns()
	 * @generated
	 * @ordered
	 */
	protected EList<BConcern> effectiveConcerns;

	/**
	 * The default value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected static final IProgressMonitor PROGRESS_MONITOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected IProgressMonitor progressMonitor = PROGRESS_MONITOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInjector() <em>Injector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInjector()
	 * @generated
	 * @ordered
	 */
	protected static final Injector INJECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInjector() <em>Injector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInjector()
	 * @generated
	 * @ordered
	 */
	protected Injector injector = INJECTOR_EDEFAULT;

	private boolean isWeaving = false; // TODO: add as parameter to defineFunction instead

	private Map<Class<?>, Map<Object, Object>> allThings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected BExecutionContextImpl() {
		super();
		this.valueMap = new ValueMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExecutionContext basicGetParentContext() {
		return parentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object callFunction(String functionName, Object[] parameters, Type[] types) throws Throwable {
		// if("addedLater".equals(functionName)) {
		// functionName = functionName + ""; // dummy for debugging
		// }
		if(functionName == null)
			throw new B3InternalError("BExecutionContext error - can not callFunction with null function name!");
		B3FuncStore fStore = getEffectiveFuncStore();
		if(fStore == null)
			throw new B3InternalError("Could not find an effective function store - engine/context setup is broken!");
		Throwable lastError = null;
		Throwable lastStaticError = null;
		ATTEMPTS: for(int attempts = 0; attempts < 5; attempts++) {
			switch(attempts) {
				case 0: // fall through
				case 3: // try a call with the parameters as stated
					try {
						return fStore.callFunction(functionName, parameters, types, this);
					}
					catch(B3NoSuchFunctionException e) {
						attempts++; // skip second attempt
						lastError = e;
						continue;
					}
					catch(B3NoSuchFunctionSignatureException e2) {
						lastError = e2;
						continue;
					}
				case 1: // fall through
				case 4: // try a static call
					try {
						if(parameters.length > 0) {
							Object[] newParameters = new Object[parameters.length + 1];
							System.arraycopy(parameters, 0, newParameters, 1, parameters.length);
							B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
							metaClass.setInstanceClass(TypeUtils.getRaw(types[0]));
							newParameters[0] = types[0];
							Type[] newTypes = new Type[types.length + 1];
							System.arraycopy(types, 0, newTypes, 1, types.length);
							newTypes[0] = metaClass;
							return fStore.callFunction(functionName, newParameters, newTypes, this);
						}
					}
					catch(B3NoSuchFunctionException e3) {
						lastStaticError = e3;
						continue;
					}
					catch(B3NoSuchFunctionSignatureException e4) {
						lastStaticError = e4;
						continue;
					}
					break;
				case 2: // try loading the method in the java context
				{
					BExecutionContext systemCtx = this.getInvocationContext().getParentContext();
					if(!(systemCtx instanceof BSystemContext))
						throw new B3InternalError(
							"The parent of the invocation context must be an instance of BSystemContext");
					Class<?> objectType = TypeUtils.getRaw(types[0]);

					Method[] methods = objectType.getMethods();
					boolean foundNamedMethod = false;
					for(int i = 0; i < methods.length; i++) {
						if(methods[i].getName().equals(functionName)) {
							// load in system context
							BJavaFunction f = systemCtx.loadFunction(methods[i]);
							// weave in this context (and all contexts on the way to the system context).
							weaveLoaded(f, this);
							foundNamedMethod = true;
						}
					}
					if(foundNamedMethod)
						continue; // try again, now with all methods with wanted name loaded and wowen.

					// // OLD WAY
					// IFunction loaded = null;
					// if((loaded = ((BSystemContext) systemCtx).loadMethod(functionName, types)) != null) {
					// weaveLoaded(loaded, this);
					// continue; // attempt calling the (possibly advised) function
					// }
					break ATTEMPTS;
				}
				default:
					throw new B3InternalError("BExecutionContextImpl#callFunction() - broken call strategy loop :" +
							String.valueOf(attempts));
			}
		}
		// Successful call should have returned result already - only error conditions remain
		if(lastError == null && lastStaticError == null)
			throw new B3InternalError("BExecutionContextImpl#callFunction() did not return ok, and had no last error");

		throw lastError != null
				? lastError
				: lastStaticError;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean containsValue(String name) {
		return containsValue(name, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean containsValue(String name, boolean allVisible) {
		boolean result = getValueMap().containsKey(name);
		if(result || !allVisible)
			return result;
		if(getParentContext() != null)
			return getParentContext().containsValue(name, true);
		return false;

	}

	/**
	 * Creates a func store if not already created and links it to the first found parent context
	 * with a func store.
	 * (Note: It is not possible for this thread to create new functions in outer context while this
	 * context is in effect.)
	 */
	protected void createFuncStore() {
		if(funcStore != null)
			return;
		setFuncStore(new B3FuncStore(getEffectiveFuncStore()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates an inner context (i.e. local blocks which should not be seen from nested outer contexts).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BExecutionContext createInnerContext() {
		BInnerContext inner = B3backendFactory.eINSTANCE.createBInnerContext();
		inner.setParentContext(this);
		inner.setOuterContext(this);
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BExecutionContext createOuterContext() {
		BContext ctx = B3backendFactory.eINSTANCE.createBContext();
		ctx.setParentContext(this);
		return ctx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Produces an Outer-Inner pair with a delegating context between the inner, and 'this' context.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BInnerContext createWrappedInnerContext() {
		// create a BContext (an outer context) that holds the advised information
		// create a delegating inner context to use while evaluating the nested expression (it has
		// access to the local inner context.
		BContext o = B3backendFactory.eINSTANCE.createBContext();
		BDelegatingContext d = B3backendFactory.eINSTANCE.createBDelegatingContext();
		BExecutionContext p = this instanceof BInnerContext
				? ((BInnerContext) this).getOuterContext()
				: this;
		o.setParentContext(p); // parent is the current context's notion of "outer"
		d.setOuterContext(o); // the delegating context is the outer context to use "downstream"
		d.setParentContext(this); // the (typically inner) current context is visible in the returned context

		return (BInnerContext) d.createInnerContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineFinalValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineFinalValue(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineFinalVariableValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineFinalVariable(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public IFunction defineFunction(IFunction function) throws B3EngineException {
		createFuncStore();
		boolean woven = false;
		if(!isWeaving)
			for(BExecutionContext ctx = this; ctx.getParentContext() != null; ctx = ctx.getParentContext()) {
				for(BConcern c : ctx.getEffectiveConcerns())
					try {
						isWeaving = true;
						if(c.evaluateIfMatching(function, this))
							woven = true;
					}
					catch(Throwable e) {
						throw new B3WeavingFailedException(e);
					}
					finally {
						isWeaving = false;
					}
			}
		if(!woven)
			funcStore.defineFunction(function.getName(), function);
		return function;
	}

	/**
	 * @see org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext#defineSomeThing(java.lang.Class, java.lang.Object, java.lang.Object, boolean)
	 * @generated NOT
	 */
	// @Override
	public <T> void defineSomeThing(Class<T> kind, Object key, T value, boolean isWeaving) throws Throwable {
		// generic definition of something weaveable
		Map<Object, Object> thingMap = null;
		if(allThings == null) {
			allThings = Maps.newHashMap();
			allThings.put(kind, thingMap = Maps.newHashMap());
		}
		else {
			thingMap = allThings.get(kind);
			if(thingMap == null)
				allThings.put(kind, thingMap = Maps.newHashMap());
		}
		if(thingMap.containsKey(key))
			throw new IllegalArgumentException("Attempt to redefine a: " + kind.getName() + " having key: " +
					key.toString());

		boolean woven = false;
		// check for advice is not weaving
		if(!isWeaving) {
			for(BExecutionContext ctx = this; ctx.getParentContext() != null; ctx = ctx.getParentContext()) {
				for(BConcern c : ctx.getEffectiveConcerns())
					try {
						if(c.evaluateIfMatching(value, this))
							woven = true;
					}
					catch(Throwable e) {
						throw new B3WeavingFailedException(e);
					}
			}
		}
		// do not store original if it was woven
		if(!woven)
			thingMap.put(key, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineValue(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object defineVariableValue(String name, Object value, Type t) throws B3EngineException {
		if(isFinal(name))
			throw new B3FinalVariableRedefinitionException(name);
		valueMap.defineVariable(name, value, t);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT:
				if(resolve)
					return getParentContext();
				return basicGetParentContext();
			case B3backendPackage.BEXECUTION_CONTEXT__VALUE_MAP:
				return getValueMap();
			case B3backendPackage.BEXECUTION_CONTEXT__FUNC_STORE:
				return getFuncStore();
			case B3backendPackage.BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS:
				return getEffectiveConcerns();
			case B3backendPackage.BEXECUTION_CONTEXT__PROGRESS_MONITOR:
				return getProgressMonitor();
			case B3backendPackage.BEXECUTION_CONTEXT__INJECTOR:
				return getInjector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT:
				return parentContext != null;
			case B3backendPackage.BEXECUTION_CONTEXT__VALUE_MAP:
				return VALUE_MAP_EDEFAULT == null
						? valueMap != null
						: !VALUE_MAP_EDEFAULT.equals(valueMap);
			case B3backendPackage.BEXECUTION_CONTEXT__FUNC_STORE:
				return FUNC_STORE_EDEFAULT == null
						? funcStore != null
						: !FUNC_STORE_EDEFAULT.equals(funcStore);
			case B3backendPackage.BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS:
				return effectiveConcerns != null && !effectiveConcerns.isEmpty();
			case B3backendPackage.BEXECUTION_CONTEXT__PROGRESS_MONITOR:
				return PROGRESS_MONITOR_EDEFAULT == null
						? progressMonitor != null
						: !PROGRESS_MONITOR_EDEFAULT.equals(progressMonitor);
			case B3backendPackage.BEXECUTION_CONTEXT__INJECTOR:
				return INJECTOR_EDEFAULT == null
						? injector != null
						: !INJECTOR_EDEFAULT.equals(injector);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT:
				setParentContext((BExecutionContext) newValue);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__VALUE_MAP:
				setValueMap((ValueMap) newValue);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__FUNC_STORE:
				setFuncStore((B3FuncStore) newValue);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS:
				getEffectiveConcerns().clear();
				getEffectiveConcerns().addAll((Collection<? extends BConcern>) newValue);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__PROGRESS_MONITOR:
				setProgressMonitor((IProgressMonitor) newValue);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__INJECTOR:
				setInjector((Injector) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.BEXECUTION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT:
				setParentContext((BExecutionContext) null);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__VALUE_MAP:
				setValueMap(VALUE_MAP_EDEFAULT);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__FUNC_STORE:
				setFuncStore(FUNC_STORE_EDEFAULT);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS:
				getEffectiveConcerns().clear();
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__PROGRESS_MONITOR:
				setProgressMonitor(PROGRESS_MONITOR_EDEFAULT);
				return;
			case B3backendPackage.BEXECUTION_CONTEXT__INJECTOR:
				setInjector(INJECTOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Iterator<BConcernContext> getConcernIterator(Object candidate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the first found context that is of the specified class.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public <T> T getContext(Class<T> clazz) throws B3EngineException {
		if(clazz.isInstance(this))
			return clazz.cast(this);
		if(getParentContext() == null)
			throw new B3NoContextException(clazz.getName());
		return getParentContext().getContext(clazz);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Deprecated
	public Type getDeclaredFunctionType(String functionName, Type[] types) throws Throwable {
		B3FuncStore fStore = getEffectiveFuncStore();
		if(fStore == null)
			throw new B3InternalError("Could not find an effective function store - engine/context setup is broken!");
		Throwable lastError = null;
		Throwable lastStaticError = null;
		ATTEMPTS: for(int attempts = 0; attempts < 5; attempts++) {
			switch(attempts) {
				case 0: // fall through
				case 3: // try a call with the parameters as stated
					try {
						return fStore.getDeclaredFunctionType(functionName, types, this);
					}
					catch(B3NoSuchFunctionException e) {
						attempts++; // skip second attempt
						lastError = e;
						continue;
					}
					catch(B3NoSuchFunctionSignatureException e2) {
						lastError = e2;
						continue;
					}
				case 1: // fall through
				case 4: // try a static call
					try {
						if(types.length > 0) {
							B3MetaClass metaClass = B3backendFactory.eINSTANCE.createB3MetaClass();
							metaClass.setInstanceClass(TypeUtils.getRaw(types[0]));
							Type[] newTypes = new Type[types.length + 1];
							System.arraycopy(types, 0, newTypes, 1, types.length);
							newTypes[0] = metaClass;
							return fStore.getDeclaredFunctionType(functionName, newTypes, this);
						}
					}
					catch(B3NoSuchFunctionException e3) {
						lastStaticError = e3;
						continue;
					}
					catch(B3NoSuchFunctionSignatureException e4) {
						lastStaticError = e4;
						continue;
					}
					break;
				case 2: // try loading the method in the java context
					BExecutionContext systemCtx = this.getInvocationContext().getParentContext();
					if(!(systemCtx instanceof BSystemContext))
						throw new B3InternalError(
							"The parent of the invocation context must be an instance of BSystemContext");
					IFunction loaded = null;
					if((loaded = ((BSystemContext) systemCtx).loadMethod(functionName, types)) != null) {
						weaveLoaded(loaded, this);
						continue; // attempt calling the (possibly advised) function
					}
					break ATTEMPTS;
				default:
					throw new B3InternalError(
						"BExecutionContextImpl#getDeclaredFunctionType() - broken call strategy loop :" +
								String.valueOf(attempts));
			}
		}
		// Successful call should have returned result already - only error conditions remain
		if(lastError == null && lastStaticError == null)
			throw new B3InternalError(
				"BExecutionContextImpl#getDeclaredFunctionType() did not return ok, and had no last error");

		throw lastError != null
				? lastError
				: lastStaticError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @throws B3EngineException
	 * @generated NOT
	 */
	public Type getDeclaredValueType(String name) throws B3EngineException {
		return getLValue(name).getDeclaredType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<BConcern> getEffectiveConcerns() {
		if(effectiveConcerns == null) {
			effectiveConcerns = new EObjectResolvingEList<BConcern>(
				BConcern.class, this, B3backendPackage.BEXECUTION_CONTEXT__EFFECTIVE_CONCERNS);
		}
		return effectiveConcerns;
	}

	/**
	 * Returns the first found func store (or null, if none is found). The func store to return is
	 * obtained via {@link #getFuncStore()} thus giving derived classes a chance to override.
	 * 
	 * @return
	 */
	protected B3FuncStore getEffectiveFuncStore() {
		BExecutionContext p = this;
		B3FuncStore fs;

		do {
			if((fs = p.getFuncStore()) != null)
				return fs;
		} while((p = p.getParentContext()) != null);

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public B3FuncStore getFuncStore() {
		return funcStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns an iterator over the effective func store (i.e. it searches up the parent chain
	 * to find the first context that actually has functions defined.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<IFunction> getFunctionIterator() {
		return getEffectiveFuncStore().getFunctionIterator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns an iterator over the effective func store (i.e. it searches up the parent chain
	 * to find the first context that actually has functions defined).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<IFunction> getFunctionIterator(String name) {
		return getEffectiveFuncStore().getFunctionIterator(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Iterator<IFunction> getFunctionIterator(Type type, Class<?> functionType) {
		return getEffectiveFuncStore().getFunctionIterator(type, functionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the first found injector in this or parent context. If the top of the ancestor chain
	 * is reached without finding an injector, an empty injector is created.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Injector getInjector() {
		if(injector != null)
			return injector;
		else if(getParentContext() != null)
			return getParentContext().getInjector();
		// create a null injector...
		setInjector(Guice.createInjector(new Module() {
			public void configure(Binder binder) {
				// no bindings
			}

		}));
		return injector;
	}

	/**
	 * Returns the invocation context from the parent chain of contexts. Throws
	 * B3NoSuchContextException if the invocation context was not found.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BInvocationContext getInvocationContext() throws B3EngineException {
		if(this instanceof BInvocationContext)
			return (BInvocationContext) this;
		if(getParentContext() == null)
			throw new B3NoContextException("InvocationContext");
		return getParentContext().getInvocationContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public LValue getLValue(String name) throws B3EngineException {
		if(!getValueMap().containsKey(name)) {
			BExecutionContext parentContext = null;
			if((parentContext = getParentContext()) == null)
				throw new B3NoSuchVariableException(name);
			return parentContext.getLValue(name);
		}
		return new ValueMapLVal(name);
	}

	public Map<Object, Object> getMapOfThings(Class<?> kind) {
		Map<Object, Object> m;
		if(allThings == null || (m = allThings.get(kind)) == null) {
			return Collections.emptyMap();
		}
		return Collections.unmodifiableMap(m);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BExecutionContext getParentContext() {
		if(parentContext != null && parentContext.eIsProxy()) {
			InternalEObject oldParentContext = (InternalEObject) parentContext;
			parentContext = (BExecutionContext) eResolveProxy(oldParentContext);
			if(parentContext != oldParentContext) {
				if(eNotificationRequired())
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT,
						oldParentContext, parentContext));
			}
		}
		return parentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns a progress monitor set in the context, or if null, the parent context's progress monitor.
	 * If the top most context does not have a progress monitor, a NullProgressMonitor is created and set.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public IProgressMonitor getProgressMonitor() {
		if(progressMonitor != null)
			return progressMonitor;
		else if(getParentContext() != null)
			return getParentContext().getProgressMonitor();
		setProgressMonitor(new NullProgressMonitor());
		return progressMonitor;
	}

	/**
	 * @generated NOT
	 *            BuildUnit u = ctx.getBuildUnitStore().get(BuildUnitProxyAdapterFactory.eINSTANCE.adapt(unit).getIface());
	 */
	public <T> T getSomeThing(Class<T> clazz, Object key) {
		T result = null;
		ParentContextIterator pitor = new ParentContextIterator(this);
		while(pitor.hasNext()) {
			BExecutionContextImpl ctx = (BExecutionContextImpl) pitor.next();
			if((result = getThingFromMap(clazz, key, ctx.allThings)) != null)
				return result;
		}
		return null; // TODO: Should probably throw "NoSuchUnit" instead
	}

	private <T> T getThingFromMap(Class<T> clazz, Object key, Map<Class<?>, Map<Object, Object>> allMap) {
		if(allMap == null)
			return null;
		Map<Object, Object> map = allMap.get(clazz);
		Object result = map.get(key);
		return result == null
				? null
				: clazz.cast(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Looks up the value in the value map obtained by calling {@link #getValueMap()} (which derived classes
	 * may override).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object getValue(String name) throws B3EngineException {
		try {
			return getValueMap().get(name);
		}
		catch(B3NoSuchVariableException e) {
			BExecutionContext parentContext = null;
			if((parentContext = getParentContext()) == null)
				throw e;
			return parentContext.getValue(name);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueMap getValueMap() {
		return valueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isFinal(String name) {
		boolean result = getValueMap().isFinal(name);
		if(result)
			return result;
		if(getParentContext() != null)
			return getParentContext().isFinal(name);
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isImmutable(String name) {
		boolean result = getValueMap().isImmutable(name);
		if(result)
			return result;
		if(getParentContext() != null)
			return getParentContext().isImmutable(name);
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This, default implementation returns false.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isPropertyScope() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Loads a single method as a function. The method may be static.
	 * If the method is not public, null is returned, and a function was not defined.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public BJavaFunction loadFunction(Method m) throws B3EngineException {
		createFuncStore();

		BJavaFunction javaFunction = JavaToB3Helper.createJavaFunction(m, BJavaCallType.METHOD);
		if(javaFunction != null)
			funcStore.defineFunction(javaFunction.getName(), javaFunction);

		return javaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Loads static functions from a java class. Using B3Backend annotations to
	 * direct the translation into B3 functions.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void loadFunctions(Class<? extends Object> clazz) throws B3EngineException {
		createFuncStore();
		for(Map.Entry<IFunction, String> entry : JavaToB3Helper.loadFunctions(clazz).entries())
			funcStore.defineFunction(entry.getValue(), entry.getKey());
	}

	/**
	 * Prints this stck.
	 * 
	 * @generated NOT
	 */
	public void printStack() {
		printStackOnStream(this, System.err);
	}

	/**
	 * Prints trace of this stack and all parent stacks.
	 * 
	 * @generated NOT
	 */
	public void printStackTrace() {
		for(BExecutionContext ctx = this; ctx != null; ctx = ctx.getParentContext())
			printStackOnStream(ctx, System.err);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFuncStore(B3FuncStore newFuncStore) {
		B3FuncStore oldFuncStore = funcStore;
		funcStore = newFuncStore;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BEXECUTION_CONTEXT__FUNC_STORE, oldFuncStore, funcStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInjector(Injector newInjector) {
		Injector oldInjector = injector;
		injector = newInjector;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BEXECUTION_CONTEXT__INJECTOR, oldInjector, injector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentContext(BExecutionContext newParentContext) {
		BExecutionContext oldParentContext = parentContext;
		parentContext = newParentContext;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BEXECUTION_CONTEXT__PARENT_CONTEXT, oldParentContext,
				parentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProgressMonitor(IProgressMonitor newProgressMonitor) {
		IProgressMonitor oldProgressMonitor = progressMonitor;
		progressMonitor = newProgressMonitor;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BEXECUTION_CONTEXT__PROGRESS_MONITOR, oldProgressMonitor,
				progressMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueMap(ValueMap newValueMap) {
		ValueMap oldValueMap = valueMap;
		valueMap = newValueMap;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, B3backendPackage.BEXECUTION_CONTEXT__VALUE_MAP, oldValueMap, valueMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valueMap: ");
		result.append(valueMap);
		result.append(", funcStore: ");
		result.append(funcStore);
		result.append(", progressMonitor: ");
		result.append(progressMonitor);
		result.append(", injector: ");
		result.append(injector);
		result.append(')');
		return result.toString();
	}

	private void weaveLoaded(IFunction f, BExecutionContext ctx) throws B3WeavingFailedException {
		if(ctx == null)
			return;
		B3FuncStore fs = ctx.getFuncStore();
		if(fs != null)
			try {
				fs.updateCache(f.getName());
			}
			catch(B3EngineException e1) {
				throw new B3WeavingFailedException(e1);
			}
		weaveLoaded(f, ctx.getParentContext());
		for(BConcern c : ctx.getEffectiveConcerns()) {
			boolean savedWeaving = isWeaving;
			try {
				isWeaving = true;
				c.evaluateIfMatching(f, ctx);
			}
			catch(Throwable e) {
				throw new B3WeavingFailedException(e);
			}
			finally {
				isWeaving = savedWeaving;
			}
		}

	}
} // BExecutionContextImpl
