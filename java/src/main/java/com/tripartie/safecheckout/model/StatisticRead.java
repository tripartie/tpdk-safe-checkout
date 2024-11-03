/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.98
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
import com.tripartie.safecheckout.model.StatisticReadDataInner;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
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
 * StatisticRead
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T09:25:22.430485Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class StatisticRead {
  /**
   * Gets or Sets request
   */
  @JsonAdapter(RequestEnum.Adapter.class)
  public enum RequestEnum {
    FINALIZED_CASHOUT_AMOUNT("FINALIZED_CASHOUT_AMOUNT"),
    
    FINALIZED_CASHOUT_COUNT("FINALIZED_CASHOUT_COUNT"),
    
    PENDING_CASHOUT_AMOUNT("PENDING_CASHOUT_AMOUNT"),
    
    PENDING_CASHOUT_COUNT("PENDING_CASHOUT_COUNT"),
    
    OFFER_PUBLISHED_AMOUNT("OFFER_PUBLISHED_AMOUNT"),
    
    OFFER_PUBLISHED_COUNT("OFFER_PUBLISHED_COUNT"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT("TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_COUNT("TRANSACTION_ACCEPTED_PROPOSAL_COUNT"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE("TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE"),
    
    TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE("TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE"),
    
    TRANSACTION_COMPLETED_AMOUNT("TRANSACTION_COMPLETED_AMOUNT"),
    
    TRANSACTION_COMPLETED_COUNT("TRANSACTION_COMPLETED_COUNT"),
    
    TRANSACTION_COMPLETED_SERVICE_FEE("TRANSACTION_COMPLETED_SERVICE_FEE"),
    
    TRANSACTION_COMPLETED_SHIPPING_FEE("TRANSACTION_COMPLETED_SHIPPING_FEE"),
    
    TRANSACTION_CREATED_AMOUNT("TRANSACTION_CREATED_AMOUNT"),
    
    TRANSACTION_CREATED_COUNT("TRANSACTION_CREATED_COUNT"),
    
    WALLET_AVAILABLE_AMOUNT("WALLET_AVAILABLE_AMOUNT"),
    
    WALLET_IN_CUSTODY_AMOUNT("WALLET_IN_CUSTODY_AMOUNT");

    private String value;

    RequestEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequestEnum fromValue(String value) {
      for (RequestEnum b : RequestEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequestEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequestEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequestEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RequestEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RequestEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private Set<RequestEnum> request = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_FOCUS_ON = "focusOn";
  @SerializedName(SERIALIZED_NAME_FOCUS_ON)
  private String focusOn;

  /**
   * Gets or Sets focusType
   */
  @JsonAdapter(FocusTypeEnum.Adapter.class)
  public enum FocusTypeEnum {
    ORGANIZATION("Organization"),
    
    USER("User"),
    
    PERSONA("Persona");

    private String value;

    FocusTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FocusTypeEnum fromValue(String value) {
      for (FocusTypeEnum b : FocusTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FocusTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FocusTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FocusTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FocusTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FocusTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FOCUS_TYPE = "focusType";
  @SerializedName(SERIALIZED_NAME_FOCUS_TYPE)
  private FocusTypeEnum focusType;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private OffsetDateTime startAt;

  public static final String SERIALIZED_NAME_END_AT = "endAt";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private OffsetDateTime endAt;

  /**
   * Gets or Sets groupByPeriod
   */
  @JsonAdapter(GroupByPeriodEnum.Adapter.class)
  public enum GroupByPeriodEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    QUARTERLY("QUARTERLY"),
    
    YEARLY("YEARLY");

    private String value;

    GroupByPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GroupByPeriodEnum fromValue(String value) {
      for (GroupByPeriodEnum b : GroupByPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GroupByPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupByPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupByPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GroupByPeriodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      GroupByPeriodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_GROUP_BY_PERIOD = "groupByPeriod";
  @SerializedName(SERIALIZED_NAME_GROUP_BY_PERIOD)
  private GroupByPeriodEnum groupByPeriod;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<StatisticReadDataInner> data = new ArrayList<>();

  public StatisticRead() {
  }

  public StatisticRead request(Set<RequestEnum> request) {
    this.request = request;
    return this;
  }

  public StatisticRead addRequestItem(RequestEnum requestItem) {
    if (this.request == null) {
      this.request = new LinkedHashSet<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @javax.annotation.Nonnull
  public Set<RequestEnum> getRequest() {
    return request;
  }

  public void setRequest(Set<RequestEnum> request) {
    this.request = request;
  }


  public StatisticRead focusOn(String focusOn) {
    this.focusOn = focusOn;
    return this;
  }

  /**
   * Get focusOn
   * @return focusOn
   */
  @javax.annotation.Nullable
  public String getFocusOn() {
    return focusOn;
  }

  public void setFocusOn(String focusOn) {
    this.focusOn = focusOn;
  }


  public StatisticRead focusType(FocusTypeEnum focusType) {
    this.focusType = focusType;
    return this;
  }

  /**
   * Get focusType
   * @return focusType
   */
  @javax.annotation.Nullable
  public FocusTypeEnum getFocusType() {
    return focusType;
  }

  public void setFocusType(FocusTypeEnum focusType) {
    this.focusType = focusType;
  }


  public StatisticRead startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * Get startAt
   * @return startAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }


  public StatisticRead endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * Get endAt
   * @return endAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }


  public StatisticRead groupByPeriod(GroupByPeriodEnum groupByPeriod) {
    this.groupByPeriod = groupByPeriod;
    return this;
  }

  /**
   * Get groupByPeriod
   * @return groupByPeriod
   */
  @javax.annotation.Nullable
  public GroupByPeriodEnum getGroupByPeriod() {
    return groupByPeriod;
  }

  public void setGroupByPeriod(GroupByPeriodEnum groupByPeriod) {
    this.groupByPeriod = groupByPeriod;
  }


  public StatisticRead data(List<StatisticReadDataInner> data) {
    this.data = data;
    return this;
  }

  public StatisticRead addDataItem(StatisticReadDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public List<StatisticReadDataInner> getData() {
    return data;
  }

  public void setData(List<StatisticReadDataInner> data) {
    this.data = data;
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
    sb.append("class StatisticRead {\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    focusOn: ").append(toIndentedString(focusOn)).append("\n");
    sb.append("    focusType: ").append(toIndentedString(focusType)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    groupByPeriod: ").append(toIndentedString(groupByPeriod)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("request");
    openapiFields.add("focusOn");
    openapiFields.add("focusType");
    openapiFields.add("startAt");
    openapiFields.add("endAt");
    openapiFields.add("groupByPeriod");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("request");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StatisticRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StatisticRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatisticRead is not found in the empty JSON string", StatisticRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StatisticRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatisticRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatisticRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("request") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("request").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `request` to be an array in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
      if ((jsonObj.get("focusOn") != null && !jsonObj.get("focusOn").isJsonNull()) && !jsonObj.get("focusOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `focusOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("focusOn").toString()));
      }
      if ((jsonObj.get("focusType") != null && !jsonObj.get("focusType").isJsonNull()) && !jsonObj.get("focusType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `focusType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("focusType").toString()));
      }
      // validate the optional field `focusType`
      if (jsonObj.get("focusType") != null && !jsonObj.get("focusType").isJsonNull()) {
        FocusTypeEnum.validateJsonElement(jsonObj.get("focusType"));
      }
      if ((jsonObj.get("groupByPeriod") != null && !jsonObj.get("groupByPeriod").isJsonNull()) && !jsonObj.get("groupByPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupByPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupByPeriod").toString()));
      }
      // validate the optional field `groupByPeriod`
      if (jsonObj.get("groupByPeriod") != null && !jsonObj.get("groupByPeriod").isJsonNull()) {
        GroupByPeriodEnum.validateJsonElement(jsonObj.get("groupByPeriod"));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            StatisticReadDataInner.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatisticRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatisticRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatisticRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatisticRead.class));

       return (TypeAdapter<T>) new TypeAdapter<StatisticRead>() {
           @Override
           public void write(JsonWriter out, StatisticRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatisticRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StatisticRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StatisticRead
   * @throws IOException if the JSON string is invalid with respect to StatisticRead
   */
  public static StatisticRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatisticRead.class);
  }

  /**
   * Convert an instance of StatisticRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

