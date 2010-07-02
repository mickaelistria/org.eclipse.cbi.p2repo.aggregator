package org.eclipse.b3.validation;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.core.B3AmbiguousFunctionSignatureException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionException;
import org.eclipse.b3.backend.core.B3NoSuchFunctionSignatureException;
import org.eclipse.b3.backend.core.TypePattern;
import org.eclipse.b3.backend.evaluator.PojoFeatureLValue;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCallFeature;
import org.eclipse.b3.backend.evaluator.b3backend.BCreateExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFeatureExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.backend.inference.FunctionUtils;
import org.eclipse.b3.backend.inference.ITypeProvider;
import org.eclipse.b3.backend.inference.InferenceException;
import org.eclipse.b3.backend.inference.InferenceExceptions;
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
import org.eclipse.b3.evaluator.B3BuildTypeProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class BeeLangJavaValidator extends AbstractBeeLangJavaValidator implements IBeeLangDiagnostic {

	@Inject
	private Injector injector;

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
		FunctionUtils funcUtils = injector.getInstance(FunctionUtils.class);
		ITypeProvider typer = injector.getInstance(ITypeProvider.class);

		BExpression lhs = cexpr.getFuncExpr();
		String name = cexpr.getName();
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
		Type[] tparameters = null;
		try {
			tparameters = funcUtils.asTypeArray(cexpr, true);
			tparameters[0] = type;
		}
		catch(InferenceExceptions e) {
			// mark all erroneous parameters
			for(InferenceException e2 : e.getExceptions())
				error("The type of the parameter is not known or inferable.", e2.getSource(), e2.getFeature());
			return; // not meaningful to continue
		}

		try {
			List<IFunction> effective = funcUtils.findEffectiveFunctions(cexpr, name, type);
			// used for side effect of exceptions
			funcUtils.selectFunction(name, effective, tparameters);
		}
		catch(B3NoSuchFunctionSignatureException e) {
			error(
				"No function matching used parameter types found.", cexpr,
				B3backendPackage.BCALL_FEATURE__PARAMETER_LIST);
		}
		catch(B3NoSuchFunctionException e) {
			error("Function name not found.", cexpr, B3backendPackage.BCALL_FEATURE__NAME);
		}
		catch(B3AmbiguousFunctionSignatureException e) {
			error("Used parameter types leads to ambiguous call", cexpr, B3backendPackage.BCALL_FEATURE__PARAMETER_LIST);
		}
	}

	@Check
	public void checkFeatureExists(BFeatureExpression fexpr) {
		EObject objE = fexpr.getObjExpr();

		// TODO: Ugly, it expects to find "special engine var 'this'" in runtime == a created instance
		// when the object expression is null.
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
