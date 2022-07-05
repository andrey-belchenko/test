
package sk11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplyResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReplyResult">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OK"/>
 *     <enumeration value="PARTIAL"/>
 *     <enumeration value="FAILED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReplyResult", namespace = "http://iec.ch/TC57/2011/schema/message")
@XmlEnum
public enum ReplyResult {

    OK,
    PARTIAL,
    FAILED;

    public String value() {
        return name();
    }

    public static ReplyResult fromValue(String v) {
        return valueOf(v);
    }

}
