
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
 *         <element name="GetProfilesResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetProfilesResponse" minOccurs="0"/>
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
    "getProfilesResult"
})
@XmlRootElement(name = "GetProfilesResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetProfilesResponse {

    @XmlElementRef(name = "GetProfilesResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetProfilesResponse2> getProfilesResult;

    /**
     * Gets the value of the getProfilesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetProfilesResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetProfilesResponse2> getGetProfilesResult() {
        return getProfilesResult;
    }

    /**
     * Sets the value of the getProfilesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetProfilesResponse2 }{@code >}
     *     
     */
    public void setGetProfilesResult(JAXBElement<GetProfilesResponse2> value) {
        this.getProfilesResult = value;
    }

}
