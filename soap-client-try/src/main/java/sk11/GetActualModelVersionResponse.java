
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
 *         <element name="GetActualModelVersionResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetActualModelVersionResponse" minOccurs="0"/>
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
    "getActualModelVersionResult"
})
@XmlRootElement(name = "GetActualModelVersionResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetActualModelVersionResponse {

    @XmlElementRef(name = "GetActualModelVersionResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetActualModelVersionResponse2> getActualModelVersionResult;

    /**
     * Gets the value of the getActualModelVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetActualModelVersionResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetActualModelVersionResponse2> getGetActualModelVersionResult() {
        return getActualModelVersionResult;
    }

    /**
     * Sets the value of the getActualModelVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetActualModelVersionResponse2 }{@code >}
     *     
     */
    public void setGetActualModelVersionResult(JAXBElement<GetActualModelVersionResponse2> value) {
        this.getActualModelVersionResult = value;
    }

}
