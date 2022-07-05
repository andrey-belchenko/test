
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetValidationResultPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetValidationResultPayloadType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Payload">
 *       <sequence>
 *         <element name="Results" type="{http://monitel.com/CK11/Services/SDM/Messages}ArrayOfValidationResult" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetValidationResultPayloadType", propOrder = {
    "results"
})
public class GetValidationResultPayloadType
    extends Payload
{

    @XmlElementRef(name = "Results", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfValidationResult> results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfValidationResult> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfValidationResult> value) {
        this.results = value;
    }

}
