/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalogitems;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Role of an individual contributor in the creation of an item, such as author or actor.
 */
@ApiModel(description = "Role of an individual contributor in the creation of an item, such as author or actor.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:10:02.963+08:00")
public class ItemContributorRole {
    @SerializedName("displayName")
    private String displayName = null;

    @SerializedName("value")
    private String value = null;

    public ItemContributorRole displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name of the role in the requested locale, such as Author or Actor.
     * @return displayName
     **/
    @ApiModelProperty(value = "Display name of the role in the requested locale, such as Author or Actor.")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ItemContributorRole value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Role value for the Amazon catalog item, such as author or actor.
     * @return value
     **/
    @ApiModelProperty(required = true, value = "Role value for the Amazon catalog item, such as author or actor.")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ItemContributorRole itemContributorRole = (ItemContributorRole) o;
        return Objects.equals(this.displayName, itemContributorRole.displayName) &&
                Objects.equals(this.value, itemContributorRole.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemContributorRole {\n");

        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

