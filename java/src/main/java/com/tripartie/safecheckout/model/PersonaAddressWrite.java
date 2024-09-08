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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-08T10:09:44.972040Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PersonaAddressWrite {
  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_CITY_NAME = "cityName";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_FIRST_LINE = "firstLine";
  @SerializedName(SERIALIZED_NAME_FIRST_LINE)
  private String firstLine;

  public static final String SERIALIZED_NAME_SECOND_LINE = "secondLine";
  @SerializedName(SERIALIZED_NAME_SECOND_LINE)
  private String secondLine;

  public static final String SERIALIZED_NAME_BUILDING_NAME = "buildingName";
  @SerializedName(SERIALIZED_NAME_BUILDING_NAME)
  private String buildingName;

  public static final String SERIALIZED_NAME_BUILDING_FLOOR = "buildingFloor";
  @SerializedName(SERIALIZED_NAME_BUILDING_FLOOR)
  private String buildingFloor;

  public static final String SERIALIZED_NAME_GATE_OR_PORTAL_OR_INBOX_CODE = "gateOrPortalOrInboxCode";
  @SerializedName(SERIALIZED_NAME_GATE_OR_PORTAL_OR_INBOX_CODE)
  private String gateOrPortalOrInboxCode;

  public PersonaAddressWrite() {
  }

  public PersonaAddressWrite countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public PersonaAddressWrite zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
   */
  @javax.annotation.Nullable
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public PersonaAddressWrite cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * Get cityName
   * @return cityName
   */
  @javax.annotation.Nullable
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public PersonaAddressWrite firstLine(String firstLine) {
    this.firstLine = firstLine;
    return this;
  }

  /**
   * Get firstLine
   * @return firstLine
   */
  @javax.annotation.Nullable
  public String getFirstLine() {
    return firstLine;
  }

  public void setFirstLine(String firstLine) {
    this.firstLine = firstLine;
  }


  public PersonaAddressWrite secondLine(String secondLine) {
    this.secondLine = secondLine;
    return this;
  }

  /**
   * Get secondLine
   * @return secondLine
   */
  @javax.annotation.Nullable
  public String getSecondLine() {
    return secondLine;
  }

  public void setSecondLine(String secondLine) {
    this.secondLine = secondLine;
  }


  public PersonaAddressWrite buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Get buildingName
   * @return buildingName
   */
  @javax.annotation.Nullable
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }


  public PersonaAddressWrite buildingFloor(String buildingFloor) {
    this.buildingFloor = buildingFloor;
    return this;
  }

  /**
   * Get buildingFloor
   * @return buildingFloor
   */
  @javax.annotation.Nullable
  public String getBuildingFloor() {
    return buildingFloor;
  }

  public void setBuildingFloor(String buildingFloor) {
    this.buildingFloor = buildingFloor;
  }


  public PersonaAddressWrite gateOrPortalOrInboxCode(String gateOrPortalOrInboxCode) {
    this.gateOrPortalOrInboxCode = gateOrPortalOrInboxCode;
    return this;
  }

  /**
   * Get gateOrPortalOrInboxCode
   * @return gateOrPortalOrInboxCode
   */
  @javax.annotation.Nullable
  public String getGateOrPortalOrInboxCode() {
    return gateOrPortalOrInboxCode;
  }

  public void setGateOrPortalOrInboxCode(String gateOrPortalOrInboxCode) {
    this.gateOrPortalOrInboxCode = gateOrPortalOrInboxCode;
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
    sb.append("class PersonaAddressWrite {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    firstLine: ").append(toIndentedString(firstLine)).append("\n");
    sb.append("    secondLine: ").append(toIndentedString(secondLine)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    buildingFloor: ").append(toIndentedString(buildingFloor)).append("\n");
    sb.append("    gateOrPortalOrInboxCode: ").append(toIndentedString(gateOrPortalOrInboxCode)).append("\n");
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
    openapiFields.add("countryCode");
    openapiFields.add("zipCode");
    openapiFields.add("cityName");
    openapiFields.add("firstLine");
    openapiFields.add("secondLine");
    openapiFields.add("buildingName");
    openapiFields.add("buildingFloor");
    openapiFields.add("gateOrPortalOrInboxCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PersonaAddressWrite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PersonaAddressWrite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonaAddressWrite is not found in the empty JSON string", PersonaAddressWrite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PersonaAddressWrite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonaAddressWrite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
      if ((jsonObj.get("cityName") != null && !jsonObj.get("cityName").isJsonNull()) && !jsonObj.get("cityName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cityName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cityName").toString()));
      }
      if ((jsonObj.get("firstLine") != null && !jsonObj.get("firstLine").isJsonNull()) && !jsonObj.get("firstLine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstLine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstLine").toString()));
      }
      if ((jsonObj.get("secondLine") != null && !jsonObj.get("secondLine").isJsonNull()) && !jsonObj.get("secondLine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondLine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondLine").toString()));
      }
      if ((jsonObj.get("buildingName") != null && !jsonObj.get("buildingName").isJsonNull()) && !jsonObj.get("buildingName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildingName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildingName").toString()));
      }
      if ((jsonObj.get("buildingFloor") != null && !jsonObj.get("buildingFloor").isJsonNull()) && !jsonObj.get("buildingFloor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buildingFloor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buildingFloor").toString()));
      }
      if ((jsonObj.get("gateOrPortalOrInboxCode") != null && !jsonObj.get("gateOrPortalOrInboxCode").isJsonNull()) && !jsonObj.get("gateOrPortalOrInboxCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gateOrPortalOrInboxCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gateOrPortalOrInboxCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonaAddressWrite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonaAddressWrite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonaAddressWrite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonaAddressWrite.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonaAddressWrite>() {
           @Override
           public void write(JsonWriter out, PersonaAddressWrite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonaAddressWrite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PersonaAddressWrite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PersonaAddressWrite
   * @throws IOException if the JSON string is invalid with respect to PersonaAddressWrite
   */
  public static PersonaAddressWrite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonaAddressWrite.class);
  }

  /**
   * Convert an instance of PersonaAddressWrite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

