/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.evaluator;


/**
 * Builder Weaving
 * 
 */
public class BuilderxWeaver extends Weaver {
	// @Inject
	// private IB3Evaluator evaluator;
	//
	// /**
	// * Performs the same operation as evaluate but for a single object (candidate).
	// */
	// public boolean evaluateIfMatching(BuilderConcernContext o, Object candidate, BExecutionContext ctx)
	// throws Throwable {
	// return evaluateIfMatching(o, candidate, ctx, null);
	// }
	//
	// /**
	// * Performs the same operation as evaluate but for a single object (candidate), and
	// * with resulting wrapped builders being promoted to promoteToUnit (if set).
	// *
	// */
	// public boolean evaluateIfMatching(BuilderConcernContext o, Object candidate, BExecutionContext ctx,
	// BuildUnit promoteToUnit) throws Throwable {
	// TypePattern pattern = TypePattern.compile(o.getParameters());
	// if(candidate instanceof IBuilder && matchesQuery(o, (IBuilder) candidate, ctx))
	// return weaveIfParametersMatch(o, pattern, (IBuilder) candidate, ctx, null); // do not promote
	// return false;
	// }
	//
	// /**
	// * Returns true if the candidate object matches the query and parameter type pattern.
	// */
	// public boolean matches(BuilderConcernContext o, Object candidate, BExecutionContext ctx) {
	// if(!(candidate instanceof IBuilder))
	// return false;
	// IBuilder b = (IBuilder) candidate;
	// try {
	// if(o.isMatchParameters()) {
	// TypePattern pattern = TypePattern.compile(o.getParameters());
	// Matcher matcher = pattern.match(b.getParameterTypes());
	// if(!matcher.isMatch())
	// return false;
	//
	// }
	// return matchesQuery(o, b, ctx);
	//
	// }
	// catch(Throwable e) {
	// throw new B3InternalError("Error while evaluating if BuilderConcernContext matches a Builder", e);
	// }
	// }
	//
	// /**
	// * Evaluates the query and returns true, if the candidate matches the query. This method does not include
	// * parameter type matching.
	// *
	// * @param candidate
	// * @param ctx
	// * @return
	// * @throws Throwable
	// */
	// public boolean matchesQuery(BuilderConcernContext o, IBuilder candidate, BExecutionContext ctx) throws Throwable {
	// BExecutionContext ictx = ctx.createInnerContext();
	// ictx.defineVariableValue("@test", candidate, Builder.class);
	// return evaluator.doEvaluate(o.getQuery(), ictx) == Boolean.TRUE;
	// }
	//
	// /**
	// * Performs parameter type matching and if parameters match, a wrapper is created and added to the context.
	// *
	// * NOTE: the wrapper may have different parameter names than the original, and may only see a few of them. It may
	// * however need to modify the first parameter (if the wrapper is promoting the builder to a specific unit).
	// * So... the wrapper needs a copy of the parameter declarations - and return this (modified) copy instead of the
	// * original's - this will work since the wrapped first parameter is applicable to the unit even if it is
	// * narrowed in the wrapper. This is all done in wrapper.promoteToUnit().
	// *
	// * @param pattern
	// * @param b
	// * @param ctx
	// * @return
	// * @throws B3EngineException
	// */
	// public boolean weaveIfParametersMatch(BuilderConcernContext o, TypePattern pattern, IBuilder b,
	// BExecutionContext ctx, BuildUnit promoteToUnit) throws B3EngineException {
	// Matcher matcher = pattern.match(b.getParameterTypes());
	// if(o.isMatchParameters() && !matcher.isMatch())
	// return false;
	//
	// // create a map of parameter name in advise and parameter name in matched function
	// Map<String, String> nameMap = new HashMap<String, String>();
	// EList<BParameterPredicate> plist = o.getParameters(); // i.e. predicates
	// int limit = plist.size();
	// String pName = null;
	// // find predicates that have a name (only named predicates can be mapped)
	// for(int i = 0; i < limit; i++)
	// if((pName = plist.get(i).getName()) != null) {
	// int matchedIdx = matcher.getMatchStart(i);
	// if(matchedIdx < 0)
	// throw new B3InternalError("Matched parameter reported to have an index of -1");
	// nameMap.put(pName, b.getParameters().get(matcher.getMatchStart(matchedIdx)).getName());
	// }
	//
	// // Create a wrapping function and define it in the context
	// BuilderWrapper wrapper = B3BuildFactory.eINSTANCE.createBuilderWrapper();
	// wrapper.setOriginal(b);
	// wrapper.setAroundExpr(o.getFuncExpr()); // non containment, so ok to use this.funcExpr
	// wrapper.setParameterMap(nameMap);
	// if(promoteToUnit != null) {
	// wrapper.setUnitType(BuildUnitProxyAdapterFactory.eINSTANCE.adapt(promoteToUnit).getIface());
	// wrapper.setUnitTypeAdvised(true);
	// }
	// // if function has varargs, and the varargs parameter was mapped, the wrapper needs to know this
	// if(o.isVarArgs() && ((pName = plist.get(plist.size() - 1).getName()) != null))
	// wrapper.setVarargsName(pName);
	//
	// // WRAP ASSERTS by chaining any added condition with the original (unless original is removed).
	// B3backendFactory factory = B3backendFactory.eINSTANCE;
	// // --pre
	// if(b.getPrecondExpr() != null || o.isRemovePreCondition() || o.getPrecondExpr() != null) {
	// BChainedExpression pcExpr = factory.createBChainedExpression();
	// if(o.getPrecondExpr() != null) {
	// BExpressionWrapper ew = factory.createBExpressionWrapper();
	// ew.setOriginal(o.getPrecondExpr());
	// pcExpr.getExpressions().add(ew);
	// }
	// if(b.getPrecondExpr() != null && !o.isRemovePreCondition()) {
	// BExpressionWrapper ew = factory.createBExpressionWrapper();
	// ew.setOriginal(b.getPrecondExpr());
	// pcExpr.getExpressions().add(ew);
	// }
	// // set, and optimize if there is only one expression
	// wrapper.setPrecondExpr(pcExpr.getExpressions().size() == 1
	// ? pcExpr.getExpressions().get(0)
	// : pcExpr);
	// }
	// // --postinput
	// if(b.getPostinputcondExpr() != null || o.isRemovePostInputCondition() || o.getPostinputcondExpr() != null) {
	// BChainedExpression pcExpr = factory.createBChainedExpression();
	// if(o.getPostinputcondExpr() != null) {
	// BExpressionWrapper ew = factory.createBExpressionWrapper();
	// ew.setOriginal(o.getPostinputcondExpr());
	// pcExpr.getExpressions().add(ew);
	// }
	// if(b.getPostinputcondExpr() != null && !o.isRemovePostInputCondition()) {
	// BExpressionWrapper ew = factory.createBExpressionWrapper();
	// ew.setOriginal(b.getPostinputcondExpr());
	// pcExpr.getExpressions().add(ew);
	// }
	// // set, and optimize if there is only one expression
	// wrapper.setPostinputcondExpr(pcExpr.getExpressions().size() == 1
	// ? pcExpr.getExpressions().get(0)
	// : pcExpr);
	//
	// }
	// // --post
	// if(b.getPostcondExpr() != null || o.isRemovePostCondition() || o.getPostcondExpr() != null) {
	// BChainedExpression pcExpr = factory.createBChainedExpression();
	// if(o.getPostcondExpr() != null) {
	// BExpressionWrapper ew = factory.createBExpressionWrapper();
	// ew.setOriginal(o.getPostcondExpr());
	// pcExpr.getExpressions().add(ew);
	// }
	// if(b.getPostcondExpr() != null && !o.isRemovePostCondition()) {
	// BExpressionWrapper ew = factory.createBExpressionWrapper();
	// ew.setOriginal(b.getPostcondExpr());
	// pcExpr.getExpressions().add(ew);
	// }
	// // set, and optimize if there is only one expression
	// wrapper.setPostcondExpr(pcExpr.getExpressions().size() == 1
	// ? pcExpr.getExpressions().get(0)
	// : pcExpr);
	// }
	//
	// // WRAP INPUT
	// // by copying original input, setting a flag that input is advised, and then first do removals,
	// // and then additions. Everything needs to be copied as input is by containment, and the input rules may
	// // be needed multiple times.
	//
	// // is input advised?
	// ADVICEINPUT: if(o.getInputRemovals().size() > 0 || o.getInputAdditions().size() > 0) {
	// boolean modified = false;
	// BuilderInput input = null;
	// wrapper.setInput(input = BuilderInput.class.cast(EcoreUtil.copy(b.getInput())));
	// // removal
	// for(InputPredicate ip : o.getInputRemovals())
	// modified = ip.removeMatching(input) || modified;
	// // optimize if unchanged
	// if(!modified && o.getInputAdditions().size() == 0) {
	// wrapper.setInput(null);
	// break ADVICEINPUT;
	// }
	// // addition
	// EList<Prerequisite> prereqs = input.getPrerequisites();
	// for(Prerequisite p : o.getInputAdditions())
	// prereqs.add(Prerequisite.class.cast(EcoreUtil.copy(p)));
	//
	// wrapper.setInputAdvised(true);
	// }
	//
	// // WRAP OUTPUT
	// // by copying original output, setting a flag that output is advised, and then first do removals,
	// // and then additions. Everything needs to be copied as output is by containment, and the output rules
	// // may be needed multiple times.,
	//
	// // is output advised ?
	// ADVICEOUTPUT: if(o.getOutputRemovals().size() > 0 || o.getOutputAdditions().size() > 0 ||
	// o.getOutputAnnotationsRemovals().size() > 0 || o.getOutputAnnotationAdditions() != null) {
	// boolean modified = false;
	// PathGroup pg = null;
	// PathGroup originalOutput = b.getOutput();
	// if(originalOutput != null)
	// wrapper.setOutput(pg = PathGroup.class.cast(EcoreUtil.copy(b.getOutput())));
	// else {
	// // TODO: Should probably log warning that empty output was created as a consequence of advice.
	// originalOutput = B3BuildFactory.eINSTANCE.createPathGroup();
	// }
	// // removal
	// for(OutputPredicate op : o.getOutputRemovals())
	// modified = op.removeMatching(pg) || modified;
	//
	// // addition
	// EList<ConditionalPathVector> vectors = pg.getPathVectors();
	// for(ConditionalPathVector pv : o.getOutputAdditions())
	// vectors.add(ConditionalPathVector.class.cast(EcoreUtil.copy(pv)));
	//
	// // WRAP ANNOTATIONS
	// // Same as Default properties, but for annotations.
	// // TODO: What to do if there is no output? It may still be useful to modify annotations in the produced
	// // result
	// // in input?? (Current impl will throw NPE if there is no output...)
	// if(o.getOutputAnnotationsRemovals().size() > 0 || o.getOutputAnnotationAdditions() != null) {
	// BPropertySet as = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
	// modified = processProperties(
	// o, as, o.getOutputAnnotationsRemovals(), b.getOutput().getAnnotations(),
	// o.getOutputAnnotationAdditions()) ||
	// modified;
	// wrapper.getOutput().setAnnotations(as);
	// }
	// // optimize if unchanged
	// if(!modified && o.getOutputAdditions().size() == 0 && o.getOutputAnnotationAdditions() != null) {
	// wrapper.setOutput(null);
	// break ADVICEOUTPUT;
	// }
	// wrapper.setOutputAdvised(true);
	//
	// }
	// //
	// // WRAP SOURCE
	// // by copying original source, setting a flag that source is advised, and then first do removals,
	// // and then additions. Everything needs to be copied as source is by containment, and the source rules
	// // may be needed multiple times.
	//
	// // is source advised ?
	// ADVICESOURCE: if(o.getSourceRemovals().size() > 0 || o.getOutputAdditions().size() > 0 ||
	// o.getSourceAnnotationsRemovals().size() > 0 || o.getSourceAnnotationAdditions() != null) {
	// boolean modified = false;
	// PathGroup pg = null;
	// PathGroup originalSource = b.getSource();
	// if(originalSource != null)
	// wrapper.setSource(pg = PathGroup.class.cast(EcoreUtil.copy(b.getSource())));
	// else {
	// // TODO: Should probably log warning that empty source was created as a consequence of advice.
	// originalSource = B3BuildFactory.eINSTANCE.createPathGroup();
	// }
	// // removal
	// for(SourcePredicate sp : o.getSourceRemovals())
	// modified = sp.removeMatching(pg) || modified;
	//
	// // addition
	// EList<ConditionalPathVector> vectors = pg.getPathVectors();
	// for(ConditionalPathVector pv : o.getSourceAdditions())
	// vectors.add(ConditionalPathVector.class.cast(EcoreUtil.copy(pv)));
	//
	// // WRAP ANNOTATIONS
	// // Same as Default properties, but for annotations.
	// // TODO: What to do if there is no source? It may still be useful to modify annotations in the produced
	// // result
	// // in input?? (Current impl will throw NPE if there is no source...)
	// if(o.getSourceAnnotationsRemovals().size() > 0 || o.getSourceAnnotationAdditions() != null) {
	// BPropertySet as = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
	// modified = processProperties(
	// o, as, o.getSourceAnnotationsRemovals(), b.getSource().getAnnotations(),
	// o.getSourceAnnotationAdditions()) ||
	// modified;
	// wrapper.getSource().setAnnotations(as);
	// }
	// // optimize if unchanged
	// if(!modified && o.getSourceAdditions().size() == 0 && o.getSourceAnnotationAdditions() != null) {
	// wrapper.setSource(null);
	// break ADVICESOURCE;
	// }
	// wrapper.setSourceAdvised(true);
	//
	// }
	//
	// //
	// // WRAP PROVIDED CAPABILITIES
	// ADVICEPROVIDES: if(o.getProvidesRemovals().size() > 0 || o.getProvidedCapabilities().size() > 0) {
	// boolean modified = false;
	// EList<Capability> provided = wrapper.getProvidedCapabilities();
	// for(Capability c : b.getProvidedCapabilities())
	// provided.add(Capability.class.cast(EcoreUtil.copy(c)));
	// // removal
	// for(ProvidesPredicate pp : o.getProvidesRemovals())
	// modified = pp.removeMatching(provided) || modified;
	// // optimize if unchanged
	// if(!modified && o.getProvidedCapabilities().size() == 0) {
	// provided.clear();
	// break ADVICEPROVIDES;
	// }
	// // addition
	// for(Capability c : o.getProvidedCapabilities())
	// provided.add(Capability.class.cast(EcoreUtil.copy(c)));
	//
	// wrapper.setProvidesAdvised(true);
	// }
	//
	// // WRAP DEFAULT PROPERTIES
	// // if there are removals or additions, copy the property set from the original and then remove
	// // specific property settings - nasty if other properties rely on previously set properties - but
	// // user has to worry about that, then add copied definitions from additions.
	// //
	// if(o.getDefaultPropertiesRemovals().size() > 0 || o.getDefaultPropertiesAdditions() != null) {
	// BPropertySet ps = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
	// wrapper.setDefaultProperties(ps);
	// processProperties(
	// o, ps, o.getDefaultPropertiesRemovals(), b.getDefaultProperties(), o.getDefaultPropertiesAdditions());
	// }
	//
	// // define the wrapper, and we are done
	// ctx.defineFunction(wrapper);
	// return true;
	// }
}
