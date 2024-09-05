/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.45
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
import java.util.LinkedHashSet;
import java.util.Set;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-05T14:34:11.507887Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferSoloWrite {
  public static final String SERIALIZED_NAME_CAPTCHA = "captcha";
  @SerializedName(SERIALIZED_NAME_CAPTCHA)
  private String captcha;

  /**
   * This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information.
   */
  @JsonAdapter(NatureEnum.Adapter.class)
  public enum NatureEnum {
    SERVICE("service"),
    
    PHYSICAL_ITEM("physical_item"),
    
    DEMATERIALIZED_ITEM("dematerialized_item"),
    
    RENT_ITEM("rent_item");

    private String value;

    NatureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NatureEnum fromValue(String value) {
      for (NatureEnum b : NatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NatureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NatureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NatureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NatureEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NatureEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NATURE = "nature";
  @SerializedName(SERIALIZED_NAME_NATURE)
  private NatureEnum nature = NatureEnum.PHYSICAL_ITEM;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Float unitPrice;

  public static final String SERIALIZED_NAME_MIN_NEGOTIABLE_UNIT_PRICE = "minNegotiableUnitPrice";
  @SerializedName(SERIALIZED_NAME_MIN_NEGOTIABLE_UNIT_PRICE)
  private Float minNegotiableUnitPrice;

  public static final String SERIALIZED_NAME_ALLOW_TO_NEGOTIATE_UNIT_PRICE = "allowToNegotiateUnitPrice";
  @SerializedName(SERIALIZED_NAME_ALLOW_TO_NEGOTIATE_UNIT_PRICE)
  private Boolean allowToNegotiateUnitPrice;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode = "EUR";

  public static final String SERIALIZED_NAME_ITEM_COUNT = "itemCount";
  @SerializedName(SERIALIZED_NAME_ITEM_COUNT)
  private Integer itemCount = 1;

  /**
   * Gets or Sets condition
   */
  @JsonAdapter(ConditionEnum.Adapter.class)
  public enum ConditionEnum {
    NEW("NEW"),
    
    USED("USED"),
    
    DAMAGED("DAMAGED"),
    
    DETERIORATED("DETERIORATED"),
    
    UNRECOVERABLE("UNRECOVERABLE");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionEnum fromValue(String value) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConditionEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ConditionEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private ConditionEnum condition = ConditionEnum.USED;

  public static final String SERIALIZED_NAME_WEIGHT_IN_GRAM = "weightInGram";
  @SerializedName(SERIALIZED_NAME_WEIGHT_IN_GRAM)
  private Integer weightInGram;

  public static final String SERIALIZED_NAME_SHIPPING_ALLOWED = "shippingAllowed";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ALLOWED)
  private Boolean shippingAllowed;

  public static final String SERIALIZED_NAME_HAND_DELIVERY_ALLOWED = "handDeliveryAllowed";
  @SerializedName(SERIALIZED_NAME_HAND_DELIVERY_ALLOWED)
  private Boolean handDeliveryAllowed = true;

  /**
   * Gets or Sets shippingCarriers
   */
  @JsonAdapter(ShippingCarriersEnum.Adapter.class)
  public enum ShippingCarriersEnum {
    SWISS_POST("SwissPost"),
    
    COLISSIMO("Colissimo"),
    
    MONDIAL_RELAY("MondialRelay");

    private String value;

    ShippingCarriersEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShippingCarriersEnum fromValue(String value) {
      for (ShippingCarriersEnum b : ShippingCarriersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShippingCarriersEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShippingCarriersEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShippingCarriersEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShippingCarriersEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ShippingCarriersEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SHIPPING_CARRIERS = "shippingCarriers";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CARRIERS)
  private Set<ShippingCarriersEnum> shippingCarriers = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_CAN_BE_SOLD_SEPARATELY = "canBeSoldSeparately";
  @SerializedName(SERIALIZED_NAME_CAN_BE_SOLD_SEPARATELY)
  private Boolean canBeSoldSeparately = true;

  public OfferSoloWrite() {
  }

  public OfferSoloWrite captcha(String captcha) {
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


  public OfferSoloWrite nature(NatureEnum nature) {
    this.nature = nature;
    return this;
  }

  /**
   * This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information.
   * @return nature
   */
  @javax.annotation.Nullable
  public NatureEnum getNature() {
    return nature;
  }

  public void setNature(NatureEnum nature) {
    this.nature = nature;
  }


  public OfferSoloWrite title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public OfferSoloWrite description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public OfferSoloWrite unitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
   */
  @javax.annotation.Nullable
  public Float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OfferSoloWrite minNegotiableUnitPrice(Float minNegotiableUnitPrice) {
    this.minNegotiableUnitPrice = minNegotiableUnitPrice;
    return this;
  }

  /**
   * Get minNegotiableUnitPrice
   * @return minNegotiableUnitPrice
   */
  @javax.annotation.Nullable
  public Float getMinNegotiableUnitPrice() {
    return minNegotiableUnitPrice;
  }

  public void setMinNegotiableUnitPrice(Float minNegotiableUnitPrice) {
    this.minNegotiableUnitPrice = minNegotiableUnitPrice;
  }


  public OfferSoloWrite allowToNegotiateUnitPrice(Boolean allowToNegotiateUnitPrice) {
    this.allowToNegotiateUnitPrice = allowToNegotiateUnitPrice;
    return this;
  }

  /**
   * Get allowToNegotiateUnitPrice
   * @return allowToNegotiateUnitPrice
   */
  @javax.annotation.Nonnull
  public Boolean getAllowToNegotiateUnitPrice() {
    return allowToNegotiateUnitPrice;
  }

  public void setAllowToNegotiateUnitPrice(Boolean allowToNegotiateUnitPrice) {
    this.allowToNegotiateUnitPrice = allowToNegotiateUnitPrice;
  }


  public OfferSoloWrite currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public OfferSoloWrite itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Get itemCount
   * @return itemCount
   */
  @javax.annotation.Nullable
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  public OfferSoloWrite condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @javax.annotation.Nullable
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }


  public OfferSoloWrite weightInGram(Integer weightInGram) {
    this.weightInGram = weightInGram;
    return this;
  }

  /**
   * Accepted values between 500g (0.5kg) and 10,000g (10kg).
   * minimum: 500
   * maximum: 10000
   * @return weightInGram
   */
  @javax.annotation.Nullable
  public Integer getWeightInGram() {
    return weightInGram;
  }

  public void setWeightInGram(Integer weightInGram) {
    this.weightInGram = weightInGram;
  }


  public OfferSoloWrite shippingAllowed(Boolean shippingAllowed) {
    this.shippingAllowed = shippingAllowed;
    return this;
  }

  /**
   * That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined.
   * @return shippingAllowed
   */
  @javax.annotation.Nullable
  public Boolean getShippingAllowed() {
    return shippingAllowed;
  }

  public void setShippingAllowed(Boolean shippingAllowed) {
    this.shippingAllowed = shippingAllowed;
  }


  public OfferSoloWrite handDeliveryAllowed(Boolean handDeliveryAllowed) {
    this.handDeliveryAllowed = handDeliveryAllowed;
    return this;
  }

  /**
   * Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product.
   * @return handDeliveryAllowed
   */
  @javax.annotation.Nullable
  public Boolean getHandDeliveryAllowed() {
    return handDeliveryAllowed;
  }

  public void setHandDeliveryAllowed(Boolean handDeliveryAllowed) {
    this.handDeliveryAllowed = handDeliveryAllowed;
  }


  public OfferSoloWrite shippingCarriers(Set<ShippingCarriersEnum> shippingCarriers) {
    this.shippingCarriers = shippingCarriers;
    return this;
  }

  public OfferSoloWrite addShippingCarriersItem(ShippingCarriersEnum shippingCarriersItem) {
    if (this.shippingCarriers == null) {
      this.shippingCarriers = new LinkedHashSet<>();
    }
    this.shippingCarriers.add(shippingCarriersItem);
    return this;
  }

  /**
   * If you wish to enable automated shipping label generation through a specific provider, specify it there.
   * @return shippingCarriers
   */
  @javax.annotation.Nullable
  public Set<ShippingCarriersEnum> getShippingCarriers() {
    return shippingCarriers;
  }

  public void setShippingCarriers(Set<ShippingCarriersEnum> shippingCarriers) {
    this.shippingCarriers = shippingCarriers;
  }


  public OfferSoloWrite canBeSoldSeparately(Boolean canBeSoldSeparately) {
    this.canBeSoldSeparately = canBeSoldSeparately;
    return this;
  }

  /**
   * Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s)
   * @return canBeSoldSeparately
   */
  @javax.annotation.Nullable
  public Boolean getCanBeSoldSeparately() {
    return canBeSoldSeparately;
  }

  public void setCanBeSoldSeparately(Boolean canBeSoldSeparately) {
    this.canBeSoldSeparately = canBeSoldSeparately;
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
    sb.append("class OfferSoloWrite {\n");
    sb.append("    captcha: ").append(toIndentedString(captcha)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    minNegotiableUnitPrice: ").append(toIndentedString(minNegotiableUnitPrice)).append("\n");
    sb.append("    allowToNegotiateUnitPrice: ").append(toIndentedString(allowToNegotiateUnitPrice)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    weightInGram: ").append(toIndentedString(weightInGram)).append("\n");
    sb.append("    shippingAllowed: ").append(toIndentedString(shippingAllowed)).append("\n");
    sb.append("    handDeliveryAllowed: ").append(toIndentedString(handDeliveryAllowed)).append("\n");
    sb.append("    shippingCarriers: ").append(toIndentedString(shippingCarriers)).append("\n");
    sb.append("    canBeSoldSeparately: ").append(toIndentedString(canBeSoldSeparately)).append("\n");
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
    openapiFields.add("nature");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("unitPrice");
    openapiFields.add("minNegotiableUnitPrice");
    openapiFields.add("allowToNegotiateUnitPrice");
    openapiFields.add("currencyCode");
    openapiFields.add("itemCount");
    openapiFields.add("condition");
    openapiFields.add("weightInGram");
    openapiFields.add("shippingAllowed");
    openapiFields.add("handDeliveryAllowed");
    openapiFields.add("shippingCarriers");
    openapiFields.add("canBeSoldSeparately");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("captcha");
    openapiRequiredFields.add("allowToNegotiateUnitPrice");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OfferSoloWrite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferSoloWrite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferSoloWrite is not found in the empty JSON string", OfferSoloWrite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferSoloWrite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferSoloWrite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfferSoloWrite.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("captcha") != null && !jsonObj.get("captcha").isJsonNull()) && !jsonObj.get("captcha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `captcha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("captcha").toString()));
      }
      if ((jsonObj.get("nature") != null && !jsonObj.get("nature").isJsonNull()) && !jsonObj.get("nature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nature").toString()));
      }
      // validate the optional field `nature`
      if (jsonObj.get("nature") != null && !jsonObj.get("nature").isJsonNull()) {
        NatureEnum.validateJsonElement(jsonObj.get("nature"));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      // validate the optional field `condition`
      if (jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) {
        ConditionEnum.validateJsonElement(jsonObj.get("condition"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("shippingCarriers") != null && !jsonObj.get("shippingCarriers").isJsonNull() && !jsonObj.get("shippingCarriers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingCarriers` to be an array in the JSON string but got `%s`", jsonObj.get("shippingCarriers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferSoloWrite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferSoloWrite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferSoloWrite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferSoloWrite.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferSoloWrite>() {
           @Override
           public void write(JsonWriter out, OfferSoloWrite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferSoloWrite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferSoloWrite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferSoloWrite
   * @throws IOException if the JSON string is invalid with respect to OfferSoloWrite
   */
  public static OfferSoloWrite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferSoloWrite.class);
  }

  /**
   * Convert an instance of OfferSoloWrite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

