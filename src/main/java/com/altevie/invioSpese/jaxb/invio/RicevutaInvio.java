//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 03:50:15 PM CET 
//


package com.altevie.invioSpese.jaxb.invio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ricevutaInvio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ricevutaInvio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceEsito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataAccoglienza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descrizioneEsito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dimensioneFileAllegato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomeFileAllegato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="protocollo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idErrore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ricevutaInvio", propOrder = {
    "codiceEsito",
    "dataAccoglienza",
    "descrizioneEsito",
    "dimensioneFileAllegato",
    "nomeFileAllegato",
    "protocollo",
    "idErrore"
})
public class RicevutaInvio {

    @XmlElement(required = true)
    protected String codiceEsito;
    @XmlElement(required = true)
    protected String dataAccoglienza;
    @XmlElement(required = true)
    protected String descrizioneEsito;
    @XmlElement(required = true)
    protected String dimensioneFileAllegato;
    @XmlElement(required = true)
    protected String nomeFileAllegato;
    @XmlElement(required = true)
    protected String protocollo;
    protected String idErrore;

    /**
     * Recupera il valore della proprietà codiceEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEsito() {
        return codiceEsito;
    }

    /**
     * Imposta il valore della proprietà codiceEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEsito(String value) {
        this.codiceEsito = value;
    }

    /**
     * Recupera il valore della proprietà dataAccoglienza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAccoglienza() {
        return dataAccoglienza;
    }

    /**
     * Imposta il valore della proprietà dataAccoglienza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAccoglienza(String value) {
        this.dataAccoglienza = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneEsito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEsito() {
        return descrizioneEsito;
    }

    /**
     * Imposta il valore della proprietà descrizioneEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEsito(String value) {
        this.descrizioneEsito = value;
    }

    /**
     * Recupera il valore della proprietà dimensioneFileAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensioneFileAllegato() {
        return dimensioneFileAllegato;
    }

    /**
     * Imposta il valore della proprietà dimensioneFileAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensioneFileAllegato(String value) {
        this.dimensioneFileAllegato = value;
    }

    /**
     * Recupera il valore della proprietà nomeFileAllegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFileAllegato() {
        return nomeFileAllegato;
    }

    /**
     * Imposta il valore della proprietà nomeFileAllegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFileAllegato(String value) {
        this.nomeFileAllegato = value;
    }

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
     * Recupera il valore della proprietà idErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdErrore() {
        return idErrore;
    }

    /**
     * Imposta il valore della proprietà idErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdErrore(String value) {
        this.idErrore = value;
    }

}
