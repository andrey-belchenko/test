
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
 *         <element name="ChangeModelVersionStateResult" type="{http://monitel.com/CK11/Services/SDM/Messages}ChangeModelVersionStateResponse" minOccurs="0"/>
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
    "changeModelVersionStateResult"
})
@XmlRootElement(name = "ChangeModelVersionStateResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class ChangeModelVersionStateResponse {

    @XmlElementRef(name = "ChangeModelVersionStateResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<ChangeModelVersionStateResponse2> changeModelVersionStateResult;

    /**
     * Gets the value of the changeModelVersionStateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChangeModelVersionStateResponse2 }{@code >}
     *     
     */
    public JAXBElement<ChangeModelVersionStateResponse2> getChangeModelVersionStateResult() {
        return changeModelVersionStateResult;
    }

    /**
     * Sets the value of the changeModelVersionStateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChangeModelVersionStateResponse2 }{@code >}
     *     
     */
    public void setChangeModelVersionStateResult(JAXBElement<ChangeModelVersionStateResponse2> value) {
        this.changeModelVersionStateResult = value;
    }

}
