package org.eclipse.b3.validation;

import java.util.List;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.build.build.PathVector;
import org.eclipse.b3.build.core.PathIterator;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.xtext.validation.Check;
 
public class BeeLangJavaValidator extends AbstractBeeLangJavaValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = super.getEPackages();
        result.add(B3backendPackage.eINSTANCE);
        result.add(B3BuildPackage.eINSTANCE);
        return result;

	}

	@Check
	public void checkWithClauseIsNotEmpty(BWithExpression withClause) {
		if (withClause.getReferencedAdvice().size() == 0 
				&& withClause.getConcerns().size() == 0
				&& withClause.getPropertySets().size() == 0
				) {
			error("with-clause must have at least one of: references, properties, or concern",
					withClause,
					B3backendPackage.BWITH_EXPRESSION);
		}
	}
	@Check
	public void checkBuilderMustReturnSomething(Builder builder) {
		if (builder.getOutput() == null 
				&& builder.getInput() == null
				&& builder.getSource() == null
				&& builder.getFuncExpr() == null 
				) {
			error("A builder must have one of: input, source, output or expression returning BuildResult.",
					builder,
					B3BuildPackage.BUILDER__NAME);
		}
	}
	
	/**
	 * A proceed expression can only occur in expressions that are going to be used for weaving.
	 * These are specified in a BFunctionConcernContext, or a BuilderConcernContext.
	 */
	@Check
	public void checkBProceedExpression(BProceedExpression proceed){
		EObject container = proceed.eContainer();
		while(container != null) {
			if(container instanceof BFunctionConcernContext || container instanceof BuilderConcernContext)
				return; // ok
			container = container.eContainer();
		}
		error("A proceed expression can only appear inside a function or builder context in a concern",
				proceed,
				B3backendPackage.BPROCEED_EXPRESSION);
	}
	/**
	 * Validate that the entered parameter pattern is compilable.
	 * @param fcc
	 */
	@Check
	public void checkFunctionConcernContext(BFunctionConcernContext fcc) {
		try {
		TypePattern.compile(fcc.getParameters());
		} catch(Throwable t) {
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
				
		} catch(Throwable t) {
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
		} catch(Throwable t) {
			error(t.getMessage(), pathVector, B3BuildPackage.PATH_VECTOR);
		}	
	}
	@Check
	public void checkUnreachableCase(BCase caseExpr) {
		BExpression condExpr = caseExpr.getConditionExpr();
		if(! (condExpr == null || condExpr instanceof BLiteralAny))
			return;
		// a null case or a case with a Literal Any requires that the case is placed last!
		EObject container = caseExpr.eContainer();
		if(container instanceof BSwitchExpression) {
			EList<BCase> cl = ((BSwitchExpression)container).getCaseList();
			int idx = cl.indexOf(caseExpr);
			if(idx != cl.size()-1)
				error("A default case must be placed last in a list of cases", caseExpr,
						// TODO: THIS IS NOT RIGHT - BUT ERROR MARKER APPEARS ON WRONG LINE WHEN THE condExpr == null
						B3backendPackage.BCASE__THEN_EXPR);

		}
	}
}
