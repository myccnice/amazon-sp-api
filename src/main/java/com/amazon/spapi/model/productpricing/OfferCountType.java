/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.productpricing.FulfillmentChannelType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The total number of offers for the specified condition and fulfillment channel.
 */
@ApiModel(description = "The total number of offers for the specified condition and fulfillment channel.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:54:01.888+08:00")
public class OfferCountType {
  @SerializedName("condition")
  private String condition = null;

  @SerializedName("fulfillmentChannel")
  private FulfillmentChannelType fulfillmentChannel = null;

  @SerializedName("OfferCount")
  private Integer offerCount = null;

  public OfferCountType condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.
   * @return condition
  **/
  @ApiModelProperty(value = "Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public OfferCountType fulfillmentChannel(FulfillmentChannelType fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
    return this;
  }

   /**
   * Indicates whether the item is fulfilled by Amazon or by the seller.
   * @return fulfillmentChannel
  **/
  @ApiModelProperty(value = "Indicates whether the item is fulfilled by Amazon or by the seller.")
  public FulfillmentChannelType getFulfillmentChannel() {
    return fulfillmentChannel;
  }

  public void setFulfillmentChannel(FulfillmentChannelType fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
  }

  public OfferCountType offerCount(Integer offerCount) {
    this.offerCount = offerCount;
    return this;
  }

   /**
   * The number of offers in a fulfillment channel that meet a specific condition.
   * @return offerCount
  **/
  @ApiModelProperty(value = "The number of offers in a fulfillment channel that meet a specific condition.")
  public Integer getOfferCount() {
    return offerCount;
  }

  public void setOfferCount(Integer offerCount) {
    this.offerCount = offerCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferCountType offerCountType = (OfferCountType) o;
    return Objects.equals(this.condition, offerCountType.condition) &&
        Objects.equals(this.fulfillmentChannel, offerCountType.fulfillmentChannel) &&
        Objects.equals(this.offerCount, offerCountType.offerCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, fulfillmentChannel, offerCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCountType {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
    sb.append("    offerCount: ").append(toIndentedString(offerCount)).append("\n");
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

