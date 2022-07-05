
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetProfilesSetResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetProfilesSetResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProfilesSetResult"
})
@XmlRootElement(name = "GetProfilesSetResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetProfilesSetResponse {

    @XmlElementRef(name = "GetProfilesSetResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetProfilesSetResponse2> getProfilesSetResult;

    /**
     * Gets the value of the getProfilesSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetProfilesSetResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetProfilesSetResponse2> getGetProfilesSetResult() {
        return getProfilesSetResult;
    }

    /**
     * Sets the value of the getProfilesSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetProfilesSetResponse2 }{@code >}
     *     
     */
    public void setGetProfilesSetResult(JAXBElement<GetProfilesSetResponse2> value) {
        this.getProfilesSetResult = value;
    }

}
