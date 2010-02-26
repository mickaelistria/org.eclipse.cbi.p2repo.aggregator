package org.eclipse.b3.aggregator.legacy;

import java.util.Map;

import org.eclipse.b3.aggregator.util.ITransformerContextContributor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

/**
 * @author Karel Brezina
 * 
 */
public class AggregatorTransformer_090_2_100_WizardPage extends WizardPage implements ITransformerContextContributor {

	private static final String PAGE_ID = "AggregatorTransformer_090_2_100";

	private Combo transformationTypeCombo;

	private int selectedType = 0;

	public AggregatorTransformer_090_2_100_WizardPage() {
		super(PAGE_ID);
		setPageComplete(true);
		setTitle("Version to Version Range transformation");
		setDescription("Choose how to transform installable unit versions");
	}

	public void contributeToContext(Map<String, Object> context) {
		context.put(AggregatorTransformer_090_2_100.CONTEXT_FIXED_VERSION, Boolean.valueOf(selectedType == 1));
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));

		new Label(composite, SWT.NONE).setText("Target version range will include:");
		transformationTypeCombo = new Combo(composite, SWT.READ_ONLY);
		transformationTypeCombo.setItems(new String[] { "all versions >= specified version", "only specified version" });
		transformationTypeCombo.select(0);

		transformationTypeCombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				selectedType = transformationTypeCombo.getSelectionIndex();
			}
		});

		setControl(composite);
	}
}
