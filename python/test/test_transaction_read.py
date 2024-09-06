# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.51
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.transaction_read import TransactionRead

class TestTransactionRead(unittest.TestCase):
    """TransactionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TransactionRead:
        """Test TransactionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TransactionRead`
        """
        model = TransactionRead()
        if include_optional:
            return TransactionRead(
                ulid = '',
                offer = tpdk_safe_checkout.models.transaction_offer_read.Transaction-Offer-Read(
                    ulid = '', 
                    status = 'issued', 
                    public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold', 
                    redirect_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold?checkout=true', 
                    organization = tpdk_safe_checkout.models.transaction_organization_read.Transaction-Organization-Read(
                        name = '', 
                        website_url = '', 
                        icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                            id = 56, 
                            public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                        logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                            id = 56, 
                            public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                        primary_color = '', ), 
                    seller = tpdk_safe_checkout.models.transaction_persona_read.Transaction-Persona-Read(
                        id = 56, 
                        first_name = 'John', 
                        last_name = 'Doe', 
                        language = 'fr', 
                        email = 'john.doe@gmail.com', 
                        mobile_phone_number = '+33745214529', 
                        address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                            country_code = 'FRA', 
                            zip_code = '75004', 
                            city_name = 'Paris', 
                            first_line = '118 avenue des champs élysées', 
                            second_line = 'Apt 6E', 
                            building_name = 'Electron', 
                            building_floor = 'Third floor', 
                            gate_or_portal_or_inbox_code = '3124', ), 
                        registered = True, ), 
                    preset_buyer = tpdk_safe_checkout.models.transaction_persona_read.Transaction-Persona-Read(
                        id = 56, 
                        first_name = 'John', 
                        last_name = 'Doe', 
                        language = 'fr', 
                        email = 'john.doe@gmail.com', 
                        mobile_phone_number = '+33745214529', 
                        registered = True, ), 
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
                    metadata = [
                        tpdk_safe_checkout.models.card_metadata_collection_read.Card-Metadata-CollectionRead(
                            key = 'External-ID', 
                            value = '54412', )
                        ], 
                    medias = [
                        
                        ], 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ),
                quote = tpdk_safe_checkout.models.transaction_quote_read.Transaction-Quote-Read(
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
                    exchange_rate = 0.4455, ),
                buyer_message = '',
                buyer = tpdk_safe_checkout.models.transaction_persona_read.Transaction-Persona-Read(
                    id = 56, 
                    first_name = 'John', 
                    last_name = 'Doe', 
                    language = 'fr', 
                    email = 'john.doe@gmail.com', 
                    mobile_phone_number = '+33745214529', 
                    address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                        country_code = 'FRA', 
                        zip_code = '75004', 
                        city_name = 'Paris', 
                        first_line = '118 avenue des champs élysées', 
                        second_line = 'Apt 6E', 
                        building_name = 'Electron', 
                        building_floor = 'Third floor', 
                        gate_or_portal_or_inbox_code = '3124', ), 
                    registered = True, ),
                status = 'CREATED',
                supplemental_fees = 1.337,
                card = tpdk_safe_checkout.models.transaction_card_read.Transaction-Card-Read(
                    primary_account_number = '', 
                    brand = 'VISA', 
                    provider_name = '', 
                    provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    processor_status = 'unallocated', ),
                escrow = tpdk_safe_checkout.models.transaction_wallet_read.Transaction-Wallet-Read(
                    balance = 1.337, 
                    currency = '', 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_name = '', 
                    provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    processor_status = 'unallocated', ),
                remote_pre_authorization_id = '',
                remote_pay_in_id = '',
                balance_to_refund = 1.337,
                fees_to_refund = 1.337,
                force_refund_shipping = True,
                review = '',
                rating = 56,
                hand_over_code = '',
                parcels = [
                    tpdk_safe_checkout.models.transaction_parcel_read.Transaction-Parcel-Read(
                        carrier = 'SwissPost', 
                        identifier = '8J001271466474', 
                        price = 4.88, 
                        currency = 'EUR', 
                        status = 'CREATED', 
                        label_public_url = '', 
                        tracking_public_url = '', 
                        historical_recipient_address = '', 
                        historical_sender_address = '', 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), )
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                metadata = [
                    tpdk_safe_checkout.models.card_metadata_collection_read.Card-Metadata-CollectionRead(
                        key = 'External-ID', 
                        value = '54412', )
                    ],
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
            return TransactionRead(
                ulid = '',
                offer = tpdk_safe_checkout.models.transaction_offer_read.Transaction-Offer-Read(
                    ulid = '', 
                    status = 'issued', 
                    public_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold', 
                    redirect_url = 'https://marketplace.tld/offers/that-special-item-i-wish-to-sold?checkout=true', 
                    organization = tpdk_safe_checkout.models.transaction_organization_read.Transaction-Organization-Read(
                        name = '', 
                        website_url = '', 
                        icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                            id = 56, 
                            public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                        logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                            id = 56, 
                            public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                        primary_color = '', ), 
                    seller = tpdk_safe_checkout.models.transaction_persona_read.Transaction-Persona-Read(
                        id = 56, 
                        first_name = 'John', 
                        last_name = 'Doe', 
                        language = 'fr', 
                        email = 'john.doe@gmail.com', 
                        mobile_phone_number = '+33745214529', 
                        address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                            country_code = 'FRA', 
                            zip_code = '75004', 
                            city_name = 'Paris', 
                            first_line = '118 avenue des champs élysées', 
                            second_line = 'Apt 6E', 
                            building_name = 'Electron', 
                            building_floor = 'Third floor', 
                            gate_or_portal_or_inbox_code = '3124', ), 
                        registered = True, ), 
                    preset_buyer = tpdk_safe_checkout.models.transaction_persona_read.Transaction-Persona-Read(
                        id = 56, 
                        first_name = 'John', 
                        last_name = 'Doe', 
                        language = 'fr', 
                        email = 'john.doe@gmail.com', 
                        mobile_phone_number = '+33745214529', 
                        registered = True, ), 
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
                    metadata = [
                        tpdk_safe_checkout.models.card_metadata_collection_read.Card-Metadata-CollectionRead(
                            key = 'External-ID', 
                            value = '54412', )
                        ], 
                    medias = [
                        
                        ], 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ),
                quote = tpdk_safe_checkout.models.transaction_quote_read.Transaction-Quote-Read(
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
                    exchange_rate = 0.4455, ),
                buyer = tpdk_safe_checkout.models.transaction_persona_read.Transaction-Persona-Read(
                    id = 56, 
                    first_name = 'John', 
                    last_name = 'Doe', 
                    language = 'fr', 
                    email = 'john.doe@gmail.com', 
                    mobile_phone_number = '+33745214529', 
                    address = tpdk_safe_checkout.models.offer_address_independent_write.Offer-Address-IndependentWrite(
                        country_code = 'FRA', 
                        zip_code = '75004', 
                        city_name = 'Paris', 
                        first_line = '118 avenue des champs élysées', 
                        second_line = 'Apt 6E', 
                        building_name = 'Electron', 
                        building_floor = 'Third floor', 
                        gate_or_portal_or_inbox_code = '3124', ), 
                    registered = True, ),
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
        )
        """

    def testTransactionRead(self):
        """Test TransactionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
