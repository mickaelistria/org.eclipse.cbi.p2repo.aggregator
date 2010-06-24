package org.eclipse.b3.validation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.core.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.core.JavaToB3Helper;
import org.eclipse.b3.backend.core.TypePattern;
import org.eclipse.b3.backend.evaluator.PojoFeatureLValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFeature;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BParameter;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.b3backend.impl.FunctionCandidateAdapterFactory;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.B3BuildPackage;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.Branch;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.Builder;
import org.eclipse.b3.build.BuilderConcernContext;
import org.eclipse.b3.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.PathVector;
import org.eclipse.b3.build.RepoOption;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.build.RepositoryUnitProvider;
import org.eclipse.b3.build.core.PathIterator;
import org.eclipse.b3.build.core.RepositoryValidation;
import org.eclipse.b3.build.repository.IRepositoryValidator;
import org.eclipse.b3.build.repository.IRepositoryValidator.IOption;
import org.eclipse.b3.scoping.DeclarativeFuncScopeProvider;
import org.eclipse.b3.typeinference.B3BuildTypeProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.validation.Check;

public class BeeLangJavaValidator extends AbstractBeeLangJavaValidator implements IBeeLangDiagnostic {

	@Check
	public void checkBeeModel(BeeModel beeModel) {
		// mark all but the first repository as being in error.
		int count = 0;
		for(FirstFoundUnitProvider provider : beeModel.getProviders()) {
			count++;
			if(count > 1)
				error(
					"A build unit may only have one 'resolution' declaration.", provider,
					B3BuildPackage.BEE_MODEL__PROVIDERS, ISSUE_BEEMODEL__MULTIPLE_RESOLUTIONS);
		}
	}

	/**
	 * A proceed expression can only occur in expressions that are going to be used for weaving.
	 * These are specified in a BFunctionConcernContext, or a BuilderConcernContext.
	 */
	@Check
	public void checkBProceedExpression(BProceedExpression proceed) {
		EObject container = proceed.eContainer();
		while(container != null) {
			if(container instanceof BFunctionConcernContext || container instanceof BuilderConcernContext)
				return; // ok
			container = container.eContainer();
		}
		error(
			"A proceed expression can only appear inside a function or builder context in a concern", proceed,
			B3backendPackage.BPROCEED_EXPRESSION);
	}

	@Check
	public void checkBranch(Branch branch) {
		// If branchpoint type is timestamp
		// If branchpoint type is other
	}

	@Check
	public void checkBuilderMustReturnSomething(Builder builder) {
		if(builder.getOutput() == null && builder.getInput() == null && builder.getSource() == null &&
				builder.getFuncExpr() == null) {
			error(
				"A builder must have one of: input, source, output or expression returning BuildResult.", builder,
				B3BuildPackage.BUILDER__NAME);
		}
	}

	@Check
	public void checkBuildUnit(BuildUnit buildUnit) {
		// mark all but the first repository as being in error.
		int count = 0;
		for(FirstFoundUnitProvider provider : buildUnit.getProviders()) {
			count++;
			if(count > 1)
				error(
					"A build unit may only have one 'resolution' declaration.", provider,
					B3BuildPackage.BUILD_UNIT__PROVIDERS, ISSUE_BUILD_UNIT__MULTIPLE_RESOLUTIONS);
		}
	}

	@Check
	void checkFeatureCallCanBeMade(BCallFeature cexpr) {
		BExpression lhs = cexpr.getFuncExpr();
		String name = cexpr.getName();
		B3BuildTypeProvider typer = new B3BuildTypeProvider();
		Type type = typer.doGetInferredType(lhs);
		if(type == null) {
			error(
				"The type of the expression is not known or inferable.", cexpr,
				B3backendPackage.BCALL_FEATURE__FUNC_EXPR);
			return;
		}
		if(name == null || name.length() < 1) {
			error("The name of the operation is null or empty.", cexpr, B3backendPackage.BCALL_FEATURE__NAME);
			return;
		}

		// figure out the types of the parameters
		EList<BParameter> pList = cexpr.getParameterList().getParameters();

		// search for a function
		int nbrParams = pList.size() + 1;
		Type[] tparameters = new Type[nbrParams];
		int counter = 0;
		// first parameter always have its actual type when making the call, but needs
		// to be declared to have a type where the operation is available
		tparameters[counter++] = type; // the type(lhs)
		boolean failed = false;
		for(BParameter p : pList) {
			tparameters[counter] = typer.doGetInferredType(p);
			if(tparameters[counter] == null) {
				error("The type of the parameter is not known or inferable.", p, B3backendPackage.BPARAMETER__EXPR);
				failed = true;
			}
			counter++;
		}
		if(failed)
			return; // not meaningful to continue after reporting about missing types of parameters

		// is there a function or feature that provides the signature?
		// find matching function candidates...
		DeclarativeFuncScopeProvider funcScopeProvider = new DeclarativeFuncScopeProvider();
		IScope funcScope = funcScopeProvider.doGetFuncScope(cexpr);
		List<IFunction> effective = new ArrayList<IFunction>();
		for(IEObjectDescription e : funcScope.getAllContents()) {
			if(!(name.equals(e.getName()) && e.getEObjectOrProxy() instanceof IFunction))
				continue;
			IFunction f = (IFunction) e.getEObjectOrProxy();
			OVERLOADED: {
				for(IFunction f1 : effective) {
					if(TypeUtils.hasEqualSignature(f1, f))
						break OVERLOADED;
				}
				effective.add(f);
			}
		}
		// find matching java methods, skip already overloaded
		for(IFunction f : JavaToB3Helper.getNamedFunctions(TypeUtils.getRaw(type), name)) {
			OVERLOADED: {
				for(IFunction f1 : effective) {
					if(TypeUtils.hasEqualSignature(f1, f))
						break OVERLOADED;
				}
				effective.add(f);
			}

		}

		// HOWTO: FIND MATCH
		try {
			if(effective.size() < 1) {
				throw new B3NoSuchFunctionException(name);
			}
			LinkedList<FunctionCandidateAdapterFactory.IFunctionCandidateAdapter> candidateFunctions = TypeUtils.Candidate.findMostSpecificApplicableCandidates(
				tparameters, new TypeUtils.GuardedFunctionCandidateSource(effective));

			switch(candidateFunctions.size()) {
				case 0: // no candidate function found
					throw new B3NoSuchFunctionSignatureException(name, tparameters, effective);
				case 1: // one candidate function found == HAPPY
						// return candidateFunctions.getFirst().getTarget();
					break;
				default: // more than one candidate function found (the function call is ambiguous)
					throw new B3AmbiguousFunctionSignatureException(name, tparameters);
			}
		}

		// find matching methods (static, non static)
		catch(B3NoSuchFunctionSignatureException e) {
			error(
				"No function matching used parameter types found.", cexpr,
				B3backendPackage.BCALL_FEATURE__PARAMETER_LIST);
		}
		catch(B3NoSuchFunctionException e) {
			error("Function name not found.", cexpr, B3backendPackage.BCALL_FEATURE__NAME);
		}
		catch(B3AmbiguousFunctionSignatureException e) {
			error("Used parameters leads to ambiguous call", cexpr, B3backendPackage.BCALL_FEATURE__PARAMETER_LIST);
		}
	}

	@Check
	public void checkFeatureExists(BFeatureExpression fexpr) {
		EObject objE = fexpr.getObjExpr();

		// TODO: Ugly, it expects to find "special engine var 'this'" in runtime == a created instance
		if(objE == null) {
			EObject container = fexpr;
			while(container.eContainer() != null && !(container instanceof BCreateExpression))
				container = container.eContainer();
			objE = container;
		}
		String fname = fexpr.getFeatureName();
		B3BuildTypeProvider typer = new B3BuildTypeProvider();
		Type type = typer.doGetInferredType(objE);

		PojoFeatureLValue resultingLValue = new PojoFeatureLValue(TypeUtils.getRaw(type), fname);

		if(!resultingLValue.isGetable()) {
			error(
				"The feature '" + fname + "' is not a feature found in type '" + type + "'.", fexpr,
				B3backendPackage.BFEATURE_EXPRESSION__FEATURE_NAME);
		}
	}

	/**
	 * Validate that the entered parameter pattern is compilable.
	 * 
	 * @param fcc
	 */
	@Check
	public void checkFunctionConcernContext(BFunctionConcernContext fcc) {
		try {
			TypePattern.compile(fcc.getParameters());
		}
		catch(Throwable t) {
			error(t.getMessage(), fcc, B3backendPackage.BFUNCTION_CONCERN_CONTEXT__PARAMETERS);
		}
	}

	/**
	 * Validate that import references a class that can be loaded.
	 */
	@Check
	public void checkImportability(B3JavaImport jimport) {
		try {
			if(jimport.getType() == null)
				error("Could not import type", jimport, B3backendPackage.B3_JAVA_IMPORT__QUALIFIED_NAME);

		}
		catch(Throwable t) {
			error(t.getMessage(), jimport, B3backendPackage.B3_JAVA_IMPORT__QUALIFIED_NAME);
		}
	}

	/**
	 * Validate that path vectors are consistent
	 */
	@Check
	public void checkPathVector(PathVector pathVector) {
		try {
			PathIterator pvItor = new PathIterator(pathVector);
			while(pvItor.hasNext())
				pvItor.next();
		}
		catch(Throwable t) {
			error(t.getMessage(), pathVector, B3BuildPackage.PATH_VECTOR);
		}
	}

	/**
	 * Produce warnings:
	 * - if a repository handler name is unknown to the configuration.
	 * - if a repository option is for an unknown repository type
	 * Produces errors:
	 * - the remote URI of a repository is not set
	 * - the option is not valid for the repository
	 * 
	 * @param repoHandler
	 */
	@Check
	public void checkRepository(Repository repoHandler) {
		if(!RepositoryValidation.isNameRegistered(repoHandler.getHandlerType()))
			warning("The repository type '" + repoHandler.getHandlerType() +
					"' is unknown to the b3 editing environment.", repoHandler, B3BuildPackage.REPOSITORY__HANDLER_TYPE);
		// TODO: currently all repoHandlers require an address, but there could be those that do not, make it optional
		if(repoHandler.getAddress() == null) {
			error(
				"The repository must have a 'connection'", repoHandler, B3BuildPackage.REPOSITORY__HANDLER_TYPE,
				ISSUE_REPOSITORY__NO_CONNECTION);
		}
	}

	@Check
	public void checkRepositoryOption(RepoOption option) {
		EObject container = option.eContainer();
		if(container instanceof Repository) {
			Repository repo = (Repository) container;
			IRepositoryValidator validator = RepositoryValidation.getValidator(repo.getHandlerType());
			if(validator == null) {
				warning(
					"Unable to validate option for unknown repository type  '" + repo.getHandlerType(), option,
					B3BuildPackage.REPO_OPTION__NAME);
			}
			else {
				Map<String, IOption<Repository>> optionData = validator.getRepositoryOptions();
				IOption<Repository> opt = optionData.get(option.getName());
				if(opt == null)
					error(
						"The option '" + option.getName() + "' is not a valid option for repository type '" +
								repo.getHandlerType() + "'.", option, B3BuildPackage.REPO_OPTION__NAME,
						ISSUE_REPO_OPTION__INVALID_OPTION);
				else {
					// TODO: check type compatibility (complicated)
				}
			}
		}
		else if(container instanceof RepositoryUnitProvider) {
			RepositoryUnitProvider provider = (RepositoryUnitProvider) container;
			Repository repo = provider.getRepository();
			IRepositoryValidator validator = repo != null
					? RepositoryValidation.getValidator(repo.getHandlerType())
					: null;
			if(validator == null) {
				warning(
					"Unable to validate option for unknown repository type  '" + repo.getHandlerType(), option,
					B3BuildPackage.REPO_OPTION__NAME);
			}
			else {
				Map<String, IOption<RepositoryUnitProvider>> optionData = validator.getResolverOptions();
				IOption<RepositoryUnitProvider> opt = optionData.get(option.getName());
				if(opt == null)
					error(
						"The option '" + option.getName() +
								"' is not a valid option for a resolver using a repository of type '" +
								repo.getHandlerType() + "'.", option, B3BuildPackage.REPO_OPTION__NAME,
						ISSUE_REPO_OPTION__INVALID_OPTION);
				else {
					// TODO: check type compatibility (complicated)
				}
			}

		}
	}

	@Check
	public void checkUnreachableCase(BCase caseExpr) {
		// BExpression condExpr = caseExpr.getConditionExpr();
		// if(!(condExpr == null || condExpr instanceof BLiteralAny))
		// return;
		// // a null case or a case with a Literal Any requires that the case is placed last!
		// EObject container = caseExpr.eContainer();
		// if(container instanceof BSwitchExpression) {
		// EList<BCase> cl = ((BSwitchExpression) container).getCaseList();
		// int idx = cl.indexOf(caseExpr);
		// if(idx != cl.size() - 1)
		// error("A default case must be placed last in a list of cases", caseExpr,
		// // TODO: THIS IS NOT RIGHT - BUT ERROR MARKER APPEARS ON WRONG LINE WHEN THE condExpr == null
		// B3backendPackage.BCASE__THEN_EXPR);
		//
		// }
	}

	@Check
	public void checkWithClauseIsNotEmpty(BWithExpression withClause) {
		if(withClause.getReferencedAdvice().size() == 0 && withClause.getConcerns().size() == 0 &&
				withClause.getPropertySets().size() == 0) {
			error(
				"with-clause must have at least one of: references, properties, or concern", withClause,
				B3backendPackage.BWITH_EXPRESSION);
		}
	}

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = super.getEPackages();
		result.add(B3backendPackage.eINSTANCE);
		result.add(B3BuildPackage.eINSTANCE);
		return result;

	}
}
