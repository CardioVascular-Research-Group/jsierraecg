//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.09 at 03:53:07 PM EST 
//


package org.sierraecg.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TYPEleadset.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TYPEleadset">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="STD-3"/>
 *     &lt;enumeration value="STD-4"/>
 *     &lt;enumeration value="STD-5"/>
 *     &lt;enumeration value="MCL-5"/>
 *     &lt;enumeration value="STD-12"/>
 *     &lt;enumeration value="STD-12 MASON-LIKAR"/>
 *     &lt;enumeration value="MIDA"/>
 *     &lt;enumeration value="EASI"/>
 *     &lt;enumeration value="EASI ON STERNUM STANDARD"/>
 *     &lt;enumeration value="EASI ON STERNUM MASON-LIKAR"/>
 *     &lt;enumeration value="EASI OFF STERNUM STANDARD"/>
 *     &lt;enumeration value="EASI OFF STERNUM MASON-LIKAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TYPEleadset")
@XmlEnum
public enum TYPEleadset {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("STD-3")
    STD_3("STD-3"),
    @XmlEnumValue("STD-4")
    STD_4("STD-4"),
    @XmlEnumValue("STD-5")
    STD_5("STD-5"),
    @XmlEnumValue("MCL-5")
    MCL_5("MCL-5"),
    @XmlEnumValue("STD-12")
    STD_12("STD-12"),
    @XmlEnumValue("STD-12 MASON-LIKAR")
    STD_12_MASON_LIKAR("STD-12 MASON-LIKAR"),
    MIDA("MIDA"),
    EASI("EASI"),
    @XmlEnumValue("EASI ON STERNUM STANDARD")
    EASI_ON_STERNUM_STANDARD("EASI ON STERNUM STANDARD"),
    @XmlEnumValue("EASI ON STERNUM MASON-LIKAR")
    EASI_ON_STERNUM_MASON_LIKAR("EASI ON STERNUM MASON-LIKAR"),
    @XmlEnumValue("EASI OFF STERNUM STANDARD")
    EASI_OFF_STERNUM_STANDARD("EASI OFF STERNUM STANDARD"),
    @XmlEnumValue("EASI OFF STERNUM MASON-LIKAR")
    EASI_OFF_STERNUM_MASON_LIKAR("EASI OFF STERNUM MASON-LIKAR");
    private final String value;

    TYPEleadset(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TYPEleadset fromValue(String v) {
        for (TYPEleadset c: TYPEleadset.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
