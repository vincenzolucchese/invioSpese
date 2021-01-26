//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 03:50:15 PM CET 
//


package com.altevie.invioSpese.jaxb.invio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.altevie.coni.generated.invio package. 
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

    private final static QName _InviaFileMtom_QNAME = new QName("http://ejb.invioTelematicoSS730p.sanita.finanze.it/", "inviaFileMtom");
    private final static QName _InviaFileMtomResponse_QNAME = new QName("http://ejb.invioTelematicoSS730p.sanita.finanze.it/", "inviaFileMtomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.altevie.coni.generated.invio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InviaFileMtom }
     * 
     */
    public InviaFileMtom createInviaFileMtom() {
        return new InviaFileMtom();
    }

    /**
     * Create an instance of {@link InviaFileMtomResponse }
     * 
     */
    public InviaFileMtomResponse createInviaFileMtomResponse() {
        return new InviaFileMtomResponse();
    }

    /**
     * Create an instance of {@link RicevutaInvio }
     * 
     */
    public RicevutaInvio createRicevutaInvio() {
        return new RicevutaInvio();
    }

    /**
     * Create an instance of {@link Proprietario }
     * 
     */
    public Proprietario createProprietario() {
        return new Proprietario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InviaFileMtom }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InviaFileMtom }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb.invioTelematicoSS730p.sanita.finanze.it/", name = "inviaFileMtom")
    public JAXBElement<InviaFileMtom> createInviaFileMtom(InviaFileMtom value) {
        return new JAXBElement<InviaFileMtom>(_InviaFileMtom_QNAME, InviaFileMtom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InviaFileMtomResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InviaFileMtomResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb.invioTelematicoSS730p.sanita.finanze.it/", name = "inviaFileMtomResponse")
    public JAXBElement<InviaFileMtomResponse> createInviaFileMtomResponse(InviaFileMtomResponse value) {
        return new JAXBElement<InviaFileMtomResponse>(_InviaFileMtomResponse_QNAME, InviaFileMtomResponse.class, null, value);
    }

}
