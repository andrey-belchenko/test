
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SeverityKind">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Information"/>
 *     <enumeration value="Warning"/>
 *     <enumeration value="Error"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SeverityKind")
@XmlEnum
public enum SeverityKind {

    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    SeverityKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityKind fromValue(String v) {
        for (SeverityKind c: SeverityKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
