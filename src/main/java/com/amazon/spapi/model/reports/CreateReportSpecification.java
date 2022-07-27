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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateReportSpecification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:55:47.344+08:00")
public class CreateReportSpecification {
    @SerializedName("reportOptions")
    private ReportOptions reportOptions = null;

    @SerializedName("reportType")
    private String reportType = null;

    @SerializedName("dataStartTime")
    private OffsetDateTime dataStartTime = null;

    @SerializedName("dataEndTime")
    private OffsetDateTime dataEndTime = null;

    @SerializedName("marketplaceIds")
    private List<String> marketplaceIds = new ArrayList<String>();

    public CreateReportSpecification reportOptions(ReportOptions reportOptions) {
        this.reportOptions = reportOptions;
        return this;
    }

    /**
     * Get reportOptions
     * @return reportOptions
     **/
    @ApiModelProperty(value = "")
    public ReportOptions getReportOptions() {
        return reportOptions;
    }

    public void setReportOptions(ReportOptions reportOptions) {
        this.reportOptions = reportOptions;
    }

    public CreateReportSpecification reportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    /**
     * The report type.
     * @return reportType
     **/
    @ApiModelProperty(required = true, value = "The report type.")
    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public CreateReportSpecification dataStartTime(OffsetDateTime dataStartTime) {
        this.dataStartTime = dataStartTime;
        return this;
    }

    /**
     * The start of a date and time range, in ISO 8601 date time format, used for selecting the data to report. The default is now. The value must be prior to or equal to the current date and time. Not all report types make use of this.
     * @return dataStartTime
     **/
    @ApiModelProperty(value = "The start of a date and time range, in ISO 8601 date time format, used for selecting the data to report. The default is now. The value must be prior to or equal to the current date and time. Not all report types make use of this.")
    public OffsetDateTime getDataStartTime() {
        return dataStartTime;
    }

    public void setDataStartTime(OffsetDateTime dataStartTime) {
        this.dataStartTime = dataStartTime;
    }

    public CreateReportSpecification dataEndTime(OffsetDateTime dataEndTime) {
        this.dataEndTime = dataEndTime;
        return this;
    }

    /**
     * The end of a date and time range, in ISO 8601 date time format, used for selecting the data to report. The default is now. The value must be prior to or equal to the current date and time. Not all report types make use of this.
     * @return dataEndTime
     **/
    @ApiModelProperty(value = "The end of a date and time range, in ISO 8601 date time format, used for selecting the data to report. The default is now. The value must be prior to or equal to the current date and time. Not all report types make use of this.")
    public OffsetDateTime getDataEndTime() {
        return dataEndTime;
    }

    public void setDataEndTime(OffsetDateTime dataEndTime) {
        this.dataEndTime = dataEndTime;
    }

    public CreateReportSpecification marketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
        return this;
    }

    public CreateReportSpecification addMarketplaceIdsItem(String marketplaceIdsItem) {
        this.marketplaceIds.add(marketplaceIdsItem);
        return this;
    }

    /**
     * A list of marketplace identifiers. The report document&#39;s contents will contain data for all of the specified marketplaces, unless the report type indicates otherwise.
     * @return marketplaceIds
     **/
    @ApiModelProperty(required = true, value = "A list of marketplace identifiers. The report document's contents will contain data for all of the specified marketplaces, unless the report type indicates otherwise.")
    public List<String> getMarketplaceIds() {
        return marketplaceIds;
    }

    public void setMarketplaceIds(List<String> marketplaceIds) {
        this.marketplaceIds = marketplaceIds;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateReportSpecification createReportSpecification = (CreateReportSpecification) o;
        return Objects.equals(this.reportOptions, createReportSpecification.reportOptions) &&
                Objects.equals(this.reportType, createReportSpecification.reportType) &&
                Objects.equals(this.dataStartTime, createReportSpecification.dataStartTime) &&
                Objects.equals(this.dataEndTime, createReportSpecification.dataEndTime) &&
                Objects.equals(this.marketplaceIds, createReportSpecification.marketplaceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportOptions, reportType, dataStartTime, dataEndTime, marketplaceIds);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReportSpecification {\n");

        sb.append("    reportOptions: ").append(toIndentedString(reportOptions)).append("\n");
        sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
        sb.append("    dataStartTime: ").append(toIndentedString(dataStartTime)).append("\n");
        sb.append("    dataEndTime: ").append(toIndentedString(dataEndTime)).append("\n");
        sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
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

