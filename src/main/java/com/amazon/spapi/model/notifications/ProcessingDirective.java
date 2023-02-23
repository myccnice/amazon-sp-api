/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.notifications;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Additional information passed to the subscription to control the processing of notifications. For example, you can use an eventFilter to customize your subscription to send notifications for only the specified marketplaceId&#39;s, or select the aggregation time period at which to send notifications (e.g. limit to one notification every five minutes for high frequency notifications). The specific features available vary depending on the notificationType.  This feature is limited to specific notificationTypes and is currently only supported by the ANY_OFFER_CHANGED notificationType.
 */
@ApiModel(description = "Additional information passed to the subscription to control the processing of notifications. For example, you can use an eventFilter to customize your subscription to send notifications for only the specified marketplaceId's, or select the aggregation time period at which to send notifications (e.g. limit to one notification every five minutes for high frequency notifications). The specific features available vary depending on the notificationType.  This feature is limited to specific notificationTypes and is currently only supported by the ANY_OFFER_CHANGED notificationType.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:26:17.838+08:00")
public class ProcessingDirective {
    @SerializedName("eventFilter")
    private EventFilter eventFilter = null;

    public ProcessingDirective eventFilter(EventFilter eventFilter) {
        this.eventFilter = eventFilter;
        return this;
    }

    /**
     * A notificationType specific filter.
     * @return eventFilter
     **/
    @ApiModelProperty(value = "A notificationType specific filter.")
    public EventFilter getEventFilter() {
        return eventFilter;
    }

    public void setEventFilter(EventFilter eventFilter) {
        this.eventFilter = eventFilter;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessingDirective processingDirective = (ProcessingDirective) o;
        return Objects.equals(this.eventFilter, processingDirective.eventFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventFilter);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessingDirective {\n");

        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
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

