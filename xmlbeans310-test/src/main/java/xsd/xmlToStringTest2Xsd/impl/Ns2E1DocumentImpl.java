/*
 * An XML document type.
 * Localname: Ns2E1
 * Namespace: XmlToStringTest2Xsd.xsd
 * Java type: xsd.xmlToStringTest2Xsd.Ns2E1Document
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest2Xsd.impl;
/**
 * A document containing one Ns2E1(@XmlToStringTest2Xsd.xsd) element.
 *
 * This is a complex type.
 */
public class Ns2E1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.xmlToStringTest2Xsd.Ns2E1Document
{
    private static final long serialVersionUID = 1L;
    
    public Ns2E1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NS2E1$0 = 
        new javax.xml.namespace.QName("XmlToStringTest2Xsd.xsd", "Ns2E1");
    
    
    /**
     * Gets the "Ns2E1" element
     */
    public xsd.xmlToStringTest2Xsd.Ns2T1 getNs2E1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.xmlToStringTest2Xsd.Ns2T1 target = null;
            target = (xsd.xmlToStringTest2Xsd.Ns2T1)get_store().find_element_user(NS2E1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ns2E1" element
     */
    public void setNs2E1(xsd.xmlToStringTest2Xsd.Ns2T1 ns2E1)
    {
        generatedSetterHelperImpl(ns2E1, NS2E1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Ns2E1" element
     */
    public xsd.xmlToStringTest2Xsd.Ns2T1 addNewNs2E1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.xmlToStringTest2Xsd.Ns2T1 target = null;
            target = (xsd.xmlToStringTest2Xsd.Ns2T1)get_store().add_element_user(NS2E1$0);
            return target;
        }
    }
}
