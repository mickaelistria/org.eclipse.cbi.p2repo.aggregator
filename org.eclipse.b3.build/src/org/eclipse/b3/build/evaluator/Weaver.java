/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.evaluator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.b3.backend.core.IB3Evaluator;
import org.eclipse.b3.backend.core.datatypes.LValue;
import org.eclipse.b3.backend.core.datatypes.TypePattern;
import org.eclipse.b3.backend.core.datatypes.TypePattern.Matcher;
import org.eclipse.b3.backend.core.exceptions.B3EngineException;
import org.eclipse.b3.backend.core.exceptions.B3InternalError;
import org.eclipse.b3.backend.core.iterators.PropertyDefinitionIterator;
import org.eclipse.b3.backend.core.iterators.PropertyOperationIterator;
import org.eclipse.b3.backend.evaluator.BackendWeaver;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BChainedExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpressionWrapper;
import org.eclipse.b3.backend.evaluator.b3backend.BParameterPredicate;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyDefinitionOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertyOperation;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.inference.FunctionUtils;
import org.eclipse.b3.build.B3BuildFactory;
import org.eclipse.b3.build.BuildConcernContext;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.BuilderConcernContext;
import org.eclipse.b3.build.BuilderInput;
import org.eclipse.b3.build.BuilderInputGroup;
import org.eclipse.b3.build.BuilderWrapper;
import org.eclipse.b3.build.Capability;
import org.eclipse.b3.build.CapabilityPredicate;
import org.eclipse.b3.build.ConditionalPathVector;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.InputPredicate;
import org.eclipse.b3.build.OutputPredicate;
import org.eclipse.b3.build.PathGroup;
import org.eclipse.b3.build.ProvidesPredicate;
import org.eclipse.b3.build.RequiredCapability;
import org.eclipse.b3.build.RequiresPredicate;
import org.eclipse.b3.build.SourcePredicate;
import org.eclipse.b3.build.UnitConcernContext;
import org.eclipse.b3.build.VersionedCapability;
import org.eclipse.b3.build.core.adapters.BuildUnitProxyAdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Weaver for Build
 * 
 */
@Singleton
public class Weaver extends BackendWeaver {

	@Inject
	private IB3Evaluator evaluator;

	@Inject
	private BuilderInputRemover inputRemover;

	/**
	 * Performs parameter type matching and if parameters match, a wrapper is created and added to the context.
	 * 
	 * NOTE: the wrapper may have different parameter names than the original, and may only see a few of them. It may
	 * however need to modify the first parameter (if the wrapper is promoting the builder to a specific unit).
	 * So... the wrapper needs a copy of the parameter declarations - and return this (modified) copy instead of the
	 * original's - this will work since the wrapped first parameter is applicable to the unit even if it is
	 * narrowed in the wrapper. This is all done in wrapper.promoteToUnit().
	 * 
	 * @param theBuilderConcern
	 *            the builder concern
	 * @param pattern
	 * @param b
	 * @param ctx
	 * @return
	 * @throws B3EngineException
	 */
	private boolean adviceBuilder(BuilderConcernContext theBuilderConcern, IBuilder b, BExecutionContext ctx,
			BuildUnit promoteToUnit, TypePattern builderTypePattern) throws B3EngineException {

		Matcher matcher = builderTypePattern.match(FunctionUtils.getParameterTypes(b));
		if(theBuilderConcern.isMatchParameters() && !matcher.isMatch())
			return false;

		// create a map of parameter name in advise and parameter name in matched function
		Map<String, String> nameMap = new HashMap<String, String>();
		EList<BParameterPredicate> plist = theBuilderConcern.getParameters(); // i.e. predicates
		int limit = plist.size();
		String pName = null;
		// find predicates that have a name (only named predicates can be mapped)
		for(int i = 0; i < limit; i++)
			if((pName = plist.get(i).getName()) != null) {
				int matchedIdx = matcher.getMatchStart(i);
				if(matchedIdx < 0)
					throw new B3InternalError("Matched parameter reported to have an index of -1");
				nameMap.put(pName, b.getParameters().get(matcher.getMatchStart(matchedIdx)).getName());
			}

		// Create a wrapping function and define it in the context
		BuilderWrapper wrapper = B3BuildFactory.eINSTANCE.createBuilderWrapper();
		wrapper.setOriginal(b);
		wrapper.setAroundExpr(theBuilderConcern.getFuncExpr()); // non containment, so ok to use this.funcExpr
		wrapper.setParameterMap(nameMap);
		if(promoteToUnit != null) {
			wrapper.setUnitType(BuildUnitProxyAdapterFactory.eINSTANCE.adapt(promoteToUnit).getIface());
			wrapper.setUnitTypeAdvised(true);
		}
		// if function has varargs, and the varargs parameter was mapped, the wrapper needs to know this
		if(theBuilderConcern.isVarArgs() && ((pName = plist.get(plist.size() - 1).getName()) != null))
			wrapper.setVarargsName(pName);

		// WRAP ASSERTS by chaining any added condition with the original (unless original is removed).
		B3backendFactory factory = B3backendFactory.eINSTANCE;
		// --pre
		if(b.getPrecondExpr() != null || theBuilderConcern.isRemovePreCondition() ||
				theBuilderConcern.getPrecondExpr() != null) {
			BChainedExpression pcExpr = factory.createBChainedExpression();
			if(theBuilderConcern.getPrecondExpr() != null) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(theBuilderConcern.getPrecondExpr());
				pcExpr.getExpressions().add(ew);
			}
			if(b.getPrecondExpr() != null && !theBuilderConcern.isRemovePreCondition()) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(b.getPrecondExpr());
				pcExpr.getExpressions().add(ew);
			}
			// set, and optimize if there is only one expression
			wrapper.setPrecondExpr(pcExpr.getExpressions().size() == 1
					? pcExpr.getExpressions().get(0)
					: pcExpr);
		}
		// --postinput
		if(b.getPostinputcondExpr() != null || theBuilderConcern.isRemovePostInputCondition() ||
				theBuilderConcern.getPostinputcondExpr() != null) {
			BChainedExpression pcExpr = factory.createBChainedExpression();
			if(theBuilderConcern.getPostinputcondExpr() != null) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(theBuilderConcern.getPostinputcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			if(b.getPostinputcondExpr() != null && !theBuilderConcern.isRemovePostInputCondition()) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(b.getPostinputcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			// set, and optimize if there is only one expression
			wrapper.setPostinputcondExpr(pcExpr.getExpressions().size() == 1
					? pcExpr.getExpressions().get(0)
					: pcExpr);

		}
		// --post
		if(b.getPostcondExpr() != null || theBuilderConcern.isRemovePostCondition() ||
				theBuilderConcern.getPostcondExpr() != null) {
			BChainedExpression pcExpr = factory.createBChainedExpression();
			if(theBuilderConcern.getPostcondExpr() != null) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(theBuilderConcern.getPostcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			if(b.getPostcondExpr() != null && !theBuilderConcern.isRemovePostCondition()) {
				BExpressionWrapper ew = factory.createBExpressionWrapper();
				ew.setOriginal(b.getPostcondExpr());
				pcExpr.getExpressions().add(ew);
			}
			// set, and optimize if there is only one expression
			wrapper.setPostcondExpr(pcExpr.getExpressions().size() == 1
					? pcExpr.getExpressions().get(0)
					: pcExpr);
		}

		// WRAP INPUT
		// by copying original input, setting a flag that input is advised, and then first do removals,
		// and then additions. Everything needs to be copied as input is by containment, and the input rules may
		// be needed multiple times.

		// is input advised?
		ADVICEINPUT: if(theBuilderConcern.getInputRemovals().size() > 0 ||
				theBuilderConcern.getInputAdditions().size() > 0) {
			boolean modified = false;
			BuilderInput input = null;
			wrapper.setInput(input = BuilderInput.class.cast(EcoreUtil.copy(b.getInput())));

			// removals
			for(InputPredicate ip : theBuilderConcern.getInputRemovals())
				if(inputRemover.doRemoveMatching(input, ip))
					wrapper.setInput(null);

			modified = !EcoreUtil.equals(b.getInput(), wrapper.getInput());
			// optimize if unchanged
			if(!modified && theBuilderConcern.getInputAdditions().size() == 0) {
				wrapper.setInput(null);
				break ADVICEINPUT;
			}

			// additions
			if(theBuilderConcern.getInputAdditions().size() > 0) {
				BuilderInputGroup newInput = B3BuildFactory.eINSTANCE.createBuilderInputGroup();
				if(wrapper.getInput() != null)
					newInput.getBuilderInput().add(wrapper.getInput());
				newInput.getBuilderInput().addAll(EcoreUtil.copyAll(theBuilderConcern.getInputAdditions()));
				wrapper.setInput(newInput);
			}

			wrapper.setInputAdvised(true);
		}

		// WRAP OUTPUT
		// by copying original output, setting a flag that output is advised, and then first do removals,
		// and then additions. Everything needs to be copied as output is by containment, and the output rules
		// may be needed multiple times.,

		// is output advised ?
		ADVICEOUTPUT: if(theBuilderConcern.getOutputRemovals().size() > 0 ||
				theBuilderConcern.getOutputAdditions().size() > 0 ||
				theBuilderConcern.getOutputAnnotationsRemovals().size() > 0 ||
				theBuilderConcern.getOutputAnnotationAdditions() != null) {
			boolean modified = false;
			PathGroup pg = null;
			PathGroup originalOutput = b.getOutput();
			if(originalOutput != null)
				wrapper.setOutput(pg = PathGroup.class.cast(EcoreUtil.copy(b.getOutput())));
			else {
				// TODO: Should probably log warning that empty output was created as a consequence of advice.
				originalOutput = B3BuildFactory.eINSTANCE.createPathGroup();
			}
			// removal
			for(OutputPredicate op : theBuilderConcern.getOutputRemovals())
				modified = op.removeMatching(pg) || modified;

			// addition
			EList<ConditionalPathVector> vectors = pg.getPathVectors();
			for(ConditionalPathVector pv : theBuilderConcern.getOutputAdditions())
				vectors.add(ConditionalPathVector.class.cast(EcoreUtil.copy(pv)));

			// WRAP ANNOTATIONS
			// Same as Default properties, but for annotations.
			// TODO: What to do if there is no output? It may still be useful to modify annotations in the produced
			// result
			// in input?? (Current impl will throw NPE if there is no output...)
			if(theBuilderConcern.getOutputAnnotationsRemovals().size() > 0 ||
					theBuilderConcern.getOutputAnnotationAdditions() != null) {
				BPropertySet as = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
				modified = processProperties(
					theBuilderConcern, as, theBuilderConcern.getOutputAnnotationsRemovals(),
					b.getOutput().getAnnotations(), theBuilderConcern.getOutputAnnotationAdditions()) ||
						modified;
				wrapper.getOutput().setAnnotations(as);
			}
			// optimize if unchanged
			if(!modified && theBuilderConcern.getOutputAdditions().size() == 0 &&
					theBuilderConcern.getOutputAnnotationAdditions() != null) {
				wrapper.setOutput(null);
				break ADVICEOUTPUT;
			}
			wrapper.setOutputAdvised(true);

		}
		//
		// WRAP SOURCE
		// by copying original source, setting a flag that source is advised, and then first do removals,
		// and then additions. Everything needs to be copied as source is by containment, and the source rules
		// may be needed multiple times.

		// is source advised ?
		ADVICESOURCE: if(theBuilderConcern.getSourceRemovals().size() > 0 ||
				theBuilderConcern.getOutputAdditions().size() > 0 ||
				theBuilderConcern.getSourceAnnotationsRemovals().size() > 0 ||
				theBuilderConcern.getSourceAnnotationAdditions() != null) {
			boolean modified = false;
			PathGroup pg = null;
			PathGroup originalSource = b.getSource();
			if(originalSource != null)
				wrapper.setSource(pg = PathGroup.class.cast(EcoreUtil.copy(b.getSource())));
			else {
				// TODO: Should probably log warning that empty source was created as a consequence of advice.
				originalSource = B3BuildFactory.eINSTANCE.createPathGroup();
			}
			// removal
			for(SourcePredicate sp : theBuilderConcern.getSourceRemovals())
				modified = sp.removeMatching(pg) || modified;

			// addition
			EList<ConditionalPathVector> vectors = pg.getPathVectors();
			for(ConditionalPathVector pv : theBuilderConcern.getSourceAdditions())
				vectors.add(ConditionalPathVector.class.cast(EcoreUtil.copy(pv)));

			// WRAP ANNOTATIONS
			// Same as Default properties, but for annotations.
			// TODO: What to do if there is no source? It may still be useful to modify annotations in the produced
			// result
			// in input?? (Current impl will throw NPE if there is no source...)
			if(theBuilderConcern.getSourceAnnotationsRemovals().size() > 0 ||
					theBuilderConcern.getSourceAnnotationAdditions() != null) {
				BPropertySet as = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
				modified = processProperties(
					theBuilderConcern, as, theBuilderConcern.getSourceAnnotationsRemovals(),
					b.getSource().getAnnotations(), theBuilderConcern.getSourceAnnotationAdditions()) ||
						modified;
				wrapper.getSource().setAnnotations(as);
			}
			// optimize if unchanged
			if(!modified && theBuilderConcern.getSourceAdditions().size() == 0 &&
					theBuilderConcern.getSourceAnnotationAdditions() != null) {
				wrapper.setSource(null);
				break ADVICESOURCE;
			}
			wrapper.setSourceAdvised(true);

		}

		//
		// WRAP PROVIDED CAPABILITIES
		ADVICEPROVIDES: if(theBuilderConcern.getProvidesRemovals().size() > 0 ||
				theBuilderConcern.getProvidedCapabilities().size() > 0) {
			boolean modified = false;
			EList<Capability> provided = wrapper.getProvidedCapabilities();
			for(Capability c : b.getProvidedCapabilities())
				provided.add(Capability.class.cast(EcoreUtil.copy(c)));
			// removal
			for(ProvidesPredicate pp : theBuilderConcern.getProvidesRemovals())
				modified = pp.removeMatching(provided) || modified;
			// optimize if unchanged
			if(!modified && theBuilderConcern.getProvidedCapabilities().size() == 0) {
				provided.clear();
				break ADVICEPROVIDES;
			}
			// addition
			for(Capability c : theBuilderConcern.getProvidedCapabilities())
				provided.add(Capability.class.cast(EcoreUtil.copy(c)));

			wrapper.setProvidesAdvised(true);
		}

		// WRAP DEFAULT PROPERTIES
		// if there are removals or additions, copy the property set from the original and then remove
		// specific property settings - nasty if other properties rely on previously set properties - but
		// user has to worry about that, then add copied definitions from additions.
		//
		if(theBuilderConcern.getDefaultPropertiesRemovals().size() > 0 ||
				theBuilderConcern.getDefaultPropertiesAdditions() != null) {
			BPropertySet ps = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
			wrapper.setDefaultProperties(ps);
			processProperties(
				theBuilderConcern, ps, theBuilderConcern.getDefaultPropertiesRemovals(), b.getDefaultProperties(),
				theBuilderConcern.getDefaultPropertiesAdditions());
		}

		// define the wrapper, and we are done
		ctx.defineFunction(wrapper);
		return true;
	}

	/**
	 * Surgically performs the modification of a unit (it should be passed a clone).
	 * 
	 * @param u
	 *            the cloned build unit to modify
	 * @param ctx
	 *            the execution context
	 * @return true if the given unit was modified
	 * @throws Throwable
	 */
	private boolean adviseUnit(UnitConcernContext theUnitConcern, BuildUnit u, BContext ctx) throws Throwable {
		boolean modified = false;

		// removal of provided capabilities
		final ListIterator<Capability> pcItor = u.getProvidedCapabilities().listIterator();
		while(pcItor.hasNext()) {
			Capability pc = pcItor.next();
			for(ProvidesPredicate prem : theUnitConcern.getProvidesRemovals())
				if(pc instanceof VersionedCapability
						? prem.matches((VersionedCapability.class.cast(pc)))
						: prem.matches(pc)) {
					pcItor.remove();
					modified = true;
				}
		}

		// addition of provided capabilities
		for(Capability pc : theUnitConcern.getProvidedCapabilities()) {
			u.getProvidedCapabilities().add(Capability.class.cast(EcoreUtil.copy(pc)));
			modified = true;
		}

		// removal of required capabilities
		final ListIterator<RequiredCapability> rcItor = u.getRequiredCapabilities().listIterator();
		while(rcItor.hasNext()) {
			RequiredCapability rc = rcItor.next();
			for(RequiresPredicate rrem : theUnitConcern.getRequiresRemovals()) {
				if(rrem.matches(rc)) {
					rcItor.remove();
					modified = true;
				}
			}
		}
		// addition of required capabilities
		for(RequiredCapability rc : theUnitConcern.getRequiredCapabilities()) {
			u.getRequiredCapabilities().add(RequiredCapability.class.cast(EcoreUtil.copy(rc)));
			modified = true;
		}

		// removal of requiredPredicates
		final ListIterator<CapabilityPredicate> rqpItor = u.getRequiredPredicates().listIterator();
		while(rqpItor.hasNext()) {
			CapabilityPredicate candidate = rqpItor.next();
			for(CapabilityPredicate p : theUnitConcern.getRequiredPredicatesRemovals())
				if(p.equals(candidate)) {
					rqpItor.remove();
					modified = true;
				}
		}
		// addition of requiredPredicates
		for(CapabilityPredicate rcp : theUnitConcern.getRequiredPredicates()) {
			u.getRequiredPredicates().add(CapabilityPredicate.class.cast(EcoreUtil.copy(rcp)));
			modified = true;
		}

		// SOURCE AND OUTPUT LOCATIONA
		if(theUnitConcern.getSourceLocation() != null) {
			u.setSourceLocation(theUnitConcern.getSourceLocation());
			modified = true;
		}

		if(theUnitConcern.getOutputLocation() != null) {
			u.setOutputLocation(theUnitConcern.getOutputLocation());
			modified = true;
		}

		// ADVICE BUILDERS
		// (note: does not require marking the unit itself as modified as the modified units
		// are associated with the build unit via its interface.
		adviseUnitBuilders(theUnitConcern, u, ctx);

		// DEFINE ADDITIONAL BUILDERS
		// these builders are contained in a UnitConcernContext (no surprise) - they do not have a first parameter
		// set (they can't since it is not known which units they will be defined for in advance). Wrappers must
		// be used, and each wrapper installed for the matched unit.
		//
		EList<IFunction> fList = theUnitConcern.getFunctions();
		Class<? extends BuildUnit> iFace = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getIface();
		for(IFunction f : fList) {
			BuilderWrapper wrapper = B3BuildFactory.eINSTANCE.createBuilderWrapper();
			wrapper.setOriginal(f);
			wrapper.setUnitType(iFace);
			ctx.defineFunction(wrapper);
			modified = true;
		}

		// WEAVE DEFAULT PROPERTIES
		// if there are removals or additions, copy the property set from the original and then remove
		// specific property settings - nasty if other properties rely on previously set properties - but
		// user has to worry about that, then add copied definitions from additions.
		//
		if(theUnitConcern.getDefaultPropertiesRemovals().size() > 0 ||
				theUnitConcern.getDefaultPropertiesAdditions() != null) {
			BPropertySet ps = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
			u.setDefaultProperties(ps);
			modified = processProperties(
				theUnitConcern, ps, theUnitConcern.getDefaultPropertiesRemovals(), u.getDefaultProperties(),
				theUnitConcern.getDefaultPropertiesAdditions()) || modified;
		}
		// TODO: Support advised source and output locations

		return modified;
	}

	/**
	 * The builders applicable to the unit are matched using {@link BuilderConcernContext#evaluateIfMatching(Object, BExecutionContext, BuildUnit)}
	 * which weaves these
	 * builders as copies specific to the matching build units.
	 * 
	 * @param u
	 * @param ctx
	 * @return true if any builders were advised
	 * @throws Throwable
	 */
	private boolean adviseUnitBuilders(UnitConcernContext theUnitConcern, BuildUnit u, BExecutionContext ctx)
			throws Throwable {
		boolean modified = false;
		BuildUnit proxy = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getProxy();
		Iterator<IFunction> fItor = ctx.getFunctionIterator(proxy.getClass(), IBuilder.class);

		while(fItor.hasNext()) {
			IFunction candidate = fItor.next();
			for(BuilderConcernContext bx : theUnitConcern.getBuilderContexts()) {
				TypePattern builderTypePattern = TypePattern.compile(bx.getParameters());
				if(weave(bx, (IBuilder) candidate, ctx, builderTypePattern, u))
					modified = true;
			}
		}
		return modified;
	}

	/**
	 * Copies everything from originalSet to propertySet, and then removes all definitions in removals. Lastly
	 * additions are added to the propertySet.
	 * 
	 * @param propertySet
	 *            - the set that receives the result
	 * @param removals
	 *            - list of property names to remove from the definition
	 * @param originalSet
	 *            - the set to copy
	 * @param additions
	 *            - additions to set after removals have been made
	 * @returns true if the resulting copied and advised set is different than the original
	 */
	private boolean processProperties(BuildConcernContext o, BPropertySet propertySet, EList<String> removals,
			BPropertySet originalSet, BPropertySet additions) {
		boolean modified = false;
		EList<BPropertyOperation> operations = propertySet.getOperations();
		PropertyOperationIterator psItor = new PropertyOperationIterator(originalSet);

		// copy everything
		while(psItor.hasNext())
			operations.add(BPropertyOperation.class.cast(EcoreUtil.copy(psItor.next())));

		// remove matching definitions
		if(o.getDefaultPropertiesRemovals().size() > 0) {
			PropertyDefinitionIterator psdItor = new PropertyDefinitionIterator(propertySet);
			while(psdItor.hasNext()) {
				BPropertyDefinitionOperation pd = psdItor.next();
				for(String pid : removals) {
					if(pid.equals(pd.getDefinition().getName())) {
						psdItor.remove();
						modified = true;
					}
				}
			}
		}

		// add new definitions
		psItor = new PropertyOperationIterator(additions);
		while(psItor.hasNext()) {
			operations.add(BPropertyOperation.class.cast(EcoreUtil.copy(psItor.next())));
			modified = true;
		}
		return modified;
	}

	/**
	 * Weaves one IBuilder (without promotion to a specific BuildUnit).
	 * 
	 * @param o
	 * @param candidate
	 * @param ctx
	 * @param pattern
	 * @return
	 * @throws Throwable
	 */
	public Boolean weave(BuilderConcernContext o, IBuilder candidate, BExecutionContext ctx, TypePattern pattern)
			throws Throwable {
		return weave(o, candidate, ctx, pattern, null);
	}

	/**
	 * Weaves one IBuilder.
	 * 
	 * @param o
	 * @param candidate
	 * @param ctx
	 * @param pattern
	 * @param promoteToUnit
	 * @return
	 * @throws Throwable
	 */
	public Boolean weave(BuilderConcernContext o, IBuilder candidate, BExecutionContext ctx, TypePattern pattern,
			BuildUnit promoteToUnit) throws Throwable {

		// context needed as query operate on the variable '@test'
		BExecutionContext ictx = ctx.createInnerContext();
		ictx.defineVariableValue("@test", null, IBuilder.class);
		LValue lval = ictx.getLValue("@test");
		lval.set(candidate);

		if(evaluator.doEvaluate(o.getQuery(), ictx) != Boolean.TRUE)
			return false;

		// NOTE: pattern needs to be checked when advising as match result is used to map parameters
		return adviceBuilder(o, candidate, ctx, promoteToUnit, pattern);
	}

	/**
	 * Weaves a collection of IBuilder.
	 * TODO: Could be made better by using Iterator<IBuilder>, but operation comes from context
	 * and requires an Iterator<T>.getFunctionIterator(... T) operation. Investigate if T may be erased and
	 * not handled by the polymorphic dispatcher.
	 * 
	 * @param o
	 * @param functions
	 * @param ctx
	 * @return
	 * @throws B3EngineException
	 */
	public Boolean weave(BuilderConcernContext o, Iterator<IFunction> functions, BExecutionContext ctx)
			throws B3EngineException {
		boolean woven = false;
		TypePattern builderTypePattern = TypePattern.compile(o.getParameters());

		while(functions.hasNext()) {
			IFunction f = functions.next();
			if(!(f instanceof IBuilder))
				continue;
			if(doWeave(o, f, ctx, builderTypePattern))
				woven = true;
		}
		return woven;
	}

	/**
	 * Weaves one BuildUnit.
	 * 
	 * @param o
	 * @param candidate
	 * @param ctx
	 * @return
	 * @throws Throwable
	 */
	public Boolean weave(UnitConcernContext o, BuildUnit candidate, BExecutionContext ctx) throws Throwable {
		// evaluate query
		BExecutionContext ictx = ctx.createInnerContext();
		ictx.defineVariableValue("@test", null, BuildUnit.class);
		LValue lval = ictx.getLValue("@test");
		lval.set(candidate);
		if(evaluator.doEvaluate(o.getQuery(), ictx) != Boolean.TRUE)
			return false;

		// weave by creating a copy an then advice it
		BuildUnit clone = BuildUnit.class.cast(EcoreUtil.copy(candidate));
		// fix the containment/parent-chain for the copy (should not be contained)
		clone.setParent(candidate.getParent());
		// modify the build unit, and store it
		BContext bctx = BContext.class.cast(ictx.getParentContext());
		// but only if the unit itself was advised (NOTE: modifying builders does not affect the build unit)
		if(adviseUnit(o, clone, bctx))
			evaluator.doDefine(clone, bctx, true);
		// bctx.defineBuildUnit(clone, true);
		return true;
	}

	public Boolean weave(UnitConcernContext o, IFunction element, BExecutionContext ctx) {
		return false; // A Unit Context does not want to weave IFunction or IBuilder
	}

	/**
	 * Weaves a collection of BuildUnits.
	 * 
	 * @param o
	 * @param elements
	 * @param ctx
	 * @return
	 * @throws B3EngineException
	 */
	public Boolean weave(UnitConcernContext o, Iterator<BuildUnit> elements, BExecutionContext ctx)
			throws B3EngineException {

		boolean woven = false;
		while(elements.hasNext()) {
			if(doWeave(o, elements.next(), ctx))
				woven = true;
		}
		return woven;
	}

}
