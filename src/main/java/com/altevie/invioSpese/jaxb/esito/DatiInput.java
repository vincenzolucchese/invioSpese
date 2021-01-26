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
 * <p>Classe Java per datiInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pinCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataInizio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataFine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="protocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opzionale1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opzionale2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opzionale3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiInput", propOrder = {
    "pinCode",
    "dataInizio",
    "dataFine",
    "protocollo",
    "opzionale1",
    "opzionale2",
    "opzionale3"
})
public class DatiInput {

    @XmlElement(required = true)
    protected String pinCode;
    protected String dataInizio;
    protected String dataFine;
    protected String protocollo;
    protected String opzionale1;
    protected String opzionale2;
    protected String opzionale3;

    /**
     * Recupera il valore della proprietà pinCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Imposta il valore della proprietà pinCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Recupera il valore della proprietà dataInizio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInizio() {
        return dataInizio;
    }

    /**
     * Imposta il valore della proprietà dataInizio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInizio(String value) {
        this.dataInizio = value;
    }

    /**
     * Recupera il valore della proprietà dataFine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFine() {
        return dataFine;
    }

    /**
     * Imposta il valore della proprietà dataFine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFine(String value) {
        this.dataFine = value;
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
     * Recupera il valore della proprietà opzionale1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale1() {
        return opzionale1;
    }

    /**
     * Imposta il valore della proprietà opzionale1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale1(String value) {
        this.opzionale1 = value;
    }

    /**
     * Recupera il valore della proprietà opzionale2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale2() {
        return opzionale2;
    }

    /**
     * Imposta il valore della proprietà opzionale2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale2(String value) {
        this.opzionale2 = value;
    }

    /**
     * Recupera il valore della proprietà opzionale3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpzionale3() {
        return opzionale3;
    }

    /**
     * Imposta il valore della proprietà opzionale3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpzionale3(String value) {
        this.opzionale3 = value;
    }

}
