package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.DateTimePeriod;

import javax.validation.Valid;
  
/**
 * AuthorizationWithIds
 */
public class AuthorizationWithIds   {
  private String transactionAuthorizationReference = null;

  private String transactionAuthorizationGuidance = null;

  private String customerReference = null;

  private String productReference = null;

  private String productInstanceReference = null;

  private String proposedTransactionType = null;

  private String proposedTransactionValue = null;

  private String customerContactRecordReference = null;

  private Object customerContactRecord = null;

  private String customerContactRecordCustomerReference = null;

  private String customerContactRecordMenuSelection = null;

  private String customerContactRecordContactDevice = null;

  private String customerContactRecordAuthenticationLevel = null;

  private Object customerContactRecordContactDialogueRecord = null;

  private String contactDialogueRecordCustomerReference = null;

  private String contactDialogueRecordEmployeeReference = null;

  private String contactDialogueRecordServicingPositionReference = null;

  private String contactDialogueRecordSessionMechanism = null;

  private DateTimePeriod contactDialogueRecordSessionStartEndTime = null;

  private String contactDialogueRecordContactDialogueType = null;

  private String contactDialogueRecordContactDialogueScript = null;

  private String contactDialogueRecordContactDialogueLogReference = null;

  private String contactDialogueRecordContactDialogueLog = null;

  private Object customerContactActivityRecord = null;

  private DateTimePeriod customerContactFromTo = null;

  private String customerContactResult = null;

  private String channelActivityHistoryReportReference = null;

  private String channelActivityHistoryReportFromTo = null;

  private Object channelActivityHistoryReport = null;

  private Object transactionAuthorizationResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return transactionAuthorizationReference
  **/

  public String getTransactionAuthorizationReference() {
    return transactionAuthorizationReference;
  }

  public void setTransactionAuthorizationReference(String transactionAuthorizationReference) {
    this.transactionAuthorizationReference = transactionAuthorizationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: in case of failure, explains reason and provides guidance if additional information can be considered 
   * @return transactionAuthorizationGuidance
  **/

  public String getTransactionAuthorizationGuidance() {
    return transactionAuthorizationGuidance;
  }

  public void setTransactionAuthorizationGuidance(String transactionAuthorizationGuidance) {
    this.transactionAuthorizationGuidance = transactionAuthorizationGuidance;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productReference
  **/

  public String getProductReference() {
    return productReference;
  }

  public void setProductReference(String productReference) {
    this.productReference = productReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the product to be accessed by the proposed transaction 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: the type of action proposed - e.g. balance report, payment, change of address 
   * @return proposedTransactionType
  **/

  public String getProposedTransactionType() {
    return proposedTransactionType;
  }

  public void setProposedTransactionType(String proposedTransactionType) {
    this.proposedTransactionType = proposedTransactionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value general-info: key values such as amount for a payment, dates for reporting, counterparties 
   * @return proposedTransactionValue
  **/

  public String getProposedTransactionValue() {
    return proposedTransactionValue;
  }

  public void setProposedTransactionValue(String proposedTransactionValue) {
    this.proposedTransactionValue = proposedTransactionValue;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: this record combines the listed elements 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: as provided by customer 
   * @return customerContactRecordCustomerReference
  **/

  public String getCustomerContactRecordCustomerReference() {
    return customerContactRecordCustomerReference;
  }

  public void setCustomerContactRecordCustomerReference(String customerContactRecordCustomerReference) {
    this.customerContactRecordCustomerReference = customerContactRecordCustomerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: as indicated by customer when initiating contact 
   * @return customerContactRecordMenuSelection
  **/

  public String getCustomerContactRecordMenuSelection() {
    return customerContactRecordMenuSelection;
  }

  public void setCustomerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
    this.customerContactRecordMenuSelection = customerContactRecordMenuSelection;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: as detected by voice/data network operations 
   * @return customerContactRecordContactDevice
  **/

  public String getCustomerContactRecordContactDevice() {
    return customerContactRecordContactDevice;
  }

  public void setCustomerContactRecordContactDevice(String customerContactRecordContactDevice) {
    this.customerContactRecordContactDevice = customerContactRecordContactDevice;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: as obtained by SD-Contact Handler 
   * @return customerContactRecordAuthenticationLevel
  **/

  public String getCustomerContactRecordAuthenticationLevel() {
    return customerContactRecordAuthenticationLevel;
  }

  public void setCustomerContactRecordAuthenticationLevel(String customerContactRecordAuthenticationLevel) {
    this.customerContactRecordAuthenticationLevel = customerContactRecordAuthenticationLevel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: any session records created during the contact 
   * @return customerContactRecordContactDialogueRecord
  **/

  public Object getCustomerContactRecordContactDialogueRecord() {
    return customerContactRecordContactDialogueRecord;
  }

  public void setCustomerContactRecordContactDialogueRecord(Object customerContactRecordContactDialogueRecord) {
    this.customerContactRecordContactDialogueRecord = customerContactRecordContactDialogueRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return contactDialogueRecordCustomerReference
  **/

  public String getContactDialogueRecordCustomerReference() {
    return contactDialogueRecordCustomerReference;
  }

  public void setContactDialogueRecordCustomerReference(String contactDialogueRecordCustomerReference) {
    this.contactDialogueRecordCustomerReference = contactDialogueRecordCustomerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the servicing resource for assisted customer exchanges 
   * @return contactDialogueRecordEmployeeReference
  **/

  public String getContactDialogueRecordEmployeeReference() {
    return contactDialogueRecordEmployeeReference;
  }

  public void setContactDialogueRecordEmployeeReference(String contactDialogueRecordEmployeeReference) {
    this.contactDialogueRecordEmployeeReference = contactDialogueRecordEmployeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the servicing location/desk for assisted customer exchanges 
   * @return contactDialogueRecordServicingPositionReference
  **/

  public String getContactDialogueRecordServicingPositionReference() {
    return contactDialogueRecordServicingPositionReference;
  }

  public void setContactDialogueRecordServicingPositionReference(String contactDialogueRecordServicingPositionReference) {
    this.contactDialogueRecordServicingPositionReference = contactDialogueRecordServicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name general-info: e.g. web, phone, chat, video, VOIP, face to face at a branch - note there can be concurrent sessions within a single customer contact 
   * @return contactDialogueRecordSessionMechanism
  **/

  public String getContactDialogueRecordSessionMechanism() {
    return contactDialogueRecordSessionMechanism;
  }

  public void setContactDialogueRecordSessionMechanism(String contactDialogueRecordSessionMechanism) {
    this.contactDialogueRecordSessionMechanism = contactDialogueRecordSessionMechanism;
  }


  /**
   * Get contactDialogueRecordSessionStartEndTime
   * @return contactDialogueRecordSessionStartEndTime
  **/

  public DateTimePeriod getContactDialogueRecordSessionStartEndTime() {
    return contactDialogueRecordSessionStartEndTime;
  }

  public void setContactDialogueRecordSessionStartEndTime(DateTimePeriod contactDialogueRecordSessionStartEndTime) {
    this.contactDialogueRecordSessionStartEndTime = contactDialogueRecordSessionStartEndTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: e.g. verified customer, anonymous contact, topic - used to structure/script dialogue 
   * @return contactDialogueRecordContactDialogueType
  **/

  public String getContactDialogueRecordContactDialogueType() {
    return contactDialogueRecordContactDialogueType;
  }

  public void setContactDialogueRecordContactDialogueType(String contactDialogueRecordContactDialogueType) {
    this.contactDialogueRecordContactDialogueType = contactDialogueRecordContactDialogueType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: a prompt provided to structure the interaction for self-service and assisted interactions 
   * @return contactDialogueRecordContactDialogueScript
  **/

  public String getContactDialogueRecordContactDialogueScript() {
    return contactDialogueRecordContactDialogueScript;
  }

  public void setContactDialogueRecordContactDialogueScript(String contactDialogueRecordContactDialogueScript) {
    this.contactDialogueRecordContactDialogueScript = contactDialogueRecordContactDialogueScript;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return contactDialogueRecordContactDialogueLogReference
  **/

  public String getContactDialogueRecordContactDialogueLogReference() {
    return contactDialogueRecordContactDialogueLogReference;
  }

  public void setContactDialogueRecordContactDialogueLogReference(String contactDialogueRecordContactDialogueLogReference) {
    this.contactDialogueRecordContactDialogueLogReference = contactDialogueRecordContactDialogueLogReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Video general-info: click-stream, video/audio recording 
   * @return contactDialogueRecordContactDialogueLog
  **/

  public String getContactDialogueRecordContactDialogueLog() {
    return contactDialogueRecordContactDialogueLog;
  }

  public void setContactDialogueRecordContactDialogueLog(String contactDialogueRecordContactDialogueLog) {
    this.contactDialogueRecordContactDialogueLog = contactDialogueRecordContactDialogueLog;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: records actions performed during contact, including all sessions 
   * @return customerContactActivityRecord
  **/

  public Object getCustomerContactActivityRecord() {
    return customerContactActivityRecord;
  }

  public void setCustomerContactActivityRecord(Object customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
  }


  /**
   * Get customerContactFromTo
   * @return customerContactFromTo
  **/

  public DateTimePeriod getCustomerContactFromTo() {
    return customerContactFromTo;
  }

  public void setCustomerContactFromTo(DateTimePeriod customerContactFromTo) {
    this.customerContactFromTo = customerContactFromTo;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactResult
  **/

  public String getCustomerContactResult() {
    return customerContactResult;
  }

  public void setCustomerContactResult(String customerContactResult) {
    this.customerContactResult = customerContactResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return channelActivityHistoryReportReference
  **/

  public String getChannelActivityHistoryReportReference() {
    return channelActivityHistoryReportReference;
  }

  public void setChannelActivityHistoryReportReference(String channelActivityHistoryReportReference) {
    this.channelActivityHistoryReportReference = channelActivityHistoryReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration general-info: recent channel activity is provided to support authorization 
   * @return channelActivityHistoryReportFromTo
  **/

  public String getChannelActivityHistoryReportFromTo() {
    return channelActivityHistoryReportFromTo;
  }

  public void setChannelActivityHistoryReportFromTo(String channelActivityHistoryReportFromTo) {
    this.channelActivityHistoryReportFromTo = channelActivityHistoryReportFromTo;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: report extracting recent channel activity records to support authorization 
   * @return channelActivityHistoryReport
  **/

  public Object getChannelActivityHistoryReport() {
    return channelActivityHistoryReport;
  }

  public void setChannelActivityHistoryReport(Object channelActivityHistoryReport) {
    this.channelActivityHistoryReport = channelActivityHistoryReport;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: indicates success or failure or required authentication level to be acquired for authorization 
   * @return transactionAuthorizationResult
  **/

  public Object getTransactionAuthorizationResult() {
    return transactionAuthorizationResult;
  }

  public void setTransactionAuthorizationResult(Object transactionAuthorizationResult) {
    this.transactionAuthorizationResult = transactionAuthorizationResult;
  }


}

