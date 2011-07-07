/*******************************************************************************
 * Copyright (c) 2006-2007, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 ******************************************************************************/

package org.eclipse.b3.aggregator.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.ExclusionRule;
import org.eclipse.b3.aggregator.MapRule;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.b3.aggregator.ValidConfigurationsRule;
import org.eclipse.b3.aggregator.provider.AggregatorEditPlugin;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;

/**
 * @author Karel Brezina
 * 
 */
public class AddIUsToParentRepositoryCommand extends AbstractCommand {
	private Aggregation aggregation;

	private List<IInstallableUnit> selectedIUs;

	private int operation;

	private Map<IInstallableUnit, MappedRepository> mapIUMappedRepo = new HashMap<IInstallableUnit, MappedRepository>();

	private Map<MappedRepository, List<MappedUnit>> unitsAddedToMappedRepo = new HashMap<MappedRepository, List<MappedUnit>>();

	private Map<MappedRepository, List<MapRule>> rulesAddedToMappedRepo = new HashMap<MappedRepository, List<MapRule>>();

	public AddIUsToParentRepositoryCommand(Aggregation aggregation, List<IInstallableUnit> selectedIUs, int operation) {
		super(AggregatorEditPlugin.INSTANCE.getString("_UI_Add_to_parent_Mapped_Repository"));

		this.aggregation = aggregation;
		this.selectedIUs = selectedIUs;
		this.operation = operation;
	}

	public void execute() {
		unitsAddedToMappedRepo.clear();
		rulesAddedToMappedRepo.clear();

		for(IInstallableUnit iu : selectedIUs) {
			MappedRepository repo = mapIUMappedRepo.get(iu);

			if(!repo.isEnabled())
				continue;

			if((operation & AggregatorEditPlugin.ADD_IU) > 0) {
				MappedUnit unit = ItemUtils.findMappedUnit(repo, iu);

				if(unit == null) {
					unit = AggregatorFactory.eINSTANCE.createMappedUnit(iu);
					repo.addUnit(unit);

					List<MappedUnit> units = unitsAddedToMappedRepo.get(repo);
					if(units == null) {
						units = new ArrayList<MappedUnit>();
						unitsAddedToMappedRepo.put(repo, units);
					}
					units.add(unit);
				}
			}
			else if((operation & (AggregatorEditPlugin.ADD_EXCLUSION_RULE | AggregatorEditPlugin.ADD_VALID_CONFIGURATIONS_RULE)) > 0) {
				MapRule rule = ItemUtils.findMapRule(repo, iu);

				if(rule == null) {
					rule = AggregatorFactory.eINSTANCE.createMapRule(
						iu, (operation & AggregatorEditPlugin.ADD_EXCLUSION_RULE) > 0
								? ExclusionRule.class
								: ValidConfigurationsRule.class);
					repo.getMapRules().add(rule);

					List<MapRule> rules = rulesAddedToMappedRepo.get(repo);
					if(rules == null) {
						rules = new ArrayList<MapRule>();
						rulesAddedToMappedRepo.put(repo, rules);
					}
					rules.add(rule);
				}
			}
		}

	}

	@Override
	protected boolean prepare() {
		boolean someEnabled = false;

		for(IInstallableUnit iu : selectedIUs) {
			if(!(((EObject) iu).eContainer() instanceof MetadataRepository))
				return false;

			MetadataRepository mdr = (MetadataRepository) ((EObject) iu).eContainer();
			MappedRepository mappedRepo = ItemUtils.findMappedRepository(aggregation, mdr);

			if(mappedRepo == null)
				continue;

			if(ItemUtils.findMappedUnit(mappedRepo, iu) != null || ItemUtils.findMapRule(mappedRepo, iu) != null)
				return false;

			mapIUMappedRepo.put(iu, mappedRepo);
			someEnabled = someEnabled || mappedRepo.isBranchEnabled();
		}

		return mapIUMappedRepo.size() > 0 && someEnabled;
	}

	public void redo() {
		for(MappedRepository mappedRepo : unitsAddedToMappedRepo.keySet()) {
			for(MappedUnit unit : unitsAddedToMappedRepo.get(mappedRepo))
				mappedRepo.removeUnit(unit);

			for(MapRule rule : rulesAddedToMappedRepo.get(mappedRepo))
				mappedRepo.getMapRules().remove(rule);
		}
	}

}
