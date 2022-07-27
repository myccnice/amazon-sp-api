/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
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
 * The dimension type attribute of an item.
 */
@ApiModel(description = "The dimension type attribute of an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:17:36.166+08:00")
public class DimensionType {
    @SerializedName("Height")
    private DecimalWithUnits height = null;

    @SerializedName("Length")
    private DecimalWithUnits length = null;

    @SerializedName("Width")
    private DecimalWithUnits width = null;

    @SerializedName("Weight")
    private DecimalWithUnits weight = null;

    public DimensionType height(DecimalWithUnits height) {
        this.height = height;
        return this;
    }

    /**
     * The height attribute of the dimension.
     * @return height
     **/
    @ApiModelProperty(value = "The height attribute of the dimension.")
    public DecimalWithUnits getHeight() {
        return height;
    }

    public void setHeight(DecimalWithUnits height) {
        this.height = height;
    }

    public DimensionType length(DecimalWithUnits length) {
        this.length = length;
        return this;
    }

    /**
     * The length attribute of the dimension.
     * @return length
     **/
    @ApiModelProperty(value = "The length attribute of the dimension.")
    public DecimalWithUnits getLength() {
        return length;
    }

    public void setLength(DecimalWithUnits length) {
        this.length = length;
    }

    public DimensionType width(DecimalWithUnits width) {
        this.width = width;
        return this;
    }

    /**
     * The width attribute of the dimension.
     * @return width
     **/
    @ApiModelProperty(value = "The width attribute of the dimension.")
    public DecimalWithUnits getWidth() {
        return width;
    }

    public void setWidth(DecimalWithUnits width) {
        this.width = width;
    }

    public DimensionType weight(DecimalWithUnits weight) {
        this.weight = weight;
        return this;
    }

    /**
     * The weight attribute of the dimension.
     * @return weight
     **/
    @ApiModelProperty(value = "The weight attribute of the dimension.")
    public DecimalWithUnits getWeight() {
        return weight;
    }

    public void setWeight(DecimalWithUnits weight) {
        this.weight = weight;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DimensionType dimensionType = (DimensionType) o;
        return Objects.equals(this.height, dimensionType.height) &&
                Objects.equals(this.length, dimensionType.length) &&
                Objects.equals(this.width, dimensionType.width) &&
                Objects.equals(this.weight, dimensionType.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, length, width, weight);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionType {\n");

        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

