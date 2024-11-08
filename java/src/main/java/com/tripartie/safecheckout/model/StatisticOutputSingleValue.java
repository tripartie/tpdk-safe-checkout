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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * StatisticOutputSingleValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T13:50:36.452269Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class StatisticOutputSingleValue {
  /**
   * Gets or Sets request
   */
  @JsonAdapter(RequestEnum.Adapter.class)
  public enum RequestEnum {
    FINALIZED_CASHOUT_AMOUNT("FINALIZED_CASHOUT_AMOUNT"),
    
    FINALIZED_CASHOUT_COUNT("FINALIZED_CASHOUT_COUNT"),
    
    PENDING_CASHOUT_AMOUNT("PENDING_CASHOUT_AMOUNT"),
    
    PENDING_CASHOUT_COUNT("PENDING_CASHOUT_COUNT"),
    
    OFFER_PUBLISHED_AMOUNT("OFFER_PUBLISHED_AMOUNT"),
    
    OFFER_PUBLISHED_COUNT("OFFER_PUBLISHED_COUNT"),
    
    PERSONA_INSERT_COUNT("PERSONA_INSERT_COUNT"),
    
    PERSONA_ORPHAN_COUNT("PERSONA_ORPHAN_COUNT"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT("TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_COUNT("TRANSACTION_ACCEPTED_PROPOSAL_COUNT"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE("TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE("TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE"),
    
    TRANSACTION_CANCELLED_COUNT("TRANSACTION_CANCELLED_COUNT"),
    
    TRANSACTION_COMPLETED_AMOUNT("TRANSACTION_COMPLETED_AMOUNT"),
    
    TRANSACTION_COMPLETED_COUNT("TRANSACTION_COMPLETED_COUNT"),
    
    TRANSACTION_COMPLETED_SERVICE_FEE("TRANSACTION_COMPLETED_SERVICE_FEE"),
    
    TRANSACTION_COMPLETED_SHIPPING_FEE("TRANSACTION_COMPLETED_SHIPPING_FEE"),
    
    TRANSACTION_DISPUTED_COUNT("TRANSACTION_DISPUTED_COUNT"),
    
    TRANSACTION_CREATED_AMOUNT("TRANSACTION_CREATED_AMOUNT"),
    
    TRANSACTION_CREATED_COUNT("TRANSACTION_CREATED_COUNT"),
    
    TRANSACTION_BUYER_RATING_AVERAGE("TRANSACTION_BUYER_RATING_AVERAGE"),
    
    USER_REGISTRATION_COUNT("USER_REGISTRATION_COUNT"),
    
    TRANSACTION_SELLER_RATING_AVERAGE("TRANSACTION_SELLER_RATING_AVERAGE"),
    
    WALLET_AVAILABLE_AMOUNT("WALLET_AVAILABLE_AMOUNT"),
    
    WALLET_IN_CUSTODY_AMOUNT("WALLET_IN_CUSTODY_AMOUNT");

    private String value;

    RequestEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequestEnum fromValue(String value) {
      for (RequestEnum b : RequestEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequestEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequestEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequestEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RequestEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RequestEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private RequestEnum request;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private OffsetDateTime startAt;

  public static final String SERIALIZED_NAME_END_AT = "endAt";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private OffsetDateTime endAt;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public StatisticOutputSingleValue() {
  }

  public StatisticOutputSingleValue request(RequestEnum request) {
    this.request = request;
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @javax.annotation.Nonnull
  public RequestEnum getRequest() {
    return request;
  }

  public void setRequest(RequestEnum request) {
    this.request = request;
  }


  public StatisticOutputSingleValue startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * Get startAt
   * @return startAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }


  public StatisticOutputSingleValue endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * Get endAt
   * @return endAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }


  public StatisticOutputSingleValue value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nonnull
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticOutputSingleValue {\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("request");
    openapiFields.add("startAt");
    openapiFields.add("endAt");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("request");
    openapiRequiredFields.add("startAt");
    openapiRequiredFields.add("endAt");
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StatisticOutputSingleValue
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StatisticOutputSingleValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatisticOutputSingleValue is not found in the empty JSON string", StatisticOutputSingleValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StatisticOutputSingleValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatisticOutputSingleValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatisticOutputSingleValue.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
      // validate the required field `request`
      RequestEnum.validateJsonElement(jsonObj.get("request"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatisticOutputSingleValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatisticOutputSingleValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatisticOutputSingleValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatisticOutputSingleValue.class));

       return (TypeAdapter<T>) new TypeAdapter<StatisticOutputSingleValue>() {
           @Override
           public void write(JsonWriter out, StatisticOutputSingleValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatisticOutputSingleValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StatisticOutputSingleValue given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StatisticOutputSingleValue
   * @throws IOException if the JSON string is invalid with respect to StatisticOutputSingleValue
   */
  public static StatisticOutputSingleValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatisticOutputSingleValue.class);
  }

  /**
   * Convert an instance of StatisticOutputSingleValue to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

