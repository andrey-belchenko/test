
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
 *         <element name="ChangeObjectsResult" type="{http://monitel.com/CK11/Services/SDM/Messages}ChangeObjectsResponse" minOccurs="0"/>
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
    "changeObjectsResult"
})
@XmlRootElement(name = "ChangeObjectsResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class ChangeObjectsResponse {

    @XmlElementRef(name = "ChangeObjectsResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<ChangeObjectsResponse2> changeObjectsResult;

    /**
     * Gets the value of the changeObjectsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeObjectsResponse2 }{@code >}
     *     
     */
    public JAXBElement<ChangeObjectsResponse2> getChangeObjectsResult() {
        return changeObjectsResult;
    }

    /**
     * Sets the value of the changeObjectsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeObjectsResponse2 }{@code >}
     *     
     */
    public void setChangeObjectsResult(JAXBElement<ChangeObjectsResponse2> value) {
        this.changeObjectsResult = value;
    }

}
