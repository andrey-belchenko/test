
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FormatType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CIMXML"/>
 *     <enumeration value="GZip"/>
 *     <enumeration value="File"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FormatType", namespace = "http://monitel.com/CK11/Services/common/")
@XmlEnum
public enum FormatType {

    CIMXML("CIMXML"),
    @XmlEnumValue("GZip")
    G_ZIP("GZip"),
    @XmlEnumValue("File")
    FILE("File");
    private final String value;

    FormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormatType fromValue(String v) {
        for (FormatType c: FormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
