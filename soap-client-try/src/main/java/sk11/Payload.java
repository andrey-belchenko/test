
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Payload">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payload", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "format"
})
@XmlSeeAlso({
    InformationModelsPayloadType.class,
    ModelVersionsPayloadType.class,
    ModelVersionsDifferencePayloadType.class,
    ActualModelVersionPayloadType.class,
    CreateModelVersionPayloadTyple.class,
    GetObjectsPayloadType.class,
    GetValidationResultPayloadType.class,
    ChangeObjectsRequestPayloadType.class,
    GetProfilesPayloadType.class,
    GetProfilesSetPayloadType.class,
    GetUnaccountedStocksPayloadType.class
})
public class Payload {

    @XmlElement(name = "Format", required = true, nillable = true)
    protected String format;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
