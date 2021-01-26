//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.01.22 alle 03:38:11 PM CET 
//


package com.altevie.invioSpese.jaxb.esito;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per esitiNegativi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esitiNegativi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dettaglioEsitoNegativo" type="{http://esitoinvio.p730.sanita.sogei.it/}dettaglioEsitoNegativo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitiNegativi", propOrder = {
    "dettaglioEsitoNegativo"
})
public class EsitiNegativi {

    @XmlElement(required = true)
    protected List<DettaglioEsitoNegativo> dettaglioEsitoNegativo;

    /**
     * Gets the value of the dettaglioEsitoNegativo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioEsitoNegativo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioEsitoNegativo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioEsitoNegativo }
     * 
     * 
     */
    public List<DettaglioEsitoNegativo> getDettaglioEsitoNegativo() {
        if (dettaglioEsitoNegativo == null) {
            dettaglioEsitoNegativo = new ArrayList<DettaglioEsitoNegativo>();
        }
        return this.dettaglioEsitoNegativo;
    }

}
