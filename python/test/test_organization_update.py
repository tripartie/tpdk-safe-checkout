# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.45
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.organization_update import OrganizationUpdate

class TestOrganizationUpdate(unittest.TestCase):
    """OrganizationUpdate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OrganizationUpdate:
        """Test OrganizationUpdate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OrganizationUpdate`
        """
        model = OrganizationUpdate()
        if include_optional:
            return OrganizationUpdate(
                name = '',
                vat_number = '',
                commercial_registry_number = '',
                website_url = '',
                custom_base_url = '',
                billing_address = tpdk_safe_checkout.models.organization_address_update.Organization-Address-Update(
                    company_name = 'Company Tld', 
                    country_code = 'FRA', 
                    zip_code = '75004', 
                    city_name = 'Paris', 
                    first_line = '118 avenue des champs élysées', 
                    second_line = 'Apt 6E', 
                    building_name = 'Electron', 
                    building_floor = 'Third floor', 
                    gate_or_portal_or_inbox_code = '3124', ),
                primary_color = ''
            )
        else:
            return OrganizationUpdate(
                name = '',
        )
        """

    def testOrganizationUpdate(self):
        """Test OrganizationUpdate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
