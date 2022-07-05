
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationModelDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InformationModelDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InfModelUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="IsModelVersionSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProfileVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Type" type="{http://monitel.com/CK11/Services/SDM/Messages}InfModelType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationModelDescription", propOrder = {
    "infModelUid",
    "isModelVersionSupport",
    "name",
    "profileVersion",
    "type"
})
public class InformationModelDescription {

    @XmlElement(name = "InfModelUid")
    protected String infModelUid;
    @XmlElement(name = "IsModelVersionSupport")
    protected Boolean isModelVersionSupport;
    @XmlElementRef(name = "Name", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ProfileVersion", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileVersion;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected InfModelType type;

    /**
     * Gets the value of the infModelUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfModelUid() {
        return infModelUid;
    }

    /**
     * Sets the value of the infModelUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfModelUid(String value) {
        this.infModelUid = value;
    }

    /**
     * Gets the value of the isModelVersionSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsModelVersionSupport() {
        return isModelVersionSupport;
    }

    /**
     * Sets the value of the isModelVersionSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsModelVersionSupport(Boolean value) {
        this.isModelVersionSupport = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileVersion(JAXBElement<String> value) {
        this.profileVersion = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link InfModelType }
     *     
     */
    public InfModelType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfModelType }
     *     
     */
    public void setType(InfModelType value) {
        this.type = value;
    }

}
