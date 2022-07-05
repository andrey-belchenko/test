
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Message">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Header" type="{http://iec.ch/TC57/2011/schema/message}HeaderType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "header"
})
@XmlSeeAlso({
    RequestMessageOfGetInformationModelsRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 .class,
    RequestMessageOfGetModelVersionRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 .class,
    RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 .class,
    RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 .class,
    RequestMessageOfCreateModelVersionRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 .class,
    RequestMessageOfChangeModelVersionStateTypetOGyFLjl.class,
    ReplyMessageOfReplyjohN50Cd.class,
    RequestMessageOfGetObjectsRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 .class,
    RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl.class,
    RequestMessageOfGetValidationResultRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 .class,
    RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo.class,
    RequestMessageOfGetProfilesRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 .class,
    RequestMessageOfGetProfilesSetRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 .class,
    RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl.class,
    ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 .class
})
public class Message {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderType header;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

}
