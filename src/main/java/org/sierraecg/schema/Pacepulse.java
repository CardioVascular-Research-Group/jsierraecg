//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="starttime" use="required" type="{http://www3.medical.philips.com}TYPEstarttime" />
 *       &lt;attribute name="duration" type="{http://www3.medical.philips.com}TYPEduration" />
 *       &lt;attribute name="upswingamp" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="downswingamp" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="paceamptype" type="{http://www3.medical.philips.com}TYPEpaceamptype" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "pacepulse")
public class Pacepulse {

    @XmlAttribute(name = "starttime", required = true)
    protected String starttime;
    @XmlAttribute(name = "duration")
    protected String duration;
    @XmlAttribute(name = "upswingamp")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger upswingamp;
    @XmlAttribute(name = "downswingamp")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger downswingamp;
    @XmlAttribute(name = "paceamptype")
    protected TYPEpaceamptype paceamptype;

    /**
     * Gets the value of the starttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * Sets the value of the starttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarttime(String value) {
        this.starttime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the upswingamp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpswingamp() {
        return upswingamp;
    }

    /**
     * Sets the value of the upswingamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpswingamp(BigInteger value) {
        this.upswingamp = value;
    }

    /**
     * Gets the value of the downswingamp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDownswingamp() {
        return downswingamp;
    }

    /**
     * Sets the value of the downswingamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDownswingamp(BigInteger value) {
        this.downswingamp = value;
    }

    /**
     * Gets the value of the paceamptype property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEpaceamptype }
     *     
     */
    public TYPEpaceamptype getPaceamptype() {
        return paceamptype;
    }

    /**
     * Sets the value of the paceamptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEpaceamptype }
     *     
     */
    public void setPaceamptype(TYPEpaceamptype value) {
        this.paceamptype = value;
    }

}
