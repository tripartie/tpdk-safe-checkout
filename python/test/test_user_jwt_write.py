# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.30
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.user_jwt_write import UserJwtWrite

class TestUserJwtWrite(unittest.TestCase):
    """UserJwtWrite unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserJwtWrite:
        """Test UserJwtWrite
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserJwtWrite`
        """
        model = UserJwtWrite()
        if include_optional:
            return UserJwtWrite(
                captcha = '23aa3ff98df2457d958a6f9e5c48cfa5',
                email = 'john.doe@company.tld',
                password = 'p@ssw0rd',
                totp_input = '412541'
            )
        else:
            return UserJwtWrite(
        )
        """

    def testUserJwtWrite(self):
        """Test UserJwtWrite"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
