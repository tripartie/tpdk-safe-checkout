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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-12T16:00:19.220351Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CashoutCashOutRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    
    SUBMITTED("submitted"),
    
    REFUSED("refused"),
    
    BLOCKED("blocked"),
    
    ACCEPTED("accepted");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CONFIRMED_AT = "confirmedAt";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_AT)
  private OffsetDateTime confirmedAt;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_CREATED_AT = "providerCreatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CREATED_AT)
  private OffsetDateTime providerCreatedAt;

  public static final String SERIALIZED_NAME_PROVIDER_UPDATED_AT = "providerUpdatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_UPDATED_AT)
  private OffsetDateTime providerUpdatedAt;

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

  public CashoutCashOutRead() {
  }

  public CashoutCashOutRead(
     Integer id, 
     ProcessorStatusEnum processorStatus
  ) {
    this();
    this.id = id;
    this.processorStatus = processorStatus;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }



  public CashoutCashOutRead amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public CashoutCashOutRead currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CashoutCashOutRead iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
   */
  @javax.annotation.Nonnull
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }


  public CashoutCashOutRead bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * Get bic
   * @return bic
   */
  @javax.annotation.Nonnull
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }


  public CashoutCashOutRead status(StatusEnum status) {
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


  public CashoutCashOutRead createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CashoutCashOutRead confirmedAt(OffsetDateTime confirmedAt) {
    this.confirmedAt = confirmedAt;
    return this;
  }

  /**
   * Get confirmedAt
   * @return confirmedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getConfirmedAt() {
    return confirmedAt;
  }

  public void setConfirmedAt(OffsetDateTime confirmedAt) {
    this.confirmedAt = confirmedAt;
  }


  public CashoutCashOutRead providerName(String providerName) {
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


  public CashoutCashOutRead providerCreatedAt(OffsetDateTime providerCreatedAt) {
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


  public CashoutCashOutRead providerUpdatedAt(OffsetDateTime providerUpdatedAt) {
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
    sb.append("class CashoutCashOutRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    confirmedAt: ").append(toIndentedString(confirmedAt)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerCreatedAt: ").append(toIndentedString(providerCreatedAt)).append("\n");
    sb.append("    providerUpdatedAt: ").append(toIndentedString(providerUpdatedAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("iban");
    openapiFields.add("bic");
    openapiFields.add("status");
    openapiFields.add("createdAt");
    openapiFields.add("confirmedAt");
    openapiFields.add("providerName");
    openapiFields.add("providerCreatedAt");
    openapiFields.add("providerUpdatedAt");
    openapiFields.add("processorStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("iban");
    openapiRequiredFields.add("bic");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("confirmedAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CashoutCashOutRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CashoutCashOutRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CashoutCashOutRead is not found in the empty JSON string", CashoutCashOutRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CashoutCashOutRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CashoutCashOutRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CashoutCashOutRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      if (!jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
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
       if (!CashoutCashOutRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CashoutCashOutRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CashoutCashOutRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CashoutCashOutRead.class));

       return (TypeAdapter<T>) new TypeAdapter<CashoutCashOutRead>() {
           @Override
           public void write(JsonWriter out, CashoutCashOutRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CashoutCashOutRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CashoutCashOutRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CashoutCashOutRead
   * @throws IOException if the JSON string is invalid with respect to CashoutCashOutRead
   */
  public static CashoutCashOutRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CashoutCashOutRead.class);
  }

  /**
   * Convert an instance of CashoutCashOutRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

