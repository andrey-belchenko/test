
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
 *         <element name="DeleteModelVersionResult" type="{http://monitel.com/CK11/Services/SDM/Messages}DeleteModelVersionResponse" minOccurs="0"/>
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
    "deleteModelVersionResult"
})
@XmlRootElement(name = "DeleteModelVersionResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class DeleteModelVersionResponse {

    @XmlElementRef(name = "DeleteModelVersionResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<DeleteModelVersionResponse2> deleteModelVersionResult;

    /**
     * Gets the value of the deleteModelVersionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeleteModelVersionResponse2 }{@code >}
     *     
     */
    public JAXBElement<DeleteModelVersionResponse2> getDeleteModelVersionResult() {
        return deleteModelVersionResult;
    }

    /**
     * Sets the value of the deleteModelVersionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeleteModelVersionResponse2 }{@code >}
     *     
     */
    public void setDeleteModelVersionResult(JAXBElement<DeleteModelVersionResponse2> value) {
        this.deleteModelVersionResult = value;
    }

}
