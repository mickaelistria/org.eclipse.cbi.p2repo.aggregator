/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.util;

import java.util.Collection;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @author michal.ruzicka@cloudsmith.com
 * 
 */
public class LinkCommand extends SetCommand implements DragAndDropFeedback {

	public LinkCommand(EditingDomain domain, EObject owner, Object value) {
		super(domain, owner, AggregatorPackage.Literals.LINK_SOURCE__RECEIVER, value);
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
