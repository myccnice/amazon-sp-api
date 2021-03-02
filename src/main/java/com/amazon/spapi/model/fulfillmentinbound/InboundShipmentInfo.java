/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the seller&#39;s inbound shipments. Returned by the listInboundShipments operation.
 */
@ApiModel(description = "Information about the seller's inbound shipments. Returned by the listInboundShipments operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:38:48.493+08:00")
public class InboundShipmentInfo {
  @SerializedName("ShipmentId")
  private String shipmentId = null;

  @SerializedName("ShipmentName")
  private String shipmentName = null;

  @SerializedName("ShipFromAddress")
  private Address shipFromAddress = null;

  @SerializedName("DestinationFulfillmentCenterId")
  private String destinationFulfillmentCenterId = null;

  @SerializedName("ShipmentStatus")
  private ShipmentStatus shipmentStatus = null;

  @SerializedName("LabelPrepType")
  private LabelPrepType labelPrepType = null;

  @SerializedName("AreCasesRequired")
  private Boolean areCasesRequired = null;

  @SerializedName("ConfirmedNeedByDate")
  private String confirmedNeedByDate = null;

  @SerializedName("BoxContentsSource")
  private BoxContentsSource boxContentsSource = null;

  @SerializedName("EstimatedBoxContentsFee")
  private BoxContentsFeeDetails estimatedBoxContentsFee = null;

  public InboundShipmentInfo shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * The shipment identifier submitted in the request.
   * @return shipmentId
  **/
  @ApiModelProperty(value = "The shipment identifier submitted in the request.")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public InboundShipmentInfo shipmentName(String shipmentName) {
    this.shipmentName = shipmentName;
    return this;
  }

   /**
   * The name for the inbound shipment.
   * @return shipmentName
  **/
  @ApiModelProperty(value = "The name for the inbound shipment.")
  public String getShipmentName() {
    return shipmentName;
  }

  public void setShipmentName(String shipmentName) {
    this.shipmentName = shipmentName;
  }

  public InboundShipmentInfo shipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
    return this;
  }

   /**
   * The return address.
   * @return shipFromAddress
  **/
  @ApiModelProperty(required = true, value = "The return address.")
  public Address getShipFromAddress() {
    return shipFromAddress;
  }

  public void setShipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
  }

  public InboundShipmentInfo destinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
    this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
    return this;
  }

   /**
   * An Amazon fulfillment center identifier created by Amazon.
   * @return destinationFulfillmentCenterId
  **/
  @ApiModelProperty(value = "An Amazon fulfillment center identifier created by Amazon.")
  public String getDestinationFulfillmentCenterId() {
    return destinationFulfillmentCenterId;
  }

  public void setDestinationFulfillmentCenterId(String destinationFulfillmentCenterId) {
    this.destinationFulfillmentCenterId = destinationFulfillmentCenterId;
  }

  public InboundShipmentInfo shipmentStatus(ShipmentStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * Get shipmentStatus
   * @return shipmentStatus
  **/
  @ApiModelProperty(value = "")
  public ShipmentStatus getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(ShipmentStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public InboundShipmentInfo labelPrepType(LabelPrepType labelPrepType) {
    this.labelPrepType = labelPrepType;
    return this;
  }

   /**
   * Get labelPrepType
   * @return labelPrepType
  **/
  @ApiModelProperty(value = "")
  public LabelPrepType getLabelPrepType() {
    return labelPrepType;
  }

  public void setLabelPrepType(LabelPrepType labelPrepType) {
    this.labelPrepType = labelPrepType;
  }

  public InboundShipmentInfo areCasesRequired(Boolean areCasesRequired) {
    this.areCasesRequired = areCasesRequired;
    return this;
  }

   /**
   * Indicates whether or not an inbound shipment contains case-packed boxes. When AreCasesRequired &#x3D; true for an inbound shipment, all items in the inbound shipment must be case packed.
   * @return areCasesRequired
  **/
  @ApiModelProperty(required = true, value = "Indicates whether or not an inbound shipment contains case-packed boxes. When AreCasesRequired = true for an inbound shipment, all items in the inbound shipment must be case packed.")
  public Boolean isAreCasesRequired() {
    return areCasesRequired;
  }

  public void setAreCasesRequired(Boolean areCasesRequired) {
    this.areCasesRequired = areCasesRequired;
  }

  public InboundShipmentInfo confirmedNeedByDate(String confirmedNeedByDate) {
    this.confirmedNeedByDate = confirmedNeedByDate;
    return this;
  }

   /**
   * Date by which the shipment must arrive at the Amazon fulfillment center to avoid delivery promise breaks for pre-ordered items.
   * @return confirmedNeedByDate
  **/
  @ApiModelProperty(value = "Date by which the shipment must arrive at the Amazon fulfillment center to avoid delivery promise breaks for pre-ordered items.")
  public String getConfirmedNeedByDate() {
    return confirmedNeedByDate;
  }

  public void setConfirmedNeedByDate(String confirmedNeedByDate) {
    this.confirmedNeedByDate = confirmedNeedByDate;
  }

  public InboundShipmentInfo boxContentsSource(BoxContentsSource boxContentsSource) {
    this.boxContentsSource = boxContentsSource;
    return this;
  }

   /**
   * Get boxContentsSource
   * @return boxContentsSource
  **/
  @ApiModelProperty(value = "")
  public BoxContentsSource getBoxContentsSource() {
    return boxContentsSource;
  }

  public void setBoxContentsSource(BoxContentsSource boxContentsSource) {
    this.boxContentsSource = boxContentsSource;
  }

  public InboundShipmentInfo estimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
    this.estimatedBoxContentsFee = estimatedBoxContentsFee;
    return this;
  }

   /**
   * An estimate of the manual processing fee charged by Amazon for boxes without box content information. This is only returned when BoxContentsSource is NONE.
   * @return estimatedBoxContentsFee
  **/
  @ApiModelProperty(value = "An estimate of the manual processing fee charged by Amazon for boxes without box content information. This is only returned when BoxContentsSource is NONE.")
  public BoxContentsFeeDetails getEstimatedBoxContentsFee() {
    return estimatedBoxContentsFee;
  }

  public void setEstimatedBoxContentsFee(BoxContentsFeeDetails estimatedBoxContentsFee) {
    this.estimatedBoxContentsFee = estimatedBoxContentsFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundShipmentInfo inboundShipmentInfo = (InboundShipmentInfo) o;
    return Objects.equals(this.shipmentId, inboundShipmentInfo.shipmentId) &&
        Objects.equals(this.shipmentName, inboundShipmentInfo.shipmentName) &&
        Objects.equals(this.shipFromAddress, inboundShipmentInfo.shipFromAddress) &&
        Objects.equals(this.destinationFulfillmentCenterId, inboundShipmentInfo.destinationFulfillmentCenterId) &&
        Objects.equals(this.shipmentStatus, inboundShipmentInfo.shipmentStatus) &&
        Objects.equals(this.labelPrepType, inboundShipmentInfo.labelPrepType) &&
        Objects.equals(this.areCasesRequired, inboundShipmentInfo.areCasesRequired) &&
        Objects.equals(this.confirmedNeedByDate, inboundShipmentInfo.confirmedNeedByDate) &&
        Objects.equals(this.boxContentsSource, inboundShipmentInfo.boxContentsSource) &&
        Objects.equals(this.estimatedBoxContentsFee, inboundShipmentInfo.estimatedBoxContentsFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, shipmentName, shipFromAddress, destinationFulfillmentCenterId, shipmentStatus, labelPrepType, areCasesRequired, confirmedNeedByDate, boxContentsSource, estimatedBoxContentsFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundShipmentInfo {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    shipmentName: ").append(toIndentedString(shipmentName)).append("\n");
    sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
    sb.append("    destinationFulfillmentCenterId: ").append(toIndentedString(destinationFulfillmentCenterId)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    labelPrepType: ").append(toIndentedString(labelPrepType)).append("\n");
    sb.append("    areCasesRequired: ").append(toIndentedString(areCasesRequired)).append("\n");
    sb.append("    confirmedNeedByDate: ").append(toIndentedString(confirmedNeedByDate)).append("\n");
    sb.append("    boxContentsSource: ").append(toIndentedString(boxContentsSource)).append("\n");
    sb.append("    estimatedBoxContentsFee: ").append(toIndentedString(estimatedBoxContentsFee)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

