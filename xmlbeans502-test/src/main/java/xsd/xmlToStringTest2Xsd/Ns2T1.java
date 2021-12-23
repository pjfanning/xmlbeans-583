/*
 * XML Type:  Ns2T1
 * Namespace: XmlToStringTest2Xsd.xsd
 * Java type: xsd.xmlToStringTest2Xsd.Ns2T1
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest2Xsd;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Ns2T1(@XmlToStringTest2Xsd.xsd).
 *
 * This is a complex type.
 */
public interface Ns2T1 extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<xsd.xmlToStringTest2Xsd.Ns2T1> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s9006BACE6E2055EAEA6EEA25ADA93687.TypeSystemHolder.typeSystem, "ns2t1c548type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Ns2T1E1" element
     */
    xsd.xmlToStringTest1Xsd.Ns1T1 getNs2T1E1();

    /**
     * Sets the "Ns2T1E1" element
     */
    void setNs2T1E1(xsd.xmlToStringTest1Xsd.Ns1T1 ns2T1E1);

    /**
     * Appends and returns a new empty "Ns2T1E1" element
     */
    xsd.xmlToStringTest1Xsd.Ns1T1 addNewNs2T1E1();
}
