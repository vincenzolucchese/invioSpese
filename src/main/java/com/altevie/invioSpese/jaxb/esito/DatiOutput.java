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
 * <p>Classe Java per datiOutput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="datiOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esitoChiamata" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descrizioneEsito" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="esitiPositivi" type="{http://esitoinvio.p730.sanita.sogei.it/}esitiPositivi" minOccurs="0"/&gt;
 *         &lt;element name="esitiNegativi" type="{http://esitoinvio.p730.sanita.sogei.it/}esitiNegativi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiOutput", propOrder = {
    "esitoChiamata",
    "descrizioneEsito",
    "esitiPositivi",
    "esitiNegativi"
})
public class DatiOutput {

    @XmlElement(required = true)
    protected String esitoChiamata;
    @XmlElement(required = true)
    protected String descrizioneEsito;
    protected EsitiPositivi esitiPositivi;
    protected EsitiNegativi esitiNegativi;

    /**
     * Recupera il valore della proprietà esitoChiamata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsitoChiamata() {
        return esitoChiamata;
    }

    /**
     * Imposta il valore della proprietà esitoChiamata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsitoChiamata(String value) {
        this.esitoChiamata = value;
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
     * Recupera il valore della proprietà esitiPositivi.
     * 
     * @return
     *     possible object is
     *     {@link EsitiPositivi }
     *     
     */
    public EsitiPositivi getEsitiPositivi() {
        return esitiPositivi;
    }

    /**
     * Imposta il valore della proprietà esitiPositivi.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitiPositivi }
     *     
     */
    public void setEsitiPositivi(EsitiPositivi value) {
        this.esitiPositivi = value;
    }

    /**
     * Recupera il valore della proprietà esitiNegativi.
     * 
     * @return
     *     possible object is
     *     {@link EsitiNegativi }
     *     
     */
    public EsitiNegativi getEsitiNegativi() {
        return esitiNegativi;
    }

    /**
     * Imposta il valore della proprietà esitiNegativi.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitiNegativi }
     *     
     */
    public void setEsitiNegativi(EsitiNegativi value) {
        this.esitiNegativi = value;
    }

}
