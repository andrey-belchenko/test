
package sk11;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk11 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InformationModelsFaultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "InformationModelsFaultMessage");
    private final static QName _ModelVersionState_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ModelVersionState");
    private final static QName _ModelVersionsFaultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ModelVersionsFaultMessage");
    private final static QName _ModelVersionsDifferenceFaultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ModelVersionsDifferenceFaultMessage");
    private final static QName _GetActualModelVersionFaultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetActualModelVersionFaultMessage");
    private final static QName _ChangeModelVersionStatetMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ChangeModelVersionStatetMessage");
    private final static QName _ObjectsFaultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ObjectsFaultMessage");
    private final static QName _DeleteModelVersionFaultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "DeleteModelVersionFaultMessage");
    private final static QName _ValidationResultFaultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ValidationResultFaultMessage");
    private final static QName _ChangeObjectsMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ChangeObjectsMessage");
    private final static QName _GetProfilesMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetProfilesMessage");
    private final static QName _GetProfilesSetMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetProfilesSetMessage");
    private final static QName _GetUnaccountedStocksMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetUnaccountedStocksMessage");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetInformationModelsRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetInformationModelsRequest");
    private final static QName _GetInformationModelsRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetInformationModelsRequestType");
    private final static QName _InfModelType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "InfModelType");
    private final static QName _GetInformationModelsResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetInformationModelsResponse");
    private final static QName _InformationModelsPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "InformationModelsPayloadType");
    private final static QName _ArrayOfInformationModelDescription_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ArrayOfInformationModelDescription");
    private final static QName _InformationModelDescription_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "InformationModelDescription");
    private final static QName _GetModelVersionsRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetModelVersionsRequest");
    private final static QName _GetModelVersionRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetModelVersionRequestType");
    private final static QName _GetModelVersionsResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetModelVersionsResponse");
    private final static QName _ModelVersionsPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ModelVersionsPayloadType");
    private final static QName _ArrayOfModelVersion_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ArrayOfModelVersion");
    private final static QName _ModelVersion_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ModelVersion");
    private final static QName _GetModelVersionsDifferenceRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetModelVersionsDifferenceRequest");
    private final static QName _GetModelVersionsDifferenceRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetModelVersionsDifferenceRequestType");
    private final static QName _GetModelVersionsDifferenceResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetModelVersionsDifferenceResponse");
    private final static QName _ModelVersionsDifferencePayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ModelVersionsDifferencePayloadType");
    private final static QName _GetActualModelVersionRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetActualModelVersionRequest");
    private final static QName _GetActualModelVersionRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetActualModelVersionRequestType");
    private final static QName _GetActualModelVersionResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetActualModelVersionResponse");
    private final static QName _ActualModelVersionPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ActualModelVersionPayloadType");
    private final static QName _CreateModelVersionRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "CreateModelVersionRequest");
    private final static QName _CreateModelVersionRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "CreateModelVersionRequestType");
    private final static QName _CreateModelVersionResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "CreateModelVersionResponse");
    private final static QName _CreateModelVersionPayloadTyple_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "CreateModelVersionPayloadTyple");
    private final static QName _ChangeModelVersionStateRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ChangeModelVersionStateRequest");
    private final static QName _ChangeModelVersionStateType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ChangeModelVersionStateType");
    private final static QName _ChangeModelVersionStateResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ChangeModelVersionStateResponse");
    private final static QName _GetObjectsRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetObjectsRequest");
    private final static QName _GetObjectsRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetObjectsRequestType");
    private final static QName _DataSourceDescription_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "DataSourceDescription");
    private final static QName _GetObjectsResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetObjectsResponse");
    private final static QName _GetObjectsPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetObjectsPayloadType");
    private final static QName _DeleteModelVersionRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "DeleteModelVersionRequest");
    private final static QName _DeleteModelVersionRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "DeleteModelVersionRequestType");
    private final static QName _DeleteModelVersionResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "DeleteModelVersionResponse");
    private final static QName _GetValidationResultRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetValidationResultRequest");
    private final static QName _GetValidationResultRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetValidationResultRequestType");
    private final static QName _RuleSeverity_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "RuleSeverity");
    private final static QName _GetValidationResultResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetValidationResultResponse");
    private final static QName _GetValidationResultPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetValidationResultPayloadType");
    private final static QName _ArrayOfValidationResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ArrayOfValidationResult");
    private final static QName _ValidationResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ValidationResult");
    private final static QName _SeverityKind_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "SeverityKind");
    private final static QName _ChangeObjectsRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ChangeObjectsRequest");
    private final static QName _ChangeObjectsRequestPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ChangeObjectsRequestPayloadType");
    private final static QName _ChangeObjectsRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ChangeObjectsRequestType");
    private final static QName _ChangeObjectsResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ChangeObjectsResponse");
    private final static QName _GetProfilesRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesRequest");
    private final static QName _GetProfilesRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesRequestType");
    private final static QName _ProfileState_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ProfileState");
    private final static QName _GetProfilesResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesResponse");
    private final static QName _GetProfilesPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesPayloadType");
    private final static QName _ArrayOfProfile_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ArrayOfProfile");
    private final static QName _Profile_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Profile");
    private final static QName _GetProfilesSetRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesSetRequest");
    private final static QName _GetProfilesSetRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesSetRequestType");
    private final static QName _GetProfilesSetResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesSetResponse");
    private final static QName _GetProfilesSetPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetProfilesSetPayloadType");
    private final static QName _ArrayOfProfilesSet_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ArrayOfProfilesSet");
    private final static QName _ProfilesSet_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ProfilesSet");
    private final static QName _GetUnaccountedStocksRequest_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetUnaccountedStocksRequest");
    private final static QName _GetUnaccountedStocksRequestType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetUnaccountedStocksRequestType");
    private final static QName _GetUnaccountedStocksResponse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetUnaccountedStocksResponse");
    private final static QName _GetUnaccountedStocksPayloadType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "GetUnaccountedStocksPayloadType");
    private final static QName _RequestMessageOfGetInformationModelsRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetInformationModelsRequestTypetOGyFLjl");
    private final static QName _Message_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Message");
    private final static QName _HeaderType_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "HeaderType");
    private final static QName _HeaderTypeVerb_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "HeaderTypeVerb");
    private final static QName _Request_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Request");
    private final static QName _ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfInformationModelsPayloadTypeReply4wRAxEL1");
    private final static QName _Payload_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Payload");
    private final static QName _Reply_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Reply");
    private final static QName _ArrayOfErrorType_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ArrayOfErrorType");
    private final static QName _ErrorType_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ErrorType");
    private final static QName _ReplyResult_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyResult");
    private final static QName _FaultMessage_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "FaultMessage");
    private final static QName _RequestMessageOfGetModelVersionRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetModelVersionRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfModelVersionsPayloadTypeReply4wRAxEL1");
    private final static QName _RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4wRAxEL1");
    private final static QName _RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4wRAxEL1");
    private final static QName _RequestMessageOfCreateModelVersionRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfCreateModelVersionRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4wRAxEL1");
    private final static QName _RequestMessageOfChangeModelVersionStateTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfChangeModelVersionStateTypetOGyFLjl");
    private final static QName _ReplyMessageOfReplyjohN50Cd_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyMessageOfReplyjohN50cd");
    private final static QName _RequestMessageOfGetObjectsRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetObjectsRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfGetObjectsPayloadTypeReply4wRAxEL1");
    private final static QName _RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl");
    private final static QName _RequestMessageOfGetValidationResultRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetValidationResultRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4wRAxEL1");
    private final static QName _RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo");
    private final static QName _RequestMessageOfGetProfilesRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetProfilesRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfGetProfilesPayloadTypeReply4wRAxEL1");
    private final static QName _RequestMessageOfGetProfilesSetRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetProfilesSetRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4wRAxEL1");
    private final static QName _RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl");
    private final static QName _ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4wRAxEL1");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _ArrayOfguid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfguid");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _FormatType_QNAME = new QName("http://monitel.com/CK11/Services/common/", "FormatType");
    private final static QName _GetInformationModelsResponseGetInformationModelsResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetInformationModelsResult");
    private final static QName _GetModelVersionsResponseGetModelVersionsResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetModelVersionsResult");
    private final static QName _GetModelVersionsDifferenceResponseGetModelVersionsDifferenceResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetModelVersionsDifferenceResult");
    private final static QName _GetActualModelVersionResponseGetActualModelVersionResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetActualModelVersionResult");
    private final static QName _CreateModelVersionResponseCreateModelVersionResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "CreateModelVersionResult");
    private final static QName _ChangeModelVersionStateResponseChangeModelVersionStateResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ChangeModelVersionStateResult");
    private final static QName _GetObjectsResponseGetObjectsResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetObjectsResult");
    private final static QName _DeleteModelVersionResponseDeleteModelVersionResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "DeleteModelVersionResult");
    private final static QName _GetValidationResultResponseGetValidationResultResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetValidationResultResult");
    private final static QName _ChangeObjectsResponseChangeObjectsResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "ChangeObjectsResult");
    private final static QName _GetProfilesResponseGetProfilesResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetProfilesResult");
    private final static QName _GetProfilesSetResponseGetProfilesSetResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetProfilesSetResult");
    private final static QName _GetUnaccountedStocksResponseGetUnaccountedStocksResult_QNAME = new QName("http://monitel.com/CK11/Services/SDM", "GetUnaccountedStocksResult");
    private final static QName _ErrorTypeCode_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Code");
    private final static QName _ErrorTypeReason_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Reason");
    private final static QName _ReplyError_QNAME = new QName("http://iec.ch/TC57/2011/schema/message", "Error");
    private final static QName _GetUnaccountedStocksPayloadTypeMrids_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Mrids");
    private final static QName _ProfilesSetCanonicalModelVersion_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "CanonicalModelVersion");
    private final static QName _ProfilesSetComment_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Comment");
    private final static QName _ProfilesSetName_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Name");
    private final static QName _GetProfilesSetPayloadTypeProfilesSets_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ProfilesSets");
    private final static QName _GetProfilesSetRequestTypeEnabled_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Enabled");
    private final static QName _ProfileAuthor_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Author");
    private final static QName _ProfileContent_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Content");
    private final static QName _GetProfilesPayloadTypeProfiles_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Profiles");
    private final static QName _GetProfilesRequestTypeEndTime_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "EndTime");
    private final static QName _GetProfilesRequestTypeProfileUids_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ProfileUids");
    private final static QName _GetProfilesRequestTypeProfilesSetUid_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ProfilesSetUid");
    private final static QName _GetProfilesRequestTypeStartTime_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "StartTime");
    private final static QName _ValidationResultMessage_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Message");
    private final static QName _GetValidationResultPayloadTypeResults_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Results");
    private final static QName _GetValidationResultRequestTypeMaxResultCount_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "MaxResultCount");
    private final static QName _GetValidationResultRequestTypeSeverity_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Severity");
    private final static QName _GetValidationResultRequestTypeIsRunCustomRules_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "IsRunCustomRules");
    private final static QName _DataSourceDescriptionContextId_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ContextId");
    private final static QName _DataSourceDescriptionInfModelUid_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "InfModelUid");
    private final static QName _DataSourceDescriptionModelVersionId_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ModelVersionId");
    private final static QName _GetObjectsRequestTypeClassNames_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ClassNames");
    private final static QName _GetObjectsRequestTypeFilter_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Filter");
    private final static QName _GetObjectsRequestTypeForExternalUse_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ForExternalUse");
    private final static QName _GetObjectsRequestTypeProfileStricktly_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ProfileStricktly");
    private final static QName _GetObjectsRequestTypeUids_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Uids");
    private final static QName _CreateModelVersionRequestTypeDescription_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Description");
    private final static QName _ActualModelVersionPayloadTypeModelVersions_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ModelVersions");
    private final static QName _GetActualModelVersionRequestTypeDate_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Date");
    private final static QName _ModelVersionsDifferencePayloadTypeDifferences_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Differences");
    private final static QName _ModelVersionStartActualDate_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "StartActualDate");
    private final static QName _ModelVersionEndActualDate_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "EndActualDate");
    private final static QName _ModelVersionScheduleId_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ScheduleId");
    private final static QName _ModelVersionScheduleStartDate_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ScheduleStartDate");
    private final static QName _ModelVersionScheduleEndDate_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ScheduleEndDate");
    private final static QName _GetModelVersionRequestTypeIds_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Ids");
    private final static QName _InformationModelDescriptionProfileVersion_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "ProfileVersion");
    private final static QName _InformationModelsPayloadTypeInfModels_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "InfModels");
    private final static QName _GetInformationModelsRequestTypeType_QNAME = new QName("http://monitel.com/CK11/Services/SDM/Messages", "Type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk11
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInformationModels }
     * 
     * @return
     *     the new instance of {@link GetInformationModels }
     */
    public GetInformationModels createGetInformationModels() {
        return new GetInformationModels();
    }

    /**
     * Create an instance of {@link GetInformationModelsRequest }
     * 
     * @return
     *     the new instance of {@link GetInformationModelsRequest }
     */
    public GetInformationModelsRequest createGetInformationModelsRequest() {
        return new GetInformationModelsRequest();
    }

    /**
     * Create an instance of {@link GetInformationModelsResponse }
     * 
     * @return
     *     the new instance of {@link GetInformationModelsResponse }
     */
    public GetInformationModelsResponse createGetInformationModelsResponse() {
        return new GetInformationModelsResponse();
    }

    /**
     * Create an instance of {@link GetInformationModelsResponse2 }
     * 
     * @return
     *     the new instance of {@link GetInformationModelsResponse2 }
     */
    public GetInformationModelsResponse2 createGetInformationModelsResponse2() {
        return new GetInformationModelsResponse2();
    }

    /**
     * Create an instance of {@link FaultMessage }
     * 
     * @return
     *     the new instance of {@link FaultMessage }
     */
    public FaultMessage createFaultMessage() {
        return new FaultMessage();
    }

    /**
     * Create an instance of {@link GetModelVersions }
     * 
     * @return
     *     the new instance of {@link GetModelVersions }
     */
    public GetModelVersions createGetModelVersions() {
        return new GetModelVersions();
    }

    /**
     * Create an instance of {@link GetModelVersionsRequest }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsRequest }
     */
    public GetModelVersionsRequest createGetModelVersionsRequest() {
        return new GetModelVersionsRequest();
    }

    /**
     * Create an instance of {@link GetModelVersionsResponse }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsResponse }
     */
    public GetModelVersionsResponse createGetModelVersionsResponse() {
        return new GetModelVersionsResponse();
    }

    /**
     * Create an instance of {@link GetModelVersionsResponse2 }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsResponse2 }
     */
    public GetModelVersionsResponse2 createGetModelVersionsResponse2() {
        return new GetModelVersionsResponse2();
    }

    /**
     * Create an instance of {@link GetModelVersionsDifference }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsDifference }
     */
    public GetModelVersionsDifference createGetModelVersionsDifference() {
        return new GetModelVersionsDifference();
    }

    /**
     * Create an instance of {@link GetModelVersionsDifferenceRequest }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsDifferenceRequest }
     */
    public GetModelVersionsDifferenceRequest createGetModelVersionsDifferenceRequest() {
        return new GetModelVersionsDifferenceRequest();
    }

    /**
     * Create an instance of {@link GetModelVersionsDifferenceResponse }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsDifferenceResponse }
     */
    public GetModelVersionsDifferenceResponse createGetModelVersionsDifferenceResponse() {
        return new GetModelVersionsDifferenceResponse();
    }

    /**
     * Create an instance of {@link GetModelVersionsDifferenceResponse2 }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsDifferenceResponse2 }
     */
    public GetModelVersionsDifferenceResponse2 createGetModelVersionsDifferenceResponse2() {
        return new GetModelVersionsDifferenceResponse2();
    }

    /**
     * Create an instance of {@link GetActualModelVersion }
     * 
     * @return
     *     the new instance of {@link GetActualModelVersion }
     */
    public GetActualModelVersion createGetActualModelVersion() {
        return new GetActualModelVersion();
    }

    /**
     * Create an instance of {@link GetActualModelVersionRequest }
     * 
     * @return
     *     the new instance of {@link GetActualModelVersionRequest }
     */
    public GetActualModelVersionRequest createGetActualModelVersionRequest() {
        return new GetActualModelVersionRequest();
    }

    /**
     * Create an instance of {@link GetActualModelVersionResponse }
     * 
     * @return
     *     the new instance of {@link GetActualModelVersionResponse }
     */
    public GetActualModelVersionResponse createGetActualModelVersionResponse() {
        return new GetActualModelVersionResponse();
    }

    /**
     * Create an instance of {@link GetActualModelVersionResponse2 }
     * 
     * @return
     *     the new instance of {@link GetActualModelVersionResponse2 }
     */
    public GetActualModelVersionResponse2 createGetActualModelVersionResponse2() {
        return new GetActualModelVersionResponse2();
    }

    /**
     * Create an instance of {@link CreateModelVersion }
     * 
     * @return
     *     the new instance of {@link CreateModelVersion }
     */
    public CreateModelVersion createCreateModelVersion() {
        return new CreateModelVersion();
    }

    /**
     * Create an instance of {@link CreateModelVersionRequest }
     * 
     * @return
     *     the new instance of {@link CreateModelVersionRequest }
     */
    public CreateModelVersionRequest createCreateModelVersionRequest() {
        return new CreateModelVersionRequest();
    }

    /**
     * Create an instance of {@link CreateModelVersionResponse }
     * 
     * @return
     *     the new instance of {@link CreateModelVersionResponse }
     */
    public CreateModelVersionResponse createCreateModelVersionResponse() {
        return new CreateModelVersionResponse();
    }

    /**
     * Create an instance of {@link CreateModelVersionResponse2 }
     * 
     * @return
     *     the new instance of {@link CreateModelVersionResponse2 }
     */
    public CreateModelVersionResponse2 createCreateModelVersionResponse2() {
        return new CreateModelVersionResponse2();
    }

    /**
     * Create an instance of {@link ChangeModelVersionState }
     * 
     * @return
     *     the new instance of {@link ChangeModelVersionState }
     */
    public ChangeModelVersionState createChangeModelVersionState() {
        return new ChangeModelVersionState();
    }

    /**
     * Create an instance of {@link ChangeModelVersionStateRequest }
     * 
     * @return
     *     the new instance of {@link ChangeModelVersionStateRequest }
     */
    public ChangeModelVersionStateRequest createChangeModelVersionStateRequest() {
        return new ChangeModelVersionStateRequest();
    }

    /**
     * Create an instance of {@link ChangeModelVersionStateResponse }
     * 
     * @return
     *     the new instance of {@link ChangeModelVersionStateResponse }
     */
    public ChangeModelVersionStateResponse createChangeModelVersionStateResponse() {
        return new ChangeModelVersionStateResponse();
    }

    /**
     * Create an instance of {@link ChangeModelVersionStateResponse2 }
     * 
     * @return
     *     the new instance of {@link ChangeModelVersionStateResponse2 }
     */
    public ChangeModelVersionStateResponse2 createChangeModelVersionStateResponse2() {
        return new ChangeModelVersionStateResponse2();
    }

    /**
     * Create an instance of {@link GetObjects }
     * 
     * @return
     *     the new instance of {@link GetObjects }
     */
    public GetObjects createGetObjects() {
        return new GetObjects();
    }

    /**
     * Create an instance of {@link GetObjectsRequest }
     * 
     * @return
     *     the new instance of {@link GetObjectsRequest }
     */
    public GetObjectsRequest createGetObjectsRequest() {
        return new GetObjectsRequest();
    }

    /**
     * Create an instance of {@link GetObjectsResponse }
     * 
     * @return
     *     the new instance of {@link GetObjectsResponse }
     */
    public GetObjectsResponse createGetObjectsResponse() {
        return new GetObjectsResponse();
    }

    /**
     * Create an instance of {@link GetObjectsResponse2 }
     * 
     * @return
     *     the new instance of {@link GetObjectsResponse2 }
     */
    public GetObjectsResponse2 createGetObjectsResponse2() {
        return new GetObjectsResponse2();
    }

    /**
     * Create an instance of {@link DeleteModelVersion }
     * 
     * @return
     *     the new instance of {@link DeleteModelVersion }
     */
    public DeleteModelVersion createDeleteModelVersion() {
        return new DeleteModelVersion();
    }

    /**
     * Create an instance of {@link DeleteModelVersionRequest }
     * 
     * @return
     *     the new instance of {@link DeleteModelVersionRequest }
     */
    public DeleteModelVersionRequest createDeleteModelVersionRequest() {
        return new DeleteModelVersionRequest();
    }

    /**
     * Create an instance of {@link DeleteModelVersionResponse }
     * 
     * @return
     *     the new instance of {@link DeleteModelVersionResponse }
     */
    public DeleteModelVersionResponse createDeleteModelVersionResponse() {
        return new DeleteModelVersionResponse();
    }

    /**
     * Create an instance of {@link DeleteModelVersionResponse2 }
     * 
     * @return
     *     the new instance of {@link DeleteModelVersionResponse2 }
     */
    public DeleteModelVersionResponse2 createDeleteModelVersionResponse2() {
        return new DeleteModelVersionResponse2();
    }

    /**
     * Create an instance of {@link GetValidationResult }
     * 
     * @return
     *     the new instance of {@link GetValidationResult }
     */
    public GetValidationResult createGetValidationResult() {
        return new GetValidationResult();
    }

    /**
     * Create an instance of {@link GetValidationResultRequest }
     * 
     * @return
     *     the new instance of {@link GetValidationResultRequest }
     */
    public GetValidationResultRequest createGetValidationResultRequest() {
        return new GetValidationResultRequest();
    }

    /**
     * Create an instance of {@link GetValidationResultResponse }
     * 
     * @return
     *     the new instance of {@link GetValidationResultResponse }
     */
    public GetValidationResultResponse createGetValidationResultResponse() {
        return new GetValidationResultResponse();
    }

    /**
     * Create an instance of {@link GetValidationResultResponse2 }
     * 
     * @return
     *     the new instance of {@link GetValidationResultResponse2 }
     */
    public GetValidationResultResponse2 createGetValidationResultResponse2() {
        return new GetValidationResultResponse2();
    }

    /**
     * Create an instance of {@link ChangeObjects }
     * 
     * @return
     *     the new instance of {@link ChangeObjects }
     */
    public ChangeObjects createChangeObjects() {
        return new ChangeObjects();
    }

    /**
     * Create an instance of {@link ChangeObjectsRequest }
     * 
     * @return
     *     the new instance of {@link ChangeObjectsRequest }
     */
    public ChangeObjectsRequest createChangeObjectsRequest() {
        return new ChangeObjectsRequest();
    }

    /**
     * Create an instance of {@link ChangeObjectsResponse }
     * 
     * @return
     *     the new instance of {@link ChangeObjectsResponse }
     */
    public ChangeObjectsResponse createChangeObjectsResponse() {
        return new ChangeObjectsResponse();
    }

    /**
     * Create an instance of {@link ChangeObjectsResponse2 }
     * 
     * @return
     *     the new instance of {@link ChangeObjectsResponse2 }
     */
    public ChangeObjectsResponse2 createChangeObjectsResponse2() {
        return new ChangeObjectsResponse2();
    }

    /**
     * Create an instance of {@link GetProfiles }
     * 
     * @return
     *     the new instance of {@link GetProfiles }
     */
    public GetProfiles createGetProfiles() {
        return new GetProfiles();
    }

    /**
     * Create an instance of {@link GetProfilesRequest }
     * 
     * @return
     *     the new instance of {@link GetProfilesRequest }
     */
    public GetProfilesRequest createGetProfilesRequest() {
        return new GetProfilesRequest();
    }

    /**
     * Create an instance of {@link GetProfilesResponse }
     * 
     * @return
     *     the new instance of {@link GetProfilesResponse }
     */
    public GetProfilesResponse createGetProfilesResponse() {
        return new GetProfilesResponse();
    }

    /**
     * Create an instance of {@link GetProfilesResponse2 }
     * 
     * @return
     *     the new instance of {@link GetProfilesResponse2 }
     */
    public GetProfilesResponse2 createGetProfilesResponse2() {
        return new GetProfilesResponse2();
    }

    /**
     * Create an instance of {@link GetProfilesSet }
     * 
     * @return
     *     the new instance of {@link GetProfilesSet }
     */
    public GetProfilesSet createGetProfilesSet() {
        return new GetProfilesSet();
    }

    /**
     * Create an instance of {@link GetProfilesSetRequest }
     * 
     * @return
     *     the new instance of {@link GetProfilesSetRequest }
     */
    public GetProfilesSetRequest createGetProfilesSetRequest() {
        return new GetProfilesSetRequest();
    }

    /**
     * Create an instance of {@link GetProfilesSetResponse }
     * 
     * @return
     *     the new instance of {@link GetProfilesSetResponse }
     */
    public GetProfilesSetResponse createGetProfilesSetResponse() {
        return new GetProfilesSetResponse();
    }

    /**
     * Create an instance of {@link GetProfilesSetResponse2 }
     * 
     * @return
     *     the new instance of {@link GetProfilesSetResponse2 }
     */
    public GetProfilesSetResponse2 createGetProfilesSetResponse2() {
        return new GetProfilesSetResponse2();
    }

    /**
     * Create an instance of {@link GetUnaccountedStocks }
     * 
     * @return
     *     the new instance of {@link GetUnaccountedStocks }
     */
    public GetUnaccountedStocks createGetUnaccountedStocks() {
        return new GetUnaccountedStocks();
    }

    /**
     * Create an instance of {@link GetUnaccountedStocksRequest }
     * 
     * @return
     *     the new instance of {@link GetUnaccountedStocksRequest }
     */
    public GetUnaccountedStocksRequest createGetUnaccountedStocksRequest() {
        return new GetUnaccountedStocksRequest();
    }

    /**
     * Create an instance of {@link GetUnaccountedStocksResponse }
     * 
     * @return
     *     the new instance of {@link GetUnaccountedStocksResponse }
     */
    public GetUnaccountedStocksResponse createGetUnaccountedStocksResponse() {
        return new GetUnaccountedStocksResponse();
    }

    /**
     * Create an instance of {@link GetUnaccountedStocksResponse2 }
     * 
     * @return
     *     the new instance of {@link GetUnaccountedStocksResponse2 }
     */
    public GetUnaccountedStocksResponse2 createGetUnaccountedStocksResponse2() {
        return new GetUnaccountedStocksResponse2();
    }

    /**
     * Create an instance of {@link GetInformationModelsRequestType }
     * 
     * @return
     *     the new instance of {@link GetInformationModelsRequestType }
     */
    public GetInformationModelsRequestType createGetInformationModelsRequestType() {
        return new GetInformationModelsRequestType();
    }

    /**
     * Create an instance of {@link InformationModelsPayloadType }
     * 
     * @return
     *     the new instance of {@link InformationModelsPayloadType }
     */
    public InformationModelsPayloadType createInformationModelsPayloadType() {
        return new InformationModelsPayloadType();
    }

    /**
     * Create an instance of {@link ArrayOfInformationModelDescription }
     * 
     * @return
     *     the new instance of {@link ArrayOfInformationModelDescription }
     */
    public ArrayOfInformationModelDescription createArrayOfInformationModelDescription() {
        return new ArrayOfInformationModelDescription();
    }

    /**
     * Create an instance of {@link InformationModelDescription }
     * 
     * @return
     *     the new instance of {@link InformationModelDescription }
     */
    public InformationModelDescription createInformationModelDescription() {
        return new InformationModelDescription();
    }

    /**
     * Create an instance of {@link GetModelVersionRequestType }
     * 
     * @return
     *     the new instance of {@link GetModelVersionRequestType }
     */
    public GetModelVersionRequestType createGetModelVersionRequestType() {
        return new GetModelVersionRequestType();
    }

    /**
     * Create an instance of {@link ModelVersionsPayloadType }
     * 
     * @return
     *     the new instance of {@link ModelVersionsPayloadType }
     */
    public ModelVersionsPayloadType createModelVersionsPayloadType() {
        return new ModelVersionsPayloadType();
    }

    /**
     * Create an instance of {@link ArrayOfModelVersion }
     * 
     * @return
     *     the new instance of {@link ArrayOfModelVersion }
     */
    public ArrayOfModelVersion createArrayOfModelVersion() {
        return new ArrayOfModelVersion();
    }

    /**
     * Create an instance of {@link ModelVersion }
     * 
     * @return
     *     the new instance of {@link ModelVersion }
     */
    public ModelVersion createModelVersion() {
        return new ModelVersion();
    }

    /**
     * Create an instance of {@link GetModelVersionsDifferenceRequestType }
     * 
     * @return
     *     the new instance of {@link GetModelVersionsDifferenceRequestType }
     */
    public GetModelVersionsDifferenceRequestType createGetModelVersionsDifferenceRequestType() {
        return new GetModelVersionsDifferenceRequestType();
    }

    /**
     * Create an instance of {@link ModelVersionsDifferencePayloadType }
     * 
     * @return
     *     the new instance of {@link ModelVersionsDifferencePayloadType }
     */
    public ModelVersionsDifferencePayloadType createModelVersionsDifferencePayloadType() {
        return new ModelVersionsDifferencePayloadType();
    }

    /**
     * Create an instance of {@link GetActualModelVersionRequestType }
     * 
     * @return
     *     the new instance of {@link GetActualModelVersionRequestType }
     */
    public GetActualModelVersionRequestType createGetActualModelVersionRequestType() {
        return new GetActualModelVersionRequestType();
    }

    /**
     * Create an instance of {@link ActualModelVersionPayloadType }
     * 
     * @return
     *     the new instance of {@link ActualModelVersionPayloadType }
     */
    public ActualModelVersionPayloadType createActualModelVersionPayloadType() {
        return new ActualModelVersionPayloadType();
    }

    /**
     * Create an instance of {@link CreateModelVersionRequestType }
     * 
     * @return
     *     the new instance of {@link CreateModelVersionRequestType }
     */
    public CreateModelVersionRequestType createCreateModelVersionRequestType() {
        return new CreateModelVersionRequestType();
    }

    /**
     * Create an instance of {@link CreateModelVersionPayloadTyple }
     * 
     * @return
     *     the new instance of {@link CreateModelVersionPayloadTyple }
     */
    public CreateModelVersionPayloadTyple createCreateModelVersionPayloadTyple() {
        return new CreateModelVersionPayloadTyple();
    }

    /**
     * Create an instance of {@link ChangeModelVersionStateType }
     * 
     * @return
     *     the new instance of {@link ChangeModelVersionStateType }
     */
    public ChangeModelVersionStateType createChangeModelVersionStateType() {
        return new ChangeModelVersionStateType();
    }

    /**
     * Create an instance of {@link GetObjectsRequestType }
     * 
     * @return
     *     the new instance of {@link GetObjectsRequestType }
     */
    public GetObjectsRequestType createGetObjectsRequestType() {
        return new GetObjectsRequestType();
    }

    /**
     * Create an instance of {@link DataSourceDescription }
     * 
     * @return
     *     the new instance of {@link DataSourceDescription }
     */
    public DataSourceDescription createDataSourceDescription() {
        return new DataSourceDescription();
    }

    /**
     * Create an instance of {@link GetObjectsPayloadType }
     * 
     * @return
     *     the new instance of {@link GetObjectsPayloadType }
     */
    public GetObjectsPayloadType createGetObjectsPayloadType() {
        return new GetObjectsPayloadType();
    }

    /**
     * Create an instance of {@link DeleteModelVersionRequestType }
     * 
     * @return
     *     the new instance of {@link DeleteModelVersionRequestType }
     */
    public DeleteModelVersionRequestType createDeleteModelVersionRequestType() {
        return new DeleteModelVersionRequestType();
    }

    /**
     * Create an instance of {@link GetValidationResultRequestType }
     * 
     * @return
     *     the new instance of {@link GetValidationResultRequestType }
     */
    public GetValidationResultRequestType createGetValidationResultRequestType() {
        return new GetValidationResultRequestType();
    }

    /**
     * Create an instance of {@link GetValidationResultPayloadType }
     * 
     * @return
     *     the new instance of {@link GetValidationResultPayloadType }
     */
    public GetValidationResultPayloadType createGetValidationResultPayloadType() {
        return new GetValidationResultPayloadType();
    }

    /**
     * Create an instance of {@link ArrayOfValidationResult }
     * 
     * @return
     *     the new instance of {@link ArrayOfValidationResult }
     */
    public ArrayOfValidationResult createArrayOfValidationResult() {
        return new ArrayOfValidationResult();
    }

    /**
     * Create an instance of {@link ValidationResult }
     * 
     * @return
     *     the new instance of {@link ValidationResult }
     */
    public ValidationResult createValidationResult() {
        return new ValidationResult();
    }

    /**
     * Create an instance of {@link ChangeObjectsRequestPayloadType }
     * 
     * @return
     *     the new instance of {@link ChangeObjectsRequestPayloadType }
     */
    public ChangeObjectsRequestPayloadType createChangeObjectsRequestPayloadType() {
        return new ChangeObjectsRequestPayloadType();
    }

    /**
     * Create an instance of {@link ChangeObjectsRequestType }
     * 
     * @return
     *     the new instance of {@link ChangeObjectsRequestType }
     */
    public ChangeObjectsRequestType createChangeObjectsRequestType() {
        return new ChangeObjectsRequestType();
    }

    /**
     * Create an instance of {@link GetProfilesRequestType }
     * 
     * @return
     *     the new instance of {@link GetProfilesRequestType }
     */
    public GetProfilesRequestType createGetProfilesRequestType() {
        return new GetProfilesRequestType();
    }

    /**
     * Create an instance of {@link GetProfilesPayloadType }
     * 
     * @return
     *     the new instance of {@link GetProfilesPayloadType }
     */
    public GetProfilesPayloadType createGetProfilesPayloadType() {
        return new GetProfilesPayloadType();
    }

    /**
     * Create an instance of {@link ArrayOfProfile }
     * 
     * @return
     *     the new instance of {@link ArrayOfProfile }
     */
    public ArrayOfProfile createArrayOfProfile() {
        return new ArrayOfProfile();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     * @return
     *     the new instance of {@link Profile }
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link GetProfilesSetRequestType }
     * 
     * @return
     *     the new instance of {@link GetProfilesSetRequestType }
     */
    public GetProfilesSetRequestType createGetProfilesSetRequestType() {
        return new GetProfilesSetRequestType();
    }

    /**
     * Create an instance of {@link GetProfilesSetPayloadType }
     * 
     * @return
     *     the new instance of {@link GetProfilesSetPayloadType }
     */
    public GetProfilesSetPayloadType createGetProfilesSetPayloadType() {
        return new GetProfilesSetPayloadType();
    }

    /**
     * Create an instance of {@link ArrayOfProfilesSet }
     * 
     * @return
     *     the new instance of {@link ArrayOfProfilesSet }
     */
    public ArrayOfProfilesSet createArrayOfProfilesSet() {
        return new ArrayOfProfilesSet();
    }

    /**
     * Create an instance of {@link ProfilesSet }
     * 
     * @return
     *     the new instance of {@link ProfilesSet }
     */
    public ProfilesSet createProfilesSet() {
        return new ProfilesSet();
    }

    /**
     * Create an instance of {@link GetUnaccountedStocksRequestType }
     * 
     * @return
     *     the new instance of {@link GetUnaccountedStocksRequestType }
     */
    public GetUnaccountedStocksRequestType createGetUnaccountedStocksRequestType() {
        return new GetUnaccountedStocksRequestType();
    }

    /**
     * Create an instance of {@link GetUnaccountedStocksPayloadType }
     * 
     * @return
     *     the new instance of {@link GetUnaccountedStocksPayloadType }
     */
    public GetUnaccountedStocksPayloadType createGetUnaccountedStocksPayloadType() {
        return new GetUnaccountedStocksPayloadType();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetInformationModelsRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetInformationModelsRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetInformationModelsRequestTypetOGyFLjl createRequestMessageOfGetInformationModelsRequestTypetOGyFLjl() {
        return new RequestMessageOfGetInformationModelsRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link Message }
     * 
     * @return
     *     the new instance of {@link Message }
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     * @return
     *     the new instance of {@link HeaderType }
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link Request }
     * 
     * @return
     *     the new instance of {@link Request }
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link Payload }
     * 
     * @return
     *     the new instance of {@link Payload }
     */
    public Payload createPayload() {
        return new Payload();
    }

    /**
     * Create an instance of {@link Reply }
     * 
     * @return
     *     the new instance of {@link Reply }
     */
    public Reply createReply() {
        return new Reply();
    }

    /**
     * Create an instance of {@link ArrayOfErrorType }
     * 
     * @return
     *     the new instance of {@link ArrayOfErrorType }
     */
    public ArrayOfErrorType createArrayOfErrorType() {
        return new ArrayOfErrorType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     * @return
     *     the new instance of {@link ErrorType }
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetModelVersionRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetModelVersionRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetModelVersionRequestTypetOGyFLjl createRequestMessageOfGetModelVersionRequestTypetOGyFLjl() {
        return new RequestMessageOfGetModelVersionRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl createRequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl() {
        return new RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl createRequestMessageOfGetActualModelVersionRequestTypetOGyFLjl() {
        return new RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestMessageOfCreateModelVersionRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfCreateModelVersionRequestTypetOGyFLjl }
     */
    public RequestMessageOfCreateModelVersionRequestTypetOGyFLjl createRequestMessageOfCreateModelVersionRequestTypetOGyFLjl() {
        return new RequestMessageOfCreateModelVersionRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 createReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1() {
        return new ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestMessageOfChangeModelVersionStateTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfChangeModelVersionStateTypetOGyFLjl }
     */
    public RequestMessageOfChangeModelVersionStateTypetOGyFLjl createRequestMessageOfChangeModelVersionStateTypetOGyFLjl() {
        return new RequestMessageOfChangeModelVersionStateTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyMessageOfReplyjohN50Cd }
     * 
     * @return
     *     the new instance of {@link ReplyMessageOfReplyjohN50Cd }
     */
    public ReplyMessageOfReplyjohN50Cd createReplyMessageOfReplyjohN50Cd() {
        return new ReplyMessageOfReplyjohN50Cd();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetObjectsRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetObjectsRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetObjectsRequestTypetOGyFLjl createRequestMessageOfGetObjectsRequestTypetOGyFLjl() {
        return new RequestMessageOfGetObjectsRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl }
     */
    public RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl createRequestMessageOfDeleteModelVersionRequestTypetOGyFLjl() {
        return new RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetValidationResultRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetValidationResultRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetValidationResultRequestTypetOGyFLjl createRequestMessageOfGetValidationResultRequestTypetOGyFLjl() {
        return new RequestMessageOfGetValidationResultRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo }
     * 
     * @return
     *     the new instance of {@link RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo }
     */
    public RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo createRequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo() {
        return new RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetProfilesRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetProfilesRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetProfilesRequestTypetOGyFLjl createRequestMessageOfGetProfilesRequestTypetOGyFLjl() {
        return new RequestMessageOfGetProfilesRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetProfilesSetRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetProfilesSetRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetProfilesSetRequestTypetOGyFLjl createRequestMessageOfGetProfilesSetRequestTypetOGyFLjl() {
        return new RequestMessageOfGetProfilesSetRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl }
     * 
     * @return
     *     the new instance of {@link RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl }
     */
    public RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl createRequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl() {
        return new RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl();
    }

    /**
     * Create an instance of {@link ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 }
     * 
     * @return
     *     the new instance of {@link ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 }
     */
    public ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 createReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1() {
        return new ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     * @return
     *     the new instance of {@link ArrayOfint }
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     * @return
     *     the new instance of {@link ArrayOfguid }
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfstring }
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "InformationModelsFaultMessage")
    public JAXBElement<FaultMessage> createInformationModelsFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_InformationModelsFaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelVersionState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModelVersionState }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ModelVersionState")
    public JAXBElement<ModelVersionState> createModelVersionState(ModelVersionState value) {
        return new JAXBElement<>(_ModelVersionState_QNAME, ModelVersionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ModelVersionsFaultMessage")
    public JAXBElement<FaultMessage> createModelVersionsFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_ModelVersionsFaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ModelVersionsDifferenceFaultMessage")
    public JAXBElement<FaultMessage> createModelVersionsDifferenceFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_ModelVersionsDifferenceFaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetActualModelVersionFaultMessage")
    public JAXBElement<FaultMessage> createGetActualModelVersionFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_GetActualModelVersionFaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ChangeModelVersionStatetMessage")
    public JAXBElement<FaultMessage> createChangeModelVersionStatetMessage(FaultMessage value) {
        return new JAXBElement<>(_ChangeModelVersionStatetMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ObjectsFaultMessage")
    public JAXBElement<FaultMessage> createObjectsFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_ObjectsFaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "DeleteModelVersionFaultMessage")
    public JAXBElement<FaultMessage> createDeleteModelVersionFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_DeleteModelVersionFaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ValidationResultFaultMessage")
    public JAXBElement<FaultMessage> createValidationResultFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_ValidationResultFaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ChangeObjectsMessage")
    public JAXBElement<FaultMessage> createChangeObjectsMessage(FaultMessage value) {
        return new JAXBElement<>(_ChangeObjectsMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetProfilesMessage")
    public JAXBElement<FaultMessage> createGetProfilesMessage(FaultMessage value) {
        return new JAXBElement<>(_GetProfilesMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetProfilesSetMessage")
    public JAXBElement<FaultMessage> createGetProfilesSetMessage(FaultMessage value) {
        return new JAXBElement<>(_GetProfilesSetMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetUnaccountedStocksMessage")
    public JAXBElement<FaultMessage> createGetUnaccountedStocksMessage(FaultMessage value) {
        return new JAXBElement<>(_GetUnaccountedStocksMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformationModelsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformationModelsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetInformationModelsRequest")
    public JAXBElement<GetInformationModelsRequest> createGetInformationModelsRequest(GetInformationModelsRequest value) {
        return new JAXBElement<>(_GetInformationModelsRequest_QNAME, GetInformationModelsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformationModelsRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformationModelsRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetInformationModelsRequestType")
    public JAXBElement<GetInformationModelsRequestType> createGetInformationModelsRequestType(GetInformationModelsRequestType value) {
        return new JAXBElement<>(_GetInformationModelsRequestType_QNAME, GetInformationModelsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfModelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfModelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "InfModelType")
    public JAXBElement<InfModelType> createInfModelType(InfModelType value) {
        return new JAXBElement<>(_InfModelType_QNAME, InfModelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformationModelsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformationModelsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetInformationModelsResponse")
    public JAXBElement<GetInformationModelsResponse2> createGetInformationModelsResponse(GetInformationModelsResponse2 value) {
        return new JAXBElement<>(_GetInformationModelsResponse_QNAME, GetInformationModelsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationModelsPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformationModelsPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "InformationModelsPayloadType")
    public JAXBElement<InformationModelsPayloadType> createInformationModelsPayloadType(InformationModelsPayloadType value) {
        return new JAXBElement<>(_InformationModelsPayloadType_QNAME, InformationModelsPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInformationModelDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInformationModelDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ArrayOfInformationModelDescription")
    public JAXBElement<ArrayOfInformationModelDescription> createArrayOfInformationModelDescription(ArrayOfInformationModelDescription value) {
        return new JAXBElement<>(_ArrayOfInformationModelDescription_QNAME, ArrayOfInformationModelDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationModelDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformationModelDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "InformationModelDescription")
    public JAXBElement<InformationModelDescription> createInformationModelDescription(InformationModelDescription value) {
        return new JAXBElement<>(_InformationModelDescription_QNAME, InformationModelDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetModelVersionsRequest")
    public JAXBElement<GetModelVersionsRequest> createGetModelVersionsRequest(GetModelVersionsRequest value) {
        return new JAXBElement<>(_GetModelVersionsRequest_QNAME, GetModelVersionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetModelVersionRequestType")
    public JAXBElement<GetModelVersionRequestType> createGetModelVersionRequestType(GetModelVersionRequestType value) {
        return new JAXBElement<>(_GetModelVersionRequestType_QNAME, GetModelVersionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetModelVersionsResponse")
    public JAXBElement<GetModelVersionsResponse2> createGetModelVersionsResponse(GetModelVersionsResponse2 value) {
        return new JAXBElement<>(_GetModelVersionsResponse_QNAME, GetModelVersionsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelVersionsPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModelVersionsPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ModelVersionsPayloadType")
    public JAXBElement<ModelVersionsPayloadType> createModelVersionsPayloadType(ModelVersionsPayloadType value) {
        return new JAXBElement<>(_ModelVersionsPayloadType_QNAME, ModelVersionsPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModelVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfModelVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ArrayOfModelVersion")
    public JAXBElement<ArrayOfModelVersion> createArrayOfModelVersion(ArrayOfModelVersion value) {
        return new JAXBElement<>(_ArrayOfModelVersion_QNAME, ArrayOfModelVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModelVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ModelVersion")
    public JAXBElement<ModelVersion> createModelVersion(ModelVersion value) {
        return new JAXBElement<>(_ModelVersion_QNAME, ModelVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetModelVersionsDifferenceRequest")
    public JAXBElement<GetModelVersionsDifferenceRequest> createGetModelVersionsDifferenceRequest(GetModelVersionsDifferenceRequest value) {
        return new JAXBElement<>(_GetModelVersionsDifferenceRequest_QNAME, GetModelVersionsDifferenceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetModelVersionsDifferenceRequestType")
    public JAXBElement<GetModelVersionsDifferenceRequestType> createGetModelVersionsDifferenceRequestType(GetModelVersionsDifferenceRequestType value) {
        return new JAXBElement<>(_GetModelVersionsDifferenceRequestType_QNAME, GetModelVersionsDifferenceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetModelVersionsDifferenceResponse")
    public JAXBElement<GetModelVersionsDifferenceResponse2> createGetModelVersionsDifferenceResponse(GetModelVersionsDifferenceResponse2 value) {
        return new JAXBElement<>(_GetModelVersionsDifferenceResponse_QNAME, GetModelVersionsDifferenceResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelVersionsDifferencePayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModelVersionsDifferencePayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ModelVersionsDifferencePayloadType")
    public JAXBElement<ModelVersionsDifferencePayloadType> createModelVersionsDifferencePayloadType(ModelVersionsDifferencePayloadType value) {
        return new JAXBElement<>(_ModelVersionsDifferencePayloadType_QNAME, ModelVersionsDifferencePayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetActualModelVersionRequest")
    public JAXBElement<GetActualModelVersionRequest> createGetActualModelVersionRequest(GetActualModelVersionRequest value) {
        return new JAXBElement<>(_GetActualModelVersionRequest_QNAME, GetActualModelVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetActualModelVersionRequestType")
    public JAXBElement<GetActualModelVersionRequestType> createGetActualModelVersionRequestType(GetActualModelVersionRequestType value) {
        return new JAXBElement<>(_GetActualModelVersionRequestType_QNAME, GetActualModelVersionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetActualModelVersionResponse")
    public JAXBElement<GetActualModelVersionResponse2> createGetActualModelVersionResponse(GetActualModelVersionResponse2 value) {
        return new JAXBElement<>(_GetActualModelVersionResponse_QNAME, GetActualModelVersionResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualModelVersionPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualModelVersionPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ActualModelVersionPayloadType")
    public JAXBElement<ActualModelVersionPayloadType> createActualModelVersionPayloadType(ActualModelVersionPayloadType value) {
        return new JAXBElement<>(_ActualModelVersionPayloadType_QNAME, ActualModelVersionPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateModelVersionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateModelVersionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CreateModelVersionRequest")
    public JAXBElement<CreateModelVersionRequest> createCreateModelVersionRequest(CreateModelVersionRequest value) {
        return new JAXBElement<>(_CreateModelVersionRequest_QNAME, CreateModelVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateModelVersionRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateModelVersionRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CreateModelVersionRequestType")
    public JAXBElement<CreateModelVersionRequestType> createCreateModelVersionRequestType(CreateModelVersionRequestType value) {
        return new JAXBElement<>(_CreateModelVersionRequestType_QNAME, CreateModelVersionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateModelVersionResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateModelVersionResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CreateModelVersionResponse")
    public JAXBElement<CreateModelVersionResponse2> createCreateModelVersionResponse(CreateModelVersionResponse2 value) {
        return new JAXBElement<>(_CreateModelVersionResponse_QNAME, CreateModelVersionResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateModelVersionPayloadTyple }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateModelVersionPayloadTyple }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CreateModelVersionPayloadTyple")
    public JAXBElement<CreateModelVersionPayloadTyple> createCreateModelVersionPayloadTyple(CreateModelVersionPayloadTyple value) {
        return new JAXBElement<>(_CreateModelVersionPayloadTyple_QNAME, CreateModelVersionPayloadTyple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ChangeModelVersionStateRequest")
    public JAXBElement<ChangeModelVersionStateRequest> createChangeModelVersionStateRequest(ChangeModelVersionStateRequest value) {
        return new JAXBElement<>(_ChangeModelVersionStateRequest_QNAME, ChangeModelVersionStateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ChangeModelVersionStateType")
    public JAXBElement<ChangeModelVersionStateType> createChangeModelVersionStateType(ChangeModelVersionStateType value) {
        return new JAXBElement<>(_ChangeModelVersionStateType_QNAME, ChangeModelVersionStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ChangeModelVersionStateResponse")
    public JAXBElement<ChangeModelVersionStateResponse2> createChangeModelVersionStateResponse(ChangeModelVersionStateResponse2 value) {
        return new JAXBElement<>(_ChangeModelVersionStateResponse_QNAME, ChangeModelVersionStateResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObjectsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetObjectsRequest")
    public JAXBElement<GetObjectsRequest> createGetObjectsRequest(GetObjectsRequest value) {
        return new JAXBElement<>(_GetObjectsRequest_QNAME, GetObjectsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObjectsRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetObjectsRequestType")
    public JAXBElement<GetObjectsRequestType> createGetObjectsRequestType(GetObjectsRequestType value) {
        return new JAXBElement<>(_GetObjectsRequestType_QNAME, GetObjectsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSourceDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataSourceDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "DataSourceDescription")
    public JAXBElement<DataSourceDescription> createDataSourceDescription(DataSourceDescription value) {
        return new JAXBElement<>(_DataSourceDescription_QNAME, DataSourceDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObjectsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetObjectsResponse")
    public JAXBElement<GetObjectsResponse2> createGetObjectsResponse(GetObjectsResponse2 value) {
        return new JAXBElement<>(_GetObjectsResponse_QNAME, GetObjectsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObjectsPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetObjectsPayloadType")
    public JAXBElement<GetObjectsPayloadType> createGetObjectsPayloadType(GetObjectsPayloadType value) {
        return new JAXBElement<>(_GetObjectsPayloadType_QNAME, GetObjectsPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "DeleteModelVersionRequest")
    public JAXBElement<DeleteModelVersionRequest> createDeleteModelVersionRequest(DeleteModelVersionRequest value) {
        return new JAXBElement<>(_DeleteModelVersionRequest_QNAME, DeleteModelVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "DeleteModelVersionRequestType")
    public JAXBElement<DeleteModelVersionRequestType> createDeleteModelVersionRequestType(DeleteModelVersionRequestType value) {
        return new JAXBElement<>(_DeleteModelVersionRequestType_QNAME, DeleteModelVersionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "DeleteModelVersionResponse")
    public JAXBElement<DeleteModelVersionResponse2> createDeleteModelVersionResponse(DeleteModelVersionResponse2 value) {
        return new JAXBElement<>(_DeleteModelVersionResponse_QNAME, DeleteModelVersionResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidationResultRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetValidationResultRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetValidationResultRequest")
    public JAXBElement<GetValidationResultRequest> createGetValidationResultRequest(GetValidationResultRequest value) {
        return new JAXBElement<>(_GetValidationResultRequest_QNAME, GetValidationResultRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidationResultRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetValidationResultRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetValidationResultRequestType")
    public JAXBElement<GetValidationResultRequestType> createGetValidationResultRequestType(GetValidationResultRequestType value) {
        return new JAXBElement<>(_GetValidationResultRequestType_QNAME, GetValidationResultRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleSeverity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuleSeverity }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "RuleSeverity")
    public JAXBElement<RuleSeverity> createRuleSeverity(RuleSeverity value) {
        return new JAXBElement<>(_RuleSeverity_QNAME, RuleSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidationResultResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetValidationResultResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetValidationResultResponse")
    public JAXBElement<GetValidationResultResponse2> createGetValidationResultResponse(GetValidationResultResponse2 value) {
        return new JAXBElement<>(_GetValidationResultResponse_QNAME, GetValidationResultResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidationResultPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetValidationResultPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetValidationResultPayloadType")
    public JAXBElement<GetValidationResultPayloadType> createGetValidationResultPayloadType(GetValidationResultPayloadType value) {
        return new JAXBElement<>(_GetValidationResultPayloadType_QNAME, GetValidationResultPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ArrayOfValidationResult")
    public JAXBElement<ArrayOfValidationResult> createArrayOfValidationResult(ArrayOfValidationResult value) {
        return new JAXBElement<>(_ArrayOfValidationResult_QNAME, ArrayOfValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ValidationResult")
    public JAXBElement<ValidationResult> createValidationResult(ValidationResult value) {
        return new JAXBElement<>(_ValidationResult_QNAME, ValidationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeverityKind }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeverityKind }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "SeverityKind")
    public JAXBElement<SeverityKind> createSeverityKind(SeverityKind value) {
        return new JAXBElement<>(_SeverityKind_QNAME, SeverityKind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeObjectsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeObjectsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ChangeObjectsRequest")
    public JAXBElement<ChangeObjectsRequest> createChangeObjectsRequest(ChangeObjectsRequest value) {
        return new JAXBElement<>(_ChangeObjectsRequest_QNAME, ChangeObjectsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeObjectsRequestPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeObjectsRequestPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ChangeObjectsRequestPayloadType")
    public JAXBElement<ChangeObjectsRequestPayloadType> createChangeObjectsRequestPayloadType(ChangeObjectsRequestPayloadType value) {
        return new JAXBElement<>(_ChangeObjectsRequestPayloadType_QNAME, ChangeObjectsRequestPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeObjectsRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeObjectsRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ChangeObjectsRequestType")
    public JAXBElement<ChangeObjectsRequestType> createChangeObjectsRequestType(ChangeObjectsRequestType value) {
        return new JAXBElement<>(_ChangeObjectsRequestType_QNAME, ChangeObjectsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeObjectsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeObjectsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ChangeObjectsResponse")
    public JAXBElement<ChangeObjectsResponse2> createChangeObjectsResponse(ChangeObjectsResponse2 value) {
        return new JAXBElement<>(_ChangeObjectsResponse_QNAME, ChangeObjectsResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesRequest")
    public JAXBElement<GetProfilesRequest> createGetProfilesRequest(GetProfilesRequest value) {
        return new JAXBElement<>(_GetProfilesRequest_QNAME, GetProfilesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesRequestType")
    public JAXBElement<GetProfilesRequestType> createGetProfilesRequestType(GetProfilesRequestType value) {
        return new JAXBElement<>(_GetProfilesRequestType_QNAME, GetProfilesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfileState }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfileState")
    public JAXBElement<ProfileState> createProfileState(ProfileState value) {
        return new JAXBElement<>(_ProfileState_QNAME, ProfileState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesResponse")
    public JAXBElement<GetProfilesResponse2> createGetProfilesResponse(GetProfilesResponse2 value) {
        return new JAXBElement<>(_GetProfilesResponse_QNAME, GetProfilesResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesPayloadType")
    public JAXBElement<GetProfilesPayloadType> createGetProfilesPayloadType(GetProfilesPayloadType value) {
        return new JAXBElement<>(_GetProfilesPayloadType_QNAME, GetProfilesPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ArrayOfProfile")
    public JAXBElement<ArrayOfProfile> createArrayOfProfile(ArrayOfProfile value) {
        return new JAXBElement<>(_ArrayOfProfile_QNAME, ArrayOfProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Profile")
    public JAXBElement<Profile> createProfile(Profile value) {
        return new JAXBElement<>(_Profile_QNAME, Profile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesSetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesSetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesSetRequest")
    public JAXBElement<GetProfilesSetRequest> createGetProfilesSetRequest(GetProfilesSetRequest value) {
        return new JAXBElement<>(_GetProfilesSetRequest_QNAME, GetProfilesSetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesSetRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesSetRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesSetRequestType")
    public JAXBElement<GetProfilesSetRequestType> createGetProfilesSetRequestType(GetProfilesSetRequestType value) {
        return new JAXBElement<>(_GetProfilesSetRequestType_QNAME, GetProfilesSetRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesSetResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesSetResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesSetResponse")
    public JAXBElement<GetProfilesSetResponse2> createGetProfilesSetResponse(GetProfilesSetResponse2 value) {
        return new JAXBElement<>(_GetProfilesSetResponse_QNAME, GetProfilesSetResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesSetPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesSetPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetProfilesSetPayloadType")
    public JAXBElement<GetProfilesSetPayloadType> createGetProfilesSetPayloadType(GetProfilesSetPayloadType value) {
        return new JAXBElement<>(_GetProfilesSetPayloadType_QNAME, GetProfilesSetPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfilesSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProfilesSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ArrayOfProfilesSet")
    public JAXBElement<ArrayOfProfilesSet> createArrayOfProfilesSet(ArrayOfProfilesSet value) {
        return new JAXBElement<>(_ArrayOfProfilesSet_QNAME, ArrayOfProfilesSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfilesSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfilesSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfilesSet")
    public JAXBElement<ProfilesSet> createProfilesSet(ProfilesSet value) {
        return new JAXBElement<>(_ProfilesSet_QNAME, ProfilesSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetUnaccountedStocksRequest")
    public JAXBElement<GetUnaccountedStocksRequest> createGetUnaccountedStocksRequest(GetUnaccountedStocksRequest value) {
        return new JAXBElement<>(_GetUnaccountedStocksRequest_QNAME, GetUnaccountedStocksRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetUnaccountedStocksRequestType")
    public JAXBElement<GetUnaccountedStocksRequestType> createGetUnaccountedStocksRequestType(GetUnaccountedStocksRequestType value) {
        return new JAXBElement<>(_GetUnaccountedStocksRequestType_QNAME, GetUnaccountedStocksRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetUnaccountedStocksResponse")
    public JAXBElement<GetUnaccountedStocksResponse2> createGetUnaccountedStocksResponse(GetUnaccountedStocksResponse2 value) {
        return new JAXBElement<>(_GetUnaccountedStocksResponse_QNAME, GetUnaccountedStocksResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksPayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksPayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "GetUnaccountedStocksPayloadType")
    public JAXBElement<GetUnaccountedStocksPayloadType> createGetUnaccountedStocksPayloadType(GetUnaccountedStocksPayloadType value) {
        return new JAXBElement<>(_GetUnaccountedStocksPayloadType_QNAME, GetUnaccountedStocksPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetInformationModelsRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetInformationModelsRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetInformationModelsRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetInformationModelsRequestTypetOGyFLjl> createRequestMessageOfGetInformationModelsRequestTypetOGyFLjl(RequestMessageOfGetInformationModelsRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetInformationModelsRequestTypetOGyFLjl_QNAME, RequestMessageOfGetInformationModelsRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Message }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "HeaderType")
    public JAXBElement<HeaderType> createHeaderType(HeaderType value) {
        return new JAXBElement<>(_HeaderType_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderTypeVerb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderTypeVerb }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "HeaderTypeVerb")
    public JAXBElement<HeaderTypeVerb> createHeaderTypeVerb(HeaderTypeVerb value) {
        return new JAXBElement<>(_HeaderTypeVerb_QNAME, HeaderTypeVerb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfInformationModelsPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfInformationModelsPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Payload }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Payload")
    public JAXBElement<Payload> createPayload(Payload value) {
        return new JAXBElement<>(_Payload_QNAME, Payload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Reply }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Reply")
    public JAXBElement<Reply> createReply(Reply value) {
        return new JAXBElement<>(_Reply_QNAME, Reply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ArrayOfErrorType")
    public JAXBElement<ArrayOfErrorType> createArrayOfErrorType(ArrayOfErrorType value) {
        return new JAXBElement<>(_ArrayOfErrorType_QNAME, ArrayOfErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ErrorType")
    public JAXBElement<ErrorType> createErrorType(ErrorType value) {
        return new JAXBElement<>(_ErrorType_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyResult")
    public JAXBElement<ReplyResult> createReplyResult(ReplyResult value) {
        return new JAXBElement<>(_ReplyResult_QNAME, ReplyResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "FaultMessage")
    public JAXBElement<FaultMessage> createFaultMessage(FaultMessage value) {
        return new JAXBElement<>(_FaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetModelVersionRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetModelVersionRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetModelVersionRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetModelVersionRequestTypetOGyFLjl> createRequestMessageOfGetModelVersionRequestTypetOGyFLjl(RequestMessageOfGetModelVersionRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetModelVersionRequestTypetOGyFLjl_QNAME, RequestMessageOfGetModelVersionRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfModelVersionsPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfModelVersionsPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl> createRequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl(RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl_QNAME, RequestMessageOfGetModelVersionsDifferenceRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfModelVersionsDifferencePayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl> createRequestMessageOfGetActualModelVersionRequestTypetOGyFLjl(RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl_QNAME, RequestMessageOfGetActualModelVersionRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfActualModelVersionPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfCreateModelVersionRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfCreateModelVersionRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfCreateModelVersionRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfCreateModelVersionRequestTypetOGyFLjl> createRequestMessageOfCreateModelVersionRequestTypetOGyFLjl(RequestMessageOfCreateModelVersionRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfCreateModelVersionRequestTypetOGyFLjl_QNAME, RequestMessageOfCreateModelVersionRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1> createReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1(ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1_QNAME, ReplyPayloadMessageOfCreateModelVersionPayloadTypleReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfChangeModelVersionStateTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfChangeModelVersionStateTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfChangeModelVersionStateTypetOGyFLjl")
    public JAXBElement<RequestMessageOfChangeModelVersionStateTypetOGyFLjl> createRequestMessageOfChangeModelVersionStateTypetOGyFLjl(RequestMessageOfChangeModelVersionStateTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfChangeModelVersionStateTypetOGyFLjl_QNAME, RequestMessageOfChangeModelVersionStateTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyMessageOfReplyjohN50Cd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyMessageOfReplyjohN50Cd }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyMessageOfReplyjohN50cd")
    public JAXBElement<ReplyMessageOfReplyjohN50Cd> createReplyMessageOfReplyjohN50Cd(ReplyMessageOfReplyjohN50Cd value) {
        return new JAXBElement<>(_ReplyMessageOfReplyjohN50Cd_QNAME, ReplyMessageOfReplyjohN50Cd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetObjectsRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetObjectsRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetObjectsRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetObjectsRequestTypetOGyFLjl> createRequestMessageOfGetObjectsRequestTypetOGyFLjl(RequestMessageOfGetObjectsRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetObjectsRequestTypetOGyFLjl_QNAME, RequestMessageOfGetObjectsRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfGetObjectsPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfGetObjectsPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl> createRequestMessageOfDeleteModelVersionRequestTypetOGyFLjl(RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl_QNAME, RequestMessageOfDeleteModelVersionRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetValidationResultRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetValidationResultRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetValidationResultRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetValidationResultRequestTypetOGyFLjl> createRequestMessageOfGetValidationResultRequestTypetOGyFLjl(RequestMessageOfGetValidationResultRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetValidationResultRequestTypetOGyFLjl_QNAME, RequestMessageOfGetValidationResultRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfGetValidationResultPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo")
    public JAXBElement<RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo> createRequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo(RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo value) {
        return new JAXBElement<>(_RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo_QNAME, RequestPayloadMessageOfChangeObjectsRequestTypeChangeObjectsRequestPayloadTypeaTEA7VSo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetProfilesRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetProfilesRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetProfilesRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetProfilesRequestTypetOGyFLjl> createRequestMessageOfGetProfilesRequestTypetOGyFLjl(RequestMessageOfGetProfilesRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetProfilesRequestTypetOGyFLjl_QNAME, RequestMessageOfGetProfilesRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfGetProfilesPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfGetProfilesPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetProfilesSetRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetProfilesSetRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetProfilesSetRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetProfilesSetRequestTypetOGyFLjl> createRequestMessageOfGetProfilesSetRequestTypetOGyFLjl(RequestMessageOfGetProfilesSetRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetProfilesSetRequestTypetOGyFLjl_QNAME, RequestMessageOfGetProfilesSetRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfGetProfilesSetPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl")
    public JAXBElement<RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl> createRequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl(RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl value) {
        return new JAXBElement<>(_RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl_QNAME, RequestMessageOfGetUnaccountedStocksRequestTypetOGyFLjl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4wRAxEL1")
    public JAXBElement<ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1> createReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1(ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 value) {
        return new JAXBElement<>(_ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1_QNAME, ReplyPayloadMessageOfGetUnaccountedStocksPayloadTypeReply4WRAxEL1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfguid")
    public JAXBElement<ArrayOfguid> createArrayOfguid(ArrayOfguid value) {
        return new JAXBElement<>(_ArrayOfguid_QNAME, ArrayOfguid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormatType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormatType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/common/", name = "FormatType")
    public JAXBElement<FormatType> createFormatType(FormatType value) {
        return new JAXBElement<>(_FormatType_QNAME, FormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInformationModelsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInformationModelsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetInformationModelsResult", scope = GetInformationModelsResponse.class)
    public JAXBElement<GetInformationModelsResponse2> createGetInformationModelsResponseGetInformationModelsResult(GetInformationModelsResponse2 value) {
        return new JAXBElement<>(_GetInformationModelsResponseGetInformationModelsResult_QNAME, GetInformationModelsResponse2 .class, GetInformationModelsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetModelVersionsResult", scope = GetModelVersionsResponse.class)
    public JAXBElement<GetModelVersionsResponse2> createGetModelVersionsResponseGetModelVersionsResult(GetModelVersionsResponse2 value) {
        return new JAXBElement<>(_GetModelVersionsResponseGetModelVersionsResult_QNAME, GetModelVersionsResponse2 .class, GetModelVersionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetModelVersionsDifferenceResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetModelVersionsDifferenceResult", scope = GetModelVersionsDifferenceResponse.class)
    public JAXBElement<GetModelVersionsDifferenceResponse2> createGetModelVersionsDifferenceResponseGetModelVersionsDifferenceResult(GetModelVersionsDifferenceResponse2 value) {
        return new JAXBElement<>(_GetModelVersionsDifferenceResponseGetModelVersionsDifferenceResult_QNAME, GetModelVersionsDifferenceResponse2 .class, GetModelVersionsDifferenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActualModelVersionResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetActualModelVersionResult", scope = GetActualModelVersionResponse.class)
    public JAXBElement<GetActualModelVersionResponse2> createGetActualModelVersionResponseGetActualModelVersionResult(GetActualModelVersionResponse2 value) {
        return new JAXBElement<>(_GetActualModelVersionResponseGetActualModelVersionResult_QNAME, GetActualModelVersionResponse2 .class, GetActualModelVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateModelVersionResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateModelVersionResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "CreateModelVersionResult", scope = CreateModelVersionResponse.class)
    public JAXBElement<CreateModelVersionResponse2> createCreateModelVersionResponseCreateModelVersionResult(CreateModelVersionResponse2 value) {
        return new JAXBElement<>(_CreateModelVersionResponseCreateModelVersionResult_QNAME, CreateModelVersionResponse2 .class, CreateModelVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeModelVersionStateResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ChangeModelVersionStateResult", scope = ChangeModelVersionStateResponse.class)
    public JAXBElement<ChangeModelVersionStateResponse2> createChangeModelVersionStateResponseChangeModelVersionStateResult(ChangeModelVersionStateResponse2 value) {
        return new JAXBElement<>(_ChangeModelVersionStateResponseChangeModelVersionStateResult_QNAME, ChangeModelVersionStateResponse2 .class, ChangeModelVersionStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjectsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObjectsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetObjectsResult", scope = GetObjectsResponse.class)
    public JAXBElement<GetObjectsResponse2> createGetObjectsResponseGetObjectsResult(GetObjectsResponse2 value) {
        return new JAXBElement<>(_GetObjectsResponseGetObjectsResult_QNAME, GetObjectsResponse2 .class, GetObjectsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteModelVersionResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "DeleteModelVersionResult", scope = DeleteModelVersionResponse.class)
    public JAXBElement<DeleteModelVersionResponse2> createDeleteModelVersionResponseDeleteModelVersionResult(DeleteModelVersionResponse2 value) {
        return new JAXBElement<>(_DeleteModelVersionResponseDeleteModelVersionResult_QNAME, DeleteModelVersionResponse2 .class, DeleteModelVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidationResultResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetValidationResultResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetValidationResultResult", scope = GetValidationResultResponse.class)
    public JAXBElement<GetValidationResultResponse2> createGetValidationResultResponseGetValidationResultResult(GetValidationResultResponse2 value) {
        return new JAXBElement<>(_GetValidationResultResponseGetValidationResultResult_QNAME, GetValidationResultResponse2 .class, GetValidationResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeObjectsResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeObjectsResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "ChangeObjectsResult", scope = ChangeObjectsResponse.class)
    public JAXBElement<ChangeObjectsResponse2> createChangeObjectsResponseChangeObjectsResult(ChangeObjectsResponse2 value) {
        return new JAXBElement<>(_ChangeObjectsResponseChangeObjectsResult_QNAME, ChangeObjectsResponse2 .class, ChangeObjectsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetProfilesResult", scope = GetProfilesResponse.class)
    public JAXBElement<GetProfilesResponse2> createGetProfilesResponseGetProfilesResult(GetProfilesResponse2 value) {
        return new JAXBElement<>(_GetProfilesResponseGetProfilesResult_QNAME, GetProfilesResponse2 .class, GetProfilesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfilesSetResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProfilesSetResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetProfilesSetResult", scope = GetProfilesSetResponse.class)
    public JAXBElement<GetProfilesSetResponse2> createGetProfilesSetResponseGetProfilesSetResult(GetProfilesSetResponse2 value) {
        return new JAXBElement<>(_GetProfilesSetResponseGetProfilesSetResult_QNAME, GetProfilesSetResponse2 .class, GetProfilesSetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksResponse2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUnaccountedStocksResponse2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM", name = "GetUnaccountedStocksResult", scope = GetUnaccountedStocksResponse.class)
    public JAXBElement<GetUnaccountedStocksResponse2> createGetUnaccountedStocksResponseGetUnaccountedStocksResult(GetUnaccountedStocksResponse2 value) {
        return new JAXBElement<>(_GetUnaccountedStocksResponseGetUnaccountedStocksResult_QNAME, GetUnaccountedStocksResponse2 .class, GetUnaccountedStocksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Code", scope = ErrorType.class)
    public JAXBElement<String> createErrorTypeCode(String value) {
        return new JAXBElement<>(_ErrorTypeCode_QNAME, String.class, ErrorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Reason", scope = ErrorType.class)
    public JAXBElement<String> createErrorTypeReason(String value) {
        return new JAXBElement<>(_ErrorTypeReason_QNAME, String.class, ErrorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/schema/message", name = "Error", scope = Reply.class)
    public JAXBElement<ArrayOfErrorType> createReplyError(ArrayOfErrorType value) {
        return new JAXBElement<>(_ReplyError_QNAME, ArrayOfErrorType.class, Reply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Mrids", scope = GetUnaccountedStocksPayloadType.class)
    public JAXBElement<ArrayOfstring> createGetUnaccountedStocksPayloadTypeMrids(ArrayOfstring value) {
        return new JAXBElement<>(_GetUnaccountedStocksPayloadTypeMrids_QNAME, ArrayOfstring.class, GetUnaccountedStocksPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CanonicalModelVersion", scope = ProfilesSet.class)
    public JAXBElement<String> createProfilesSetCanonicalModelVersion(String value) {
        return new JAXBElement<>(_ProfilesSetCanonicalModelVersion_QNAME, String.class, ProfilesSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Comment", scope = ProfilesSet.class)
    public JAXBElement<String> createProfilesSetComment(String value) {
        return new JAXBElement<>(_ProfilesSetComment_QNAME, String.class, ProfilesSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Name", scope = ProfilesSet.class)
    public JAXBElement<String> createProfilesSetName(String value) {
        return new JAXBElement<>(_ProfilesSetName_QNAME, String.class, ProfilesSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfilesSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProfilesSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfilesSets", scope = GetProfilesSetPayloadType.class)
    public JAXBElement<ArrayOfProfilesSet> createGetProfilesSetPayloadTypeProfilesSets(ArrayOfProfilesSet value) {
        return new JAXBElement<>(_GetProfilesSetPayloadTypeProfilesSets_QNAME, ArrayOfProfilesSet.class, GetProfilesSetPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CanonicalModelVersion", scope = GetProfilesSetRequestType.class)
    public JAXBElement<String> createGetProfilesSetRequestTypeCanonicalModelVersion(String value) {
        return new JAXBElement<>(_ProfilesSetCanonicalModelVersion_QNAME, String.class, GetProfilesSetRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Enabled", scope = GetProfilesSetRequestType.class)
    public JAXBElement<Boolean> createGetProfilesSetRequestTypeEnabled(Boolean value) {
        return new JAXBElement<>(_GetProfilesSetRequestTypeEnabled_QNAME, Boolean.class, GetProfilesSetRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Author", scope = Profile.class)
    public JAXBElement<String> createProfileAuthor(String value) {
        return new JAXBElement<>(_ProfileAuthor_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CanonicalModelVersion", scope = Profile.class)
    public JAXBElement<String> createProfileCanonicalModelVersion(String value) {
        return new JAXBElement<>(_ProfilesSetCanonicalModelVersion_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Comment", scope = Profile.class)
    public JAXBElement<String> createProfileComment(String value) {
        return new JAXBElement<>(_ProfilesSetComment_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Content", scope = Profile.class)
    public JAXBElement<String> createProfileContent(String value) {
        return new JAXBElement<>(_ProfileContent_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Name", scope = Profile.class)
    public JAXBElement<String> createProfileName(String value) {
        return new JAXBElement<>(_ProfilesSetName_QNAME, String.class, Profile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Profiles", scope = GetProfilesPayloadType.class)
    public JAXBElement<ArrayOfProfile> createGetProfilesPayloadTypeProfiles(ArrayOfProfile value) {
        return new JAXBElement<>(_GetProfilesPayloadTypeProfiles_QNAME, ArrayOfProfile.class, GetProfilesPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Author", scope = GetProfilesRequestType.class)
    public JAXBElement<String> createGetProfilesRequestTypeAuthor(String value) {
        return new JAXBElement<>(_ProfileAuthor_QNAME, String.class, GetProfilesRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "EndTime", scope = GetProfilesRequestType.class)
    public JAXBElement<XMLGregorianCalendar> createGetProfilesRequestTypeEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_GetProfilesRequestTypeEndTime_QNAME, XMLGregorianCalendar.class, GetProfilesRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfileState }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfileState", scope = GetProfilesRequestType.class)
    public JAXBElement<ProfileState> createGetProfilesRequestTypeProfileState(ProfileState value) {
        return new JAXBElement<>(_ProfileState_QNAME, ProfileState.class, GetProfilesRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfileUids", scope = GetProfilesRequestType.class)
    public JAXBElement<ArrayOfguid> createGetProfilesRequestTypeProfileUids(ArrayOfguid value) {
        return new JAXBElement<>(_GetProfilesRequestTypeProfileUids_QNAME, ArrayOfguid.class, GetProfilesRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfilesSetUid", scope = GetProfilesRequestType.class)
    public JAXBElement<String> createGetProfilesRequestTypeProfilesSetUid(String value) {
        return new JAXBElement<>(_GetProfilesRequestTypeProfilesSetUid_QNAME, String.class, GetProfilesRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "StartTime", scope = GetProfilesRequestType.class)
    public JAXBElement<XMLGregorianCalendar> createGetProfilesRequestTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_GetProfilesRequestTypeStartTime_QNAME, XMLGregorianCalendar.class, GetProfilesRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Comment", scope = ChangeObjectsRequestType.class)
    public JAXBElement<String> createChangeObjectsRequestTypeComment(String value) {
        return new JAXBElement<>(_ProfilesSetComment_QNAME, String.class, ChangeObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Message", scope = ValidationResult.class)
    public JAXBElement<String> createValidationResultMessage(String value) {
        return new JAXBElement<>(_ValidationResultMessage_QNAME, String.class, ValidationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfValidationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Results", scope = GetValidationResultPayloadType.class)
    public JAXBElement<ArrayOfValidationResult> createGetValidationResultPayloadTypeResults(ArrayOfValidationResult value) {
        return new JAXBElement<>(_GetValidationResultPayloadTypeResults_QNAME, ArrayOfValidationResult.class, GetValidationResultPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "MaxResultCount", scope = GetValidationResultRequestType.class)
    public JAXBElement<Integer> createGetValidationResultRequestTypeMaxResultCount(Integer value) {
        return new JAXBElement<>(_GetValidationResultRequestTypeMaxResultCount_QNAME, Integer.class, GetValidationResultRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleSeverity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuleSeverity }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Severity", scope = GetValidationResultRequestType.class)
    public JAXBElement<RuleSeverity> createGetValidationResultRequestTypeSeverity(RuleSeverity value) {
        return new JAXBElement<>(_GetValidationResultRequestTypeSeverity_QNAME, RuleSeverity.class, GetValidationResultRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "IsRunCustomRules", scope = GetValidationResultRequestType.class)
    public JAXBElement<Boolean> createGetValidationResultRequestTypeIsRunCustomRules(Boolean value) {
        return new JAXBElement<>(_GetValidationResultRequestTypeIsRunCustomRules_QNAME, Boolean.class, GetValidationResultRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Content", scope = GetObjectsPayloadType.class)
    public JAXBElement<String> createGetObjectsPayloadTypeContent(String value) {
        return new JAXBElement<>(_ProfileContent_QNAME, String.class, GetObjectsPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ContextId", scope = DataSourceDescription.class)
    public JAXBElement<String> createDataSourceDescriptionContextId(String value) {
        return new JAXBElement<>(_DataSourceDescriptionContextId_QNAME, String.class, DataSourceDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "InfModelUid", scope = DataSourceDescription.class)
    public JAXBElement<String> createDataSourceDescriptionInfModelUid(String value) {
        return new JAXBElement<>(_DataSourceDescriptionInfModelUid_QNAME, String.class, DataSourceDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ModelVersionId", scope = DataSourceDescription.class)
    public JAXBElement<Integer> createDataSourceDescriptionModelVersionId(Integer value) {
        return new JAXBElement<>(_DataSourceDescriptionModelVersionId_QNAME, Integer.class, DataSourceDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ClassNames", scope = GetObjectsRequestType.class)
    public JAXBElement<ArrayOfstring> createGetObjectsRequestTypeClassNames(ArrayOfstring value) {
        return new JAXBElement<>(_GetObjectsRequestTypeClassNames_QNAME, ArrayOfstring.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Filter", scope = GetObjectsRequestType.class)
    public JAXBElement<String> createGetObjectsRequestTypeFilter(String value) {
        return new JAXBElement<>(_GetObjectsRequestTypeFilter_QNAME, String.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ForExternalUse", scope = GetObjectsRequestType.class)
    public JAXBElement<Boolean> createGetObjectsRequestTypeForExternalUse(Boolean value) {
        return new JAXBElement<>(_GetObjectsRequestTypeForExternalUse_QNAME, Boolean.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Mrids", scope = GetObjectsRequestType.class)
    public JAXBElement<ArrayOfstring> createGetObjectsRequestTypeMrids(ArrayOfstring value) {
        return new JAXBElement<>(_GetUnaccountedStocksPayloadTypeMrids_QNAME, ArrayOfstring.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Profile", scope = GetObjectsRequestType.class)
    public JAXBElement<String> createGetObjectsRequestTypeProfile(String value) {
        return new JAXBElement<>(_Profile_QNAME, String.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfileStricktly", scope = GetObjectsRequestType.class)
    public JAXBElement<Boolean> createGetObjectsRequestTypeProfileStricktly(Boolean value) {
        return new JAXBElement<>(_GetObjectsRequestTypeProfileStricktly_QNAME, Boolean.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfileUids", scope = GetObjectsRequestType.class)
    public JAXBElement<ArrayOfguid> createGetObjectsRequestTypeProfileUids(ArrayOfguid value) {
        return new JAXBElement<>(_GetProfilesRequestTypeProfileUids_QNAME, ArrayOfguid.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Uids", scope = GetObjectsRequestType.class)
    public JAXBElement<ArrayOfguid> createGetObjectsRequestTypeUids(ArrayOfguid value) {
        return new JAXBElement<>(_GetObjectsRequestTypeUids_QNAME, ArrayOfguid.class, GetObjectsRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Description", scope = CreateModelVersionRequestType.class)
    public JAXBElement<String> createCreateModelVersionRequestTypeDescription(String value) {
        return new JAXBElement<>(_CreateModelVersionRequestTypeDescription_QNAME, String.class, CreateModelVersionRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModelVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ModelVersions", scope = ActualModelVersionPayloadType.class)
    public JAXBElement<ModelVersion> createActualModelVersionPayloadTypeModelVersions(ModelVersion value) {
        return new JAXBElement<>(_ActualModelVersionPayloadTypeModelVersions_QNAME, ModelVersion.class, ActualModelVersionPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Date", scope = GetActualModelVersionRequestType.class)
    public JAXBElement<XMLGregorianCalendar> createGetActualModelVersionRequestTypeDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_GetActualModelVersionRequestTypeDate_QNAME, XMLGregorianCalendar.class, GetActualModelVersionRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Differences", scope = ModelVersionsDifferencePayloadType.class)
    public JAXBElement<String> createModelVersionsDifferencePayloadTypeDifferences(String value) {
        return new JAXBElement<>(_ModelVersionsDifferencePayloadTypeDifferences_QNAME, String.class, ModelVersionsDifferencePayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Profile", scope = GetModelVersionsDifferenceRequestType.class)
    public JAXBElement<String> createGetModelVersionsDifferenceRequestTypeProfile(String value) {
        return new JAXBElement<>(_Profile_QNAME, String.class, GetModelVersionsDifferenceRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfileUids", scope = GetModelVersionsDifferenceRequestType.class)
    public JAXBElement<ArrayOfguid> createGetModelVersionsDifferenceRequestTypeProfileUids(ArrayOfguid value) {
        return new JAXBElement<>(_GetProfilesRequestTypeProfileUids_QNAME, ArrayOfguid.class, GetModelVersionsDifferenceRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Uids", scope = GetModelVersionsDifferenceRequestType.class)
    public JAXBElement<ArrayOfguid> createGetModelVersionsDifferenceRequestTypeUids(ArrayOfguid value) {
        return new JAXBElement<>(_GetObjectsRequestTypeUids_QNAME, ArrayOfguid.class, GetModelVersionsDifferenceRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Name", scope = ModelVersion.class)
    public JAXBElement<String> createModelVersionName(String value) {
        return new JAXBElement<>(_ProfilesSetName_QNAME, String.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Description", scope = ModelVersion.class)
    public JAXBElement<String> createModelVersionDescription(String value) {
        return new JAXBElement<>(_CreateModelVersionRequestTypeDescription_QNAME, String.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "CanonicalModelVersion", scope = ModelVersion.class)
    public JAXBElement<String> createModelVersionCanonicalModelVersion(String value) {
        return new JAXBElement<>(_ProfilesSetCanonicalModelVersion_QNAME, String.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "StartActualDate", scope = ModelVersion.class)
    public JAXBElement<XMLGregorianCalendar> createModelVersionStartActualDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_ModelVersionStartActualDate_QNAME, XMLGregorianCalendar.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "EndActualDate", scope = ModelVersion.class)
    public JAXBElement<XMLGregorianCalendar> createModelVersionEndActualDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_ModelVersionEndActualDate_QNAME, XMLGregorianCalendar.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ScheduleId", scope = ModelVersion.class)
    public JAXBElement<Integer> createModelVersionScheduleId(Integer value) {
        return new JAXBElement<>(_ModelVersionScheduleId_QNAME, Integer.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ScheduleStartDate", scope = ModelVersion.class)
    public JAXBElement<XMLGregorianCalendar> createModelVersionScheduleStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_ModelVersionScheduleStartDate_QNAME, XMLGregorianCalendar.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ScheduleEndDate", scope = ModelVersion.class)
    public JAXBElement<XMLGregorianCalendar> createModelVersionScheduleEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_ModelVersionScheduleEndDate_QNAME, XMLGregorianCalendar.class, ModelVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModelVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfModelVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ModelVersions", scope = ModelVersionsPayloadType.class)
    public JAXBElement<ArrayOfModelVersion> createModelVersionsPayloadTypeModelVersions(ArrayOfModelVersion value) {
        return new JAXBElement<>(_ActualModelVersionPayloadTypeModelVersions_QNAME, ArrayOfModelVersion.class, ModelVersionsPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "EndTime", scope = GetModelVersionRequestType.class)
    public JAXBElement<XMLGregorianCalendar> createGetModelVersionRequestTypeEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_GetProfilesRequestTypeEndTime_QNAME, XMLGregorianCalendar.class, GetModelVersionRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Ids", scope = GetModelVersionRequestType.class)
    public JAXBElement<ArrayOfint> createGetModelVersionRequestTypeIds(ArrayOfint value) {
        return new JAXBElement<>(_GetModelVersionRequestTypeIds_QNAME, ArrayOfint.class, GetModelVersionRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "StartTime", scope = GetModelVersionRequestType.class)
    public JAXBElement<XMLGregorianCalendar> createGetModelVersionRequestTypeStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_GetProfilesRequestTypeStartTime_QNAME, XMLGregorianCalendar.class, GetModelVersionRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Name", scope = InformationModelDescription.class)
    public JAXBElement<String> createInformationModelDescriptionName(String value) {
        return new JAXBElement<>(_ProfilesSetName_QNAME, String.class, InformationModelDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "ProfileVersion", scope = InformationModelDescription.class)
    public JAXBElement<String> createInformationModelDescriptionProfileVersion(String value) {
        return new JAXBElement<>(_InformationModelDescriptionProfileVersion_QNAME, String.class, InformationModelDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInformationModelDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInformationModelDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "InfModels", scope = InformationModelsPayloadType.class)
    public JAXBElement<ArrayOfInformationModelDescription> createInformationModelsPayloadTypeInfModels(ArrayOfInformationModelDescription value) {
        return new JAXBElement<>(_InformationModelsPayloadTypeInfModels_QNAME, ArrayOfInformationModelDescription.class, InformationModelsPayloadType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfModelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfModelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://monitel.com/CK11/Services/SDM/Messages", name = "Type", scope = GetInformationModelsRequestType.class)
    public JAXBElement<InfModelType> createGetInformationModelsRequestTypeType(InfModelType value) {
        return new JAXBElement<>(_GetInformationModelsRequestTypeType_QNAME, InfModelType.class, GetInformationModelsRequestType.class, value);
    }

}
