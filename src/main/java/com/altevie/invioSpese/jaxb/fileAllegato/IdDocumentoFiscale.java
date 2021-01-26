//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 04:21:04 PM CET 
//


package com.altevie.invioSpese.jaxb.fileAllegato;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per idDocumentoFiscale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="idDocumentoFiscale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pIva"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;pattern value="([0-9]{11})"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataEmissione" type="{}DataMinType"/&gt;
 *         &lt;element name="numDocumentoFiscale"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dispositivo" type="{}Int3Type"/&gt;
 *                   &lt;element name="numDocumento" type="{}numDocType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idDocumentoFiscale", propOrder = {
    "pIva",
    "dataEmissione",
    "numDocumentoFiscale"
})
public class IdDocumentoFiscale {

    @XmlElement(required = true)
    protected BigInteger pIva;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissione;
    @XmlElement(required = true)
    protected IdDocumentoFiscale.NumDocumentoFiscale numDocumentoFiscale;

    /**
     * Recupera il valore della proprietà pIva.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPIva() {
        return pIva;
    }

    /**
     * Imposta il valore della proprietà pIva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPIva(BigInteger value) {
        this.pIva = value;
    }

    /**
     * Recupera il valore della proprietà dataEmissione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Imposta il valore della proprietà dataEmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissione(XMLGregorianCalendar value) {
        this.dataEmissione = value;
    }

    /**
     * Recupera il valore della proprietà numDocumentoFiscale.
     * 
     * @return
     *     possible object is
     *     {@link IdDocumentoFiscale.NumDocumentoFiscale }
     *     
     */
    public IdDocumentoFiscale.NumDocumentoFiscale getNumDocumentoFiscale() {
        return numDocumentoFiscale;
    }

    /**
     * Imposta il valore della proprietà numDocumentoFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link IdDocumentoFiscale.NumDocumentoFiscale }
     *     
     */
    public void setNumDocumentoFiscale(IdDocumentoFiscale.NumDocumentoFiscale value) {
        this.numDocumentoFiscale = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="dispositivo" type="{}Int3Type"/&gt;
     *         &lt;element name="numDocumento" type="{}numDocType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dispositivo",
        "numDocumento"
    })
    public static class NumDocumentoFiscale {

        protected int dispositivo;
        @XmlElement(required = true)
        protected String numDocumento;

        /**
         * Recupera il valore della proprietà dispositivo.
         * 
         */
        public int getDispositivo() {
            return dispositivo;
        }

        /**
         * Imposta il valore della proprietà dispositivo.
         * 
         */
        public void setDispositivo(int value) {
            this.dispositivo = value;
        }

        /**
         * Recupera il valore della proprietà numDocumento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumDocumento() {
            return numDocumento;
        }

        /**
         * Imposta il valore della proprietà numDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumDocumento(String value) {
            this.numDocumento = value;
        }

    }

}
