
package test;

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
 *         <element name="GetDataUsingDataContractResult" type="{http://schemas.datacontract.org/2004/07/}CompositeType" minOccurs="0"/>
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
    "getDataUsingDataContractResult"
})
@XmlRootElement(name = "GetDataUsingDataContractResponse")
public class GetDataUsingDataContractResponse {

    @XmlElementRef(name = "GetDataUsingDataContractResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CompositeType> getDataUsingDataContractResult;

    /**
     * Gets the value of the getDataUsingDataContractResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     *     
     */
    public JAXBElement<CompositeType> getGetDataUsingDataContractResult() {
        return getDataUsingDataContractResult;
    }

    /**
     * Sets the value of the getDataUsingDataContractResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompositeType }{@code >}
     *     
     */
    public void setGetDataUsingDataContractResult(JAXBElement<CompositeType> value) {
        this.getDataUsingDataContractResult = value;
    }

}
