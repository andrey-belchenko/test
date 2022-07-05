
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessageOfCreateModelVersionRequestTypetOGyFLjl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestMessageOfCreateModelVersionRequestTypetOGyFLjl">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Message">
 *       <sequence>
 *         <element name="Request" type="{http://monitel.com/CK11/Services/SDM/Messages}CreateModelVersionRequestType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageOfCreateModelVersionRequestTypetOGyFLjl", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "request"
})
@XmlSeeAlso({
    CreateModelVersionRequest.class
})
public class RequestMessageOfCreateModelVersionRequestTypetOGyFLjl
    extends Message
{

    @XmlElement(name = "Request", required = true, nillable = true)
    protected CreateModelVersionRequestType request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CreateModelVersionRequestType }
     *     
     */
    public CreateModelVersionRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateModelVersionRequestType }
     *     
     */
    public void setRequest(CreateModelVersionRequestType value) {
        this.request = value;
    }

}
