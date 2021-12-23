/*
 * An XML document type.
 * Localname: Ns2E1
 * Namespace: XmlToStringTest2Xsd.xsd
 * Java type: xsd.xmlToStringTest2Xsd.Ns2E1Document
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest2Xsd;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Ns2E1(@XmlToStringTest2Xsd.xsd) element.
 *
 * This is a complex type.
 */
public interface Ns2E1Document extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<xsd.xmlToStringTest2Xsd.Ns2E1Document> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s9006BACE6E2055EAEA6EEA25ADA93687.TypeSystemHolder.typeSystem, "ns2e16267doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Ns2E1" element
     */
    xsd.xmlToStringTest2Xsd.Ns2T1 getNs2E1();

    /**
     * Sets the "Ns2E1" element
     */
    void setNs2E1(xsd.xmlToStringTest2Xsd.Ns2T1 ns2E1);

    /**
     * Appends and returns a new empty "Ns2E1" element
     */
    xsd.xmlToStringTest2Xsd.Ns2T1 addNewNs2E1();
}
