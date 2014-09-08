package com.blackdiamondreporting.www;

public class PartnerDataWebServiceSoapProxy implements com.blackdiamondreporting.www.PartnerDataWebServiceSoap {
  private String _endpoint = null;
  private com.blackdiamondreporting.www.PartnerDataWebServiceSoap partnerDataWebServiceSoap = null;
  
  public PartnerDataWebServiceSoapProxy() {
    _initPartnerDataWebServiceSoapProxy();
  }
  
  public PartnerDataWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPartnerDataWebServiceSoapProxy();
  }
  
  private void _initPartnerDataWebServiceSoapProxy() {
    try {
      partnerDataWebServiceSoap = (new com.blackdiamondreporting.www.PartnerDataWebServiceLocator()).getPartnerDataWebServiceSoap();
      if (partnerDataWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)partnerDataWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)partnerDataWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (partnerDataWebServiceSoap != null)
      ((javax.xml.rpc.Stub)partnerDataWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.blackdiamondreporting.www.PartnerDataWebServiceSoap getPartnerDataWebServiceSoap() {
    if (partnerDataWebServiceSoap == null)
      _initPartnerDataWebServiceSoapProxy();
    return partnerDataWebServiceSoap;
  }
  
  public java.lang.String authenticate(java.lang.String token) throws java.rmi.RemoteException{
    if (partnerDataWebServiceSoap == null)
      _initPartnerDataWebServiceSoapProxy();
    return partnerDataWebServiceSoap.authenticate(token);
  }
  
  public com.blackdiamondreporting.www.PartnerDataBatch[] getBatches(java.lang.String token) throws java.rmi.RemoteException{
    if (partnerDataWebServiceSoap == null)
      _initPartnerDataWebServiceSoapProxy();
    return partnerDataWebServiceSoap.getBatches(token);
  }
  
  public com.blackdiamondreporting.www.DownloadBatchResponseDownloadBatchResult downloadBatch(java.lang.String token) throws java.rmi.RemoteException{
    if (partnerDataWebServiceSoap == null)
      _initPartnerDataWebServiceSoapProxy();
    return partnerDataWebServiceSoap.downloadBatch(token);
  }
  
  public com.blackdiamondreporting.www.RetrieveDataResponseRetrieveDataResult retrieveData(java.lang.String token) throws java.rmi.RemoteException{
    if (partnerDataWebServiceSoap == null)
      _initPartnerDataWebServiceSoapProxy();
    return partnerDataWebServiceSoap.retrieveData(token);
  }
  
  public java.lang.String getTermsAndConditionsText(java.lang.String token) throws java.rmi.RemoteException{
    if (partnerDataWebServiceSoap == null)
      _initPartnerDataWebServiceSoapProxy();
    return partnerDataWebServiceSoap.getTermsAndConditionsText(token);
  }
  
  public boolean acceptTermsAndConditions(java.lang.String token) throws java.rmi.RemoteException{
    if (partnerDataWebServiceSoap == null)
      _initPartnerDataWebServiceSoapProxy();
    return partnerDataWebServiceSoap.acceptTermsAndConditions(token);
  }
  
  
}