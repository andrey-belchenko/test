
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="req" type="{http://monitel.com/CK11/Services/SDM/Messages}ChangeObjectsRequest"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "req"
})
@XmlRootElement(name = "ChangeObjects", namespace = "http://monitel.com/CK11/Services/SDM")
public class ChangeObjects {

    @XmlElement(namespace = "http://monitel.com/CK11/Services/SDM", required = true, nillable = true)
    protected ChangeObjectsRequest req;

    /**
     * Gets the value of the req property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeObjectsRequest }
     *     
     */
    public ChangeObjectsRequest getReq() {
        return req;
    }

    /**
     * Sets the value of the req property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeObjectsRequest }
     *     
     */
    public void setReq(ChangeObjectsRequest value) {
        this.req = value;
    }

}
