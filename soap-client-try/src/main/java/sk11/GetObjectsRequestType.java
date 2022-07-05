
package sk11;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetObjectsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GetObjectsRequestType">
 *   <complexContent>
 *     <extension base="{http://iec.ch/TC57/2011/schema/message}Request">
 *       <sequence>
 *         <element name="ClassNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="Filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ForExternalUse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Format" type="{http://monitel.com/CK11/Services/common/}FormatType"/>
 *         <element name="Mrids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="Profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProfileStricktly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ProfileUids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         <element name="Source" type="{http://monitel.com/CK11/Services/SDM/Messages}DataSourceDescription"/>
 *         <element name="Uids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         <element name="MaxResultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetObjectsRequestType", propOrder = {
    "classNames",
    "filter",
    "forExternalUse",
    "format",
    "mrids",
    "profile",
    "profileStricktly",
    "profileUids",
    "source",
    "uids",
    "maxResultCount"
})
public class GetObjectsRequestType
    extends Request
{

    @XmlElementRef(name = "ClassNames", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> classNames;
    @XmlElementRef(name = "Filter", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filter;
    @XmlElementRef(name = "ForExternalUse", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forExternalUse;
    @XmlElement(name = "Format", required = true)
    @XmlSchemaType(name = "string")
    protected FormatType format;
    @XmlElementRef(name = "Mrids", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> mrids;
    @XmlElementRef(name = "Profile", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profile;
    @XmlElementRef(name = "ProfileStricktly", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> profileStricktly;
    @XmlElementRef(name = "ProfileUids", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> profileUids;
    @XmlElement(name = "Source", required = true, nillable = true)
    protected DataSourceDescription source;
    @XmlElementRef(name = "Uids", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> uids;
    @XmlElement(name = "MaxResultCount")
    protected Integer maxResultCount;

    /**
     * Gets the value of the classNames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getClassNames() {
        return classNames;
    }

    /**
     * Sets the value of the classNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setClassNames(JAXBElement<ArrayOfstring> value) {
        this.classNames = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilter(JAXBElement<String> value) {
        this.filter = value;
    }

    /**
     * Gets the value of the forExternalUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForExternalUse() {
        return forExternalUse;
    }

    /**
     * Sets the value of the forExternalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForExternalUse(JAXBElement<Boolean> value) {
        this.forExternalUse = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link FormatType }
     *     
     */
    public FormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatType }
     *     
     */
    public void setFormat(FormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the mrids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMrids() {
        return mrids;
    }

    /**
     * Sets the value of the mrids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMrids(JAXBElement<ArrayOfstring> value) {
        this.mrids = value;
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
     * Gets the value of the profileStricktly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getProfileStricktly() {
        return profileStricktly;
    }

    /**
     * Sets the value of the profileStricktly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setProfileStricktly(JAXBElement<Boolean> value) {
        this.profileStricktly = value;
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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceDescription }
     *     
     */
    public DataSourceDescription getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceDescription }
     *     
     */
    public void setSource(DataSourceDescription value) {
        this.source = value;
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

    /**
     * Gets the value of the maxResultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResultCount() {
        return maxResultCount;
    }

    /**
     * Sets the value of the maxResultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResultCount(Integer value) {
        this.maxResultCount = value;
    }

}
