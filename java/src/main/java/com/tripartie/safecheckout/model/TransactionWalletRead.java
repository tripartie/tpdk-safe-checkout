/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.29
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-30T09:25:05.553740Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TransactionWalletRead {
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

  public TransactionWalletRead() {
  }

  public TransactionWalletRead(
     OffsetDateTime providerCreatedAt, 
     OffsetDateTime providerUpdatedAt, 
     ProcessorStatusEnum processorStatus
  ) {
    this();
    this.providerCreatedAt = providerCreatedAt;
    this.providerUpdatedAt = providerUpdatedAt;
    this.processorStatus = processorStatus;
  }

  public TransactionWalletRead providerName(String providerName) {
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


  /**
   * Get providerCreatedAt
   * @return providerCreatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderCreatedAt() {
    return providerCreatedAt;
  }



  /**
   * Get providerUpdatedAt
   * @return providerUpdatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderUpdatedAt() {
    return providerUpdatedAt;
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
    sb.append("class TransactionWalletRead {\n");
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
    openapiFields.add("providerName");
    openapiFields.add("providerCreatedAt");
    openapiFields.add("providerUpdatedAt");
    openapiFields.add("processorStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionWalletRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionWalletRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionWalletRead is not found in the empty JSON string", TransactionWalletRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionWalletRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionWalletRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
       if (!TransactionWalletRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionWalletRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionWalletRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionWalletRead.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionWalletRead>() {
           @Override
           public void write(JsonWriter out, TransactionWalletRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionWalletRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionWalletRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionWalletRead
   * @throws IOException if the JSON string is invalid with respect to TransactionWalletRead
   */
  public static TransactionWalletRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionWalletRead.class);
  }

  /**
   * Convert an instance of TransactionWalletRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

