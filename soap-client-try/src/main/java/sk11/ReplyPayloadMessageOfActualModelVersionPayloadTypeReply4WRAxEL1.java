
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4wRAxEL1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4wRAxEL1">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Message">
 *       <sequence>
 *         <element name="Payload" type="{http://monitel.com/CK11/Services/SDM/Messages}ActualModelVersionPayloadType"/>
 *         <element name="Reply" type="{http://iec.ch/TC57/2011/schema/message}Reply"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4wRAxEL1", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "payload",
    "reply"
})
@XmlSeeAlso({
    GetActualModelVersionResponse2 .class
})
public class ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1
    extends Message
{

    @XmlElement(name = "Payload", required = true, nillable = true)
    protected ActualModelVersionPayloadType payload;
    @XmlElement(name = "Reply", required = true, nillable = true)
    protected Reply reply;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link ActualModelVersionPayloadType }
     *     
     */
    public ActualModelVersionPayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualModelVersionPayloadType }
     *     
     */
    public void setPayload(ActualModelVersionPayloadType value) {
        this.payload = value;
    }

    /**
     * Gets the value of the reply property.
     * 
     * @return
     *     possible object is
     *     {@link Reply }
     *     
     */
    public Reply getReply() {
        return reply;
    }

    /**
     * Sets the value of the reply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reply }
     *     
     */
    public void setReply(Reply value) {
        this.reply = value;
    }

}
