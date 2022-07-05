
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActualModelVersionPayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ActualModelVersionPayloadType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Payload">
 *       <sequence>
 *         <element name="ModelVersions" type="{http://monitel.com/CK11/Services/SDM/Messages}ModelVersion" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualModelVersionPayloadType", propOrder = {
    "modelVersions"
})
public class ActualModelVersionPayloadType
    extends Payload
{

    @XmlElementRef(name = "ModelVersions", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ModelVersion> modelVersions;

    /**
     * Gets the value of the modelVersions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModelVersion }{@code >}
     *     
     */
    public JAXBElement<ModelVersion> getModelVersions() {
        return modelVersions;
    }

    /**
     * Sets the value of the modelVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModelVersion }{@code >}
     *     
     */
    public void setModelVersions(JAXBElement<ModelVersion> value) {
        this.modelVersions = value;
    }

}
