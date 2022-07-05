
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessageOfGetInformationModelsRequestTypetOGyFLjl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestMessageOfGetInformationModelsRequestTypetOGyFLjl">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Message">
 *       <sequence>
 *         <element name="Request" type="{http://monitel.com/CK11/Services/SDM/Messages}GetInformationModelsRequestType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageOfGetInformationModelsRequestTypetOGyFLjl", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "request"
})
@XmlSeeAlso({
    GetInformationModelsRequest.class
})
public class RequestMessageOfGetInformationModelsRequestTypetOGyFLjl
    extends Message
{

    @XmlElement(name = "Request", required = true, nillable = true)
    protected GetInformationModelsRequestType request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetInformationModelsRequestType }
     *     
     */
    public GetInformationModelsRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInformationModelsRequestType }
     *     
     */
    public void setRequest(GetInformationModelsRequestType value) {
        this.request = value;
    }

}
