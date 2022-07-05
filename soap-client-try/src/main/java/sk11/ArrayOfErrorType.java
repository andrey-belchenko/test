
package sk11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfErrorType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ErrorType" type="{http://iec.ch/TC57/2011/schema/message}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfErrorType", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "errorType"
})
public class ArrayOfErrorType {

    @XmlElement(name = "ErrorType", nillable = true)
    protected List<ErrorType> errorType;

    /**
     * Gets the value of the errorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     * @return
     *     The value of the errorType property.
     */
    public List<ErrorType> getErrorType() {
        if (errorType == null) {
            errorType = new ArrayList<>();
        }
        return this.errorType;
    }

}
