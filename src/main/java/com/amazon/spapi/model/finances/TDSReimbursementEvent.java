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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A tax deduction at source (TDS) claim reimbursement event on the seller&#39;s account.
 */
@ApiModel(description = "A tax deduction at source (TDS) claim reimbursement event on the seller's account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:01:58.583+08:00")
public class TDSReimbursementEvent {
    @SerializedName("PostedDate")
    private String postedDate = null;

    @SerializedName("TdsOrderId")
    private String tdsOrderId = null;

    @SerializedName("ReimbursedAmount")
    private Currency reimbursedAmount = null;

    public TDSReimbursementEvent postedDate(String postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * The date and time when the financial event was posted.
     * @return postedDate
     **/
    @ApiModelProperty(value = "The date and time when the financial event was posted.")
    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public TDSReimbursementEvent tdsOrderId(String tdsOrderId) {
        this.tdsOrderId = tdsOrderId;
        return this;
    }

    /**
     * A tax deduction at source (TDS) claim identifier.
     * @return tdsOrderId
     **/
    @ApiModelProperty(value = "A tax deduction at source (TDS) claim identifier.")
    public String getTdsOrderId() {
        return tdsOrderId;
    }

    public void setTdsOrderId(String tdsOrderId) {
        this.tdsOrderId = tdsOrderId;
    }

    public TDSReimbursementEvent reimbursedAmount(Currency reimbursedAmount) {
        this.reimbursedAmount = reimbursedAmount;
        return this;
    }

    /**
     * The amount of the reimbursement.
     * @return reimbursedAmount
     **/
    @ApiModelProperty(value = "The amount of the reimbursement.")
    public Currency getReimbursedAmount() {
        return reimbursedAmount;
    }

    public void setReimbursedAmount(Currency reimbursedAmount) {
        this.reimbursedAmount = reimbursedAmount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TDSReimbursementEvent tdSReimbursementEvent = (TDSReimbursementEvent) o;
        return Objects.equals(this.postedDate, tdSReimbursementEvent.postedDate) &&
                Objects.equals(this.tdsOrderId, tdSReimbursementEvent.tdsOrderId) &&
                Objects.equals(this.reimbursedAmount, tdSReimbursementEvent.reimbursedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postedDate, tdsOrderId, reimbursedAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TDSReimbursementEvent {\n");

        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    tdsOrderId: ").append(toIndentedString(tdsOrderId)).append("\n");
        sb.append("    reimbursedAmount: ").append(toIndentedString(reimbursedAmount)).append("\n");
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

