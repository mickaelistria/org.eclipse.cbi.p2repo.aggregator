package org.eclipse.b3.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.b3.backend.core.TypePattern;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BCase;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralAny;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BSwitchExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.BeeModel;
import org.eclipse.b3.build.build.BuildUnit;
import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.build.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.b3.build.build.RepoOption;
import org.eclipse.b3.build.build.Repository;
import org.eclipse.b3.build.build.RepositoryUnitProvider;
import org.eclipse.b3.build.core.PathIterator;
import org.eclipse.b3.build.core.RepositoryValidation;
import org.eclipse.b3.build.repository.IRepositoryValidator;
import org.eclipse.b3.build.repository.IRepositoryValidator.IOption;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

public class BeeLangJavaValidator extends AbstractBeeLangJavaValidator {

	// TODO: make an interface out of the fixable issue codes
	//
	public static final String ISSUE_REPOSITORY__NO_CONNECTION = "No Connection URI";

	public static final String ISSUE_REPO_OPTION__INVALID_OPTION = "Invalid Option";

	public static final String ISSUE_BUILD_UNIT__MULTIPLE_RESOLUTIONS = "Multiple resolutions";

	public static final String ISSUE_BEEMODEL__MULTIPLE_RESOLUTIONS = "Multiple resolutions";

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
		if(repoHandler.getAddress() == null) {
			error(
				"The repository must have a declared address as 'address = \"URIorRepoSpecificAddress\"", repoHandler,
				B3BuildPackage.REPOSITORY__HANDLER_TYPE, ISSUE_REPOSITORY__NO_CONNECTION);
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
		BExpression condExpr = caseExpr.getConditionExpr();
		if(!(condExpr == null || condExpr instanceof BLiteralAny))
			return;
		// a null case or a case with a Literal Any requires that the case is placed last!
		EObject container = caseExpr.eContainer();
		if(container instanceof BSwitchExpression) {
			EList<BCase> cl = ((BSwitchExpression) container).getCaseList();
			int idx = cl.indexOf(caseExpr);
			if(idx != cl.size() - 1)
				error("A default case must be placed last in a list of cases", caseExpr,
				// TODO: THIS IS NOT RIGHT - BUT ERROR MARKER APPEARS ON WRONG LINE WHEN THE condExpr == null
				B3backendPackage.BCASE__THEN_EXPR);

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
