
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Message">
 *       <sequence>
 *         <element name="Request" type="{http://monitel.com/CK11/Services/SDM/Messages}GetUnaccountedStocksRequestType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "request"
})
@XmlSeeAlso({
    GetUnaccountedStocksRequest.class
})
public class RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl
    extends Message
{

    @XmlElement(name = "Request", required = true, nillable = true)
    protected GetUnaccountedStocksRequestType request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetUnaccountedStocksRequestType }
     *     
     */
    public GetUnaccountedStocksRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUnaccountedStocksRequestType }
     *     
     */
    public void setRequest(GetUnaccountedStocksRequestType value) {
        this.request = value;
    }

}
