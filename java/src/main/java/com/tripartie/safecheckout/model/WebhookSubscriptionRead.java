/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.35
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
import java.time.OffsetDateTime;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T06:55:47.416207Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WebhookSubscriptionRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

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
    
    NULL("null");

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
  private String callbackUrl;

  public static final String SERIALIZED_NAME_WEBHOOK_SECRET = "webhookSecret";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_SECRET)
  private String webhookSecret;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public WebhookSubscriptionRead() {
  }

  public WebhookSubscriptionRead(
     Integer id, 
     OffsetDateTime createdAt
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }



  public WebhookSubscriptionRead event(EventEnum event) {
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


  public WebhookSubscriptionRead callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Get callbackUrl
   * @return callbackUrl
   */
  @javax.annotation.Nullable
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public WebhookSubscriptionRead webhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
    return this;
  }

  /**
   * Get webhookSecret
   * @return webhookSecret
   */
  @javax.annotation.Nonnull
  public String getWebhookSecret() {
    return webhookSecret;
  }

  public void setWebhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
  }


  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
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
    sb.append("class WebhookSubscriptionRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("event");
    openapiFields.add("callbackUrl");
    openapiFields.add("webhookSecret");
    openapiFields.add("createdAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("webhookSecret");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookSubscriptionRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookSubscriptionRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookSubscriptionRead is not found in the empty JSON string", WebhookSubscriptionRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookSubscriptionRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookSubscriptionRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookSubscriptionRead.openapiRequiredFields) {
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
      if ((jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonNull()) && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
      if (!jsonObj.get("webhookSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookSecret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookSubscriptionRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookSubscriptionRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookSubscriptionRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookSubscriptionRead.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookSubscriptionRead>() {
           @Override
           public void write(JsonWriter out, WebhookSubscriptionRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookSubscriptionRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookSubscriptionRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookSubscriptionRead
   * @throws IOException if the JSON string is invalid with respect to WebhookSubscriptionRead
   */
  public static WebhookSubscriptionRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookSubscriptionRead.class);
  }

  /**
   * Convert an instance of WebhookSubscriptionRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

