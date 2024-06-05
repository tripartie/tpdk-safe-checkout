/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.10
 * Contact: noc@tripartie.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tripartie.safecheckout.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.tripartie.safecheckout.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T11:47:14.680054Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class WebhookHistoryRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

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
    
    PERSONA_ADDED("persona.added");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_NORMALIZED_OBJECT = "normalizedObject";
  @SerializedName(SERIALIZED_NAME_NORMALIZED_OBJECT)
  private List<String> normalizedObject = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private Integer responseCode;

  public static final String SERIALIZED_NAME_RESPONSE_BODY = "responseBody";
  @SerializedName(SERIALIZED_NAME_RESPONSE_BODY)
  private String responseBody;

  public static final String SERIALIZED_NAME_OCCURRED_AT = "occurredAt";
  @SerializedName(SERIALIZED_NAME_OCCURRED_AT)
  private OffsetDateTime occurredAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ATTEMPTED_AT = "attemptedAt";
  @SerializedName(SERIALIZED_NAME_ATTEMPTED_AT)
  private OffsetDateTime attemptedAt;

  public static final String SERIALIZED_NAME_RETRY_COUNT = "retryCount";
  @SerializedName(SERIALIZED_NAME_RETRY_COUNT)
  private Integer retryCount;

  public static final String SERIALIZED_NAME_IN_PROGRESS = "inProgress";
  @SerializedName(SERIALIZED_NAME_IN_PROGRESS)
  private Boolean inProgress;

  public WebhookHistoryRead() {
  }

  public WebhookHistoryRead(
     Integer id, 
     OffsetDateTime createdAt, 
     OffsetDateTime attemptedAt, 
     Boolean inProgress
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.attemptedAt = attemptedAt;
    this.inProgress = inProgress;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }



  public WebhookHistoryRead objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public WebhookHistoryRead event(EventEnum event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nonnull
  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }


  public WebhookHistoryRead url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookHistoryRead normalizedObject(List<String> normalizedObject) {
    this.normalizedObject = normalizedObject;
    return this;
  }

  public WebhookHistoryRead addNormalizedObjectItem(String normalizedObjectItem) {
    if (this.normalizedObject == null) {
      this.normalizedObject = new ArrayList<>();
    }
    this.normalizedObject.add(normalizedObjectItem);
    return this;
  }

   /**
   * Get normalizedObject
   * @return normalizedObject
  **/
  @javax.annotation.Nullable
  public List<String> getNormalizedObject() {
    return normalizedObject;
  }

  public void setNormalizedObject(List<String> normalizedObject) {
    this.normalizedObject = normalizedObject;
  }


  public WebhookHistoryRead responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @javax.annotation.Nullable
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }


  public WebhookHistoryRead responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Get responseBody
   * @return responseBody
  **/
  @javax.annotation.Nullable
  public String getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }


  public WebhookHistoryRead occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * Get occurredAt
   * @return occurredAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



   /**
   * Get attemptedAt
   * @return attemptedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getAttemptedAt() {
    return attemptedAt;
  }



  public WebhookHistoryRead retryCount(Integer retryCount) {
    this.retryCount = retryCount;
    return this;
  }

   /**
   * Get retryCount
   * @return retryCount
  **/
  @javax.annotation.Nonnull
  public Integer getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }


   /**
   * Get inProgress
   * @return inProgress
  **/
  @javax.annotation.Nullable
  public Boolean getInProgress() {
    return inProgress;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookHistoryRead webhookHistoryRead = (WebhookHistoryRead) o;
    return Objects.equals(this.id, webhookHistoryRead.id) &&
        Objects.equals(this.objectId, webhookHistoryRead.objectId) &&
        Objects.equals(this.event, webhookHistoryRead.event) &&
        Objects.equals(this.url, webhookHistoryRead.url) &&
        Objects.equals(this.normalizedObject, webhookHistoryRead.normalizedObject) &&
        Objects.equals(this.responseCode, webhookHistoryRead.responseCode) &&
        Objects.equals(this.responseBody, webhookHistoryRead.responseBody) &&
        Objects.equals(this.occurredAt, webhookHistoryRead.occurredAt) &&
        Objects.equals(this.createdAt, webhookHistoryRead.createdAt) &&
        Objects.equals(this.attemptedAt, webhookHistoryRead.attemptedAt) &&
        Objects.equals(this.retryCount, webhookHistoryRead.retryCount) &&
        Objects.equals(this.inProgress, webhookHistoryRead.inProgress);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, objectId, event, url, normalizedObject, responseCode, responseBody, occurredAt, createdAt, attemptedAt, retryCount, inProgress);
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
    sb.append("class WebhookHistoryRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    normalizedObject: ").append(toIndentedString(normalizedObject)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    attemptedAt: ").append(toIndentedString(attemptedAt)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
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
    openapiFields.add("objectId");
    openapiFields.add("event");
    openapiFields.add("url");
    openapiFields.add("normalizedObject");
    openapiFields.add("responseCode");
    openapiFields.add("responseBody");
    openapiFields.add("occurredAt");
    openapiFields.add("createdAt");
    openapiFields.add("attemptedAt");
    openapiFields.add("retryCount");
    openapiFields.add("inProgress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("occurredAt");
    openapiRequiredFields.add("retryCount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebhookHistoryRead
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookHistoryRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookHistoryRead is not found in the empty JSON string", WebhookHistoryRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookHistoryRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookHistoryRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookHistoryRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("objectId") != null && !jsonObj.get("objectId").isJsonNull()) && !jsonObj.get("objectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectId").toString()));
      }
      if (!jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      // validate the required field `event`
      EventEnum.validateJsonElement(jsonObj.get("event"));
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("normalizedObject") != null && !jsonObj.get("normalizedObject").isJsonNull() && !jsonObj.get("normalizedObject").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `normalizedObject` to be an array in the JSON string but got `%s`", jsonObj.get("normalizedObject").toString()));
      }
      if ((jsonObj.get("responseBody") != null && !jsonObj.get("responseBody").isJsonNull()) && !jsonObj.get("responseBody").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseBody` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseBody").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookHistoryRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookHistoryRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookHistoryRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookHistoryRead.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookHistoryRead>() {
           @Override
           public void write(JsonWriter out, WebhookHistoryRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookHistoryRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookHistoryRead given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookHistoryRead
  * @throws IOException if the JSON string is invalid with respect to WebhookHistoryRead
  */
  public static WebhookHistoryRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookHistoryRead.class);
  }

 /**
  * Convert an instance of WebhookHistoryRead to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

