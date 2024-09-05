# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.48
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.persona import Persona

class TestPersona(unittest.TestCase):
    """Persona unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Persona:
        """Test Persona
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Persona`
        """
        model = Persona()
        if include_optional:
            return Persona(
                id = 56,
                organization = 'https://example.com/',
                first_name = 'John',
                last_name = 'Doe',
                gender = 'RATHER_NOT_SAY',
                date_of_birth = None,
                language = 'fr',
                email = 'john.doe@gmail.com',
                mobile_phone_number = '+33745214529',
                address = tpdk_safe_checkout.models.address.Address(
                    id = 56, 
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
                    updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    formatted_address = '118 rue Henry Barbin, 72100 LE MANS, FRANCE', ),
                metadata = [
                    tpdk_safe_checkout.models.metadata.Metadata(
                        id = 56, 
                        persona = 'https://example.com/', 
                        offer = 'https://example.com/', 
                        card = 'https://example.com/', 
                        key = 'External-ID', 
                        value = '54412', )
                    ],
                offers = [
                    'https://example.com/'
                    ],
                purchases = [
                    'https://example.com/'
                    ],
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                owned_by = 'https://example.com/',
                offer_count = 4,
                purchase_count = 42,
                registered = True
            )
        else:
            return Persona(
                offers = [
                    'https://example.com/'
                    ],
                purchases = [
                    'https://example.com/'
                    ],
        )
        """

    def testPersona(self):
        """Test Persona"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
