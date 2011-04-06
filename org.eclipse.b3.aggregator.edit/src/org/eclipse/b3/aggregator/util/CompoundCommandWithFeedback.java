package org.eclipse.b3.aggregator.util;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DragAndDropFeedback;

public class CompoundCommandWithFeedback extends CompoundCommand implements DragAndDropFeedback {

	public CompoundCommandWithFeedback() {
		super();
	}

	public CompoundCommandWithFeedback(int resultIndex) {
		super(resultIndex);
	}

	public CompoundCommandWithFeedback(int resultIndex, List<Command> commandList) {
		super(resultIndex, commandList);
	}

	public CompoundCommandWithFeedback(int resultIndex, String label) {
		super(resultIndex, label);
	}

	public CompoundCommandWithFeedback(int resultIndex, String label, List<Command> commandList) {
		super(resultIndex, label, commandList);
	}

	public CompoundCommandWithFeedback(int resultIndex, String label, String description) {
		super(resultIndex, label, description);
	}

	public CompoundCommandWithFeedback(int resultIndex, String label, String description, List<Command> commandList) {
		super(resultIndex, label, description, commandList);
	}

	public CompoundCommandWithFeedback(List<Command> commandList) {
		super(commandList);
	}

	public CompoundCommandWithFeedback(String label) {
		super(label);
	}

	public CompoundCommandWithFeedback(String label, List<Command> commandList) {
		super(label, commandList);
	}

	public CompoundCommandWithFeedback(String label, String description) {
		super(label, description);
	}

	public CompoundCommandWithFeedback(String label, String description, List<Command> commandList) {
		super(label, description, commandList);
	}

	public int getFeedback() {
		return FEEDBACK_SELECT;
	}

	public int getOperation() {
		return DROP_LINK;
	}

	public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
		return true;
	}

}
