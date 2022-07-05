
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
 *         <element name="GetModelVersionsDifferenceResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetModelVersionsDifferenceResponse" minOccurs="0"/>
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
    "getModelVersionsDifferenceResult"
})
@XmlRootElement(name = "GetModelVersionsDifferenceResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetModelVersionsDifferenceResponse {

    @XmlElementRef(name = "GetModelVersionsDifferenceResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetModelVersionsDifferenceResponse2> getModelVersionsDifferenceResult;

    /**
     * Gets the value of the getModelVersionsDifferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetModelVersionsDifferenceResponse2> getGetModelVersionsDifferenceResult() {
        return getModelVersionsDifferenceResult;
    }

    /**
     * Sets the value of the getModelVersionsDifferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceResponse2 }{@code >}
     *     
     */
    public void setGetModelVersionsDifferenceResult(JAXBElement<GetModelVersionsDifferenceResponse2> value) {
        this.getModelVersionsDifferenceResult = value;
    }

}
