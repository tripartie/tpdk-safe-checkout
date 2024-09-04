/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.35
 * Contact: noc@tripartie.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tripartie.safecheckout.api;

import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.model.AccessError;
import com.tripartie.safecheckout.model.ApiClientPostCreationRead;
import com.tripartie.safecheckout.model.ApiClientRead;
import com.tripartie.safecheckout.model.ApiClientWrite;
import com.tripartie.safecheckout.model.AuthError;
import com.tripartie.safecheckout.model.GenericError;
import com.tripartie.safecheckout.model.InvalidQueryError;
import com.tripartie.safecheckout.model.MessageError;
import com.tripartie.safecheckout.model.NotFoundError;
import com.tripartie.safecheckout.model.OrganizationCollectionRead;
import com.tripartie.safecheckout.model.OrganizationRead;
import com.tripartie.safecheckout.model.RateLimitError;
import com.tripartie.safecheckout.model.UnprocessableEntity;
import com.tripartie.safecheckout.model.UserCollectionRead;
import com.tripartie.safecheckout.model.UserInvite;
import com.tripartie.safecheckout.model.UserJwtCreated;
import com.tripartie.safecheckout.model.UserJwtWrite;
import com.tripartie.safecheckout.model.UserPostRegisterRead;
import com.tripartie.safecheckout.model.UserSupportRead;
import com.tripartie.safecheckout.model.UserUserSubscribed;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Disabled
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    /**
     * Retrieves the collection of ApiClient resources.
     *
     * Retrieves the collection of ApiClient resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiApiClientsGetCollectionTest() throws ApiException {
        Integer page = null;
        List<ApiClientRead> response = api.apiApiClientsGetCollection()
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes the ApiClient resource.
     *
     * Removes the ApiClient resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiApiClientsIdentifierDeleteTest() throws ApiException {
        String identifier = null;
        api.apiApiClientsIdentifierDelete(identifier)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a ApiClient resource.
     *
     * Retrieves a ApiClient resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiApiClientsIdentifierGetTest() throws ApiException {
        String identifier = null;
        ApiClientRead response = api.apiApiClientsIdentifierGet(identifier)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a ApiClient resource.
     *
     * Creates a ApiClient resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiApiClientsPostTest() throws ApiException {
        ApiClientWrite apiClientWrite = null;
        ApiClientPostCreationRead response = api.apiApiClientsPost(apiClientWrite)
                .execute();
        // TODO: test validations
    }

    /**
     * Organization invite
     *
     * Invite a user to your organization workspace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiInvitePostTest() throws ApiException {
        UserInvite userInvite = null;
        UserPostRegisterRead response = api.apiInvitePost(userInvite)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the collection of Organization resources.
     *
     * Retrieves the collection of Organization resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOrganizationsGetCollectionTest() throws ApiException {
        Integer page = null;
        Integer itemsPerPage = null;
        String name = null;
        List<OrganizationCollectionRead> response = api.apiOrganizationsGetCollection()
                .page(page)
                .itemsPerPage(itemsPerPage)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a Organization resource.
     *
     * Retrieves a Organization resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOrganizationsIdGetTest() throws ApiException {
        String id = null;
        OrganizationRead response = api.apiOrganizationsIdGet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the collection of User resources.
     *
     * Retrieves the collection of User resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersGetCollectionTest() throws ApiException {
        Integer page = null;
        List<UserCollectionRead> response = api.apiUsersGetCollection()
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a User resource.
     *
     * Retrieves a User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdGetTest() throws ApiException {
        String id = null;
        UserSupportRead response = api.apiUsersIdGet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates the User resource.
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIddisablePatchTest() throws ApiException {
        String id = null;
        Object body = null;
        UserUserSubscribed response = api.apiUsersIddisablePatch(id, body)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates the User resource.
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdenablePatchTest() throws ApiException {
        String id = null;
        Object body = null;
        UserUserSubscribed response = api.apiUsersIdenablePatch(id, body)
                .execute();
        // TODO: test validations
    }

    /**
     * User authentication
     *
     * This endpoint is protected by a captcha, do not try to use it to consume our API. IP/CIDR to be banned upon fraudulent/irregular usage. Follow the oauth 2.0 authentication challenge as described in the documentation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authenticationPostTest() throws ApiException {
        UserJwtWrite userJwtWrite = null;
        UserJwtCreated response = api.authenticationPost()
                .userJwtWrite(userJwtWrite)
                .execute();
        // TODO: test validations
    }

}
