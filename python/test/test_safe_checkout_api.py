# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.45
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.api.safe_checkout_api import SafeCheckoutApi


class TestSafeCheckoutApi(unittest.TestCase):
    """SafeCheckoutApi unit test stubs"""

    def setUp(self) -> None:
        self.api = SafeCheckoutApi()

    def tearDown(self) -> None:
        pass

    def test_api_offers_get_collection(self) -> None:
        """Test case for api_offers_get_collection

        Search amongst Offers
        """
        pass

    def test_api_offers_post(self) -> None:
        """Test case for api_offers_post

        Create a public link for Offer
        """
        pass

    def test_api_offers_ulid_delete(self) -> None:
        """Test case for api_offers_ulid_delete

        Disable existing Offer
        """
        pass

    def test_api_offers_ulid_get(self) -> None:
        """Test case for api_offers_ulid_get

        Fetch a Offer details
        """
        pass

    def test_api_offers_ulid_patch(self) -> None:
        """Test case for api_offers_ulid_patch

        Update existing Offer
        """
        pass

    def test_api_offers_ulidmedias_id_delete(self) -> None:
        """Test case for api_offers_ulidmedias_id_delete

        Removes the Media resource.
        """
        pass

    def test_api_offers_ulidmedias_post(self) -> None:
        """Test case for api_offers_ulidmedias_post

        Upload a picture for a given Offer
        """
        pass

    def test_api_users_idoffers_post(self) -> None:
        """Test case for api_users_idoffers_post

        Issue an Offer as User
        """
        pass


if __name__ == '__main__':
    unittest.main()
