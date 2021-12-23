/*
 * XML Type:  Ns1T1
 * Namespace: XmlToStringTest1Xsd.xsd
 * Java type: xsd.xmlToStringTest1Xsd.Ns1T1
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest1Xsd.impl;
/**
 * An XML Ns1T1(@XmlToStringTest1Xsd.xsd).
 *
 * This is a complex type.
 */
public class Ns1T1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.xmlToStringTest1Xsd.Ns1T1
{
    private static final long serialVersionUID = 1L;
    
    public Ns1T1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NS1T1E1$0 = 
        new javax.xml.namespace.QName("XmlToStringTest1Xsd.xsd", "Ns1T1E1");
    
    
    /**
     * Gets the "Ns1T1E1" element
     */
    public java.lang.String getNs1T1E1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NS1T1E1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ns1T1E1" element
     */
    public org.apache.xmlbeans.XmlString xgetNs1T1E1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NS1T1E1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Ns1T1E1" element
     */
    public void setNs1T1E1(java.lang.String ns1T1E1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NS1T1E1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NS1T1E1$0);
            }
            target.setStringValue(ns1T1E1);
        }
    }
    
    /**
     * Sets (as xml) the "Ns1T1E1" element
     */
    public void xsetNs1T1E1(org.apache.xmlbeans.XmlString ns1T1E1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NS1T1E1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NS1T1E1$0);
            }
            target.set(ns1T1E1);
        }
    }
}
