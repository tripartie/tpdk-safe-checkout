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
import com.tripartie.safecheckout.model.BankAccountUserRead;
import com.tripartie.safecheckout.model.CardUserRead;
import com.tripartie.safecheckout.model.MediaUserRead;
import com.tripartie.safecheckout.model.OrganizationUserRead;
import com.tripartie.safecheckout.model.PersonaUserRead;
import com.tripartie.safecheckout.model.WalletUserRead;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-30T09:25:05.553740Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UserUserRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MAIN_ADDRESS = "mainAddress";
  @SerializedName(SERIALIZED_NAME_MAIN_ADDRESS)
  private Object mainAddress;

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

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * Gets or Sets roles
   */
  @JsonAdapter(RolesEnum.Adapter.class)
  public enum RolesEnum {
    ORGANIZATION_OWNER("ROLE_ORGANIZATION_OWNER"),
    
    ADMIN("ROLE_ADMIN"),
    
    CONSULTANT("ROLE_CONSULTANT"),
    
    ACCOUNTING_MANAGER("ROLE_ACCOUNTING_MANAGER"),
    
    BILLING_MANAGER("ROLE_BILLING_MANAGER"),
    
    CUSTOMER_SERVICE("ROLE_CUSTOMER_SERVICE"),
    
    PLATFORM_SUPPORT("ROLE_PLATFORM_SUPPORT"),
    
    PLATFORM_ADMIN("ROLE_PLATFORM_ADMIN"),
    
    USER("ROLE_USER");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RolesEnum fromValue(String value) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RolesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RolesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RolesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<RolesEnum> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTP_ENABLED = "totpEnabled";
  @SerializedName(SERIALIZED_NAME_TOTP_ENABLED)
  private Boolean totpEnabled;

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

  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_LOG_IN = "lastSuccessfulLogIn";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_LOG_IN)
  private OffsetDateTime lastSuccessfulLogIn;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private MediaUserRead avatar;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CONSENT_MAIL_ADS = "consentMailAds";
  @SerializedName(SERIALIZED_NAME_CONSENT_MAIL_ADS)
  private Boolean consentMailAds;

  public static final String SERIALIZED_NAME_LOCKDOWN = "lockdown";
  @SerializedName(SERIALIZED_NAME_LOCKDOWN)
  private Boolean lockdown;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationUserRead organization;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bankAccount";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private BankAccountUserRead bankAccount;

  public static final String SERIALIZED_NAME_IDENTITY_VERIFIED_AT = "identityVerifiedAt";
  @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFIED_AT)
  private OffsetDateTime identityVerifiedAt;

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private List<PersonaUserRead> profiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_CARDS = "cards";
  @SerializedName(SERIALIZED_NAME_CARDS)
  private List<CardUserRead> cards = new ArrayList<>();

  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private WalletUserRead wallet;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_CREATED_AT = "providerCreatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CREATED_AT)
  private OffsetDateTime providerCreatedAt;

  public static final String SERIALIZED_NAME_PROVIDER_UPDATED_AT = "providerUpdatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_UPDATED_AT)
  private OffsetDateTime providerUpdatedAt;

  public static final String SERIALIZED_NAME_IRI = "iri";
  @SerializedName(SERIALIZED_NAME_IRI)
  private String iri;

  public static final String SERIALIZED_NAME_IMPERSONATING_ORGANIZATION = "impersonatingOrganization";
  @SerializedName(SERIALIZED_NAME_IMPERSONATING_ORGANIZATION)
  private Boolean impersonatingOrganization;

  public static final String SERIALIZED_NAME_SECOND_AUTH_FACTOR = "secondAuthFactor";
  @SerializedName(SERIALIZED_NAME_SECOND_AUTH_FACTOR)
  private Boolean secondAuthFactor;

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

  public UserUserRead() {
  }

  public UserUserRead(
     Integer id, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt, 
     OffsetDateTime providerCreatedAt, 
     OffsetDateTime providerUpdatedAt, 
     String iri, 
     Boolean impersonatingOrganization, 
     Boolean secondAuthFactor, 
     ProcessorStatusEnum processorStatus
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.providerCreatedAt = providerCreatedAt;
    this.providerUpdatedAt = providerUpdatedAt;
    this.iri = iri;
    this.impersonatingOrganization = impersonatingOrganization;
    this.secondAuthFactor = secondAuthFactor;
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



  public UserUserRead mainAddress(Object mainAddress) {
    this.mainAddress = mainAddress;
    return this;
  }

  /**
   * 
   * @return mainAddress
   */
  @javax.annotation.Nullable
  public Object getMainAddress() {
    return mainAddress;
  }

  public void setMainAddress(Object mainAddress) {
    this.mainAddress = mainAddress;
  }


  public UserUserRead firstName(String firstName) {
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


  public UserUserRead lastName(String lastName) {
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


  public UserUserRead publicName(String publicName) {
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


  public UserUserRead roleInCompany(String roleInCompany) {
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


  public UserUserRead birthday(OffsetDateTime birthday) {
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


  public UserUserRead email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public UserUserRead roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public UserUserRead addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }


  public UserUserRead totpEnabled(Boolean totpEnabled) {
    this.totpEnabled = totpEnabled;
    return this;
  }

  /**
   * Get totpEnabled
   * @return totpEnabled
   */
  @javax.annotation.Nullable
  public Boolean getTotpEnabled() {
    return totpEnabled;
  }

  public void setTotpEnabled(Boolean totpEnabled) {
    this.totpEnabled = totpEnabled;
  }


  public UserUserRead intlPhoneNumber(String intlPhoneNumber) {
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


  public UserUserRead originCountry(String originCountry) {
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


  public UserUserRead homeCountry(String homeCountry) {
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


  public UserUserRead preferredLanguage(String preferredLanguage) {
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


  public UserUserRead lastSuccessfulLogIn(OffsetDateTime lastSuccessfulLogIn) {
    this.lastSuccessfulLogIn = lastSuccessfulLogIn;
    return this;
  }

  /**
   * Get lastSuccessfulLogIn
   * @return lastSuccessfulLogIn
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastSuccessfulLogIn() {
    return lastSuccessfulLogIn;
  }

  public void setLastSuccessfulLogIn(OffsetDateTime lastSuccessfulLogIn) {
    this.lastSuccessfulLogIn = lastSuccessfulLogIn;
  }


  public UserUserRead avatar(MediaUserRead avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Get avatar
   * @return avatar
   */
  @javax.annotation.Nullable
  public MediaUserRead getAvatar() {
    return avatar;
  }

  public void setAvatar(MediaUserRead avatar) {
    this.avatar = avatar;
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



  public UserUserRead consentMailAds(Boolean consentMailAds) {
    this.consentMailAds = consentMailAds;
    return this;
  }

  /**
   * Get consentMailAds
   * @return consentMailAds
   */
  @javax.annotation.Nullable
  public Boolean getConsentMailAds() {
    return consentMailAds;
  }

  public void setConsentMailAds(Boolean consentMailAds) {
    this.consentMailAds = consentMailAds;
  }


  public UserUserRead lockdown(Boolean lockdown) {
    this.lockdown = lockdown;
    return this;
  }

  /**
   * Get lockdown
   * @return lockdown
   */
  @javax.annotation.Nullable
  public Boolean getLockdown() {
    return lockdown;
  }

  public void setLockdown(Boolean lockdown) {
    this.lockdown = lockdown;
  }


  public UserUserRead organization(OrganizationUserRead organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @javax.annotation.Nullable
  public OrganizationUserRead getOrganization() {
    return organization;
  }

  public void setOrganization(OrganizationUserRead organization) {
    this.organization = organization;
  }


  public UserUserRead bankAccount(BankAccountUserRead bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  /**
   * Get bankAccount
   * @return bankAccount
   */
  @javax.annotation.Nullable
  public BankAccountUserRead getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(BankAccountUserRead bankAccount) {
    this.bankAccount = bankAccount;
  }


  public UserUserRead identityVerifiedAt(OffsetDateTime identityVerifiedAt) {
    this.identityVerifiedAt = identityVerifiedAt;
    return this;
  }

  /**
   * Get identityVerifiedAt
   * @return identityVerifiedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getIdentityVerifiedAt() {
    return identityVerifiedAt;
  }

  public void setIdentityVerifiedAt(OffsetDateTime identityVerifiedAt) {
    this.identityVerifiedAt = identityVerifiedAt;
  }


  public UserUserRead profiles(List<PersonaUserRead> profiles) {
    this.profiles = profiles;
    return this;
  }

  public UserUserRead addProfilesItem(PersonaUserRead profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * Get profiles
   * @return profiles
   */
  @javax.annotation.Nullable
  public List<PersonaUserRead> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<PersonaUserRead> profiles) {
    this.profiles = profiles;
  }


  public UserUserRead cards(List<CardUserRead> cards) {
    this.cards = cards;
    return this;
  }

  public UserUserRead addCardsItem(CardUserRead cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<>();
    }
    this.cards.add(cardsItem);
    return this;
  }

  /**
   * Get cards
   * @return cards
   */
  @javax.annotation.Nullable
  public List<CardUserRead> getCards() {
    return cards;
  }

  public void setCards(List<CardUserRead> cards) {
    this.cards = cards;
  }


  public UserUserRead wallet(WalletUserRead wallet) {
    this.wallet = wallet;
    return this;
  }

  /**
   * Get wallet
   * @return wallet
   */
  @javax.annotation.Nullable
  public WalletUserRead getWallet() {
    return wallet;
  }

  public void setWallet(WalletUserRead wallet) {
    this.wallet = wallet;
  }


  public UserUserRead providerName(String providerName) {
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


  /**
   * Get providerCreatedAt
   * @return providerCreatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderCreatedAt() {
    return providerCreatedAt;
  }



  /**
   * Get providerUpdatedAt
   * @return providerUpdatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderUpdatedAt() {
    return providerUpdatedAt;
  }



  /**
   * Get iri
   * @return iri
   */
  @javax.annotation.Nullable
  public String getIri() {
    return iri;
  }



  /**
   * Get impersonatingOrganization
   * @return impersonatingOrganization
   */
  @javax.annotation.Nullable
  public Boolean getImpersonatingOrganization() {
    return impersonatingOrganization;
  }



  /**
   * Get secondAuthFactor
   * @return secondAuthFactor
   */
  @javax.annotation.Nullable
  public Boolean getSecondAuthFactor() {
    return secondAuthFactor;
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
    sb.append("class UserUserRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mainAddress: ").append(toIndentedString(mainAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    publicName: ").append(toIndentedString(publicName)).append("\n");
    sb.append("    roleInCompany: ").append(toIndentedString(roleInCompany)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    totpEnabled: ").append(toIndentedString(totpEnabled)).append("\n");
    sb.append("    intlPhoneNumber: ").append(toIndentedString(intlPhoneNumber)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    homeCountry: ").append(toIndentedString(homeCountry)).append("\n");
    sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
    sb.append("    lastSuccessfulLogIn: ").append(toIndentedString(lastSuccessfulLogIn)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    consentMailAds: ").append(toIndentedString(consentMailAds)).append("\n");
    sb.append("    lockdown: ").append(toIndentedString(lockdown)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    identityVerifiedAt: ").append(toIndentedString(identityVerifiedAt)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerCreatedAt: ").append(toIndentedString(providerCreatedAt)).append("\n");
    sb.append("    providerUpdatedAt: ").append(toIndentedString(providerUpdatedAt)).append("\n");
    sb.append("    iri: ").append(toIndentedString(iri)).append("\n");
    sb.append("    impersonatingOrganization: ").append(toIndentedString(impersonatingOrganization)).append("\n");
    sb.append("    secondAuthFactor: ").append(toIndentedString(secondAuthFactor)).append("\n");
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
    openapiFields.add("mainAddress");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("publicName");
    openapiFields.add("roleInCompany");
    openapiFields.add("birthday");
    openapiFields.add("email");
    openapiFields.add("roles");
    openapiFields.add("totpEnabled");
    openapiFields.add("intlPhoneNumber");
    openapiFields.add("originCountry");
    openapiFields.add("homeCountry");
    openapiFields.add("preferredLanguage");
    openapiFields.add("lastSuccessfulLogIn");
    openapiFields.add("avatar");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("consentMailAds");
    openapiFields.add("lockdown");
    openapiFields.add("organization");
    openapiFields.add("bankAccount");
    openapiFields.add("identityVerifiedAt");
    openapiFields.add("profiles");
    openapiFields.add("cards");
    openapiFields.add("wallet");
    openapiFields.add("providerName");
    openapiFields.add("providerCreatedAt");
    openapiFields.add("providerUpdatedAt");
    openapiFields.add("iri");
    openapiFields.add("impersonatingOrganization");
    openapiFields.add("secondAuthFactor");
    openapiFields.add("processorStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserUserRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserUserRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserUserRead is not found in the empty JSON string", UserUserRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserUserRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserUserRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserUserRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull() && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
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
      // validate the optional field `avatar`
      if (jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonNull()) {
        MediaUserRead.validateJsonElement(jsonObj.get("avatar"));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        OrganizationUserRead.validateJsonElement(jsonObj.get("organization"));
      }
      // validate the optional field `bankAccount`
      if (jsonObj.get("bankAccount") != null && !jsonObj.get("bankAccount").isJsonNull()) {
        BankAccountUserRead.validateJsonElement(jsonObj.get("bankAccount"));
      }
      if (jsonObj.get("profiles") != null && !jsonObj.get("profiles").isJsonNull()) {
        JsonArray jsonArrayprofiles = jsonObj.getAsJsonArray("profiles");
        if (jsonArrayprofiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("profiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `profiles` to be an array in the JSON string but got `%s`", jsonObj.get("profiles").toString()));
          }

          // validate the optional field `profiles` (array)
          for (int i = 0; i < jsonArrayprofiles.size(); i++) {
            PersonaUserRead.validateJsonElement(jsonArrayprofiles.get(i));
          };
        }
      }
      if (jsonObj.get("cards") != null && !jsonObj.get("cards").isJsonNull()) {
        JsonArray jsonArraycards = jsonObj.getAsJsonArray("cards");
        if (jsonArraycards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cards` to be an array in the JSON string but got `%s`", jsonObj.get("cards").toString()));
          }

          // validate the optional field `cards` (array)
          for (int i = 0; i < jsonArraycards.size(); i++) {
            CardUserRead.validateJsonElement(jsonArraycards.get(i));
          };
        }
      }
      // validate the optional field `wallet`
      if (jsonObj.get("wallet") != null && !jsonObj.get("wallet").isJsonNull()) {
        WalletUserRead.validateJsonElement(jsonObj.get("wallet"));
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("iri") != null && !jsonObj.get("iri").isJsonNull()) && !jsonObj.get("iri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iri").toString()));
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
       if (!UserUserRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserUserRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserUserRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserUserRead.class));

       return (TypeAdapter<T>) new TypeAdapter<UserUserRead>() {
           @Override
           public void write(JsonWriter out, UserUserRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserUserRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserUserRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserUserRead
   * @throws IOException if the JSON string is invalid with respect to UserUserRead
   */
  public static UserUserRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserUserRead.class);
  }

  /**
   * Convert an instance of UserUserRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

