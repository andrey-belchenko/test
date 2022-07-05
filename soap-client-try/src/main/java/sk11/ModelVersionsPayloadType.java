
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelVersionsPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModelVersionsPayloadType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Payload">
 *       <sequence>
 *         <element name="ModelVersions" type="{http://monitel.com/CK11/Services/SDM/Messages}ArrayOfModelVersion" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelVersionsPayloadType", propOrder = {
    "modelVersions"
})
public class ModelVersionsPayloadType
    extends Payload
{

    @XmlElementRef(name = "ModelVersions", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfModelVersion> modelVersions;

    /**
     * Gets the value of the modelVersions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModelVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfModelVersion> getModelVersions() {
        return modelVersions;
    }

    /**
     * Sets the value of the modelVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfModelVersion }{@code >}
     *     
     */
    public void setModelVersions(JAXBElement<ArrayOfModelVersion> value) {
        this.modelVersions = value;
    }

}
