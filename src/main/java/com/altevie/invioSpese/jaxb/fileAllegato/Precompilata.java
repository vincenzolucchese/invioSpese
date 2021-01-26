//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 04:21:04 PM CET 
//


package com.altevie.invioSpese.jaxb.fileAllegato;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="opzionale1" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="opzionale2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="opzionale3" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="proprietario"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="codiceRegione" type="{}varChar3Type" minOccurs="0"/&gt;
 *                   &lt;element name="codiceAsl" type="{}varChar3Type" minOccurs="0"/&gt;
 *                   &lt;element name="codiceSSA" type="{}codSsaType" minOccurs="0"/&gt;
 *                   &lt;element name="cfProprietario" type="{}cfType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="documentoSpesa" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="idSpesa" type="{}idDocumentoFiscale"/&gt;
 *                   &lt;element name="idRimborso" type="{}idDocumentoFiscale" minOccurs="0"/&gt;
 *                   &lt;element name="dataPagamento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{}DataMinType"&gt;
 *                         &lt;minInclusive value="2015-01-01"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="flagPagamentoAnticipato" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="flagOperazione"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="I"/&gt;
 *                         &lt;enumeration value="V"/&gt;
 *                         &lt;enumeration value="R"/&gt;
 *                         &lt;enumeration value="C"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cfCittadino" type="{}cfType" minOccurs="0"/&gt;
 *                   &lt;element name="pagamentoTracciato" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="SI"/&gt;
 *                         &lt;enumeration value="NO"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="tipoDocumento" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="F"/&gt;
 *                         &lt;enumeration value="D"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="flagOpposizione" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="voceSpesa" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="tipoSpesa"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="TK"/&gt;
 *                                   &lt;enumeration value="FC"/&gt;
 *                                   &lt;enumeration value="FV"/&gt;
 *                                   &lt;enumeration value="AS"/&gt;
 *                                   &lt;enumeration value="AD"/&gt;
 *                                   &lt;enumeration value="SR"/&gt;
 *                                   &lt;enumeration value="CT"/&gt;
 *                                   &lt;enumeration value="PI"/&gt;
 *                                   &lt;enumeration value="IC"/&gt;
 *                                   &lt;enumeration value="AA"/&gt;
 *                                   &lt;enumeration value="SV"/&gt;
 *                                   &lt;enumeration value="SP"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="flagTipoSpesa" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="importo" type="{}Dec7MinTipo"/&gt;
 *                             &lt;choice minOccurs="0"&gt;
 *                               &lt;element name="aliquotaIVA" type="{}RateType"/&gt;
 *                               &lt;element name="naturaIVA" type="{}NaturaType"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "", propOrder = {
    "opzionale1",
    "opzionale2",
    "opzionale3",
    "proprietario",
    "documentoSpesa"
})
@XmlRootElement(name = "precompilata")
public class Precompilata {

    protected Object opzionale1;
    protected Object opzionale2;
    protected Object opzionale3;
    @XmlElement(required = true)
    protected Precompilata.Proprietario proprietario;
    @XmlElement(required = true)
    protected List<Precompilata.DocumentoSpesa> documentoSpesa;

    /**
     * Recupera il valore della proprietà opzionale1.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpzionale1() {
        return opzionale1;
    }

    /**
     * Imposta il valore della proprietà opzionale1.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpzionale1(Object value) {
        this.opzionale1 = value;
    }

    /**
     * Recupera il valore della proprietà opzionale2.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpzionale2() {
        return opzionale2;
    }

    /**
     * Imposta il valore della proprietà opzionale2.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpzionale2(Object value) {
        this.opzionale2 = value;
    }

    /**
     * Recupera il valore della proprietà opzionale3.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOpzionale3() {
        return opzionale3;
    }

    /**
     * Imposta il valore della proprietà opzionale3.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOpzionale3(Object value) {
        this.opzionale3 = value;
    }

    /**
     * Recupera il valore della proprietà proprietario.
     * 
     * @return
     *     possible object is
     *     {@link Precompilata.Proprietario }
     *     
     */
    public Precompilata.Proprietario getProprietario() {
        return proprietario;
    }

    /**
     * Imposta il valore della proprietà proprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link Precompilata.Proprietario }
     *     
     */
    public void setProprietario(Precompilata.Proprietario value) {
        this.proprietario = value;
    }

    /**
     * Gets the value of the documentoSpesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoSpesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoSpesa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Precompilata.DocumentoSpesa }
     * 
     * 
     */
    public List<Precompilata.DocumentoSpesa> getDocumentoSpesa() {
        if (documentoSpesa == null) {
            documentoSpesa = new ArrayList<Precompilata.DocumentoSpesa>();
        }
        return this.documentoSpesa;
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
     *         &lt;element name="idSpesa" type="{}idDocumentoFiscale"/&gt;
     *         &lt;element name="idRimborso" type="{}idDocumentoFiscale" minOccurs="0"/&gt;
     *         &lt;element name="dataPagamento"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{}DataMinType"&gt;
     *               &lt;minInclusive value="2015-01-01"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="flagPagamentoAnticipato" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="flagOperazione"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="I"/&gt;
     *               &lt;enumeration value="V"/&gt;
     *               &lt;enumeration value="R"/&gt;
     *               &lt;enumeration value="C"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cfCittadino" type="{}cfType" minOccurs="0"/&gt;
     *         &lt;element name="pagamentoTracciato" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="SI"/&gt;
     *               &lt;enumeration value="NO"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="tipoDocumento" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="F"/&gt;
     *               &lt;enumeration value="D"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="flagOpposizione" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="voceSpesa" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="tipoSpesa"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="TK"/&gt;
     *                         &lt;enumeration value="FC"/&gt;
     *                         &lt;enumeration value="FV"/&gt;
     *                         &lt;enumeration value="AS"/&gt;
     *                         &lt;enumeration value="AD"/&gt;
     *                         &lt;enumeration value="SR"/&gt;
     *                         &lt;enumeration value="CT"/&gt;
     *                         &lt;enumeration value="PI"/&gt;
     *                         &lt;enumeration value="IC"/&gt;
     *                         &lt;enumeration value="AA"/&gt;
     *                         &lt;enumeration value="SV"/&gt;
     *                         &lt;enumeration value="SP"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="flagTipoSpesa" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="importo" type="{}Dec7MinTipo"/&gt;
     *                   &lt;choice minOccurs="0"&gt;
     *                     &lt;element name="aliquotaIVA" type="{}RateType"/&gt;
     *                     &lt;element name="naturaIVA" type="{}NaturaType"/&gt;
     *                   &lt;/choice&gt;
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
    @XmlType(name = "", propOrder = {
        "idSpesa",
        "idRimborso",
        "dataPagamento",
        "flagPagamentoAnticipato",
        "flagOperazione",
        "cfCittadino",
        "pagamentoTracciato",
        "tipoDocumento",
        "flagOpposizione",
        "voceSpesa"
    })
    public static class DocumentoSpesa {

        @XmlElement(required = true)
        protected IdDocumentoFiscale idSpesa;
        protected IdDocumentoFiscale idRimborso;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataPagamento;
        protected Integer flagPagamentoAnticipato;
        @XmlElement(required = true)
        protected String flagOperazione;
        protected String cfCittadino;
        protected String pagamentoTracciato;
        protected String tipoDocumento;
        protected String flagOpposizione;
        @XmlElement(required = true)
        protected List<Precompilata.DocumentoSpesa.VoceSpesa> voceSpesa;

        /**
         * Recupera il valore della proprietà idSpesa.
         * 
         * @return
         *     possible object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public IdDocumentoFiscale getIdSpesa() {
            return idSpesa;
        }

        /**
         * Imposta il valore della proprietà idSpesa.
         * 
         * @param value
         *     allowed object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public void setIdSpesa(IdDocumentoFiscale value) {
            this.idSpesa = value;
        }

        /**
         * Recupera il valore della proprietà idRimborso.
         * 
         * @return
         *     possible object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public IdDocumentoFiscale getIdRimborso() {
            return idRimborso;
        }

        /**
         * Imposta il valore della proprietà idRimborso.
         * 
         * @param value
         *     allowed object is
         *     {@link IdDocumentoFiscale }
         *     
         */
        public void setIdRimborso(IdDocumentoFiscale value) {
            this.idRimborso = value;
        }

        /**
         * Recupera il valore della proprietà dataPagamento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataPagamento() {
            return dataPagamento;
        }

        /**
         * Imposta il valore della proprietà dataPagamento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataPagamento(XMLGregorianCalendar value) {
            this.dataPagamento = value;
        }

        /**
         * Recupera il valore della proprietà flagPagamentoAnticipato.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFlagPagamentoAnticipato() {
            return flagPagamentoAnticipato;
        }

        /**
         * Imposta il valore della proprietà flagPagamentoAnticipato.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFlagPagamentoAnticipato(Integer value) {
            this.flagPagamentoAnticipato = value;
        }

        /**
         * Recupera il valore della proprietà flagOperazione.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlagOperazione() {
            return flagOperazione;
        }

        /**
         * Imposta il valore della proprietà flagOperazione.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlagOperazione(String value) {
            this.flagOperazione = value;
        }

        /**
         * Recupera il valore della proprietà cfCittadino.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfCittadino() {
            return cfCittadino;
        }

        /**
         * Imposta il valore della proprietà cfCittadino.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfCittadino(String value) {
            this.cfCittadino = value;
        }

        /**
         * Recupera il valore della proprietà pagamentoTracciato.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPagamentoTracciato() {
            return pagamentoTracciato;
        }

        /**
         * Imposta il valore della proprietà pagamentoTracciato.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPagamentoTracciato(String value) {
            this.pagamentoTracciato = value;
        }

        /**
         * Recupera il valore della proprietà tipoDocumento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDocumento() {
            return tipoDocumento;
        }

        /**
         * Imposta il valore della proprietà tipoDocumento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDocumento(String value) {
            this.tipoDocumento = value;
        }

        /**
         * Recupera il valore della proprietà flagOpposizione.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlagOpposizione() {
            return flagOpposizione;
        }

        /**
         * Imposta il valore della proprietà flagOpposizione.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlagOpposizione(String value) {
            this.flagOpposizione = value;
        }

        /**
         * Gets the value of the voceSpesa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voceSpesa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoceSpesa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Precompilata.DocumentoSpesa.VoceSpesa }
         * 
         * 
         */
        public List<Precompilata.DocumentoSpesa.VoceSpesa> getVoceSpesa() {
            if (voceSpesa == null) {
                voceSpesa = new ArrayList<Precompilata.DocumentoSpesa.VoceSpesa>();
            }
            return this.voceSpesa;
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
         *         &lt;element name="tipoSpesa"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="TK"/&gt;
         *               &lt;enumeration value="FC"/&gt;
         *               &lt;enumeration value="FV"/&gt;
         *               &lt;enumeration value="AS"/&gt;
         *               &lt;enumeration value="AD"/&gt;
         *               &lt;enumeration value="SR"/&gt;
         *               &lt;enumeration value="CT"/&gt;
         *               &lt;enumeration value="PI"/&gt;
         *               &lt;enumeration value="IC"/&gt;
         *               &lt;enumeration value="AA"/&gt;
         *               &lt;enumeration value="SV"/&gt;
         *               &lt;enumeration value="SP"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="flagTipoSpesa" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="importo" type="{}Dec7MinTipo"/&gt;
         *         &lt;choice minOccurs="0"&gt;
         *           &lt;element name="aliquotaIVA" type="{}RateType"/&gt;
         *           &lt;element name="naturaIVA" type="{}NaturaType"/&gt;
         *         &lt;/choice&gt;
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
            "tipoSpesa",
            "flagTipoSpesa",
            "importo",
            "aliquotaIVA",
            "naturaIVA"
        })
        public static class VoceSpesa {

            @XmlElement(required = true)
            protected String tipoSpesa;
            protected String flagTipoSpesa;
            @XmlElement(required = true)
            protected BigDecimal importo;
            protected BigDecimal aliquotaIVA;
            protected String naturaIVA;

            /**
             * Recupera il valore della proprietà tipoSpesa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoSpesa() {
                return tipoSpesa;
            }

            /**
             * Imposta il valore della proprietà tipoSpesa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoSpesa(String value) {
                this.tipoSpesa = value;
            }

            /**
             * Recupera il valore della proprietà flagTipoSpesa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlagTipoSpesa() {
                return flagTipoSpesa;
            }

            /**
             * Imposta il valore della proprietà flagTipoSpesa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlagTipoSpesa(String value) {
                this.flagTipoSpesa = value;
            }

            /**
             * Recupera il valore della proprietà importo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporto() {
                return importo;
            }

            /**
             * Imposta il valore della proprietà importo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporto(BigDecimal value) {
                this.importo = value;
            }

            /**
             * Recupera il valore della proprietà aliquotaIVA.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAliquotaIVA() {
                return aliquotaIVA;
            }

            /**
             * Imposta il valore della proprietà aliquotaIVA.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAliquotaIVA(BigDecimal value) {
                this.aliquotaIVA = value;
            }

            /**
             * Recupera il valore della proprietà naturaIVA.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaturaIVA() {
                return naturaIVA;
            }

            /**
             * Imposta il valore della proprietà naturaIVA.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaturaIVA(String value) {
                this.naturaIVA = value;
            }

        }

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
     *         &lt;element name="codiceRegione" type="{}varChar3Type" minOccurs="0"/&gt;
     *         &lt;element name="codiceAsl" type="{}varChar3Type" minOccurs="0"/&gt;
     *         &lt;element name="codiceSSA" type="{}codSsaType" minOccurs="0"/&gt;
     *         &lt;element name="cfProprietario" type="{}cfType" minOccurs="0"/&gt;
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
        "codiceRegione",
        "codiceAsl",
        "codiceSSA",
        "cfProprietario"
    })
    public static class Proprietario {

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

}
