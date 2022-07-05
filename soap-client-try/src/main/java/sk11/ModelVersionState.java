
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelVersionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ModelVersionState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Open"/>
 *     <enumeration value="Close"/>
 *     <enumeration value="Finalize"/>
 *     <enumeration value="Actual"/>
 *     <enumeration value="Deleted"/>
 *     <enumeration value="Removed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModelVersionState", namespace = "http://monitel.com/CK11/Services/SDM")
@XmlEnum
public enum ModelVersionState {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Close")
    CLOSE("Close"),
    @XmlEnumValue("Finalize")
    FINALIZE("Finalize"),
    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Removed")
    REMOVED("Removed");
    private final String value;

    ModelVersionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModelVersionState fromValue(String v) {
        for (ModelVersionState c: ModelVersionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
