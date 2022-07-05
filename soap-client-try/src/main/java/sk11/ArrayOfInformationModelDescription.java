
package sk11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInformationModelDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfInformationModelDescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InformationModelDescription" type="{http://monitel.com/CK11/Services/SDM/Messages}InformationModelDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInformationModelDescription", propOrder = {
    "informationModelDescription"
})
public class ArrayOfInformationModelDescription {

    @XmlElement(name = "InformationModelDescription", nillable = true)
    protected List<InformationModelDescription> informationModelDescription;

    /**
     * Gets the value of the informationModelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the informationModelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationModelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationModelDescription }
     * 
     * 
     * @return
     *     The value of the informationModelDescription property.
     */
    public List<InformationModelDescription> getInformationModelDescription() {
        if (informationModelDescription == null) {
            informationModelDescription = new ArrayList<>();
        }
        return this.informationModelDescription;
    }

}
