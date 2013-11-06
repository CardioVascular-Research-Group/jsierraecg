//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www3.medical.philips.com}inops" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}saturations" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}baseartifacts" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}acartifacts" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}muscleartifacts" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="qrsclippingflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="overrangeflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="measuredflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inops",
    "saturations",
    "baseartifacts",
    "acartifacts",
    "muscleartifacts"
})
@XmlRootElement(name = "leadqualitystates")
public class Leadqualitystates {

    protected List<Inops> inops;
    protected List<Saturations> saturations;
    protected List<Baseartifacts> baseartifacts;
    protected List<Acartifacts> acartifacts;
    protected List<Muscleartifacts> muscleartifacts;
    @XmlAttribute(name = "qrsclippingflag", required = true)
    protected TYPEflag qrsclippingflag;
    @XmlAttribute(name = "overrangeflag", required = true)
    protected TYPEflag overrangeflag;
    @XmlAttribute(name = "measuredflag", required = true)
    protected TYPEflag measuredflag;

    /**
     * Gets the value of the inops property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inops property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInops().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inops }
     * 
     * 
     */
    public List<Inops> getInops() {
        if (inops == null) {
            inops = new ArrayList<Inops>();
        }
        return this.inops;
    }

    /**
     * Gets the value of the saturations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saturations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaturations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Saturations }
     * 
     * 
     */
    public List<Saturations> getSaturations() {
        if (saturations == null) {
            saturations = new ArrayList<Saturations>();
        }
        return this.saturations;
    }

    /**
     * Gets the value of the baseartifacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseartifacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseartifacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Baseartifacts }
     * 
     * 
     */
    public List<Baseartifacts> getBaseartifacts() {
        if (baseartifacts == null) {
            baseartifacts = new ArrayList<Baseartifacts>();
        }
        return this.baseartifacts;
    }

    /**
     * Gets the value of the acartifacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acartifacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcartifacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Acartifacts }
     * 
     * 
     */
    public List<Acartifacts> getAcartifacts() {
        if (acartifacts == null) {
            acartifacts = new ArrayList<Acartifacts>();
        }
        return this.acartifacts;
    }

    /**
     * Gets the value of the muscleartifacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the muscleartifacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMuscleartifacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Muscleartifacts }
     * 
     * 
     */
    public List<Muscleartifacts> getMuscleartifacts() {
        if (muscleartifacts == null) {
            muscleartifacts = new ArrayList<Muscleartifacts>();
        }
        return this.muscleartifacts;
    }

    /**
     * Gets the value of the qrsclippingflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getQrsclippingflag() {
        return qrsclippingflag;
    }

    /**
     * Sets the value of the qrsclippingflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setQrsclippingflag(TYPEflag value) {
        this.qrsclippingflag = value;
    }

    /**
     * Gets the value of the overrangeflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getOverrangeflag() {
        return overrangeflag;
    }

    /**
     * Sets the value of the overrangeflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setOverrangeflag(TYPEflag value) {
        this.overrangeflag = value;
    }

    /**
     * Gets the value of the measuredflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getMeasuredflag() {
        return measuredflag;
    }

    /**
     * Sets the value of the measuredflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setMeasuredflag(TYPEflag value) {
        this.measuredflag = value;
    }

}
