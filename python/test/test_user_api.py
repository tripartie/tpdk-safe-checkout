# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.60
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.api.user_api import UserApi


class TestUserApi(unittest.TestCase):
    """UserApi unit test stubs"""

    def setUp(self) -> None:
        self.api = UserApi()

    def tearDown(self) -> None:
        pass

    def test_api_bank_accounts_id_delete(self) -> None:
        """Test case for api_bank_accounts_id_delete

        Removes the BankAccount resource.
        """
        pass

    def test_api_bank_accounts_id_get(self) -> None:
        """Test case for api_bank_accounts_id_get

        Retrieves a BankAccount resource.
        """
        pass

    def test_api_bank_accounts_post(self) -> None:
        """Test case for api_bank_accounts_post

        Creates a BankAccount resource.
        """
        pass

    def test_api_cards_get_collection(self) -> None:
        """Test case for api_cards_get_collection

        Retrieves the collection of Card resources.
        """
        pass

    def test_api_cards_id_delete(self) -> None:
        """Test case for api_cards_id_delete

        Removes the Card resource.
        """
        pass

    def test_api_cards_id_get(self) -> None:
        """Test case for api_cards_id_get

        Retrieves a Card resource.
        """
        pass

    def test_api_cards_id_patch(self) -> None:
        """Test case for api_cards_id_patch

        Push back the tokenization output from the external provider
        """
        pass

    def test_api_cards_post(self) -> None:
        """Test case for api_cards_post

        Creates a Card resource.
        """
        pass

    def test_api_cash_outs_get_collection(self) -> None:
        """Test case for api_cash_outs_get_collection

        Retrieves the collection of CashOut resources.
        """
        pass

    def test_api_cash_outs_id_get(self) -> None:
        """Test case for api_cash_outs_id_get

        Retrieves a CashOut resource.
        """
        pass

    def test_api_cash_outs_post(self) -> None:
        """Test case for api_cash_outs_post

        Withdraw the full amount available in the user wallet to set bank account
        """
        pass

    def test_api_me_get(self) -> None:
        """Test case for api_me_get

        Retrieves a User resource.
        """
        pass

    def test_api_proof_of_identities_get_collection(self) -> None:
        """Test case for api_proof_of_identities_get_collection

        List all submitted PoI
        """
        pass

    def test_api_proof_of_identities_id_get(self) -> None:
        """Test case for api_proof_of_identities_id_get

        Retrieve a specific PoI
        """
        pass

    def test_api_proof_of_identities_iddocument_post(self) -> None:
        """Test case for api_proof_of_identities_iddocument_post

        Upload the document for your PoI slot
        """
        pass

    def test_api_proof_of_identities_post(self) -> None:
        """Test case for api_proof_of_identities_post

        Submit a slot for a PoI
        """
        pass

    def test_api_register_post(self) -> None:
        """Test case for api_register_post

        Customer onboarding
        """
        pass

    def test_api_users_id_delete(self) -> None:
        """Test case for api_users_id_delete

        Removes the User resource.
        """
        pass

    def test_api_users_id_patch(self) -> None:
        """Test case for api_users_id_patch

        Update your profile
        """
        pass

    def test_api_users_idavatar_delete(self) -> None:
        """Test case for api_users_idavatar_delete

        Unset your personal avatar
        """
        pass

    def test_api_users_idavatar_post(self) -> None:
        """Test case for api_users_idavatar_post

        Upload your personal avatar
        """
        pass

    def test_api_users_idemail_patch(self) -> None:
        """Test case for api_users_idemail_patch

        Update user email
        """
        pass

    def test_api_users_idemail_validation_patch(self) -> None:
        """Test case for api_users_idemail_validation_patch

        Validate email ownership
        """
        pass

    def test_api_users_idpassword_patch(self) -> None:
        """Test case for api_users_idpassword_patch

        Change your password
        """
        pass

    def test_api_users_idtotp_setup_patch(self) -> None:
        """Test case for api_users_idtotp_setup_patch

        Setup an additional authentication factor
        """
        pass

    def test_api_users_idtotp_toggle_patch(self) -> None:
        """Test case for api_users_idtotp_toggle_patch

        Disable the second authentication factor
        """
        pass

    def test_authentication_post(self) -> None:
        """Test case for authentication_post

        User authentication
        """
        pass


if __name__ == '__main__':
    unittest.main()
