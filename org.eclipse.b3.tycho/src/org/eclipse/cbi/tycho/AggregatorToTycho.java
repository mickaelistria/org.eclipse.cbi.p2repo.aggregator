/*******************************************************************************
 * Copyright (c) 2016 Red Hat Inc. and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mickael Istria (Red Hat Inc.) - 501424 - initial API and implementation
 *******************************************************************************/
package org.eclipse.cbi.tycho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.cbi.p2repo.aggregator.Aggregation;
import org.eclipse.cbi.p2repo.aggregator.Contribution;
import org.eclipse.cbi.p2repo.aggregator.CustomCategory;
import org.eclipse.cbi.p2repo.aggregator.Feature;
import org.eclipse.cbi.p2repo.aggregator.MappedRepository;
import org.eclipse.cbi.p2repo.aggregator.MappedUnit;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class AggregatorToTycho {

	private static final String LINE_SEP = System.getProperty("line.separator");
	private Aggregation agg;
	private Set<String> enabledRepoLocations = new HashSet<>();

	public AggregatorToTycho(Aggregation agg) {
		this.agg = agg;
	}

	public Map<IPath, String> createTychoFiles() {
		this.enabledRepoLocations.clear();
		StringBuilder tychoRepoBuilder = new StringBuilder();
		StringBuilder tychoMirrorRepoBuilder = new StringBuilder();
		StringBuilder categoriesBuilder = new StringBuilder();
		StringBuilder unitsBuilder = new StringBuilder();
		StringBuilder onlyCategorizedUnitsBuilder = new StringBuilder();
		StringBuilder mirrorUnitsBuilder = new StringBuilder();
		StringBuilder featureIncludesBuilder = new StringBuilder();
		StringBuilder p2iuRequiredBuilder = new StringBuilder();
		for (CustomCategory category : agg.getCustomCategories()) {
			addCategory(category, categoriesBuilder);
		}
		for (Contribution contribution : agg.getAllContributions(false)) {
			for (MappedRepository repo : contribution.getRepositories()) {
				addTychoRepo(repo, tychoRepoBuilder, contribution.isEnabled());
				addMirrorRepo(repo, tychoMirrorRepoBuilder, contribution.isEnabled());
				for (MappedUnit unit : repo.getUnits(false)) {
					addUnit(unit, unitsBuilder, agg.getCustomCategories(), contribution.isEnabled() && repo.isEnabled());
					addMirrorUnit(unit, mirrorUnitsBuilder, agg.getCustomCategories(), contribution.isEnabled() && repo.isEnabled());
					addFeatureIncludes(unit, featureIncludesBuilder, contribution.isEnabled() && repo.isEnabled());
					addp2IU(unit, p2iuRequiredBuilder, contribution.isEnabled() && repo.isEnabled());
					for (CustomCategory category : agg.getCustomCategories()) {
						if (category.getFeatures().contains(unit)) {
							addUnit(unit, onlyCategorizedUnitsBuilder, agg.getCustomCategories(), contribution.isEnabled() && repo.isEnabled() && unit.isEnabled());
							continue;
						}
					}
				}
			}
		}

		IPath[] files = new IPath[] {
			Path.fromOSString("pom.xml"),
			Path.fromOSString("regular/p2iu.xml"),
			Path.fromOSString("regular/pom.xml"),
			Path.fromOSString("site/category.xml"),
			Path.fromOSString("site/pom.xml"),
			Path.fromOSString("exceptions/pom.xml"),
			Path.fromOSString("categories/pom.xml"),
			Path.fromOSString("categories/category.xml"),
			Path.fromOSString("categories/removeUncategorized.xml")
		};
		Map<IPath, String> res = new HashMap<>();
		for (IPath path : files) {
			try (
				InputStream pomStream = getClass().getResourceAsStream(path.toString());
				BufferedReader pomReader = new BufferedReader(new InputStreamReader(pomStream));
			) {
				String line = null;
				StringBuilder pomXmlContent = new StringBuilder();
				while ((line = pomReader.readLine()) != null) {
					String newLine = line.replaceAll("__tychoRepositories__", tychoRepoBuilder.toString());
					newLine = newLine.replaceAll("__aggregationFileName__", agg.getLabel());
					newLine = newLine.replaceAll("__tychoRepositories__", tychoMirrorRepoBuilder.toString());
					newLine = newLine.replaceAll("__aggregationFileName__", agg.getLabel());
					newLine = newLine.replace("__mirrorUnits__", mirrorUnitsBuilder.toString());
					newLine = newLine.replaceAll("__categories__", categoriesBuilder.toString());
					newLine = newLine.replaceAll("__units__", unitsBuilder.toString());
					newLine = newLine.replaceAll("__fileName__", agg.getLabel());
					newLine = newLine.replaceAll("__description__", agg.getDescription());
					newLine = newLine.replaceAll("__featureIncludes__", featureIncludesBuilder.toString());
					newLine = newLine.replaceAll("__p2iuRequired__", p2iuRequiredBuilder.toString());
					newLine = newLine.replaceAll("__onlyCategorizedUnits__", onlyCategorizedUnitsBuilder.toString());
					pomXmlContent.append(newLine);
					pomXmlContent.append(LINE_SEP);
				}
				res.put(Path.fromOSString(path.toString()), pomXmlContent.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return res;
	}

	private void addp2IU(MappedUnit unit, StringBuilder p2iuRequiredBuilder, boolean parentEnabled) {
		if (!(parentEnabled && unit.isEnabled())) {
			p2iuRequiredBuilder.append("<!-- disabled ");
		}
		p2iuRequiredBuilder.append("<required namespace='org.eclipse.equinox.p2.iu' name='");
		p2iuRequiredBuilder.append(unit.getName());
		p2iuRequiredBuilder.append("' range='");
		p2iuRequiredBuilder.append(unit.getVersionRange().toString());
		p2iuRequiredBuilder.append("'");
		p2iuRequiredBuilder.append(" optional='true'");
		//p2iuRequiredBuilder.append(" greedy='true'");
		if (unit.getFilter() != null) {
			p2iuRequiredBuilder.append(">");
			p2iuRequiredBuilder.append(LINE_SEP);

			p2iuRequiredBuilder.append("  <filter><![CDATA[");
			p2iuRequiredBuilder.append(unit.getFilter().getParameters()[0].toString());
			p2iuRequiredBuilder.append("]]></filter>");
			p2iuRequiredBuilder.append(LINE_SEP);

			p2iuRequiredBuilder.append("</required>");
		} else {
			p2iuRequiredBuilder.append("/>");
		}
		if (!(parentEnabled && unit.isEnabled())) {
			p2iuRequiredBuilder.append(" -->");
		}

		p2iuRequiredBuilder.append(LINE_SEP);
	}

	private void addMirrorUnit(MappedUnit unit, StringBuilder mirrorUnitsBuilder, List<CustomCategory> customCategories, boolean parentEnabled) {
		if (!(parentEnabled && unit.isEnabled())) {
			mirrorUnitsBuilder.append(" <!-- disabled");
		}
		mirrorUnitsBuilder.append("<iu>");
		if (unit.getVersionRange().getMinimum().equals(unit.getVersionRange().getMaximum())) {
			mirrorUnitsBuilder.append("<id>");
			mirrorUnitsBuilder.append(unit.getName());
			mirrorUnitsBuilder.append("</id>");
			if (!unit.getVersionRange().toString().equals("0.0.0")) {
				mirrorUnitsBuilder.append("<version>");
				mirrorUnitsBuilder.append(unit.getVersionRange().getMinimum().toString());
				mirrorUnitsBuilder.append("</version>");
			}
		} else {
			mirrorUnitsBuilder.append("<query><expression><![CDATA[id == '");
			mirrorUnitsBuilder.append(unit.getName());
			mirrorUnitsBuilder.append("' && version ~= range('");
			mirrorUnitsBuilder.append(unit.getVersionRange().toString());
			mirrorUnitsBuilder.append("')]]></expression></query>");
		}
		mirrorUnitsBuilder.append("</iu>");
		if (!(parentEnabled && unit.isEnabled())) {
			mirrorUnitsBuilder.append(" -->");
		}
		mirrorUnitsBuilder.append(LINE_SEP);
	}

	private void addMirrorRepo(MappedRepository repo, StringBuilder tychoMirrorRepoBuilder, boolean parentEnabled) {
		if (!(parentEnabled && repo.isEnabled())) {
			tychoMirrorRepoBuilder.append("<!-- disabled ");
		}
		tychoMirrorRepoBuilder.append("<repository><url>");
		tychoMirrorRepoBuilder.append(repo.getLocation());
		tychoMirrorRepoBuilder.append("</url></repository>");
		if (!(parentEnabled && repo.isEnabled())) {
			tychoMirrorRepoBuilder.append(" -->");
		}
		tychoMirrorRepoBuilder.append(LINE_SEP);
	}

	private void addUnit(MappedUnit unit, final StringBuilder unitsBuilder, List<CustomCategory> allCategories, boolean parentEnabled) {
		if (!(parentEnabled && unit.isEnabled())) {
			unitsBuilder.append(" <!-- disabled");
		}
		unitsBuilder.append("<iu id=\"");
		unitsBuilder.append(unit.getName());
		unitsBuilder.append("\" range=\"");
		unitsBuilder.append(unit.getVersionRange().toString());
		unitsBuilder.append("\">");
		unitsBuilder.append(LINE_SEP);
		allCategories.stream().filter(category -> category.getFeatures().contains(unit)).forEach(category -> {
			unitsBuilder.append("  <category name=\"");
			unitsBuilder.append(category.getIdentifier());
			unitsBuilder.append("\"/>");
			unitsBuilder.append(LINE_SEP);
		});
		unitsBuilder.append("</iu>");
		unitsBuilder.append(LINE_SEP);
		if (!(parentEnabled && unit.isEnabled())) {
			unitsBuilder.append(" -->");
		}
	}

	private void addCategory(CustomCategory category, StringBuilder categoriesBuilder) {
		 categoriesBuilder.append("<category-def name=\"");
		 categoriesBuilder.append(category.getIdentifier());
		 categoriesBuilder.append("\" label=\"");
		 categoriesBuilder.append(category.getLabel());
		 categoriesBuilder.append("\">");
		 categoriesBuilder.append(LINE_SEP);
		 categoriesBuilder.append("  <description>");
		 categoriesBuilder.append(LINE_SEP);
		 categoriesBuilder.append(category.getDescription());
		 categoriesBuilder.append(LINE_SEP);
		 categoriesBuilder.append("  </description>");
		 categoriesBuilder.append(LINE_SEP);
	     categoriesBuilder.append("</category-def>");
	     categoriesBuilder.append(LINE_SEP);
	}

	private void addTychoRepo(MappedRepository repo, StringBuilder tychoRepoBuilder, boolean parentEnabled) {
		if (this.enabledRepoLocations.contains(repo.getLocation())) {
			return;
		}
		if (!(parentEnabled && repo.isEnabled())) {
			tychoRepoBuilder.append("<!--\n");
		}
		tychoRepoBuilder.append("<repository>\n");
		tychoRepoBuilder.append("	<id>");
		tychoRepoBuilder.append(makeId(repo.getLocation()));
		tychoRepoBuilder.append("	</id>");
		tychoRepoBuilder.append(LINE_SEP);
		tychoRepoBuilder.append("	<url>");
		tychoRepoBuilder.append(repo.getLocation());
		tychoRepoBuilder.append("	</url>\n");
		tychoRepoBuilder.append("	<layout>p2</layout>\n");
		tychoRepoBuilder.append("</repository>\n");
		if (!(parentEnabled && repo.isEnabled())) {
			tychoRepoBuilder.append("-->\n");
		} else {
			this.enabledRepoLocations.add(repo.getLocation());
		}
	}

	private String makeId(String url) {
		return URI.create(url).getPath().replaceAll("/", "_");
	}

	private void addFeatureIncludes(MappedUnit unit, StringBuilder featureIncludes, boolean parentEnabled) {
		if (unit instanceof Feature) {
			if (!(parentEnabled && unit.isEnabled())) {
				featureIncludes.append("<!-- diasabled ");
			}
			featureIncludes.append("<includes id='");
			featureIncludes.append(unit.getName().endsWith(".feature.group") ? unit.getName().substring(0, unit.getName().length() - ".feature.group".length()) : unit.getName());
			featureIncludes.append("' version='");
			String version = "0.0.0";
			if (unit.getVersionRange().getMinimum().equals(unit.getVersionRange().getMaximum())) {
				version = unit.getVersionRange().getMinimum().toString();
			}
			featureIncludes.append(version);
			featureIncludes.append("' optional='true'/>");
			if (!(parentEnabled && unit.isEnabled())) {
				featureIncludes.append(" -->");
			}
			featureIncludes.append(LINE_SEP);
		} else {
			featureIncludes.append("<!-- Not supported ");
			featureIncludes.append(unit.toString());
			featureIncludes.append(" -->");
			featureIncludes.append(LINE_SEP);
		}
	}
}
