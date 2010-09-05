/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.build.ui.commands;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

/**
 * This configurable wizard dialog provides manipulation of wizard's buttons
 * 
 */
public class ConfigurableWizardDialog extends WizardDialog {

	/**
	 * @param parentShell
	 * @param newWizard
	 */
	public ConfigurableWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	public void configureButtonsForEndPage() {
		// disable Cancel
		Button b = getButton(IDialogConstants.CANCEL_ID);
		b.setEnabled(false);

		// modify label of finish
		b = getButton(IDialogConstants.FINISH_ID);
		b.setText("Close");

		// hide next and previous buttons (if available
		b = getButton(IDialogConstants.NEXT_ID);
		if(b != null)
			b.setVisible(false);
		b = getButton(IDialogConstants.BACK_ID);
		if(b != null)
			b.setVisible(false);

	}
}
