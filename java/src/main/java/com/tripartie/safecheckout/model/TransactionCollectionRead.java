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
import com.tripartie.safecheckout.model.TransactionOfferCollectionRead;
import com.tripartie.safecheckout.model.TransactionPersonaCollectionRead;
import com.tripartie.safecheckout.model.TransactionQuoteCollectionRead;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-08T13:50:36.452269Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TransactionCollectionRead {
  public static final String SERIALIZED_NAME_ULID = "ulid";
  @SerializedName(SERIALIZED_NAME_ULID)
  private String ulid;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  private TransactionOfferCollectionRead offer;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  private TransactionQuoteCollectionRead quote;

  public static final String SERIALIZED_NAME_BUYER_MESSAGE = "buyerMessage";
  @SerializedName(SERIALIZED_NAME_BUYER_MESSAGE)
  private String buyerMessage;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private TransactionPersonaCollectionRead buyer;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    AUTHORIZED("AUTHORIZED"),
    
    REFUSED("REFUSED"),
    
    ACCEPTED("ACCEPTED"),
    
    SHIPPED("SHIPPED"),
    
    IN_TRANSIT("IN_TRANSIT"),
    
    BLOCKED("BLOCKED"),
    
    DELIVERED("DELIVERED"),
    
    COMPLETED("COMPLETED"),
    
    DISPUTED("DISPUTED"),
    
    CANCELLED("CANCELLED");

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

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_FEES = "supplementalFees";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_FEES)
  private BigDecimal supplementalFees;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_CREATED_AT = "providerCreatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CREATED_AT)
  private OffsetDateTime providerCreatedAt;

  public static final String SERIALIZED_NAME_PROVIDER_UPDATED_AT = "providerUpdatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_UPDATED_AT)
  private OffsetDateTime providerUpdatedAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_TOTAL_CHARGED = "totalCharged";
  @SerializedName(SERIALIZED_NAME_TOTAL_CHARGED)
  private BigDecimal totalCharged;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "totalFees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private BigDecimal totalFees;

  /**
   * Determine who is awaited (actor) for the next transition
   */
  @JsonAdapter(AwaitedPartyEnum.Adapter.class)
  public enum AwaitedPartyEnum {
    BUYER("BUYER"),
    
    PLATFORM("PLATFORM"),
    
    SELLER("SELLER");

    private String value;

    AwaitedPartyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AwaitedPartyEnum fromValue(String value) {
      for (AwaitedPartyEnum b : AwaitedPartyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AwaitedPartyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AwaitedPartyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AwaitedPartyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AwaitedPartyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AwaitedPartyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AWAITED_PARTY = "awaitedParty";
  @SerializedName(SERIALIZED_NAME_AWAITED_PARTY)
  private AwaitedPartyEnum awaitedParty;

  public static final String SERIALIZED_NAME_STATUS_EXPIRATION = "statusExpiration";
  @SerializedName(SERIALIZED_NAME_STATUS_EXPIRATION)
  private OffsetDateTime statusExpiration;

  /**
   * Automagically infer on what state the entity is at the Payment Processor.
   */
  @JsonAdapter(ProcessorStatusEnum.Adapter.class)
  public enum ProcessorStatusEnum {
    UNALLOCATED("unallocated"),
    
    ALLOCATING("allocating"),
    
    ALLOCATED("allocated"),
    
    FREED("freed"),
    
    OUTDATED("outdated");

    private String value;

    ProcessorStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProcessorStatusEnum fromValue(String value) {
      for (ProcessorStatusEnum b : ProcessorStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProcessorStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProcessorStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProcessorStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProcessorStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProcessorStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROCESSOR_STATUS = "processorStatus";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_STATUS)
  private ProcessorStatusEnum processorStatus;

  public TransactionCollectionRead() {
  }

  public TransactionCollectionRead(
     BigDecimal total, 
     BigDecimal totalCharged, 
     BigDecimal totalFees, 
     AwaitedPartyEnum awaitedParty, 
     OffsetDateTime statusExpiration, 
     ProcessorStatusEnum processorStatus
  ) {
    this();
    this.total = total;
    this.totalCharged = totalCharged;
    this.totalFees = totalFees;
    this.awaitedParty = awaitedParty;
    this.statusExpiration = statusExpiration;
    this.processorStatus = processorStatus;
  }

  public TransactionCollectionRead ulid(String ulid) {
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


  public TransactionCollectionRead offer(TransactionOfferCollectionRead offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @javax.annotation.Nonnull
  public TransactionOfferCollectionRead getOffer() {
    return offer;
  }

  public void setOffer(TransactionOfferCollectionRead offer) {
    this.offer = offer;
  }


  public TransactionCollectionRead quote(TransactionQuoteCollectionRead quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nonnull
  public TransactionQuoteCollectionRead getQuote() {
    return quote;
  }

  public void setQuote(TransactionQuoteCollectionRead quote) {
    this.quote = quote;
  }


  public TransactionCollectionRead buyerMessage(String buyerMessage) {
    this.buyerMessage = buyerMessage;
    return this;
  }

  /**
   * Attach a note. Only the buyer can exercise this right. At the creation.
   * @return buyerMessage
   */
  @javax.annotation.Nullable
  public String getBuyerMessage() {
    return buyerMessage;
  }

  public void setBuyerMessage(String buyerMessage) {
    this.buyerMessage = buyerMessage;
  }


  public TransactionCollectionRead buyer(TransactionPersonaCollectionRead buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
   */
  @javax.annotation.Nonnull
  public TransactionPersonaCollectionRead getBuyer() {
    return buyer;
  }

  public void setBuyer(TransactionPersonaCollectionRead buyer) {
    this.buyer = buyer;
  }


  public TransactionCollectionRead status(StatusEnum status) {
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


  public TransactionCollectionRead supplementalFees(BigDecimal supplementalFees) {
    this.supplementalFees = supplementalFees;
    return this;
  }

  /**
   * usually set if the weight was underestimated and shipping carrier billed us an extra.
   * @return supplementalFees
   */
  @javax.annotation.Nullable
  public BigDecimal getSupplementalFees() {
    return supplementalFees;
  }

  public void setSupplementalFees(BigDecimal supplementalFees) {
    this.supplementalFees = supplementalFees;
  }


  public TransactionCollectionRead providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Get providerName
   * @return providerName
   */
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public TransactionCollectionRead providerCreatedAt(OffsetDateTime providerCreatedAt) {
    this.providerCreatedAt = providerCreatedAt;
    return this;
  }

  /**
   * Get providerCreatedAt
   * @return providerCreatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderCreatedAt() {
    return providerCreatedAt;
  }

  public void setProviderCreatedAt(OffsetDateTime providerCreatedAt) {
    this.providerCreatedAt = providerCreatedAt;
  }


  public TransactionCollectionRead providerUpdatedAt(OffsetDateTime providerUpdatedAt) {
    this.providerUpdatedAt = providerUpdatedAt;
    return this;
  }

  /**
   * Get providerUpdatedAt
   * @return providerUpdatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderUpdatedAt() {
    return providerUpdatedAt;
  }

  public void setProviderUpdatedAt(OffsetDateTime providerUpdatedAt) {
    this.providerUpdatedAt = providerUpdatedAt;
  }


  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public BigDecimal getTotal() {
    return total;
  }



  /**
   * Get totalCharged
   * @return totalCharged
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalCharged() {
    return totalCharged;
  }



  /**
   * Get totalFees
   * @return totalFees
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalFees() {
    return totalFees;
  }



  /**
   * Determine who is awaited (actor) for the next transition
   * @return awaitedParty
   */
  @javax.annotation.Nullable
  public AwaitedPartyEnum getAwaitedParty() {
    return awaitedParty;
  }



  /**
   * Yield if eligible the date-time at which the transaction state expire.
   * @return statusExpiration
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStatusExpiration() {
    return statusExpiration;
  }



  /**
   * Automagically infer on what state the entity is at the Payment Processor.
   * @return processorStatus
   */
  @javax.annotation.Nullable
  public ProcessorStatusEnum getProcessorStatus() {
    return processorStatus;
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
    sb.append("class TransactionCollectionRead {\n");
    sb.append("    ulid: ").append(toIndentedString(ulid)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    buyerMessage: ").append(toIndentedString(buyerMessage)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supplementalFees: ").append(toIndentedString(supplementalFees)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerCreatedAt: ").append(toIndentedString(providerCreatedAt)).append("\n");
    sb.append("    providerUpdatedAt: ").append(toIndentedString(providerUpdatedAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalCharged: ").append(toIndentedString(totalCharged)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    awaitedParty: ").append(toIndentedString(awaitedParty)).append("\n");
    sb.append("    statusExpiration: ").append(toIndentedString(statusExpiration)).append("\n");
    sb.append("    processorStatus: ").append(toIndentedString(processorStatus)).append("\n");
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
    openapiFields.add("offer");
    openapiFields.add("quote");
    openapiFields.add("buyerMessage");
    openapiFields.add("buyer");
    openapiFields.add("status");
    openapiFields.add("supplementalFees");
    openapiFields.add("providerName");
    openapiFields.add("providerCreatedAt");
    openapiFields.add("providerUpdatedAt");
    openapiFields.add("total");
    openapiFields.add("totalCharged");
    openapiFields.add("totalFees");
    openapiFields.add("awaitedParty");
    openapiFields.add("statusExpiration");
    openapiFields.add("processorStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ulid");
    openapiRequiredFields.add("offer");
    openapiRequiredFields.add("quote");
    openapiRequiredFields.add("buyer");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionCollectionRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionCollectionRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionCollectionRead is not found in the empty JSON string", TransactionCollectionRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionCollectionRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionCollectionRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionCollectionRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ulid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ulid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ulid").toString()));
      }
      // validate the required field `offer`
      TransactionOfferCollectionRead.validateJsonElement(jsonObj.get("offer"));
      // validate the required field `quote`
      TransactionQuoteCollectionRead.validateJsonElement(jsonObj.get("quote"));
      if ((jsonObj.get("buyerMessage") != null && !jsonObj.get("buyerMessage").isJsonNull()) && !jsonObj.get("buyerMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyerMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyerMessage").toString()));
      }
      // validate the required field `buyer`
      TransactionPersonaCollectionRead.validateJsonElement(jsonObj.get("buyer"));
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("awaitedParty") != null && !jsonObj.get("awaitedParty").isJsonNull()) && !jsonObj.get("awaitedParty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awaitedParty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awaitedParty").toString()));
      }
      // validate the optional field `awaitedParty`
      if (jsonObj.get("awaitedParty") != null && !jsonObj.get("awaitedParty").isJsonNull()) {
        AwaitedPartyEnum.validateJsonElement(jsonObj.get("awaitedParty"));
      }
      if ((jsonObj.get("processorStatus") != null && !jsonObj.get("processorStatus").isJsonNull()) && !jsonObj.get("processorStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processorStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processorStatus").toString()));
      }
      // validate the optional field `processorStatus`
      if (jsonObj.get("processorStatus") != null && !jsonObj.get("processorStatus").isJsonNull()) {
        ProcessorStatusEnum.validateJsonElement(jsonObj.get("processorStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionCollectionRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionCollectionRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionCollectionRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionCollectionRead.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionCollectionRead>() {
           @Override
           public void write(JsonWriter out, TransactionCollectionRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionCollectionRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionCollectionRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionCollectionRead
   * @throws IOException if the JSON string is invalid with respect to TransactionCollectionRead
   */
  public static TransactionCollectionRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionCollectionRead.class);
  }

  /**
   * Convert an instance of TransactionCollectionRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

