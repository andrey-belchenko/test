
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetModelVersionsDifferenceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetModelVersionsDifferenceRequestType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="ForvardInfModelUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         <element name="ForwardMvId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProfileUids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         <element name="ReverseInfModelUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid"/>
 *         <element name="ReverseMvId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Uids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetModelVersionsDifferenceRequestType", propOrder = {
    "forvardInfModelUid",
    "forwardMvId",
    "profile",
    "profileUids",
    "reverseInfModelUid",
    "reverseMvId",
    "uids"
})
public class GetModelVersionsDifferenceRequestType
    extends Request
{

    @XmlElement(name = "ForvardInfModelUid", required = true)
    protected String forvardInfModelUid;
    @XmlElement(name = "ForwardMvId")
    protected int forwardMvId;
    @XmlElementRef(name = "Profile", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profile;
    @XmlElementRef(name = "ProfileUids", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> profileUids;
    @XmlElement(name = "ReverseInfModelUid", required = true)
    protected String reverseInfModelUid;
    @XmlElement(name = "ReverseMvId")
    protected int reverseMvId;
    @XmlElementRef(name = "Uids", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> uids;

    /**
     * Gets the value of the forvardInfModelUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForvardInfModelUid() {
        return forvardInfModelUid;
    }

    /**
     * Sets the value of the forvardInfModelUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForvardInfModelUid(String value) {
        this.forvardInfModelUid = value;
    }

    /**
     * Gets the value of the forwardMvId property.
     * 
     */
    public int getForwardMvId() {
        return forwardMvId;
    }

    /**
     * Sets the value of the forwardMvId property.
     * 
     */
    public void setForwardMvId(int value) {
        this.forwardMvId = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfile(JAXBElement<String> value) {
        this.profile = value;
    }

    /**
     * Gets the value of the profileUids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public JAXBElement<ArrayOfguid> getProfileUids() {
        return profileUids;
    }

    /**
     * Sets the value of the profileUids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public void setProfileUids(JAXBElement<ArrayOfguid> value) {
        this.profileUids = value;
    }

    /**
     * Gets the value of the reverseInfModelUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseInfModelUid() {
        return reverseInfModelUid;
    }

    /**
     * Sets the value of the reverseInfModelUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseInfModelUid(String value) {
        this.reverseInfModelUid = value;
    }

    /**
     * Gets the value of the reverseMvId property.
     * 
     */
    public int getReverseMvId() {
        return reverseMvId;
    }

    /**
     * Sets the value of the reverseMvId property.
     * 
     */
    public void setReverseMvId(int value) {
        this.reverseMvId = value;
    }

    /**
     * Gets the value of the uids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public JAXBElement<ArrayOfguid> getUids() {
        return uids;
    }

    /**
     * Sets the value of the uids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public void setUids(JAXBElement<ArrayOfguid> value) {
        this.uids = value;
    }

}
