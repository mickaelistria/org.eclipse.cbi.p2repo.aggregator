/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.ui.commands;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.wizard.IWizard;

/**
 * Interface for a wizard that should run before a wrapped command is executed.
 * 
 */
public interface ICmdWizard extends IWizard {

	/**
	 * The result available after the wizard has finished.
	 * 
	 * @return
	 */
	IStatus getResult();

	void setCmdWork(CmdUnitOfWork work);
}
