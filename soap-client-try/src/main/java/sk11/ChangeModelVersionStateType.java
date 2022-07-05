
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeModelVersionStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ChangeModelVersionStateType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="InfModelUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         <element name="ModelVersionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="NewState" type="{http://monitel.com/CK11/Services/SDM}ModelVersionState"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeModelVersionStateType", propOrder = {
    "infModelUid",
    "modelVersionId",
    "newState"
})
public class ChangeModelVersionStateType
    extends Request
{

    @XmlElement(name = "InfModelUid", required = true)
    protected String infModelUid;
    @XmlElement(name = "ModelVersionId")
    protected int modelVersionId;
    @XmlElement(name = "NewState", required = true)
    @XmlSchemaType(name = "string")
    protected ModelVersionState newState;

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

    /**
     * Gets the value of the newState property.
     * 
     * @return
     *     possible object is
     *     {@link ModelVersionState }
     *     
     */
    public ModelVersionState getNewState() {
        return newState;
    }

    /**
     * Sets the value of the newState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelVersionState }
     *     
     */
    public void setNewState(ModelVersionState value) {
        this.newState = value;
    }

}
