/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.50
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
import com.tripartie.safecheckout.model.OfferCollectionRead;
import com.tripartie.safecheckout.model.OfferIndependentWrite;
import com.tripartie.safecheckout.model.OfferPostCreationRead;
import com.tripartie.safecheckout.model.OfferRead;
import com.tripartie.safecheckout.model.OfferSoloWrite;
import com.tripartie.safecheckout.model.OfferUpdate;
import com.tripartie.safecheckout.model.RateLimitError;
import com.tripartie.safecheckout.model.UnprocessableEntity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SafeCheckoutApi
 */
@Disabled
public class SafeCheckoutApiTest {

    private final SafeCheckoutApi api = new SafeCheckoutApi();

    /**
     * Search amongst Offers
     *
     * Retrieves the collection of Offer resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOffersGetCollectionTest() throws ApiException {
        Integer page = null;
        String title = null;
        String publicUrl = null;
        List<String> publicUrl2 = null;
        String unitPrice = null;
        List<String> unitPrice2 = null;
        Integer itemCount = null;
        List<Integer> itemCount2 = null;
        String createdAtBefore = null;
        String createdAtStrictlyBefore = null;
        String createdAtAfter = null;
        String createdAtStrictlyAfter = null;
        List<String> metadata = null;
        List<String> offerMetadata = null;
        List<String> sellerMetadata = null;
        String nature = null;
        List<String> nature2 = null;
        String condition = null;
        List<String> condition2 = null;
        String status = null;
        List<String> status2 = null;
        Boolean shippingAllowed = null;
        List<OfferCollectionRead> response = api.apiOffersGetCollection()
                .page(page)
                .title(title)
                .publicUrl(publicUrl)
                .publicUrl2(publicUrl2)
                .unitPrice(unitPrice)
                .unitPrice2(unitPrice2)
                .itemCount(itemCount)
                .itemCount2(itemCount2)
                .createdAtBefore(createdAtBefore)
                .createdAtStrictlyBefore(createdAtStrictlyBefore)
                .createdAtAfter(createdAtAfter)
                .createdAtStrictlyAfter(createdAtStrictlyAfter)
                .metadata(metadata)
                .offerMetadata(offerMetadata)
                .sellerMetadata(sellerMetadata)
                .nature(nature)
                .nature2(nature2)
                .condition(condition)
                .condition2(condition2)
                .status(status)
                .status2(status2)
                .shippingAllowed(shippingAllowed)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a public link for Offer
     *
     * Create a public listening Offer linked to a specific Seller
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOffersPostTest() throws ApiException {
        OfferIndependentWrite offerIndependentWrite = null;
        OfferPostCreationRead response = api.apiOffersPost(offerIndependentWrite)
                .execute();
        // TODO: test validations
    }

    /**
     * Disable existing Offer
     *
     * Make a specific Offer as non longer active
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOffersUlidDeleteTest() throws ApiException {
        String ulid = null;
        api.apiOffersUlidDelete(ulid)
                .execute();
        // TODO: test validations
    }

    /**
     * Fetch a Offer details
     *
     * Retrieves a Offer resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOffersUlidGetTest() throws ApiException {
        String ulid = null;
        OfferRead response = api.apiOffersUlidGet(ulid)
                .execute();
        // TODO: test validations
    }

    /**
     * Update existing Offer
     *
     * Update your existing Offer and reuse existing generated link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOffersUlidPatchTest() throws ApiException {
        String ulid = null;
        OfferUpdate offerUpdate = null;
        OfferPostCreationRead response = api.apiOffersUlidPatch(ulid, offerUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes the Media resource.
     *
     * Removes the Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOffersUlidmediasIdDeleteTest() throws ApiException {
        String ulid = null;
        Integer id = null;
        api.apiOffersUlidmediasIdDelete(ulid, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload a picture for a given Offer
     *
     * Creates a Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiOffersUlidmediasPostTest() throws ApiException {
        String ulid = null;
        File _file = null;
        MediaRead response = api.apiOffersUlidmediasPost(ulid)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Issue an Offer as User
     *
     * Create a public listening Offer linked to a specific User
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdoffersPostTest() throws ApiException {
        Integer id = null;
        OfferSoloWrite offerSoloWrite = null;
        OfferPostCreationRead response = api.apiUsersIdoffersPost(id, offerSoloWrite)
                .execute();
        // TODO: test validations
    }

}
