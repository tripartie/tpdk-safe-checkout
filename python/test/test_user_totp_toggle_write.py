# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.50
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.user_totp_toggle_write import UserTotpToggleWrite

class TestUserTotpToggleWrite(unittest.TestCase):
    """UserTotpToggleWrite unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserTotpToggleWrite:
        """Test UserTotpToggleWrite
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserTotpToggleWrite`
        """
        model = UserTotpToggleWrite()
        if include_optional:
            return UserTotpToggleWrite(
                totp_enabled = True,
                totp_challenge = ''
            )
        else:
            return UserTotpToggleWrite(
                totp_enabled = True,
                totp_challenge = '',
        )
        """

    def testUserTotpToggleWrite(self):
        """Test UserTotpToggleWrite"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
