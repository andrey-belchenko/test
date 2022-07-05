
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Message">
 *       <sequence>
 *         <element name="Payload" type="{http://monitel.com/CK11/Services/SDM/Messages}ChangeObjectsRequestPayloadType"/>
 *         <element name="Request" type="{http://monitel.com/CK11/Services/SDM/Messages}ChangeObjectsRequestType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "payload",
    "request"
})
@XmlSeeAlso({
    ChangeObjectsRequest.class
})
public class RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo
    extends Message
{

    @XmlElement(name = "Payload", required = true, nillable = true)
    protected ChangeObjectsRequestPayloadType payload;
    @XmlElement(name = "Request", required = true, nillable = true)
    protected ChangeObjectsRequestType request;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeObjectsRequestPayloadType }
     *     
     */
    public ChangeObjectsRequestPayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeObjectsRequestPayloadType }
     *     
     */
    public void setPayload(ChangeObjectsRequestPayloadType value) {
        this.payload = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeObjectsRequestType }
     *     
     */
    public ChangeObjectsRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeObjectsRequestType }
     *     
     */
    public void setRequest(ChangeObjectsRequestType value) {
        this.request = value;
    }

}
