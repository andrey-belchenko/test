
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FaultMessage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Reply" type="{http://iec.ch/TC57/2011/schema/message}Reply"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultMessage", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "reply"
})
public class FaultMessage {

    @XmlElement(name = "Reply", required = true, nillable = true)
    protected Reply reply;

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
