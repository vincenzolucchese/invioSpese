//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 03:38:11 PM CET 
//


package com.altevie.invioSpese.jaxb.esito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.altevie.coni.generated.esito package. 
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

    private final static QName _EsitoInvii_QNAME = new QName("http://esitoinvio.p730.sanita.sogei.it/", "EsitoInvii");
    private final static QName _EsitoInviiResponse_QNAME = new QName("http://esitoinvio.p730.sanita.sogei.it/", "EsitoInviiResponse");
    private final static QName _Exception_QNAME = new QName("http://esitoinvio.p730.sanita.sogei.it/", "Exception");
    private final static QName _DatiInput_QNAME = new QName("http://esitoinvio.p730.sanita.sogei.it/", "datiInput");
    private final static QName _DatiOutput_QNAME = new QName("http://esitoinvio.p730.sanita.sogei.it/", "datiOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.altevie.coni.generated.esito
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EsitoInvii }
     * 
     */
    public EsitoInvii createEsitoInvii() {
        return new EsitoInvii();
    }

    /**
     * Create an instance of {@link EsitoInviiResponse }
     * 
     */
    public EsitoInviiResponse createEsitoInviiResponse() {
        return new EsitoInviiResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DatiInput }
     * 
     */
    public DatiInput createDatiInput() {
        return new DatiInput();
    }

    /**
     * Create an instance of {@link DatiOutput }
     * 
     */
    public DatiOutput createDatiOutput() {
        return new DatiOutput();
    }

    /**
     * Create an instance of {@link DettaglioEsitoNegativo }
     * 
     */
    public DettaglioEsitoNegativo createDettaglioEsitoNegativo() {
        return new DettaglioEsitoNegativo();
    }

    /**
     * Create an instance of {@link DettaglioEsitoPositivo }
     * 
     */
    public DettaglioEsitoPositivo createDettaglioEsitoPositivo() {
        return new DettaglioEsitoPositivo();
    }

    /**
     * Create an instance of {@link EsitiPositivi }
     * 
     */
    public EsitiPositivi createEsitiPositivi() {
        return new EsitiPositivi();
    }

    /**
     * Create an instance of {@link EsitiNegativi }
     * 
     */
    public EsitiNegativi createEsitiNegativi() {
        return new EsitiNegativi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsitoInvii }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsitoInvii }{@code >}
     */
    @XmlElementDecl(namespace = "http://esitoinvio.p730.sanita.sogei.it/", name = "EsitoInvii")
    public JAXBElement<EsitoInvii> createEsitoInvii(EsitoInvii value) {
        return new JAXBElement<EsitoInvii>(_EsitoInvii_QNAME, EsitoInvii.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsitoInviiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsitoInviiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://esitoinvio.p730.sanita.sogei.it/", name = "EsitoInviiResponse")
    public JAXBElement<EsitoInviiResponse> createEsitoInviiResponse(EsitoInviiResponse value) {
        return new JAXBElement<EsitoInviiResponse>(_EsitoInviiResponse_QNAME, EsitoInviiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://esitoinvio.p730.sanita.sogei.it/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatiInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://esitoinvio.p730.sanita.sogei.it/", name = "datiInput")
    public JAXBElement<DatiInput> createDatiInput(DatiInput value) {
        return new JAXBElement<DatiInput>(_DatiInput_QNAME, DatiInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatiOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatiOutput }{@code >}
     */
    @XmlElementDecl(namespace = "http://esitoinvio.p730.sanita.sogei.it/", name = "datiOutput")
    public JAXBElement<DatiOutput> createDatiOutput(DatiOutput value) {
        return new JAXBElement<DatiOutput>(_DatiOutput_QNAME, DatiOutput.class, null, value);
    }

}
