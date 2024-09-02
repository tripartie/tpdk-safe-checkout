# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.33
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.transaction_collection_read import TransactionCollectionRead

class TestTransactionCollectionRead(unittest.TestCase):
    """TransactionCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TransactionCollectionRead:
        """Test TransactionCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TransactionCollectionRead`
        """
        model = TransactionCollectionRead()
        if include_optional:
            return TransactionCollectionRead(
                ulid = '',
                offer = tpdk_safe_checkout.models.transaction_offer_collection_read.Transaction-Offer-CollectionRead(
                    ulid = '', 
                    status = 'issued', 
                    public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold', 
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
                        'https://example.com/'
                        ], 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ),
                quote = tpdk_safe_checkout.models.transaction_quote_collection_read.Transaction-Quote-CollectionRead(
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
                    third_party_recipient_address = tpdk_safe_checkout.models.transaction_address_collection_read.Transaction-Address-CollectionRead(), 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    expire_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    iri = 'https://example.com/', 
                    unit_price = 1.337, 
                    price = 1.337, 
                    buyer_total = 1.337, 
                    seller_total = 1.337, ),
                buyer_message = '',
                buyer = tpdk_safe_checkout.models.transaction_persona_collection_read.Transaction-Persona-CollectionRead(
                    id = 56, 
                    first_name = 'John', 
                    last_name = 'Doe', ),
                status = 'CREATED',
                fees = 1.337,
                supplemental_fees = 1.337,
                provider_name = '',
                provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                total = 1.337,
                total_charged = 1.337,
                total_fees = 1.337,
                awaited_party = 'BUYER',
                status_expiration = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                processor_status = 'unallocated'
            )
        else:
            return TransactionCollectionRead(
                ulid = '',
                offer = tpdk_safe_checkout.models.transaction_offer_collection_read.Transaction-Offer-CollectionRead(
                    ulid = '', 
                    status = 'issued', 
                    public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold', 
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
                        'https://example.com/'
                        ], 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ),
                quote = tpdk_safe_checkout.models.transaction_quote_collection_read.Transaction-Quote-CollectionRead(
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
                    third_party_recipient_address = tpdk_safe_checkout.models.transaction_address_collection_read.Transaction-Address-CollectionRead(), 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    expire_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    iri = 'https://example.com/', 
                    unit_price = 1.337, 
                    price = 1.337, 
                    buyer_total = 1.337, 
                    seller_total = 1.337, ),
                buyer = tpdk_safe_checkout.models.transaction_persona_collection_read.Transaction-Persona-CollectionRead(
                    id = 56, 
                    first_name = 'John', 
                    last_name = 'Doe', ),
        )
        """

    def testTransactionCollectionRead(self):
        """Test TransactionCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
