
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetValidationResultRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetValidationResultRequestType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="Source" type="{http://monitel.com/CK11/Services/SDM/Messages}DataSourceDescription"/>
 *         <element name="MaxResultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Severity" type="{http://monitel.com/CK11/Services/SDM/Messages}RuleSeverity" minOccurs="0"/>
 *         <element name="IsRunCustomRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetValidationResultRequestType", propOrder = {
    "source",
    "maxResultCount",
    "severity",
    "isRunCustomRules"
})
public class GetValidationResultRequestType
    extends Request
{

    @XmlElement(name = "Source", required = true, nillable = true)
    protected DataSourceDescription source;
    @XmlElementRef(name = "MaxResultCount", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxResultCount;
    @XmlElementRef(name = "Severity", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<RuleSeverity> severity;
    @XmlElementRef(name = "IsRunCustomRules", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRunCustomRules;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceDescription }
     *     
     */
    public DataSourceDescription getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceDescription }
     *     
     */
    public void setSource(DataSourceDescription value) {
        this.source = value;
    }

    /**
     * Gets the value of the maxResultCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxResultCount() {
        return maxResultCount;
    }

    /**
     * Sets the value of the maxResultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxResultCount(JAXBElement<Integer> value) {
        this.maxResultCount = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RuleSeverity }{@code >}
     *     
     */
    public JAXBElement<RuleSeverity> getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RuleSeverity }{@code >}
     *     
     */
    public void setSeverity(JAXBElement<RuleSeverity> value) {
        this.severity = value;
    }

    /**
     * Gets the value of the isRunCustomRules property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRunCustomRules() {
        return isRunCustomRules;
    }

    /**
     * Sets the value of the isRunCustomRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRunCustomRules(JAXBElement<Boolean> value) {
        this.isRunCustomRules = value;
    }

}
