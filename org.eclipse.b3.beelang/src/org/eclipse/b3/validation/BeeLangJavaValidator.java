package org.eclipse.b3.validation;

import java.util.List;

import org.eclipse.b3.build.build.B3BuildPackage;
import org.eclipse.b3.build.build.Builder;
import org.eclipse.b3.build.build.BuilderConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.b3.backend.evaluator.b3backend.BFunctionConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BProceedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.xtext.validation.Check;
//import org.eclipse.equinox.internal.provisional.p2.core.Version;
//import org.eclipse.equinox.internal.provisional.p2.core.VersionRange;
 

//@SuppressWarnings("restriction")
public class BeeLangJavaValidator extends AbstractBeeLangJavaValidator {
	
@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = super.getEPackages();
        result.add(B3backendPackage.eINSTANCE);
        result.add(B3BuildPackage.eINSTANCE);
        return result;

	}
//	@Check
//	public void checkFunctionDeclaredWithFunctionKeyword(Function func) {
//		if (func.getFunc().getForm().equals("method")) {
//			error("Methods can only be defined in a unit, or a context", func.getFunc(), BeeLangPackage.FUNCTION_OR_METHOD__FORM);
//		}
//	}
//	@Check
//	public void checkMethodDeclaredWithMethodKeyword(Method func) {
//		if (func.getMethod().getForm().equals("function")) {
//			error("Functions can only be defined in global scope, or in a concern",
//					func.getMethod(),
//					BeeLangPackage.FUNCTION_OR_METHOD__FORM);
//		}
//	}
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
//	@Check
//	public void checkVersion(org.eclipse.b3.beeLang.Version version) {
//		String versionString = version.getOriginal();
//		try {
//		Version.create(versionString);
//		}
//		catch(IllegalArgumentException e)
//			{
//			error("Version '"+versionString+"' is not a valid version: "+e.getMessage(),
//					version,
//					BeeLangPackage.VERSION__ORIGINAL);
//		}
//	}
//	@Check
//	public void checkVersionRange(org.eclipse.b3.beeLang.VersionRange versionRange) {
//		String versionString = versionRange.getOriginal();
//		
////
////		String versionString = versionRange.getMinLimit() +
////			versionRange.getMin().getOriginal() + "," + versionRange.getMax().getOriginal() + 
////			versionRange.getMaxLimit();
//		try {
//		new VersionRange(versionString);
//		}
//		catch(IllegalArgumentException e)
//			{
//			error("VersionRange '"+versionString+"' is not a valid range: "+e.getMessage(),
//					versionRange,
//					BeeLangPackage.VERSION_RANGE);
//		}
//	}
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
}
