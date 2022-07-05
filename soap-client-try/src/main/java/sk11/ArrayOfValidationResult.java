
package sk11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfValidationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfValidationResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValidationResult" type="{http://monitel.com/CK11/Services/SDM/Messages}ValidationResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfValidationResult", propOrder = {
    "validationResult"
})
public class ArrayOfValidationResult {

    @XmlElement(name = "ValidationResult", nillable = true)
    protected List<ValidationResult> validationResult;

    /**
     * Gets the value of the validationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the validationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResult }
     * 
     * 
     * @return
     *     The value of the validationResult property.
     */
    public List<ValidationResult> getValidationResult() {
        if (validationResult == null) {
            validationResult = new ArrayList<>();
        }
        return this.validationResult;
    }

}
