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
import com.tripartie.safecheckout.model.QuoteAddressWrite;
import java.io.IOException;
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
 * Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-12T16:00:19.220351Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuoteWrite {
  public static final String SERIALIZED_NAME_CAPTCHA = "captcha";
  @SerializedName(SERIALIZED_NAME_CAPTCHA)
  private String captcha;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  private String offer;

  /**
   * Gets or Sets shippingCarrier
   */
  @JsonAdapter(ShippingCarrierEnum.Adapter.class)
  public enum ShippingCarrierEnum {
    SWISS_POST("SwissPost"),
    
    COLISSIMO("Colissimo"),
    
    MONDIAL_RELAY("MondialRelay"),
    
    NULL("null");

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
      return null;
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

  public static final String SERIALIZED_NAME_PICKUP_CODE = "pickupCode";
  @SerializedName(SERIALIZED_NAME_PICKUP_CODE)
  private String pickupCode;

  public static final String SERIALIZED_NAME_QUANTITY_TO_BE_ACQUIRED = "quantityToBeAcquired";
  @SerializedName(SERIALIZED_NAME_QUANTITY_TO_BE_ACQUIRED)
  private Integer quantityToBeAcquired = 1;

  public static final String SERIALIZED_NAME_ATTEMPT_UNIT_PRICE = "attemptUnitPrice";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_UNIT_PRICE)
  private Float attemptUnitPrice;

  public static final String SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_FIRST_NAME = "thirdPartyRecipientFirstName";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_FIRST_NAME)
  private String thirdPartyRecipientFirstName;

  public static final String SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_LAST_NAME = "thirdPartyRecipientLastName";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_LAST_NAME)
  private String thirdPartyRecipientLastName;

  public static final String SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_ADDRESS = "thirdPartyRecipientAddress";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_ADDRESS)
  private QuoteAddressWrite thirdPartyRecipientAddress;

  public QuoteWrite() {
  }

  public QuoteWrite captcha(String captcha) {
    this.captcha = captcha;
    return this;
  }

  /**
   * Get captcha
   * @return captcha
   */
  @javax.annotation.Nullable
  public String getCaptcha() {
    return captcha;
  }

  public void setCaptcha(String captcha) {
    this.captcha = captcha;
  }


  public QuoteWrite offer(String offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @javax.annotation.Nullable
  public String getOffer() {
    return offer;
  }

  public void setOffer(String offer) {
    this.offer = offer;
  }


  public QuoteWrite shippingCarrier(ShippingCarrierEnum shippingCarrier) {
    this.shippingCarrier = shippingCarrier;
    return this;
  }

  /**
   * Get shippingCarrier
   * @return shippingCarrier
   */
  @javax.annotation.Nullable
  public ShippingCarrierEnum getShippingCarrier() {
    return shippingCarrier;
  }

  public void setShippingCarrier(ShippingCarrierEnum shippingCarrier) {
    this.shippingCarrier = shippingCarrier;
  }


  public QuoteWrite pickupCode(String pickupCode) {
    this.pickupCode = pickupCode;
    return this;
  }

  /**
   * Get pickupCode
   * @return pickupCode
   */
  @javax.annotation.Nullable
  public String getPickupCode() {
    return pickupCode;
  }

  public void setPickupCode(String pickupCode) {
    this.pickupCode = pickupCode;
  }


  public QuoteWrite quantityToBeAcquired(Integer quantityToBeAcquired) {
    this.quantityToBeAcquired = quantityToBeAcquired;
    return this;
  }

  /**
   * Get quantityToBeAcquired
   * @return quantityToBeAcquired
   */
  @javax.annotation.Nullable
  public Integer getQuantityToBeAcquired() {
    return quantityToBeAcquired;
  }

  public void setQuantityToBeAcquired(Integer quantityToBeAcquired) {
    this.quantityToBeAcquired = quantityToBeAcquired;
  }


  public QuoteWrite attemptUnitPrice(Float attemptUnitPrice) {
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


  public QuoteWrite thirdPartyRecipientFirstName(String thirdPartyRecipientFirstName) {
    this.thirdPartyRecipientFirstName = thirdPartyRecipientFirstName;
    return this;
  }

  /**
   * Get thirdPartyRecipientFirstName
   * @return thirdPartyRecipientFirstName
   */
  @javax.annotation.Nullable
  public String getThirdPartyRecipientFirstName() {
    return thirdPartyRecipientFirstName;
  }

  public void setThirdPartyRecipientFirstName(String thirdPartyRecipientFirstName) {
    this.thirdPartyRecipientFirstName = thirdPartyRecipientFirstName;
  }


  public QuoteWrite thirdPartyRecipientLastName(String thirdPartyRecipientLastName) {
    this.thirdPartyRecipientLastName = thirdPartyRecipientLastName;
    return this;
  }

  /**
   * Get thirdPartyRecipientLastName
   * @return thirdPartyRecipientLastName
   */
  @javax.annotation.Nullable
  public String getThirdPartyRecipientLastName() {
    return thirdPartyRecipientLastName;
  }

  public void setThirdPartyRecipientLastName(String thirdPartyRecipientLastName) {
    this.thirdPartyRecipientLastName = thirdPartyRecipientLastName;
  }


  public QuoteWrite thirdPartyRecipientAddress(QuoteAddressWrite thirdPartyRecipientAddress) {
    this.thirdPartyRecipientAddress = thirdPartyRecipientAddress;
    return this;
  }

  /**
   * Get thirdPartyRecipientAddress
   * @return thirdPartyRecipientAddress
   */
  @javax.annotation.Nullable
  public QuoteAddressWrite getThirdPartyRecipientAddress() {
    return thirdPartyRecipientAddress;
  }

  public void setThirdPartyRecipientAddress(QuoteAddressWrite thirdPartyRecipientAddress) {
    this.thirdPartyRecipientAddress = thirdPartyRecipientAddress;
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
    sb.append("class QuoteWrite {\n");
    sb.append("    captcha: ").append(toIndentedString(captcha)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    shippingCarrier: ").append(toIndentedString(shippingCarrier)).append("\n");
    sb.append("    pickupCode: ").append(toIndentedString(pickupCode)).append("\n");
    sb.append("    quantityToBeAcquired: ").append(toIndentedString(quantityToBeAcquired)).append("\n");
    sb.append("    attemptUnitPrice: ").append(toIndentedString(attemptUnitPrice)).append("\n");
    sb.append("    thirdPartyRecipientFirstName: ").append(toIndentedString(thirdPartyRecipientFirstName)).append("\n");
    sb.append("    thirdPartyRecipientLastName: ").append(toIndentedString(thirdPartyRecipientLastName)).append("\n");
    sb.append("    thirdPartyRecipientAddress: ").append(toIndentedString(thirdPartyRecipientAddress)).append("\n");
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
    openapiFields.add("captcha");
    openapiFields.add("offer");
    openapiFields.add("shippingCarrier");
    openapiFields.add("pickupCode");
    openapiFields.add("quantityToBeAcquired");
    openapiFields.add("attemptUnitPrice");
    openapiFields.add("thirdPartyRecipientFirstName");
    openapiFields.add("thirdPartyRecipientLastName");
    openapiFields.add("thirdPartyRecipientAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("captcha");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuoteWrite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteWrite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteWrite is not found in the empty JSON string", QuoteWrite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteWrite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteWrite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QuoteWrite.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("captcha") != null && !jsonObj.get("captcha").isJsonNull()) && !jsonObj.get("captcha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `captcha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("captcha").toString()));
      }
      if ((jsonObj.get("offer") != null && !jsonObj.get("offer").isJsonNull()) && !jsonObj.get("offer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer").toString()));
      }
      if ((jsonObj.get("shippingCarrier") != null && !jsonObj.get("shippingCarrier").isJsonNull()) && !jsonObj.get("shippingCarrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingCarrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippingCarrier").toString()));
      }
      // validate the optional field `shippingCarrier`
      if (jsonObj.get("shippingCarrier") != null && !jsonObj.get("shippingCarrier").isJsonNull()) {
        ShippingCarrierEnum.validateJsonElement(jsonObj.get("shippingCarrier"));
      }
      if ((jsonObj.get("pickupCode") != null && !jsonObj.get("pickupCode").isJsonNull()) && !jsonObj.get("pickupCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickupCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickupCode").toString()));
      }
      if ((jsonObj.get("thirdPartyRecipientFirstName") != null && !jsonObj.get("thirdPartyRecipientFirstName").isJsonNull()) && !jsonObj.get("thirdPartyRecipientFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thirdPartyRecipientFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdPartyRecipientFirstName").toString()));
      }
      if ((jsonObj.get("thirdPartyRecipientLastName") != null && !jsonObj.get("thirdPartyRecipientLastName").isJsonNull()) && !jsonObj.get("thirdPartyRecipientLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thirdPartyRecipientLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdPartyRecipientLastName").toString()));
      }
      // validate the optional field `thirdPartyRecipientAddress`
      if (jsonObj.get("thirdPartyRecipientAddress") != null && !jsonObj.get("thirdPartyRecipientAddress").isJsonNull()) {
        QuoteAddressWrite.validateJsonElement(jsonObj.get("thirdPartyRecipientAddress"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteWrite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteWrite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteWrite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteWrite.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteWrite>() {
           @Override
           public void write(JsonWriter out, QuoteWrite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteWrite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuoteWrite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuoteWrite
   * @throws IOException if the JSON string is invalid with respect to QuoteWrite
   */
  public static QuoteWrite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteWrite.class);
  }

  /**
   * Convert an instance of QuoteWrite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

