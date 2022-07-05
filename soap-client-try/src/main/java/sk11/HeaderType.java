
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HeaderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Noun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Verb" type="{http://iec.ch/TC57/2011/schema/message}HeaderTypeVerb"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", namespace = "http://iec.ch/TC57/2011/schema/message", propOrder = {
    "noun",
    "verb"
})
public class HeaderType {

    @XmlElement(name = "Noun", required = true, nillable = true)
    protected String noun;
    @XmlElement(name = "Verb", required = true)
    @XmlSchemaType(name = "string")
    protected HeaderTypeVerb verb;

    /**
     * Gets the value of the noun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoun() {
        return noun;
    }

    /**
     * Sets the value of the noun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoun(String value) {
        this.noun = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderTypeVerb }
     *     
     */
    public HeaderTypeVerb getVerb() {
        return verb;
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderTypeVerb }
     *     
     */
    public void setVerb(HeaderTypeVerb value) {
        this.verb = value;
    }

}
