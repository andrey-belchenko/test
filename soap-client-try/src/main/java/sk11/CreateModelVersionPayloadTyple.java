
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateModelVersionPayloadTyple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreateModelVersionPayloadTyple">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Payload">
 *       <sequence>
 *         <element name="ModelVersionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateModelVersionPayloadTyple", propOrder = {
    "modelVersionId"
})
public class CreateModelVersionPayloadTyple
    extends Payload
{

    @XmlElement(name = "ModelVersionId")
    protected int modelVersionId;

    /**
     * Gets the value of the modelVersionId property.
     * 
     */
    public int getModelVersionId() {
        return modelVersionId;
    }

    /**
     * Sets the value of the modelVersionId property.
     * 
     */
    public void setModelVersionId(int value) {
        this.modelVersionId = value;
    }

}
