# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.20
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.offer_read import OfferRead

class TestOfferRead(unittest.TestCase):
    """OfferRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OfferRead:
        """Test OfferRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OfferRead`
        """
        model = OfferRead()
        if include_optional:
            return OfferRead(
                ulid = '',
                status = 'issued',
                public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold',
                redirect_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold?checkout=true',
                organization = tpdk_safe_checkout.models.offer_organization_read.Offer-Organization-Read(
                    name = '', 
                    website_url = '', 
                    custom_base_url = '', 
                    icon = tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    logo = tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    primary_color = '', ),
                seller = 'https://example.com/',
                preset_buyer = 'https://example.com/',
                nature = 'physical_item',
                title = 'ASUS TUF X570-PLUS GAMING Motherboard',
                unit_price = 1.337,
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
                medias = [
                    tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', )
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                iri = 'https://example.com/'
            )
        else:
            return OfferRead(
                ulid = '',
                status = 'issued',
                seller = 'https://example.com/',
                nature = 'physical_item',
                currency_code = 'EUR',
                weight_in_gram = 56,
                shipping_allowed = True,
                hand_delivery_allowed = True,
                can_be_sold_separately = True,
                medias = [
                    tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', )
                    ],
        )
        """

    def testOfferRead(self):
        """Test OfferRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
