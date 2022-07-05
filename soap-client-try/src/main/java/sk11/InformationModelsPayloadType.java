
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationModelsPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InformationModelsPayloadType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Payload">
 *       <sequence>
 *         <element name="InfModels" type="{http://monitel.com/CK11/Services/SDM/Messages}ArrayOfInformationModelDescription" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationModelsPayloadType", propOrder = {
    "infModels"
})
public class InformationModelsPayloadType
    extends Payload
{

    @XmlElementRef(name = "InfModels", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInformationModelDescription> infModels;

    /**
     * Gets the value of the infModels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformationModelDescription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInformationModelDescription> getInfModels() {
        return infModels;
    }

    /**
     * Sets the value of the infModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInformationModelDescription }{@code >}
     *     
     */
    public void setInfModels(JAXBElement<ArrayOfInformationModelDescription> value) {
        this.infModels = value;
    }

}
