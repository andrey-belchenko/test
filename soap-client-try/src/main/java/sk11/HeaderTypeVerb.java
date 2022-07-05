
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderTypeVerb.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HeaderTypeVerb">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="cancel"/>
 *     <enumeration value="canceled"/>
 *     <enumeration value="change"/>
 *     <enumeration value="changed"/>
 *     <enumeration value="create"/>
 *     <enumeration value="created"/>
 *     <enumeration value="close"/>
 *     <enumeration value="closed"/>
 *     <enumeration value="delete"/>
 *     <enumeration value="deleted"/>
 *     <enumeration value="get"/>
 *     <enumeration value="reply"/>
 *     <enumeration value="execute"/>
 *     <enumeration value="executed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HeaderTypeVerb", namespace = "http://iec.ch/TC57/2011/schema/message")
@XmlEnum
public enum HeaderTypeVerb {

    @XmlEnumValue("cancel")
    CANCEL("cancel"),
    @XmlEnumValue("canceled")
    CANCELED("canceled"),
    @XmlEnumValue("change")
    CHANGE("change"),
    @XmlEnumValue("changed")
    CHANGED("changed"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("created")
    CREATED("created"),
    @XmlEnumValue("close")
    CLOSE("close"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("get")
    GET("get"),
    @XmlEnumValue("reply")
    REPLY("reply"),
    @XmlEnumValue("execute")
    EXECUTE("execute"),
    @XmlEnumValue("executed")
    EXECUTED("executed");
    private final String value;

    HeaderTypeVerb(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeaderTypeVerb fromValue(String v) {
        for (HeaderTypeVerb c: HeaderTypeVerb.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
