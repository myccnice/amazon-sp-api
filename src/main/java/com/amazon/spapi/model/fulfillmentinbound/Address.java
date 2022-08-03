/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:38:48.493+08:00")
public class Address {
    @SerializedName("Name")
    private String name = null;

    @SerializedName("AddressLine1")
    private String addressLine1 = null;

    @SerializedName("AddressLine2")
    private String addressLine2 = null;

    @SerializedName("DistrictOrCounty")
    private String districtOrCounty = null;

    @SerializedName("City")
    private String city = null;

    @SerializedName("StateOrProvinceCode")
    private String stateOrProvinceCode = null;

    @SerializedName("CountryCode")
    private String countryCode = null;

    @SerializedName("PostalCode")
    private String postalCode = null;

    public Address name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the individual or business.
     * @return name
     **/
    @ApiModelProperty(required = true, value = "Name of the individual or business.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * The street address information.
     * @return addressLine1
     **/
    @ApiModelProperty(required = true, value = "The street address information.")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Address addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Additional street address information, if required.
     * @return addressLine2
     **/
    @ApiModelProperty(value = "Additional street address information, if required.")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Address districtOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
        return this;
    }

    /**
     * The district or county.
     * @return districtOrCounty
     **/
    @ApiModelProperty(value = "The district or county.")
    public String getDistrictOrCounty() {
        return districtOrCounty;
    }

    public void setDistrictOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city.
     * @return city
     **/
    @ApiModelProperty(required = true, value = "The city.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address stateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
        return this;
    }

    /**
     * The state or province code.  If state or province codes are used in your marketplace, it is recommended that you include one with your request. This helps Amazon to select the most appropriate Amazon fulfillment center for your inbound shipment plan.
     * @return stateOrProvinceCode
     **/
    @ApiModelProperty(required = true, value = "The state or province code.  If state or province codes are used in your marketplace, it is recommended that you include one with your request. This helps Amazon to select the most appropriate Amazon fulfillment center for your inbound shipment plan.")
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    public Address countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The country code in two-character ISO 3166-1 alpha-2 format.
     * @return countryCode
     **/
    @ApiModelProperty(required = true, value = "The country code in two-character ISO 3166-1 alpha-2 format.")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The postal code.  If postal codes are used in your marketplace, we recommended that you include one with your request. This helps Amazon select the most appropriate Amazon fulfillment center for the inbound shipment plan.
     * @return postalCode
     **/
    @ApiModelProperty(required = true, value = "The postal code.  If postal codes are used in your marketplace, we recommended that you include one with your request. This helps Amazon select the most appropriate Amazon fulfillment center for the inbound shipment plan.")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.name, address.name) &&
                Objects.equals(this.addressLine1, address.addressLine1) &&
                Objects.equals(this.addressLine2, address.addressLine2) &&
                Objects.equals(this.districtOrCounty, address.districtOrCounty) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.stateOrProvinceCode, address.stateOrProvinceCode) &&
                Objects.equals(this.countryCode, address.countryCode) &&
                Objects.equals(this.postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addressLine1, addressLine2, districtOrCounty, city, stateOrProvinceCode, countryCode, postalCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    districtOrCounty: ").append(toIndentedString(districtOrCounty)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    stateOrProvinceCode: ").append(toIndentedString(stateOrProvinceCode)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

