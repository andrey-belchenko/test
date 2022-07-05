
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
 *         <element name="GetObjectsResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetObjectsResponse" minOccurs="0"/>
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
    "getObjectsResult"
})
@XmlRootElement(name = "GetObjectsResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetObjectsResponse {

    @XmlElementRef(name = "GetObjectsResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetObjectsResponse2> getObjectsResult;

    /**
     * Gets the value of the getObjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetObjectsResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetObjectsResponse2> getGetObjectsResult() {
        return getObjectsResult;
    }

    /**
     * Sets the value of the getObjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetObjectsResponse2 }{@code >}
     *     
     */
    public void setGetObjectsResult(JAXBElement<GetObjectsResponse2> value) {
        this.getObjectsResult = value;
    }

}
