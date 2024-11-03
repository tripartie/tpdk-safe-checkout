/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.98
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T09:25:22.430485Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TransactionParcelRead {
  /**
   * Gets or Sets carrier
   */
  @JsonAdapter(CarrierEnum.Adapter.class)
  public enum CarrierEnum {
    SWISS_POST("SwissPost"),
    
    COLISSIMO("Colissimo"),
    
    MONDIAL_RELAY("MondialRelay");

    private String value;

    CarrierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CarrierEnum fromValue(String value) {
      for (CarrierEnum b : CarrierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CarrierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CarrierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CarrierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CarrierEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CarrierEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private CarrierEnum carrier;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency = "EUR";

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    SHIPPED("SHIPPED"),
    
    IN_TRANSIT("IN_TRANSIT"),
    
    DELIVERED("DELIVERED"),
    
    ERROR("ERROR"),
    
    ACCEPTED("ACCEPTED"),
    
    REFUSED("REFUSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_LABEL_PUBLIC_URL = "labelPublicUrl";
  @SerializedName(SERIALIZED_NAME_LABEL_PUBLIC_URL)
  private String labelPublicUrl;

  public static final String SERIALIZED_NAME_TRACKING_PUBLIC_URL = "trackingPublicUrl";
  @SerializedName(SERIALIZED_NAME_TRACKING_PUBLIC_URL)
  private String trackingPublicUrl;

  public static final String SERIALIZED_NAME_HISTORICAL_RECIPIENT_ADDRESS = "historicalRecipientAddress";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_RECIPIENT_ADDRESS)
  private String historicalRecipientAddress;

  public static final String SERIALIZED_NAME_HISTORICAL_SENDER_ADDRESS = "historicalSenderAddress";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SENDER_ADDRESS)
  private String historicalSenderAddress;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public TransactionParcelRead() {
  }

  public TransactionParcelRead(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public TransactionParcelRead carrier(CarrierEnum carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Get carrier
   * @return carrier
   */
  @javax.annotation.Nonnull
  public CarrierEnum getCarrier() {
    return carrier;
  }

  public void setCarrier(CarrierEnum carrier) {
    this.carrier = carrier;
  }


  public TransactionParcelRead identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   */
  @javax.annotation.Nonnull
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public TransactionParcelRead price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * minimum: 0
   * @return price
   */
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public TransactionParcelRead currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TransactionParcelRead status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransactionParcelRead labelPublicUrl(String labelPublicUrl) {
    this.labelPublicUrl = labelPublicUrl;
    return this;
  }

  /**
   * Get labelPublicUrl
   * @return labelPublicUrl
   */
  @javax.annotation.Nullable
  public String getLabelPublicUrl() {
    return labelPublicUrl;
  }

  public void setLabelPublicUrl(String labelPublicUrl) {
    this.labelPublicUrl = labelPublicUrl;
  }


  public TransactionParcelRead trackingPublicUrl(String trackingPublicUrl) {
    this.trackingPublicUrl = trackingPublicUrl;
    return this;
  }

  /**
   * Get trackingPublicUrl
   * @return trackingPublicUrl
   */
  @javax.annotation.Nullable
  public String getTrackingPublicUrl() {
    return trackingPublicUrl;
  }

  public void setTrackingPublicUrl(String trackingPublicUrl) {
    this.trackingPublicUrl = trackingPublicUrl;
  }


  public TransactionParcelRead historicalRecipientAddress(String historicalRecipientAddress) {
    this.historicalRecipientAddress = historicalRecipientAddress;
    return this;
  }

  /**
   * Get historicalRecipientAddress
   * @return historicalRecipientAddress
   */
  @javax.annotation.Nullable
  public String getHistoricalRecipientAddress() {
    return historicalRecipientAddress;
  }

  public void setHistoricalRecipientAddress(String historicalRecipientAddress) {
    this.historicalRecipientAddress = historicalRecipientAddress;
  }


  public TransactionParcelRead historicalSenderAddress(String historicalSenderAddress) {
    this.historicalSenderAddress = historicalSenderAddress;
    return this;
  }

  /**
   * Get historicalSenderAddress
   * @return historicalSenderAddress
   */
  @javax.annotation.Nullable
  public String getHistoricalSenderAddress() {
    return historicalSenderAddress;
  }

  public void setHistoricalSenderAddress(String historicalSenderAddress) {
    this.historicalSenderAddress = historicalSenderAddress;
  }


  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
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
    sb.append("class TransactionParcelRead {\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    labelPublicUrl: ").append(toIndentedString(labelPublicUrl)).append("\n");
    sb.append("    trackingPublicUrl: ").append(toIndentedString(trackingPublicUrl)).append("\n");
    sb.append("    historicalRecipientAddress: ").append(toIndentedString(historicalRecipientAddress)).append("\n");
    sb.append("    historicalSenderAddress: ").append(toIndentedString(historicalSenderAddress)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("carrier");
    openapiFields.add("identifier");
    openapiFields.add("price");
    openapiFields.add("currency");
    openapiFields.add("status");
    openapiFields.add("labelPublicUrl");
    openapiFields.add("trackingPublicUrl");
    openapiFields.add("historicalRecipientAddress");
    openapiFields.add("historicalSenderAddress");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("carrier");
    openapiRequiredFields.add("identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionParcelRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionParcelRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionParcelRead is not found in the empty JSON string", TransactionParcelRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionParcelRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionParcelRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionParcelRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("carrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier").toString()));
      }
      // validate the required field `carrier`
      CarrierEnum.validateJsonElement(jsonObj.get("carrier"));
      if (!jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("labelPublicUrl") != null && !jsonObj.get("labelPublicUrl").isJsonNull()) && !jsonObj.get("labelPublicUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `labelPublicUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("labelPublicUrl").toString()));
      }
      if ((jsonObj.get("trackingPublicUrl") != null && !jsonObj.get("trackingPublicUrl").isJsonNull()) && !jsonObj.get("trackingPublicUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingPublicUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingPublicUrl").toString()));
      }
      if ((jsonObj.get("historicalRecipientAddress") != null && !jsonObj.get("historicalRecipientAddress").isJsonNull()) && !jsonObj.get("historicalRecipientAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `historicalRecipientAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("historicalRecipientAddress").toString()));
      }
      if ((jsonObj.get("historicalSenderAddress") != null && !jsonObj.get("historicalSenderAddress").isJsonNull()) && !jsonObj.get("historicalSenderAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `historicalSenderAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("historicalSenderAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionParcelRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionParcelRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionParcelRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionParcelRead.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionParcelRead>() {
           @Override
           public void write(JsonWriter out, TransactionParcelRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionParcelRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionParcelRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionParcelRead
   * @throws IOException if the JSON string is invalid with respect to TransactionParcelRead
   */
  public static TransactionParcelRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionParcelRead.class);
  }

  /**
   * Convert an instance of TransactionParcelRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

