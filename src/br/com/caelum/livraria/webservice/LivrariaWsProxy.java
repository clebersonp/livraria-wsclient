package br.com.caelum.livraria.webservice;

public class LivrariaWsProxy implements br.com.caelum.livraria.webservice.LivrariaWs {
  private String _endpoint = null;
  private br.com.caelum.livraria.webservice.LivrariaWs livrariaWs = null;
  
  public LivrariaWsProxy() {
    _initLivrariaWsProxy();
  }
  
  public LivrariaWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initLivrariaWsProxy();
  }
  
  private void _initLivrariaWsProxy() {
    try {
      livrariaWs = (new br.com.caelum.livraria.webservice.LivrariaWsServiceLocator()).getLivrariaWsPort();
      if (livrariaWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)livrariaWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)livrariaWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (livrariaWs != null)
      ((javax.xml.rpc.Stub)livrariaWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.caelum.livraria.webservice.LivrariaWs getLivrariaWs() {
    if (livrariaWs == null)
      _initLivrariaWsProxy();
    return livrariaWs;
  }
  
  public br.com.caelum.livraria.webservice.Livro[] getLivrosPorTitulo(java.lang.String titulo) throws java.rmi.RemoteException{
    if (livrariaWs == null)
      _initLivrariaWsProxy();
    return livrariaWs.getLivrosPorTitulo(titulo);
  }
  
  
}