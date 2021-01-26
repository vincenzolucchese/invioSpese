//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 03:38:11 PM CET 
//


package com.altevie.invioSpese.jaxb.esito;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dettaglioEsitoPositivo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dettaglioEsitoPositivo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="protocollo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataInvio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stato" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nInviati" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nAccolti" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nWarnings" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nErrori" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioEsitoPositivo", propOrder = {
    "protocollo",
    "dataInvio",
    "stato",
    "descrizione",
    "nInviati",
    "nAccolti",
    "nWarnings",
    "nErrori"
})
public class DettaglioEsitoPositivo {

    @XmlElement(required = true)
    protected String protocollo;
    @XmlElement(required = true)
    protected String dataInvio;
    protected int stato;
    @XmlElement(required = true)
    protected String descrizione;
    protected long nInviati;
    protected long nAccolti;
    protected long nWarnings;
    protected long nErrori;

    /**
     * Recupera il valore della proprietà protocollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocollo() {
        return protocollo;
    }

    /**
     * Imposta il valore della proprietà protocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocollo(String value) {
        this.protocollo = value;
    }

    /**
     * Recupera il valore della proprietà dataInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInvio() {
        return dataInvio;
    }

    /**
     * Imposta il valore della proprietà dataInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInvio(String value) {
        this.dataInvio = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     */
    public int getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     */
    public void setStato(int value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà nInviati.
     * 
     */
    public long getNInviati() {
        return nInviati;
    }

    /**
     * Imposta il valore della proprietà nInviati.
     * 
     */
    public void setNInviati(long value) {
        this.nInviati = value;
    }

    /**
     * Recupera il valore della proprietà nAccolti.
     * 
     */
    public long getNAccolti() {
        return nAccolti;
    }

    /**
     * Imposta il valore della proprietà nAccolti.
     * 
     */
    public void setNAccolti(long value) {
        this.nAccolti = value;
    }

    /**
     * Recupera il valore della proprietà nWarnings.
     * 
     */
    public long getNWarnings() {
        return nWarnings;
    }

    /**
     * Imposta il valore della proprietà nWarnings.
     * 
     */
    public void setNWarnings(long value) {
        this.nWarnings = value;
    }

    /**
     * Recupera il valore della proprietà nErrori.
     * 
     */
    public long getNErrori() {
        return nErrori;
    }

    /**
     * Imposta il valore della proprietà nErrori.
     * 
     */
    public void setNErrori(long value) {
        this.nErrori = value;
    }

}
