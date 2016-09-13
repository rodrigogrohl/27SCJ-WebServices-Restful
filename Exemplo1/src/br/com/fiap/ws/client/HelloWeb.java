
package br.com.fiap.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWeb", targetNamespace = "http://ws.fiap.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWeb {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws.fiap.com.br/", className = "br.com.fiap.ws.client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws.fiap.com.br/", className = "br.com.fiap.ws.client.HelloResponse")
    @Action(input = "http://ws.fiap.com.br/HelloWeb/helloRequest", output = "http://ws.fiap.com.br/HelloWeb/helloResponse")
    public String hello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
