/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.67
 * Contact: noc@tripartie.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tripartie.safecheckout.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tripartie.safecheckout.model.StatisticOutputArraySingleValue;
import com.tripartie.safecheckout.model.StatisticOutputMultipleValue;
import com.tripartie.safecheckout.model.StatisticOutputSingleValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.tripartie.safecheckout.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-12T16:00:19.220351Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class StatisticReadDataInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(StatisticReadDataInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StatisticReadDataInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StatisticReadDataInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<StatisticOutputSingleValue> adapterStatisticOutputSingleValue = gson.getDelegateAdapter(this, TypeToken.get(StatisticOutputSingleValue.class));
            final TypeAdapter<StatisticOutputMultipleValue> adapterStatisticOutputMultipleValue = gson.getDelegateAdapter(this, TypeToken.get(StatisticOutputMultipleValue.class));

            return (TypeAdapter<T>) new TypeAdapter<StatisticReadDataInner>() {
                @Override
                public void write(JsonWriter out, StatisticReadDataInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `StatisticOutputSingleValue`
                    if (value.getActualInstance() instanceof StatisticOutputSingleValue) {
                        JsonElement element = adapterStatisticOutputSingleValue.toJsonTree((StatisticOutputSingleValue)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `StatisticOutputMultipleValue`
                    if (value.getActualInstance() instanceof StatisticOutputMultipleValue) {
                        JsonElement element = adapterStatisticOutputMultipleValue.toJsonTree((StatisticOutputMultipleValue)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: StatisticOutputMultipleValue, StatisticOutputSingleValue");
                }

                @Override
                public StatisticReadDataInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize StatisticOutputSingleValue
                    try {
                        // validate the JSON object to see if any exception is thrown
                        StatisticOutputSingleValue.validateJsonElement(jsonElement);
                        actualAdapter = adapterStatisticOutputSingleValue;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'StatisticOutputSingleValue'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for StatisticOutputSingleValue failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'StatisticOutputSingleValue'", e);
                    }
                    // deserialize StatisticOutputMultipleValue
                    try {
                        // validate the JSON object to see if any exception is thrown
                        StatisticOutputMultipleValue.validateJsonElement(jsonElement);
                        actualAdapter = adapterStatisticOutputMultipleValue;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'StatisticOutputMultipleValue'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for StatisticOutputMultipleValue failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'StatisticOutputMultipleValue'", e);
                    }

                    if (match == 1) {
                        StatisticReadDataInner ret = new StatisticReadDataInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for StatisticReadDataInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public StatisticReadDataInner() {
        super("oneOf", Boolean.FALSE);
    }

    public StatisticReadDataInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("StatisticOutputSingleValue", StatisticOutputSingleValue.class);
        schemas.put("StatisticOutputMultipleValue", StatisticOutputMultipleValue.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return StatisticReadDataInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * StatisticOutputMultipleValue, StatisticOutputSingleValue
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof StatisticOutputSingleValue) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof StatisticOutputMultipleValue) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be StatisticOutputMultipleValue, StatisticOutputSingleValue");
    }

    /**
     * Get the actual instance, which can be the following:
     * StatisticOutputMultipleValue, StatisticOutputSingleValue
     *
     * @return The actual instance (StatisticOutputMultipleValue, StatisticOutputSingleValue)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `StatisticOutputSingleValue`. If the actual instance is not `StatisticOutputSingleValue`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StatisticOutputSingleValue`
     * @throws ClassCastException if the instance is not `StatisticOutputSingleValue`
     */
    public StatisticOutputSingleValue getStatisticOutputSingleValue() throws ClassCastException {
        return (StatisticOutputSingleValue)super.getActualInstance();
    }
    /**
     * Get the actual instance of `StatisticOutputMultipleValue`. If the actual instance is not `StatisticOutputMultipleValue`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StatisticOutputMultipleValue`
     * @throws ClassCastException if the instance is not `StatisticOutputMultipleValue`
     */
    public StatisticOutputMultipleValue getStatisticOutputMultipleValue() throws ClassCastException {
        return (StatisticOutputMultipleValue)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StatisticReadDataInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with StatisticOutputSingleValue
        try {
            StatisticOutputSingleValue.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for StatisticOutputSingleValue failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with StatisticOutputMultipleValue
        try {
            StatisticOutputMultipleValue.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for StatisticOutputMultipleValue failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for StatisticReadDataInner with oneOf schemas: StatisticOutputMultipleValue, StatisticOutputSingleValue. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of StatisticReadDataInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StatisticReadDataInner
     * @throws IOException if the JSON string is invalid with respect to StatisticReadDataInner
     */
    public static StatisticReadDataInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StatisticReadDataInner.class);
    }

    /**
     * Convert an instance of StatisticReadDataInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

