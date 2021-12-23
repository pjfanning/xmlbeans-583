/*
 * XML Type:  Ns3T1
 * Namespace: XmlToStringTest3Xsd.xsd
 * Java type: xsd.xmlToStringTest3Xsd.Ns3T1
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest3Xsd;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Ns3T1(@XmlToStringTest3Xsd.xsd).
 *
 * This is a complex type.
 */
public interface Ns3T1 extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<xsd.xmlToStringTest3Xsd.Ns3T1> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s9006BACE6E2055EAEA6EEA25ADA93687.TypeSystemHolder.typeSystem, "ns3t102e8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Ns3T1E1" element
     */
    xsd.xmlToStringTest1Xsd.Ns1T1 getNs3T1E1();

    /**
     * Sets the "Ns3T1E1" element
     */
    void setNs3T1E1(xsd.xmlToStringTest1Xsd.Ns1T1 ns3T1E1);

    /**
     * Appends and returns a new empty "Ns3T1E1" element
     */
    xsd.xmlToStringTest1Xsd.Ns1T1 addNewNs3T1E1();
}
