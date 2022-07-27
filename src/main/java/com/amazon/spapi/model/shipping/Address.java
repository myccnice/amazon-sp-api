/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The address.
 */
@ApiModel(description = "The address.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:59:38.614+08:00")
public class Address {
    @SerializedName("name")
    private String name = null;

    @SerializedName("addressLine1")
    private String addressLine1 = null;

    @SerializedName("addressLine2")
    private String addressLine2 = null;

    @SerializedName("addressLine3")
    private String addressLine3 = null;

    @SerializedName("stateOrRegion")
    private String stateOrRegion = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("countryCode")
    private String countryCode = null;

    @SerializedName("postalCode")
    private String postalCode = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("copyEmails")
    private List<String> copyEmails = null;

    @SerializedName("phoneNumber")
    private String phoneNumber = null;

    public Address name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the person, business or institution at that address.
     * @return name
     **/
    @ApiModelProperty(required = true, value = "The name of the person, business or institution at that address.")
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
     * First line of that address.
     * @return addressLine1
     **/
    @ApiModelProperty(required = true, value = "First line of that address.")
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
     * Additional address information, if required.
     * @return addressLine2
     **/
    @ApiModelProperty(value = "Additional address information, if required.")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Address addressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Additional address information, if required.
     * @return addressLine3
     **/
    @ApiModelProperty(value = "Additional address information, if required.")
    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public Address stateOrRegion(String stateOrRegion) {
        this.stateOrRegion = stateOrRegion;
        return this;
    }

    /**
     * Get stateOrRegion
     * @return stateOrRegion
     **/
    @ApiModelProperty(required = true, value = "")
    public String getStateOrRegion() {
        return stateOrRegion;
    }

    public void setStateOrRegion(String stateOrRegion) {
        this.stateOrRegion = stateOrRegion;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     * @return city
     **/
    @ApiModelProperty(required = true, value = "")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get countryCode
     * @return countryCode
     **/
    @ApiModelProperty(required = true, value = "")
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
     * Get postalCode
     * @return postalCode
     **/
    @ApiModelProperty(required = true, value = "")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The email address of the contact associated with the address.
     * @return email
     **/
    @ApiModelProperty(value = "The email address of the contact associated with the address.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address copyEmails(List<String> copyEmails) {
        this.copyEmails = copyEmails;
        return this;
    }

    public Address addCopyEmailsItem(String copyEmailsItem) {
        if (this.copyEmails == null) {
            this.copyEmails = new ArrayList<String>();
        }
        this.copyEmails.add(copyEmailsItem);
        return this;
    }

    /**
     * The email cc addresses of the contact associated with the address.
     * @return copyEmails
     **/
    @ApiModelProperty(value = "The email cc addresses of the contact associated with the address.")
    public List<String> getCopyEmails() {
        return copyEmails;
    }

    public void setCopyEmails(List<String> copyEmails) {
        this.copyEmails = copyEmails;
    }

    public Address phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The phone number of the person, business or institution located at that address.
     * @return phoneNumber
     **/
    @ApiModelProperty(value = "The phone number of the person, business or institution located at that address.")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                Objects.equals(this.addressLine3, address.addressLine3) &&
                Objects.equals(this.stateOrRegion, address.stateOrRegion) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.countryCode, address.countryCode) &&
                Objects.equals(this.postalCode, address.postalCode) &&
                Objects.equals(this.email, address.email) &&
                Objects.equals(this.copyEmails, address.copyEmails) &&
                Objects.equals(this.phoneNumber, address.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addressLine1, addressLine2, addressLine3, stateOrRegion, city, countryCode, postalCode, email, copyEmails, phoneNumber);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
        sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
        sb.append("    stateOrRegion: ").append(toIndentedString(stateOrRegion)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    copyEmails: ").append(toIndentedString(copyEmails)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

