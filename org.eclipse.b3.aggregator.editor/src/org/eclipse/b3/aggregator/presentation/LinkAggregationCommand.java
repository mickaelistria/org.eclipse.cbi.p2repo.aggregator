package org.eclipse.b3.aggregator.presentation;

import java.util.Collection;

import org.eclipse.b3.aggregator.Aggregation;
import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 * A action to link/unlink a contribution to/from an aggregation.
 * It is implemented by creating a {@link SetCommand}.
 */
public class LinkAggregationCommand extends StaticSelectionCommandAction {
	protected Aggregation aggregation;

	protected boolean doLink;

	public LinkAggregationCommand(IEditorPart activeEditorPart, ISelection selection, Aggregation aggregation,
			boolean doLink) {
		super(activeEditorPart);

		this.aggregation = aggregation;
		this.doLink = doLink;

		configureAction(selection);
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		SetCommand command = new SetCommand(
			editingDomain, (EObject) collection.iterator().next(),
			AggregatorPackage.Literals.CONTRIBUTION__AGGREGATION, doLink
					? aggregation
					: null);

		String name = aggregation.getLabel();
		command.setLabel(name);
		setText(name);

		String description = (doLink
				? "Add contribution to"
				: "Remove contribution from") + " \"" + name + "\"";
		command.setDescription(description);
		setDescription(description);

		return command;
	}
}
