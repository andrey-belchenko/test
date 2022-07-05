
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProfileState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Actual"/>
 *     <enumeration value="Work"/>
 *     <enumeration value="Old"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProfileState")
@XmlEnum
public enum ProfileState {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Work")
    WORK("Work"),
    @XmlEnumValue("Old")
    OLD("Old");
    private final String value;

    ProfileState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileState fromValue(String v) {
        for (ProfileState c: ProfileState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
