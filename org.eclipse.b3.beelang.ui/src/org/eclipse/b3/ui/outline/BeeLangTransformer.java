/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */
package org.eclipse.b3.ui.outline;

import java.lang.reflect.Type;
import java.util.List;

import org.eclipse.b3.backend.evaluator.b3backend.BConcern;
import org.eclipse.b3.backend.evaluator.b3backend.BFunction;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.backend.evaluator.typesystem.TypeUtils;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.BuildUnit;
import org.eclipse.b3.build.FirstFoundUnitProvider;
import org.eclipse.b3.build.IBuilder;
import org.eclipse.b3.build.Repository;
import org.eclipse.b3.ui.labeling.BeeLangLabelProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.OutlineLabelProvider;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import com.google.inject.Inject;

/**
 * customization of the default outline structure
 * 
 */
public class BeeLangTransformer extends AbstractDeclarativeSemanticModelTransformer {
	// although already used by AbstractDeclarativeSemanticModelTransformer, the label provider
	// injected there does not have an accessor.
	@Inject
	@OutlineLabelProvider
	private ILabelProvider labelProvider;

	// This helper is injected as a private helper in AbstractLabelProvider, but is difficult
	// to use when mapping structural features.
	@Inject
	private IImageHelper imageHelper;

	public ContentOutlineNode createNode(BeeModel beeModel, ContentOutlineNode outlineParentNode) {
		ContentOutlineNode result = super.createNode(beeModel, outlineParentNode);

		// "use declarations"
		if(!beeModel.getImports().isEmpty()) {
			ContentOutlineNode imports = new ContentOutlineNode("use declarations");
			// pick the image for an "interface"
			imports.setImage(imageHelper.getImage(BeeLangLabelProvider.IMPORT_LIST));
			result.getChildren().add(imports);
			for(Type type : beeModel.getImports())
				transformSemanticNode((EObject) TypeUtils.coerceToEObjectType(type), imports);
		}
		// units
		for(BuildUnit unit : beeModel.getBuildUnits())
			transformSemanticNode(unit, result);

		// concerns
		for(BConcern concern : beeModel.getConcerns())
			transformSemanticNode(concern, result);

		// default properties
		if(beeModel.getDefaultProperties() != null) {
			ContentOutlineNode defaultProperties = newOutlineNode(beeModel.getDefaultProperties(), result);

			// ContentOutlineNode defaultProperties = new ContentOutlineNode("default-properties");
			// result.getChildren().add(defaultProperties);
			transformSemanticChildNodes(beeModel.getDefaultProperties(), defaultProperties);
		}

		// named property sets
		for(BPropertySet ps : beeModel.getPropertySets()) {
			ContentOutlineNode psNode = newOutlineNode(ps, result);
			transformSemanticChildNodes(ps, psNode);
		}
		// repository declarations
		for(Repository r : beeModel.getRepositories())
			transformSemanticNode(r, result);

		// providers
		for(FirstFoundUnitProvider p : beeModel.getProviders())
			transformSemanticNode(p, result);

		// functions
		for(IFunction f : beeModel.getFunctions())
			transformSemanticNode(f, result);

		return result;
	}

	public ContentOutlineNode createNode(BuildUnit unit, ContentOutlineNode outlineParentNode) {
		ContentOutlineNode result = super.createNode(unit, outlineParentNode);

		// "is" Node, with types as subnodes
		if(!unit.getImplements().isEmpty()) {
			ContentOutlineNode types = new ContentOutlineNode("is");
			// pick the image for an "interface"
			types.setImage(labelProvider.getImage(unit.getImplements().get(0)));
			result.getChildren().add(types);
			for(Type type : unit.getImplements())
				transformSemanticNode((EObject) TypeUtils.coerceToEObjectType(type), types);
		}
		for(IBuilder b : unit.getBuilders())
			transformSemanticNode(b, result);

		// children.addAll(unit.getFragmentHosts());
		// children.addAll(unit.getRequiredCapabilities());
		// children.addAll(unit.getRequiredPredicates());

		return result;
	}

	/**
	 * Children of BeeModel added when creating the node
	 * 
	 * @param model
	 * @return
	 */
	protected List<EObject> getChildren(BeeModel model) {
		return NO_CHILDREN;
	}

	/**
	 * Drilling down into a function is quite meaningless as there are only expressions. This could
	 * only be of interest while debugging.
	 * TODO: Maybe make this conditional on debug state.
	 * 
	 * @param semanticNode
	 * @return NO_CHILDREN
	 */
	protected List<EObject> getChildren(BFunction semanticNode) {
		return NO_CHILDREN;
	}

	protected List<EObject> getChildren(BPropertySet propSet) {
		return propSet.eContents();
	}

	/**
	 * Children of BuildUnit added when creating the node.
	 * 
	 * @param unit
	 * @return
	 */
	protected List<EObject> getChildren(BuildUnit unit) {
		return NO_CHILDREN;
	}
}
