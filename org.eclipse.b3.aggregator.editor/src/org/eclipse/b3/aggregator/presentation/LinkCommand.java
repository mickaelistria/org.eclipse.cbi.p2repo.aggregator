package org.eclipse.b3.aggregator.presentation;

import java.util.Collection;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.LinkReceiver;
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
public class LinkCommand extends StaticSelectionCommandAction {
	protected LinkReceiver linkReceiver;

	protected boolean doLink;

	protected String label;

	public LinkCommand(IEditorPart activeEditorPart, ISelection selection, LinkReceiver linkReceiver, String label,
			boolean doLink) {
		super(activeEditorPart);

		this.linkReceiver = linkReceiver;
		this.label = label;
		this.doLink = doLink;

		configureAction(selection);
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain, Collection<?> collection) {
		SetCommand command = new SetCommand(
			editingDomain, (EObject) collection.iterator().next(), AggregatorPackage.Literals.LINK_SOURCE__RECEIVER,
			doLink
					? linkReceiver
					: SetCommand.UNSET_VALUE);

		command.setLabel(label);
		setText(label);

		String description = (doLink
				? "Link to"
				: "Unlink from") + " \"" + label + "\"";
		command.setDescription(description);
		setDescription(description);

		return command;
	}
}
