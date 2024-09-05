/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.48
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
import com.tripartie.safecheckout.model.TransactionCardRead;
import com.tripartie.safecheckout.model.TransactionOfferRead;
import com.tripartie.safecheckout.model.TransactionParcelRead;
import com.tripartie.safecheckout.model.TransactionPersonaRead;
import com.tripartie.safecheckout.model.TransactionQuoteRead;
import com.tripartie.safecheckout.model.TransactionWalletRead;
import java.io.IOException;
import java.math.BigDecimal;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-05T17:43:14.157346Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TransactionRead {
  public static final String SERIALIZED_NAME_ULID = "ulid";
  @SerializedName(SERIALIZED_NAME_ULID)
  private String ulid;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  private TransactionOfferRead offer;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  private TransactionQuoteRead quote;

  public static final String SERIALIZED_NAME_BUYER_MESSAGE = "buyerMessage";
  @SerializedName(SERIALIZED_NAME_BUYER_MESSAGE)
  private String buyerMessage;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private TransactionPersonaRead buyer;

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

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private BigDecimal fees;

  public static final String SERIALIZED_NAME_SUPPLEMENTAL_FEES = "supplementalFees";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTAL_FEES)
  private BigDecimal supplementalFees;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private TransactionCardRead card;

  public static final String SERIALIZED_NAME_ESCROW = "escrow";
  @SerializedName(SERIALIZED_NAME_ESCROW)
  private TransactionWalletRead escrow;

  public static final String SERIALIZED_NAME_REMOTE_PRE_AUTHORIZATION_ID = "remotePreAuthorizationId";
  @SerializedName(SERIALIZED_NAME_REMOTE_PRE_AUTHORIZATION_ID)
  private String remotePreAuthorizationId;

  public static final String SERIALIZED_NAME_REMOTE_PAY_IN_ID = "remotePayInId";
  @SerializedName(SERIALIZED_NAME_REMOTE_PAY_IN_ID)
  private String remotePayInId;

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

  public static final String SERIALIZED_NAME_HAND_OVER_CODE = "handOverCode";
  @SerializedName(SERIALIZED_NAME_HAND_OVER_CODE)
  private String handOverCode;

  public static final String SERIALIZED_NAME_PARCELS = "parcels";
  @SerializedName(SERIALIZED_NAME_PARCELS)
  private List<TransactionParcelRead> parcels = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_CREATED_AT = "providerCreatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CREATED_AT)
  private OffsetDateTime providerCreatedAt;

  public static final String SERIALIZED_NAME_PROVIDER_UPDATED_AT = "providerUpdatedAt";
  @SerializedName(SERIALIZED_NAME_PROVIDER_UPDATED_AT)
  private OffsetDateTime providerUpdatedAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public static final String SERIALIZED_NAME_TOTAL_CHARGED = "totalCharged";
  @SerializedName(SERIALIZED_NAME_TOTAL_CHARGED)
  private BigDecimal totalCharged;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "totalFees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private BigDecimal totalFees;

  /**
   * Determine who is awaited (actor) for the next transition
   */
  @JsonAdapter(AwaitedPartyEnum.Adapter.class)
  public enum AwaitedPartyEnum {
    BUYER("BUYER"),
    
    PLATFORM("PLATFORM"),
    
    SELLER("SELLER");

    private String value;

    AwaitedPartyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AwaitedPartyEnum fromValue(String value) {
      for (AwaitedPartyEnum b : AwaitedPartyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AwaitedPartyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AwaitedPartyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AwaitedPartyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AwaitedPartyEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AwaitedPartyEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AWAITED_PARTY = "awaitedParty";
  @SerializedName(SERIALIZED_NAME_AWAITED_PARTY)
  private AwaitedPartyEnum awaitedParty;

  public static final String SERIALIZED_NAME_STATUS_EXPIRATION = "statusExpiration";
  @SerializedName(SERIALIZED_NAME_STATUS_EXPIRATION)
  private OffsetDateTime statusExpiration;

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

  public TransactionRead() {
  }

  public TransactionRead(
     BigDecimal total, 
     BigDecimal totalCharged, 
     BigDecimal totalFees, 
     AwaitedPartyEnum awaitedParty, 
     OffsetDateTime statusExpiration, 
     ProcessorStatusEnum processorStatus
  ) {
    this();
    this.total = total;
    this.totalCharged = totalCharged;
    this.totalFees = totalFees;
    this.awaitedParty = awaitedParty;
    this.statusExpiration = statusExpiration;
    this.processorStatus = processorStatus;
  }

  public TransactionRead ulid(String ulid) {
    this.ulid = ulid;
    return this;
  }

  /**
   * Get ulid
   * @return ulid
   */
  @javax.annotation.Nonnull
  public String getUlid() {
    return ulid;
  }

  public void setUlid(String ulid) {
    this.ulid = ulid;
  }


  public TransactionRead offer(TransactionOfferRead offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @javax.annotation.Nonnull
  public TransactionOfferRead getOffer() {
    return offer;
  }

  public void setOffer(TransactionOfferRead offer) {
    this.offer = offer;
  }


  public TransactionRead quote(TransactionQuoteRead quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
   */
  @javax.annotation.Nonnull
  public TransactionQuoteRead getQuote() {
    return quote;
  }

  public void setQuote(TransactionQuoteRead quote) {
    this.quote = quote;
  }


  public TransactionRead buyerMessage(String buyerMessage) {
    this.buyerMessage = buyerMessage;
    return this;
  }

  /**
   * Attach a note. Only the buyer can exercise this right. At the creation.
   * @return buyerMessage
   */
  @javax.annotation.Nullable
  public String getBuyerMessage() {
    return buyerMessage;
  }

  public void setBuyerMessage(String buyerMessage) {
    this.buyerMessage = buyerMessage;
  }


  public TransactionRead buyer(TransactionPersonaRead buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
   */
  @javax.annotation.Nonnull
  public TransactionPersonaRead getBuyer() {
    return buyer;
  }

  public void setBuyer(TransactionPersonaRead buyer) {
    this.buyer = buyer;
  }


  public TransactionRead status(StatusEnum status) {
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


  public TransactionRead fees(BigDecimal fees) {
    this.fees = fees;
    return this;
  }

  /**
   * Get fees
   * @return fees
   */
  @javax.annotation.Nullable
  public BigDecimal getFees() {
    return fees;
  }

  public void setFees(BigDecimal fees) {
    this.fees = fees;
  }


  public TransactionRead supplementalFees(BigDecimal supplementalFees) {
    this.supplementalFees = supplementalFees;
    return this;
  }

  /**
   * Get supplementalFees
   * @return supplementalFees
   */
  @javax.annotation.Nullable
  public BigDecimal getSupplementalFees() {
    return supplementalFees;
  }

  public void setSupplementalFees(BigDecimal supplementalFees) {
    this.supplementalFees = supplementalFees;
  }


  public TransactionRead card(TransactionCardRead card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   */
  @javax.annotation.Nullable
  public TransactionCardRead getCard() {
    return card;
  }

  public void setCard(TransactionCardRead card) {
    this.card = card;
  }


  public TransactionRead escrow(TransactionWalletRead escrow) {
    this.escrow = escrow;
    return this;
  }

  /**
   * Get escrow
   * @return escrow
   */
  @javax.annotation.Nullable
  public TransactionWalletRead getEscrow() {
    return escrow;
  }

  public void setEscrow(TransactionWalletRead escrow) {
    this.escrow = escrow;
  }


  public TransactionRead remotePreAuthorizationId(String remotePreAuthorizationId) {
    this.remotePreAuthorizationId = remotePreAuthorizationId;
    return this;
  }

  /**
   * Get remotePreAuthorizationId
   * @return remotePreAuthorizationId
   */
  @javax.annotation.Nullable
  public String getRemotePreAuthorizationId() {
    return remotePreAuthorizationId;
  }

  public void setRemotePreAuthorizationId(String remotePreAuthorizationId) {
    this.remotePreAuthorizationId = remotePreAuthorizationId;
  }


  public TransactionRead remotePayInId(String remotePayInId) {
    this.remotePayInId = remotePayInId;
    return this;
  }

  /**
   * Get remotePayInId
   * @return remotePayInId
   */
  @javax.annotation.Nullable
  public String getRemotePayInId() {
    return remotePayInId;
  }

  public void setRemotePayInId(String remotePayInId) {
    this.remotePayInId = remotePayInId;
  }


  public TransactionRead balanceToRefund(BigDecimal balanceToRefund) {
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


  public TransactionRead feesToRefund(BigDecimal feesToRefund) {
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


  public TransactionRead forceRefundShipping(Boolean forceRefundShipping) {
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


  public TransactionRead review(String review) {
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


  public TransactionRead rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   */
  @javax.annotation.Nullable
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }


  public TransactionRead handOverCode(String handOverCode) {
    this.handOverCode = handOverCode;
    return this;
  }

  /**
   * Get handOverCode
   * @return handOverCode
   */
  @javax.annotation.Nullable
  public String getHandOverCode() {
    return handOverCode;
  }

  public void setHandOverCode(String handOverCode) {
    this.handOverCode = handOverCode;
  }


  public TransactionRead parcels(List<TransactionParcelRead> parcels) {
    this.parcels = parcels;
    return this;
  }

  public TransactionRead addParcelsItem(TransactionParcelRead parcelsItem) {
    if (this.parcels == null) {
      this.parcels = new ArrayList<>();
    }
    this.parcels.add(parcelsItem);
    return this;
  }

  /**
   * Get parcels
   * @return parcels
   */
  @javax.annotation.Nullable
  public List<TransactionParcelRead> getParcels() {
    return parcels;
  }

  public void setParcels(List<TransactionParcelRead> parcels) {
    this.parcels = parcels;
  }


  public TransactionRead createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionRead updatedAt(OffsetDateTime updatedAt) {
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


  public TransactionRead providerName(String providerName) {
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


  public TransactionRead providerCreatedAt(OffsetDateTime providerCreatedAt) {
    this.providerCreatedAt = providerCreatedAt;
    return this;
  }

  /**
   * Get providerCreatedAt
   * @return providerCreatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderCreatedAt() {
    return providerCreatedAt;
  }

  public void setProviderCreatedAt(OffsetDateTime providerCreatedAt) {
    this.providerCreatedAt = providerCreatedAt;
  }


  public TransactionRead providerUpdatedAt(OffsetDateTime providerUpdatedAt) {
    this.providerUpdatedAt = providerUpdatedAt;
    return this;
  }

  /**
   * Get providerUpdatedAt
   * @return providerUpdatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getProviderUpdatedAt() {
    return providerUpdatedAt;
  }

  public void setProviderUpdatedAt(OffsetDateTime providerUpdatedAt) {
    this.providerUpdatedAt = providerUpdatedAt;
  }


  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public BigDecimal getTotal() {
    return total;
  }



  /**
   * Get totalCharged
   * @return totalCharged
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalCharged() {
    return totalCharged;
  }



  /**
   * Get totalFees
   * @return totalFees
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalFees() {
    return totalFees;
  }



  /**
   * Determine who is awaited (actor) for the next transition
   * @return awaitedParty
   */
  @javax.annotation.Nullable
  public AwaitedPartyEnum getAwaitedParty() {
    return awaitedParty;
  }



  /**
   * Yield if eligible the date-time at which the transaction state expire.
   * @return statusExpiration
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStatusExpiration() {
    return statusExpiration;
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
    sb.append("class TransactionRead {\n");
    sb.append("    ulid: ").append(toIndentedString(ulid)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
    sb.append("    buyerMessage: ").append(toIndentedString(buyerMessage)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    supplementalFees: ").append(toIndentedString(supplementalFees)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
    sb.append("    remotePreAuthorizationId: ").append(toIndentedString(remotePreAuthorizationId)).append("\n");
    sb.append("    remotePayInId: ").append(toIndentedString(remotePayInId)).append("\n");
    sb.append("    balanceToRefund: ").append(toIndentedString(balanceToRefund)).append("\n");
    sb.append("    feesToRefund: ").append(toIndentedString(feesToRefund)).append("\n");
    sb.append("    forceRefundShipping: ").append(toIndentedString(forceRefundShipping)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    handOverCode: ").append(toIndentedString(handOverCode)).append("\n");
    sb.append("    parcels: ").append(toIndentedString(parcels)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerCreatedAt: ").append(toIndentedString(providerCreatedAt)).append("\n");
    sb.append("    providerUpdatedAt: ").append(toIndentedString(providerUpdatedAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalCharged: ").append(toIndentedString(totalCharged)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    awaitedParty: ").append(toIndentedString(awaitedParty)).append("\n");
    sb.append("    statusExpiration: ").append(toIndentedString(statusExpiration)).append("\n");
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
    openapiFields.add("ulid");
    openapiFields.add("offer");
    openapiFields.add("quote");
    openapiFields.add("buyerMessage");
    openapiFields.add("buyer");
    openapiFields.add("status");
    openapiFields.add("fees");
    openapiFields.add("supplementalFees");
    openapiFields.add("card");
    openapiFields.add("escrow");
    openapiFields.add("remotePreAuthorizationId");
    openapiFields.add("remotePayInId");
    openapiFields.add("balanceToRefund");
    openapiFields.add("feesToRefund");
    openapiFields.add("forceRefundShipping");
    openapiFields.add("review");
    openapiFields.add("rating");
    openapiFields.add("handOverCode");
    openapiFields.add("parcels");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("providerName");
    openapiFields.add("providerCreatedAt");
    openapiFields.add("providerUpdatedAt");
    openapiFields.add("total");
    openapiFields.add("totalCharged");
    openapiFields.add("totalFees");
    openapiFields.add("awaitedParty");
    openapiFields.add("statusExpiration");
    openapiFields.add("processorStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ulid");
    openapiRequiredFields.add("offer");
    openapiRequiredFields.add("quote");
    openapiRequiredFields.add("buyer");
    openapiRequiredFields.add("createdAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransactionRead
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionRead.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRead is not found in the empty JSON string", TransactionRead.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransactionRead.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionRead` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionRead.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ulid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ulid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ulid").toString()));
      }
      // validate the required field `offer`
      TransactionOfferRead.validateJsonElement(jsonObj.get("offer"));
      // validate the required field `quote`
      TransactionQuoteRead.validateJsonElement(jsonObj.get("quote"));
      if ((jsonObj.get("buyerMessage") != null && !jsonObj.get("buyerMessage").isJsonNull()) && !jsonObj.get("buyerMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buyerMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buyerMessage").toString()));
      }
      // validate the required field `buyer`
      TransactionPersonaRead.validateJsonElement(jsonObj.get("buyer"));
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `card`
      if (jsonObj.get("card") != null && !jsonObj.get("card").isJsonNull()) {
        TransactionCardRead.validateJsonElement(jsonObj.get("card"));
      }
      // validate the optional field `escrow`
      if (jsonObj.get("escrow") != null && !jsonObj.get("escrow").isJsonNull()) {
        TransactionWalletRead.validateJsonElement(jsonObj.get("escrow"));
      }
      if ((jsonObj.get("remotePreAuthorizationId") != null && !jsonObj.get("remotePreAuthorizationId").isJsonNull()) && !jsonObj.get("remotePreAuthorizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remotePreAuthorizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remotePreAuthorizationId").toString()));
      }
      if ((jsonObj.get("remotePayInId") != null && !jsonObj.get("remotePayInId").isJsonNull()) && !jsonObj.get("remotePayInId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remotePayInId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remotePayInId").toString()));
      }
      if ((jsonObj.get("review") != null && !jsonObj.get("review").isJsonNull()) && !jsonObj.get("review").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review").toString()));
      }
      if ((jsonObj.get("handOverCode") != null && !jsonObj.get("handOverCode").isJsonNull()) && !jsonObj.get("handOverCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handOverCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handOverCode").toString()));
      }
      if (jsonObj.get("parcels") != null && !jsonObj.get("parcels").isJsonNull()) {
        JsonArray jsonArrayparcels = jsonObj.getAsJsonArray("parcels");
        if (jsonArrayparcels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parcels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parcels` to be an array in the JSON string but got `%s`", jsonObj.get("parcels").toString()));
          }

          // validate the optional field `parcels` (array)
          for (int i = 0; i < jsonArrayparcels.size(); i++) {
            TransactionParcelRead.validateJsonElement(jsonArrayparcels.get(i));
          };
        }
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("awaitedParty") != null && !jsonObj.get("awaitedParty").isJsonNull()) && !jsonObj.get("awaitedParty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `awaitedParty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("awaitedParty").toString()));
      }
      // validate the optional field `awaitedParty`
      if (jsonObj.get("awaitedParty") != null && !jsonObj.get("awaitedParty").isJsonNull()) {
        AwaitedPartyEnum.validateJsonElement(jsonObj.get("awaitedParty"));
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
       if (!TransactionRead.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRead' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRead> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRead.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRead>() {
           @Override
           public void write(JsonWriter out, TransactionRead value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRead read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransactionRead given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionRead
   * @throws IOException if the JSON string is invalid with respect to TransactionRead
   */
  public static TransactionRead fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRead.class);
  }

  /**
   * Convert an instance of TransactionRead to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

