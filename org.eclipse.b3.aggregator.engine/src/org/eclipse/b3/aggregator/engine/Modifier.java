/**
 * Copyright (c) 2006-2010, Markus Alexander Kuppe.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.aggregator.engine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.b3.aggregator.Aggregator;
import org.eclipse.b3.aggregator.AggregatorFactory;
import org.eclipse.b3.aggregator.MetadataRepositoryReference;
import org.eclipse.b3.aggregator.impl.MetadataRepositoryReferenceImpl;
import org.eclipse.b3.util.ExceptionUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.kohsuke.args4j.Option;

/**
 * @author Markus Alexaneder Kuppe <b3-dev_eclipse.org@lemmster dot de>
 * 
 */
public class Modifier extends ModelAbstractCommand {
	public enum ActionType {
		ADD, REMOVE
	}

	@Option(name = "--action", usage = "Specifies the type of the execution.")
	private ActionType action;

	@Option(name = "--repoLocation", usage = "Appoints a new repository for aggregation")
	private String repoLocation;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.cli.AbstractCommand#getShortDescription()
	 */
	@Override
	public String getShortDescription() {
		return "Modifies the aggregates model from the command line";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.b3.cli.AbstractCommand#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected int run(IProgressMonitor monitor) throws Exception {
		try {
			final Aggregator aggregator = loadModelFromFile();

			if(action == ActionType.ADD) {
				// create a b3 metadata repo from the String
				final MetadataRepositoryReferenceImpl newRepository = (MetadataRepositoryReferenceImpl) AggregatorFactory.eINSTANCE.createMetadataRepositoryReference();
				newRepository.setLocation(repoLocation);

				// add new repository to the existing onces
				final EList<MetadataRepositoryReference> metadataRepos = aggregator.getValidationRepositories();
				metadataRepos.add(newRepository);
			}
			else if(action == ActionType.REMOVE) {
				final Set<MetadataRepositoryReference> removees = new HashSet<MetadataRepositoryReference>();
				final EList<MetadataRepositoryReference> metadataRepos = aggregator.getValidationRepositories();
				for(MetadataRepositoryReference metadataRepositoryReference : metadataRepos) {
					if(metadataRepositoryReference.getLocation().equals(repoLocation)) {
						removees.add(metadataRepositoryReference);
					}
				}

				if(removees.size() == 0) {
					throw ExceptionUtils.fromMessage("Unable to find validation repository " + repoLocation);
				}
				metadataRepos.removeAll(removees);
			}

			// store the model persistently
			final EObject eObj = (EObject) aggregator;
			final Resource resource = eObj.eResource();
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			resource.save(saveOptions);

		}
		catch(Exception e) {
			ExceptionUtils.wrap(e);
		}

		return 0;
	}
}
