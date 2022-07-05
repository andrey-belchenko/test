
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
 *         <element name="GetValidationResultResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetValidationResultResponse" minOccurs="0"/>
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
    "getValidationResultResult"
})
@XmlRootElement(name = "GetValidationResultResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetValidationResultResponse {

    @XmlElementRef(name = "GetValidationResultResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetValidationResultResponse2> getValidationResultResult;

    /**
     * Gets the value of the getValidationResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetValidationResultResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetValidationResultResponse2> getGetValidationResultResult() {
        return getValidationResultResult;
    }

    /**
     * Sets the value of the getValidationResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetValidationResultResponse2 }{@code >}
     *     
     */
    public void setGetValidationResultResult(JAXBElement<GetValidationResultResponse2> value) {
        this.getValidationResultResult = value;
    }

}
