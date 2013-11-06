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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;group ref="{http://www3.medical.philips.com}globalmeasurements.elements"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fixedmultpflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="multptestvalidflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="qrslikeartfflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="pacebeatmeasflag" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pacedetectleads",
    "pacepulses",
    "pacemodes",
    "pacemalf",
    "pacemisc",
    "ectopicrhythm",
    "qtintdispersion",
    "numberofcomplexes",
    "numberofgroups",
    "beatclassification",
    "qamessagecodes",
    "qaactioncode",
    "pon",
    "qrson",
    "qrsoff",
    "ton",
    "toff",
    "pfrontaxis",
    "phorizaxis",
    "i40Frontaxis",
    "i40Horizaxis",
    "qrsfrontaxis",
    "qrshorizaxis",
    "t40Frontaxis",
    "t40Horizaxis",
    "stfrontaxis",
    "sthorizaxis",
    "tfrontaxis",
    "thorizaxis",
    "atrialrate",
    "lowventrate",
    "meanventrate",
    "highventrate",
    "meanprint",
    "meanprseg",
    "meanqrsdur",
    "meanqtint",
    "meanqtc",
    "deltawavecount",
    "deltawavepercent",
    "bigeminycount",
    "bigeminystring",
    "trigeminycount",
    "trigeminystring",
    "wenckcount",
    "wenckstring",
    "flutterfibcount",
    "qrsinitangle",
    "qrsinitmag",
    "qrsmaxangle",
    "qrsmaxmag",
    "qrstermangle",
    "qrstermmag",
    "qrsrotation",
    "globalreserved"
})
@XmlRootElement(name = "globalmeasurements")
public class Globalmeasurements {

    @XmlList
    protected List<String> pacedetectleads;
    @XmlElement(required = true)
    protected Pacepulses pacepulses;
    @XmlElement(required = true)
    protected Pacemodes pacemodes;
    @XmlElement(required = true)
    protected String pacemalf;
    @XmlElement(required = true)
    protected String pacemisc;
    @XmlElement(required = true)
    protected String ectopicrhythm;
    @XmlElement(required = true)
    protected String qtintdispersion;
    @XmlElement(required = true)
    protected String numberofcomplexes;
    @XmlElement(required = true)
    protected String numberofgroups;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> beatclassification;
    @XmlElement(required = true)
    protected Qamessagecodes qamessagecodes;
    @XmlElement(required = true)
    protected TYPEactioncode qaactioncode;
    @XmlElement(required = true)
    protected String pon;
    @XmlElement(required = true)
    protected String qrson;
    @XmlElement(required = true)
    protected String qrsoff;
    @XmlElement(required = true)
    protected String ton;
    @XmlElement(required = true)
    protected String toff;
    @XmlElement(required = true)
    protected String pfrontaxis;
    @XmlElement(required = true)
    protected String phorizaxis;
    @XmlElement(name = "i40frontaxis", required = true)
    protected String i40Frontaxis;
    @XmlElement(name = "i40horizaxis", required = true)
    protected String i40Horizaxis;
    @XmlElement(required = true)
    protected String qrsfrontaxis;
    @XmlElement(required = true)
    protected String qrshorizaxis;
    @XmlElement(name = "t40frontaxis", required = true)
    protected String t40Frontaxis;
    @XmlElement(name = "t40horizaxis", required = true)
    protected String t40Horizaxis;
    @XmlElement(required = true)
    protected String stfrontaxis;
    @XmlElement(required = true)
    protected String sthorizaxis;
    @XmlElement(required = true)
    protected String tfrontaxis;
    @XmlElement(required = true)
    protected String thorizaxis;
    @XmlElement(required = true)
    protected String atrialrate;
    @XmlElement(required = true)
    protected String lowventrate;
    @XmlElement(required = true)
    protected String meanventrate;
    @XmlElement(required = true)
    protected String highventrate;
    @XmlElement(required = true)
    protected String meanprint;
    @XmlElement(required = true)
    protected String meanprseg;
    @XmlElement(required = true)
    protected String meanqrsdur;
    @XmlElement(required = true)
    protected String meanqtint;
    @XmlElement(required = true)
    protected String meanqtc;
    @XmlElement(required = true)
    protected String deltawavecount;
    @XmlElement(required = true)
    protected String deltawavepercent;
    @XmlElement(required = true)
    protected String bigeminycount;
    @XmlElement(required = true)
    protected String bigeminystring;
    @XmlElement(required = true)
    protected String trigeminycount;
    @XmlElement(required = true)
    protected String trigeminystring;
    @XmlElement(required = true)
    protected String wenckcount;
    @XmlElement(required = true)
    protected String wenckstring;
    @XmlElement(required = true)
    protected String flutterfibcount;
    protected String qrsinitangle;
    protected String qrsinitmag;
    protected String qrsmaxangle;
    protected String qrsmaxmag;
    protected String qrstermangle;
    protected String qrstermmag;
    protected String qrsrotation;
    @XmlElement(required = true)
    protected String globalreserved;
    @XmlAttribute(name = "fixedmultpflag", required = true)
    protected TYPEflag fixedmultpflag;
    @XmlAttribute(name = "multptestvalidflag", required = true)
    protected TYPEflag multptestvalidflag;
    @XmlAttribute(name = "qrslikeartfflag", required = true)
    protected TYPEflag qrslikeartfflag;
    @XmlAttribute(name = "pacebeatmeasflag", required = true)
    protected TYPEflag pacebeatmeasflag;

    /**
     * Gets the value of the pacedetectleads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pacedetectleads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPacedetectleads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPacedetectleads() {
        if (pacedetectleads == null) {
            pacedetectleads = new ArrayList<String>();
        }
        return this.pacedetectleads;
    }

    /**
     * Gets the value of the pacepulses property.
     * 
     * @return
     *     possible object is
     *     {@link Pacepulses }
     *     
     */
    public Pacepulses getPacepulses() {
        return pacepulses;
    }

    /**
     * Sets the value of the pacepulses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacepulses }
     *     
     */
    public void setPacepulses(Pacepulses value) {
        this.pacepulses = value;
    }

    /**
     * Gets the value of the pacemodes property.
     * 
     * @return
     *     possible object is
     *     {@link Pacemodes }
     *     
     */
    public Pacemodes getPacemodes() {
        return pacemodes;
    }

    /**
     * Sets the value of the pacemodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacemodes }
     *     
     */
    public void setPacemodes(Pacemodes value) {
        this.pacemodes = value;
    }

    /**
     * Gets the value of the pacemalf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacemalf() {
        return pacemalf;
    }

    /**
     * Sets the value of the pacemalf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacemalf(String value) {
        this.pacemalf = value;
    }

    /**
     * Gets the value of the pacemisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacemisc() {
        return pacemisc;
    }

    /**
     * Sets the value of the pacemisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacemisc(String value) {
        this.pacemisc = value;
    }

    /**
     * Gets the value of the ectopicrhythm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEctopicrhythm() {
        return ectopicrhythm;
    }

    /**
     * Sets the value of the ectopicrhythm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEctopicrhythm(String value) {
        this.ectopicrhythm = value;
    }

    /**
     * Gets the value of the qtintdispersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtintdispersion() {
        return qtintdispersion;
    }

    /**
     * Sets the value of the qtintdispersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtintdispersion(String value) {
        this.qtintdispersion = value;
    }

    /**
     * Gets the value of the numberofcomplexes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberofcomplexes() {
        return numberofcomplexes;
    }

    /**
     * Sets the value of the numberofcomplexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberofcomplexes(String value) {
        this.numberofcomplexes = value;
    }

    /**
     * Gets the value of the numberofgroups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberofgroups() {
        return numberofgroups;
    }

    /**
     * Sets the value of the numberofgroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberofgroups(String value) {
        this.numberofgroups = value;
    }

    /**
     * Gets the value of the beatclassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beatclassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeatclassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBeatclassification() {
        if (beatclassification == null) {
            beatclassification = new ArrayList<Integer>();
        }
        return this.beatclassification;
    }

    /**
     * Gets the value of the qamessagecodes property.
     * 
     * @return
     *     possible object is
     *     {@link Qamessagecodes }
     *     
     */
    public Qamessagecodes getQamessagecodes() {
        return qamessagecodes;
    }

    /**
     * Sets the value of the qamessagecodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qamessagecodes }
     *     
     */
    public void setQamessagecodes(Qamessagecodes value) {
        this.qamessagecodes = value;
    }

    /**
     * Gets the value of the qaactioncode property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEactioncode }
     *     
     */
    public TYPEactioncode getQaactioncode() {
        return qaactioncode;
    }

    /**
     * Sets the value of the qaactioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEactioncode }
     *     
     */
    public void setQaactioncode(TYPEactioncode value) {
        this.qaactioncode = value;
    }

    /**
     * Gets the value of the pon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPon() {
        return pon;
    }

    /**
     * Sets the value of the pon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPon(String value) {
        this.pon = value;
    }

    /**
     * Gets the value of the qrson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrson() {
        return qrson;
    }

    /**
     * Sets the value of the qrson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrson(String value) {
        this.qrson = value;
    }

    /**
     * Gets the value of the qrsoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsoff() {
        return qrsoff;
    }

    /**
     * Sets the value of the qrsoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsoff(String value) {
        this.qrsoff = value;
    }

    /**
     * Gets the value of the ton property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTon() {
        return ton;
    }

    /**
     * Sets the value of the ton property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTon(String value) {
        this.ton = value;
    }

    /**
     * Gets the value of the toff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToff() {
        return toff;
    }

    /**
     * Sets the value of the toff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToff(String value) {
        this.toff = value;
    }

    /**
     * Gets the value of the pfrontaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfrontaxis() {
        return pfrontaxis;
    }

    /**
     * Sets the value of the pfrontaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfrontaxis(String value) {
        this.pfrontaxis = value;
    }

    /**
     * Gets the value of the phorizaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhorizaxis() {
        return phorizaxis;
    }

    /**
     * Sets the value of the phorizaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhorizaxis(String value) {
        this.phorizaxis = value;
    }

    /**
     * Gets the value of the i40Frontaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI40Frontaxis() {
        return i40Frontaxis;
    }

    /**
     * Sets the value of the i40Frontaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI40Frontaxis(String value) {
        this.i40Frontaxis = value;
    }

    /**
     * Gets the value of the i40Horizaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI40Horizaxis() {
        return i40Horizaxis;
    }

    /**
     * Sets the value of the i40Horizaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI40Horizaxis(String value) {
        this.i40Horizaxis = value;
    }

    /**
     * Gets the value of the qrsfrontaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsfrontaxis() {
        return qrsfrontaxis;
    }

    /**
     * Sets the value of the qrsfrontaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsfrontaxis(String value) {
        this.qrsfrontaxis = value;
    }

    /**
     * Gets the value of the qrshorizaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrshorizaxis() {
        return qrshorizaxis;
    }

    /**
     * Sets the value of the qrshorizaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrshorizaxis(String value) {
        this.qrshorizaxis = value;
    }

    /**
     * Gets the value of the t40Frontaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT40Frontaxis() {
        return t40Frontaxis;
    }

    /**
     * Sets the value of the t40Frontaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT40Frontaxis(String value) {
        this.t40Frontaxis = value;
    }

    /**
     * Gets the value of the t40Horizaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT40Horizaxis() {
        return t40Horizaxis;
    }

    /**
     * Sets the value of the t40Horizaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT40Horizaxis(String value) {
        this.t40Horizaxis = value;
    }

    /**
     * Gets the value of the stfrontaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfrontaxis() {
        return stfrontaxis;
    }

    /**
     * Sets the value of the stfrontaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfrontaxis(String value) {
        this.stfrontaxis = value;
    }

    /**
     * Gets the value of the sthorizaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSthorizaxis() {
        return sthorizaxis;
    }

    /**
     * Sets the value of the sthorizaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSthorizaxis(String value) {
        this.sthorizaxis = value;
    }

    /**
     * Gets the value of the tfrontaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfrontaxis() {
        return tfrontaxis;
    }

    /**
     * Sets the value of the tfrontaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfrontaxis(String value) {
        this.tfrontaxis = value;
    }

    /**
     * Gets the value of the thorizaxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThorizaxis() {
        return thorizaxis;
    }

    /**
     * Sets the value of the thorizaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThorizaxis(String value) {
        this.thorizaxis = value;
    }

    /**
     * Gets the value of the atrialrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtrialrate() {
        return atrialrate;
    }

    /**
     * Sets the value of the atrialrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtrialrate(String value) {
        this.atrialrate = value;
    }

    /**
     * Gets the value of the lowventrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowventrate() {
        return lowventrate;
    }

    /**
     * Sets the value of the lowventrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowventrate(String value) {
        this.lowventrate = value;
    }

    /**
     * Gets the value of the meanventrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanventrate() {
        return meanventrate;
    }

    /**
     * Sets the value of the meanventrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanventrate(String value) {
        this.meanventrate = value;
    }

    /**
     * Gets the value of the highventrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighventrate() {
        return highventrate;
    }

    /**
     * Sets the value of the highventrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighventrate(String value) {
        this.highventrate = value;
    }

    /**
     * Gets the value of the meanprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanprint() {
        return meanprint;
    }

    /**
     * Sets the value of the meanprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanprint(String value) {
        this.meanprint = value;
    }

    /**
     * Gets the value of the meanprseg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanprseg() {
        return meanprseg;
    }

    /**
     * Sets the value of the meanprseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanprseg(String value) {
        this.meanprseg = value;
    }

    /**
     * Gets the value of the meanqrsdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanqrsdur() {
        return meanqrsdur;
    }

    /**
     * Sets the value of the meanqrsdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanqrsdur(String value) {
        this.meanqrsdur = value;
    }

    /**
     * Gets the value of the meanqtint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanqtint() {
        return meanqtint;
    }

    /**
     * Sets the value of the meanqtint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanqtint(String value) {
        this.meanqtint = value;
    }

    /**
     * Gets the value of the meanqtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanqtc() {
        return meanqtc;
    }

    /**
     * Sets the value of the meanqtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanqtc(String value) {
        this.meanqtc = value;
    }

    /**
     * Gets the value of the deltawavecount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltawavecount() {
        return deltawavecount;
    }

    /**
     * Sets the value of the deltawavecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltawavecount(String value) {
        this.deltawavecount = value;
    }

    /**
     * Gets the value of the deltawavepercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltawavepercent() {
        return deltawavepercent;
    }

    /**
     * Sets the value of the deltawavepercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltawavepercent(String value) {
        this.deltawavepercent = value;
    }

    /**
     * Gets the value of the bigeminycount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBigeminycount() {
        return bigeminycount;
    }

    /**
     * Sets the value of the bigeminycount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBigeminycount(String value) {
        this.bigeminycount = value;
    }

    /**
     * Gets the value of the bigeminystring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBigeminystring() {
        return bigeminystring;
    }

    /**
     * Sets the value of the bigeminystring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBigeminystring(String value) {
        this.bigeminystring = value;
    }

    /**
     * Gets the value of the trigeminycount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigeminycount() {
        return trigeminycount;
    }

    /**
     * Sets the value of the trigeminycount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigeminycount(String value) {
        this.trigeminycount = value;
    }

    /**
     * Gets the value of the trigeminystring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigeminystring() {
        return trigeminystring;
    }

    /**
     * Sets the value of the trigeminystring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigeminystring(String value) {
        this.trigeminystring = value;
    }

    /**
     * Gets the value of the wenckcount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWenckcount() {
        return wenckcount;
    }

    /**
     * Sets the value of the wenckcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWenckcount(String value) {
        this.wenckcount = value;
    }

    /**
     * Gets the value of the wenckstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWenckstring() {
        return wenckstring;
    }

    /**
     * Sets the value of the wenckstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWenckstring(String value) {
        this.wenckstring = value;
    }

    /**
     * Gets the value of the flutterfibcount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlutterfibcount() {
        return flutterfibcount;
    }

    /**
     * Sets the value of the flutterfibcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlutterfibcount(String value) {
        this.flutterfibcount = value;
    }

    /**
     * Gets the value of the qrsinitangle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsinitangle() {
        return qrsinitangle;
    }

    /**
     * Sets the value of the qrsinitangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsinitangle(String value) {
        this.qrsinitangle = value;
    }

    /**
     * Gets the value of the qrsinitmag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsinitmag() {
        return qrsinitmag;
    }

    /**
     * Sets the value of the qrsinitmag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsinitmag(String value) {
        this.qrsinitmag = value;
    }

    /**
     * Gets the value of the qrsmaxangle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsmaxangle() {
        return qrsmaxangle;
    }

    /**
     * Sets the value of the qrsmaxangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsmaxangle(String value) {
        this.qrsmaxangle = value;
    }

    /**
     * Gets the value of the qrsmaxmag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsmaxmag() {
        return qrsmaxmag;
    }

    /**
     * Sets the value of the qrsmaxmag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsmaxmag(String value) {
        this.qrsmaxmag = value;
    }

    /**
     * Gets the value of the qrstermangle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrstermangle() {
        return qrstermangle;
    }

    /**
     * Sets the value of the qrstermangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrstermangle(String value) {
        this.qrstermangle = value;
    }

    /**
     * Gets the value of the qrstermmag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrstermmag() {
        return qrstermmag;
    }

    /**
     * Sets the value of the qrstermmag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrstermmag(String value) {
        this.qrstermmag = value;
    }

    /**
     * Gets the value of the qrsrotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsrotation() {
        return qrsrotation;
    }

    /**
     * Sets the value of the qrsrotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsrotation(String value) {
        this.qrsrotation = value;
    }

    /**
     * Gets the value of the globalreserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalreserved() {
        return globalreserved;
    }

    /**
     * Sets the value of the globalreserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalreserved(String value) {
        this.globalreserved = value;
    }

    /**
     * Gets the value of the fixedmultpflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getFixedmultpflag() {
        return fixedmultpflag;
    }

    /**
     * Sets the value of the fixedmultpflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setFixedmultpflag(TYPEflag value) {
        this.fixedmultpflag = value;
    }

    /**
     * Gets the value of the multptestvalidflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getMultptestvalidflag() {
        return multptestvalidflag;
    }

    /**
     * Sets the value of the multptestvalidflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setMultptestvalidflag(TYPEflag value) {
        this.multptestvalidflag = value;
    }

    /**
     * Gets the value of the qrslikeartfflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getQrslikeartfflag() {
        return qrslikeartfflag;
    }

    /**
     * Sets the value of the qrslikeartfflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setQrslikeartfflag(TYPEflag value) {
        this.qrslikeartfflag = value;
    }

    /**
     * Gets the value of the pacebeatmeasflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getPacebeatmeasflag() {
        return pacebeatmeasflag;
    }

    /**
     * Sets the value of the pacebeatmeasflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setPacebeatmeasflag(TYPEflag value) {
        this.pacebeatmeasflag = value;
    }

}
