package org.eclipse.b3.scoping;

import java.lang.reflect.Type;
import java.util.ArrayList;

import org.eclipse.b3.backend.evaluator.b3backend.B3FunctionType;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3ParameterizedType;
import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BVariableExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.build.AliasedRequiredCapability;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BuildCallOnReferencedRequirement;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.IRequiredCapabilityContainer;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RepositoryUnitProvider;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.engine.B3BuildEngineResource;
import org.eclipse.b3.build.engine.B3ExtensionLoader;
import org.eclipse.b3.build.evaluator.B3BuildFuncScopeProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.inject.Inject;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it
 * 
 */
public class BeeLangScopeProvider extends AbstractDeclarativeScopeProvider {
	// IScope scope_B3ParameterizedType_rawType(B3ParameterizedType ctx, EReference ref) {

	@Inject
	private B3ExtensionLoader b3ExtensionLoader;

	/**
	 * Find reference to advice in containing BuildUnit, or in the BeeModel.
	 * 
	 * @param ctx
	 * @param ref
	 * @return
	 */
	IScope scope_BAdvice(BWithExpression ctx, EReference ref) {
		EList<EObject> x = ctx.eResource().getContents();
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for(EObject y : x) {
			if(y instanceof BeeModel) {
				BeeModel model = ((BeeModel) y);
				for(BConcern concern : model.getConcerns())
					result.add(new EObjectDescription(concern.getName(), concern, null));
				// BuildUnit bu = model.getBody();
				// if(bu != null)
				// for(BConcern concern : bu.getConcerns())
				// result.add(new EObjectDescription(concern.getName(),concern, null));
			}
		}
		for(EObject c = ctx.eContainer(); c != null; c = c.eContainer())
			if(c instanceof BuildUnit) {
				for(BConcern concern : ((BuildUnit) c).getConcerns())
					result.add(new EObjectDescription(concern.getName(), concern, null));
			}

		return new SimpleScope(result);
	}

	IScope scope_IFunction(BExpression ctx, EReference ref) {
		// TODO: Inject the BuildFuncScopeProvider
		IScope scope = new B3BuildFuncScopeProvider().doGetFuncScope(ctx);
		return scope == null
				? SimpleScope.NULLSCOPE
				: scope;
	}

	IScope scope_INamedValue(BVariableExpression ctx, EReference ref) {
		IScope scope = new DeclarativeVarScopeProvider().doGetVarScope(ctx);
		return scope == null
				? SimpleScope.NULLSCOPE
				: scope;
	}

	IScope scope_IType(B3FunctionType ctx, EReference ref) {
		return internalJavaImportsScope(ctx, null);
	}

	IScope scope_IType(B3ParameterizedType ctx, EReference ref) {
		// if(ctx.eContainer() instanceof BuildUnit && ctx.eContainingFeature().getName().equals("implements"))
		// return internalJavaImportsScope(ctx, BuildUnit.class);
		return internalJavaImportsScope(ctx, null);
	}

	IScope scope_Repository(RepositoryUnitProvider ctx, EReference ref) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for(EObject c = ctx.eContainer(); c != null; c = c.eContainer())
			if(c instanceof BuildUnit) {
				for(Repository repo : ((BuildUnit) c).getRepositories())
					result.add(new EObjectDescription(repo.getName(), repo, null));
			}
			else if(c instanceof BeeModel) {
				for(Repository repo : ((BeeModel) c).getRepositories())
					result.add(new EObjectDescription(repo.getName(), repo, null));
			}

		return new SimpleScope(result);

	}

	/**
	 * Finds aliased required capabilities in a containing element.
	 * 1. scope_BuildCallOnReferencedRequirement_requiredCapabilityReference
	 * 2. scope_RequiredCapability
	 * 
	 * @param ctx
	 * @param ref
	 * @return
	 */
	IScope scope_RequiredCapability(BuildCallOnReferencedRequirement ctx, EReference ref) {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		EObject container = ctx.eContainer();
		while(container != null) {
			if(container instanceof IRequiredCapabilityContainer) {
				for(RequiredCapability rc : ((IRequiredCapabilityContainer) container).getRequiredCapabilities())
					if(rc instanceof AliasedRequiredCapability) {
						String name = ((AliasedRequiredCapability) rc).getAlias();
						if(name != null)
							result.add(new EObjectDescription(name, rc, null));
					}
			}
			container = container.eContainer();
		}
		if(result.isEmpty())
			return IScope.NULLSCOPE;
		return new SimpleScope(result);
	}

	@SuppressWarnings("unchecked")
	private boolean acceptThisImport(B3JavaImport candidate, Class<?> root) {
		if(root == null || root.isAssignableFrom(candidate.getClass()))
			return true;
		return false;
	}

	private B3BuildEngineResource getDefaultResource(EObject o) {
		ResourceSet rs = o.eResource().getResourceSet();

		URI uri = URI.createURI(B3BuildConstants.B3ENGINE_MODEL_URI);
		return (B3BuildEngineResource) rs.getResource(uri, true);

	}

	private IScope internalJavaImportsScope(EObject e, Class<?> root) {
		EList<EObject> x = e.eResource().getContents();
		// create an Iterable of IEObjectDescription - instances of EObjectDescription
		//
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for(EObject y : x) {
			if(y instanceof BeeModel) {
				for(Type t : ((BeeModel) y).getImports())
					if(t instanceof B3JavaImport && acceptThisImport((B3JavaImport) t, root))
						result.add(new EObjectDescription(((B3JavaImport) t).getName(), (B3JavaImport) t, null));
			}
		}
		B3BuildEngineResource r = getDefaultResource(e);
		for(EObject t : r.getContents())
			if(t instanceof B3JavaImport && acceptThisImport((B3JavaImport) t, root))
				result.add(new EObjectDescription(((B3JavaImport) t).getName(), t, null));

		// // pick up types from all loaded
		// for(BeeModel m : b3ExtensionLoader.getModelsByKey(
		// e.eResource().getResourceSet(), B3ExtensionLoader.B3EXTENSION__USE_EXPORT))
		// for(Type t : m.getImports())
		// if(t instanceof B3JavaImport)
		// result.add(new EObjectDescription(((B3JavaImport) t).getName(), (B3JavaImport) t, null));

		return new SimpleScope(result);

	}

}
