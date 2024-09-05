# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.38
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.offer import Offer

class TestOffer(unittest.TestCase):
    """Offer unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Offer:
        """Test Offer
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Offer`
        """
        model = Offer()
        if include_optional:
            return Offer(
                id = 56,
                ulid = '',
                status = 'issued',
                captcha = '',
                public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold',
                redirect_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold?checkout=true',
                url = 'https://next.tripartie.app/?c=01ARZ3NDEKTSV4RRFFQ69G5FAV',
                organization = 'https://example.com/',
                seller = 'https://example.com/',
                preset_buyer = 'https://example.com/',
                nature = 'physical_item',
                title = 'ASUS TUF X570-PLUS GAMING Motherboard',
                description = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
                unit_price = 1.337,
                min_negotiable_unit_price = 1.337,
                allow_to_negotiate_unit_price = True,
                currency_code = 'EUR',
                item_count = 1,
                condition = 'USED',
                weight_in_gram = 56,
                shipping_allowed = True,
                hand_delivery_allowed = True,
                shipping_carriers = [
                    'SwissPost'
                    ],
                ean_code = '4718017388450',
                can_be_sold_separately = True,
                metadata = [
                    tpdk_safe_checkout.models.metadata.Metadata(
                        id = 56, 
                        persona = 'https://example.com/', 
                        offer = 'https://example.com/', 
                        card = 'https://example.com/', 
                        key = 'External-ID', 
                        value = '54412', )
                    ],
                medias = [
                    'https://example.com/'
                    ],
                views = [
                    tpdk_safe_checkout.models.view.View(
                        id = 56, 
                        ip_address = '', 
                        offer = 'https://example.com/', 
                        transaction = 'https://example.com/', 
                        user = 'https://example.com/', 
                        hit_count = 1, 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        named_source = 'BUYER', )
                    ],
                transactions = [
                    'https://example.com/'
                    ],
                quotes = [
                    'https://example.com/'
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                preset_buyer_id = 42,
                seller_id = 58,
                iri = 'https://example.com/',
                half_price_point = 1.337
            )
        else:
            return Offer(
                ulid = '',
                status = 'issued',
                url = 'https://next.tripartie.app/?c=01ARZ3NDEKTSV4RRFFQ69G5FAV',
                seller = 'https://example.com/',
                nature = 'physical_item',
                currency_code = 'EUR',
                weight_in_gram = 56,
                shipping_allowed = True,
                hand_delivery_allowed = True,
                can_be_sold_separately = True,
                medias = [
                    'https://example.com/'
                    ],
                views = [
                    tpdk_safe_checkout.models.view.View(
                        id = 56, 
                        ip_address = '', 
                        offer = 'https://example.com/', 
                        transaction = 'https://example.com/', 
                        user = 'https://example.com/', 
                        hit_count = 1, 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        named_source = 'BUYER', )
                    ],
        )
        """

    def testOffer(self):
        """Test Offer"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
