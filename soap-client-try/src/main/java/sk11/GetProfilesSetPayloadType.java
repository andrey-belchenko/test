
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProfilesSetPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetProfilesSetPayloadType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Payload">
 *       <sequence>
 *         <element name="ProfilesSets" type="{http://monitel.com/CK11/Services/SDM/Messages}ArrayOfProfilesSet" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProfilesSetPayloadType", propOrder = {
    "profilesSets"
})
public class GetProfilesSetPayloadType
    extends Payload
{

    @XmlElementRef(name = "ProfilesSets", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProfilesSet> profilesSets;

    /**
     * Gets the value of the profilesSets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProfilesSet }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProfilesSet> getProfilesSets() {
        return profilesSets;
    }

    /**
     * Sets the value of the profilesSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProfilesSet }{@code >}
     *     
     */
    public void setProfilesSets(JAXBElement<ArrayOfProfilesSet> value) {
        this.profilesSets = value;
    }

}
