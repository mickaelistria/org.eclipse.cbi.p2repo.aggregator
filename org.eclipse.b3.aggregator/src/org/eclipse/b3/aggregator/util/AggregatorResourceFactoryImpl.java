/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.util;

import java.io.IOException;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
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

		String topNode = AggregatorPackage.eNS_PREFIX + ":" + AggregatorPackage.eINSTANCE.getAggregator().getName();
		String nsAttribute = "xmlns:" + AggregatorPackage.eNAME;

		String xmlns = getResourceXMLNS(uri, topNode, nsAttribute);

		Resource result = new AggregatorResourceImpl(uri);

		if(xmlns.equals(AggregatorPackage.eNS_URI))
			return result;

		return result;
	}
} // AggregatorResourceFactoryImpl
