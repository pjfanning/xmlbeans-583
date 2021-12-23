/*
 * An XML document type.
 * Localname: Ns3E1
 * Namespace: XmlToStringTest3Xsd.xsd
 * Java type: xsd.xmlToStringTest3Xsd.Ns3E1Document
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest3Xsd.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one Ns3E1(@XmlToStringTest3Xsd.xsd) element.
 *
 * This is a complex type.
 */
public class Ns3E1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.xmlToStringTest3Xsd.Ns3E1Document {
    private static final long serialVersionUID = 1L;

    public Ns3E1DocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("XmlToStringTest3Xsd.xsd", "Ns3E1"),
    };


    /**
     * Gets the "Ns3E1" element
     */
    @Override
    public xsd.xmlToStringTest3Xsd.Ns3T1 getNs3E1() {
        synchronized (monitor()) {
            check_orphaned();
            xsd.xmlToStringTest3Xsd.Ns3T1 target = null;
            target = (xsd.xmlToStringTest3Xsd.Ns3T1)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Ns3E1" element
     */
    @Override
    public void setNs3E1(xsd.xmlToStringTest3Xsd.Ns3T1 ns3E1) {
        generatedSetterHelperImpl(ns3E1, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Ns3E1" element
     */
    @Override
    public xsd.xmlToStringTest3Xsd.Ns3T1 addNewNs3E1() {
        synchronized (monitor()) {
            check_orphaned();
            xsd.xmlToStringTest3Xsd.Ns3T1 target = null;
            target = (xsd.xmlToStringTest3Xsd.Ns3T1)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
