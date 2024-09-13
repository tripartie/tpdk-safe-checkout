/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.69
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
import com.tripartie.safecheckout.model.OfferMediaRead;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T06:22:51.310403Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferOrganizationRead {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_CUSTOM_BASE_URL = "customBaseUrl";
  @SerializedName(SERIALIZED_NAME_CUSTOM_BASE_URL)
  private String customBaseUrl;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private OfferMediaRead icon;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private OfferMediaRead logo;

  public static final String SERIALIZED_NAME_PRIMARY_COLOR = "primaryColor";
  @SerializedName(SERIALIZED_NAME_PRIMARY_COLOR)
  private String primaryColor;

  public OfferOrganizationRead() {
  }

  public OfferOrganizationRead name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public OfferOrganizationRead websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * Get websiteUrl
   * @return websiteUrl
   */
  @javax.annotation.Nullable
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  public OfferOrganizationRead customBaseUrl(String customBaseUrl) {
    this.customBaseUrl = customBaseUrl;
    return this;
  }

  /**
   * Get customBaseUrl
   * @return customBaseUrl
   */
  @javax.annotation.Nullable
  public String getCustomBaseUrl() {
    return customBaseUrl;
  }

  public void setCustomBaseUrl(String customBaseUrl) {
    this.customBaseUrl = customBaseUrl;
  }


  public OfferOrganizationRead icon(OfferMediaRead icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @javax.annotation.Nullable
  public OfferMediaRead getIcon() {
    return icon;
  }

  public void setIcon(OfferMediaRead icon) {
    this.icon = icon;
  }


  public OfferOrganizationRead logo(OfferMediaRead logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  public OfferMediaRead getLogo() {
    return logo;
  }

  public void setLogo(OfferMediaRead logo) {
    this.logo = logo;
  }


  public OfferOrganizationRead primaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }

  /**
   * Get primaryColor
   * @return primaryColor
   */
  @javax.annotation.Nullable
  public String getPrimaryColor() {
    return primaryColor;
  }

  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
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
    sb.append("class OfferOrganizationRead {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    customBaseUrl: ").append(toIndentedString(customBaseUrl)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("websiteUrl");
    openapiFields.add("customBaseUrl");
    openapiFields.add("icon");
    openapiFields.add("logo");
    openapiFields.add("primaryColor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OfferOrganizationRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferOrganizationRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferOrganizationRead is not found in the empty JSON string", OfferOrganizationRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferOrganizationRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferOrganizationRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
      if ((jsonObj.get("customBaseUrl") != null && !jsonObj.get("customBaseUrl").isJsonNull()) && !jsonObj.get("customBaseUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customBaseUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customBaseUrl").toString()));
      }
      // validate the optional field `icon`
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) {
        OfferMediaRead.validateJsonElement(jsonObj.get("icon"));
      }
      // validate the optional field `logo`
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) {
        OfferMediaRead.validateJsonElement(jsonObj.get("logo"));
      }
      if ((jsonObj.get("primaryColor") != null && !jsonObj.get("primaryColor").isJsonNull()) && !jsonObj.get("primaryColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryColor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferOrganizationRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferOrganizationRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferOrganizationRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferOrganizationRead.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferOrganizationRead>() {
           @Override
           public void write(JsonWriter out, OfferOrganizationRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferOrganizationRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferOrganizationRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferOrganizationRead
   * @throws IOException if the JSON string is invalid with respect to OfferOrganizationRead
   */
  public static OfferOrganizationRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferOrganizationRead.class);
  }

  /**
   * Convert an instance of OfferOrganizationRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

