/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.51
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
import com.tripartie.safecheckout.model.OrganizationMediaCollectionRead;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T06:02:15.620038Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrganizationCollectionRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VAT_NUMBER = "vatNumber";
  @SerializedName(SERIALIZED_NAME_VAT_NUMBER)
  private String vatNumber;

  public static final String SERIALIZED_NAME_COMMERCIAL_REGISTRY_NUMBER = "commercialRegistryNumber";
  @SerializedName(SERIALIZED_NAME_COMMERCIAL_REGISTRY_NUMBER)
  private String commercialRegistryNumber;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "websiteUrl";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private OrganizationMediaCollectionRead icon;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private OrganizationMediaCollectionRead logo;

  public OrganizationCollectionRead() {
  }

  public OrganizationCollectionRead(
     Integer id
  ) {
    this();
    this.id = id;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }



  public OrganizationCollectionRead name(String name) {
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


  public OrganizationCollectionRead vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

  /**
   * Get vatNumber
   * @return vatNumber
   */
  @javax.annotation.Nullable
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }


  public OrganizationCollectionRead commercialRegistryNumber(String commercialRegistryNumber) {
    this.commercialRegistryNumber = commercialRegistryNumber;
    return this;
  }

  /**
   * Get commercialRegistryNumber
   * @return commercialRegistryNumber
   */
  @javax.annotation.Nullable
  public String getCommercialRegistryNumber() {
    return commercialRegistryNumber;
  }

  public void setCommercialRegistryNumber(String commercialRegistryNumber) {
    this.commercialRegistryNumber = commercialRegistryNumber;
  }


  public OrganizationCollectionRead websiteUrl(String websiteUrl) {
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


  public OrganizationCollectionRead icon(OrganizationMediaCollectionRead icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @javax.annotation.Nullable
  public OrganizationMediaCollectionRead getIcon() {
    return icon;
  }

  public void setIcon(OrganizationMediaCollectionRead icon) {
    this.icon = icon;
  }


  public OrganizationCollectionRead logo(OrganizationMediaCollectionRead logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @javax.annotation.Nullable
  public OrganizationMediaCollectionRead getLogo() {
    return logo;
  }

  public void setLogo(OrganizationMediaCollectionRead logo) {
    this.logo = logo;
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
    sb.append("class OrganizationCollectionRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    commercialRegistryNumber: ").append(toIndentedString(commercialRegistryNumber)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("vatNumber");
    openapiFields.add("commercialRegistryNumber");
    openapiFields.add("websiteUrl");
    openapiFields.add("icon");
    openapiFields.add("logo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrganizationCollectionRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrganizationCollectionRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationCollectionRead is not found in the empty JSON string", OrganizationCollectionRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrganizationCollectionRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationCollectionRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("vatNumber") != null && !jsonObj.get("vatNumber").isJsonNull()) && !jsonObj.get("vatNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vatNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vatNumber").toString()));
      }
      if ((jsonObj.get("commercialRegistryNumber") != null && !jsonObj.get("commercialRegistryNumber").isJsonNull()) && !jsonObj.get("commercialRegistryNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commercialRegistryNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commercialRegistryNumber").toString()));
      }
      if ((jsonObj.get("websiteUrl") != null && !jsonObj.get("websiteUrl").isJsonNull()) && !jsonObj.get("websiteUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `websiteUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("websiteUrl").toString()));
      }
      // validate the optional field `icon`
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) {
        OrganizationMediaCollectionRead.validateJsonElement(jsonObj.get("icon"));
      }
      // validate the optional field `logo`
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) {
        OrganizationMediaCollectionRead.validateJsonElement(jsonObj.get("logo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationCollectionRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationCollectionRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationCollectionRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationCollectionRead.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationCollectionRead>() {
           @Override
           public void write(JsonWriter out, OrganizationCollectionRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationCollectionRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrganizationCollectionRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrganizationCollectionRead
   * @throws IOException if the JSON string is invalid with respect to OrganizationCollectionRead
   */
  public static OrganizationCollectionRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationCollectionRead.class);
  }

  /**
   * Convert an instance of OrganizationCollectionRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

