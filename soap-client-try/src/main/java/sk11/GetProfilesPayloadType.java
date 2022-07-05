
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProfilesPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetProfilesPayloadType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Payload">
 *       <sequence>
 *         <element name="Profiles" type="{http://monitel.com/CK11/Services/SDM/Messages}ArrayOfProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProfilesPayloadType", propOrder = {
    "profiles"
})
public class GetProfilesPayloadType
    extends Payload
{

    @XmlElementRef(name = "Profiles", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProfile> profiles;

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProfile }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProfile> getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProfile }{@code >}
     *     
     */
    public void setProfiles(JAXBElement<ArrayOfProfile> value) {
        this.profiles = value;
    }

}
