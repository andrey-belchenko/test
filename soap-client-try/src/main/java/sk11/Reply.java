
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Reply">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Error" type="{http://iec.ch/TC57/2011/schema/message}ArrayOfErrorType" minOccurs="0"/>
 *         <element name="Result" type="{http://iec.ch/TC57/2011/schema/message}ReplyResult"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reply", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "error",
    "result"
})
public class Reply {

    @XmlElementRef(name = "Error", namespace = "http://iec.ch/TC57/2011/schema/message", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfErrorType> error;
    @XmlElement(name = "Result", required = true)
    @XmlSchemaType(name = "string")
    protected ReplyResult result;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfErrorType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfErrorType> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfErrorType }{@code >}
     *     
     */
    public void setError(JAXBElement<ArrayOfErrorType> value) {
        this.error = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyResult }
     *     
     */
    public ReplyResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyResult }
     *     
     */
    public void setResult(ReplyResult value) {
        this.result = value;
    }

}
