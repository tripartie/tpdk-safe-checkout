# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.20
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.persona_read import PersonaRead

class TestPersonaRead(unittest.TestCase):
    """PersonaRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PersonaRead:
        """Test PersonaRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PersonaRead`
        """
        model = PersonaRead()
        if include_optional:
            return PersonaRead(
                id = 56,
                first_name = 'John',
                last_name = 'Doe',
                gender = 'RATHER_NOT_SAY',
                date_of_birth = None,
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
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                offer_count = 4,
                purchase_count = 42
            )
        else:
            return PersonaRead(
        )
        """

    def testPersonaRead(self):
        """Test PersonaRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
