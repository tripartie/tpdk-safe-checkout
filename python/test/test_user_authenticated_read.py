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

from tpdk_safe_checkout.models.user_authenticated_read import UserAuthenticatedRead

class TestUserAuthenticatedRead(unittest.TestCase):
    """UserAuthenticatedRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserAuthenticatedRead:
        """Test UserAuthenticatedRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserAuthenticatedRead`
        """
        model = UserAuthenticatedRead()
        if include_optional:
            return UserAuthenticatedRead(
                id = 56,
                main_address = tpdk_safe_checkout.models.user_address_authenticated_read.User-Address-AuthenticatedRead(
                    company_name = 'Company Tld', 
                    country_code = 'FRA', 
                    zip_code = '75004', 
                    city_name = 'Paris', 
                    first_line = '118 avenue des champs élysées', 
                    second_line = 'Apt 6E', 
                    building_name = 'Electron', 
                    building_floor = 'Third floor', 
                    gate_or_portal_or_inbox_code = '3124', 
                    formatted_address = '118 rue Henry Barbin, 72100 LE MANS, FRANCE', ),
                first_name = 'Jacob',
                last_name = 'TAHRI',
                public_name = 'Nickname',
                role_in_company = 'Accounting Dpt',
                birthday = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                email = 'john.doe@company.tld',
                roles = [ROLE_ORGANIZATION_OWNER],
                totp_enabled = True,
                intl_phone_number = '+33700000000',
                origin_country = 'FRA',
                home_country = 'FRA',
                preferred_language = 'fr',
                last_successful_log_in = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                avatar = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                    id = 56, 
                    public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ),
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                consent_mail_ads = True,
                lockdown = True,
                time_zone_offset = -60,
                organization = tpdk_safe_checkout.models.user_organization_authenticated_read.User-Organization-AuthenticatedRead(
                    id = 56, 
                    name = '', 
                    domain_verified = True, 
                    icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), ),
                bank_account = tpdk_safe_checkout.models.user_bank_account_authenticated_read.User-BankAccount-AuthenticatedRead(
                    iban = '', 
                    bic = '', 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_name = '', 
                    provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    processor_status = 'unallocated', ),
                identity_verified_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                profiles = [
                    tpdk_safe_checkout.models.user_persona_authenticated_read.User-Persona-AuthenticatedRead(
                        id = 56, 
                        organization = tpdk_safe_checkout.models.user_organization_authenticated_read.User-Organization-AuthenticatedRead(
                            id = 56, 
                            name = '', 
                            domain_verified = True, 
                            icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                                id = 56, 
                                public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                            logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                                id = 56, 
                                public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), ), )
                    ],
                cards = [
                    tpdk_safe_checkout.models.user_card_authenticated_read.User-Card-AuthenticatedRead(
                        id = 56, 
                        primary_account_number = '', 
                        expire_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        currency = '', 
                        country_code = '', 
                        brand = 'VISA', 
                        ephemeral = True, 
                        created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        provider_name = '', 
                        provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        iri = 'https://example.com/', 
                        processor_status = 'unallocated', )
                    ],
                wallet = tpdk_safe_checkout.models.user_wallet_authenticated_read.User-Wallet-AuthenticatedRead(
                    balance = 1.337, 
                    currency = '', 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_name = '', 
                    provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    processor_status = 'unallocated', ),
                provider_name = '',
                provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                iri = 'https://example.com/',
                impersonating_organization = True,
                second_auth_factor = True,
                processor_status = 'unallocated'
            )
        else:
            return UserAuthenticatedRead(
                roles = [ROLE_ORGANIZATION_OWNER],
                consent_mail_ads = True,
                lockdown = True,
                profiles = [
                    tpdk_safe_checkout.models.user_persona_authenticated_read.User-Persona-AuthenticatedRead(
                        id = 56, 
                        organization = tpdk_safe_checkout.models.user_organization_authenticated_read.User-Organization-AuthenticatedRead(
                            id = 56, 
                            name = '', 
                            domain_verified = True, 
                            icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                                id = 56, 
                                public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                            logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                                id = 56, 
                                public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), ), )
                    ],
        )
        """

    def testUserAuthenticatedRead(self):
        """Test UserAuthenticatedRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
