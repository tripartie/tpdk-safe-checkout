# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.33
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.user_user_subscribed import UserUserSubscribed

class TestUserUserSubscribed(unittest.TestCase):
    """UserUserSubscribed unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserUserSubscribed:
        """Test UserUserSubscribed
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserUserSubscribed`
        """
        model = UserUserSubscribed()
        if include_optional:
            return UserUserSubscribed(
                id = 56,
                iri = 'https://example.com/'
            )
        else:
            return UserUserSubscribed(
        )
        """

    def testUserUserSubscribed(self):
        """Test UserUserSubscribed"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
