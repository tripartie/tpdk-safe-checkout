# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.28
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.transaction_update import TransactionUpdate

class TestTransactionUpdate(unittest.TestCase):
    """TransactionUpdate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TransactionUpdate:
        """Test TransactionUpdate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TransactionUpdate`
        """
        model = TransactionUpdate()
        if include_optional:
            return TransactionUpdate(
                status = 'CREATED',
                supplemental_fees = 1.337,
                balance_to_refund = 1.337,
                fees_to_refund = 1.337,
                force_refund_shipping = True,
                review = '',
                rating = 56,
                hand_over_code_confirmation = '',
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f')
            )
        else:
            return TransactionUpdate(
        )
        """

    def testTransactionUpdate(self):
        """Test TransactionUpdate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
