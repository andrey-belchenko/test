
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         <element name="GetUnaccountedStocksResult" type="{http://monitel.com/CK11/Services/SDM/Messages}GetUnaccountedStocksResponse" minOccurs="0"/>
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
    "getUnaccountedStocksResult"
})
@XmlRootElement(name = "GetUnaccountedStocksResponse", namespace = "http://monitel.com/CK11/Services/SDM")
public class GetUnaccountedStocksResponse {

    @XmlElementRef(name = "GetUnaccountedStocksResult", namespace = "http://monitel.com/CK11/Services/SDM", type = JAXBElement.class, required = false)
    protected JAXBElement<GetUnaccountedStocksResponse2> getUnaccountedStocksResult;

    /**
     * Gets the value of the getUnaccountedStocksResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetUnaccountedStocksResponse2 }{@code >}
     *     
     */
    public JAXBElement<GetUnaccountedStocksResponse2> getGetUnaccountedStocksResult() {
        return getUnaccountedStocksResult;
    }

    /**
     * Sets the value of the getUnaccountedStocksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetUnaccountedStocksResponse2 }{@code >}
     *     
     */
    public void setGetUnaccountedStocksResult(JAXBElement<GetUnaccountedStocksResponse2> value) {
        this.getUnaccountedStocksResult = value;
    }

}
