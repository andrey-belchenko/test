
package sk11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfModelVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfModelVersion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModelVersion" type="{http://monitel.com/CK11/Services/SDM/Messages}ModelVersion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModelVersion", propOrder = {
    "modelVersion"
})
public class ArrayOfModelVersion {

    @XmlElement(name = "ModelVersion", nillable = true)
    protected List<ModelVersion> modelVersion;

    /**
     * Gets the value of the modelVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modelVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelVersion }
     * 
     * 
     * @return
     *     The value of the modelVersion property.
     */
    public List<ModelVersion> getModelVersion() {
        if (modelVersion == null) {
            modelVersion = new ArrayList<>();
        }
        return this.modelVersion;
    }

}
