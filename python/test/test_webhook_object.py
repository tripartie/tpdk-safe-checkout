# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.113
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.webhook_object import WebhookObject

class TestWebhookObject(unittest.TestCase):
    """WebhookObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> WebhookObject:
        """Test WebhookObject
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `WebhookObject`
        """
        model = WebhookObject()
        if include_optional:
            return WebhookObject(
                ulid = '',
                status = 'issued',
                public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold',
                redirect_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold?checkout=true',
                url = 'https://staging.tripartie.app/checkout/01ARZ3NDEKTSV4RRFFQ69G5FAV',
                organization = tpdk_safe_checkout.models.offer_organization_read.Offer-Organization-Read(
                    name = '', 
                    website_url = '', 
                    custom_base_url = '', 
                    icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', 
                        thumbnail_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', 
                        thumbnail_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    primary_color = '', ),
                seller = tpdk_safe_checkout.models.offer_persona_read.Offer-Persona-Read(
                    registered = True, 
                    verified = True, ),
                preset_buyer = tpdk_safe_checkout.models.offer_persona_read.Offer-Persona-Read(
                    registered = True, 
                    verified = True, ),
                nature = 'physical_item',
                title = 'ASUS TUF X570-PLUS GAMING Motherboard',
                description = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
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
                    tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', 
                        thumbnail_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', )
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                iri = 'https://example.com/',
                id = 56,
                first_name = 'John',
                last_name = 'Doe',
                gender = 'RATHER_NOT_SAY',
                date_of_birth = None,
                language = 'fr',
                email = 'john.doe@gmail.com',
                mobile_phone_number = '+33745214529',
                address = tpdk_safe_checkout.models.persona_address_read.Persona-Address-Read(
                    country_code = 'FRA', 
                    zip_code = '75004', 
                    city_name = 'Paris', 
                    first_line = '118 avenue des champs élysées', 
                    second_line = 'Apt 6E', 
                    building_name = 'Electron', 
                    building_floor = 'Third floor', 
                    gate_or_portal_or_inbox_code = '3124', 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ),
                metadata = [
                    tpdk_safe_checkout.models.card_metadata_collection_read.Card-Metadata-CollectionRead(
                        key = 'External-ID', 
                        value = '54412', )
                    ],
                offer_count = 4,
                purchase_count = 42,
                registered = True,
                verified = True
            )
        else:
            return WebhookObject(
                ulid = '',
                status = 'issued',
                url = 'https://staging.tripartie.app/checkout/01ARZ3NDEKTSV4RRFFQ69G5FAV',
                seller = tpdk_safe_checkout.models.offer_persona_read.Offer-Persona-Read(
                    registered = True, 
                    verified = True, ),
                medias = [
                    tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', 
                        thumbnail_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', )
                    ],
        )
        """

    def testWebhookObject(self):
        """Test WebhookObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
