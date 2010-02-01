/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.util.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the package. <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.aggregator.util.AggregatorResourceImpl
 * @generated
 */
public class AggregatorResourceFactoryImpl extends ResourceFactoryImpl {

	private static String LEGACY_TRANSFORMATION_ID = "org.eclipse.b3.aggregator.legacy_transformation";

	private static String LEGACY_TRANSFORMATION_ATTR_CLASS = "class";

	private static String LEGACY_TRANSFORMATION_ATTR_SOURCE_NS = "sourceNS";

	private static String LEGACY_TRANSFORMATION_ATTR_TARGET_NS = "targetNS";

	private static String LEGACY_TRANSFORMATION_ATTR_SOURCE_TOP_ELEMENT = "sourceTopElement";

	private static String LEGACY_TRANSFORMATION_ATTR_SOURCE_NS_ATTRIBUTE = "sourceNSAttribute";

	private static String LEGACY_TRANSFORMATION_ATTR_SOURCE_ECORE = "sourceEcoreUri";

	private static String LEGACY_TRANSFORMATION_ATTR_TARGET_ECORE = "targetEcoreUri";

	private static String getResourceXMLNS(URI resourceURI, final String resourceTopNodeName,
			final String resourceNSAttributeName) {

		class XMLNSHandler extends DefaultHandler {
			private String xmlns;

			public String getXMLNS() {
				return xmlns;
			}

			@Override
			public void startElement(String nsURI, String strippedName, String tagName, Attributes attributes)
					throws SAXException {
				if(tagName.equalsIgnoreCase(resourceTopNodeName)) {
					xmlns = attributes.getValue(resourceNSAttributeName);
					throw new SAXException("XMLNS is read");
				}
			}
		}

		XMLReader parser;
		XMLNSHandler xmlnsHandler = null;
		try {
			parser = XMLReaderFactory.createXMLReader();
			xmlnsHandler = new XMLNSHandler();
			parser.setContentHandler(xmlnsHandler);

			// this is needed for parser to provide even "xmlns*" attributes
			parser.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
			parser.parse(new InputSource(new ExtensibleURIConverterImpl().createInputStream(resourceURI)));
		}
		catch(SAXException e) {
			if(xmlnsHandler != null)
				return xmlnsHandler.getXMLNS();
		}
		catch(IOException e) {
			// do not care
		}
		return null;
	}

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregatorResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Resource createResource(URI uri) {

		String topElement = AggregatorPackage.eNS_PREFIX + ":" + AggregatorPackage.eINSTANCE.getAggregator().getName();
		String nsAttribute = XMLResource.XML_NS + ":" + AggregatorPackage.eNAME;

		String xmlns = getResourceXMLNS(uri, topElement, nsAttribute);

		Resource originalResource = new AggregatorResourceImpl(uri);

		if(AggregatorPackage.eNS_URI.equals(xmlns))
			return originalResource;

		Set<String> nsPaths = new HashSet<String>();
		nsPaths.add(topElement + "/" + nsAttribute);

		IConfigurationElement[] transformations = Platform.getExtensionRegistry().getConfigurationElementsFor(
				LEGACY_TRANSFORMATION_ID);

		int i = 0;

		while(xmlns == null && i < transformations.length) {
			topElement = transformations[i].getAttribute(LEGACY_TRANSFORMATION_ATTR_SOURCE_TOP_ELEMENT);
			nsAttribute = transformations[i].getAttribute(LEGACY_TRANSFORMATION_ATTR_SOURCE_NS_ATTRIBUTE);
			i++;

			if(StringUtils.trimmedOrNull(topElement) != null && StringUtils.trimmedOrNull(nsAttribute) != null
					&& !nsPaths.contains(topElement + "/" + nsAttribute)) {
				xmlns = getResourceXMLNS(uri, topElement, nsAttribute);
				nsPaths.add(topElement + "/" + nsAttribute);
			}
		}

		if(xmlns == null)
			throw new IllegalArgumentException("Namespace cannot be found in resource " + uri.toString());

		String requiredSourceNS = xmlns;

		String requiredTargetNS = AggregatorPackage.eNS_URI;

		List<IConfigurationElement> transformationSequence = resolveTransformationSequence(transformations,
				requiredSourceNS, requiredTargetNS, new ArrayList<IConfigurationElement>());

		if(transformationSequence == null)
			throw new IllegalArgumentException(
					"No legacy transformation sequence was found to transform resource with namespace "
							+ requiredSourceNS + " to resource with the current namespace " + requiredTargetNS);

		Resource finalResult;
		try {
			finalResult = transformResource(transformationSequence, uri);
		}
		catch(Exception e) {
			// TODO proper error handling
			throw new RuntimeException(e);
		}

		return finalResult;
	}

	private List<IConfigurationElement> resolveTransformationSequence(IConfigurationElement[] transformations,
			String requiredSourceNS, String requiredTargetNS, List<IConfigurationElement> transformerSequence) {

		for(IConfigurationElement transformation : transformations) {
			String srcNS = transformation.getAttribute(LEGACY_TRANSFORMATION_ATTR_SOURCE_NS);
			String trgtNS = transformation.getAttribute(LEGACY_TRANSFORMATION_ATTR_TARGET_NS);

			if(requiredSourceNS.equals(srcNS)) {

				List<IConfigurationElement> newTransformerSequence = new ArrayList<IConfigurationElement>();
				newTransformerSequence.addAll(transformerSequence);
				newTransformerSequence.add(transformation);

				if(requiredTargetNS.equals(trgtNS)) {
					return newTransformerSequence;
				}
				else {
					List<IConfigurationElement> result = resolveTransformationSequence(transformations, trgtNS,
							requiredTargetNS, newTransformerSequence);
					if(result != null)
						return result;
				}
			}
		}

		return null;
	}

	private Resource transformResource(List<IConfigurationElement> transformationSequence, URI originalResourceURI)
			throws IOException, CoreException {

		ResourceSet ecoreRs01 = null;
		Resource ecoreRes01 = null;
		EPackage package01 = null;
		ResourceSet rs01 = null;
		Resource res01 = null;

		ResourceSet ecoreRs02 = null;
		Resource ecoreRes02 = null;
		EPackage package02 = null;
		ResourceSet rs02 = null;
		Resource res02 = null;

		int idx = 0;
		for(IConfigurationElement transformation : transformationSequence) {

			if(idx == 0) {
				ecoreRs01 = new ResourceSetImpl();
				ecoreRs01.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
						new EcoreResourceFactoryImpl());
				ecoreRes01 = ecoreRs01.getResource(
						URI.createURI(transformation.getAttribute(LEGACY_TRANSFORMATION_ATTR_SOURCE_ECORE)), true);
				package01 = (EPackage) ecoreRes01.getContents().get(0);

				rs01 = new ResourceSetImpl();
				rs01.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
				rs01.getPackageRegistry().put(package01.getNsURI(), package01);

				res01 = rs01.getResource(originalResourceURI, true);
				rs01.getResources().add(res01);
			}
			else {
				ecoreRs01 = ecoreRs02;
				ecoreRes01 = ecoreRes02;
				package01 = package02;
				rs01 = rs02;
				res01 = res02;
			}

			idx++;

			File tempFile = File.createTempFile("temp", ".b3aggr");
			tempFile.deleteOnExit();

			rs02 = new ResourceSetImpl();
			rs02.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

			if(AggregatorPackage.eNS_URI.equals(transformation.getAttribute(LEGACY_TRANSFORMATION_ATTR_TARGET_NS))) {
				package02 = AggregatorPackage.eINSTANCE;

				res02 = new AggregatorResourceImpl(URI.createURI(tempFile.toURI().toString()));
				rs02.getResources().add(res02);
			}
			else {
				ecoreRs02 = new ResourceSetImpl();
				ecoreRs02.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
						new EcoreResourceFactoryImpl());
				ecoreRes02 = ecoreRs02.getResource(
						URI.createURI(transformation.getAttribute(LEGACY_TRANSFORMATION_ATTR_TARGET_ECORE)), true);
				package02 = (EPackage) ecoreRes02.getContents().get(0);

				res02 = rs02.createResource(URI.createURI(tempFile.toURI().toString()));
			}

			rs02.getPackageRegistry().put(package02.getNsURI(), package02);

			ITransformer transformer = (ITransformer) transformation.createExecutableExtension(LEGACY_TRANSFORMATION_ATTR_CLASS);

			transformer.initTransformer(res01, res02, package02);
			transformer.startTransformation();
		}

		return res02;
	}
} // AggregatorResourceFactoryImpl
