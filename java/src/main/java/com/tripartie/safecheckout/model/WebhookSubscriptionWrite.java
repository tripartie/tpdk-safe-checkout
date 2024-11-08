/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.113
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
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.tripartie.safecheckout.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T13:50:36.452269Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class WebhookSubscriptionWrite {
  /**
   * Gets or Sets event
   */
  @JsonAdapter(EventEnum.Adapter.class)
  public enum EventEnum {
    OFFER_TRANSACTION_AUTHORIZED("offer.transaction.authorized"),
    
    OFFER_TRANSACTION_ACCEPTED("offer.transaction.accepted"),
    
    OFFER_TRANSACTION_SHIPPED("offer.transaction.shipped"),
    
    OFFER_TRANSACTION_DELIVERED("offer.transaction.delivered"),
    
    OFFER_TRANSACTION_COMPLETED("offer.transaction.completed"),
    
    OFFER_TRANSACTION_CANCELED("offer.transaction.canceled"),
    
    OFFER_TRANSACTION_DISPUTED("offer.transaction.disputed"),
    
    OFFER_CLOSED("offer.closed"),
    
    PERSONA_ADDED("persona.added"),
    
    OFFER_TRANSACTION_REVIEWED("offer.transaction.reviewed");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EventEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventEnum event;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private URI callbackUrl;

  public WebhookSubscriptionWrite() {
  }

  public WebhookSubscriptionWrite event(EventEnum event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @javax.annotation.Nullable
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }


  public WebhookSubscriptionWrite callbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Get callbackUrl
   * @return callbackUrl
   */
  @javax.annotation.Nonnull
  public URI getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
  }



  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscriptionWrite {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("event");
    openapiFields.add("callbackUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callbackUrl");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookSubscriptionWrite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookSubscriptionWrite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookSubscriptionWrite is not found in the empty JSON string", WebhookSubscriptionWrite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookSubscriptionWrite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookSubscriptionWrite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookSubscriptionWrite.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      // validate the optional field `event`
      if (jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) {
        EventEnum.validateJsonElement(jsonObj.get("event"));
      }
      if (!jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookSubscriptionWrite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookSubscriptionWrite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookSubscriptionWrite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookSubscriptionWrite.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookSubscriptionWrite>() {
           @Override
           public void write(JsonWriter out, WebhookSubscriptionWrite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookSubscriptionWrite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookSubscriptionWrite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookSubscriptionWrite
   * @throws IOException if the JSON string is invalid with respect to WebhookSubscriptionWrite
   */
  public static WebhookSubscriptionWrite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookSubscriptionWrite.class);
  }

  /**
   * Convert an instance of WebhookSubscriptionWrite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

