/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.transformer.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.b3.aggregator.transformer.TransformerContextContributor;
import org.eclipse.jface.wizard.WizardPage;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public abstract class TransformerContributorWizardPage extends WizardPage implements
		TransformerContextContributor.IInteractiveHook {

	protected Map<String, Object> defaultContext = new HashMap<String, Object>();

	protected TransformerContributorWizardPage(String pageName) {
		super(pageName);
	}

	public final void setContextContributor(TransformerContextContributor contributor) {
		contributor.contributeDefaultsToContext(defaultContext);
		contributor.setInteractiveHook(this);
	}
}
