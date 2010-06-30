/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.evaluator;


/**
 * Weaves a BuildUnit
 * 
 */
public class UnitxWeaver extends Weaver {

	// /**
	// * Surgically performs the modification of a unit (it should be passed a clone).
	// *
	// * @param u
	// * the cloned build unit to modify
	// * @param ctx
	// * the execution context
	// * @return true if the given unit was modified
	// * @throws Throwable
	// */
	// private boolean adviseUnit(UnitConcernContext o, BuildUnit u, BuildContext ctx) throws Throwable {
	// boolean modified = false;
	//
	// // removal of provided capabilities
	// ListIterator<Capability> pcItor = o.getProvidedCapabilities().listIterator();
	// while(pcItor.hasNext()) {
	// Capability pc = pcItor.next();
	// for(ProvidesPredicate prem : o.getProvidesRemovals())
	// if(pc instanceof VersionedCapability
	// ? prem.matches((VersionedCapability.class.cast(pc)))
	// : prem.matches(pc)) {
	// pcItor.remove();
	// modified = true;
	// }
	// }
	// // addition of provided capabilities
	// for(Capability pc : o.getProvidedCapabilities()) {
	// pcItor.add(Capability.class.cast(EcoreUtil.copy(pc)));
	// modified = true;
	// }
	// // removal of required capabilities
	// ListIterator<RequiredCapability> rcItor = o.getRequiredCapabilities().listIterator();
	// while(rcItor.hasNext()) {
	// RequiredCapability rc = rcItor.next();
	// for(RequiresPredicate rrem : o.getRequiresRemovals()) {
	// if(rrem.matches(rc)) {
	// rcItor.remove();
	// modified = true;
	// }
	// }
	// }
	// // addition of required capabilities
	// for(RequiredCapability rc : o.getRequiredCapabilities()) {
	// rcItor.add(RequiredCapability.class.cast(EcoreUtil.copy(rc)));
	// modified = true;
	// }
	//
	// // SOURCE AND OUTPUT LOCATIONA
	// if(o.getSourceLocation() != null) {
	// u.setSourceLocation(o.getSourceLocation());
	// modified = true;
	// }
	//
	// if(o.getOutputLocation() != null) {
	// u.setOutputLocation(o.getOutputLocation());
	// modified = true;
	// }
	//
	// // ADVICE BUILDERS
	// // (note: does not require marking the unit itself as modified as the modified units
	// // are associated with the build unit via its interface.
	// adviseUnitBuilders(o, u, ctx);
	//
	// // DEFINE ADDITIONAL BUILDERS
	// // these builders are contained in a UnitConcernContext (no surprise) - they do not have a first parameter
	// // set (they can't since it is not known which units they will be defined for in advance). Wrappers must
	// // be used, and each wrapper installed for the matched unit.
	// //
	// EList<IFunction> fList = o.getFunctions();
	// Class<? extends BuildUnit> iFace = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getIface();
	// for(IFunction f : fList) {
	// BuilderWrapper wrapper = B3BuildFactory.eINSTANCE.createBuilderWrapper();
	// wrapper.setOriginal(f);
	// wrapper.setUnitType(iFace);
	// ctx.defineFunction(wrapper);
	// modified = true;
	// }
	//
	// // WEAVE DEFAULT PROPERTIES
	// // if there are removals or additions, copy the property set from the original and then remove
	// // specific property settings - nasty if other properties rely on previously set properties - but
	// // user has to worry about that, then add copied definitions from additions.
	// //
	// if(o.getDefaultPropertiesRemovals().size() > 0 || o.getDefaultPropertiesAdditions() != null) {
	// BPropertySet ps = B3backendFactory.eINSTANCE.createBDefaultPropertySet();
	// u.setDefaultProperties(ps);
	// modified = processProperties(
	// o, ps, o.getDefaultPropertiesRemovals(), u.getDefaultProperties(), o.getDefaultPropertiesAdditions()) ||
	// modified;
	// }
	// // TODO: Support advised source and output locations
	//
	// return modified;
	// }
	//
	// /**
	// * The builders applicable to the unit are matched using {@link BuilderConcernContext#evaluateIfMatching(Object, BExecutionContext, BuildUnit)}
	// * which weaves these
	// * builders as copies specific to the matching build units.
	// *
	// * @param u
	// * @param ctx
	// * @return true if any builders were advised
	// * @throws Throwable
	// */
	// private boolean adviseUnitBuilders(UnitConcernContext o, BuildUnit u, BExecutionContext ctx) throws Throwable {
	// boolean modified = false;
	// BuildUnit proxy = BuildUnitProxyAdapterFactory.eINSTANCE.adapt(u).getProxy();
	// Iterator<IFunction> fItor = ctx.getFunctionIterator(proxy.getClass(), IBuilder.class);
	// while(fItor.hasNext()) {
	// IFunction candidate = fItor.next();
	// for(BuilderConcernContext bx : o.getBuilderContexts()) {
	// if(bx.evaluateIfMatching(candidate, ctx, u))
	// modified = true;
	// }
	// }
	// return modified;
	// }
	//
	// /**
	// * Weaves the build united passed as candidate if it matches the predicates.
	// */
	// public boolean evaluateIfMatching(UnitConcernContext o, Object candidate, BExecutionContext ctx) throws Throwable {
	// if(!(candidate instanceof BuildUnit))
	// return false;
	// BExecutionContext ictx = ctx.createInnerContext();
	// ictx.defineVariableValue("@test", null, BuildUnit.class);
	// return weaveIfMatching(o, (BuildUnit) candidate, ictx);
	// }
	//
	// // private boolean matchesQuery(BuilderConcernContext o, IBuilder candidate, BExecutionContext ctx) throws Throwable {
	// // BExecutionContext ictx = ctx.createInnerContext();
	// // ictx.defineVariableValue("@test", candidate, Builder.class);
	// // return evaluator.doEvaluate(o.getQuery(), ictx) == Boolean.TRUE;
	// // }
	//
	// public boolean weaveIfMatching(UnitConcernContext o, BuildUnit u, BExecutionContext ctx) throws Throwable {
	// Object result = evaluator.doEvaluate(o.getQuery(), ctx);
	// if(result != Boolean.TRUE)
	// return false;
	// // weave by creating a copy an then advice it
	// BuildUnit clone = BuildUnit.class.cast(EcoreUtil.copy(u));
	// // modify the build unit, and store it
	// BuildContext bctx = BuildContext.class.cast(ctx.getParentContext());
	// // but only of the unit itself was advised (NOTE: modifying builders does not affect the build unit)
	// if(adviseUnit(o, clone, bctx))
	// bctx.defineBuildUnit(clone, true);
	// return true;
	//
	// }

}
