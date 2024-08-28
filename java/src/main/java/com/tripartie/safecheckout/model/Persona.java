/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.23
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
import com.tripartie.safecheckout.model.Address;
import com.tripartie.safecheckout.model.Metadata;
import java.io.IOException;
import java.time.OffsetDateTime;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T04:52:53.273673Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Persona {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    OTHER("OTHER"),
    
    RATHER_NOT_SAY("RATHER_NOT_SAY");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      GenderEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender = GenderEnum.RATHER_NOT_SAY;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private Object dateOfBirth = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NUMBER = "mobilePhoneNumber";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NUMBER)
  private String mobilePhoneNumber;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<Metadata> metadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_OFFERS = "offers";
  @SerializedName(SERIALIZED_NAME_OFFERS)
  private List<String> offers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PURCHASES = "purchases";
  @SerializedName(SERIALIZED_NAME_PURCHASES)
  private List<String> purchases = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_OWNED_BY = "ownedBy";
  @SerializedName(SERIALIZED_NAME_OWNED_BY)
  private String ownedBy;

  public static final String SERIALIZED_NAME_OFFER_COUNT = "offerCount";
  @SerializedName(SERIALIZED_NAME_OFFER_COUNT)
  private Integer offerCount;

  public static final String SERIALIZED_NAME_PURCHASE_COUNT = "purchaseCount";
  @SerializedName(SERIALIZED_NAME_PURCHASE_COUNT)
  private Integer purchaseCount;

  public static final String SERIALIZED_NAME_REGISTERED = "registered";
  @SerializedName(SERIALIZED_NAME_REGISTERED)
  private Boolean registered;

  public Persona() {
  }

  public Persona(
     Integer id, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt, 
     Integer offerCount, 
     Integer purchaseCount, 
     Boolean registered
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.offerCount = offerCount;
    this.purchaseCount = purchaseCount;
    this.registered = registered;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }



  public Persona organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @javax.annotation.Nullable
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public Persona firstName(String firstName) {
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


  public Persona lastName(String lastName) {
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


  public Persona gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public Persona dateOfBirth(Object dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  public Object getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Object dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public Persona language(String language) {
    this.language = language;
    return this;
  }

  /**
   * That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements.
   * @return language
   */
  @javax.annotation.Nullable
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public Persona email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Persona mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

  /**
   * Get mobilePhoneNumber
   * @return mobilePhoneNumber
   */
  @javax.annotation.Nullable
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }


  public Persona address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  public Persona metadata(List<Metadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Persona addMetadataItem(Metadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * You can assign different meta to your Persona object for different purposes. eg. Ease searching.
   * @return metadata
   */
  @javax.annotation.Nullable
  public List<Metadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<Metadata> metadata) {
    this.metadata = metadata;
  }


  public Persona offers(List<String> offers) {
    this.offers = offers;
    return this;
  }

  public Persona addOffersItem(String offersItem) {
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
  @javax.annotation.Nonnull
  public List<String> getOffers() {
    return offers;
  }

  public void setOffers(List<String> offers) {
    this.offers = offers;
  }


  public Persona purchases(List<String> purchases) {
    this.purchases = purchases;
    return this;
  }

  public Persona addPurchasesItem(String purchasesItem) {
    if (this.purchases == null) {
      this.purchases = new ArrayList<>();
    }
    this.purchases.add(purchasesItem);
    return this;
  }

  /**
   * Get purchases
   * @return purchases
   */
  @javax.annotation.Nonnull
  public List<String> getPurchases() {
    return purchases;
  }

  public void setPurchases(List<String> purchases) {
    this.purchases = purchases;
  }


  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }



  public Persona ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * Get ownedBy
   * @return ownedBy
   */
  @javax.annotation.Nullable
  public String getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }


  /**
   * Issued Offers count owned by a given Persona
   * @return offerCount
   */
  @javax.annotation.Nullable
  public Integer getOfferCount() {
    return offerCount;
  }



  /**
   * Get purchaseCount
   * @return purchaseCount
   */
  @javax.annotation.Nullable
  public Integer getPurchaseCount() {
    return purchaseCount;
  }



  /**
   * Determine if the Persona have a Tripartie account
   * @return registered
   */
  @javax.annotation.Nullable
  public Boolean getRegistered() {
    return registered;
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
    sb.append("class Persona {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    purchases: ").append(toIndentedString(purchases)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    offerCount: ").append(toIndentedString(offerCount)).append("\n");
    sb.append("    purchaseCount: ").append(toIndentedString(purchaseCount)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
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
    openapiFields.add("organization");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("gender");
    openapiFields.add("dateOfBirth");
    openapiFields.add("language");
    openapiFields.add("email");
    openapiFields.add("mobilePhoneNumber");
    openapiFields.add("address");
    openapiFields.add("metadata");
    openapiFields.add("offers");
    openapiFields.add("purchases");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("ownedBy");
    openapiFields.add("offerCount");
    openapiFields.add("purchaseCount");
    openapiFields.add("registered");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offers");
    openapiRequiredFields.add("purchases");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Persona
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Persona.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Persona is not found in the empty JSON string", Persona.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Persona.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Persona` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Persona.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) && !jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      // validate the optional field `gender`
      if (jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) {
        GenderEnum.validateJsonElement(jsonObj.get("gender"));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("mobilePhoneNumber") != null && !jsonObj.get("mobilePhoneNumber").isJsonNull()) && !jsonObj.get("mobilePhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobilePhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobilePhoneNumber").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            Metadata.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("offers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("offers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offers` to be an array in the JSON string but got `%s`", jsonObj.get("offers").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("purchases") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("purchases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchases` to be an array in the JSON string but got `%s`", jsonObj.get("purchases").toString()));
      }
      if ((jsonObj.get("ownedBy") != null && !jsonObj.get("ownedBy").isJsonNull()) && !jsonObj.get("ownedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Persona.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Persona' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Persona> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Persona.class));

       return (TypeAdapter<T>) new TypeAdapter<Persona>() {
           @Override
           public void write(JsonWriter out, Persona value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Persona read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Persona given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Persona
   * @throws IOException if the JSON string is invalid with respect to Persona
   */
  public static Persona fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Persona.class);
  }

  /**
   * Convert an instance of Persona to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

