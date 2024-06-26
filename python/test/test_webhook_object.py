# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.11
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
            include_option is a boolean, when False only required
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
                iri = 'https://example.com/',
                id = 56,
                first_name = 'John',
                last_name = 'Doe',
                gender = 'RATHER_NOT_SAY',
                date_of_birth = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(),
                language = 'fr',
                email = 'john.doe@gmail.com',
                mobile_phone_number = '+33745214529',
                address = tpdk_safe_checkout.models.persona_address_read.Persona-Address-Read(
                    company_name = 'Company Tld', 
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
                    tpdk_safe_checkout.models.offer_metadata_independent_write.Offer-Metadata-IndependentWrite(
                        key = 'External-ID', 
                        value = '54412', )
                    ],
                offer_count = 4,
                purchase_count = 42
            )
        else:
            return WebhookObject(
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

    def testWebhookObject(self):
        """Test WebhookObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
