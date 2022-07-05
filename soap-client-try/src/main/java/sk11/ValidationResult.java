
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValidationResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ObjectUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="RuleUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="Severity" type="{http://monitel.com/CK11/Services/SDM/Messages}SeverityKind" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult", propOrder = {
    "message",
    "objectUid",
    "ruleUid",
    "severity"
})
public class ValidationResult {

    @XmlElementRef(name = "Message", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "ObjectUid")
    protected String objectUid;
    @XmlElement(name = "RuleUid")
    protected String ruleUid;
    @XmlElement(name = "Severity")
    @XmlSchemaType(name = "string")
    protected SeverityKind severity;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the objectUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectUid() {
        return objectUid;
    }

    /**
     * Sets the value of the objectUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectUid(String value) {
        this.objectUid = value;
    }

    /**
     * Gets the value of the ruleUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleUid() {
        return ruleUid;
    }

    /**
     * Sets the value of the ruleUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleUid(String value) {
        this.ruleUid = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityKind }
     *     
     */
    public SeverityKind getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityKind }
     *     
     */
    public void setSeverity(SeverityKind value) {
        this.severity = value;
    }

}
