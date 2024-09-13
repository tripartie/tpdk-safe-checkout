# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.69
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.quote_update import QuoteUpdate

class TestQuoteUpdate(unittest.TestCase):
    """QuoteUpdate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> QuoteUpdate:
        """Test QuoteUpdate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `QuoteUpdate`
        """
        model = QuoteUpdate()
        if include_optional:
            return QuoteUpdate(
                shipping_carrier = 'SwissPost',
                pickup_code = '',
                quantity_to_be_acquired = 1,
                attempt_unit_price = 1.337,
                third_party_recipient_first_name = '0',
                third_party_recipient_last_name = '0',
                third_party_recipient_address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                    country_code = 'FRA', 
                    zip_code = '75004', 
                    city_name = 'Paris', 
                    first_line = '118 avenue des champs élysées', 
                    second_line = 'Apt 6E', 
                    building_name = 'Electron', 
                    building_floor = 'Third floor', 
                    gate_or_portal_or_inbox_code = '3124', )
            )
        else:
            return QuoteUpdate(
        )
        """

    def testQuoteUpdate(self):
        """Test QuoteUpdate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
