//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 03:50:15 PM CET 
//


package com.altevie.invioSpese.jaxb.invio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per proprietario complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="proprietario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceRegione" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}varChar3Type" minOccurs="0"/&gt;
 *         &lt;element name="codiceAsl" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}varChar3Type" minOccurs="0"/&gt;
 *         &lt;element name="codiceSSA" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}codSsaType" minOccurs="0"/&gt;
 *         &lt;element name="cfProprietario" type="{http://ejb.invioTelematicoSS730p.sanita.finanze.it/}cfType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proprietario", propOrder = {
    "codiceRegione",
    "codiceAsl",
    "codiceSSA",
    "cfProprietario"
})
public class Proprietario {

    protected String codiceRegione;
    protected String codiceAsl;
    protected String codiceSSA;
    protected String cfProprietario;

    /**
     * Recupera il valore della proprietà codiceRegione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRegione() {
        return codiceRegione;
    }

    /**
     * Imposta il valore della proprietà codiceRegione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRegione(String value) {
        this.codiceRegione = value;
    }

    /**
     * Recupera il valore della proprietà codiceAsl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAsl() {
        return codiceAsl;
    }

    /**
     * Imposta il valore della proprietà codiceAsl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAsl(String value) {
        this.codiceAsl = value;
    }

    /**
     * Recupera il valore della proprietà codiceSSA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceSSA() {
        return codiceSSA;
    }

    /**
     * Imposta il valore della proprietà codiceSSA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceSSA(String value) {
        this.codiceSSA = value;
    }

    /**
     * Recupera il valore della proprietà cfProprietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfProprietario() {
        return cfProprietario;
    }

    /**
     * Imposta il valore della proprietà cfProprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfProprietario(String value) {
        this.cfProprietario = value;
    }

}
