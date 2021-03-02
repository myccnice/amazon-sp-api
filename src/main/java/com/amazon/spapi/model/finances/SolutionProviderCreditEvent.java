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
import com.amazon.spapi.model.finances.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A credit given to a solution provider.
 */
@ApiModel(description = "A credit given to a solution provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:01:58.583+08:00")
public class SolutionProviderCreditEvent {
  @SerializedName("ProviderTransactionType")
  private String providerTransactionType = null;

  @SerializedName("SellerOrderId")
  private String sellerOrderId = null;

  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("MarketplaceCountryCode")
  private String marketplaceCountryCode = null;

  @SerializedName("SellerId")
  private String sellerId = null;

  @SerializedName("SellerStoreName")
  private String sellerStoreName = null;

  @SerializedName("ProviderId")
  private String providerId = null;

  @SerializedName("ProviderStoreName")
  private String providerStoreName = null;

  @SerializedName("TransactionAmount")
  private Currency transactionAmount = null;

  @SerializedName("TransactionCreationDate")
  private String transactionCreationDate = null;

  public SolutionProviderCreditEvent providerTransactionType(String providerTransactionType) {
    this.providerTransactionType = providerTransactionType;
    return this;
  }

   /**
   * The transaction type.
   * @return providerTransactionType
  **/
  @ApiModelProperty(value = "The transaction type.")
  public String getProviderTransactionType() {
    return providerTransactionType;
  }

  public void setProviderTransactionType(String providerTransactionType) {
    this.providerTransactionType = providerTransactionType;
  }

  public SolutionProviderCreditEvent sellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
    return this;
  }

   /**
   * A seller-defined identifier for an order.
   * @return sellerOrderId
  **/
  @ApiModelProperty(value = "A seller-defined identifier for an order.")
  public String getSellerOrderId() {
    return sellerOrderId;
  }

  public void setSellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
  }

  public SolutionProviderCreditEvent marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The identifier of the marketplace where the order was placed.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "The identifier of the marketplace where the order was placed.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public SolutionProviderCreditEvent marketplaceCountryCode(String marketplaceCountryCode) {
    this.marketplaceCountryCode = marketplaceCountryCode;
    return this;
  }

   /**
   * The two-letter country code of the country associated with the marketplace where the order was placed.
   * @return marketplaceCountryCode
  **/
  @ApiModelProperty(value = "The two-letter country code of the country associated with the marketplace where the order was placed.")
  public String getMarketplaceCountryCode() {
    return marketplaceCountryCode;
  }

  public void setMarketplaceCountryCode(String marketplaceCountryCode) {
    this.marketplaceCountryCode = marketplaceCountryCode;
  }

  public SolutionProviderCreditEvent sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The Amazon-defined identifier of the seller.
   * @return sellerId
  **/
  @ApiModelProperty(value = "The Amazon-defined identifier of the seller.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public SolutionProviderCreditEvent sellerStoreName(String sellerStoreName) {
    this.sellerStoreName = sellerStoreName;
    return this;
  }

   /**
   * The store name where the payment event occurred.
   * @return sellerStoreName
  **/
  @ApiModelProperty(value = "The store name where the payment event occurred.")
  public String getSellerStoreName() {
    return sellerStoreName;
  }

  public void setSellerStoreName(String sellerStoreName) {
    this.sellerStoreName = sellerStoreName;
  }

  public SolutionProviderCreditEvent providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * The Amazon-defined identifier of the solution provider.
   * @return providerId
  **/
  @ApiModelProperty(value = "The Amazon-defined identifier of the solution provider.")
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public SolutionProviderCreditEvent providerStoreName(String providerStoreName) {
    this.providerStoreName = providerStoreName;
    return this;
  }

   /**
   * The store name where the payment event occurred.
   * @return providerStoreName
  **/
  @ApiModelProperty(value = "The store name where the payment event occurred.")
  public String getProviderStoreName() {
    return providerStoreName;
  }

  public void setProviderStoreName(String providerStoreName) {
    this.providerStoreName = providerStoreName;
  }

  public SolutionProviderCreditEvent transactionAmount(Currency transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * The amount of the credit.
   * @return transactionAmount
  **/
  @ApiModelProperty(value = "The amount of the credit.")
  public Currency getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Currency transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public SolutionProviderCreditEvent transactionCreationDate(String transactionCreationDate) {
    this.transactionCreationDate = transactionCreationDate;
    return this;
  }

   /**
   * The date and time that the credit transaction was created, in ISO 8601 date time format.
   * @return transactionCreationDate
  **/
  @ApiModelProperty(value = "The date and time that the credit transaction was created, in ISO 8601 date time format.")
  public String getTransactionCreationDate() {
    return transactionCreationDate;
  }

  public void setTransactionCreationDate(String transactionCreationDate) {
    this.transactionCreationDate = transactionCreationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolutionProviderCreditEvent solutionProviderCreditEvent = (SolutionProviderCreditEvent) o;
    return Objects.equals(this.providerTransactionType, solutionProviderCreditEvent.providerTransactionType) &&
        Objects.equals(this.sellerOrderId, solutionProviderCreditEvent.sellerOrderId) &&
        Objects.equals(this.marketplaceId, solutionProviderCreditEvent.marketplaceId) &&
        Objects.equals(this.marketplaceCountryCode, solutionProviderCreditEvent.marketplaceCountryCode) &&
        Objects.equals(this.sellerId, solutionProviderCreditEvent.sellerId) &&
        Objects.equals(this.sellerStoreName, solutionProviderCreditEvent.sellerStoreName) &&
        Objects.equals(this.providerId, solutionProviderCreditEvent.providerId) &&
        Objects.equals(this.providerStoreName, solutionProviderCreditEvent.providerStoreName) &&
        Objects.equals(this.transactionAmount, solutionProviderCreditEvent.transactionAmount) &&
        Objects.equals(this.transactionCreationDate, solutionProviderCreditEvent.transactionCreationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerTransactionType, sellerOrderId, marketplaceId, marketplaceCountryCode, sellerId, sellerStoreName, providerId, providerStoreName, transactionAmount, transactionCreationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolutionProviderCreditEvent {\n");
    
    sb.append("    providerTransactionType: ").append(toIndentedString(providerTransactionType)).append("\n");
    sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    marketplaceCountryCode: ").append(toIndentedString(marketplaceCountryCode)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    sellerStoreName: ").append(toIndentedString(sellerStoreName)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerStoreName: ").append(toIndentedString(providerStoreName)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionCreationDate: ").append(toIndentedString(transactionCreationDate)).append("\n");
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

