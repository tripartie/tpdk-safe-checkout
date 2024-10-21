# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.81
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.cashout_cash_out_collection_read import CashoutCashOutCollectionRead

class TestCashoutCashOutCollectionRead(unittest.TestCase):
    """CashoutCashOutCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CashoutCashOutCollectionRead:
        """Test CashoutCashOutCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CashoutCashOutCollectionRead`
        """
        model = CashoutCashOutCollectionRead()
        if include_optional:
            return CashoutCashOutCollectionRead(
                id = 56,
                amount = 1.337,
                currency = '',
                iban = '',
                bic = '',
                status = 'created',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                confirmed_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f')
            )
        else:
            return CashoutCashOutCollectionRead(
                currency = '',
                iban = '',
                bic = '',
                status = 'created',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                confirmed_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
        )
        """

    def testCashoutCashOutCollectionRead(self):
        """Test CashoutCashOutCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
