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
 * <p>Classe Java per EsitoInvii complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EsitoInvii"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatiInputRichiesta" type="{http://esitoinvio.p730.sanita.sogei.it/}datiInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsitoInvii", propOrder = {
    "datiInputRichiesta"
})
public class EsitoInvii {

    @XmlElement(name = "DatiInputRichiesta")
    protected DatiInput datiInputRichiesta;

    /**
     * Recupera il valore della proprietà datiInputRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link DatiInput }
     *     
     */
    public DatiInput getDatiInputRichiesta() {
        return datiInputRichiesta;
    }

    /**
     * Imposta il valore della proprietà datiInputRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiInput }
     *     
     */
    public void setDatiInputRichiesta(DatiInput value) {
        this.datiInputRichiesta = value;
    }

}
