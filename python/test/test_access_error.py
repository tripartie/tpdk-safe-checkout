# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.51
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.access_error import AccessError

class TestAccessError(unittest.TestCase):
    """AccessError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AccessError:
        """Test AccessError
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AccessError`
        """
        model = AccessError()
        if include_optional:
            return AccessError(
                type = 'https://tools.ietf.org/html/rfc2616#section-10',
                title = 'An error occurred',
                detail = 'Access denied'
            )
        else:
            return AccessError(
        )
        """

    def testAccessError(self):
        """Test AccessError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
