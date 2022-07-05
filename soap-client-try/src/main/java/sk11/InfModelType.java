
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfModelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InfModelType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RefMSD"/>
 *     <enumeration value="MSD"/>
 *     <enumeration value="Working"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InfModelType")
@XmlEnum
public enum InfModelType {

    @XmlEnumValue("RefMSD")
    REF_MSD("RefMSD"),
    MSD("MSD"),
    @XmlEnumValue("Working")
    WORKING("Working");
    private final String value;

    InfModelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfModelType fromValue(String v) {
        for (InfModelType c: InfModelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
