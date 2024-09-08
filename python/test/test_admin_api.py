# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.58
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.api.admin_api import AdminApi


class TestAdminApi(unittest.TestCase):
    """AdminApi unit test stubs"""

    def setUp(self) -> None:
        self.api = AdminApi()

    def tearDown(self) -> None:
        pass

    def test_api_api_clients_get_collection(self) -> None:
        """Test case for api_api_clients_get_collection

        Retrieves the collection of ApiClient resources.
        """
        pass

    def test_api_api_clients_identifier_delete(self) -> None:
        """Test case for api_api_clients_identifier_delete

        Removes the ApiClient resource.
        """
        pass

    def test_api_api_clients_identifier_get(self) -> None:
        """Test case for api_api_clients_identifier_get

        Retrieves a ApiClient resource.
        """
        pass

    def test_api_api_clients_post(self) -> None:
        """Test case for api_api_clients_post

        Creates a ApiClient resource.
        """
        pass

    def test_api_invite_post(self) -> None:
        """Test case for api_invite_post

        Organization invite
        """
        pass

    def test_api_organizations_get_collection(self) -> None:
        """Test case for api_organizations_get_collection

        Retrieves the collection of Organization resources.
        """
        pass

    def test_api_organizations_id_get(self) -> None:
        """Test case for api_organizations_id_get

        Retrieves a Organization resource.
        """
        pass

    def test_api_users_get_collection(self) -> None:
        """Test case for api_users_get_collection

        Retrieves the collection of User resources.
        """
        pass

    def test_api_users_id_get(self) -> None:
        """Test case for api_users_id_get

        Retrieves a User resource.
        """
        pass

    def test_api_users_iddisable_patch(self) -> None:
        """Test case for api_users_iddisable_patch

        Updates the User resource.
        """
        pass

    def test_api_users_idenable_patch(self) -> None:
        """Test case for api_users_idenable_patch

        Updates the User resource.
        """
        pass

    def test_authentication_post(self) -> None:
        """Test case for authentication_post

        User authentication
        """
        pass


if __name__ == '__main__':
    unittest.main()
