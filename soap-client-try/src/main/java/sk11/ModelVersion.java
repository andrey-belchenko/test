
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
 * <p>Java class for ModelVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ModelVersion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BaseModelVersionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="CanonicalModelVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ModelVersionState" type="{http://monitel.com/CK11/Services/SDM}ModelVersionState" minOccurs="0"/>
 *         <element name="StartActualDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="EndActualDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ScheduleStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ScheduleEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelVersion", propOrder = {
    "id",
    "baseModelVersionId",
    "name",
    "description",
    "createTime",
    "lastChangeDate",
    "canonicalModelVersion",
    "modelVersionState",
    "startActualDate",
    "endActualDate",
    "scheduleId",
    "scheduleStartDate",
    "scheduleEndDate"
})
public class ModelVersion {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "BaseModelVersionId")
    protected Integer baseModelVersionId;
    @XmlElementRef(name = "Name", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Description", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "CreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "LastChangeDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDate;
    @XmlElementRef(name = "CanonicalModelVersion", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<String> canonicalModelVersion;
    @XmlElement(name = "ModelVersionState")
    @XmlSchemaType(name = "string")
    protected ModelVersionState modelVersionState;
    @XmlElementRef(name = "StartActualDate", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startActualDate;
    @XmlElementRef(name = "EndActualDate", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endActualDate;
    @XmlElementRef(name = "ScheduleId", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scheduleId;
    @XmlElementRef(name = "ScheduleStartDate", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduleStartDate;
    @XmlElementRef(name = "ScheduleEndDate", namespace = "http://monitel.com/CK11/Services/SDM/Messages", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduleEndDate;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the baseModelVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseModelVersionId() {
        return baseModelVersionId;
    }

    /**
     * Sets the value of the baseModelVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseModelVersionId(Integer value) {
        this.baseModelVersionId = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the lastChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDate(XMLGregorianCalendar value) {
        this.lastChangeDate = value;
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
     * Gets the value of the modelVersionState property.
     * 
     * @return
     *     possible object is
     *     {@link ModelVersionState }
     *     
     */
    public ModelVersionState getModelVersionState() {
        return modelVersionState;
    }

    /**
     * Sets the value of the modelVersionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelVersionState }
     *     
     */
    public void setModelVersionState(ModelVersionState value) {
        this.modelVersionState = value;
    }

    /**
     * Gets the value of the startActualDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartActualDate() {
        return startActualDate;
    }

    /**
     * Sets the value of the startActualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartActualDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startActualDate = value;
    }

    /**
     * Gets the value of the endActualDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndActualDate() {
        return endActualDate;
    }

    /**
     * Sets the value of the endActualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndActualDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endActualDate = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScheduleId(JAXBElement<Integer> value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the scheduleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduleStartDate() {
        return scheduleStartDate;
    }

    /**
     * Sets the value of the scheduleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduleStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduleStartDate = value;
    }

    /**
     * Gets the value of the scheduleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduleEndDate() {
        return scheduleEndDate;
    }

    /**
     * Sets the value of the scheduleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduleEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduleEndDate = value;
    }

}
