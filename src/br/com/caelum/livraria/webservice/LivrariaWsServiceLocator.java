/**
 * LivrariaWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.livraria.webservice;

public class LivrariaWsServiceLocator extends org.apache.axis.client.Service implements br.com.caelum.livraria.webservice.LivrariaWsService {

    public LivrariaWsServiceLocator() {
    }


    public LivrariaWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LivrariaWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LivrariaWsPort
    private java.lang.String LivrariaWsPort_address = "http://localhost:8080/livraria/LivrariaWs";

    public java.lang.String getLivrariaWsPortAddress() {
        return LivrariaWsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LivrariaWsPortWSDDServiceName = "LivrariaWsPort";

    public java.lang.String getLivrariaWsPortWSDDServiceName() {
        return LivrariaWsPortWSDDServiceName;
    }

    public void setLivrariaWsPortWSDDServiceName(java.lang.String name) {
        LivrariaWsPortWSDDServiceName = name;
    }

    public br.com.caelum.livraria.webservice.LivrariaWs getLivrariaWsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LivrariaWsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLivrariaWsPort(endpoint);
    }

    public br.com.caelum.livraria.webservice.LivrariaWs getLivrariaWsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.caelum.livraria.webservice.LivrariaWsServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaWsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLivrariaWsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLivrariaWsPortEndpointAddress(java.lang.String address) {
        LivrariaWsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.caelum.livraria.webservice.LivrariaWs.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.caelum.livraria.webservice.LivrariaWsServiceSoapBindingStub _stub = new br.com.caelum.livraria.webservice.LivrariaWsServiceSoapBindingStub(new java.net.URL(LivrariaWsPort_address), this);
                _stub.setPortName(getLivrariaWsPortWSDDServiceName());
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
        if ("LivrariaWsPort".equals(inputPortName)) {
            return getLivrariaWsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.livraria.caelum.com.br/", "LivrariaWsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LivrariaWsPort".equals(portName)) {
            setLivrariaWsPortEndpointAddress(address);
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
