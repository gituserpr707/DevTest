/**
 * AddLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice;

public class AddLocator extends org.apache.axis.client.Service implements com.webservice.Add {

    public AddLocator() {
    }


    public AddLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddHttpSoap11Endpoint
    private java.lang.String AddHttpSoap11Endpoint_address = "http://localhost:8080/NagaraJWebService/services/Add.AddHttpSoap11Endpoint/";

    public java.lang.String getAddHttpSoap11EndpointAddress() {
        return AddHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddHttpSoap11EndpointWSDDServiceName = "AddHttpSoap11Endpoint";

    public java.lang.String getAddHttpSoap11EndpointWSDDServiceName() {
        return AddHttpSoap11EndpointWSDDServiceName;
    }

    public void setAddHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        AddHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.webservice.AddPortType getAddHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddHttpSoap11Endpoint(endpoint);
    }

    public com.webservice.AddPortType getAddHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservice.AddSoap11BindingStub _stub = new com.webservice.AddSoap11BindingStub(portAddress, this);
            _stub.setPortName(getAddHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        AddHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservice.AddPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservice.AddSoap11BindingStub _stub = new com.webservice.AddSoap11BindingStub(new java.net.URL(AddHttpSoap11Endpoint_address), this);
                _stub.setPortName(getAddHttpSoap11EndpointWSDDServiceName());
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
        if ("AddHttpSoap11Endpoint".equals(inputPortName)) {
            return getAddHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.com", "Add");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.com", "AddHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddHttpSoap11Endpoint".equals(portName)) {
            setAddHttpSoap11EndpointEndpointAddress(address);
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
