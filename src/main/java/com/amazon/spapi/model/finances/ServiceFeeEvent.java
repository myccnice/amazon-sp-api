/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances.FeeComponentList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A service fee on the seller&#39;s account.
 */
@ApiModel(description = "A service fee on the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:01:58.583+08:00")
public class ServiceFeeEvent {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("FeeReason")
  private String feeReason = null;

  @SerializedName("FeeList")
  private FeeComponentList feeList = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("FnSKU")
  private String fnSKU = null;

  @SerializedName("FeeDescription")
  private String feeDescription = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  public ServiceFeeEvent amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined identifier for an order.
   * @return amazonOrderId
  **/
  @ApiModelProperty(value = "An Amazon-defined identifier for an order.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public ServiceFeeEvent feeReason(String feeReason) {
    this.feeReason = feeReason;
    return this;
  }

   /**
   * A short description of the service fee reason.
   * @return feeReason
  **/
  @ApiModelProperty(value = "A short description of the service fee reason.")
  public String getFeeReason() {
    return feeReason;
  }

  public void setFeeReason(String feeReason) {
    this.feeReason = feeReason;
  }

  public ServiceFeeEvent feeList(FeeComponentList feeList) {
    this.feeList = feeList;
    return this;
  }

   /**
   * A list of fee components associated with the service fee.
   * @return feeList
  **/
  @ApiModelProperty(value = "A list of fee components associated with the service fee.")
  public FeeComponentList getFeeList() {
    return feeList;
  }

  public void setFeeList(FeeComponentList feeList) {
    this.feeList = feeList;
  }

  public ServiceFeeEvent sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller SKU of the item. The seller SKU is qualified by the seller&#39;s seller ID, which is included with every call to the Selling Partner API.
   * @return sellerSKU
  **/
  @ApiModelProperty(value = "The seller SKU of the item. The seller SKU is qualified by the seller's seller ID, which is included with every call to the Selling Partner API.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public ServiceFeeEvent fnSKU(String fnSKU) {
    this.fnSKU = fnSKU;
    return this;
  }

   /**
   * A unique identifier assigned by Amazon to products stored in and fulfilled from an Amazon fulfillment center.
   * @return fnSKU
  **/
  @ApiModelProperty(value = "A unique identifier assigned by Amazon to products stored in and fulfilled from an Amazon fulfillment center.")
  public String getFnSKU() {
    return fnSKU;
  }

  public void setFnSKU(String fnSKU) {
    this.fnSKU = fnSKU;
  }

  public ServiceFeeEvent feeDescription(String feeDescription) {
    this.feeDescription = feeDescription;
    return this;
  }

   /**
   * A short description of the service fee event.
   * @return feeDescription
  **/
  @ApiModelProperty(value = "A short description of the service fee event.")
  public String getFeeDescription() {
    return feeDescription;
  }

  public void setFeeDescription(String feeDescription) {
    this.feeDescription = feeDescription;
  }

  public ServiceFeeEvent ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceFeeEvent serviceFeeEvent = (ServiceFeeEvent) o;
    return Objects.equals(this.amazonOrderId, serviceFeeEvent.amazonOrderId) &&
        Objects.equals(this.feeReason, serviceFeeEvent.feeReason) &&
        Objects.equals(this.feeList, serviceFeeEvent.feeList) &&
        Objects.equals(this.sellerSKU, serviceFeeEvent.sellerSKU) &&
        Objects.equals(this.fnSKU, serviceFeeEvent.fnSKU) &&
        Objects.equals(this.feeDescription, serviceFeeEvent.feeDescription) &&
        Objects.equals(this.ASIN, serviceFeeEvent.ASIN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, feeReason, feeList, sellerSKU, fnSKU, feeDescription, ASIN);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceFeeEvent {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    feeReason: ").append(toIndentedString(feeReason)).append("\n");
    sb.append("    feeList: ").append(toIndentedString(feeList)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    fnSKU: ").append(toIndentedString(fnSKU)).append("\n");
    sb.append("    feeDescription: ").append(toIndentedString(feeDescription)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
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

