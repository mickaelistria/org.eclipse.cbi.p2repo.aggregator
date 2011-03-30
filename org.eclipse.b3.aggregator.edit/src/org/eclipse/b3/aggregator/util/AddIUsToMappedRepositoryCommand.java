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
import java.util.List;

import org.eclipse.b3.aggregator.ExclusionRule;
import org.eclipse.b3.aggregator.MapRule;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.b3.aggregator.ValidConfigurationsRule;
import org.eclipse.b3.aggregator.provider.AggregatorEditPlugin;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;

/**
 * @author Karel Brezina
 * 
 */
public class AddIUsToMappedRepositoryCommand extends AbstractCommand implements DragAndDropFeedback {
	private MappedRepository mappedRepo;

	private List<IInstallableUnit> selectedIUs;

	private int operation;

	private List<MappedUnit> addedMappedUnits = new ArrayList<MappedUnit>();

	private List<MapRule> addedMapRules = new ArrayList<MapRule>();

	public AddIUsToMappedRepositoryCommand(MappedRepository mappedRepo, List<IInstallableUnit> selectedIUs) {
		this(mappedRepo, selectedIUs, AggregatorEditPlugin.ADD_IU);
	}

	public AddIUsToMappedRepositoryCommand(MappedRepository mappedRepo, List<IInstallableUnit> selectedIUs,
			int operation) {
		super(AggregatorEditPlugin.INSTANCE.getString("_UI_Map_to_command_prefix") + " " +
				AggregatorEditPlugin.INSTANCE.getString("_UI_MappedRepository_type") + " " + mappedRepo.getLocation());

		this.mappedRepo = mappedRepo;
		this.selectedIUs = selectedIUs;
		this.operation = operation;
	}

	public void execute() {
		addedMappedUnits.clear();
		addedMapRules.clear();

		if((operation & AggregatorEditPlugin.ADD_IU) > 0)
			for(IInstallableUnit iu : selectedIUs) {
				MappedUnit newMU = ItemUtils.addIU(mappedRepo, iu);
				if(newMU != null)
					addedMappedUnits.add(newMU);
			}
		else if((operation & (AggregatorEditPlugin.ADD_EXCLUSION_RULE | AggregatorEditPlugin.ADD_VALID_CONFIGURATIONS_RULE)) > 0)
			for(IInstallableUnit iu : selectedIUs) {
				MapRule newMR = ItemUtils.addMapRule(
					mappedRepo, iu, (operation & AggregatorEditPlugin.ADD_EXCLUSION_RULE) > 0
							? ExclusionRule.class
							: ValidConfigurationsRule.class);
				if(newMR != null)
					addedMapRules.add(newMR);
			}
	}

	public int getFeedback() {
		return FEEDBACK_SELECT;
	}

	public int getOperation() {
		return DROP_LINK;
	}

	@Override
	protected boolean prepare() {
		boolean result = mappedRepo != null && mappedRepo.isBranchEnabled() && selectedIUs != null &&
				selectedIUs.size() > 0 && ItemUtils.haveSameLocation(mappedRepo, selectedIUs);

		if(result)
			for(IInstallableUnit iu : selectedIUs)
				if(ItemUtils.findMappedUnit(mappedRepo, iu) != null || ItemUtils.findMapRule(mappedRepo, iu) != null)
					return false;

		return result;
	}

	public void redo() {
		execute();
	}

	@Override
	public void undo() {
		for(MappedUnit unit : addedMappedUnits) {
			MappedRepository repo = (MappedRepository) ((EObject) unit).eContainer();
			repo.removeUnit(unit);
		}

		for(MapRule rule : addedMapRules) {
			MappedRepository repo = (MappedRepository) ((EObject) rule).eContainer();
			repo.getMapRules().remove(rule);
		}
	}

	// validated prior command creation
	public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
		return true;
	}
}
