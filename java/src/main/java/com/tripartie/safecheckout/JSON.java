/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.24
 * Contact: noc@tripartie.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tripartie.safecheckout;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.AccessError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.Address.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.ApiClientPostCreationRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.ApiClientRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.ApiClientWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.AuthError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.BankAccountRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.BankAccountUserRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.BankAccountWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardMetadataCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardMetadataRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardMetadataUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardUserRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CardWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CashoutCashOutCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CashoutCashOutRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.CashoutCashOutWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.GenericError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.InvalidQueryError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.Media.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.MediaRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.MediaUserRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.MessageError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.Metadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.NotFoundError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.Offer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferAddressIndependentWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferIndependentWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferMediaRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferMetadataIndependentWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferMetadataUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferOrganizationRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferPersonaIndependentWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferPersonaRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferPostCreationRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferSoloWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OfferUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OrganizationAddressUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OrganizationCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OrganizationMediaCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OrganizationMediaRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OrganizationRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OrganizationUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.OrganizationUserRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.Persona.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaAddressRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaAddressUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaAddressWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaMetadataRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaMetadataUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaMetadataWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaUserRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.PersonaWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.ProofOfIdentityCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.ProofOfIdentityRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.ProofOfIdentityWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.QuoteRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.QuoteUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.QuoteWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.RateLimitError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionCardRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionMetadataRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionOfferCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionOfferRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionParcelRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionPersonaCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionPersonaRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionQuoteCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionQuoteRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionWalletRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.TransactionWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UnprocessableEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UnprocessableEntityViolationsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserAuthenticatedRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserBankAccountAuthenticatedRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserCardAuthenticatedRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserEmailValidationWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserInvite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserJwtCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserJwtWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserMediaAuthenticatedRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserMediaCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserMediaRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserMediaSupportRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserOrganizationAuthenticatedRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserOrganizationCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserOrganizationRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserOrganizationSupportRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserPersonaAuthenticatedRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserPostRegisterRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserSupportRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserTotpSetupRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserTotpToggleWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserUserEmailUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserUserPasswordUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserUserRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserUserSubscribed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserWalletAuthenticatedRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserWalletCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserWalletSupportRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.UserWrite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.View.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.WalletUserRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.Webhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.WebhookHistoryCollectionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.WebhookHistoryRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.WebhookObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.WebhookSubscriptionRead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.tripartie.safecheckout.model.WebhookSubscriptionWrite.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
