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
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class Media {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_EXTENSION = "extension";
  @SerializedName(SERIALIZED_NAME_EXTENSION)
  private String extension;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_PUBLIC_URL = "publicUrl";
  @SerializedName(SERIALIZED_NAME_PUBLIC_URL)
  private URI publicUrl;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_B64_ENCODED_TMP_FILE = "b64EncodedTmpFile";
  @SerializedName(SERIALIZED_NAME_B64_ENCODED_TMP_FILE)
  private String b64EncodedTmpFile;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  public static final String SERIALIZED_NAME_ORIGINAL = "original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private String original;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_OFFERS = "offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<String> offers = new ArrayList<>();

  public static final String SERIALIZED_NAME_THUMBNAIL_URL = "thumbnailUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_URL)
  private URI thumbnailUrl;

  public Media() {
  }

  public Media(
     Integer id, 
     URI thumbnailUrl
  ) {
    this();
    this.id = id;
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }



  public Media extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Get extension
   * @return extension
   */
  @javax.annotation.Nonnull
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  public Media filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
   */
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  public Media fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
   * @return fingerprint
   */
  @javax.annotation.Nonnull
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public Media publicUrl(URI publicUrl) {
    this.publicUrl = publicUrl;
    return this;
  }

  /**
   * Get publicUrl
   * @return publicUrl
   */
  @javax.annotation.Nonnull
  public URI getPublicUrl() {
    return publicUrl;
  }

  public void setPublicUrl(URI publicUrl) {
    this.publicUrl = publicUrl;
  }


  public Media _file(File _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   */
  @javax.annotation.Nullable
  public File getFile() {
    return _file;
  }

  public void setFile(File _file) {
    this._file = _file;
  }


  public Media b64EncodedTmpFile(String b64EncodedTmpFile) {
    this.b64EncodedTmpFile = b64EncodedTmpFile;
    return this;
  }

  /**
   * Get b64EncodedTmpFile
   * @return b64EncodedTmpFile
   */
  @javax.annotation.Nullable
  public String getB64EncodedTmpFile() {
    return b64EncodedTmpFile;
  }

  public void setB64EncodedTmpFile(String b64EncodedTmpFile) {
    this.b64EncodedTmpFile = b64EncodedTmpFile;
  }


  public Media thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Associated 374x374 pixels small thumbnail
   * @return thumbnail
   */
  @javax.annotation.Nullable
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public Media original(String original) {
    this.original = original;
    return this;
  }

  /**
   * Get original
   * @return original
   */
  @javax.annotation.Nullable
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }


  public Media owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public Media offers(List<String> offers) {
    this.offers = offers;
    return this;
  }

  public Media addOffersItem(String offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Get offers
   * @return offers
   */
  @javax.annotation.Nullable
  public List<String> getOffers() {
    return offers;
  }

  public void setOffers(List<String> offers) {
    this.offers = offers;
  }


  /**
   * Get thumbnailUrl
   * @return thumbnailUrl
   */
  @javax.annotation.Nullable
  public URI getThumbnailUrl() {
    return thumbnailUrl;
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
    sb.append("class Media {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    publicUrl: ").append(toIndentedString(publicUrl)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    b64EncodedTmpFile: ").append(toIndentedString(b64EncodedTmpFile)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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
    openapiFields.add("extension");
    openapiFields.add("filename");
    openapiFields.add("fingerprint");
    openapiFields.add("publicUrl");
    openapiFields.add("file");
    openapiFields.add("b64EncodedTmpFile");
    openapiFields.add("thumbnail");
    openapiFields.add("original");
    openapiFields.add("owner");
    openapiFields.add("offers");
    openapiFields.add("thumbnailUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extension");
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("fingerprint");
    openapiRequiredFields.add("publicUrl");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Media
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Media.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Media is not found in the empty JSON string", Media.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Media.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Media` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Media.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("extension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extension").toString()));
      }
      if (!jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if (!jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
      }
      if (!jsonObj.get("publicUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicUrl").toString()));
      }
      if ((jsonObj.get("b64EncodedTmpFile") != null && !jsonObj.get("b64EncodedTmpFile").isJsonNull()) && !jsonObj.get("b64EncodedTmpFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `b64EncodedTmpFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("b64EncodedTmpFile").toString()));
      }
      if ((jsonObj.get("thumbnail") != null && !jsonObj.get("thumbnail").isJsonNull()) && !jsonObj.get("thumbnail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail").toString()));
      }
      if ((jsonObj.get("original") != null && !jsonObj.get("original").isJsonNull()) && !jsonObj.get("original").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original").toString()));
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("offers") != null && !jsonObj.get("offers").isJsonNull() && !jsonObj.get("offers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offers` to be an array in the JSON string but got `%s`", jsonObj.get("offers").toString()));
      }
      if ((jsonObj.get("thumbnailUrl") != null && !jsonObj.get("thumbnailUrl").isJsonNull()) && !jsonObj.get("thumbnailUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnailUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnailUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Media.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Media' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Media> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Media.class));

       return (TypeAdapter<T>) new TypeAdapter<Media>() {
           @Override
           public void write(JsonWriter out, Media value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Media read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Media given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Media
   * @throws IOException if the JSON string is invalid with respect to Media
   */
  public static Media fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Media.class);
  }

  /**
   * Convert an instance of Media to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

