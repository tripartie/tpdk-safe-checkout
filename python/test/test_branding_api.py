# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.24
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.api.branding_api import BrandingApi


class TestBrandingApi(unittest.TestCase):
    """BrandingApi unit test stubs"""

    def setUp(self) -> None:
        self.api = BrandingApi()

    def tearDown(self) -> None:
        pass

    def test_api_organizations_id_patch(self) -> None:
        """Test case for api_organizations_id_patch

        Update your Organization details, branding or parameters
        """
        pass

    def test_api_organizations_idicon_delete(self) -> None:
        """Test case for api_organizations_idicon_delete

        Unset your Organization Icon
        """
        pass

    def test_api_organizations_idicon_post(self) -> None:
        """Test case for api_organizations_idicon_post

        Upload your Organization Icon
        """
        pass

    def test_api_organizations_idlogo_delete(self) -> None:
        """Test case for api_organizations_idlogo_delete

        Unset your Organization Logo
        """
        pass

    def test_api_organizations_idlogo_post(self) -> None:
        """Test case for api_organizations_idlogo_post

        Upload your Organization logo
        """
        pass


if __name__ == '__main__':
    unittest.main()
