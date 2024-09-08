# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.57
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.transaction_offer_collection_read import TransactionOfferCollectionRead

class TestTransactionOfferCollectionRead(unittest.TestCase):
    """TransactionOfferCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TransactionOfferCollectionRead:
        """Test TransactionOfferCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TransactionOfferCollectionRead`
        """
        model = TransactionOfferCollectionRead()
        if include_optional:
            return TransactionOfferCollectionRead(
                ulid = '',
                status = 'issued',
                public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold',
                organization = tpdk_safe_checkout.models.transaction_organization_collection_read.Transaction-Organization-CollectionRead(
                    name = '', 
                    website_url = '', 
                    icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    primary_color = '', ),
                seller = tpdk_safe_checkout.models.transaction_persona_collection_read.Transaction-Persona-CollectionRead(
                    id = 56, 
                    first_name = 'John', 
                    last_name = 'Doe', ),
                preset_buyer = tpdk_safe_checkout.models.transaction_persona_collection_read.Transaction-Persona-CollectionRead(
                    id = 56, 
                    first_name = 'John', 
                    last_name = 'Doe', ),
                nature = 'physical_item',
                title = 'ASUS TUF X570-PLUS GAMING Motherboard',
                unit_price = 1.337,
                min_negotiable_unit_price = 1.337,
                allow_to_negotiate_unit_price = True,
                currency_code = 'EUR',
                item_count = 1,
                condition = 'USED',
                medias = [
                    tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', )
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f')
            )
        else:
            return TransactionOfferCollectionRead(
                ulid = '',
                status = 'issued',
                seller = tpdk_safe_checkout.models.transaction_persona_collection_read.Transaction-Persona-CollectionRead(
                    id = 56, 
                    first_name = 'John', 
                    last_name = 'Doe', ),
                nature = 'physical_item',
                currency_code = 'EUR',
                medias = [
                    tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', )
                    ],
        )
        """

    def testTransactionOfferCollectionRead(self):
        """Test TransactionOfferCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
