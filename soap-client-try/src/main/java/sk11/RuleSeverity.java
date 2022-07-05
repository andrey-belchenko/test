
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RuleSeverity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Error"/>
 *     <enumeration value="ErrorAndWarning"/>
 *     <enumeration value="All"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RuleSeverity")
@XmlEnum
public enum RuleSeverity {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("ErrorAndWarning")
    ERROR_AND_WARNING("ErrorAndWarning"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    RuleSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleSeverity fromValue(String v) {
        for (RuleSeverity c: RuleSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
