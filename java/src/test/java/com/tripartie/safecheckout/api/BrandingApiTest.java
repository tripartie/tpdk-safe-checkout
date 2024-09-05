/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.45
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
import java.io.File;
import com.tripartie.safecheckout.model.GenericError;
import com.tripartie.safecheckout.model.InvalidQueryError;
import com.tripartie.safecheckout.model.MediaRead;
import com.tripartie.safecheckout.model.NotFoundError;
import com.tripartie.safecheckout.model.OrganizationUpdate;
import com.tripartie.safecheckout.model.RateLimitError;
import com.tripartie.safecheckout.model.UnprocessableEntity;
import com.tripartie.safecheckout.model.UserOrganizationRead;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BrandingApi
 */
@Disabled
public class BrandingApiTest {

    private final BrandingApi api = new BrandingApi();

    /**
     * Update your Organization details, branding or parameters
     *
     * Updates the Organization resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOrganizationsIdPatchTest() throws ApiException {
        String id = null;
        OrganizationUpdate organizationUpdate = null;
        UserOrganizationRead response = api.apiOrganizationsIdPatch(id, organizationUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Unset your Organization Icon
     *
     * Removes the Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOrganizationsIdiconDeleteTest() throws ApiException {
        Integer id = null;
        api.apiOrganizationsIdiconDelete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload your Organization Icon
     *
     * Creates a Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOrganizationsIdiconPostTest() throws ApiException {
        Integer id = null;
        File _file = null;
        MediaRead response = api.apiOrganizationsIdiconPost(id)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Unset your Organization Logo
     *
     * Removes the Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOrganizationsIdlogoDeleteTest() throws ApiException {
        Integer id = null;
        api.apiOrganizationsIdlogoDelete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload your Organization logo
     *
     * Creates a Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOrganizationsIdlogoPostTest() throws ApiException {
        Integer id = null;
        File _file = null;
        MediaRead response = api.apiOrganizationsIdlogoPost(id)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

}
