/*
 * An XML document type.
 * Localname: Ns3E1
 * Namespace: XmlToStringTest3Xsd.xsd
 * Java type: xsd.xmlToStringTest3Xsd.Ns3E1Document
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest3Xsd;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Ns3E1(@XmlToStringTest3Xsd.xsd) element.
 *
 * This is a complex type.
 */
public interface Ns3E1Document extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<xsd.xmlToStringTest3Xsd.Ns3E1Document> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s9006BACE6E2055EAEA6EEA25ADA93687.TypeSystemHolder.typeSystem, "ns3e1a007doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Ns3E1" element
     */
    xsd.xmlToStringTest3Xsd.Ns3T1 getNs3E1();

    /**
     * Sets the "Ns3E1" element
     */
    void setNs3E1(xsd.xmlToStringTest3Xsd.Ns3T1 ns3E1);

    /**
     * Appends and returns a new empty "Ns3E1" element
     */
    xsd.xmlToStringTest3Xsd.Ns3T1 addNewNs3E1();
}
