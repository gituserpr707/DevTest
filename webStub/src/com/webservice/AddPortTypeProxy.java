package com.webservice;

public class AddPortTypeProxy implements com.webservice.AddPortType {
  private String _endpoint = null;
  private com.webservice.AddPortType addPortType = null;
  
  public AddPortTypeProxy() {
    _initAddPortTypeProxy();
  }
  
  public AddPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddPortTypeProxy();
  }
  
  private void _initAddPortTypeProxy() {
    try {
      addPortType = (new com.webservice.AddLocator()).getAddHttpSoap11Endpoint();
      if (addPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addPortType != null)
      ((javax.xml.rpc.Stub)addPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.webservice.AddPortType getAddPortType() {
    if (addPortType == null)
      _initAddPortTypeProxy();
    return addPortType;
  }
  
  public java.lang.Integer add(java.lang.Integer a, java.lang.Integer b) throws java.rmi.RemoteException{
    if (addPortType == null)
      _initAddPortTypeProxy();
    return addPortType.add(a, b);
  }
  
  
}