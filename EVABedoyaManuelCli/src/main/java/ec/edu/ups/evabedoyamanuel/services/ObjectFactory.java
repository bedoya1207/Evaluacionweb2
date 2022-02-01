
package ec.edu.ups.evabedoyamanuel.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.evabedoyamanuel.services package. 
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

    private final static QName _Crearlibro_QNAME = new QName("http://services.EVAbedoyamanuel.ups.edu.ec/", "crearlibro");
    private final static QName _CrearlibroResponse_QNAME = new QName("http://services.EVAbedoyamanuel.ups.edu.ec/", "crearlibroResponse");
    private final static QName _Getlibros_QNAME = new QName("http://services.EVAbedoyamanuel.ups.edu.ec/", "getlibros");
    private final static QName _GetlibrosResponse_QNAME = new QName("http://services.EVAbedoyamanuel.ups.edu.ec/", "getlibrosResponse");
    private final static QName _Exception_QNAME = new QName("http://services.EVAbedoyamanuel.ups.edu.ec/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.evabedoyamanuel.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Crearlibro }
     * 
     */
    public Crearlibro createCrearlibro() {
        return new Crearlibro();
    }

    /**
     * Create an instance of {@link CrearlibroResponse }
     * 
     */
    public CrearlibroResponse createCrearlibroResponse() {
        return new CrearlibroResponse();
    }

    /**
     * Create an instance of {@link Getlibros }
     * 
     */
    public Getlibros createGetlibros() {
        return new Getlibros();
    }

    /**
     * Create an instance of {@link GetlibrosResponse }
     * 
     */
    public GetlibrosResponse createGetlibrosResponse() {
        return new GetlibrosResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Libro }
     * 
     */
    public Libro createLibro() {
        return new Libro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Crearlibro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Crearlibro }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVAbedoyamanuel.ups.edu.ec/", name = "crearlibro")
    public JAXBElement<Crearlibro> createCrearlibro(Crearlibro value) {
        return new JAXBElement<Crearlibro>(_Crearlibro_QNAME, Crearlibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearlibroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearlibroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVAbedoyamanuel.ups.edu.ec/", name = "crearlibroResponse")
    public JAXBElement<CrearlibroResponse> createCrearlibroResponse(CrearlibroResponse value) {
        return new JAXBElement<CrearlibroResponse>(_CrearlibroResponse_QNAME, CrearlibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getlibros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getlibros }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVAbedoyamanuel.ups.edu.ec/", name = "getlibros")
    public JAXBElement<Getlibros> createGetlibros(Getlibros value) {
        return new JAXBElement<Getlibros>(_Getlibros_QNAME, Getlibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetlibrosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetlibrosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVAbedoyamanuel.ups.edu.ec/", name = "getlibrosResponse")
    public JAXBElement<GetlibrosResponse> createGetlibrosResponse(GetlibrosResponse value) {
        return new JAXBElement<GetlibrosResponse>(_GetlibrosResponse_QNAME, GetlibrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.EVAbedoyamanuel.ups.edu.ec/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
