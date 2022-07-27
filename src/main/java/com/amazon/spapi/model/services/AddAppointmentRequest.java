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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Input for add appointment operation.
 */
@ApiModel(description = "Input for add appointment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:57:54.327+08:00")
public class AddAppointmentRequest {
    @SerializedName("appointmentTime")
    private AppointmentTimeInput appointmentTime = null;

    public AddAppointmentRequest appointmentTime(AppointmentTimeInput appointmentTime) {
        this.appointmentTime = appointmentTime;
        return this;
    }

    /**
     * Input appointment time details.
     * @return appointmentTime
     **/
    @ApiModelProperty(required = true, value = "Input appointment time details.")
    public AppointmentTimeInput getAppointmenotTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(AppointmentTimeInput appointmentTime) {
        this.appointmentTime = appointmentTime;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddAppointmentRequest addAppointmentRequest = (AddAppointmentRequest) o;
        return Objects.equals(this.appointmentTime, addAppointmentRequest.appointmentTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAppointmentRequest {\n");

        sb.append("    appointmentTime: ").append(toIndentedString(appointmentTime)).append("\n");
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

