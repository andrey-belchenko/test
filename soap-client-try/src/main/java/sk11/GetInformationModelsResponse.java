
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
 *         <element name="GetInformationModelsResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetInformationModelsResponse" minOccurs="0"/>
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
    "getInformationModelsResult"
})
@XmlRootElement(name = "GetInformationModelsResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetInformationModelsResponse {

    @XmlElementRef(name = "GetInformationModelsResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetInformationModelsResponse2> getInformationModelsResult;

    /**
     * Gets the value of the getInformationModelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetInformationModelsResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetInformationModelsResponse2> getGetInformationModelsResult() {
        return getInformationModelsResult;
    }

    /**
     * Sets the value of the getInformationModelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetInformationModelsResponse2 }{@code >}
     *     
     */
    public void setGetInformationModelsResult(JAXBElement<GetInformationModelsResponse2> value) {
        this.getInformationModelsResult = value;
    }

}
