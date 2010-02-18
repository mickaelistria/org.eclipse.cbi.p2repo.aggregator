package org.eclipse.b3.validation;

import java.util.List;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.backend.core.TypePattern;
import org.eclipse.b3.backend.evaluator.b3backend.B3JavaImport;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
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
				&& (builder.getFuncExpr() == null )
				) {
			error("a builder must have at least one of: input, output or expression",
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
}
