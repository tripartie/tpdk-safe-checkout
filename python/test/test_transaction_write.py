# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.47
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.transaction_write import TransactionWrite

class TestTransactionWrite(unittest.TestCase):
    """TransactionWrite unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TransactionWrite:
        """Test TransactionWrite
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TransactionWrite`
        """
        model = TransactionWrite()
        if include_optional:
            return TransactionWrite(
                captcha = '',
                offer = 'https://example.com/',
                quote = 'https://example.com/',
                buyer_message = '',
                card = 'https://example.com/'
            )
        else:
            return TransactionWrite(
                offer = 'https://example.com/',
                quote = 'https://example.com/',
        )
        """

    def testTransactionWrite(self):
        """Test TransactionWrite"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
