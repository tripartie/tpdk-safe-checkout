# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.54
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.api_client_post_creation_read import ApiClientPostCreationRead

class TestApiClientPostCreationRead(unittest.TestCase):
    """ApiClientPostCreationRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ApiClientPostCreationRead:
        """Test ApiClientPostCreationRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ApiClientPostCreationRead`
        """
        model = ApiClientPostCreationRead()
        if include_optional:
            return ApiClientPostCreationRead(
                identifier = '',
                secret = None,
                name = ''
            )
        else:
            return ApiClientPostCreationRead(
        )
        """

    def testApiClientPostCreationRead(self):
        """Test ApiClientPostCreationRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
