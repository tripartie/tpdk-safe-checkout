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
import java.io.IOException;
import java.util.Arrays;

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
public class UserTotpToggleWrite {
  public static final String SERIALIZED_NAME_TOTP_ENABLED = "totpEnabled";
  @SerializedName(SERIALIZED_NAME_TOTP_ENABLED)
  private Boolean totpEnabled;

  public static final String SERIALIZED_NAME_TOTP_CHALLENGE = "totpChallenge";
  @SerializedName(SERIALIZED_NAME_TOTP_CHALLENGE)
  private String totpChallenge;

  public UserTotpToggleWrite() {
  }

  public UserTotpToggleWrite totpEnabled(Boolean totpEnabled) {
    this.totpEnabled = totpEnabled;
    return this;
  }

  /**
   * Get totpEnabled
   * @return totpEnabled
   */
  @javax.annotation.Nonnull
  public Boolean getTotpEnabled() {
    return totpEnabled;
  }

  public void setTotpEnabled(Boolean totpEnabled) {
    this.totpEnabled = totpEnabled;
  }


  public UserTotpToggleWrite totpChallenge(String totpChallenge) {
    this.totpChallenge = totpChallenge;
    return this;
  }

  /**
   * Get totpChallenge
   * @return totpChallenge
   */
  @javax.annotation.Nullable
  public String getTotpChallenge() {
    return totpChallenge;
  }

  public void setTotpChallenge(String totpChallenge) {
    this.totpChallenge = totpChallenge;
  }



  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTotpToggleWrite {\n");
    sb.append("    totpEnabled: ").append(toIndentedString(totpEnabled)).append("\n");
    sb.append("    totpChallenge: ").append(toIndentedString(totpChallenge)).append("\n");
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
    openapiFields.add("totpEnabled");
    openapiFields.add("totpChallenge");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("totpEnabled");
    openapiRequiredFields.add("totpChallenge");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserTotpToggleWrite
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserTotpToggleWrite.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserTotpToggleWrite is not found in the empty JSON string", UserTotpToggleWrite.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserTotpToggleWrite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserTotpToggleWrite` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserTotpToggleWrite.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("totpChallenge") != null && !jsonObj.get("totpChallenge").isJsonNull()) && !jsonObj.get("totpChallenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totpChallenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totpChallenge").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserTotpToggleWrite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserTotpToggleWrite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserTotpToggleWrite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserTotpToggleWrite.class));

       return (TypeAdapter<T>) new TypeAdapter<UserTotpToggleWrite>() {
           @Override
           public void write(JsonWriter out, UserTotpToggleWrite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserTotpToggleWrite read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserTotpToggleWrite given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserTotpToggleWrite
   * @throws IOException if the JSON string is invalid with respect to UserTotpToggleWrite
   */
  public static UserTotpToggleWrite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserTotpToggleWrite.class);
  }

  /**
   * Convert an instance of UserTotpToggleWrite to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

