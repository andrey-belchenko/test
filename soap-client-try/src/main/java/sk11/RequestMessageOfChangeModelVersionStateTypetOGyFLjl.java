
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessageOfChangeModelVersionStateTypetOGyFLjl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestMessageOfChangeModelVersionStateTypetOGyFLjl">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Message">
 *       <sequence>
 *         <element name="Request" type="{http://monitel.com/CK11/Services/SDM/Messages}ChangeModelVersionStateType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageOfChangeModelVersionStateTypetOGyFLjl", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "request"
})
@XmlSeeAlso({
    ChangeModelVersionStateRequest.class
})
public class RequestMessageOfChangeModelVersionStateTypetOGyFLjl
    extends Message
{

    @XmlElement(name = "Request", required = true, nillable = true)
    protected ChangeModelVersionStateType request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeModelVersionStateType }
     *     
     */
    public ChangeModelVersionStateType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeModelVersionStateType }
     *     
     */
    public void setRequest(ChangeModelVersionStateType value) {
        this.request = value;
    }

}
