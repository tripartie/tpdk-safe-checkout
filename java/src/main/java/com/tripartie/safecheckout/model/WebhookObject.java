/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.39
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
import com.tripartie.safecheckout.model.OfferMediaRead;
import com.tripartie.safecheckout.model.OfferOrganizationRead;
import com.tripartie.safecheckout.model.OfferPersonaRead;
import com.tripartie.safecheckout.model.OfferRead;
import com.tripartie.safecheckout.model.PersonaAddressRead;
import com.tripartie.safecheckout.model.PersonaMetadataRead;
import com.tripartie.safecheckout.model.PersonaRead;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-05T06:00:32.183289Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WebhookObject extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WebhookObject.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookObject.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookObject' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OfferRead> adapterOfferRead = gson.getDelegateAdapter(this, TypeToken.get(OfferRead.class));
            final TypeAdapter<PersonaRead> adapterPersonaRead = gson.getDelegateAdapter(this, TypeToken.get(PersonaRead.class));

            return (TypeAdapter<T>) new TypeAdapter<WebhookObject>() {
                @Override
                public void write(JsonWriter out, WebhookObject value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `OfferRead`
                    if (value.getActualInstance() instanceof OfferRead) {
                        JsonElement element = adapterOfferRead.toJsonTree((OfferRead)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PersonaRead`
                    if (value.getActualInstance() instanceof PersonaRead) {
                        JsonElement element = adapterPersonaRead.toJsonTree((PersonaRead)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: OfferRead, PersonaRead");
                }

                @Override
                public WebhookObject read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize OfferRead
                    try {
                        // validate the JSON object to see if any exception is thrown
                        OfferRead.validateJsonElement(jsonElement);
                        actualAdapter = adapterOfferRead;
                        WebhookObject ret = new WebhookObject();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for OfferRead failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'OfferRead'", e);
                    }
                    // deserialize PersonaRead
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PersonaRead.validateJsonElement(jsonElement);
                        actualAdapter = adapterPersonaRead;
                        WebhookObject ret = new WebhookObject();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PersonaRead failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PersonaRead'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for WebhookObject: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public WebhookObject() {
        super("anyOf", Boolean.FALSE);
    }

    public WebhookObject(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("OfferRead", OfferRead.class);
        schemas.put("PersonaRead", PersonaRead.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return WebhookObject.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * OfferRead, PersonaRead
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof OfferRead) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PersonaRead) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be OfferRead, PersonaRead");
    }

    /**
     * Get the actual instance, which can be the following:
     * OfferRead, PersonaRead
     *
     * @return The actual instance (OfferRead, PersonaRead)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `OfferRead`. If the actual instance is not `OfferRead`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OfferRead`
     * @throws ClassCastException if the instance is not `OfferRead`
     */
    public OfferRead getOfferRead() throws ClassCastException {
        return (OfferRead)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PersonaRead`. If the actual instance is not `PersonaRead`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PersonaRead`
     * @throws ClassCastException if the instance is not `PersonaRead`
     */
    public PersonaRead getPersonaRead() throws ClassCastException {
        return (PersonaRead)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookObject
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with OfferRead
        try {
            OfferRead.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for OfferRead failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PersonaRead
        try {
            PersonaRead.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PersonaRead failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for WebhookObject with anyOf schemas: OfferRead, PersonaRead. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of WebhookObject given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookObject
     * @throws IOException if the JSON string is invalid with respect to WebhookObject
     */
    public static WebhookObject fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookObject.class);
    }

    /**
     * Convert an instance of WebhookObject to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

