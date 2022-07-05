
package sk11;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "GetProfilesMessage", targetNamespace = "http://monitel.com/CK11/Services/SDM")
public class SdmServiceGetProfilesGetProfilesMessageFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FaultMessage faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SdmServiceGetProfilesGetProfilesMessageFaultMessage(String message, FaultMessage faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public SdmServiceGetProfilesGetProfilesMessageFaultMessage(String message, FaultMessage faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: sk11.FaultMessage
     */
    public FaultMessage getFaultInfo() {
        return faultInfo;
    }

}
