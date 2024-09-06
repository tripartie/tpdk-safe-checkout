# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.50
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.user_update import UserUpdate

class TestUserUpdate(unittest.TestCase):
    """UserUpdate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UserUpdate:
        """Test UserUpdate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UserUpdate`
        """
        model = UserUpdate()
        if include_optional:
            return UserUpdate(
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
                intl_phone_number = '+33700000000',
                origin_country = 'FRA',
                home_country = 'FRA',
                preferred_language = 'fr',
                consent_mail_ads = True,
                time_zone_offset = -60
            )
        else:
            return UserUpdate(
                consent_mail_ads = True,
        )
        """

    def testUserUpdate(self):
        """Test UserUpdate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
