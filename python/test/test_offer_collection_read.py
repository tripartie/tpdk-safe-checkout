# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.45
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.offer_collection_read import OfferCollectionRead

class TestOfferCollectionRead(unittest.TestCase):
    """OfferCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OfferCollectionRead:
        """Test OfferCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OfferCollectionRead`
        """
        model = OfferCollectionRead()
        if include_optional:
            return OfferCollectionRead(
                ulid = '',
                status = 'issued',
                public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold',
                url = 'https://next.tripartie.app/?c=01ARZ3NDEKTSV4RRFFQ69G5FAV',
                seller = 'https://example.com/',
                preset_buyer = 'https://example.com/',
                nature = 'physical_item',
                title = 'ASUS TUF X570-PLUS GAMING Motherboard',
                unit_price = 1.337,
                min_negotiable_unit_price = 1.337,
                allow_to_negotiate_unit_price = True,
                currency_code = 'EUR',
                item_count = 1,
                condition = 'USED',
                shipping_allowed = True,
                hand_delivery_allowed = True,
                shipping_carriers = [
                    'SwissPost'
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                iri = 'https://example.com/'
            )
        else:
            return OfferCollectionRead(
                ulid = '',
                status = 'issued',
                url = 'https://next.tripartie.app/?c=01ARZ3NDEKTSV4RRFFQ69G5FAV',
                seller = 'https://example.com/',
                nature = 'physical_item',
                currency_code = 'EUR',
                shipping_allowed = True,
                hand_delivery_allowed = True,
        )
        """

    def testOfferCollectionRead(self):
        """Test OfferCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
