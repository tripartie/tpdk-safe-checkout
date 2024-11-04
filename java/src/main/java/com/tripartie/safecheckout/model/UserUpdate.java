/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.101
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
import com.tripartie.safecheckout.model.UserAddressUpdate;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T08:05:06.429813Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UserUpdate {
  public static final String SERIALIZED_NAME_MAIN_ADDRESS = "mainAddress";
  @SerializedName(SERIALIZED_NAME_MAIN_ADDRESS)
  private UserAddressUpdate mainAddress;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PUBLIC_NAME = "publicName";
  @SerializedName(SERIALIZED_NAME_PUBLIC_NAME)
  private String publicName;

  public static final String SERIALIZED_NAME_ROLE_IN_COMPANY = "roleInCompany";
  @SerializedName(SERIALIZED_NAME_ROLE_IN_COMPANY)
  private String roleInCompany;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private OffsetDateTime birthday;

  public static final String SERIALIZED_NAME_INTL_PHONE_NUMBER = "intlPhoneNumber";
  @SerializedName(SERIALIZED_NAME_INTL_PHONE_NUMBER)
  private String intlPhoneNumber;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY = "originCountry";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY)
  private String originCountry;

  public static final String SERIALIZED_NAME_HOME_COUNTRY = "homeCountry";
  @SerializedName(SERIALIZED_NAME_HOME_COUNTRY)
  private String homeCountry;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGE = "preferredLanguage";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGE)
  private String preferredLanguage;

  public static final String SERIALIZED_NAME_CONSENT_MAIL_ADS = "consentMailAds";
  @SerializedName(SERIALIZED_NAME_CONSENT_MAIL_ADS)
  private Boolean consentMailAds;

  public static final String SERIALIZED_NAME_TIME_ZONE_OFFSET = "timeZoneOffset";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_OFFSET)
  private Integer timeZoneOffset;

  public UserUpdate() {
  }

  public UserUpdate mainAddress(UserAddressUpdate mainAddress) {
    this.mainAddress = mainAddress;
    return this;
  }

  /**
   * Get mainAddress
   * @return mainAddress
   */
  @javax.annotation.Nullable
  public UserAddressUpdate getMainAddress() {
    return mainAddress;
  }

  public void setMainAddress(UserAddressUpdate mainAddress) {
    this.mainAddress = mainAddress;
  }


  public UserUpdate firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserUpdate lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserUpdate publicName(String publicName) {
    this.publicName = publicName;
    return this;
  }

  /**
   * Get publicName
   * @return publicName
   */
  @javax.annotation.Nullable
  public String getPublicName() {
    return publicName;
  }

  public void setPublicName(String publicName) {
    this.publicName = publicName;
  }


  public UserUpdate roleInCompany(String roleInCompany) {
    this.roleInCompany = roleInCompany;
    return this;
  }

  /**
   * Get roleInCompany
   * @return roleInCompany
   */
  @javax.annotation.Nullable
  public String getRoleInCompany() {
    return roleInCompany;
  }

  public void setRoleInCompany(String roleInCompany) {
    this.roleInCompany = roleInCompany;
  }


  public UserUpdate birthday(OffsetDateTime birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBirthday() {
    return birthday;
  }

  public void setBirthday(OffsetDateTime birthday) {
    this.birthday = birthday;
  }


  public UserUpdate intlPhoneNumber(String intlPhoneNumber) {
    this.intlPhoneNumber = intlPhoneNumber;
    return this;
  }

  /**
   * Get intlPhoneNumber
   * @return intlPhoneNumber
   */
  @javax.annotation.Nullable
  public String getIntlPhoneNumber() {
    return intlPhoneNumber;
  }

  public void setIntlPhoneNumber(String intlPhoneNumber) {
    this.intlPhoneNumber = intlPhoneNumber;
  }


  public UserUpdate originCountry(String originCountry) {
    this.originCountry = originCountry;
    return this;
  }

  /**
   * The nationality of the current user.
   * @return originCountry
   */
  @javax.annotation.Nullable
  public String getOriginCountry() {
    return originCountry;
  }

  public void setOriginCountry(String originCountry) {
    this.originCountry = originCountry;
  }


  public UserUpdate homeCountry(String homeCountry) {
    this.homeCountry = homeCountry;
    return this;
  }

  /**
   * The originating country
   * @return homeCountry
   */
  @javax.annotation.Nullable
  public String getHomeCountry() {
    return homeCountry;
  }

  public void setHomeCountry(String homeCountry) {
    this.homeCountry = homeCountry;
  }


  public UserUpdate preferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
    return this;
  }

  /**
   * Get preferredLanguage
   * @return preferredLanguage
   */
  @javax.annotation.Nullable
  public String getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(String preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }


  public UserUpdate consentMailAds(Boolean consentMailAds) {
    this.consentMailAds = consentMailAds;
    return this;
  }

  /**
   * Get consentMailAds
   * @return consentMailAds
   */
  @javax.annotation.Nonnull
  public Boolean getConsentMailAds() {
    return consentMailAds;
  }

  public void setConsentMailAds(Boolean consentMailAds) {
    this.consentMailAds = consentMailAds;
  }


  public UserUpdate timeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

  /**
   * Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention.
   * @return timeZoneOffset
   */
  @javax.annotation.Nullable
  public Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }

  public void setTimeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
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
    sb.append("class UserUpdate {\n");
    sb.append("    mainAddress: ").append(toIndentedString(mainAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
    sb.append("    roleInCompany: ").append(toIndentedString(roleInCompany)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    intlPhoneNumber: ").append(toIndentedString(intlPhoneNumber)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    homeCountry: ").append(toIndentedString(homeCountry)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    consentMailAds: ").append(toIndentedString(consentMailAds)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
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
    openapiFields.add("mainAddress");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("publicName");
    openapiFields.add("roleInCompany");
    openapiFields.add("birthday");
    openapiFields.add("intlPhoneNumber");
    openapiFields.add("originCountry");
    openapiFields.add("homeCountry");
    openapiFields.add("preferredLanguage");
    openapiFields.add("consentMailAds");
    openapiFields.add("timeZoneOffset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("consentMailAds");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserUpdate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserUpdate is not found in the empty JSON string", UserUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserUpdate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserUpdate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `mainAddress`
      if (jsonObj.get("mainAddress") != null && !jsonObj.get("mainAddress").isJsonNull()) {
        UserAddressUpdate.validateJsonElement(jsonObj.get("mainAddress"));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("publicName") != null && !jsonObj.get("publicName").isJsonNull()) && !jsonObj.get("publicName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicName").toString()));
      }
      if ((jsonObj.get("roleInCompany") != null && !jsonObj.get("roleInCompany").isJsonNull()) && !jsonObj.get("roleInCompany").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleInCompany` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleInCompany").toString()));
      }
      if ((jsonObj.get("intlPhoneNumber") != null && !jsonObj.get("intlPhoneNumber").isJsonNull()) && !jsonObj.get("intlPhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `intlPhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("intlPhoneNumber").toString()));
      }
      if ((jsonObj.get("originCountry") != null && !jsonObj.get("originCountry").isJsonNull()) && !jsonObj.get("originCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originCountry").toString()));
      }
      if ((jsonObj.get("homeCountry") != null && !jsonObj.get("homeCountry").isJsonNull()) && !jsonObj.get("homeCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homeCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homeCountry").toString()));
      }
      if ((jsonObj.get("preferredLanguage") != null && !jsonObj.get("preferredLanguage").isJsonNull()) && !jsonObj.get("preferredLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredLanguage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<UserUpdate>() {
           @Override
           public void write(JsonWriter out, UserUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserUpdate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserUpdate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserUpdate
   * @throws IOException if the JSON string is invalid with respect to UserUpdate
   */
  public static UserUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserUpdate.class);
  }

  /**
   * Convert an instance of UserUpdate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

