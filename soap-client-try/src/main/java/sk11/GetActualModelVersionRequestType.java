
package sk11;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetActualModelVersionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetActualModelVersionRequestType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="InfModelUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActualModelVersionRequestType", propOrder = {
    "date",
    "infModelUid"
})
public class GetActualModelVersionRequestType
    extends Request
{

    @XmlElementRef(name = "Date", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> date;
    @XmlElement(name = "InfModelUid", required = true)
    protected String infModelUid;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDate(JAXBElement<XMLGregorianCalendar> value) {
        this.date = value;
    }

    /**
     * Gets the value of the infModelUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfModelUid() {
        return infModelUid;
    }

    /**
     * Sets the value of the infModelUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfModelUid(String value) {
        this.infModelUid = value;
    }

}
