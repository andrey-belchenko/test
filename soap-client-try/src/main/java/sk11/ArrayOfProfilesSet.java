
package sk11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfilesSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProfilesSet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProfilesSet" type="{http://monitel.com/CK11/Services/SDM/Messages}ProfilesSet" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfilesSet", propOrder = {
    "profilesSet"
})
public class ArrayOfProfilesSet {

    @XmlElement(name = "ProfilesSet", nillable = true)
    protected List<ProfilesSet> profilesSet;

    /**
     * Gets the value of the profilesSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the profilesSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfilesSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfilesSet }
     * 
     * 
     * @return
     *     The value of the profilesSet property.
     */
    public List<ProfilesSet> getProfilesSet() {
        if (profilesSet == null) {
            profilesSet = new ArrayList<>();
        }
        return this.profilesSet;
    }

}
