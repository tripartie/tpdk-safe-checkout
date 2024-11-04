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


package com.tripartie.safecheckout.api;

import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.model.AccessError;
import com.tripartie.safecheckout.model.AuthError;
import com.tripartie.safecheckout.model.GenericError;
import com.tripartie.safecheckout.model.InvalidQueryError;
import com.tripartie.safecheckout.model.NotFoundError;
import com.tripartie.safecheckout.model.PersonaCollectionRead;
import com.tripartie.safecheckout.model.PersonaRead;
import com.tripartie.safecheckout.model.PersonaUpdate;
import com.tripartie.safecheckout.model.PersonaWrite;
import com.tripartie.safecheckout.model.RateLimitError;
import com.tripartie.safecheckout.model.UnprocessableEntity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonaApi
 */
@Disabled
public class PersonaApiTest {

    private final PersonaApi api = new PersonaApi();

    /**
     * Retrieves the collection of Persona resources.
     *
     * Retrieves the collection of Persona resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiPersonasGetCollectionTest() throws ApiException {
        Integer page = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        List<String> email2 = null;
        String mobilePhoneNumber = null;
        List<String> mobilePhoneNumber2 = null;
        String gender = null;
        List<String> gender2 = null;
        String orderCreatedAt = null;
        String createdAtBefore = null;
        String createdAtStrictlyBefore = null;
        String createdAtAfter = null;
        String createdAtStrictlyAfter = null;
        String dateOfBirthBefore = null;
        String dateOfBirthStrictlyBefore = null;
        String dateOfBirthAfter = null;
        String dateOfBirthStrictlyAfter = null;
        List<String> metadata = null;
        List<PersonaCollectionRead> response = api.apiPersonasGetCollection()
                .page(page)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .email2(email2)
                .mobilePhoneNumber(mobilePhoneNumber)
                .mobilePhoneNumber2(mobilePhoneNumber2)
                .gender(gender)
                .gender2(gender2)
                .orderCreatedAt(orderCreatedAt)
                .createdAtBefore(createdAtBefore)
                .createdAtStrictlyBefore(createdAtStrictlyBefore)
                .createdAtAfter(createdAtAfter)
                .createdAtStrictlyAfter(createdAtStrictlyAfter)
                .dateOfBirthBefore(dateOfBirthBefore)
                .dateOfBirthStrictlyBefore(dateOfBirthStrictlyBefore)
                .dateOfBirthAfter(dateOfBirthAfter)
                .dateOfBirthStrictlyAfter(dateOfBirthStrictlyAfter)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

    /**
     * Unregister a Persona (Your customer)
     *
     * You **MAY** unregister (or free the email/phone number) your Persona entry using that endpoint. *Please note that* this operation will fail if that Persona have any ongoing operations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiPersonasIdDeleteTest() throws ApiException {
        String id = null;
        api.apiPersonasIdDelete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a Persona resource.
     *
     * Retrieves a Persona resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiPersonasIdGetTest() throws ApiException {
        String id = null;
        PersonaRead response = api.apiPersonasIdGet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates the Persona resource.
     *
     * Update your Persona (eg. your customer/user entry) through that API call. _Beware that updating_ **email** and/or the **mobile phone number** must be done using non reserved values. Otherwise this operation will be rejected.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiPersonasIdPatchTest() throws ApiException {
        String id = null;
        PersonaUpdate personaUpdate = null;
        PersonaRead response = api.apiPersonasIdPatch(id, personaUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Register a Persona (Your customer)
     *
     * You should not register your whole database of users, only those who are concerned by a Transaction operation. One Persona entry for your organization can be assigned as a seller or buyer.  **Notes:**   - (i) There is a unique constraint for the mobile phone numbers and email.   - (ii) You will have to issue a DELETE operation on a Persona that withhold a specific phone number or email.   - (iii) You are NOT REQUIRED to provide email OR a mobile phone number but it is highly recommended, if none provided the email will be generated as &#39;{ulid}@your-domain.tld&#39;. In that case, please specify at least one metadata in order to find your entry with ease.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiPersonasPostTest() throws ApiException {
        PersonaWrite personaWrite = null;
        PersonaRead response = api.apiPersonasPost(personaWrite)
                .execute();
        // TODO: test validations
    }

}
