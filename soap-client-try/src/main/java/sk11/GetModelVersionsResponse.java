
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
 *         <element name="GetModelVersionsResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetModelVersionsResponse" minOccurs="0"/>
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
    "getModelVersionsResult"
})
@XmlRootElement(name = "GetModelVersionsResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetModelVersionsResponse {

    @XmlElementRef(name = "GetModelVersionsResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetModelVersionsResponse2> getModelVersionsResult;

    /**
     * Gets the value of the getModelVersionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetModelVersionsResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetModelVersionsResponse2> getGetModelVersionsResult() {
        return getModelVersionsResult;
    }

    /**
     * Sets the value of the getModelVersionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetModelVersionsResponse2 }{@code >}
     *     
     */
    public void setGetModelVersionsResult(JAXBElement<GetModelVersionsResponse2> value) {
        this.getModelVersionsResult = value;
    }

}
