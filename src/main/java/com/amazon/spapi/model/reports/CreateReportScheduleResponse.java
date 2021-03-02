/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.reports;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.reports.CreateReportScheduleResult;
import com.amazon.spapi.model.ErrorList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response for the createReportSchedule operation.
 */
@ApiModel(description = "The response for the createReportSchedule operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:55:47.344+08:00")
public class CreateReportScheduleResponse {
  @SerializedName("payload")
  private CreateReportScheduleResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public CreateReportScheduleResponse payload(CreateReportScheduleResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the createReportSchedule operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the createReportSchedule operation.")
  public CreateReportScheduleResult getPayload() {
    return payload;
  }

  public void setPayload(CreateReportScheduleResult payload) {
    this.payload = payload;
  }

  public CreateReportScheduleResponse errors(ErrorList errors) {
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
    CreateReportScheduleResponse createReportScheduleResponse = (CreateReportScheduleResponse) o;
    return Objects.equals(this.payload, createReportScheduleResponse.payload) &&
        Objects.equals(this.errors, createReportScheduleResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReportScheduleResponse {\n");
    
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

