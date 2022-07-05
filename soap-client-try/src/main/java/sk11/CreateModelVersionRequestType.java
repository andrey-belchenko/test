
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateModelVersionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreateModelVersionRequestType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="BaseModelVersionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InfModelUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateModelVersionRequestType", propOrder = {
    "baseModelVersionId",
    "description",
    "infModelUid",
    "name"
})
public class CreateModelVersionRequestType
    extends Request
{

    @XmlElement(name = "BaseModelVersionId")
    protected int baseModelVersionId;
    @XmlElementRef(name = "Description", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "InfModelUid", required = true)
    protected String infModelUid;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;

    /**
     * Gets the value of the baseModelVersionId property.
     * 
     */
    public int getBaseModelVersionId() {
        return baseModelVersionId;
    }

    /**
     * Sets the value of the baseModelVersionId property.
     * 
     */
    public void setBaseModelVersionId(int value) {
        this.baseModelVersionId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
