
package br.com.fiap.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarResponse_QNAME = new QName("http://ws.exemplos.fiap.br/", "listarResponse");
    private final static QName _Novo_QNAME = new QName("http://ws.exemplos.fiap.br/", "novo");
    private final static QName _IsAutenticadoResponse_QNAME = new QName("http://ws.exemplos.fiap.br/", "isAutenticadoResponse");
    private final static QName _Exception_QNAME = new QName("http://ws.exemplos.fiap.br/", "Exception");
    private final static QName _NovoResponse_QNAME = new QName("http://ws.exemplos.fiap.br/", "novoResponse");
    private final static QName _IsAutenticado_QNAME = new QName("http://ws.exemplos.fiap.br/", "isAutenticado");
    private final static QName _Listar_QNAME = new QName("http://ws.exemplos.fiap.br/", "listar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsAutenticado }
     * 
     */
    public IsAutenticado createIsAutenticado() {
        return new IsAutenticado();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link Novo }
     * 
     */
    public Novo createNovo() {
        return new Novo();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link NovoResponse }
     * 
     */
    public NovoResponse createNovoResponse() {
        return new NovoResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link IsAutenticadoResponse }
     * 
     */
    public IsAutenticadoResponse createIsAutenticadoResponse() {
        return new IsAutenticadoResponse();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.br/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Novo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.br/", name = "novo")
    public JAXBElement<Novo> createNovo(Novo value) {
        return new JAXBElement<Novo>(_Novo_QNAME, Novo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAutenticadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.br/", name = "isAutenticadoResponse")
    public JAXBElement<IsAutenticadoResponse> createIsAutenticadoResponse(IsAutenticadoResponse value) {
        return new JAXBElement<IsAutenticadoResponse>(_IsAutenticadoResponse_QNAME, IsAutenticadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.br/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NovoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.br/", name = "novoResponse")
    public JAXBElement<NovoResponse> createNovoResponse(NovoResponse value) {
        return new JAXBElement<NovoResponse>(_NovoResponse_QNAME, NovoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAutenticado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.br/", name = "isAutenticado")
    public JAXBElement<IsAutenticado> createIsAutenticado(IsAutenticado value) {
        return new JAXBElement<IsAutenticado>(_IsAutenticado_QNAME, IsAutenticado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.br/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

}
