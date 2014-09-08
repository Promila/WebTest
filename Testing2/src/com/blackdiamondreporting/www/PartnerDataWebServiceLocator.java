/**
 * PartnerDataWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.blackdiamondreporting.www;

public class PartnerDataWebServiceLocator extends org.apache.axis.client.Service implements com.blackdiamondreporting.www.PartnerDataWebService {

    public PartnerDataWebServiceLocator() {
    }


    public PartnerDataWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PartnerDataWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PartnerDataWebServiceSoap12
   // private java.lang.String PartnerDataWebServiceSoap12_address = "https://integrations.bdreporting.com:4431/services/PartnerDataWebService.asmx";
    private java.lang.String PartnerDataWebServiceSoap12_address = "https://integrations.bdreporting.com/services/PartnerDataWebService.asmx";

    public java.lang.String getPartnerDataWebServiceSoap12Address() {
        return PartnerDataWebServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PartnerDataWebServiceSoap12WSDDServiceName = "PartnerDataWebServiceSoap12";

    public java.lang.String getPartnerDataWebServiceSoap12WSDDServiceName() {
        return PartnerDataWebServiceSoap12WSDDServiceName;
    }

    public void setPartnerDataWebServiceSoap12WSDDServiceName(java.lang.String name) {
        PartnerDataWebServiceSoap12WSDDServiceName = name;
    }

    public com.blackdiamondreporting.www.PartnerDataWebServiceSoap getPartnerDataWebServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PartnerDataWebServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPartnerDataWebServiceSoap12(endpoint);
    }

    public com.blackdiamondreporting.www.PartnerDataWebServiceSoap getPartnerDataWebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.blackdiamondreporting.www.PartnerDataWebServiceSoap12Stub _stub = new com.blackdiamondreporting.www.PartnerDataWebServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getPartnerDataWebServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPartnerDataWebServiceSoap12EndpointAddress(java.lang.String address) {
        PartnerDataWebServiceSoap12_address = address;
    }


    // Use to get a proxy class for PartnerDataWebServiceSoap
    //private java.lang.String PartnerDataWebServiceSoap_address = "https://integrations.bdreporting.com:4431/services/PartnerDataWebService.asmx";
    private java.lang.String PartnerDataWebServiceSoap_address = "https://integrations.bdreporting.com/services/PartnerDataWebService.asmx";

    public java.lang.String getPartnerDataWebServiceSoapAddress() {
        return PartnerDataWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PartnerDataWebServiceSoapWSDDServiceName = "PartnerDataWebServiceSoap";

    public java.lang.String getPartnerDataWebServiceSoapWSDDServiceName() {
        return PartnerDataWebServiceSoapWSDDServiceName;
    }

    public void setPartnerDataWebServiceSoapWSDDServiceName(java.lang.String name) {
        PartnerDataWebServiceSoapWSDDServiceName = name;
    }

    public com.blackdiamondreporting.www.PartnerDataWebServiceSoap getPartnerDataWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PartnerDataWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPartnerDataWebServiceSoap(endpoint);
    }

    public com.blackdiamondreporting.www.PartnerDataWebServiceSoap getPartnerDataWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.blackdiamondreporting.www.PartnerDataWebServiceSoapStub _stub = new com.blackdiamondreporting.www.PartnerDataWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getPartnerDataWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPartnerDataWebServiceSoapEndpointAddress(java.lang.String address) {
        PartnerDataWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.blackdiamondreporting.www.PartnerDataWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.blackdiamondreporting.www.PartnerDataWebServiceSoap12Stub _stub = new com.blackdiamondreporting.www.PartnerDataWebServiceSoap12Stub(new java.net.URL(PartnerDataWebServiceSoap12_address), this);
                _stub.setPortName(getPartnerDataWebServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (com.blackdiamondreporting.www.PartnerDataWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.blackdiamondreporting.www.PartnerDataWebServiceSoapStub _stub = new com.blackdiamondreporting.www.PartnerDataWebServiceSoapStub(new java.net.URL(PartnerDataWebServiceSoap_address), this);
                _stub.setPortName(getPartnerDataWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PartnerDataWebServiceSoap12".equals(inputPortName)) {
            return getPartnerDataWebServiceSoap12();
        }
        else if ("PartnerDataWebServiceSoap".equals(inputPortName)) {
            return getPartnerDataWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", "PartnerDataWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", "PartnerDataWebServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("http://www.blackdiamondreporting.com/", "PartnerDataWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PartnerDataWebServiceSoap12".equals(portName)) {
            setPartnerDataWebServiceSoap12EndpointAddress(address);
        }
        else 
if ("PartnerDataWebServiceSoap".equals(portName)) {
            setPartnerDataWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
