/*
 * XML Type:  Ns2T1
 * Namespace: XmlToStringTest2Xsd.xsd
 * Java type: xsd.xmlToStringTest2Xsd.Ns2T1
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest2Xsd.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML Ns2T1(@XmlToStringTest2Xsd.xsd).
 *
 * This is a complex type.
 */
public class Ns2T1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.xmlToStringTest2Xsd.Ns2T1 {
    private static final long serialVersionUID = 1L;

    public Ns2T1Impl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("XmlToStringTest2Xsd.xsd", "Ns2T1E1"),
    };


    /**
     * Gets the "Ns2T1E1" element
     */
    @Override
    public xsd.xmlToStringTest1Xsd.Ns1T1 getNs2T1E1() {
        synchronized (monitor()) {
            check_orphaned();
            xsd.xmlToStringTest1Xsd.Ns1T1 target = null;
            target = (xsd.xmlToStringTest1Xsd.Ns1T1)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Ns2T1E1" element
     */
    @Override
    public void setNs2T1E1(xsd.xmlToStringTest1Xsd.Ns1T1 ns2T1E1) {
        generatedSetterHelperImpl(ns2T1E1, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Ns2T1E1" element
     */
    @Override
    public xsd.xmlToStringTest1Xsd.Ns1T1 addNewNs2T1E1() {
        synchronized (monitor()) {
            check_orphaned();
            xsd.xmlToStringTest1Xsd.Ns1T1 target = null;
            target = (xsd.xmlToStringTest1Xsd.Ns1T1)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
