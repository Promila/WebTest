/**
 * PartnerDataBatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.blackdiamondreporting.www;

public class PartnerDataBatch  implements java.io.Serializable {
    private int batchID;

    private boolean isDownloaded;

    public PartnerDataBatch() {
    }

    public PartnerDataBatch(
           int batchID,
           boolean isDownloaded) {
           this.batchID = batchID;
           this.isDownloaded = isDownloaded;
    }


    /**
     * Gets the batchID value for this PartnerDataBatch.
     * 
     * @return batchID
     */
    public int getBatchID() {
        return batchID;
    }


    /**
     * Sets the batchID value for this PartnerDataBatch.
     * 
     * @param batchID
     */
    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }


    /**
     * Gets the isDownloaded value for this PartnerDataBatch.
     * 
     * @return isDownloaded
     */
    public boolean isIsDownloaded() {
        return isDownloaded;
    }


    /**
     * Sets the isDownloaded value for this PartnerDataBatch.
     * 
     * @param isDownloaded
     */
    public void setIsDownloaded(boolean isDownloaded) {
        this.isDownloaded = isDownloaded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartnerDataBatch)) return false;
        PartnerDataBatch other = (PartnerDataBatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.batchID == other.getBatchID() &&
            this.isDownloaded == other.isIsDownloaded();
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
        _hashCode += getBatchID();
        _hashCode += (isIsDownloaded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartnerDataBatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", "PartnerDataBatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", "BatchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDownloaded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", "IsDownloaded"));
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
