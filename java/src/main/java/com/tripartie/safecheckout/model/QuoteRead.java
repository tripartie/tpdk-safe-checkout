/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.58
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
import com.tripartie.safecheckout.model.QuoteAddressRead;
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
 * Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-08T10:09:44.972040Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuoteRead {
  public static final String SERIALIZED_NAME_ULID = "ulid";
  @SerializedName(SERIALIZED_NAME_ULID)
  private String ulid;

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

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency = "EUR";

  public static final String SERIALIZED_NAME_ORIGINAL_UNIT_PRICE = "originalUnitPrice";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_UNIT_PRICE)
  private Float originalUnitPrice;

  public static final String SERIALIZED_NAME_ORIGINAL_UNIT_PRICE_UNCONVERTED = "originalUnitPriceUnconverted";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_UNIT_PRICE_UNCONVERTED)
  private Float originalUnitPriceUnconverted;

  public static final String SERIALIZED_NAME_TRANSACTION_FEES = "transactionFees";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_FEES)
  private Float transactionFees;

  public static final String SERIALIZED_NAME_SHIPPING_FEES = "shippingFees";
  @SerializedName(SERIALIZED_NAME_SHIPPING_FEES)
  private Float shippingFees;

  public static final String SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_FIRST_NAME = "thirdPartyRecipientFirstName";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_FIRST_NAME)
  private String thirdPartyRecipientFirstName;

  public static final String SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_LAST_NAME = "thirdPartyRecipientLastName";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_LAST_NAME)
  private String thirdPartyRecipientLastName;

  public static final String SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_ADDRESS = "thirdPartyRecipientAddress";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_RECIPIENT_ADDRESS)
  private QuoteAddressRead thirdPartyRecipientAddress;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_EXPIRE_AT = "expireAt";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AT)
  private OffsetDateTime expireAt;

  public static final String SERIALIZED_NAME_IRI = "iri";
  @SerializedName(SERIALIZED_NAME_IRI)
  private String iri;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_BUYER_TOTAL = "buyerTotal";
  @SerializedName(SERIALIZED_NAME_BUYER_TOTAL)
  private BigDecimal buyerTotal;

  public static final String SERIALIZED_NAME_SELLER_TOTAL = "sellerTotal";
  @SerializedName(SERIALIZED_NAME_SELLER_TOTAL)
  private BigDecimal sellerTotal;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE = "exchangeRate";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE)
  private BigDecimal exchangeRate;

  public QuoteRead() {
  }

  public QuoteRead(
     String iri, 
     BigDecimal unitPrice, 
     BigDecimal price, 
     BigDecimal buyerTotal, 
     BigDecimal sellerTotal, 
     BigDecimal exchangeRate
  ) {
    this();
    this.iri = iri;
    this.unitPrice = unitPrice;
    this.price = price;
    this.buyerTotal = buyerTotal;
    this.sellerTotal = sellerTotal;
    this.exchangeRate = exchangeRate;
  }

  public QuoteRead ulid(String ulid) {
    this.ulid = ulid;
    return this;
  }

  /**
   * Get ulid
   * @return ulid
   */
  @javax.annotation.Nullable
  public String getUlid() {
    return ulid;
  }

  public void setUlid(String ulid) {
    this.ulid = ulid;
  }


  public QuoteRead shippingCarrier(ShippingCarrierEnum shippingCarrier) {
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


  public QuoteRead pickupCode(String pickupCode) {
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


  public QuoteRead quantityToBeAcquired(Integer quantityToBeAcquired) {
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


  public QuoteRead attemptUnitPrice(Float attemptUnitPrice) {
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


  public QuoteRead currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Expect &#39;EUR&#39; only for now.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public QuoteRead originalUnitPrice(Float originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
    return this;
  }

  /**
   * Get originalUnitPrice
   * @return originalUnitPrice
   */
  @javax.annotation.Nullable
  public Float getOriginalUnitPrice() {
    return originalUnitPrice;
  }

  public void setOriginalUnitPrice(Float originalUnitPrice) {
    this.originalUnitPrice = originalUnitPrice;
  }


  public QuoteRead originalUnitPriceUnconverted(Float originalUnitPriceUnconverted) {
    this.originalUnitPriceUnconverted = originalUnitPriceUnconverted;
    return this;
  }

  /**
   * Get originalUnitPriceUnconverted
   * @return originalUnitPriceUnconverted
   */
  @javax.annotation.Nullable
  public Float getOriginalUnitPriceUnconverted() {
    return originalUnitPriceUnconverted;
  }

  public void setOriginalUnitPriceUnconverted(Float originalUnitPriceUnconverted) {
    this.originalUnitPriceUnconverted = originalUnitPriceUnconverted;
  }


  public QuoteRead transactionFees(Float transactionFees) {
    this.transactionFees = transactionFees;
    return this;
  }

  /**
   * Get transactionFees
   * @return transactionFees
   */
  @javax.annotation.Nullable
  public Float getTransactionFees() {
    return transactionFees;
  }

  public void setTransactionFees(Float transactionFees) {
    this.transactionFees = transactionFees;
  }


  public QuoteRead shippingFees(Float shippingFees) {
    this.shippingFees = shippingFees;
    return this;
  }

  /**
   * Get shippingFees
   * @return shippingFees
   */
  @javax.annotation.Nullable
  public Float getShippingFees() {
    return shippingFees;
  }

  public void setShippingFees(Float shippingFees) {
    this.shippingFees = shippingFees;
  }


  public QuoteRead thirdPartyRecipientFirstName(String thirdPartyRecipientFirstName) {
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


  public QuoteRead thirdPartyRecipientLastName(String thirdPartyRecipientLastName) {
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


  public QuoteRead thirdPartyRecipientAddress(QuoteAddressRead thirdPartyRecipientAddress) {
    this.thirdPartyRecipientAddress = thirdPartyRecipientAddress;
    return this;
  }

  /**
   * Get thirdPartyRecipientAddress
   * @return thirdPartyRecipientAddress
   */
  @javax.annotation.Nullable
  public QuoteAddressRead getThirdPartyRecipientAddress() {
    return thirdPartyRecipientAddress;
  }

  public void setThirdPartyRecipientAddress(QuoteAddressRead thirdPartyRecipientAddress) {
    this.thirdPartyRecipientAddress = thirdPartyRecipientAddress;
  }


  public QuoteRead createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public QuoteRead expireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  /**
   * Get expireAt
   * @return expireAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Get iri
   * @return iri
   */
  @javax.annotation.Nullable
  public String getIri() {
    return iri;
  }



  /**
   * Get unitPrice
   * @return unitPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }



  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }



  /**
   * The buyer pays for:  - A) item  - B) shipping (optional)  - C) fees     (optional) This method sum them automatically.
   * @return buyerTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getBuyerTotal() {
    return buyerTotal;
  }



  /**
   * Represent what amount is to be expected released to the seller.
   * @return sellerTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getSellerTotal() {
    return sellerTotal;
  }



  /**
   * Exchange rate, if applicable. Between the offer currency and actual charged currency.
   * @return exchangeRate
   */
  @javax.annotation.Nullable
  public BigDecimal getExchangeRate() {
    return exchangeRate;
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
    sb.append("class QuoteRead {\n");
    sb.append("    ulid: ").append(toIndentedString(ulid)).append("\n");
    sb.append("    shippingCarrier: ").append(toIndentedString(shippingCarrier)).append("\n");
    sb.append("    pickupCode: ").append(toIndentedString(pickupCode)).append("\n");
    sb.append("    quantityToBeAcquired: ").append(toIndentedString(quantityToBeAcquired)).append("\n");
    sb.append("    attemptUnitPrice: ").append(toIndentedString(attemptUnitPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    originalUnitPrice: ").append(toIndentedString(originalUnitPrice)).append("\n");
    sb.append("    originalUnitPriceUnconverted: ").append(toIndentedString(originalUnitPriceUnconverted)).append("\n");
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    shippingFees: ").append(toIndentedString(shippingFees)).append("\n");
    sb.append("    thirdPartyRecipientFirstName: ").append(toIndentedString(thirdPartyRecipientFirstName)).append("\n");
    sb.append("    thirdPartyRecipientLastName: ").append(toIndentedString(thirdPartyRecipientLastName)).append("\n");
    sb.append("    thirdPartyRecipientAddress: ").append(toIndentedString(thirdPartyRecipientAddress)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    iri: ").append(toIndentedString(iri)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    buyerTotal: ").append(toIndentedString(buyerTotal)).append("\n");
    sb.append("    sellerTotal: ").append(toIndentedString(sellerTotal)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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
    openapiFields.add("ulid");
    openapiFields.add("shippingCarrier");
    openapiFields.add("pickupCode");
    openapiFields.add("quantityToBeAcquired");
    openapiFields.add("attemptUnitPrice");
    openapiFields.add("currency");
    openapiFields.add("originalUnitPrice");
    openapiFields.add("originalUnitPriceUnconverted");
    openapiFields.add("transactionFees");
    openapiFields.add("shippingFees");
    openapiFields.add("thirdPartyRecipientFirstName");
    openapiFields.add("thirdPartyRecipientLastName");
    openapiFields.add("thirdPartyRecipientAddress");
    openapiFields.add("createdAt");
    openapiFields.add("expireAt");
    openapiFields.add("iri");
    openapiFields.add("unitPrice");
    openapiFields.add("price");
    openapiFields.add("buyerTotal");
    openapiFields.add("sellerTotal");
    openapiFields.add("exchangeRate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuoteRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteRead is not found in the empty JSON string", QuoteRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ulid") != null && !jsonObj.get("ulid").isJsonNull()) && !jsonObj.get("ulid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ulid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ulid").toString()));
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
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("thirdPartyRecipientFirstName") != null && !jsonObj.get("thirdPartyRecipientFirstName").isJsonNull()) && !jsonObj.get("thirdPartyRecipientFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thirdPartyRecipientFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdPartyRecipientFirstName").toString()));
      }
      if ((jsonObj.get("thirdPartyRecipientLastName") != null && !jsonObj.get("thirdPartyRecipientLastName").isJsonNull()) && !jsonObj.get("thirdPartyRecipientLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thirdPartyRecipientLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdPartyRecipientLastName").toString()));
      }
      // validate the optional field `thirdPartyRecipientAddress`
      if (jsonObj.get("thirdPartyRecipientAddress") != null && !jsonObj.get("thirdPartyRecipientAddress").isJsonNull()) {
        QuoteAddressRead.validateJsonElement(jsonObj.get("thirdPartyRecipientAddress"));
      }
      if ((jsonObj.get("iri") != null && !jsonObj.get("iri").isJsonNull()) && !jsonObj.get("iri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteRead.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteRead>() {
           @Override
           public void write(JsonWriter out, QuoteRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuoteRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuoteRead
   * @throws IOException if the JSON string is invalid with respect to QuoteRead
   */
  public static QuoteRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteRead.class);
  }

  /**
   * Convert an instance of QuoteRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

