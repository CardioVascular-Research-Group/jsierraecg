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
 *         &lt;element ref="{http://www3.medical.philips.com}bloodpressure" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}symptom" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}history" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}diagnosis" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}medication" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}drgcategory" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bloodpressure",
    "symptom",
    "history",
    "diagnosis",
    "medication",
    "drgcategory"
})
@XmlRootElement(name = "patientmedicaldata")
public class Patientmedicaldata {

    protected Bloodpressure bloodpressure;
    protected List<Symptom> symptom;
    protected List<History> history;
    protected List<Diagnosis> diagnosis;
    protected List<Medication> medication;
    protected List<Drgcategory> drgcategory;

    /**
     * Gets the value of the bloodpressure property.
     * 
     * @return
     *     possible object is
     *     {@link Bloodpressure }
     *     
     */
    public Bloodpressure getBloodpressure() {
        return bloodpressure;
    }

    /**
     * Sets the value of the bloodpressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bloodpressure }
     *     
     */
    public void setBloodpressure(Bloodpressure value) {
        this.bloodpressure = value;
    }

    /**
     * Gets the value of the symptom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symptom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymptom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Symptom }
     * 
     * 
     */
    public List<Symptom> getSymptom() {
        if (symptom == null) {
            symptom = new ArrayList<Symptom>();
        }
        return this.symptom;
    }

    /**
     * Gets the value of the history property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the history property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link History }
     * 
     * 
     */
    public List<History> getHistory() {
        if (history == null) {
            history = new ArrayList<History>();
        }
        return this.history;
    }

    /**
     * Gets the value of the diagnosis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Diagnosis }
     * 
     * 
     */
    public List<Diagnosis> getDiagnosis() {
        if (diagnosis == null) {
            diagnosis = new ArrayList<Diagnosis>();
        }
        return this.diagnosis;
    }

    /**
     * Gets the value of the medication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medication }
     * 
     * 
     */
    public List<Medication> getMedication() {
        if (medication == null) {
            medication = new ArrayList<Medication>();
        }
        return this.medication;
    }

    /**
     * Gets the value of the drgcategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drgcategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrgcategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drgcategory }
     * 
     * 
     */
    public List<Drgcategory> getDrgcategory() {
        if (drgcategory == null) {
            drgcategory = new ArrayList<Drgcategory>();
        }
        return this.drgcategory;
    }

}
