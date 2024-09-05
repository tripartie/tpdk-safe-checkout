# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.48
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.transaction_quote_read import TransactionQuoteRead

class TestTransactionQuoteRead(unittest.TestCase):
    """TransactionQuoteRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TransactionQuoteRead:
        """Test TransactionQuoteRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TransactionQuoteRead`
        """
        model = TransactionQuoteRead()
        if include_optional:
            return TransactionQuoteRead(
                ulid = '',
                shipping_carrier = 'SwissPost',
                pickup_code = '',
                quantity_to_be_acquired = 1,
                attempt_unit_price = 1.337,
                currency = 'EUR',
                original_unit_price = 1.337,
                original_unit_price_unconverted = 1.337,
                transaction_fees = 1.337,
                shipping_fees = 1.337,
                third_party_recipient_first_name = '',
                third_party_recipient_last_name = '',
                third_party_recipient_address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                    country_code = 'FRA', 
                    zip_code = '75004', 
                    city_name = 'Paris', 
                    first_line = '118 avenue des champs élysées', 
                    second_line = 'Apt 6E', 
                    building_name = 'Electron', 
                    building_floor = 'Third floor', 
                    gate_or_portal_or_inbox_code = '3124', ),
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                expire_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                iri = 'https://example.com/',
                unit_price = 1.337,
                price = 1.337,
                buyer_total = 1.337,
                seller_total = 1.337,
                exchange_rate = 0.4455
            )
        else:
            return TransactionQuoteRead(
                ulid = '',
                quantity_to_be_acquired = 1,
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                expire_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
        )
        """

    def testTransactionQuoteRead(self):
        """Test TransactionQuoteRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
