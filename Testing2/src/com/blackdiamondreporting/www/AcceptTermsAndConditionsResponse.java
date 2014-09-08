/**
 * AcceptTermsAndConditionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.blackdiamondreporting.www;

public class AcceptTermsAndConditionsResponse  implements java.io.Serializable {
    private boolean acceptTermsAndConditionsResult;

    public AcceptTermsAndConditionsResponse() {
    }

    public AcceptTermsAndConditionsResponse(
           boolean acceptTermsAndConditionsResult) {
           this.acceptTermsAndConditionsResult = acceptTermsAndConditionsResult;
    }


    /**
     * Gets the acceptTermsAndConditionsResult value for this AcceptTermsAndConditionsResponse.
     * 
     * @return acceptTermsAndConditionsResult
     */
    public boolean isAcceptTermsAndConditionsResult() {
        return acceptTermsAndConditionsResult;
    }


    /**
     * Sets the acceptTermsAndConditionsResult value for this AcceptTermsAndConditionsResponse.
     * 
     * @param acceptTermsAndConditionsResult
     */
    public void setAcceptTermsAndConditionsResult(boolean acceptTermsAndConditionsResult) {
        this.acceptTermsAndConditionsResult = acceptTermsAndConditionsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcceptTermsAndConditionsResponse)) return false;
        AcceptTermsAndConditionsResponse other = (AcceptTermsAndConditionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.acceptTermsAndConditionsResult == other.isAcceptTermsAndConditionsResult();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isAcceptTermsAndConditionsResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcceptTermsAndConditionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", ">AcceptTermsAndConditionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptTermsAndConditionsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", "AcceptTermsAndConditionsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
