/**
 * PartnerDataWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.blackdiamondreporting.www;

public interface PartnerDataWebServiceSoap extends java.rmi.Remote {
    public java.lang.String authenticate(java.lang.String token) throws java.rmi.RemoteException;
    public com.blackdiamondreporting.www.PartnerDataBatch[] getBatches(java.lang.String token) throws java.rmi.RemoteException;
    public com.blackdiamondreporting.www.DownloadBatchResponseDownloadBatchResult downloadBatch(java.lang.String token) throws java.rmi.RemoteException;
    public com.blackdiamondreporting.www.RetrieveDataResponseRetrieveDataResult retrieveData(java.lang.String token) throws java.rmi.RemoteException;
    public java.lang.String getTermsAndConditionsText(java.lang.String token) throws java.rmi.RemoteException;
    public boolean acceptTermsAndConditions(java.lang.String token) throws java.rmi.RemoteException;
}
