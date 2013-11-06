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
 * <p>Java class for TYPEstshape.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TYPEstshape">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Straight"/>
 *     &lt;enumeration value="Convex"/>
 *     &lt;enumeration value="Concave"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TYPEstshape")
@XmlEnum
public enum TYPEstshape {

    @XmlEnumValue("Straight")
    STRAIGHT("Straight"),
    @XmlEnumValue("Convex")
    CONVEX("Convex"),
    @XmlEnumValue("Concave")
    CONCAVE("Concave"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    TYPEstshape(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TYPEstshape fromValue(String v) {
        for (TYPEstshape c: TYPEstshape.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
