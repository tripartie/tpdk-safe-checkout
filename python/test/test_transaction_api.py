# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.98
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.api.transaction_api import TransactionApi


class TestTransactionApi(unittest.TestCase):
    """TransactionApi unit test stubs"""

    def setUp(self) -> None:
        self.api = TransactionApi()

    def tearDown(self) -> None:
        pass

    def test_api_quotes_post(self) -> None:
        """Test case for api_quotes_post

        Create a Quote prior to issuing a Transaction
        """
        pass

    def test_api_quotes_ulid_get(self) -> None:
        """Test case for api_quotes_ulid_get

        Retrieve a Quote
        """
        pass

    def test_api_quotes_ulid_patch(self) -> None:
        """Test case for api_quotes_ulid_patch

        Update a Quote prior to issuing a Transaction
        """
        pass

    def test_api_transactions_get_collection(self) -> None:
        """Test case for api_transactions_get_collection

        List all Transaction
        """
        pass

    def test_api_transactions_post(self) -> None:
        """Test case for api_transactions_post

        Initialize a new Transaction
        """
        pass

    def test_api_transactions_ulid_get(self) -> None:
        """Test case for api_transactions_ulid_get

        Get a Transaction
        """
        pass

    def test_api_transactions_ulid_patch(self) -> None:
        """Test case for api_transactions_ulid_patch

        Interact with a Transaction
        """
        pass


if __name__ == '__main__':
    unittest.main()
