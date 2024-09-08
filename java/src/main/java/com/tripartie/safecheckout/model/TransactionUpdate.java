/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.57
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-08T07:54:08.135391Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TransactionUpdate {
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
    
    CANCELLED("CANCELLED"),
    
    NULL("null");

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

  public static final String SERIALIZED_NAME_BALANCE_TO_REFUND = "balanceToRefund";
  @SerializedName(SERIALIZED_NAME_BALANCE_TO_REFUND)
  private BigDecimal balanceToRefund;

  public static final String SERIALIZED_NAME_FEES_TO_REFUND = "feesToRefund";
  @SerializedName(SERIALIZED_NAME_FEES_TO_REFUND)
  private BigDecimal feesToRefund;

  public static final String SERIALIZED_NAME_FORCE_REFUND_SHIPPING = "forceRefundShipping";
  @SerializedName(SERIALIZED_NAME_FORCE_REFUND_SHIPPING)
  private Boolean forceRefundShipping;

  public static final String SERIALIZED_NAME_REVIEW = "review";
  @SerializedName(SERIALIZED_NAME_REVIEW)
  private String review;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Integer rating;

  public static final String SERIALIZED_NAME_HAND_OVER_CODE_CONFIRMATION = "handOverCodeConfirmation";
  @SerializedName(SERIALIZED_NAME_HAND_OVER_CODE_CONFIRMATION)
  private String handOverCodeConfirmation;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public TransactionUpdate() {
  }

  public TransactionUpdate status(StatusEnum status) {
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


  public TransactionUpdate supplementalFees(BigDecimal supplementalFees) {
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


  public TransactionUpdate balanceToRefund(BigDecimal balanceToRefund) {
    this.balanceToRefund = balanceToRefund;
    return this;
  }

  /**
   * Get balanceToRefund
   * @return balanceToRefund
   */
  @javax.annotation.Nullable
  public BigDecimal getBalanceToRefund() {
    return balanceToRefund;
  }

  public void setBalanceToRefund(BigDecimal balanceToRefund) {
    this.balanceToRefund = balanceToRefund;
  }


  public TransactionUpdate feesToRefund(BigDecimal feesToRefund) {
    this.feesToRefund = feesToRefund;
    return this;
  }

  /**
   * Get feesToRefund
   * @return feesToRefund
   */
  @javax.annotation.Nullable
  public BigDecimal getFeesToRefund() {
    return feesToRefund;
  }

  public void setFeesToRefund(BigDecimal feesToRefund) {
    this.feesToRefund = feesToRefund;
  }


  public TransactionUpdate forceRefundShipping(Boolean forceRefundShipping) {
    this.forceRefundShipping = forceRefundShipping;
    return this;
  }

  /**
   * Shipping is never refunded on purpose. Once deposited (parcel), we are billed for it.
   * @return forceRefundShipping
   */
  @javax.annotation.Nullable
  public Boolean getForceRefundShipping() {
    return forceRefundShipping;
  }

  public void setForceRefundShipping(Boolean forceRefundShipping) {
    this.forceRefundShipping = forceRefundShipping;
  }


  public TransactionUpdate review(String review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
   */
  @javax.annotation.Nullable
  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }


  public TransactionUpdate rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * minimum: 0
   * maximum: 10
   * @return rating
   */
  @javax.annotation.Nullable
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }


  public TransactionUpdate handOverCodeConfirmation(String handOverCodeConfirmation) {
    this.handOverCodeConfirmation = handOverCodeConfirmation;
    return this;
  }

  /**
   * Get handOverCodeConfirmation
   * @return handOverCodeConfirmation
   */
  @javax.annotation.Nullable
  public String getHandOverCodeConfirmation() {
    return handOverCodeConfirmation;
  }

  public void setHandOverCodeConfirmation(String handOverCodeConfirmation) {
    this.handOverCodeConfirmation = handOverCodeConfirmation;
  }


  public TransactionUpdate updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
    sb.append("class TransactionUpdate {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supplementalFees: ").append(toIndentedString(supplementalFees)).append("\n");
    sb.append("    balanceToRefund: ").append(toIndentedString(balanceToRefund)).append("\n");
    sb.append("    feesToRefund: ").append(toIndentedString(feesToRefund)).append("\n");
    sb.append("    forceRefundShipping: ").append(toIndentedString(forceRefundShipping)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    handOverCodeConfirmation: ").append(toIndentedString(handOverCodeConfirmation)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("supplementalFees");
    openapiFields.add("balanceToRefund");
    openapiFields.add("feesToRefund");
    openapiFields.add("forceRefundShipping");
    openapiFields.add("review");
    openapiFields.add("rating");
    openapiFields.add("handOverCodeConfirmation");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionUpdate is not found in the empty JSON string", TransactionUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("review") != null && !jsonObj.get("review").isJsonNull()) && !jsonObj.get("review").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review").toString()));
      }
      if ((jsonObj.get("handOverCodeConfirmation") != null && !jsonObj.get("handOverCodeConfirmation").isJsonNull()) && !jsonObj.get("handOverCodeConfirmation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handOverCodeConfirmation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handOverCodeConfirmation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionUpdate>() {
           @Override
           public void write(JsonWriter out, TransactionUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionUpdate
   * @throws IOException if the JSON string is invalid with respect to TransactionUpdate
   */
  public static TransactionUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionUpdate.class);
  }

  /**
   * Convert an instance of TransactionUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

