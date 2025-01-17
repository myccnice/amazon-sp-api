/*
 * Selling Partner API for Feeds
 * The Selling Partner API for Feeds lets you upload data to Amazon on behalf of a selling partner.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.feeds;

import java.util.Objects;

import com.amazon.spapi.model.ErrorList;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Response schema.
 */
@ApiModel(description = "Response schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:33:48.553+08:00")
public class GetFeedResponse {
    @SerializedName("payload")
    private Feed payload = null;

    @SerializedName("errors")
    private ErrorList errors = null;

    public GetFeedResponse payload(Feed payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     * @return payload
     **/
    @ApiModelProperty(value = "")
    public Feed getPayload() {
        return payload;
    }

    public void setPayload(Feed payload) {
        this.payload = payload;
    }

    public GetFeedResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get errors
     * @return errors
     **/
    @ApiModelProperty(value = "")
    public ErrorList getErrors() {
        return errors;
    }

    public void setErrors(ErrorList errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFeedResponse getFeedResponse = (GetFeedResponse) o;
        return Objects.equals(this.payload, getFeedResponse.payload) &&
                Objects.equals(this.errors, getFeedResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeedResponse {\n");

        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

