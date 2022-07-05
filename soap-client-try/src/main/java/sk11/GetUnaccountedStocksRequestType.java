
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetUnaccountedStocksRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetUnaccountedStocksRequestType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="Mrids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *         <element name="Source" type="{http://monitel.com/CK11/Services/SDM/Messages}DataSourceDescription"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUnaccountedStocksRequestType", propOrder = {
    "mrids",
    "source"
})
public class GetUnaccountedStocksRequestType
    extends Request
{

    @XmlElement(name = "Mrids", required = true, nillable = true)
    protected ArrayOfstring mrids;
    @XmlElement(name = "Source", required = true, nillable = true)
    protected DataSourceDescription source;

    /**
     * Gets the value of the mrids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getMrids() {
        return mrids;
    }

    /**
     * Sets the value of the mrids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setMrids(ArrayOfstring value) {
        this.mrids = value;
    }

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

}
