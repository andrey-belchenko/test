
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteModelVersionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeleteModelVersionRequestType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="InfModelUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
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
@XmlType(name = "DeleteModelVersionRequestType", propOrder = {
    "infModelUid",
    "modelVersionId"
})
public class DeleteModelVersionRequestType
    extends Request
{

    @XmlElement(name = "InfModelUid", required = true)
    protected String infModelUid;
    @XmlElement(name = "ModelVersionId")
    protected int modelVersionId;

    /**
     * Gets the value of the infModelUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfModelUid() {
        return infModelUid;
    }

    /**
     * Sets the value of the infModelUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfModelUid(String value) {
        this.infModelUid = value;
    }

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
