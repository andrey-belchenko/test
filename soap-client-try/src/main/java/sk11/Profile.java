
package sk11;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Profile">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CanonicalModelVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProfileState" type="{http://monitel.com/CK11/Services/SDM/Messages}ProfileState" minOccurs="0"/>
 *         <element name="ProfilesSetUid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="Uid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "author",
    "canonicalModelVersion",
    "changeDate",
    "comment",
    "content",
    "name",
    "profileState",
    "profilesSetUid",
    "uid"
})
public class Profile {

    @XmlElementRef(name = "Author", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> author;
    @XmlElementRef(name = "CanonicalModelVersion", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> canonicalModelVersion;
    @XmlElement(name = "ChangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeDate;
    @XmlElementRef(name = "Comment", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "Content", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> content;
    @XmlElementRef(name = "Name", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "ProfileState")
    @XmlSchemaType(name = "string")
    protected ProfileState profileState;
    @XmlElement(name = "ProfilesSetUid")
    protected String profilesSetUid;
    @XmlElement(name = "Uid")
    protected String uid;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<String> value) {
        this.author = value;
    }

    /**
     * Gets the value of the canonicalModelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCanonicalModelVersion() {
        return canonicalModelVersion;
    }

    /**
     * Sets the value of the canonicalModelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCanonicalModelVersion(JAXBElement<String> value) {
        this.canonicalModelVersion = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContent(JAXBElement<String> value) {
        this.content = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the profileState property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileState }
     *     
     */
    public ProfileState getProfileState() {
        return profileState;
    }

    /**
     * Sets the value of the profileState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileState }
     *     
     */
    public void setProfileState(ProfileState value) {
        this.profileState = value;
    }

    /**
     * Gets the value of the profilesSetUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilesSetUid() {
        return profilesSetUid;
    }

    /**
     * Sets the value of the profilesSetUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilesSetUid(String value) {
        this.profilesSetUid = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
