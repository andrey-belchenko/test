
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
 *         <element name="CreateModelVersionResult" type="{http://monitel.com/CK11/Services/SDM/Messages}CreateModelVersionResponse" minOccurs="0"/>
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
    "createModelVersionResult"
})
@XmlRootElement(name = "CreateModelVersionResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class CreateModelVersionResponse {

    @XmlElementRef(name = "CreateModelVersionResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateModelVersionResponse2> createModelVersionResult;

    /**
     * Gets the value of the createModelVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateModelVersionResponse2 }{@code >}
     *     
     */
    public JAXBElement<CreateModelVersionResponse2> getCreateModelVersionResult() {
        return createModelVersionResult;
    }

    /**
     * Sets the value of the createModelVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateModelVersionResponse2 }{@code >}
     *     
     */
    public void setCreateModelVersionResult(JAXBElement<CreateModelVersionResponse2> value) {
        this.createModelVersionResult = value;
    }

}
