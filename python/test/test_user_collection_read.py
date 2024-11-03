# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.98
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.user_collection_read import UserCollectionRead

class TestUserCollectionRead(unittest.TestCase):
    """UserCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserCollectionRead:
        """Test UserCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserCollectionRead`
        """
        model = UserCollectionRead()
        if include_optional:
            return UserCollectionRead(
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
                email = 'john.doe@company.tld',
                roles = [ROLE_ORGANIZATION_OWNER],
                totp_enabled = True,
                intl_phone_number = '+33700000000',
                last_successful_log_in = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                avatar = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                    id = 56, 
                    public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', 
                    thumbnail_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ),
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                time_zone_offset = -60,
                organization = tpdk_safe_checkout.models.user_organization_collection_read.User-Organization-CollectionRead(
                    id = 56, 
                    name = '', ),
                wallet = tpdk_safe_checkout.models.user_wallet_collection_read.User-Wallet-CollectionRead(
                    balance = 1.337, 
                    currency = '', 
                    created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    external_id = '', 
                    provider_name = '', 
                    provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    processor_status = 'unallocated', ),
                external_id = '',
                provider_name = '',
                provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                iri = 'https://example.com/',
                second_auth_factor = True,
                processor_status = 'unallocated'
            )
        else:
            return UserCollectionRead(
                roles = [ROLE_ORGANIZATION_OWNER],
        )
        """

    def testUserCollectionRead(self):
        """Test UserCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
