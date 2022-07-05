
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
 *         <element name="request" type="{http://monitel.com/CK11/Services/SDM/Messages}CreateModelVersionRequest"/>
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
    "request"
})
@XmlRootElement(name = "CreateModelVersion", namespace = "http://monitel.com/CK11/Services/SDM")
public class CreateModelVersion {

    @XmlElement(namespace = "http://monitel.com/CK11/Services/SDM", required = true, nillable = true)
    protected CreateModelVersionRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CreateModelVersionRequest }
     *     
     */
    public CreateModelVersionRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateModelVersionRequest }
     *     
     */
    public void setRequest(CreateModelVersionRequest value) {
        this.request = value;
    }

}
