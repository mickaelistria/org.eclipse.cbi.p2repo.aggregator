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

import org.eclipse.b3.aggregator.Contribution;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.b3.aggregator.provider.AggregatorEditPlugin;
import org.eclipse.b3.p2.MetadataRepository;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;

/**
 * @author Karel Brezina
 * 
 */
public class AddIUsToContributionCommand extends AbstractCommand implements DragAndDropFeedback {
	private Contribution contribution;

	private List<MetadataRepository> selectedMDRs;

	private List<IInstallableUnit> selectedIUs;

	private List<MappedRepository> addedMappedRepos = new ArrayList<MappedRepository>();

	private List<MappedUnit> addedMappedUnits = new ArrayList<MappedUnit>();

	public AddIUsToContributionCommand(Contribution contribution, List<MetadataRepository> selectedMDRs,
			List<IInstallableUnit> selectedIUs) {
		super(AggregatorEditPlugin.INSTANCE.getString("_UI_Map_to_command_prefix") +
				" " +
				((contribution.getLabel() == null || contribution.getLabel().length() == 0)
						? AggregatorEditPlugin.INSTANCE.getString("_UI_Contribution_type") + " ''"
						: AggregatorEditPlugin.INSTANCE.getString("_UI_Contribution_type") + " " +
								contribution.getLabel()));

		this.contribution = contribution;
		this.selectedMDRs = selectedMDRs;
		this.selectedIUs = selectedIUs;
	}

	public void execute() {
		addedMappedRepos.clear();
		addedMappedUnits.clear();

		for(MetadataRepository mdr : selectedMDRs) {
			MappedRepository newMappedRepo = ItemUtils.addMDR(contribution, mdr);
			if(newMappedRepo != null)
				addedMappedRepos.add(newMappedRepo);
		}

		for(IInstallableUnit iu : selectedIUs) {
			if(!(((EObject) iu).eContainer() instanceof MetadataRepository))
				return;

			MetadataRepository mdr = (MetadataRepository) ((EObject) iu).eContainer();

			MappedRepository mappedRepo = ItemUtils.findMappedRepository(contribution, mdr);
			if(mappedRepo == null) {
				MappedRepository newMappedRepo = ItemUtils.addMDR(contribution, mdr);
				if(newMappedRepo != null) {
					addedMappedRepos.add(newMappedRepo);
					mappedRepo = newMappedRepo;
				}
			}

			MappedUnit newMU = ItemUtils.addIU(mappedRepo, iu);
			if(newMU != null)
				addedMappedUnits.add(newMU);
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
		boolean result = contribution != null && contribution.isEnabled() &&
				(selectedMDRs != null && selectedMDRs.size() > 0 || selectedIUs != null && selectedIUs.size() > 0);

		if(result)
			for(IInstallableUnit iu : selectedIUs) {
				if(!(((EObject) iu).eContainer() instanceof MetadataRepository))
					return false;

				MetadataRepository mdr = (MetadataRepository) ((EObject) iu).eContainer();

				MappedRepository mappedRepo = ItemUtils.findMappedRepository(contribution, mdr);
				if(mappedRepo != null)
					if(ItemUtils.findMappedUnit(mappedRepo, iu) != null ||
							ItemUtils.findMapRule(mappedRepo, iu) != null)
						return false;
			}

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

		contribution.getRepositories().removeAll(addedMappedRepos);
	}

	// validated prior command creation
	public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
		return true;
	}
}
