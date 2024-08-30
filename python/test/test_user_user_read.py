# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.29
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.user_user_read import UserUserRead

class TestUserUserRead(unittest.TestCase):
    """UserUserRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserUserRead:
        """Test UserUserRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserUserRead`
        """
        model = UserUserRead()
        if include_optional:
            return UserUserRead(
                id = 56,
                main_address = tpdk_safe_checkout.models.transaction_address_read.Transaction-Address-Read(),
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
                avatar = tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                    id = 56, 
                    public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ),
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                consent_mail_ads = True,
                lockdown = True,
                organization = tpdk_safe_checkout.models.organization_user_read.Organization-UserRead(
                    id = 56, 
                    name = '', 
                    domain_verified = True, 
                    icon = tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                        id = 56, 
                        public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                    logo = tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
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
                    tpdk_safe_checkout.models.persona_user_read.Persona-UserRead(
                        organization = tpdk_safe_checkout.models.organization_user_read.Organization-UserRead(
                            id = 56, 
                            name = '', 
                            domain_verified = True, 
                            icon = tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                                id = 56, 
                                public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), 
                            logo = tpdk_safe_checkout.models.offer_media_read.Offer-Media-Read(
                                id = 56, 
                                public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ), ), )
                    ],
                cards = [
                    tpdk_safe_checkout.models.user_card_authenticated_read.User-Card-AuthenticatedRead(
                        primary_account_number = '', 
                        expire_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        currency = '', 
                        country_code = '', 
                        brand = '', 
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
            return UserUserRead(
                email = 'john.doe@company.tld',
        )
        """

    def testUserUserRead(self):
        """Test UserUserRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
