/*
 * XML Type:  Ns3T1
 * Namespace: XmlToStringTest3Xsd.xsd
 * Java type: xsd.xmlToStringTest3Xsd.Ns3T1
 *
 * Automatically generated - do not modify.
 */
package xsd.xmlToStringTest3Xsd.impl;
/**
 * An XML Ns3T1(@XmlToStringTest3Xsd.xsd).
 *
 * This is a complex type.
 */
public class Ns3T1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xsd.xmlToStringTest3Xsd.Ns3T1
{
    private static final long serialVersionUID = 1L;
    
    public Ns3T1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NS3T1E1$0 = 
        new javax.xml.namespace.QName("", "Ns3T1E1");
    
    
    /**
     * Gets the "Ns3T1E1" element
     */
    public xsd.xmlToStringTest1Xsd.Ns1T1 getNs3T1E1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.xmlToStringTest1Xsd.Ns1T1 target = null;
            target = (xsd.xmlToStringTest1Xsd.Ns1T1)get_store().find_element_user(NS3T1E1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ns3T1E1" element
     */
    public void setNs3T1E1(xsd.xmlToStringTest1Xsd.Ns1T1 ns3T1E1)
    {
        generatedSetterHelperImpl(ns3T1E1, NS3T1E1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Ns3T1E1" element
     */
    public xsd.xmlToStringTest1Xsd.Ns1T1 addNewNs3T1E1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xsd.xmlToStringTest1Xsd.Ns1T1 target = null;
            target = (xsd.xmlToStringTest1Xsd.Ns1T1)get_store().add_element_user(NS3T1E1$0);
            return target;
        }
    }
}
