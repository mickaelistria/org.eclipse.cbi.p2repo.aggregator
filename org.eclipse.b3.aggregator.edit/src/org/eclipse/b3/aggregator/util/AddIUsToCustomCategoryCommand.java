/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.CustomCategory;
import org.eclipse.b3.aggregator.Feature;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.b3.aggregator.p2.InstallableUnit;
import org.eclipse.b3.aggregator.p2.MetadataRepository;
import org.eclipse.b3.aggregator.provider.AggregatorEditPlugin;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DragAndDropFeedback;

/**
 * @author Karel Brezina
 * 
 */
public class AddIUsToCustomCategoryCommand extends AbstractCommand implements DragAndDropFeedback {
	private CustomCategory customCategory;

	private Map<InstallableUnit, MappedRepository> mapFeatureMappedRepo = new HashMap<InstallableUnit, MappedRepository>();

	private List<InstallableUnit> selectedFeatures;

	private List<Feature> featuresAddedToCustomCategory = new ArrayList<Feature>();

	private Map<MappedRepository, List<MappedUnit>> unitsAddedToMappedRepo = new HashMap<MappedRepository, List<MappedUnit>>();

	public AddIUsToCustomCategoryCommand(CustomCategory category, List<InstallableUnit> selectedFeatures) {
		super(AggregatorEditPlugin.INSTANCE.getString("_UI_Add_to_command_prefix") + " "
				+ ((category.getLabel() == null || category.getLabel().length() == 0)
						? AggregatorEditPlugin.INSTANCE.getString("_UI_Category_type") + " ''"
						: AggregatorEditPlugin.INSTANCE.getString("_UI_Category_type") + " " + category.getLabel()));

		this.selectedFeatures = selectedFeatures;
		customCategory = category;
	}

	public void execute() {
		featuresAddedToCustomCategory.clear();
		unitsAddedToMappedRepo.clear();

		for(InstallableUnit feature : selectedFeatures) {
			MappedRepository repo = mapFeatureMappedRepo.get(feature);

			if(!repo.isEnabled())
				continue;

			MappedUnit unit = ItemUtils.findMappedUnit(repo, feature);

			if(unit == null) {
				unit = AggregatorFactory.eINSTANCE.createMappedUnit(feature);
				repo.addUnit(unit);

				List<MappedUnit> units = unitsAddedToMappedRepo.get(repo);
				if(units == null) {
					units = new ArrayList<MappedUnit>();
					unitsAddedToMappedRepo.put(repo, units);
				}
				units.add(unit);
			}
			else if(!unit.isEnabled())
				continue;

			if(unit instanceof Feature) {
				customCategory.getFeatures().add((Feature) unit);
				featuresAddedToCustomCategory.add((Feature) unit);
			}
		}
	}

	public int getFeedback() {
		return FEEDBACK_SELECT;
	}

	public int getOperation() {
		return DROP_LINK;
	}

	public void redo() {
		execute();
	}

	@Override
	public void undo() {
		customCategory.getFeatures().removeAll(featuresAddedToCustomCategory);

		for(MappedRepository mappedRepo : unitsAddedToMappedRepo.keySet())
			for(MappedUnit unit : unitsAddedToMappedRepo.get(mappedRepo))
				mappedRepo.removeUnit(unit);
	}

	// validated prior command creation
	public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
		return true;
	}

	@Override
	protected boolean prepare() {
		Aggregator aggregator = (Aggregator) ((EObject) customCategory).eContainer();

		for(InstallableUnit feature : selectedFeatures) {
			if(!(((EObject) feature).eContainer() instanceof MetadataRepository))
				return false;

			MetadataRepository mdr = (MetadataRepository) ((EObject) feature).eContainer();

			MappedRepository mappedRepo = ItemUtils.findMappedRepository(aggregator, mdr);

			if(mappedRepo != null) {
				mapFeatureMappedRepo.put(feature, mappedRepo);

				if(ItemUtils.findMapRule(mappedRepo, feature) != null)
					return false;
			}
		}

		return customCategory != null && selectedFeatures != null && selectedFeatures.size() > 0 && isEnabled();
	}

	private boolean isEnabled() {
		for(InstallableUnit feature : mapFeatureMappedRepo.keySet()) {
			MappedRepository repo = mapFeatureMappedRepo.get(feature);

			if(repo == null)
				return false;

			MappedUnit unit = ItemUtils.findMappedUnit(repo, feature);

			if(unit != null && !unit.isEnabled() || unit == null && repo != null && !repo.isEnabled())
				return false;
		}

		return true;
	}
}
