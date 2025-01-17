/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services;

import java.util.Objects;

import com.amazon.spapi.model.ErrorList;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Response schema for CompleteServiceJobByServiceJobId operation.
 */
@ApiModel(description = "Response schema for CompleteServiceJobByServiceJobId operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:57:54.327+08:00")
public class CompleteServiceJobByServiceJobIdResponse {
    @SerializedName("errors")
    private ErrorList errors = null;

    public CompleteServiceJobByServiceJobIdResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Encountered errors for the CompleteServiceJobByServiceJobId operation.
     * @return errors
     **/
    @ApiModelProperty(value = "Encountered errors for the CompleteServiceJobByServiceJobId operation.")
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
        CompleteServiceJobByServiceJobIdResponse completeServiceJobByServiceJobIdResponse = (CompleteServiceJobByServiceJobIdResponse) o;
        return Objects.equals(this.errors, completeServiceJobByServiceJobIdResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteServiceJobByServiceJobIdResponse {\n");

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

