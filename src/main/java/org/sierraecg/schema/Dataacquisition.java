//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emsdatabaseid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}machine"/>
 *         &lt;element ref="{http://www3.medical.philips.com}acquirer"/>
 *         &lt;element ref="{http://www3.medical.philips.com}signalcharacteristics"/>
 *       &lt;/sequence>
 *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="statflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emsdatabaseid",
    "machine",
    "acquirer",
    "signalcharacteristics"
})
@XmlRootElement(name = "dataacquisition")
public class Dataacquisition {

    protected String emsdatabaseid;
    @XmlElement(required = true)
    protected Machine machine;
    @XmlElement(required = true)
    protected Acquirer acquirer;
    @XmlElement(required = true)
    protected Signalcharacteristics signalcharacteristics;
    @XmlAttribute(name = "date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "statflag", required = true)
    protected TYPEflag statflag;

    /**
     * Gets the value of the emsdatabaseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmsdatabaseid() {
        return emsdatabaseid;
    }

    /**
     * Sets the value of the emsdatabaseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmsdatabaseid(String value) {
        this.emsdatabaseid = value;
    }

    /**
     * Gets the value of the machine property.
     * 
     * @return
     *     possible object is
     *     {@link Machine }
     *     
     */
    public Machine getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Machine }
     *     
     */
    public void setMachine(Machine value) {
        this.machine = value;
    }

    /**
     * Gets the value of the acquirer property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer }
     *     
     */
    public Acquirer getAcquirer() {
        return acquirer;
    }

    /**
     * Sets the value of the acquirer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer }
     *     
     */
    public void setAcquirer(Acquirer value) {
        this.acquirer = value;
    }

    /**
     * Gets the value of the signalcharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Signalcharacteristics }
     *     
     */
    public Signalcharacteristics getSignalcharacteristics() {
        return signalcharacteristics;
    }

    /**
     * Sets the value of the signalcharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signalcharacteristics }
     *     
     */
    public void setSignalcharacteristics(Signalcharacteristics value) {
        this.signalcharacteristics = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the statflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getStatflag() {
        return statflag;
    }

    /**
     * Sets the value of the statflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setStatflag(TYPEflag value) {
        this.statflag = value;
    }

}
