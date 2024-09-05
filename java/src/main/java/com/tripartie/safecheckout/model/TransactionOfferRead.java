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
import com.tripartie.safecheckout.model.TransactionMetadataRead;
import com.tripartie.safecheckout.model.TransactionPersonaRead;
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
public class TransactionOfferRead {
  public static final String SERIALIZED_NAME_ULID = "ulid";
  @SerializedName(SERIALIZED_NAME_ULID)
  private String ulid;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ISSUED("issued"),
    
    ACTIVE("active"),
    
    FULFILLED("fulfilled"),
    
    EXPIRED("expired");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_PUBLIC_URL = "publicUrl";
  @SerializedName(SERIALIZED_NAME_PUBLIC_URL)
  private String publicUrl;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private TransactionPersonaRead seller;

  public static final String SERIALIZED_NAME_PRESET_BUYER = "presetBuyer";
  @SerializedName(SERIALIZED_NAME_PRESET_BUYER)
  private TransactionPersonaRead presetBuyer;

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
  private List<ShippingCarriersEnum> shippingCarriers = new ArrayList<>();

  public static final String SERIALIZED_NAME_EAN_CODE = "eanCode";
  @SerializedName(SERIALIZED_NAME_EAN_CODE)
  private String eanCode;

  public static final String SERIALIZED_NAME_CAN_BE_SOLD_SEPARATELY = "canBeSoldSeparately";
  @SerializedName(SERIALIZED_NAME_CAN_BE_SOLD_SEPARATELY)
  private Boolean canBeSoldSeparately = true;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<TransactionMetadataRead> metadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_MEDIAS = "medias";
  @SerializedName(SERIALIZED_NAME_MEDIAS)
  private List<String> medias = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public TransactionOfferRead() {
  }

  public TransactionOfferRead(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public TransactionOfferRead ulid(String ulid) {
    this.ulid = ulid;
    return this;
  }

  /**
   * Get ulid
   * @return ulid
   */
  @javax.annotation.Nonnull
  public String getUlid() {
    return ulid;
  }

  public void setUlid(String ulid) {
    this.ulid = ulid;
  }


  public TransactionOfferRead status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransactionOfferRead publicUrl(String publicUrl) {
    this.publicUrl = publicUrl;
    return this;
  }

  /**
   * The public URL for your Ad/Offer on your marketplace.
   * @return publicUrl
   */
  @javax.annotation.Nullable
  public String getPublicUrl() {
    return publicUrl;
  }

  public void setPublicUrl(String publicUrl) {
    this.publicUrl = publicUrl;
  }


  public TransactionOfferRead redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * Fill-in that field IF you intend to redirect your customer instead of using a WebView.
   * @return redirectUrl
   */
  @javax.annotation.Nullable
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public TransactionOfferRead seller(TransactionPersonaRead seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
   */
  @javax.annotation.Nonnull
  public TransactionPersonaRead getSeller() {
    return seller;
  }

  public void setSeller(TransactionPersonaRead seller) {
    this.seller = seller;
  }


  public TransactionOfferRead presetBuyer(TransactionPersonaRead presetBuyer) {
    this.presetBuyer = presetBuyer;
    return this;
  }

  /**
   * Get presetBuyer
   * @return presetBuyer
   */
  @javax.annotation.Nullable
  public TransactionPersonaRead getPresetBuyer() {
    return presetBuyer;
  }

  public void setPresetBuyer(TransactionPersonaRead presetBuyer) {
    this.presetBuyer = presetBuyer;
  }


  public TransactionOfferRead nature(NatureEnum nature) {
    this.nature = nature;
    return this;
  }

  /**
   * This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information.
   * @return nature
   */
  @javax.annotation.Nonnull
  public NatureEnum getNature() {
    return nature;
  }

  public void setNature(NatureEnum nature) {
    this.nature = nature;
  }


  public TransactionOfferRead title(String title) {
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


  public TransactionOfferRead description(String description) {
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


  public TransactionOfferRead unitPrice(Float unitPrice) {
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


  public TransactionOfferRead currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @javax.annotation.Nonnull
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public TransactionOfferRead itemCount(Integer itemCount) {
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


  public TransactionOfferRead condition(ConditionEnum condition) {
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


  public TransactionOfferRead weightInGram(Integer weightInGram) {
    this.weightInGram = weightInGram;
    return this;
  }

  /**
   * Accepted values between 500g (0.5kg) and 10,000g (10kg).
   * @return weightInGram
   */
  @javax.annotation.Nonnull
  public Integer getWeightInGram() {
    return weightInGram;
  }

  public void setWeightInGram(Integer weightInGram) {
    this.weightInGram = weightInGram;
  }


  public TransactionOfferRead shippingAllowed(Boolean shippingAllowed) {
    this.shippingAllowed = shippingAllowed;
    return this;
  }

  /**
   * That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined.
   * @return shippingAllowed
   */
  @javax.annotation.Nonnull
  public Boolean getShippingAllowed() {
    return shippingAllowed;
  }

  public void setShippingAllowed(Boolean shippingAllowed) {
    this.shippingAllowed = shippingAllowed;
  }


  public TransactionOfferRead handDeliveryAllowed(Boolean handDeliveryAllowed) {
    this.handDeliveryAllowed = handDeliveryAllowed;
    return this;
  }

  /**
   * Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product.
   * @return handDeliveryAllowed
   */
  @javax.annotation.Nonnull
  public Boolean getHandDeliveryAllowed() {
    return handDeliveryAllowed;
  }

  public void setHandDeliveryAllowed(Boolean handDeliveryAllowed) {
    this.handDeliveryAllowed = handDeliveryAllowed;
  }


  public TransactionOfferRead shippingCarriers(List<ShippingCarriersEnum> shippingCarriers) {
    this.shippingCarriers = shippingCarriers;
    return this;
  }

  public TransactionOfferRead addShippingCarriersItem(ShippingCarriersEnum shippingCarriersItem) {
    if (this.shippingCarriers == null) {
      this.shippingCarriers = new ArrayList<>();
    }
    this.shippingCarriers.add(shippingCarriersItem);
    return this;
  }

  /**
   * If you wish to enable automated shipping label generation through a specific provider, specify it there.
   * @return shippingCarriers
   */
  @javax.annotation.Nullable
  public List<ShippingCarriersEnum> getShippingCarriers() {
    return shippingCarriers;
  }

  public void setShippingCarriers(List<ShippingCarriersEnum> shippingCarriers) {
    this.shippingCarriers = shippingCarriers;
  }


  public TransactionOfferRead eanCode(String eanCode) {
    this.eanCode = eanCode;
    return this;
  }

  /**
   * Get eanCode
   * @return eanCode
   */
  @javax.annotation.Nullable
  public String getEanCode() {
    return eanCode;
  }

  public void setEanCode(String eanCode) {
    this.eanCode = eanCode;
  }


  public TransactionOfferRead canBeSoldSeparately(Boolean canBeSoldSeparately) {
    this.canBeSoldSeparately = canBeSoldSeparately;
    return this;
  }

  /**
   * Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s)
   * @return canBeSoldSeparately
   */
  @javax.annotation.Nonnull
  public Boolean getCanBeSoldSeparately() {
    return canBeSoldSeparately;
  }

  public void setCanBeSoldSeparately(Boolean canBeSoldSeparately) {
    this.canBeSoldSeparately = canBeSoldSeparately;
  }


  public TransactionOfferRead metadata(List<TransactionMetadataRead> metadata) {
    this.metadata = metadata;
    return this;
  }

  public TransactionOfferRead addMetadataItem(TransactionMetadataRead metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public List<TransactionMetadataRead> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<TransactionMetadataRead> metadata) {
    this.metadata = metadata;
  }


  public TransactionOfferRead medias(List<String> medias) {
    this.medias = medias;
    return this;
  }

  public TransactionOfferRead addMediasItem(String mediasItem) {
    if (this.medias == null) {
      this.medias = new ArrayList<>();
    }
    this.medias.add(mediasItem);
    return this;
  }

  /**
   * Get medias
   * @return medias
   */
  @javax.annotation.Nonnull
  public List<String> getMedias() {
    return medias;
  }

  public void setMedias(List<String> medias) {
    this.medias = medias;
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
    sb.append("class TransactionOfferRead {\n");
    sb.append("    ulid: ").append(toIndentedString(ulid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    publicUrl: ").append(toIndentedString(publicUrl)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    presetBuyer: ").append(toIndentedString(presetBuyer)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    weightInGram: ").append(toIndentedString(weightInGram)).append("\n");
    sb.append("    shippingAllowed: ").append(toIndentedString(shippingAllowed)).append("\n");
    sb.append("    handDeliveryAllowed: ").append(toIndentedString(handDeliveryAllowed)).append("\n");
    sb.append("    shippingCarriers: ").append(toIndentedString(shippingCarriers)).append("\n");
    sb.append("    eanCode: ").append(toIndentedString(eanCode)).append("\n");
    sb.append("    canBeSoldSeparately: ").append(toIndentedString(canBeSoldSeparately)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    medias: ").append(toIndentedString(medias)).append("\n");
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
    openapiFields.add("ulid");
    openapiFields.add("status");
    openapiFields.add("publicUrl");
    openapiFields.add("redirectUrl");
    openapiFields.add("seller");
    openapiFields.add("presetBuyer");
    openapiFields.add("nature");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("unitPrice");
    openapiFields.add("currencyCode");
    openapiFields.add("itemCount");
    openapiFields.add("condition");
    openapiFields.add("weightInGram");
    openapiFields.add("shippingAllowed");
    openapiFields.add("handDeliveryAllowed");
    openapiFields.add("shippingCarriers");
    openapiFields.add("eanCode");
    openapiFields.add("canBeSoldSeparately");
    openapiFields.add("metadata");
    openapiFields.add("medias");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ulid");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("seller");
    openapiRequiredFields.add("nature");
    openapiRequiredFields.add("currencyCode");
    openapiRequiredFields.add("weightInGram");
    openapiRequiredFields.add("shippingAllowed");
    openapiRequiredFields.add("handDeliveryAllowed");
    openapiRequiredFields.add("canBeSoldSeparately");
    openapiRequiredFields.add("medias");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionOfferRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionOfferRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionOfferRead is not found in the empty JSON string", TransactionOfferRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionOfferRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionOfferRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionOfferRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ulid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ulid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ulid").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("publicUrl") != null && !jsonObj.get("publicUrl").isJsonNull()) && !jsonObj.get("publicUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicUrl").toString()));
      }
      if ((jsonObj.get("redirectUrl") != null && !jsonObj.get("redirectUrl").isJsonNull()) && !jsonObj.get("redirectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUrl").toString()));
      }
      // validate the required field `seller`
      TransactionPersonaRead.validateJsonElement(jsonObj.get("seller"));
      // validate the optional field `presetBuyer`
      if (jsonObj.get("presetBuyer") != null && !jsonObj.get("presetBuyer").isJsonNull()) {
        TransactionPersonaRead.validateJsonElement(jsonObj.get("presetBuyer"));
      }
      if (!jsonObj.get("nature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nature").toString()));
      }
      // validate the required field `nature`
      NatureEnum.validateJsonElement(jsonObj.get("nature"));
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("currencyCode").isJsonPrimitive()) {
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
      if ((jsonObj.get("eanCode") != null && !jsonObj.get("eanCode").isJsonNull()) && !jsonObj.get("eanCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eanCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eanCode").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            TransactionMetadataRead.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("medias") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("medias").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `medias` to be an array in the JSON string but got `%s`", jsonObj.get("medias").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionOfferRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionOfferRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionOfferRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionOfferRead.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionOfferRead>() {
           @Override
           public void write(JsonWriter out, TransactionOfferRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionOfferRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionOfferRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionOfferRead
   * @throws IOException if the JSON string is invalid with respect to TransactionOfferRead
   */
  public static TransactionOfferRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionOfferRead.class);
  }

  /**
   * Convert an instance of TransactionOfferRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

