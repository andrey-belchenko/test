
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4wRAxEL1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4wRAxEL1">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Message">
 *       <sequence>
 *         <element name="Payload" type="{http://monitel.com/CK11/Services/SDM/Messages}CreateModelVersionPayloadTyple"/>
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
@XmlType(name = "ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4wRAxEL1", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "payload",
    "reply"
})
@XmlSeeAlso({
    CreateModelVersionResponse2 .class
})
public class ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1
    extends Message
{

    @XmlElement(name = "Payload", required = true, nillable = true)
    protected CreateModelVersionPayloadTyple payload;
    @XmlElement(name = "Reply", required = true, nillable = true)
    protected Reply reply;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link CreateModelVersionPayloadTyple }
     *     
     */
    public CreateModelVersionPayloadTyple getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateModelVersionPayloadTyple }
     *     
     */
    public void setPayload(CreateModelVersionPayloadTyple value) {
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
