/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.47
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-05T15:11:44.376211Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ProofOfIdentityCollectionRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFTED("drafted"),
    
    UPLOADED("uploaded"),
    
    SUBMITTED("submitted"),
    
    ACCEPTED("accepted"),
    
    REFUSED("refused"),
    
    BLOCKED("blocked");

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

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NATIONAL_ID("national_id"),
    
    PASSPORT("passport");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ORIGINAL_FILENAME = "originalFilename";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILENAME)
  private String originalFilename;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

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

  public ProofOfIdentityCollectionRead() {
  }

  public ProofOfIdentityCollectionRead(
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



  public ProofOfIdentityCollectionRead status(StatusEnum status) {
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


  public ProofOfIdentityCollectionRead type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ProofOfIdentityCollectionRead originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

  /**
   * Get originalFilename
   * @return originalFilename
   */
  @javax.annotation.Nullable
  public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }


  public ProofOfIdentityCollectionRead extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Get extension
   * @return extension
   */
  @javax.annotation.Nullable
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public ProofOfIdentityCollectionRead createdAt(OffsetDateTime createdAt) {
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


  public ProofOfIdentityCollectionRead updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ProofOfIdentityCollectionRead providerName(String providerName) {
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


  public ProofOfIdentityCollectionRead providerCreatedAt(OffsetDateTime providerCreatedAt) {
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


  public ProofOfIdentityCollectionRead providerUpdatedAt(OffsetDateTime providerUpdatedAt) {
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
    sb.append("class ProofOfIdentityCollectionRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("originalFilename");
    openapiFields.add("extension");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("providerName");
    openapiFields.add("providerCreatedAt");
    openapiFields.add("providerUpdatedAt");
    openapiFields.add("processorStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProofOfIdentityCollectionRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProofOfIdentityCollectionRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProofOfIdentityCollectionRead is not found in the empty JSON string", ProofOfIdentityCollectionRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProofOfIdentityCollectionRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProofOfIdentityCollectionRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProofOfIdentityCollectionRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("originalFilename") != null && !jsonObj.get("originalFilename").isJsonNull()) && !jsonObj.get("originalFilename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalFilename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalFilename").toString()));
      }
      if ((jsonObj.get("extension") != null && !jsonObj.get("extension").isJsonNull()) && !jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
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
       if (!ProofOfIdentityCollectionRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProofOfIdentityCollectionRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProofOfIdentityCollectionRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProofOfIdentityCollectionRead.class));

       return (TypeAdapter<T>) new TypeAdapter<ProofOfIdentityCollectionRead>() {
           @Override
           public void write(JsonWriter out, ProofOfIdentityCollectionRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProofOfIdentityCollectionRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProofOfIdentityCollectionRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProofOfIdentityCollectionRead
   * @throws IOException if the JSON string is invalid with respect to ProofOfIdentityCollectionRead
   */
  public static ProofOfIdentityCollectionRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProofOfIdentityCollectionRead.class);
  }

  /**
   * Convert an instance of ProofOfIdentityCollectionRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

