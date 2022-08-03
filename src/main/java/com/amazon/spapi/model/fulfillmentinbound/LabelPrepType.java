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

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of label preparation that is required for the inbound shipment.
 */
@JsonAdapter(LabelPrepType.Adapter.class)
public enum LabelPrepType {

    NO_LABEL("NO_LABEL"),

    SELLER_LABEL("SELLER_LABEL"),

    AMAZON_LABEL("AMAZON_LABEL");

    private String value;

    LabelPrepType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LabelPrepType fromValue(String text) {
        for (LabelPrepType b : LabelPrepType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<LabelPrepType> {
        @Override
        public void write(final JsonWriter jsonWriter, final LabelPrepType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LabelPrepType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return LabelPrepType.fromValue(String.valueOf(value));
        }
    }
}

