/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.22
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
 * Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T05:45:47.354544Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuoteUpdate {
  /**
   * Gets or Sets shippingCarrier
   */
  @JsonAdapter(ShippingCarrierEnum.Adapter.class)
  public enum ShippingCarrierEnum {
    SWISS_POST("SwissPost"),
    
    COLISSIMO("Colissimo"),
    
    MONDIAL_RELAY("MondialRelay");

    private String value;

    ShippingCarrierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShippingCarrierEnum fromValue(String value) {
      for (ShippingCarrierEnum b : ShippingCarrierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShippingCarrierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShippingCarrierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShippingCarrierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShippingCarrierEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ShippingCarrierEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SHIPPING_CARRIER = "shippingCarrier";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIER)
  private ShippingCarrierEnum shippingCarrier;

  public static final String SERIALIZED_NAME_QUANTITY_TO_BE_ACQUIRED = "quantityToBeAcquired";
  @SerializedName(SERIALIZED_NAME_QUANTITY_TO_BE_ACQUIRED)
  private Integer quantityToBeAcquired = 1;

  public static final String SERIALIZED_NAME_ATTEMPT_UNIT_PRICE = "attemptUnitPrice";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_UNIT_PRICE)
  private Float attemptUnitPrice;

  public QuoteUpdate() {
  }

  public QuoteUpdate shippingCarrier(ShippingCarrierEnum shippingCarrier) {
    this.shippingCarrier = shippingCarrier;
    return this;
  }

  /**
   * Get shippingCarrier
   * @return shippingCarrier
   */
  @javax.annotation.Nonnull
  public ShippingCarrierEnum getShippingCarrier() {
    return shippingCarrier;
  }

  public void setShippingCarrier(ShippingCarrierEnum shippingCarrier) {
    this.shippingCarrier = shippingCarrier;
  }


  public QuoteUpdate quantityToBeAcquired(Integer quantityToBeAcquired) {
    this.quantityToBeAcquired = quantityToBeAcquired;
    return this;
  }

  /**
   * Get quantityToBeAcquired
   * @return quantityToBeAcquired
   */
  @javax.annotation.Nonnull
  public Integer getQuantityToBeAcquired() {
    return quantityToBeAcquired;
  }

  public void setQuantityToBeAcquired(Integer quantityToBeAcquired) {
    this.quantityToBeAcquired = quantityToBeAcquired;
  }


  public QuoteUpdate attemptUnitPrice(Float attemptUnitPrice) {
    this.attemptUnitPrice = attemptUnitPrice;
    return this;
  }

  /**
   * Get attemptUnitPrice
   * @return attemptUnitPrice
   */
  @javax.annotation.Nullable
  public Float getAttemptUnitPrice() {
    return attemptUnitPrice;
  }

  public void setAttemptUnitPrice(Float attemptUnitPrice) {
    this.attemptUnitPrice = attemptUnitPrice;
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
    sb.append("class QuoteUpdate {\n");
    sb.append("    shippingCarrier: ").append(toIndentedString(shippingCarrier)).append("\n");
    sb.append("    quantityToBeAcquired: ").append(toIndentedString(quantityToBeAcquired)).append("\n");
    sb.append("    attemptUnitPrice: ").append(toIndentedString(attemptUnitPrice)).append("\n");
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
    openapiFields.add("shippingCarrier");
    openapiFields.add("quantityToBeAcquired");
    openapiFields.add("attemptUnitPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shippingCarrier");
    openapiRequiredFields.add("quantityToBeAcquired");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuoteUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteUpdate is not found in the empty JSON string", QuoteUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QuoteUpdate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("shippingCarrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingCarrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippingCarrier").toString()));
      }
      // validate the required field `shippingCarrier`
      ShippingCarrierEnum.validateJsonElement(jsonObj.get("shippingCarrier"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteUpdate>() {
           @Override
           public void write(JsonWriter out, QuoteUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuoteUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuoteUpdate
   * @throws IOException if the JSON string is invalid with respect to QuoteUpdate
   */
  public static QuoteUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteUpdate.class);
  }

  /**
   * Convert an instance of QuoteUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

