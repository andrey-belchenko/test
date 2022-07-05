
package sk11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Request">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", namespace = "http://iec.ch/TC57/2011/schema/message")
@XmlSeeAlso({
    GetInformationModelsRequestType.class,
    GetModelVersionRequestType.class,
    GetModelVersionsDifferenceRequestType.class,
    GetActualModelVersionRequestType.class,
    CreateModelVersionRequestType.class,
    ChangeModelVersionStateType.class,
    GetObjectsRequestType.class,
    DeleteModelVersionRequestType.class,
    GetValidationResultRequestType.class,
    ChangeObjectsRequestType.class,
    GetProfilesRequestType.class,
    GetProfilesSetRequestType.class,
    GetUnaccountedStocksRequestType.class
})
public class Request {


}
