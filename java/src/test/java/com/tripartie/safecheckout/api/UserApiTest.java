/*
 * Safe Checkout
 * Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.
 *
 * The version of the OpenAPI document: 2.0.113
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
import com.tripartie.safecheckout.model.BankAccountRead;
import com.tripartie.safecheckout.model.BankAccountWrite;
import java.math.BigDecimal;
import com.tripartie.safecheckout.model.CardCollectionRead;
import com.tripartie.safecheckout.model.CardRead;
import com.tripartie.safecheckout.model.CardUpdate;
import com.tripartie.safecheckout.model.CardWrite;
import com.tripartie.safecheckout.model.CashoutCashOutCollectionRead;
import com.tripartie.safecheckout.model.CashoutCashOutRead;
import com.tripartie.safecheckout.model.CashoutCashOutWrite;
import java.io.File;
import com.tripartie.safecheckout.model.GenericError;
import com.tripartie.safecheckout.model.InvalidQueryError;
import com.tripartie.safecheckout.model.MediaRead;
import com.tripartie.safecheckout.model.MessageError;
import com.tripartie.safecheckout.model.NotFoundError;
import com.tripartie.safecheckout.model.ProofOfIdentityCollectionRead;
import com.tripartie.safecheckout.model.ProofOfIdentityRead;
import com.tripartie.safecheckout.model.ProofOfIdentityWrite;
import com.tripartie.safecheckout.model.RateLimitError;
import com.tripartie.safecheckout.model.StatisticRead;
import com.tripartie.safecheckout.model.StatisticWrite;
import com.tripartie.safecheckout.model.UnprocessableEntity;
import com.tripartie.safecheckout.model.UserAuthenticatedRead;
import com.tripartie.safecheckout.model.UserEmailValidationWrite;
import com.tripartie.safecheckout.model.UserJwtCreated;
import com.tripartie.safecheckout.model.UserJwtWrite;
import com.tripartie.safecheckout.model.UserPostRegisterRead;
import com.tripartie.safecheckout.model.UserTotpSetupRead;
import com.tripartie.safecheckout.model.UserTotpToggleWrite;
import com.tripartie.safecheckout.model.UserUpdate;
import com.tripartie.safecheckout.model.UserUserEmailUpdate;
import com.tripartie.safecheckout.model.UserUserPasswordUpdate;
import com.tripartie.safecheckout.model.UserUserRead;
import com.tripartie.safecheckout.model.UserWrite;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Removes the BankAccount resource.
     *
     * Removes the BankAccount resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiBankAccountsIdDeleteTest() throws ApiException {
        String id = null;
        api.apiBankAccountsIdDelete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a BankAccount resource.
     *
     * Retrieves a BankAccount resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiBankAccountsIdGetTest() throws ApiException {
        String id = null;
        BankAccountRead response = api.apiBankAccountsIdGet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a BankAccount resource.
     *
     * Creates a BankAccount resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiBankAccountsPostTest() throws ApiException {
        BankAccountWrite bankAccountWrite = null;
        BankAccountRead response = api.apiBankAccountsPost(bankAccountWrite)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the collection of Card resources.
     *
     * Retrieves the collection of Card resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCardsGetCollectionTest() throws ApiException {
        Integer page = null;
        List<CardCollectionRead> response = api.apiCardsGetCollection()
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes the Card resource.
     *
     * Removes the Card resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCardsIdDeleteTest() throws ApiException {
        String id = null;
        api.apiCardsIdDelete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a Card resource.
     *
     * Retrieves a Card resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCardsIdGetTest() throws ApiException {
        String id = null;
        CardRead response = api.apiCardsIdGet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Push back the tokenization output from the external provider
     *
     * Updates the Card resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCardsIdPatchTest() throws ApiException {
        String id = null;
        CardUpdate cardUpdate = null;
        CardRead response = api.apiCardsIdPatch(id, cardUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Creates a Card resource.
     *
     * Creates a Card resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCardsPostTest() throws ApiException {
        CardWrite cardWrite = null;
        CardRead response = api.apiCardsPost(cardWrite)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves the collection of CashOut resources.
     *
     * Retrieves the collection of CashOut resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCashOutsGetCollectionTest() throws ApiException {
        Integer page = null;
        List<CashoutCashOutCollectionRead> response = api.apiCashOutsGetCollection()
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a CashOut resource.
     *
     * Retrieves a CashOut resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCashOutsIdGetTest() throws ApiException {
        String id = null;
        CashoutCashOutRead response = api.apiCashOutsIdGet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Withdraw the full amount available in the user wallet to set bank account
     *
     * Creates a CashOut resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiCashOutsPostTest() throws ApiException {
        CashoutCashOutWrite cashoutCashOutWrite = null;
        CashoutCashOutRead response = api.apiCashOutsPost(cashoutCashOutWrite)
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
    public void apiMeGetTest() throws ApiException {
        UserAuthenticatedRead response = api.apiMeGet()
                .execute();
        // TODO: test validations
    }

    /**
     * List all submitted PoI
     *
     * Retrieves the collection of ProofOfIdentity resources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiProofOfIdentitiesGetCollectionTest() throws ApiException {
        Integer page = null;
        List<ProofOfIdentityCollectionRead> response = api.apiProofOfIdentitiesGetCollection()
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a specific PoI
     *
     * Retrieves a ProofOfIdentity resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiProofOfIdentitiesIdGetTest() throws ApiException {
        String id = null;
        ProofOfIdentityRead response = api.apiProofOfIdentitiesIdGet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload the document for your PoI slot
     *
     * Creates a ProofOfIdentity resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiProofOfIdentitiesIddocumentPostTest() throws ApiException {
        BigDecimal id = null;
        File _file = null;
        ProofOfIdentityRead response = api.apiProofOfIdentitiesIddocumentPost(id)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Submit a slot for a PoI
     *
     * Creates a ProofOfIdentity resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiProofOfIdentitiesPostTest() throws ApiException {
        ProofOfIdentityWrite proofOfIdentityWrite = null;
        ProofOfIdentityRead response = api.apiProofOfIdentitiesPost(proofOfIdentityWrite)
                .execute();
        // TODO: test validations
    }

    /**
     * Customer onboarding
     *
     * Internal-use only, protected by a captcha. User first-enrollment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiRegisterPostTest() throws ApiException {
        UserWrite userWrite = null;
        UserPostRegisterRead response = api.apiRegisterPost(userWrite)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes the User resource.
     *
     * Removes the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdDeleteTest() throws ApiException {
        String id = null;
        api.apiUsersIdDelete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update your profile
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdPatchTest() throws ApiException {
        String id = null;
        UserUpdate userUpdate = null;
        UserPostRegisterRead response = api.apiUsersIdPatch(id, userUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Unset your personal avatar
     *
     * Removes the Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdavatarDeleteTest() throws ApiException {
        Integer id = null;
        api.apiUsersIdavatarDelete(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload your personal avatar
     *
     * Creates a Media resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdavatarPostTest() throws ApiException {
        Integer id = null;
        File _file = null;
        MediaRead response = api.apiUsersIdavatarPost(id)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Update user email
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdemailPatchTest() throws ApiException {
        String id = null;
        UserUserEmailUpdate userUserEmailUpdate = null;
        UserUserRead response = api.apiUsersIdemailPatch(id, userUserEmailUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Validate email ownership
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdemailValidationPatchTest() throws ApiException {
        String id = null;
        UserEmailValidationWrite userEmailValidationWrite = null;
        UserPostRegisterRead response = api.apiUsersIdemailValidationPatch(id, userEmailValidationWrite)
                .execute();
        // TODO: test validations
    }

    /**
     * Change your password
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdpasswordPatchTest() throws ApiException {
        String id = null;
        UserUserPasswordUpdate userUserPasswordUpdate = null;
        UserUserRead response = api.apiUsersIdpasswordPatch(id, userUserPasswordUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * Setup an additional authentication factor
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdtotpSetupPatchTest() throws ApiException {
        String id = null;
        Object body = null;
        UserTotpSetupRead response = api.apiUsersIdtotpSetupPatch(id, body)
                .execute();
        // TODO: test validations
    }

    /**
     * Disable the second authentication factor
     *
     * Updates the User resource.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiUsersIdtotpTogglePatchTest() throws ApiException {
        String id = null;
        UserTotpToggleWrite userTotpToggleWrite = null;
        Object response = api.apiUsersIdtotpTogglePatch(id, userTotpToggleWrite)
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

    /**
     * Statistics Generator
     *
     * Generate statistics based on a set of parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void statisticsPostTest() throws ApiException {
        StatisticWrite statisticWrite = null;
        StatisticRead response = api.statisticsPost()
                .statisticWrite(statisticWrite)
                .execute();
        // TODO: test validations
    }

}
